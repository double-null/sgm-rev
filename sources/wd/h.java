package wd;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import ud.g2;
import wc.g0;

/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h<E> extends ud.a<g0> implements g<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g<E> f27845d;

    public h(zc.j jVar, g<E> gVar, boolean z10, boolean z11) {
        super(jVar, z10, z11);
        this.f27845d = gVar;
    }

    @Override // ud.g2
    public void O(Throwable th) {
        CancellationException cancellationExceptionN0 = g2.N0(this, th, null, 1, null);
        this.f27845d.f(cancellationExceptionN0);
        L(cancellationExceptionN0);
    }

    protected final g<E> Y0() {
        return this.f27845d;
    }

    @Override // wd.u
    public Object a(zc.f<? super E> fVar) {
        return this.f27845d.a(fVar);
    }

    @Override // wd.v
    public void d(id.l<? super Throwable, g0> lVar) {
        this.f27845d.d(lVar);
    }

    @Override // ud.g2, ud.b2
    public final void f(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(R(), null, this);
        }
        O(cancellationException);
    }

    @Override // wd.v
    public Object i(E e10) {
        return this.f27845d.i(e10);
    }

    @Override // wd.u
    public i<E> iterator() {
        return this.f27845d.iterator();
    }

    @Override // wd.v
    public Object j(E e10, zc.f<? super g0> fVar) {
        return this.f27845d.j(e10, fVar);
    }

    @Override // wd.u
    public Object l() {
        return this.f27845d.l();
    }

    @Override // wd.v
    public boolean m(Throwable th) {
        return this.f27845d.m(th);
    }
}
