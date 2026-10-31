package com.google.common.base;

/* JADX INFO: compiled from: Present.java */
/* JADX INFO: loaded from: classes.dex */
final class s<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f11459a;

    s(T t10) {
        this.f11459a = t10;
    }

    @Override // com.google.common.base.m
    public T c() {
        return this.f11459a;
    }

    @Override // com.google.common.base.m
    public boolean e() {
        return true;
    }

    @Override // com.google.common.base.m
    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f11459a.equals(((s) obj).f11459a);
        }
        return false;
    }

    @Override // com.google.common.base.m
    public T g(w<? extends T> wVar) {
        p.l(wVar);
        return this.f11459a;
    }

    @Override // com.google.common.base.m
    public T h() {
        return this.f11459a;
    }

    @Override // com.google.common.base.m
    public int hashCode() {
        return this.f11459a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f11459a + ")";
    }
}
