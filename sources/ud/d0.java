package ud;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d0 {
    public static final <T> Object a(Object obj, zc.f<? super T> fVar) {
        if (!(obj instanceof c0)) {
            return wc.r.c(obj);
        }
        wc.r.a aVar = wc.r.f27774b;
        return wc.r.c(wc.s.a(((c0) obj).f26724a));
    }

    public static final <T> Object b(Object obj) {
        Throwable thG = wc.r.g(obj);
        return thG == null ? obj : new c0(thG, false, 2, null);
    }

    public static final <T> Object c(Object obj, n<?> nVar) {
        Throwable thG = wc.r.g(obj);
        return thG == null ? obj : new c0(thG, false, 2, null);
    }
}
