package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.Utils;
import id.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import rd.f0;
import wc.g0;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: VungleInitializer.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleInitializer {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VungleInitializer";
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private final CopyOnWriteArrayList<InitializationListener> initializationCallbackArray = new CopyOnWriteArrayList<>();
    private final TimeIntervalMetric initDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    /* JADX INFO: compiled from: VungleInitializer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.VungleInitializer$configure$1, reason: invalid class name */
    /* JADX INFO: compiled from: VungleInitializer.kt */
    static final class AnonymousClass1 extends u implements l<Boolean, g0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return g0.f27756a;
        }

        public final void invoke(boolean z10) {
            Logger.Companion.d(VungleInitializer.TAG, "Config fetch result: " + z10);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.VungleInitializer$onInitError$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleInitializer.kt */
    static final class C24211 extends u implements id.a<g0> {
        final /* synthetic */ VungleError $exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24211(VungleError vungleError) {
            super(0);
            this.$exception = vungleError;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Logger.Companion.e(VungleInitializer.TAG, "onError");
            CopyOnWriteArrayList copyOnWriteArrayList = VungleInitializer.this.initializationCallbackArray;
            VungleError vungleError = this.$exception;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InitializationListener) it.next()).onError(vungleError);
            }
            VungleInitializer.this.initializationCallbackArray.clear();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.VungleInitializer$onInitSuccess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: VungleInitializer.kt */
    static final class C24221 extends u implements id.a<g0> {
        C24221() {
            super(0);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Iterator it = VungleInitializer.this.initializationCallbackArray.iterator();
            while (it.hasNext()) {
                ((InitializationListener) it.next()).onSuccess();
            }
            VungleInitializer.this.initializationCallbackArray.clear();
        }
    }

    private final void configure(Context context, String str) {
        boolean z10;
        try {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            o oVar = o.SYNCHRONIZED;
            wc.k kVarB = m.b(oVar, new VungleInitializer$configure$$inlined$inject$1(context));
            ConfigManager configManager = ConfigManager.INSTANCE;
            ConfigPayload cachedConfig = configManager.getCachedConfig(m242configure$lambda4(kVarB), str);
            if (cachedConfig != null) {
                ConfigManager.initWithConfig$vungle_ads_release$default(configManager, context, cachedConfig, true, null, 8, null);
                z10 = true;
            } else {
                z10 = false;
            }
            this.isInitialized.set(true);
            onInitSuccess();
            Logger.Companion.d(TAG, "Running cleanup jobs. " + Thread.currentThread().getId());
            m243configure$lambda5(m.b(oVar, new VungleInitializer$configure$$inlined$inject$2(context))).execute(CleanupJob.Companion.makeJobInfo$default(CleanupJob.Companion, null, 1, null));
            if (z10) {
                return;
            }
            configManager.fetchConfigAsync$vungle_ads_release(context, AnonymousClass1.INSTANCE);
        } catch (Throwable th) {
            Logger.Companion.e(TAG, "Cannot get config", th);
        }
    }

    /* JADX INFO: renamed from: configure$lambda-4, reason: not valid java name */
    private static final FilePreferences m242configure$lambda4(wc.k<FilePreferences> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: configure$lambda-5, reason: not valid java name */
    private static final JobRunner m243configure$lambda5(wc.k<? extends JobRunner> kVar) {
        return kVar.getValue();
    }

    private final boolean hasInvalidChar(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((Character.isLetterOrDigit(cCharAt) || cCharAt == '.') ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasRequiredNetworkPermissions(Context context) {
        return (androidx.core.content.a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) && (androidx.core.content.a.a(context, "android.permission.INTERNET") == 0);
    }

    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    private static final Executors m244init$lambda0(wc.k<? extends Executors> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    private static final VungleApiClient m245init$lambda1(wc.k<VungleApiClient> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m246init$lambda2(VungleInitializer this$0, Context context, String appId, wc.k vungleApiClient$delegate) {
        t.f(this$0, "this$0");
        t.f(context, "$context");
        t.f(appId, "$appId");
        t.f(vungleApiClient$delegate, "$vungleApiClient$delegate");
        if (!this$0.hasRequiredNetworkPermissions(context)) {
            Logger.Companion.e(TAG, "Network permissions not granted");
            ThreadUtil.INSTANCE.runOnUiThread(new VungleInitializer$init$1$1(this$0));
        } else {
            PrivacyManager.INSTANCE.init(context);
            m245init$lambda1(vungleApiClient$delegate).initialize(appId);
            this$0.configure(context, appId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m247init$lambda3(VungleInitializer this$0) {
        t.f(this$0, "this$0");
        this$0.onInitError(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return f0.k0(str) || hasInvalidChar(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitError(VungleError vungleError) {
        this.isInitializing.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + vungleError.getCode();
        }
        this.initDurationMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.initDurationMetric, (LogEntry) null, localizedMessage);
        ThreadUtil.INSTANCE.runOnUiThread(new C24211(vungleError));
        Logger.Companion.e(TAG, localizedMessage);
    }

    private final void onInitSuccess() {
        this.isInitializing.set(false);
        this.initDurationMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.initDurationMetric, (LogEntry) null, (String) null, 6, (Object) null);
        Logger.Companion.d(TAG, "onSuccess " + Thread.currentThread().getId());
        ThreadUtil.INSTANCE.runOnUiThread(new C24221());
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.Companion.deInit();
        VungleApiClient.Companion.reset$vungle_ads_release();
        this.isInitialized.set(false);
        this.isInitializing.set(false);
        this.initializationCallbackArray.clear();
    }

    public final void init(final String appId, final Context context, InitializationListener initializationCallback) {
        t.f(appId, "appId");
        t.f(context, "context");
        t.f(initializationCallback, "initializationCallback");
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (LogEntry) null, (String) null, 6, (Object) null);
        this.initDurationMetric.markStart();
        this.initializationCallbackArray.add(initializationCallback);
        if (isAppIdInvalid(appId)) {
            onInitError(new InvalidAppId("App id invalid: " + appId + ", package name: " + context.getPackageName()).logError$vungle_ads_release());
            return;
        }
        if (Utils.INSTANCE.isOSVersionInvalid()) {
            Logger.Companion.e(TAG, "Init: SDK is supported only for API versions 25 and above.");
            onInitError(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.setAppId$vungle_ads_release(appId);
        if (this.isInitialized.get()) {
            Logger.Companion.d(TAG, "init already complete");
            onInitSuccess();
        } else {
            if (this.isInitializing.getAndSet(true)) {
                Logger.Companion.d(TAG, "init already in progress");
                return;
            }
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            o oVar = o.SYNCHRONIZED;
            wc.k kVarB = m.b(oVar, new VungleInitializer$init$$inlined$inject$1(context));
            final wc.k kVarB2 = m.b(oVar, new VungleInitializer$init$$inlined$inject$2(context));
            m244init$lambda0(kVarB).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    VungleInitializer.m246init$lambda2(this.f13040a, context, appId, kVarB2);
                }
            }, new Runnable() { // from class: com.vungle.ads.internal.d
                @Override // java.lang.Runnable
                public final void run() {
                    VungleInitializer.m247init$lambda3(this.f13044a);
                }
            });
        }
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    public final AtomicBoolean isInitializing$vungle_ads_release() {
        return this.isInitializing;
    }

    public final void setInitialized$vungle_ads_release(AtomicBoolean atomicBoolean) {
        t.f(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        t.f(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }

    public final void setIntegrationName(String integrationName, String version) {
        String str;
        t.f(integrationName, "integrationName");
        t.f(version, "version");
        if (f0.k0(integrationName)) {
            Logger.Companion.e(TAG, "integrationName is empty");
            return;
        }
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String headerUa = vungleHeader.getHeaderUa();
        if (!f0.k0(version)) {
            str = '/' + version;
        } else {
            str = "";
        }
        String str2 = integrationName + str;
        if (f0.U(headerUa, str2, false, 2, null)) {
            Logger.Companion.w(TAG, "Wrapper info already set");
            return;
        }
        vungleHeader.setHeaderUa(headerUa + ';' + str2);
        if (isInitialized()) {
            Logger.Companion.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }
}
