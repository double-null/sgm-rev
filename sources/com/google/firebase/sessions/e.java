package com.google.firebase.sessions;

import android.content.Context;
import b4.g0;
import b4.h0;
import e0.k;
import zc.j;

/* JADX INFO: compiled from: FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements d4.b<k<g0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4.e<Context> f12326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4.e<j> f12327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4.e<h0> f12328c;

    private e(d4.e<Context> eVar, d4.e<j> eVar2, d4.e<h0> eVar3) {
        this.f12326a = eVar;
        this.f12327b = eVar2;
        this.f12328c = eVar3;
    }

    public static e a(d4.e<Context> eVar, d4.e<j> eVar2, d4.e<h0> eVar3) {
        return new e(eVar, eVar2, eVar3);
    }

    public static k<g0> c(Context context, j jVar, h0 h0Var) {
        return (k) d4.d.d(b.InterfaceC0154b.f12321a.m(context, jVar, h0Var));
    }

    @Override // vc.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k<g0> get() {
        return c(this.f12326a.get(), this.f12327b.get(), this.f12328c.get());
    }
}
