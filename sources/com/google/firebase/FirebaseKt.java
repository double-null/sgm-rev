package com.google.firebase;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.t;
import ud.k0;
import ud.t1;
import x2.m;
import x2.o;

/* JADX INFO: compiled from: Firebase.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseKt {
    public static final FirebaseApp app(Firebase firebase, String name) {
        t.f(firebase, "<this>");
        t.f(name, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(name);
        t.e(firebaseApp, "getInstance(...)");
        return firebaseApp;
    }

    private static final /* synthetic */ <T extends Annotation> x2.c<k0> coroutineDispatcher() {
        t.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        x2.c.b bVarE = x2.c.e(o.a(Annotation.class, k0.class));
        t.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        x2.c.b bVarB = bVarE.b(m.j(o.a(Annotation.class, Executor.class)));
        t.j();
        x2.c<k0> cVarC = bVarB.e(new x2.g() { // from class: com.google.firebase.FirebaseKt.coroutineDispatcher.1
            @Override // x2.g
            public final k0 create(x2.d dVar) {
                t.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                Object objF = dVar.f(o.a(Annotation.class, Executor.class));
                t.e(objF, "get(...)");
                return t1.a((Executor) objF);
            }
        }).c();
        t.e(cVarC, "build(...)");
        return cVarC;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        t.f(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        t.e(firebaseApp, "getInstance(...)");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        t.f(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        t.e(options, "getOptions(...)");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        t.f(firebase, "<this>");
        t.f(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options) {
        t.f(firebase, "<this>");
        t.f(context, "context");
        t.f(options, "options");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options);
        t.e(firebaseAppInitializeApp, "initializeApp(...)");
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options, String name) {
        t.f(firebase, "<this>");
        t.f(context, "context");
        t.f(options, "options");
        t.f(name, "name");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options, name);
        t.e(firebaseAppInitializeApp, "initializeApp(...)");
        return firebaseAppInitializeApp;
    }
}
