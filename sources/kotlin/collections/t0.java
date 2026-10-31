package kotlin.collections;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: SetsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class t0 {
    public static <E> Set<E> a(Set<E> builder) {
        kotlin.jvm.internal.t.f(builder, "builder");
        return ((xc.j) builder).e();
    }

    public static <E> Set<E> b() {
        return new xc.j();
    }

    public static <E> Set<E> c(int i10) {
        return new xc.j(i10);
    }

    public static <T> Set<T> d(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        kotlin.jvm.internal.t.e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
