package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ForwardingListenableFuture.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u<V> extends t<V> implements ListenableFuture<V> {

    /* JADX INFO: compiled from: ForwardingListenableFuture.java */
    public static abstract class a<V> extends u<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListenableFuture<V> f11888a;

        protected a(ListenableFuture<V> listenableFuture) {
            this.f11888a = (ListenableFuture) com.google.common.base.p.l(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final ListenableFuture<V> c() {
            return this.f11888a;
        }
    }

    protected u() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        b().addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: e */
    protected abstract ListenableFuture<? extends V> b();
}
