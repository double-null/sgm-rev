package kotlin.collections;

import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements qd.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f21445a;

        public a(Iterable iterable) {
            this.f21445a = iterable;
        }

        @Override // qd.g
        public Iterator<T> iterator() {
            return this.f21445a.iterator();
        }
    }

    public static <T> qd.g<T> E(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> List<List<T>> F(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        return u0(iterable, i10, i10, true);
    }

    public static <T> boolean G(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        return R(iterable, t10) >= 0;
    }

    public static <T> int H(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                t.s();
            }
        }
        return i10;
    }

    public static <T> List<T> I(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        return p0(s0(iterable));
    }

    public static <T> List<T> J(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        kotlin.jvm.internal.t.f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return t.k();
            }
            if (size == 1) {
                return s.e(W(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return t.q(arrayList);
    }

    public static <T> List<T> K(List<? extends T> list, int i10) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (i10 >= 0) {
            return j0(list, od.k.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> L(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        return (List) M(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C M(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static final <T> T N(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) O((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T O(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T P(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T Q(List<? extends T> list, int i10) {
        kotlin.jvm.internal.t.f(list, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < list.size()) {
            z10 = true;
        }
        if (z10) {
            return list.get(i10);
        }
        return null;
    }

    public static final <T> int R(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                t.t();
            }
            if (kotlin.jvm.internal.t.a(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A S(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, id.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        kotlin.jvm.internal.t.f(buffer, "buffer");
        kotlin.jvm.internal.t.f(separator, "separator");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        kotlin.jvm.internal.t.f(postfix, "postfix");
        kotlin.jvm.internal.t.f(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
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

    public static final <T> String U(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, id.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        kotlin.jvm.internal.t.f(separator, "separator");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        kotlin.jvm.internal.t.f(postfix, "postfix");
        kotlin.jvm.internal.t.f(truncated, "truncated");
        return ((StringBuilder) S(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String V(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, id.l lVar, int i11, Object obj) {
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
        return U(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> T W(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) X((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T X(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(t.m(list));
    }

    public static <T> T Y(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T Z(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T extends Comparable<? super T>> T a0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> b0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        kotlin.jvm.internal.t.f(elements, "elements");
        if (iterable instanceof Collection) {
            return c0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        y.z(arrayList, iterable);
        y.z(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> c0(Collection<? extends T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        kotlin.jvm.internal.t.f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            y.z(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> d0(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static final <T> T f0(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T g0(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> h0(List<? extends T> list, od.h indices) {
        kotlin.jvm.internal.t.f(list, "<this>");
        kotlin.jvm.internal.t.f(indices, "indices");
        return indices.isEmpty() ? t.k() : p0(list.subList(indices.j().intValue(), indices.i().intValue() + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> i0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        kotlin.jvm.internal.t.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listQ0 = q0(iterable);
            x.y(listQ0, comparator);
            return listQ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return p0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        m.p(array, comparator);
        return m.c(array);
    }

    public static <T> List<T> j0(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return t.k();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return p0(iterable);
            }
            if (i10 == 1) {
                return s.e(N(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return t.q(arrayList);
    }

    public static <T> List<T> k0(List<? extends T> list, int i10) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return t.k();
        }
        int size = list.size();
        if (i10 >= size) {
            return p0(list);
        }
        if (i10 == 1) {
            return s.e(X(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] l0(Collection<Boolean> collection) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    public static final <T, C extends Collection<? super T>> C m0(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> HashSet<T> n0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        return (HashSet) m0(iterable, new HashSet(n0.e(u.u(iterable, 12))));
    }

    public static int[] o0(Collection<Integer> collection) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> p0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return t.q(q0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return t.k();
        }
        if (size != 1) {
            return r0(collection);
        }
        return s.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <T> List<T> q0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        return iterable instanceof Collection ? r0((Collection) iterable) : (List) m0(iterable, new ArrayList());
    }

    public static <T> List<T> r0(Collection<? extends T> collection) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> t0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return u0.h((Set) m0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return u0.e();
        }
        if (size != 1) {
            return (Set) m0(iterable, new LinkedHashSet(n0.e(collection.size())));
        }
        return t0.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <T> List<List<T>> u0(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int iF;
        kotlin.jvm.internal.t.f(iterable, "<this>");
        w0.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = w0.b(iterable.iterator(), i10, i11, z10, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size) || ((iF = od.k.f(i10, size - i12)) < i10 && !z10)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iF);
            for (int i13 = 0; i13 < iF; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static <T> T e0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) f0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException(UICvx.JBJsEU);
        }
        return next;
    }

    public static <T> Set<T> s0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.t.f(iterable, UICvx.GbbEoYmow);
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m0(iterable, new LinkedHashSet());
    }
}
