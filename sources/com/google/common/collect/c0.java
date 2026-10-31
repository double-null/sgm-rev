package com.google.common.collect;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: MapMaker.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f11509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11510b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f11511c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d0.o f11512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d0.o f11513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    com.google.common.base.e<Object> f11514f;

    public c0 a(int i10) {
        int i11 = this.f11511c;
        com.google.common.base.p.t(i11 == -1, "concurrency level was already set to %s", i11);
        com.google.common.base.p.d(i10 > 0);
        this.f11511c = i10;
        return this;
    }

    int b() {
        int i10 = this.f11511c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int c() {
        int i10 = this.f11510b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    com.google.common.base.e<Object> d() {
        return (com.google.common.base.e) com.google.common.base.j.a(this.f11514f, e().c());
    }

    d0.o e() {
        return (d0.o) com.google.common.base.j.a(this.f11512d, d0.o.f11591a);
    }

    d0.o f() {
        return (d0.o) com.google.common.base.j.a(this.f11513e, d0.o.f11591a);
    }

    public c0 g(int i10) {
        int i11 = this.f11510b;
        com.google.common.base.p.t(i11 == -1, "initial capacity was already set to %s", i11);
        com.google.common.base.p.d(i10 >= 0);
        this.f11510b = i10;
        return this;
    }

    c0 h(com.google.common.base.e<Object> eVar) {
        com.google.common.base.e<Object> eVar2 = this.f11514f;
        com.google.common.base.p.u(eVar2 == null, "key equivalence was already set to %s", eVar2);
        this.f11514f = (com.google.common.base.e) com.google.common.base.p.l(eVar);
        this.f11509a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        return !this.f11509a ? new ConcurrentHashMap(c(), 0.75f, b()) : d0.b(this);
    }

    c0 j(d0.o oVar) {
        d0.o oVar2 = this.f11512d;
        com.google.common.base.p.u(oVar2 == null, "Key strength was already set to %s", oVar2);
        this.f11512d = (d0.o) com.google.common.base.p.l(oVar);
        if (oVar != d0.o.f11591a) {
            this.f11509a = true;
        }
        return this;
    }

    c0 k(d0.o oVar) {
        d0.o oVar2 = this.f11513e;
        com.google.common.base.p.u(oVar2 == null, "Value strength was already set to %s", oVar2);
        this.f11513e = (d0.o) com.google.common.base.p.l(oVar);
        if (oVar != d0.o.f11591a) {
            this.f11509a = true;
        }
        return this;
    }

    public c0 l() {
        return j(d0.o.f11592b);
    }

    public String toString() {
        com.google.common.base.j.b bVarB = com.google.common.base.j.b(this);
        int i10 = this.f11510b;
        if (i10 != -1) {
            bVarB.a("initialCapacity", i10);
        }
        int i11 = this.f11511c;
        if (i11 != -1) {
            bVarB.a("concurrencyLevel", i11);
        }
        d0.o oVar = this.f11512d;
        if (oVar != null) {
            bVarB.b("keyStrength", com.google.common.base.c.e(oVar.toString()));
        }
        d0.o oVar2 = this.f11513e;
        if (oVar2 != null) {
            bVarB.b("valueStrength", com.google.common.base.c.e(oVar2.toString()));
        }
        if (this.f11514f != null) {
            bVarB.h("keyEquivalence");
        }
        return bVarB.toString();
    }
}
