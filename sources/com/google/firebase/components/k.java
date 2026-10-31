package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x2.m;
import x2.o;

/* JADX INFO: compiled from: RestrictedComponentContainer.java */
/* JADX INFO: loaded from: classes4.dex */
final class k implements x2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<o<?>> f11957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<o<?>> f11958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<o<?>> f11959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<o<?>> f11960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<o<?>> f11961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f11962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x2.d f11963g;

    /* JADX INFO: compiled from: RestrictedComponentContainer.java */
    private static class a implements s3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f11964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s3.c f11965b;

        public a(Set<Class<?>> set, s3.c cVar) {
            this.f11964a = set;
            this.f11965b = cVar;
        }

        @Override // s3.c
        public void b(s3.a<?> aVar) {
            if (!this.f11964a.contains(aVar.b())) {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f11965b.b(aVar);
        }
    }

    k(x2.c<?> cVar, x2.d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (m mVar : cVar.g()) {
            if (mVar.e()) {
                if (mVar.g()) {
                    hashSet4.add(mVar.c());
                } else {
                    hashSet.add(mVar.c());
                }
            } else if (mVar.d()) {
                hashSet3.add(mVar.c());
            } else if (mVar.g()) {
                hashSet5.add(mVar.c());
            } else {
                hashSet2.add(mVar.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(o.b(s3.c.class));
        }
        this.f11957a = Collections.unmodifiableSet(hashSet);
        this.f11958b = Collections.unmodifiableSet(hashSet2);
        this.f11959c = Collections.unmodifiableSet(hashSet3);
        this.f11960d = Collections.unmodifiableSet(hashSet4);
        this.f11961e = Collections.unmodifiableSet(hashSet5);
        this.f11962f = cVar.k();
        this.f11963g = dVar;
    }

    @Override // x2.d
    public <T> T a(Class<T> cls) {
        if (!this.f11957a.contains(o.b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f11963g.a(cls);
        return !cls.equals(s3.c.class) ? t10 : (T) new a(this.f11962f, (s3.c) t10);
    }

    @Override // x2.d
    public <T> Deferred<T> c(o<T> oVar) {
        if (this.f11959c.contains(oVar)) {
            return this.f11963g.c(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", oVar));
    }

    @Override // x2.d
    public <T> Provider<T> d(Class<T> cls) {
        return e(o.b(cls));
    }

    @Override // x2.d
    public <T> Provider<T> e(o<T> oVar) {
        if (this.f11958b.contains(oVar)) {
            return this.f11963g.e(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", oVar));
    }

    @Override // x2.d
    public <T> T f(o<T> oVar) {
        if (this.f11957a.contains(oVar)) {
            return (T) this.f11963g.f(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", oVar));
    }

    @Override // x2.d
    public <T> Set<T> g(o<T> oVar) {
        if (this.f11960d.contains(oVar)) {
            return this.f11963g.g(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", oVar));
    }

    @Override // x2.d
    public <T> Deferred<T> h(Class<T> cls) {
        return c(o.b(cls));
    }

    @Override // x2.d
    public <T> Provider<Set<T>> i(o<T> oVar) {
        if (this.f11961e.contains(oVar)) {
            return this.f11963g.i(oVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", oVar));
    }
}
