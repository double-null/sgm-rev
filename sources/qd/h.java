package qd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
final class h<T> extends i<T> implements Iterator<T>, zc.f<g0>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f24759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<? extends T> f24760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zc.f<? super g0> f24761d;

    private final Throwable e() {
        int i10 = this.f24758a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f24758a);
    }

    private final T f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // qd.i
    public Object a(T t10, zc.f<? super g0> fVar) {
        this.f24759b = t10;
        this.f24758a = 3;
        this.f24761d = fVar;
        Object objF = ad.d.f();
        if (objF == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objF == ad.d.f() ? objF : g0.f27756a;
    }

    @Override // qd.i
    public Object b(Iterator<? extends T> it, zc.f<? super g0> fVar) {
        if (!it.hasNext()) {
            return g0.f27756a;
        }
        this.f24760c = it;
        this.f24758a = 2;
        this.f24761d = fVar;
        Object objF = ad.d.f();
        if (objF == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objF == ad.d.f() ? objF : g0.f27756a;
    }

    @Override // zc.f
    public zc.j getContext() {
        return zc.k.f29181a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f24758a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.f24760c;
                t.c(it);
                if (it.hasNext()) {
                    this.f24758a = 2;
                    return true;
                }
                this.f24760c = null;
            }
            this.f24758a = 5;
            zc.f<? super g0> fVar = this.f24761d;
            t.c(fVar);
            this.f24761d = null;
            wc.r.a aVar = wc.r.f27774b;
            fVar.resumeWith(wc.r.c(g0.f27756a));
        }
    }

    public final void i(zc.f<? super g0> fVar) {
        this.f24761d = fVar;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.f24758a;
        if (i10 == 0 || i10 == 1) {
            return f();
        }
        if (i10 == 2) {
            this.f24758a = 1;
            Iterator<? extends T> it = this.f24760c;
            t.c(it);
            return it.next();
        }
        if (i10 != 3) {
            throw e();
        }
        this.f24758a = 0;
        T t10 = this.f24759b;
        this.f24759b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // zc.f
    public void resumeWith(Object obj) throws Throwable {
        wc.s.b(obj);
        this.f24758a = 4;
    }
}
