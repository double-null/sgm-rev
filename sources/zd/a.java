package zd;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f29182a = new e0("CLOSED");

    public static final <N extends b<N>> N b(N n10) {
        while (true) {
            Object objG = n10.g();
            if (objG == f29182a) {
                return n10;
            }
            b bVar = (b) objG;
            if (bVar != null) {
                n10 = (N) bVar;
            } else if (n10.m()) {
                return n10;
            }
        }
    }

    public static final <S extends b0<S>> Object c(S s10, long j10, id.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f29187c >= j10 && !s10.k()) {
                return c0.a(s10);
            }
            Object objG = s10.g();
            if (objG == f29182a) {
                return c0.a(f29182a);
            }
            S sInvoke = (S) ((b) objG);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s10.f29187c + 1), s10);
                if (s10.o(sInvoke)) {
                    if (s10.k()) {
                        s10.n();
                    }
                }
            }
            s10 = (Object) sInvoke;
        }
    }
}
