package xd;

import zd.e0;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f28565a = new e0("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f28566b = new e0("PENDING");

    public static final <T> n<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) yd.l.f28895a;
        }
        return new s(t10);
    }

    public static final <T> c<T> d(r<? extends T> rVar, zc.j jVar, int i10, wd.a aVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        return ((z10 || i10 == -2) && aVar == wd.a.DROP_OLDEST) ? rVar : q.a(rVar, jVar, i10, aVar);
    }
}
