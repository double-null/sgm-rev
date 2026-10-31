package com.google.firebase.sessions;

import android.content.Context;
import e0.k;
import e4.h;
import zc.j;

/* JADX INFO: compiled from: FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements d4.b<k<h>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<Context> f12324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<j> f12325b;

    private d(d4.e<Context> eVar, d4.e<j> eVar2) {
        this.f12324a = eVar;
        this.f12325b = eVar2;
    }

    public static d a(d4.e<Context> eVar, d4.e<j> eVar2) {
        return new d(eVar, eVar2);
    }

    public static k<h> c(Context context, j jVar) {
        return (k) d4.d.d(b.InterfaceC0154b.f12321a.j(context, jVar));
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k<h> get() {
        return c(this.f12324a.get(), this.f12325b.get());
    }
}
