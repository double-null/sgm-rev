package xd;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class i {
    public static final <T> c<T> a(c<? extends T> cVar, int i10, wd.a aVar) {
        int i11;
        wd.a aVar2;
        boolean z10 = true;
        if (!(i10 >= 0 || i10 == -2 || i10 == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != wd.a.SUSPEND) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i10 == -1) {
            aVar2 = wd.a.DROP_OLDEST;
            i11 = 0;
        } else {
            i11 = i10;
            aVar2 = aVar;
        }
        return cVar instanceof yd.j ? yd.j.a.a((yd.j) cVar, null, i11, aVar2, 1, null) : new yd.g(cVar, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ c b(c cVar, int i10, wd.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = wd.a.SUSPEND;
        }
        return e.a(cVar, i10, aVar);
    }

    public static final <T> c<T> c(c<? extends T> cVar) {
        return b(cVar, -1, null, 2, null);
    }
}
