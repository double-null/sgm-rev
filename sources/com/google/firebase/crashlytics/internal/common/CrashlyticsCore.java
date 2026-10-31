package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.ndk.BuildConfig;
import g7.EinF.ZHgPsTG;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsCore {
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.google.firebase.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 3;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final String LEGACY_CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final int MAX_STACK_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private static final String ON_DEMAND_DROPPED_KEY = "com.crashlytics.on-demand.dropped-exceptions";
    private static final String ON_DEMAND_RECORDED_KEY = "com.crashlytics.on-demand.recorded-exceptions";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;
    public final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private CrashlyticsController controller;
    private CrashlyticsFileMarker crashMarker;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final FileStore fileStore;
    private final IdManager idManager;
    private CrashlyticsFileMarker initializationMarker;
    private final CrashlyticsNativeComponent nativeComponent;
    private final RemoteConfigDeferredProxy remoteConfigDeferredProxy;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final long startTime = System.currentTimeMillis();
    private final OnDemandCounter onDemandCounter = new OnDemandCounter();

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy, CrashlyticsWorkers crashlyticsWorkers) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.fileStore = fileStore;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.remoteConfigDeferredProxy = remoteConfigDeferredProxy;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    private void checkForPreviousCrash() {
        try {
            this.didCrashOnPreviousExecution = Boolean.TRUE.equals((Boolean) this.crashlyticsWorkers.f12212a.c().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.f0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f12128a.lambda$checkForPreviousCrash$10();
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.didCrashOnPreviousExecution = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: doBackgroundInitialization, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$finishInitSynchronously$9(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.c();
        markInitializationStarted();
        try {
            try {
                this.breadcrumbSource.a(new b3.a() { // from class: com.google.firebase.crashlytics.internal.common.w
                    @Override // b3.a
                    public final void a(String str) {
                        this.f12197a.log(str);
                    }
                });
                this.controller.f0();
                if (!settingsProvider.b().f20573b.f20580a) {
                    z2.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.controller.F(settingsProvider)) {
                    z2.f.f().k("Previous sessions could not be finalized.");
                }
                this.controller.l0(settingsProvider.a());
                markInitializationComplete();
            } catch (Exception e10) {
                z2.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            }
        } catch (Throwable th) {
            markInitializationComplete();
            throw th;
        }
    }

    private void finishInitSynchronously(final SettingsProvider settingsProvider) {
        Future<?> futureSubmit = this.crashlyticsWorkers.f12212a.c().submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f12208a.lambda$finishInitSynchronously$9(settingsProvider);
            }
        });
        z2.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            z2.f.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            z2.f.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            z2.f.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    static boolean isBuildIdValid(String str, boolean z10) {
        if (!z10) {
            z2.f.f().i("Configured not to require a build ID.");
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        }
        if (!TextUtils.isEmpty(str)) {
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", MISSING_BUILD_ID_MSG);
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$checkForPreviousCrash$10() throws Exception {
        return Boolean.valueOf(this.controller.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$log$2(long j10, String str) {
        this.controller.q0(j10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$log$3(final long j10, final String str) throws Exception {
        return this.crashlyticsWorkers.f12213b.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f12201a.lambda$log$2(j10, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logException$1(Throwable th, Map map) {
        this.controller.o0(Thread.currentThread(), th, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logFatalException$8(Throwable th) {
        this.controller.j0(ON_DEMAND_RECORDED_KEY, Integer.toString(this.onDemandCounter.b()));
        this.controller.j0(ON_DEMAND_DROPPED_KEY, Integer.toString(this.onDemandCounter.a()));
        this.controller.Z(Thread.currentThread(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomKey$5(String str, String str2) {
        this.controller.h0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCustomKeys$6(Map map) {
        this.controller.i0(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setInternalKey$7(String str, String str2) {
        this.controller.j0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUserId$4(String str) {
        this.controller.k0(str);
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.controller.r();
    }

    public Task<Void> deleteUnsentReports() {
        return this.controller.w();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.didCrashOnPreviousExecution;
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.c();
    }

    public Task<Void> doBackgroundInitializationAsync(final SettingsProvider settingsProvider) {
        return this.crashlyticsWorkers.f12212a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f12191a.lambda$doBackgroundInitializationAsync$0(settingsProvider);
            }
        });
    }

    CrashlyticsController getController() {
        return this.controller;
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    public void log(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        this.crashlyticsWorkers.f12212a.g(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12101a.lambda$log$3(jCurrentTimeMillis, str);
            }
        });
    }

    public void logException(final Throwable th, final Map<String, String> map) {
        this.crashlyticsWorkers.f12212a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f12187a.lambda$logException$1(th, map);
            }
        });
    }

    public void logFatalException(final Throwable th) {
        z2.f.f().b("Recorded on-demand fatal events: " + this.onDemandCounter.b());
        z2.f.f().b("Dropped on-demand fatal events: " + this.onDemandCounter.a());
        this.crashlyticsWorkers.f12212a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12122a.lambda$logFatalException$8(th);
            }
        });
    }

    void markInitializationComplete() {
        CrashlyticsWorkers.c();
        try {
            if (this.initializationMarker.d()) {
                return;
            }
            z2.f.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e10) {
            z2.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    public Task<Void> sendUnsentReports() {
        return this.controller.g0();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(final String str, final String str2) {
        this.crashlyticsWorkers.f12212a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12095a.lambda$setCustomKey$5(str, str2);
            }
        });
    }

    public void setCustomKeys(final Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        this.crashlyticsWorkers.f12212a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f12206a.lambda$setCustomKeys$6(map);
            }
        });
    }

    public void setInternalKey(final String str, final String str2) {
        this.crashlyticsWorkers.f12212a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12111a.lambda$setInternalKey$7(str, str2);
            }
        });
    }

    public void setUserId(final String str) {
        this.crashlyticsWorkers.f12212a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12116a.lambda$setUserId$4(str);
            }
        });
    }

    public boolean onPreExecute(AppData appData, SettingsProvider settingsProvider) {
        Context context = this.context;
        if (!isBuildIdValid(appData.f12035b, h.i(context, ZHgPsTG.LpeJerSlLzyPJo, h.i(context, LEGACY_CRASHLYTICS_REQUIRE_BUILD_ID, CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT)))) {
            throw new IllegalStateException(MISSING_BUILD_ID_MSG);
        }
        String strC = new g().c();
        try {
            this.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, this.fileStore);
            this.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, this.fileStore);
            d3.o oVar = new d3.o(strC, this.fileStore, this.crashlyticsWorkers);
            d3.f fVar = new d3.f(this.fileStore);
            k3.a aVar = new k3.a(1024, new k3.c(10));
            this.remoteConfigDeferredProxy.c(oVar);
            this.controller = new CrashlyticsController(this.context, this.idManager, this.dataCollectionArbiter, this.fileStore, this.crashMarker, appData, oVar, fVar, b1.n(this.context, this.idManager, this.fileStore, appData, fVar, oVar, aVar, settingsProvider, this.onDemandCounter, this.sessionsSubscriber, this.crashlyticsWorkers), this.nativeComponent, this.analyticsEventLogger, this.sessionsSubscriber, this.crashlyticsWorkers);
            boolean zDidPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            this.controller.C(strC, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider);
            if (Build.VERSION.SDK_INT >= 37) {
                this.controller.D(strC);
            }
            if (!zDidPreviousInitializationFail || !h.d(this.context)) {
                z2.f.f().b("Successfully configured exception handler.");
                return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
            }
            z2.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            finishInitSynchronously(settingsProvider);
            return false;
        } catch (Exception e10) {
            z2.f.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.controller = null;
            return false;
        }
    }

    void markInitializationStarted() {
        CrashlyticsWorkers.c();
        this.initializationMarker.a();
        z2.f.f().i(WKirgUEJJ.yuGLxGOALOfhuDW);
    }
}
