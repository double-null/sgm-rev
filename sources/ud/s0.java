package ud;

/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(zc.f<?> fVar) {
        Object objC;
        if (fVar instanceof zd.g) {
            return ((zd.g) fVar).toString();
        }
        try {
            wc.r.a aVar = wc.r.f27774b;
            objC = wc.r.c(fVar + '@' + b(fVar));
        } catch (Throwable th) {
            wc.r.a aVar2 = wc.r.f27774b;
            objC = wc.r.c(wc.s.a(th));
        }
        if (wc.r.g(objC) != null) {
            objC = fVar.getClass().getName() + '@' + b(fVar);
        }
        return (String) objC;
    }
}
