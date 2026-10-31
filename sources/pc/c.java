package pc;

import io.bidmachine.Function;

/* JADX INFO: compiled from: DataRetriever.java */
/* JADX INFO: loaded from: classes5.dex */
public interface c<K> {
    Float a(K k10, Float f10);

    default <T> T b(K k10, Function<Object, T> function) {
        return (T) e(k10, null, function);
    }

    float c(K k10, float f10);

    default Float d(K k10) {
        return a(k10, null);
    }

    default <T> T e(K k10, T t10, Function<Object, T> function) {
        try {
            Object objH = h(k10, t10);
            if (objH == null) {
                return null;
            }
            return function.apply(objH);
        } catch (Exception unused) {
            return t10;
        }
    }

    String f(K k10, String str);

    default boolean g(K k10) {
        return l(k10, false);
    }

    Object h(K k10, Object obj);

    default String i(K k10) {
        return f(k10, null);
    }

    default int j(K k10) {
        return k(k10, 0);
    }

    int k(K k10, int i10);

    boolean l(K k10, boolean z10);

    default Object m(K k10) {
        return h(k10, null);
    }

    default float n(K k10) {
        return c(k10, 0.0f);
    }
}
