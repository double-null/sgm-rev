package com.google.common.util.concurrent;

import com.google.common.collect.c1;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: AggregateFuture.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class g<InputT, OutputT> extends h<OutputT> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c0 f11817h = new c0(g.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.common.collect.s<? extends ListenableFuture<? extends InputT>> f11818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f11819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f11820g;

    /* JADX INFO: compiled from: AggregateFuture.java */
    enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    g(com.google.common.collect.s<? extends ListenableFuture<? extends InputT>> sVar, boolean z10, boolean z11) {
        super(sVar.size());
        this.f11818e = (com.google.common.collect.s) com.google.common.base.p.l(sVar);
        this.f11819f = z10;
        this.f11820g = z11;
    }

    private static boolean k(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void m(int i10, Future<? extends InputT> future) {
        try {
            l(i10, n0.a(future));
        } catch (ExecutionException e10) {
            q(e10.getCause());
        } catch (Throwable th) {
            q(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void t(com.google.common.collect.s<? extends Future<? extends InputT>> sVar) {
        int iG = g();
        com.google.common.base.p.s(iG >= 0, "Less than 0 remaining futures");
        if (iG == 0) {
            w(sVar);
        }
    }

    private void q(Throwable th) {
        com.google.common.base.p.l(th);
        if (this.f11819f && !setException(th) && k(h(), th)) {
            u(th);
        } else if (th instanceof Error) {
            u(th);
        }
    }

    private static void u(Throwable th) {
        f11817h.a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void s(int i10, ListenableFuture<? extends InputT> listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f11818e = null;
                cancel(false);
            } else {
                m(i10, listenableFuture);
            }
        } finally {
            t(null);
        }
    }

    private void w(com.google.common.collect.s<? extends Future<? extends InputT>> sVar) {
        if (sVar != null) {
            c1<? extends Future<? extends InputT>> it = sVar.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    m(i10, next);
                }
                i10++;
            }
        }
        f();
        o();
        x(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        super.afterDone();
        com.google.common.collect.s<? extends ListenableFuture<? extends InputT>> sVar = this.f11818e;
        x(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (sVar != null)) {
            boolean zWasInterrupted = wasInterrupted();
            c1<? extends ListenableFuture<? extends InputT>> it = sVar.iterator();
            while (it.hasNext()) {
                it.next().cancel(zWasInterrupted);
            }
        }
    }

    @Override // com.google.common.util.concurrent.h
    final void e(Set<Throwable> set) {
        com.google.common.base.p.l(set);
        if (isCancelled()) {
            return;
        }
        Throwable thTryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
        Objects.requireNonNull(thTryInternalFastPathGetFailure);
        k(set, thTryInternalFastPathGetFailure);
    }

    abstract void l(int i10, InputT inputt);

    abstract void o();

    @Override // com.google.common.util.concurrent.b
    protected final String pendingToString() {
        com.google.common.collect.s<? extends ListenableFuture<? extends InputT>> sVar = this.f11818e;
        if (sVar == null) {
            return super.pendingToString();
        }
        return "futures=" + sVar;
    }

    final void r() {
        Objects.requireNonNull(this.f11818e);
        if (this.f11818e.isEmpty()) {
            o();
            return;
        }
        if (!this.f11819f) {
            final com.google.common.collect.s<? extends ListenableFuture<? extends InputT>> sVar = this.f11820g ? this.f11818e : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11815a.t(sVar);
                }
            };
            c1<? extends ListenableFuture<? extends InputT>> it = this.f11818e.iterator();
            while (it.hasNext()) {
                ListenableFuture<? extends InputT> next = it.next();
                if (next.isDone()) {
                    t(sVar);
                } else {
                    next.addListener(runnable, g0.a());
                }
            }
            return;
        }
        c1<? extends ListenableFuture<? extends InputT>> it2 = this.f11818e.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final ListenableFuture<? extends InputT> next2 = it2.next();
            int i11 = i10 + 1;
            if (next2.isDone()) {
                s(i10, next2);
            } else {
                next2.addListener(new Runnable() { // from class: com.google.common.util.concurrent.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11812a.s(i10, next2);
                    }
                }, g0.a());
            }
            i10 = i11;
        }
    }

    void x(a aVar) {
        com.google.common.base.p.l(aVar);
        this.f11818e = null;
    }
}
