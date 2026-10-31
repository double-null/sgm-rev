package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.h;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";
    final CrashlyticsCore core;

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Deferred<CrashlyticsNativeComponent> deferred, Deferred<v2.a> deferred2, Deferred<z3.a> deferred3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context applicationContext = firebaseApp.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        z2.f.f().g("Initializing Firebase Crashlytics " + CrashlyticsCore.getVersion() + " for " + packageName);
        CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers(executorService, executorService2);
        FileStore fileStore = new FileStore(applicationContext);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        z2.c cVar = new z2.c(deferred);
        d dVar = new d(deferred2);
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        c4.c.g(crashlyticsAppQualitySessionsSubscriber);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, cVar, dataCollectionArbiter, dVar.e(), dVar.d(), fileStore, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3), crashlyticsWorkers);
        String applicationId = firebaseApp.getOptions().getApplicationId();
        String strM = h.m(applicationContext);
        List<com.google.firebase.crashlytics.internal.common.e> listJ = h.j(applicationContext);
        z2.f.f().b("Mapping file ID is: " + strM);
        for (com.google.firebase.crashlytics.internal.common.e eVar : listJ) {
            z2.f.f().b(String.format("Build id for %s on %s: %s", eVar.c(), eVar.a(), eVar.b()));
        }
        try {
            AppData appDataA = AppData.a(applicationContext, idManager, applicationId, strM, listJ, new z2.e(applicationContext));
            z2.f.f().i("Installer package name is: " + appDataA.f12037d);
            j3.g gVarL = j3.g.l(applicationContext, applicationId, idManager, new g3.b(), appDataA.f12039f, appDataA.f12040g, fileStore, dataCollectionArbiter);
            gVarL.o(crashlyticsWorkers).addOnFailureListener(executorService3, new OnFailureListener() { // from class: com.google.firebase.crashlytics.g
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    FirebaseCrashlytics.lambda$init$0(exc);
                }
            });
            if (crashlyticsCore.onPreExecute(appDataA, gVarL)) {
                crashlyticsCore.doBackgroundInitializationAsync(gVarL);
            }
            return new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e10) {
            z2.f.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(Exception exc) {
        z2.f.f().e("Error fetching settings.", exc);
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.core.isCrashlyticsCollectionEnabled();
    }

    public void log(String str) {
        this.core.log(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            z2.f.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th, Collections.emptyMap());
        }
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.core.setCrashlyticsCollectionEnabled(Boolean.valueOf(z10));
    }

    public void setCustomKey(String str, boolean z10) {
        this.core.setCustomKey(str, Boolean.toString(z10));
    }

    public void setCustomKeys(CustomKeysAndValues customKeysAndValues) {
        this.core.setCustomKeys(customKeysAndValues.f12022a);
    }

    public void setUserId(String str) {
        this.core.setUserId(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCustomKey(String str, double d10) {
        this.core.setCustomKey(str, Double.toString(d10));
    }

    public void recordException(Throwable th, CustomKeysAndValues customKeysAndValues) {
        if (th == null) {
            z2.f.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th, customKeysAndValues.f12022a);
        }
    }

    public void setCustomKey(String str, float f10) {
        this.core.setCustomKey(str, Float.toString(f10));
    }

    public void setCustomKey(String str, int i10) {
        this.core.setCustomKey(str, Integer.toString(i10));
    }

    public void setCustomKey(String str, long j10) {
        this.core.setCustomKey(str, Long.toString(j10));
    }

    public void setCustomKey(String str, String str2) {
        this.core.setCustomKey(str, str2);
    }
}
