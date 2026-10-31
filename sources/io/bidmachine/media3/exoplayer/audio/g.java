package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import x7.l0;

/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes4.dex */
final class g {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private boolean H;
    private long I;
    private x7.h J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f18254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f18255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f18258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f18262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f18264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f18265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f18266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f18267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f18270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f18271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f18272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f18273u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f18274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f18276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f18277y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f18278z;

    /* JADX INFO: compiled from: AudioTrackPositionTracker.java */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public g(a aVar) {
        this.f18253a = (a) x7.a.e(aVar);
        try {
            this.f18266n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f18254b = new long[10];
        this.J = x7.h.f28124a;
    }

    private boolean b() {
        return this.f18260h && ((AudioTrack) x7.a.e(this.f18255c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        if (this.f18277y != -9223372036854775807L) {
            return Math.min(this.B, f());
        }
        long jElapsedRealtime = this.J.elapsedRealtime();
        if (jElapsedRealtime - this.f18271s >= 5) {
            w(jElapsedRealtime);
            this.f18271s = jElapsedRealtime;
        }
        return this.f18272t + this.I + (this.f18273u << 32);
    }

    private long e() {
        return l0.e1(d(), this.f18259g);
    }

    private long f() {
        if (((AudioTrack) x7.a.e(this.f18255c)).getPlayState() == 2) {
            return this.A;
        }
        return this.A + l0.F(l0.g0(l0.S0(this.J.elapsedRealtime()) - this.f18277y, this.f18262j), this.f18259g);
    }

    private void l(long j10) {
        f fVar = (f) x7.a.e(this.f18258f);
        if (fVar.f(j10)) {
            long jD = fVar.d();
            long jC = fVar.c();
            long jE = e();
            if (Math.abs(jD - j10) > 5000000) {
                this.f18253a.e(jC, jD, j10, jE);
                fVar.g();
            } else if (Math.abs(l0.e1(jC, this.f18259g) - jE) <= 5000000) {
                fVar.a();
            } else {
                this.f18253a.d(jC, jD, j10, jE);
                fVar.g();
            }
        }
    }

    private void m() {
        long jNanoTime = this.J.nanoTime() / 1000;
        if (jNanoTime - this.f18265m >= 30000) {
            long jE = e();
            if (jE != 0) {
                this.f18254b[this.f18275w] = l0.l0(jE, this.f18262j) - jNanoTime;
                this.f18275w = (this.f18275w + 1) % 10;
                int i10 = this.f18276x;
                if (i10 < 10) {
                    this.f18276x = i10 + 1;
                }
                this.f18265m = jNanoTime;
                this.f18264l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f18276x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f18264l += this.f18254b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f18260h) {
            return;
        }
        l(jNanoTime);
        n(jNanoTime);
    }

    private void n(long j10) {
        Method method;
        if (!this.f18269q || (method = this.f18266n) == null || j10 - this.f18270r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) l0.i((Integer) method.invoke(x7.a.e(this.f18255c), new Object[0]))).intValue()) * 1000) - this.f18261i;
            this.f18267o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f18267o = jMax;
            if (jMax > 5000000) {
                this.f18253a.b(jMax);
                this.f18267o = 0L;
            }
        } catch (Exception unused) {
            this.f18266n = null;
        }
        this.f18270r = j10;
    }

    private static boolean o(int i10) {
        return l0.f28136a < 23 && (i10 == 5 || i10 == 6);
    }

    private void r() {
        this.f18264l = 0L;
        this.f18276x = 0;
        this.f18275w = 0;
        this.f18265m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f18263k = false;
    }

