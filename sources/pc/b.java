package pc;

/* JADX INFO: compiled from: DataConverter.java */
/* JADX INFO: loaded from: classes5.dex */
public interface b {
    String a(Object obj, String str);

    default boolean b(Object obj, boolean z10) {
        Boolean boolE = e(obj);
        return boolE != null ? boolE.booleanValue() : z10;
    }

    default Double c(Object obj) {
        return l(obj, null);
    }

    Boolean d(Object obj, Boolean bool);

    default Boolean e(Object obj) {
        return d(obj, null);
    }

    default int f(Object obj, int i10) {
        Integer numG = g(obj);
        return numG != null ? numG.intValue() : i10;
    }

    default Integer g(Object obj) {
        return i(obj, null);
    }

    default float h(Object obj, float f10) {
        Float fK = k(obj);
        return fK != null ? fK.floatValue() : f10;
    }

    Integer i(Object obj, Integer num);

    Float j(Object obj, Float f10);

    default Float k(Object obj) {
        return j(obj, null);
    }

    Double l(Object obj, Double d10);

    default String m(Object obj) {
        return a(obj, null);
    }
}
