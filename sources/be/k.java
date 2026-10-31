package be;

import ud.k0;
import zd.m;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
final class k extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f4502c = new k();

    private k() {
    }

    @Override // ud.k0
    public void m0(zc.j jVar, Runnable runnable) {
        c.f4486i.r0(runnable, true, false);
    }

    @Override // ud.k0
    public k0 o0(int i10, String str) {
        m.a(i10);
        return i10 >= j.f4499d ? m.b(this, str) : super.o0(i10, str);
    }

    @Override // ud.k0
    public String toString() {
        return "Dispatchers.IO";
    }
}
