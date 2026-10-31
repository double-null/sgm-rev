package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;

/* JADX INFO: compiled from: FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements d4.b<b4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<FirebaseApp> f12323a;

    private c(d4.e<FirebaseApp> eVar) {
        this.f12323a = eVar;
    }

    public static b4.b a(FirebaseApp firebaseApp) {
        return (b4.b) d4.d.d(b.InterfaceC0154b.f12321a.e(firebaseApp));
    }

    public static c b(d4.e<FirebaseApp> eVar) {
        return new c(eVar);
    }

    @Override // vc.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b4.b get() {
        return a(this.f12323a.get());
    }
}
