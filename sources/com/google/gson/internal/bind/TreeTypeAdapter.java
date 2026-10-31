package com.google.gson.internal.bind;

import g4.f;
import g4.j;
import g4.k;
import g4.l;
import g4.p;
import g4.q;
import g4.s;
import g4.t;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q<T> f12383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k<T> f12384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f f12385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l4.a<T> f12386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f12387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f12388f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s<T> f12389g;

    private static final class SingleTypeFactory implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l4.a<?> f12390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f12391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<?> f12392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final q<?> f12393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final k<?> f12394e;

        @Override // g4.t
        public <T> s<T> a(f fVar, l4.a<T> aVar) {
            boolean zIsAssignableFrom;
            l4.a<?> aVar2 = this.f12390a;
            if (aVar2 != null) {
                zIsAssignableFrom = aVar2.equals(aVar) || (this.f12391b && this.f12390a.e() == aVar.c());
            } else {
                zIsAssignableFrom = this.f12392c.isAssignableFrom(aVar.c());
            }
            if (zIsAssignableFrom) {
                return new TreeTypeAdapter(this.f12393d, this.f12394e, fVar, aVar, this);
            }
            return null;
        }
    }

    private final class b implements p, j {
        private b() {
        }
    }

    public TreeTypeAdapter(q<T> qVar, k<T> kVar, f fVar, l4.a<T> aVar, t tVar) {
        this.f12383a = qVar;
        this.f12384b = kVar;
        this.f12385c = fVar;
        this.f12386d = aVar;
        this.f12387e = tVar;
    }

    private s<T> e() {
        s<T> sVar = this.f12389g;
        if (sVar != null) {
            return sVar;
        }
        s<T> sVarM = this.f12385c.m(this.f12387e, this.f12386d);
        this.f12389g = sVarM;
        return sVarM;
    }

    @Override // g4.s
    public T b(m4.a aVar) throws IOException {
        if (this.f12384b == null) {
            return e().b(aVar);
        }
        l lVarA = i4.k.a(aVar);
        if (lVarA.f()) {
            return null;
        }
        return this.f12384b.a(lVarA, this.f12386d.e(), this.f12388f);
    }

    @Override // g4.s
    public void d(m4.c cVar, T t10) throws IOException {
        q<T> qVar = this.f12383a;
        if (qVar == null) {
            e().d(cVar, t10);
        } else if (t10 == null) {
            cVar.u();
        } else {
            i4.k.b(qVar.a(t10, this.f12386d.e(), this.f12388f), cVar);
        }
    }
}
