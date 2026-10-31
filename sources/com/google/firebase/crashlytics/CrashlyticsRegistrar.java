package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.ndk.BuildConfig;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import x2.m;
import x2.o;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<ExecutorService> f12019a = o.a(w2.a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<ExecutorService> f12020b = o.a(w2.b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o<ExecutorService> f12021c = o.a(w2.c.class, ExecutorService.class);

    static {
        c4.c.b(c4.d.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics b(x2.d dVar) {
        CrashlyticsWorkers.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics firebaseCrashlyticsInit = FirebaseCrashlytics.init((FirebaseApp) dVar.a(FirebaseApp.class), (FirebaseInstallationsApi) dVar.a(FirebaseInstallationsApi.class), dVar.h(CrashlyticsNativeComponent.class), dVar.h(v2.a.class), dVar.h(z3.a.class), (ExecutorService) dVar.f(this.f12019a), (ExecutorService) dVar.f(this.f12020b), (ExecutorService) dVar.f(this.f12021c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            z2.f.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return firebaseCrashlyticsInit;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x2.c<?>> getComponents() {
        return Arrays.asList(x2.c.c(FirebaseCrashlytics.class).g("fire-cls").b(m.i(FirebaseApp.class)).b(m.i(FirebaseInstallationsApi.class)).b(m.j(this.f12019a)).b(m.j(this.f12020b)).b(m.j(this.f12021c)).b(m.a(CrashlyticsNativeComponent.class)).b(m.a(v2.a.class)).b(m.a(z3.a.class)).e(new x2.g() { // from class: com.google.firebase.crashlytics.f
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return this.f12032a.b(dVar);
            }
        }).d().c(), com.google.firebase.platforminfo.g.b("fire-cls", BuildConfig.VERSION_NAME));
    }
}
