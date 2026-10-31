package com.google.common.base;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: Suppliers.java */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: compiled from: Suppliers.java */
    static class a<T> implements w<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f11480a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final w<T> f11481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f11482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient T f11483d;

        a(w<T> wVar) {
            this.f11481b = (w) p.l(wVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f11480a = new Object();
        }

        @Override // com.google.common.base.w
        public T get() {
            if (!this.f11482c) {
                synchronized (this.f11480a) {
                    if (!this.f11482c) {
                        T t10 = this.f11481b.get();
                        this.f11483d = t10;
                        this.f11482c = true;
                        return t10;
                    }
                }
            }
            return (T) k.a(this.f11483d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f11482c) {
                obj = "<supplier that returned " + this.f11483d + ">";
            } else {
                obj = this.f11481b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Suppliers.java */
    static class b<T> implements w<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final w<Void> f11484d = new w() { // from class: com.google.common.base.y
            @Override // com.google.common.base.w
            public final Object get() {
                return x.b.b();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f11485a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile w<T> f11486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f11487c;

        b(w<T> wVar) {
            this.f11486b = (w) p.l(wVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.base.w
        public T get() {
            w<T> wVar = this.f11486b;
            w<T> wVar2 = (w<T>) f11484d;
            if (wVar != wVar2) {
                synchronized (this.f11485a) {
                    if (this.f11486b != wVar2) {
                        T t10 = this.f11486b.get();
                        this.f11487c = t10;
                        this.f11486b = wVar2;
                        return t10;
                    }
                }
            }
            return (T) k.a(this.f11487c);
        }

        public String toString() {
            Object obj = this.f11486b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f11484d) {
                obj = "<supplier that returned " + this.f11487c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Suppliers.java */
    private static class c<T> implements w<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f11488a;

        c(T t10) {
            this.f11488a = t10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return l.a(this.f11488a, ((c) obj).f11488a);
            }
            return false;
        }

        @Override // com.google.common.base.w
        public T get() {
            return this.f11488a;
        }

        public int hashCode() {
            return l.b(this.f11488a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f11488a + ")";
        }
    }

    public static <T> w<T> a(w<T> wVar) {
        if ((wVar instanceof b) || (wVar instanceof a)) {
            return wVar;
        }
        return wVar instanceof Serializable ? new a(wVar) : new b(wVar);
    }

    public static <T> w<T> b(T t10) {
        return new c(t10);
    }
}
