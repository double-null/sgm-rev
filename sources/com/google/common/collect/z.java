package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Iterators.java */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterators.java */
    class a<T> extends com.google.common.collect.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f11734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.q f11735d;

        a(Iterator it, com.google.common.base.q qVar) {
            this.f11734c = it;
            this.f11735d = qVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.b
        protected T a() {
            while (this.f11734c.hasNext()) {
                T t10 = (T) this.f11734c.next();
                if (this.f11735d.apply(t10)) {
                    return t10;
                }
            }
            return b();
        }
    }

    /* JADX INFO: compiled from: Iterators.java */
    private enum b implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            h.c(false);
        }
    }

    /* JADX INFO: compiled from: Iterators.java */
    private static final class c<T> extends c1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f11738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11739b;

        c(T t10) {
            this.f11738a = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f11739b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f11739b) {
                throw new NoSuchElementException();
            }
            this.f11739b = true;
            return this.f11738a;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        com.google.common.base.p.l(collection);
        com.google.common.base.p.l(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static <T> boolean b(Iterator<T> it, com.google.common.base.q<? super T> qVar) {
        return m(it, qVar) != -1;
    }

    static void c(Iterator<?> it) {
        com.google.common.base.p.l(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.common.base.l.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> Iterator<T> f() {
        return b.INSTANCE;
    }

    public static <T> c1<T> g(Iterator<T> it, com.google.common.base.q<? super T> qVar) {
        com.google.common.base.p.l(it);
        com.google.common.base.p.l(qVar);
        return new a(it, qVar);
    }

    public static <T> T h(Iterator<T> it, com.google.common.base.q<? super T> qVar) {
        com.google.common.base.p.l(it);
        com.google.common.base.p.l(qVar);
        while (it.hasNext()) {
            T next = it.next();
            if (qVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T i(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T j(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) i(it) : t10;
    }

    public static <T> T k(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> T l(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> int m(Iterator<T> it, com.google.common.base.q<? super T> qVar) {
        com.google.common.base.p.m(qVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static <T> T n(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean o(Iterator<?> it, Collection<?> collection) {
        com.google.common.base.p.l(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean p(Iterator<T> it, com.google.common.base.q<? super T> qVar) {
        com.google.common.base.p.l(qVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> c1<T> q(T t10) {
        return new c(t10);
    }
}
