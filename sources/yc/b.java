package yc;

import id.l;
import java.util.Comparator;
import kotlin.jvm.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static <T extends Comparable<?>> int a(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    public static <T> int b(T t10, T t11, l<? super T, ? extends Comparable<?>>... selectors) {
        t.f(selectors, "selectors");
        if (selectors.length > 0) {
            return c(t10, t11, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final <T> int c(T t10, T t11, l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int iA = a(lVar.invoke(t10), lVar.invoke(t11));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> d() {
        e eVar = e.f28871a;
        t.d(eVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return eVar;
    }
}
