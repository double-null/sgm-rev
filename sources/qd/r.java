package qd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public class r extends p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.kt */
    public static final class a<T> implements Iterable<T>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f24766a;

        public a(g gVar) {
            this.f24766a = gVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f24766a.iterator();
        }
    }

    public static <T> Iterable<T> l(g<? extends T> gVar) {
        t.f(gVar, "<this>");
        return new a(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> g<T> m(g<? extends T> gVar, int i10) {
        t.f(gVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return gVar;
            }
            return gVar instanceof c ? ((c) gVar).a(i10) : new b(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> g<T> n(g<? extends T> gVar, id.l<? super T, Boolean> predicate) {
        t.f(gVar, "<this>");
        t.f(predicate, "predicate");
        return new e(gVar, true, predicate);
    }

    public static final <T> g<T> o(g<? extends T> gVar, id.l<? super T, Boolean> predicate) {
        t.f(gVar, "<this>");
        t.f(predicate, "predicate");
        return new e(gVar, false, predicate);
    }

    public static final <T> g<T> p(g<? extends T> gVar) {
        t.f(gVar, "<this>");
        g<T> gVarO = o(gVar, new id.l() { // from class: qd.q
            @Override // id.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(r.q(obj));
            }
        });
        t.d(gVarO, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return gVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(Object obj) {
        return obj == null;
    }

    public static <T> T r(g<? extends T> gVar) {
        t.f(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T, A extends Appendable> A s(g<? extends T> gVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, id.l<? super T, ? extends CharSequence> lVar) throws IOException {
        t.f(gVar, "<this>");
        t.f(buffer, "buffer");
        t.f(separator, "separator");
        t.f(prefix, "prefix");
        t.f(postfix, "postfix");
        t.f(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : gVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            rd.s.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String t(g<? extends T> gVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, id.l<? super T, ? extends CharSequence> lVar) {
        t.f(gVar, "<this>");
        t.f(separator, "separator");
        t.f(prefix, "prefix");
        t.f(postfix, "postfix");
        t.f(truncated, "truncated");
        return ((StringBuilder) s(gVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String u(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, id.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return t(gVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static <T, R> g<R> v(g<? extends T> gVar, id.l<? super T, ? extends R> transform) {
        t.f(gVar, "<this>");
        t.f(transform, "transform");
        return new s(gVar, transform);
    }

    public static <T, R> g<R> w(g<? extends T> gVar, id.l<? super T, ? extends R> transform) {
        t.f(gVar, "<this>");
        t.f(transform, "transform");
        return p(new s(gVar, transform));
    }

    public static <T> List<T> x(g<? extends T> gVar) {
        t.f(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return kotlin.collections.t.k();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return kotlin.collections.s.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
