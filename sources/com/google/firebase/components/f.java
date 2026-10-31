package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: LazySet.java */
/* JADX INFO: loaded from: classes4.dex */
class f<T> implements Provider<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set<T> f11950b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set<Provider<T>> f11949a = Collections.newSetFromMap(new ConcurrentHashMap());

    f(Collection<Provider<T>> collection) {
        this.f11949a.addAll(collection);
    }

    static f<?> b(Collection<Provider<?>> collection) {
        return new f<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<Provider<T>> it = this.f11949a.iterator();
        while (it.hasNext()) {
            this.f11950b.add(it.next().get());
        }
        this.f11949a = null;
    }

    synchronized void a(Provider<T> provider) {
        if (this.f11950b == null) {
            this.f11949a.add(provider);
        } else {
            this.f11950b.add(provider.get());
        }
    }

    @Override // com.google.firebase.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f11950b == null) {
            synchronized (this) {
                if (this.f11950b == null) {
                    this.f11950b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f11950b);
    }
}
