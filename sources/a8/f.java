package a8;

import a8.e;
import io.bidmachine.media3.decoder.DecoderException;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: SimpleDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f<I extends DecoderInputBuffer, O extends e, E extends DecoderException> implements d<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f150a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I f158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E f159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f162m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f151b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f163n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f152c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f153d = new ArrayDeque<>();

    /* JADX INFO: compiled from: SimpleDecoder.java */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            f.this.v();
        }
    }

    protected f(I[] iArr, O[] oArr) {
        this.f154e = iArr;
        this.f156g = iArr.length;
        for (int i10 = 0; i10 < this.f156g; i10++) {
            ((I[]) this.f154e)[i10] = i();
        }
        this.f155f = oArr;
        this.f157h = oArr.length;
        for (int i11 = 0; i11 < this.f157h; i11++) {
            ((O[]) this.f155f)[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f150a = aVar;
        aVar.start();
    }

    private boolean h() {
        return !this.f152c.isEmpty() && this.f157h > 0;
    }

    private boolean m() throws InterruptedException {
        E e10;
        synchronized (this.f151b) {
            while (!this.f161l && !h()) {
                this.f151b.wait();
            }
            if (this.f161l) {
                return false;
            }
            I iRemoveFirst = this.f152c.removeFirst();
            O[] oArr = this.f155f;
            int i10 = this.f157h - 1;
            this.f157h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f160k;
            this.f160k = false;
            if (iRemoveFirst.j()) {
                o10.e(4);
            } else {
                o10.f147b = iRemoveFirst.f18059f;
                if (iRemoveFirst.k()) {
                    o10.e(134217728);
                }
                if (!p(iRemoveFirst.f18059f)) {
                    o10.f149d = true;
                }
                try {
                    e10 = (E) l(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) k(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) k(e12);
                }
                if (e10 != null) {
                    synchronized (this.f151b) {
                        this.f159j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f151b) {
                if (this.f160k) {
                    o10.p();
                } else if (o10.f149d) {
                    this.f162m++;
                    o10.p();
                } else {
                    o10.f148c = this.f162m;
                    this.f162m = 0;
                    this.f153d.addLast(o10);
                }
                s(iRemoveFirst);
            }
            return true;
        }
    }

    private void q() {
        if (h()) {
            this.f151b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends io.bidmachine.media3.decoder.DecoderException */
    private void r() throws E, DecoderException {
        E e10 = this.f159j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void s(I i10) {
        i10.g();
        I[] iArr = this.f154e;
        int i11 = this.f156g;
        this.f156g = i11 + 1;
        iArr[i11] = i10;
    }

    private void u(O o10) {
        o10.g();
        O[] oArr = this.f155f;
        int i10 = this.f157h;
        this.f157h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }

    @Override // a8.d
    public final void d(long j10) {
        synchronized (this.f151b) {
            x7.a.g(this.f156g == this.f154e.length || this.f160k);
            this.f163n = j10;
        }
    }

    @Override // a8.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(I i10) throws DecoderException {
        synchronized (this.f151b) {
            r();
            x7.a.a(i10 == this.f158i);
            this.f152c.addLast(i10);
            q();
            this.f158i = null;
        }
    }

    @Override // a8.d
    public final void flush() {
        synchronized (this.f151b) {
            this.f160k = true;
            this.f162m = 0;
            I i10 = this.f158i;
            if (i10 != null) {
                s(i10);
                this.f158i = null;
            }
            while (!this.f152c.isEmpty()) {
                s(this.f152c.removeFirst());
            }
            while (!this.f153d.isEmpty()) {
                this.f153d.removeFirst().p();
            }
        }
    }

    protected abstract I i();

    protected abstract O j();

    protected abstract E k(Throwable th);

    protected abstract E l(I i10, O o10, boolean z10);

    @Override // a8.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final I e() throws DecoderException {
        I i10;
        synchronized (this.f151b) {
            r();
            x7.a.g(this.f158i == null);
            int i11 = this.f156g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f154e;
                int i12 = i11 - 1;
                this.f156g = i12;
                i10 = iArr[i12];
            }
            this.f158i = i10;
        }
        return i10;
    }

    @Override // a8.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final O a() throws DecoderException {
        synchronized (this.f151b) {
            r();
            if (this.f153d.isEmpty()) {
                return null;
            }
            return this.f153d.removeFirst();
        }
    }

    protected final boolean p(long j10) {
        boolean z10;
        synchronized (this.f151b) {
            long j11 = this.f163n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    @Override // a8.d
    public void release() {
        synchronized (this.f151b) {
            this.f161l = true;
            this.f151b.notify();
        }
        try {
            this.f150a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected void t(O o10) {
        synchronized (this.f151b) {
            u(o10);
            q();
        }
    }

    protected final void w(int i10) {
        x7.a.g(this.f156g == this.f154e.length);
        for (I i11 : this.f154e) {
            i11.q(i10);
        }
    }
}
