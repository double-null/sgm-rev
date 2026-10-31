package com.google.common.util.concurrent;

import com.google.common.collect.w0;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: AggregateFutureState.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class h<OutputT> extends com.google.common.util.concurrent.b.j<OutputT> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f11830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0 f11831d = new c0(h.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set<Throwable> f11832a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f11833b;

    /* JADX INFO: compiled from: AggregateFutureState.java */
    private static abstract class b {
        private b() {
        }

        abstract void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2);

        abstract int b(h<?> hVar);
    }

    /* JADX INFO: compiled from: AggregateFutureState.java */
    private static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super h<?>, ? super Set<Throwable>> f11834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicIntegerFieldUpdater<? super h<?>> f11835b;

        c(AtomicReferenceFieldUpdater<? super h<?>, ? super Set<Throwable>> atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater<? super h<?>> atomicIntegerFieldUpdater) {
            super();
            this.f11834a = atomicReferenceFieldUpdater;
            this.f11835b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.h.b
        void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2) {
            androidx.concurrent.futures.b.a(this.f11834a, hVar, set, set2);
        }

        @Override // com.google.common.util.concurrent.h.b
        int b(h<?> hVar) {
            return this.f11835b.decrementAndGet(hVar);
        }
    }

    /* JADX INFO: compiled from: AggregateFutureState.java */
    private static final class d extends b {
        private d() {
            super();
        }

        @Override // com.google.common.util.concurrent.h.b
        void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (hVar) {
                if (((h) hVar).f11832a == set) {
                    ((h) hVar).f11832a = set2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.h.b
        int b(h<?> hVar) {
            int iD;
            synchronized (hVar) {
                iD = h.d(hVar);
            }
            return iD;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(h.class, Set.class, "a"), AtomicIntegerFieldUpdater.newUpdater(h.class, "b"));
        } catch (Throwable th2) {
            dVar = new d();
            th = th2;
        }
        f11830c = dVar;
        if (th != null) {
            f11831d.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    h(int i10) {
        this.f11833b = i10;
    }

    static /* synthetic */ int d(h hVar) {
        int i10 = hVar.f11833b - 1;
        hVar.f11833b = i10;
        return i10;
    }

    abstract void e(Set<Throwable> set);

    final void f() {
        this.f11832a = null;
    }

    final int g() {
        return f11830c.b(this);
    }

    final Set<Throwable> h() {
        Set<Throwable> set = this.f11832a;
        if (set != null) {
            return set;
        }
        Set<Throwable> setF = w0.f();
        e(setF);
        f11830c.a(this, null, setF);
        Set<Throwable> set2 = this.f11832a;
        Objects.requireNonNull(set2);
        return set2;
    }
}