    private void w(long j10) {
        AudioTrack audioTrack = (AudioTrack) x7.a.e(this.f18255c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f18260h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f18274v = this.f18272t;
            }
            playbackHeadPosition += this.f18274v;
        }
        if (l0.f28136a <= 29) {
            if (playbackHeadPosition == 0 && this.f18272t > 0 && playState == 3) {
                if (this.f18278z == -9223372036854775807L) {
                    this.f18278z = j10;
                    return;
                }
                return;
            }
            this.f18278z = -9223372036854775807L;
        }
        long j11 = this.f18272t;
        if (j11 > playbackHeadPosition) {
            if (this.H) {
                this.I += j11;
                this.H = false;
            } else {
                this.f18273u++;
            }
        }
        this.f18272t = playbackHeadPosition;
    }

    public void a() {
        this.H = true;
        f fVar = this.f18258f;
        if (fVar != null) {
            fVar.b();
        }
    }

    public long c() {
        long jG0;
        long jMin;
        AudioTrack audioTrack = (AudioTrack) x7.a.e(this.f18255c);
        if (audioTrack.getPlayState() == 3) {
            m();
        }
        long jNanoTime = this.J.nanoTime() / 1000;
        f fVar = (f) x7.a.e(this.f18258f);
        boolean zE = fVar.e();
        if (zE) {
            jMin = l0.e1(fVar.c(), this.f18259g) + l0.g0(jNanoTime - fVar.d(), this.f18262j);
        } else {
            if (this.f18276x == 0) {
                jG0 = this.f18277y != -9223372036854775807L ? l0.e1(f(), this.f18259g) : e();
            } else {
                jG0 = l0.g0(this.f18264l + jNanoTime, this.f18262j);
            }
            long jMax = Math.max(0L, jG0 - this.f18267o);
            jMin = this.f18277y != -9223372036854775807L ? Math.min(l0.e1(this.B, this.f18259g), jMax) : jMax;
        }
        if (this.E != zE) {
            this.G = this.D;
            this.F = this.C;
        }
        long j10 = jNanoTime - this.G;
        if (j10 < 1000000) {
            long jG1 = this.F + l0.g0(j10, this.f18262j);
            long j11 = (j10 * 1000) / 1000000;
            jMin = ((jMin * j11) + ((1000 - j11) * jG1)) / 1000;
        }
        if (!this.f18263k && jMin > this.C && audioTrack.getPlayState() == 3) {
            this.f18263k = true;
            this.f18253a.c(this.J.currentTimeMillis() - l0.t1(l0.l0(l0.t1(jMin - this.C), this.f18262j)));
        }
        this.D = jNanoTime;
        this.C = jMin;
        this.E = zE;
        return jMin;
    }

    public void g(long j10) {
        this.A = d();
        this.f18277y = l0.S0(this.J.elapsedRealtime());
        this.B = j10;
    }

    public boolean h(long j10) {
        return j10 > l0.F(c(), this.f18259g) || b();
    }

    public boolean i() {
        return ((AudioTrack) x7.a.e(this.f18255c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f18278z != -9223372036854775807L && j10 > 0 && this.J.elapsedRealtime() - this.f18278z >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) x7.a.e(this.f18255c)).getPlayState();
        if (this.f18260h) {
            if (playState == 2) {
                this.f18268p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z10 = this.f18268p;
        boolean zH = h(j10);
        this.f18268p = zH;
        if (z10 && !zH && playState != 1) {
            this.f18253a.a(this.f18257e, l0.t1(this.f18261i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f18277y == -9223372036854775807L) {
            ((f) x7.a.e(this.f18258f)).h();
            return true;
        }
        this.A = d();
        return false;
    }

    public void q() {
        r();
        this.f18255c = null;
        this.f18258f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f18255c = audioTrack;
        this.f18256d = i11;
        this.f18257e = i12;
        this.f18258f = new f(audioTrack);
        this.f18259g = audioTrack.getSampleRate();
        this.f18260h = z10 && o(i10);
        boolean zG0 = l0.G0(i10);
        this.f18269q = zG0;
        this.f18261i = zG0 ? l0.e1(i12 / i11, this.f18259g) : -9223372036854775807L;
        this.f18272t = 0L;
        this.f18273u = 0L;
        this.H = false;
        this.I = 0L;
        this.f18274v = 0L;
        this.f18268p = false;
        this.f18277y = -9223372036854775807L;
        this.f18278z = -9223372036854775807L;
        this.f18270r = 0L;
        this.f18267o = 0L;
        this.f18262j = 1.0f;
    }

    public void t(float f10) {
        this.f18262j = f10;
        f fVar = this.f18258f;
        if (fVar != null) {
            fVar.h();
        }
        r();
    }

    public void u(x7.h hVar) {
        this.J = hVar;
    }

    public void v() {
        if (this.f18277y != -9223372036854775807L) {
            this.f18277y = l0.S0(this.J.elapsedRealtime());
        }
        ((f) x7.a.e(this.f18258f)).h();
    }
}
