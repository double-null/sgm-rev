package kotlin.collections;

import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes5.dex */
public class y extends x {
    public static <T> boolean A(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        kotlin.jvm.internal.t.f(elements, "elements");
        return collection.addAll(m.c(elements));
    }

    public static <T> T B(List<T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T C(List<T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(t.m(list));
    }

    public static <T> T D(List<T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(t.m(list));
    }

    public static <T> boolean z(Collection<? super T> collection, Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        kotlin.jvm.internal.t.f(iterable, vgmm.lfIVMgc);
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }
}
