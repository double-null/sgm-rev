package io.bidmachine.media3.exoplayer.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import c8.b2;
import g8.s;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import sc.NfwM.XDucgbzInpQa;
import x7.l0;
import x7.r;

/* JADX INFO: loaded from: classes4.dex */
class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u7.l.b> f18483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f18484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f18485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f18486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f18490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x7.m<h.a> f18491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f18492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b2 f18493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p f18494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f18495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f18496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f18497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HandlerThread f18500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f18501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a8.b f18502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private DrmSession.DrmSessionException f18503u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f18504v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f18505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private m.a f18506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private m.d f18507y;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    public interface a {
        void a(Exception exc, boolean z10);

        void b();

        void c(DefaultDrmSession defaultDrmSession);
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i10);

        void b(DefaultDrmSession defaultDrmSession, int i10);
    }

    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18508a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f18511b) {
                return false;
            }
            int i10 = dVar.f18514e + 1;
            dVar.f18514e = i10;
            if (i10 > DefaultDrmSession.this.f18492j.a(3)) {
                return false;
            }
            long jC = DefaultDrmSession.this.f18492j.c(new io.bidmachine.media3.exoplayer.upstream.b.c(new n8.i(dVar.f18510a, mediaDrmCallbackException.f18559a, mediaDrmCallbackException.f18560b, mediaDrmCallbackException.f18561c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f18512c, mediaDrmCallbackException.f18562d), new n8.j(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f18514e));
            if (jC == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f18508a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jC);
                return true;
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(n8.i.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f18508a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    objA = DefaultDrmSession.this.f18494l.a(DefaultDrmSession.this.f18495m, (m.d) dVar.f18513d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    objA = DefaultDrmSession.this.f18494l.b(DefaultDrmSession.this.f18495m, (m.a) dVar.f18513d);
                }
            } catch (MediaDrmCallbackException e10) {
                boolean zA = a(message, e10);
                objA = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                r.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objA = e11;
            }
            DefaultDrmSession.this.f18492j.d(dVar.f18510a);
            synchronized (this) {
                if (!this.f18508a) {
                    DefaultDrmSession.this.f18497o.obtainMessage(message.what, Pair.create(dVar.f18513d, objA)).sendToTarget();
                }
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f18513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18514e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f18510a = j10;
            this.f18511b = z10;
            this.f18512c = j11;
            this.f18513d = obj;
        }
    }

    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                DefaultDrmSession.this.F(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                DefaultDrmSession.this.z(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, m mVar, a aVar, b bVar, List<u7.l.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, p pVar, Looper looper, io.bidmachine.media3.exoplayer.upstream.b bVar2, b2 b2Var) {
        if (i10 == 1 || i10 == 3) {
            x7.a.e(bArr);
        }
        this.f18495m = uuid;
        this.f18485c = aVar;
        this.f18486d = bVar;
        this.f18484b = mVar;
        this.f18487e = i10;
        this.f18488f = z10;
        this.f18489g = z11;
        if (bArr != null) {
            this.f18505w = bArr;
            this.f18483a = null;
        } else {
            this.f18483a = Collections.unmodifiableList((List) x7.a.e(list));
        }
        this.f18490h = map;
        this.f18494l = pVar;
        this.f18491i = new x7.m<>();
        this.f18492j = bVar2;
        this.f18493k = b2Var;
        this.f18498p = 2;
        this.f18496n = looper;
        this.f18497o = new e(looper);
    }

    private void A(Throwable th, boolean z10) {
        if ((th instanceof NotProvisionedException) || j.d(th)) {
            this.f18485c.c(this);
        } else {
            y(th, z10 ? 1 : 2);
        }
    }

    private void B() {
        if (this.f18487e == 0 && this.f18498p == 4) {
            l0.i(this.f18504v);
            s(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Object obj, Object obj2) {
        if (obj == this.f18507y) {
            if (this.f18498p == 2 || v()) {
                this.f18507y = null;
                if (obj2 instanceof Exception) {
                    this.f18485c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f18484b.e((byte[]) obj2);
                    this.f18485c.b();
                } catch (Exception e10) {
                    this.f18485c.a(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    private boolean G() {
        if (v()) {
            return true;
        }
        try {
            byte[] bArrC = this.f18484b.c();
            this.f18504v = bArrC;
            this.f18484b.g(bArrC, this.f18493k);
            this.f18502t = this.f18484b.h(this.f18504v);
            final int i10 = 3;
            this.f18498p = 3;
            r(new x7.l() { // from class: io.bidmachine.media3.exoplayer.drm.b
                @Override // x7.l
                public final void accept(Object obj) {
                    ((h.a) obj).k(i10);
                }
            });
            x7.a.e(this.f18504v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f18485c.c(this);
            return false;
        } catch (Exception e10) {
            e = e10;
            if (j.d(e)) {
                this.f18485c.c(this);
                return false;
            }
            y(e, 1);
            return false;
        } catch (NoSuchMethodError e11) {
            e = e11;
            if (j.d(e)) {
                this.f18485c.c(this);
                return false;
            }
            y(e, 1);
            return false;
        }
    }

    private void H(byte[] bArr, int i10, boolean z10) {
        try {
            this.f18506x = this.f18484b.m(bArr, this.f18483a, i10, this.f18490h);
            ((c) l0.i(this.f18501s)).b(2, x7.a.e(this.f18506x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            A(e10, true);
        }
    }

    private boolean J() {
        try {
            this.f18484b.d(this.f18504v, this.f18505w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            y(e10, 1);
            return false;
        }
    }

    private void K() {
        if (Thread.currentThread() != this.f18496n.getThread()) {
            r.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f18496n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(x7.l<h.a> lVar) {
        Iterator<h.a> it = this.f18491i.k().iterator();
        while (it.hasNext()) {
            lVar.accept(it.next());
        }
    }

    private void s(boolean z10) {
        if (this.f18489g) {
            return;
        }
        byte[] bArr = (byte[]) l0.i(this.f18504v);
        int i10 = this.f18487e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f18505w == null || J()) {
                    H(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            x7.a.e(this.f18505w);
            x7.a.e(this.f18504v);
            H(this.f18505w, 3, z10);
            return;
        }
        if (this.f18505w == null) {
            H(bArr, 1, z10);
            return;
        }
        if (this.f18498p == 4 || J()) {
            long jT = t();
            if (this.f18487e != 0 || jT > 60) {
                if (jT <= 0) {
                    y(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f18498p = 4;
                    r(new x7.l() { // from class: g8.c
                        @Override // x7.l
                        public final void accept(Object obj) {
                            ((io.bidmachine.media3.exoplayer.drm.h.a) obj).j();
                        }
                    });
                    return;
                }
            }
            r.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jT);
            H(bArr, 2, z10);
        }
    }

    private long t() {
        if (!u7.f.f26062d.equals(this.f18495m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) x7.a.e(s.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean v() {
        int i10 = this.f18498p;
        return i10 == 3 || i10 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Throwable th, h.a aVar) {
        aVar.l((Exception) th);
    }

    private void y(final Throwable th, int i10) {
        this.f18503u = new DrmSession.DrmSessionException(th, j.b(th, i10));
        r.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            r(new x7.l() { // from class: io.bidmachine.media3.exoplayer.drm.c
                @Override // x7.l
                public final void accept(Object obj) {
                    DefaultDrmSession.w(th, (h.a) obj);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!j.e(th) && !j.d(th)) {
                throw ((Error) th);
            }
        }
        if (this.f18498p != 4) {
            this.f18498p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Object obj, Object obj2) {
        if (obj == this.f18506x && v()) {
            this.f18506x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                A((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f18487e == 3) {
                    this.f18484b.l((byte[]) l0.i(this.f18505w), bArr);
                    r(new x7.l() { // from class: g8.a
                        @Override // x7.l
                        public final void accept(Object obj3) {
                            ((io.bidmachine.media3.exoplayer.drm.h.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrL = this.f18484b.l(this.f18504v, bArr);
                int i10 = this.f18487e;
                if ((i10 == 2 || (i10 == 0 && this.f18505w != null)) && bArrL != null && bArrL.length != 0) {
                    this.f18505w = bArrL;
                }
                this.f18498p = 4;
                r(new x7.l() { // from class: g8.b
                    @Override // x7.l
                    public final void accept(Object obj3) {
                        ((io.bidmachine.media3.exoplayer.drm.h.a) obj3).h();
                    }
                });
            } catch (Exception | NoSuchMethodError e10) {
                A(e10, true);
            }
        }
    }

    void C(int i10) {
        if (i10 != 2) {
            return;
        }
        B();
    }

    void D() {
        if (G()) {
            s(true);
        }
    }

    void E(Exception exc, boolean z10) {
        y(exc, z10 ? 1 : 3);
    }

    void I() {
        this.f18507y = this.f18484b.b();
        ((c) l0.i(this.f18501s)).b(1, x7.a.e(this.f18507y), true);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        K();
        return this.f18495m;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public boolean b() {
        K();
        return this.f18488f;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public final a8.b d() {
        K();
        return this.f18502t;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public Map<String, String> e() {
        K();
        byte[] bArr = this.f18504v;
        if (bArr == null) {
            return null;
        }
        return this.f18484b.a(bArr);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public void g(h.a aVar) {
        K();
        if (this.f18499q < 0) {
            r.c("DefaultDrmSession", "Session reference count less than zero: " + this.f18499q);
            this.f18499q = 0;
        }
        if (aVar != null) {
            this.f18491i.a(aVar);
        }
        int i10 = this.f18499q + 1;
        this.f18499q = i10;
        if (i10 == 1) {
            x7.a.g(this.f18498p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f18500r = handlerThread;
            handlerThread.start();
            this.f18501s = new c(this.f18500r.getLooper());
            if (G()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f18491i.c(aVar) == 1) {
            aVar.k(this.f18498p);
        }
        this.f18486d.a(this, this.f18499q);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        K();
        if (this.f18498p == 1) {
            return this.f18503u;
        }
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public boolean h(String str) {
        K();
        return this.f18484b.i((byte[]) x7.a.i(this.f18504v), str);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public final int k() {
        K();
        return this.f18498p;
    }

    public boolean u(byte[] bArr) {
        K();
        return Arrays.equals(this.f18504v, bArr);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public void f(h.a aVar) {
        K();
        int i10 = this.f18499q;
        if (i10 <= 0) {
            r.c("DefaultDrmSession", XDucgbzInpQa.eFNLrlPXf);
            return;
        }
        int i11 = i10 - 1;
        this.f18499q = i11;
        if (i11 == 0) {
            this.f18498p = 0;
            ((e) l0.i(this.f18497o)).removeCallbacksAndMessages(null);
            ((c) l0.i(this.f18501s)).c();
            this.f18501s = null;
            ((HandlerThread) l0.i(this.f18500r)).quit();
            this.f18500r = null;
            this.f18502t = null;
            this.f18503u = null;
            this.f18506x = null;
            this.f18507y = null;
            byte[] bArr = this.f18504v;
            if (bArr != null) {
                this.f18484b.j(bArr);
                this.f18504v = null;
            }
        }
        if (aVar != null) {
            this.f18491i.d(aVar);
            if (this.f18491i.c(aVar) == 0) {
                aVar.m();
            }
        }
        this.f18486d.b(this, this.f18499q);
    }
}
