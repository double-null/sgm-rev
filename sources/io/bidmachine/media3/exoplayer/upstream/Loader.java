package io.bidmachine.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import r8.k;
import x7.h0;
import x7.l;
import x7.l0;
import x7.r;

/* JADX INFO: loaded from: classes4.dex */
public final class Loader implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f19786d = h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f19787e = h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f19788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f19789g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s8.a f19790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d<? extends e> f19791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f19792c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f19794b;

        public boolean c() {
            int i10 = this.f19793a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f19793a = i10;
            this.f19794b = j10;
        }
    }

    private final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f19796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f19797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b<T> f19798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f19799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f19800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f19801g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f19802h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f19803i;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f19796b = t10;
            this.f19798d = bVar;
            this.f19795a = i10;
            this.f19797c = j10;
        }

        private void c() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) x7.a.e(this.f19798d)).n(this.f19796b, jElapsedRealtime, jElapsedRealtime - this.f19797c, this.f19800f);
            this.f19799e = null;
            Loader.this.f19790a.execute((Runnable) x7.a.e(Loader.this.f19791b));
        }

        private void d() {
            Loader.this.f19791b = null;
        }

        private long e() {
            return Math.min((this.f19800f - 1) * 1000, Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
        }

        public void a(boolean z10) {
            this.f19803i = z10;
            this.f19799e = null;
            if (hasMessages(1)) {
                this.f19802h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    this.f19802h = true;
                    this.f19796b.b();
                    Thread thread = this.f19801g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                d();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) x7.a.e(this.f19798d)).o(this.f19796b, jElapsedRealtime, jElapsedRealtime - this.f19797c, true);
                this.f19798d = null;
            }
        }

        public void f(int i10) throws IOException {
            IOException iOException = this.f19799e;
            if (iOException != null && this.f19800f > i10) {
                throw iOException;
            }
        }

        public void g(long j10) {
            x7.a.g(Loader.this.f19791b == null);
            Loader.this.f19791b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                c();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f19803i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            d();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f19797c;
            b bVar = (b) x7.a.e(this.f19798d);
            if (this.f19802h) {
                bVar.o(this.f19796b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.m(this.f19796b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    r.d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f19792c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f19799e = iOException;
            int i12 = this.f19800f + 1;
            this.f19800f = i12;
            c cVarS = bVar.s(this.f19796b, jElapsedRealtime, j10, iOException, i12);
            if (cVarS.f19793a == 3) {
                Loader.this.f19792c = this.f19799e;
            } else if (cVarS.f19793a != 2) {
                if (cVarS.f19793a == 1) {
                    this.f19800f = 1;
                }
                g(cVarS.f19794b != -9223372036854775807L ? cVarS.f19794b : e());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f19802h;
                    this.f19801g = Thread.currentThread();
                }
                if (z10) {
                    h0.a("load:" + this.f19796b.getClass().getSimpleName());
                    try {
                        this.f19796b.load();
                        h0.b();
                    } catch (Throwable th) {
                        h0.b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f19801g = null;
                    Thread.interrupted();
                }
                if (this.f19803i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f19803i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f19803i) {
                    r.d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f19803i) {
                    return;
                }
                r.d("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(3, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f19803i) {
                    return;
                }
                r.d("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(3, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }
    }

    public interface e {
        void b();

        void load() throws IOException;
    }

    public interface f {
        void p();
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f19805a;

        public g(f fVar) {
            this.f19805a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19805a.p();
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f19788f = new c(2, j10);
        f19789g = new c(3, j10);
    }

    public Loader(String str) {
        this(s8.a.H(l0.T0("ExoPlayer:Loader:" + str), new l() { // from class: r8.j
            @Override // x7.l
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // r8.k
    public void a() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) x7.a.i(this.f19791b)).a(false);
    }

    public void g() {
        this.f19792c = null;
    }

    public boolean i() {
        return this.f19792c != null;
    }

    public boolean j() {
        return this.f19791b != null;
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f19792c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f19791b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f19795a;
            }
            dVar.f(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f19791b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f19790a.execute(new g(fVar));
        }
        this.f19790a.release();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) x7.a.i(Looper.myLooper());
        this.f19792c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).g(0L);
        return jElapsedRealtime;
    }

    public Loader(s8.a aVar) {
        this.f19790a = aVar;
    }

    public interface b<T extends e> {
        void m(T t10, long j10, long j11);

        void o(T t10, long j10, long j11, boolean z10);

        c s(T t10, long j10, long j11, IOException iOException, int i10);

        default void n(T t10, long j10, long j11, int i10) {
        }
    }
}
