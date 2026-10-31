package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DelegatingScheduledFuture.java */
/* JADX INFO: loaded from: classes4.dex */
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledFuture<?> f12017h;

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.q(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v10) {
            p.this.p(v10);
        }
    }

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    interface b<T> {
        void a(Throwable th);

        void set(T t10);
    }

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f12017h = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected void b() {
        this.f12017h.cancel(s());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f12017h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f12017h.compareTo(delayed);
    }
}
