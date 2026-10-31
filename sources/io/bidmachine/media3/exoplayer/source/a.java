package io.bidmachine.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import c8.b2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<r.c> f19418a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<r.c> f19419b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s.a f19420c = new s.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.drm.h.a f19421d = new io.bidmachine.media3.exoplayer.drm.h.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f19422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u7.d0 f19423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b2 f19424g;

    protected final void A(u7.d0 d0Var) {
        this.f19423f = d0Var;
        Iterator<r.c> it = this.f19418a.iterator();
        while (it.hasNext()) {
            it.next().a(this, d0Var);
        }
    }

    protected abstract void B();

    @Override // io.bidmachine.media3.exoplayer.source.r
    public final void b(io.bidmachine.media3.exoplayer.drm.h hVar) {
        this.f19421d.t(hVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public final void f(r.c cVar) {
        x7.a.e(this.f19422e);
        boolean zIsEmpty = this.f19419b.isEmpty();
        this.f19419b.add(cVar);
        if (zIsEmpty) {
            w();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public final void g(r.c cVar) {
        this.f19418a.remove(cVar);
        if (!this.f19418a.isEmpty()) {
            o(cVar);
            return;
        }
        this.f19422e = null;
        this.f19423f = null;
        this.f19424g = null;
        this.f19419b.clear();
        B();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public final void h(r.c cVar, z7.o oVar, b2 b2Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f19422e;
        x7.a.a(looper == null || looper == looperMyLooper);
        this.f19424g = b2Var;
        u7.d0 d0Var = this.f19423f;
        this.f19418a.add(cVar);
        if (this.f19422e == null) {
            this.f19422e = looperMyLooper;
            this.f19419b.add(cVar);
            z(oVar);
        } else if (d0Var != null) {
            f(cVar);
            cVar.a(this, d0Var);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public final void i(Handler handler, io.bidmachine.media3.exoplayer.drm.h hVar) {
        x7.a.e(handler);
        x7.a.e(hVar);
        this.f19421d.g(handler, hVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public final void o(r.c cVar) {
        boolean z10 = !this.f19419b.isEmpty();
        this.f19419b.remove(cVar);
        if (z10 && this.f19419b.isEmpty()) {
            v();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public final void p(Handler handler, s sVar) {
        x7.a.e(handler);
        x7.a.e(sVar);
        this.f19420c.h(handler, sVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public final void q(s sVar) {
        this.f19420c.E(sVar);
    }

    protected final io.bidmachine.media3.exoplayer.drm.h.a r(int i10, r.b bVar) {
        return this.f19421d.u(i10, bVar);
    }

    protected final io.bidmachine.media3.exoplayer.drm.h.a s(r.b bVar) {
        return this.f19421d.u(0, bVar);
    }

    protected final s.a t(int i10, r.b bVar) {
        return this.f19420c.H(i10, bVar);
    }

    protected final s.a u(r.b bVar) {
        return this.f19420c.H(0, bVar);
    }

    protected final b2 x() {
        return (b2) x7.a.i(this.f19424g);
    }

    protected final boolean y() {
        return !this.f19419b.isEmpty();
    }

    protected abstract void z(z7.o oVar);

    protected void v() {
    }

    protected void w() {
    }
}
