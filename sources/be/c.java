package be;

import ud.k0;
import zd.m;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f4486i = new c();

    private c() {
        super(j.f4498c, j.f4499d, j.f4500e, j.f4496a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ud.k0
    public k0 o0(int i10, String str) {
        m.a(i10);
        return i10 >= j.f4498c ? m.b(this, str) : super.o0(i10, str);
    }

    @Override // ud.k0
    public String toString() {
        return "Dispatchers.Default";
    }
}
