package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes5.dex */
public class v0 extends u0 {
    public static <T> Set<T> j(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        kotlin.jvm.internal.t.f(set, "<this>");
        kotlin.jvm.internal.t.f(elements, "elements");
        Integer numV = u.v(elements);
        if (numV != null) {
            size = set.size() + numV.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(n0.e(size));
        linkedHashSet.addAll(set);
        y.z(linkedHashSet, elements);
        return linkedHashSet;
    }
}
