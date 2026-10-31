package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: compiled from: Equivalence.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e<T> {

    /* JADX INFO: compiled from: Equivalence.java */
    static final class a extends e<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f11445a = new a();

        a() {
        }

        private Object readResolve() {
            return f11445a;
        }

        @Override // com.google.common.base.e
        protected boolean b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.e
        protected int c(Object obj) {
            return obj.hashCode();
        }
    }

    /* JADX INFO: compiled from: Equivalence.java */
    static final class b extends e<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f11446a = new b();

        b() {
        }

        private Object readResolve() {
            return f11446a;
        }

        @Override // com.google.common.base.e
        protected boolean b(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.e
        protected int c(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected e() {
    }

    public static e<Object> e() {
        return a.f11445a;
    }

    public static e<Object> h() {
        return b.f11446a;
    }

    protected abstract boolean b(T t10, T t11);

    protected abstract int c(T t10);

    public final boolean f(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return b(t10, t11);
    }

    public final int g(T t10) {
        if (t10 == null) {
            return 0;
        }
        return c(t10);
    }
}
