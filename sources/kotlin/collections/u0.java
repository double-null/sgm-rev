package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Sets.kt */
/* JADX INFO: loaded from: classes5.dex */
public class u0 extends t0 {
    public static <T> Set<T> e() {
        return f0.f21457a;
    }

    public static <T> HashSet<T> f(T... elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return (HashSet) o.U(elements, new HashSet(n0.e(elements.length)));
    }

    public static <T> Set<T> g(T... elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return (Set) o.U(elements, new LinkedHashSet(n0.e(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> h(Set<? extends T> set) {
        kotlin.jvm.internal.t.f(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : t0.d(set.iterator().next());
        }
        return e();
    }

    public static <T> Set<T> i(T... elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return o.Y(elements);
    }
}
