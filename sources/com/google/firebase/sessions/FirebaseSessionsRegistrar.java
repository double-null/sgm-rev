package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import b2.i;
import b4.l;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import e0.a0;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ud.k0;
import x2.m;
import x2.o;
import zc.j;

/* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final o<Context> appContext;
    private static final o<k0> backgroundDispatcher;
    private static final o<k0> blockingDispatcher;
    private static final o<FirebaseApp> firebaseApp;
    private static final o<FirebaseInstallationsApi> firebaseInstallationsApi;
    private static final o<b> firebaseSessionsComponent;
    private static final o<i> transportFactory;

    /* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    static {
        o<Context> oVarB = o.b(Context.class);
        t.e(oVarB, "unqualified(...)");
        appContext = oVarB;
        o<FirebaseApp> oVarB2 = o.b(FirebaseApp.class);
        t.e(oVarB2, "unqualified(...)");
        firebaseApp = oVarB2;
        o<FirebaseInstallationsApi> oVarB3 = o.b(FirebaseInstallationsApi.class);
        t.e(oVarB3, "unqualified(...)");
        firebaseInstallationsApi = oVarB3;
        o<k0> oVarA = o.a(w2.a.class, k0.class);
        t.e(oVarA, "qualified(...)");
        backgroundDispatcher = oVarA;
        o<k0> oVarA2 = o.a(w2.b.class, k0.class);
        t.e(oVarA2, "qualified(...)");
        blockingDispatcher = oVarA2;
        o<i> oVarB4 = o.b(i.class);
        t.e(oVarB4, "unqualified(...)");
        transportFactory = oVarB4;
        o<b> oVarB5 = o.b(b.class);
        t.e(oVarB5, "unqualified(...)");
        firebaseSessionsComponent = oVarB5;
        try {
            a0.f13550a.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l getComponents$lambda$0(x2.d dVar) {
        return ((b) dVar.f(firebaseSessionsComponent)).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$1(x2.d dVar) {
        b.a aVarA = com.google.firebase.sessions.a.a();
        Object objF = dVar.f(appContext);
        t.e(objF, "get(...)");
        b.a aVarE = aVarA.e((Context) objF);
        Object objF2 = dVar.f(backgroundDispatcher);
        t.e(objF2, "get(...)");
        b.a aVarD = aVarE.d((j) objF2);
        Object objF3 = dVar.f(blockingDispatcher);
        t.e(objF3, "get(...)");
        b.a aVarF = aVarD.f((j) objF3);
        Object objF4 = dVar.f(firebaseApp);
        t.e(objF4, "get(...)");
        b.a aVarC = aVarF.c((FirebaseApp) objF4);
        Object objF5 = dVar.f(firebaseInstallationsApi);
        t.e(objF5, "get(...)");
        b.a aVarA2 = aVarC.a((FirebaseInstallationsApi) objF5);
        Provider<i> providerE = dVar.e(transportFactory);
        t.e(providerE, "getProvider(...)");
        return aVarA2.b(providerE).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x2.c<? extends Object>> getComponents() {
        return kotlin.collections.t.n(x2.c.c(l.class).g(LIBRARY_NAME).b(m.j(firebaseSessionsComponent)).e(new x2.g() { // from class: b4.r
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(dVar);
            }
        }).d().c(), x2.c.c(b.class).g("fire-sessions-component").b(m.j(appContext)).b(m.j(backgroundDispatcher)).b(m.j(blockingDispatcher)).b(m.j(firebaseApp)).b(m.j(firebaseInstallationsApi)).b(m.l(transportFactory)).e(new x2.g() { // from class: b4.s
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        }).c(), com.google.firebase.platforminfo.g.b(LIBRARY_NAME, "3.0.8"));
    }
}
