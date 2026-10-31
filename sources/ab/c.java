package ab;

/* JADX INFO: loaded from: classes5.dex */
public interface c {
    static /* synthetic */ void f(c cVar, pa.d dVar, pb.f fVar, boolean z10, Runnable runnable, Runnable runnable2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareAndAnimate");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        cVar.g(dVar, fVar, z10, (i10 & 8) != 0 ? null : runnable, (i10 & 16) != 0 ? null : runnable2);
    }

    void a();

    void a(pa.e eVar, pb.f fVar);

    boolean a(int i10);

    void b(pa.d dVar, boolean z10, pb.f fVar);

    void c(pa.d dVar);

    void d(pa.e eVar);

    void e(pa.e eVar, pb.f fVar, boolean z10, Runnable runnable, Runnable runnable2);

    void g(pa.d dVar, pb.f fVar, boolean z10, Runnable runnable, Runnable runnable2);

    void h(pa.d dVar, pb.f fVar, boolean z10, Runnable runnable, Runnable runnable2);
}
