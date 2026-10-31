package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: compiled from: Functions.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: compiled from: Functions.java */
    private static class a<E> implements g<Object, E>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final E f11447a;

        public a(E e10) {
            this.f11447a = e10;
        }

        @Override // com.google.common.base.g
        public E apply(Object obj) {
            return this.f11447a;
        }

        @Override // com.google.common.base.g
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return l.a(this.f11447a, ((a) obj).f11447a);
            }
            return false;
        }

        public int hashCode() {
            E e10 = this.f11447a;
            if (e10 == null) {
                return 0;
            }
            return e10.hashCode();
        }

        public String toString() {
            return "Functions.constant(" + this.f11447a + ")";
        }
    }

    public static <E> g<Object, E> a(E e10) {
        return new a(e10);
    }
}
