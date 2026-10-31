package com.google.common.base;

import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: compiled from: Absent.java */
/* JADX INFO: loaded from: classes2.dex */
final class a<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a<Object> f11434a = new a<>();

    private a() {
    }

    static <T> m<T> k() {
        return f11434a;
    }

    private Object readResolve() {
        return f11434a;
    }

    @Override // com.google.common.base.m
    public boolean e() {
        return false;
    }

    @Override // com.google.common.base.m
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.m
    public T g(w<? extends T> wVar) {
        return (T) p.m(wVar.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.common.base.m
    public T h() {
        return null;
    }

    @Override // com.google.common.base.m
    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.m
    public T c() {
        throw new IllegalStateException(UyXgnuLGEkgnZE.Brn);
    }
}
