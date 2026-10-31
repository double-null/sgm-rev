package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MutableCollectionsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class x extends w {
    public static <T extends Comparable<? super T>> void x(List<T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void y(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.t.f(list, "<this>");
        kotlin.jvm.internal.t.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
