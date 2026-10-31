package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Predicates.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: compiled from: Predicates.java */
    private static class b<T> implements q<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends q<? super T>> f11458a;

        @Override // com.google.common.base.q
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f11458a.size(); i10++) {
                if (!this.f11458a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f11458a.equals(((b) obj).f11458a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11458a.hashCode() + 306654252;
        }

        public String toString() {
            return r.d("and", this.f11458a);
        }

        private b(List<? extends q<? super T>> list) {
            this.f11458a = list;
        }
    }

    public static <T> q<T> b(q<? super T> qVar, q<? super T> qVar2) {
        return new b(c((q) p.l(qVar), (q) p.l(qVar2)));
    }

    private static <T> List<q<? super T>> c(q<? super T> qVar, q<? super T> qVar2) {
        return Arrays.asList(qVar, qVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
