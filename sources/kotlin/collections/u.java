package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes5.dex */
public class u extends t {
    public static <T> int u(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final <T> Integer v(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static <T> List<T> w(Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            y.z(arrayList, it.next());
        }
        return arrayList;
    }
}
