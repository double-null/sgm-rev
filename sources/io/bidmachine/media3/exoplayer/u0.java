package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.adjust.sdk.network.ErrorCodes;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import io.bidmachine.media3.common.IllegalSeekPositionException;
import io.bidmachine.media3.common.PriorityTaskManager;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes4.dex */
final class u0 extends u7.e implements ExoPlayer {
    private final d A;
    private final io.bidmachine.media3.exoplayer.d B;
    private final o2 C;
    private final t2 D;
    private final w2 E;
    private final long F;
    private final q2 G;
    private final x7.f<Integer> H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private boolean M;
    private b8.a0 N;
    private n8.t O;
    private ExoPlayer.c P;
    private boolean Q;
    private u7.y.b R;
    private u7.u S;
    private u7.u T;
    private u7.q U;
    private u7.q V;
    private Object W;
    private Surface X;
    private SurfaceHolder Y;
    private u8.l Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f19721a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final q8.w f19722b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TextureView f19723b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final u7.y.b f19724c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f19725c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x7.k f19726d = new x7.k();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f19727d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f19728e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private x7.c0 f19729e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u7.y f19730f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private b8.b f19731f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h2[] f19732g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private b8.b f19733g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h2[] f19734h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private u7.c f19735h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q8.v f19736i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f19737i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x7.n f19738j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f19739j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i1.f f19740k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private w7.b f19741k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i1 f19742l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f19743l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final x7.q<u7.y.d> f19744m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f19745m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArraySet<ExoPlayer.a> f19746n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f19747n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final u7.d0.b f19748o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private PriorityTaskManager f19749o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<e> f19750p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f19751p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f19752q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f19753q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.source.r.a f19754r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private u7.k f19755r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c8.a f19756s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private u7.l0 f19757s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Looper f19758t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private u7.u f19759t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final r8.d f19760u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private e2 f19761u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f19762v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f19763v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f19764w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f19765w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f19766x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private long f19767x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final x7.h f19768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final c f19769z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    static final class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(Context context, boolean z10, u0 u0Var, c8.b2 b2Var) {
            c8.z1 z1VarE0 = c8.z1.E0(context);
            if (z1VarE0 == null) {
                x7.r.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z10) {
                u0Var.r1(z1VarE0);
            }
            b2Var.b(z1VarE0.L0());
        }

        public static void c(final Context context, final u0 u0Var, final boolean z10, final c8.b2 b2Var) {
            u0Var.D1().b(u0Var.H1(), null).i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.v0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.b.b(context, z10, u0Var, b2Var);
                }
            });
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    private static final class d implements t8.h, u8.a, f2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private t8.h f19771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u8.a f19772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t8.h f19773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u8.a f19774d;

        private d() {
        }

        @Override // t8.h
        public void a(long j10, long j11, u7.q qVar, MediaFormat mediaFormat) {
            t8.h hVar = this.f19773c;
            if (hVar != null) {
                hVar.a(j10, j11, qVar, mediaFormat);
            }
            t8.h hVar2 = this.f19771a;
            if (hVar2 != null) {
                hVar2.a(j10, j11, qVar, mediaFormat);
            }
        }

        @Override // u8.a
        public void c(long j10, float[] fArr) {
            u8.a aVar = this.f19774d;
            if (aVar != null) {
                aVar.c(j10, fArr);
            }
            u8.a aVar2 = this.f19772b;
            if (aVar2 != null) {
                aVar2.c(j10, fArr);
            }
        }

        @Override // u8.a
        public void e() {
            u8.a aVar = this.f19774d;
            if (aVar != null) {
                aVar.e();
            }
            u8.a aVar2 = this.f19772b;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.f2.b
        public void z(int i10, Object obj) {
            if (i10 == 7) {
                this.f19771a = (t8.h) obj;
                return;
            }
            if (i10 == 8) {
                this.f19772b = (u8.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            u8.l lVar = (u8.l) obj;
            if (lVar == null) {
                this.f19773c = null;
                this.f19774d = null;
            } else {
                this.f19773c = lVar.getVideoFrameMetadataListener();
                this.f19774d = lVar.getCameraMotionListener();
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    private static final class e implements p1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f19775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.bidmachine.media3.exoplayer.source.r f19776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u7.d0 f19777c;

        public e(Object obj, io.bidmachine.media3.exoplayer.source.p pVar) {
            this.f19775a = obj;
            this.f19776b = pVar;
            this.f19777c = pVar.W();
        }

        @Override // io.bidmachine.media3.exoplayer.p1
        public Object a() {
            return this.f19775a;
        }

        @Override // io.bidmachine.media3.exoplayer.p1
        public u7.d0 b() {
            return this.f19777c;
        }

        public void c(u7.d0 d0Var) {
            this.f19777c = d0Var;
        }
    }

    static {
        u7.t.a("media3.exoplayer");
    }

    public u0(ExoPlayer.b bVar, u7.y yVar) {
        try {
            x7.r.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + x7.l0.f28140e + "]");
            this.f19728e = bVar.f18072a.getApplicationContext();
            this.f19756s = bVar.f18080i.apply(bVar.f18073b);
            this.f19747n0 = bVar.f18082k;
            this.f19749o0 = bVar.f18083l;
            this.f19735h0 = bVar.f18084m;
            this.f19725c0 = bVar.f18090s;
            this.f19727d0 = bVar.f18091t;
            this.f19739j0 = bVar.f18088q;
            this.F = bVar.B;
            c cVar = new c();
            this.f19769z = cVar;
            this.A = new d();
            Handler handler = new Handler(bVar.f18081j);
            b8.z zVar = bVar.f18075d.get();
            h2[] h2VarArrA = zVar.a(handler, cVar, cVar, cVar, cVar);
            this.f19732g = h2VarArrA;
            x7.a.g(h2VarArrA.length > 0);
            this.f19734h = new h2[h2VarArrA.length];
            int i10 = 0;
            while (true) {
                h2[] h2VarArr = this.f19734h;
                if (i10 >= h2VarArr.length) {
                    break;
                }
                h2 h2Var = this.f19732g[i10];
                c cVar2 = this.f19769z;
                h2VarArr[i10] = zVar.b(h2Var, handler, cVar2, cVar2, cVar2, cVar2);
                i10++;
            }
            q8.v vVar = bVar.f18077f.get();
            this.f19736i = vVar;
            this.f19754r = bVar.f18076e.get();
            r8.d dVar = bVar.f18079h.get();
            this.f19760u = dVar;
            this.f19752q = bVar.f18092u;
            this.N = bVar.f18093v;
            this.f19762v = bVar.f18094w;
            this.f19764w = bVar.f18095x;
            this.f19766x = bVar.f18096y;
            this.Q = bVar.C;
            Looper looper = bVar.f18081j;
            this.f19758t = looper;
            x7.h hVar = bVar.f18073b;
            this.f19768y = hVar;
            u7.y yVar2 = yVar == null ? this : yVar;
            this.f19730f = yVar2;
            this.f19744m = new x7.q<>(looper, hVar, new x7.q.b() { // from class: io.bidmachine.media3.exoplayer.y
                @Override // x7.q.b
                public final void a(Object obj, u7.o oVar) {
                    this.f20005a.O1((u7.y.d) obj, oVar);
                }
            });
            this.f19746n = new CopyOnWriteArraySet<>();
            this.f19750p = new ArrayList();
            this.O = new n8.t.a(0);
            this.P = ExoPlayer.c.f18098b;
            h2[] h2VarArr2 = this.f19732g;
            q8.w wVar = new q8.w(new b8.y[h2VarArr2.length], new q8.q[h2VarArr2.length], u7.h0.f26166b, null);
            this.f19722b = wVar;
            this.f19748o = new u7.d0.b();
            u7.y.b bVarE = new u7.y.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, vVar.h()).d(23, bVar.f18089r).d(25, bVar.f18089r).d(33, bVar.f18089r).d(26, bVar.f18089r).d(34, bVar.f18089r).e();
            this.f19724c = bVarE;
            this.R = new u7.y.b.a().b(bVarE).a(4).a(10).e();
            this.f19738j = hVar.b(looper, null);
            i1.f fVar = new i1.f() { // from class: io.bidmachine.media3.exoplayer.z
                @Override // io.bidmachine.media3.exoplayer.i1.f
                public final void a(i1.e eVar) {
                    this.f20010a.Q1(eVar);
                }
            };
            this.f19740k = fVar;
            this.f19761u0 = e2.k(wVar);
            this.f19756s.E(yVar2, looper);
            c8.b2 b2Var = new c8.b2(bVar.H);
            i1 i1Var = new i1(this.f19728e, this.f19732g, this.f19734h, vVar, wVar, bVar.f18078g.get(), dVar, this.I, this.J, this.f19756s, this.N, bVar.f18097z, bVar.A, this.Q, bVar.I, looper, hVar, fVar, b2Var, bVar.E, this.P);
            this.f19742l = i1Var;
            Looper looperL = i1Var.L();
            this.f19737i0 = 1.0f;
            this.I = 0;
            u7.u uVar = u7.u.I;
            this.S = uVar;
            this.T = uVar;
            this.f19759t0 = uVar;
            this.f19763v0 = -1;
            this.f19741k0 = w7.b.f27577c;
            this.f19743l0 = true;
            i(this.f19756s);
            dVar.g(new Handler(looper), this.f19756s);
            s1(this.f19769z);
            long j10 = bVar.f18074c;
            if (j10 > 0) {
                i1Var.F(j10);
            }
            if (x7.l0.f28136a >= 31) {
                b.c(this.f19728e, this, bVar.D, b2Var);
            }
            x7.f<Integer> fVar2 = new x7.f<>(0, looperL, looper, hVar, new x7.f.a() { // from class: io.bidmachine.media3.exoplayer.a0
                @Override // x7.f.a
                public final void a(Object obj, Object obj2) {
                    this.f18102a.r2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.H = fVar2;
            fVar2.h(new Runnable() { // from class: io.bidmachine.media3.exoplayer.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18308a.R1();
                }
            });
            io.bidmachine.media3.exoplayer.d dVar2 = new io.bidmachine.media3.exoplayer.d(bVar.f18072a, looperL, bVar.f18081j, this.f19769z, hVar);
            this.B = dVar2;
            dVar2.f(bVar.f18087p);
            if (bVar.G) {
                q2 q2Var = bVar.J;
                this.G = q2Var;
                q2Var.b(new q2.a() { // from class: io.bidmachine.media3.exoplayer.c0
                    @Override // io.bidmachine.media3.exoplayer.q2.a
                    public final void a(boolean z10) {
                        this.f18318a.s2(z10);
                    }
                }, this.f19728e, looper, looperL, hVar);
            } else {
                this.G = null;
            }
            if (bVar.f18089r) {
                this.C = new o2(bVar.f18072a, this.f19769z, this.f19735h0.b(), looperL, looper, hVar);
            } else {
                this.C = null;
            }
            t2 t2Var = new t2(bVar.f18072a, looperL, hVar);
            this.D = t2Var;
            t2Var.e(bVar.f18086o != 0);
            w2 w2Var = new w2(bVar.f18072a, looperL, hVar);
            this.E = w2Var;
            w2Var.e(bVar.f18086o == 2);
            this.f19755r0 = u7.k.f26180e;
            this.f19757s0 = u7.l0.f26202e;
            this.f19729e0 = x7.c0.f28098c;
            i1Var.d1(this.f19735h0, bVar.f18085n);
            w2(1, 3, this.f19735h0);
            w2(2, 4, Integer.valueOf(this.f19725c0));
            w2(2, 5, Integer.valueOf(this.f19727d0));
            w2(1, 9, Boolean.valueOf(this.f19739j0));
            w2(2, 7, this.A);
            w2(6, 8, this.A);
            x2(16, Integer.valueOf(this.f19747n0));
        } finally {
            this.f19726d.e();
        }
    }

    private List<io.bidmachine.media3.exoplayer.source.r> A1(List<u7.s> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f19754r.f(list.get(i10)));
        }
        return arrayList;
    }

    private void A2(SurfaceHolder surfaceHolder) {
        this.f19721a0 = false;
        this.Y = surfaceHolder;
        surfaceHolder.addCallback(this.f19769z);
        Surface surface = this.Y.getSurface();
        if (surface == null || !surface.isValid()) {
            q2(0, 0);
        } else {
            Rect surfaceFrame = this.Y.getSurfaceFrame();
            q2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private f2 B1(f2.b bVar) {
        int iG1 = G1(this.f19761u0);
        i1 i1Var = this.f19742l;
        u7.d0 d0Var = this.f19761u0.f18602a;
        if (iG1 == -1) {
            iG1 = 0;
        }
        return new f2(i1Var, bVar, d0Var, iG1, this.f19768y, i1Var.L());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        C2(surface);
        this.X = surface;
    }

    private Pair<Boolean, Integer> C1(e2 e2Var, e2 e2Var2, boolean z10, int i10, boolean z11, boolean z12) {
        u7.d0 d0Var = e2Var2.f18602a;
        u7.d0 d0Var2 = e2Var.f18602a;
        if (d0Var2.q() && d0Var.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (d0Var2.q() != d0Var.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (d0Var.n(d0Var.h(e2Var2.f18603b.f19684a, this.f19748o).f26020c, this.f26051a).f26035a.equals(d0Var2.n(d0Var2.h(e2Var.f18603b.f19684a, this.f19748o).f26020c, this.f26051a).f26035a)) {
            if (z10 && i10 == 0 && e2Var2.f18603b.f19687d < e2Var.f18603b.f19687d) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C2(Object obj) {
        Object obj2 = this.W;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zX1 = this.f19742l.x1(obj, z10 ? this.F : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.W;
            Surface surface = this.X;
            if (obj3 == surface) {
                surface.release();
                this.X = null;
            }
        }
        this.W = obj;
        if (zX1) {
            return;
        }
        E2(ExoPlaybackException.f(new ExoTimeoutException(3), ErrorCodes.MALFORMED_URL_EXCEPTION));
    }

    private long E1(e2 e2Var) {
        if (!e2Var.f18603b.b()) {
            return x7.l0.t1(F1(e2Var));
        }
        e2Var.f18602a.h(e2Var.f18603b.f19684a, this.f19748o);
        return e2Var.f18604c == -9223372036854775807L ? e2Var.f18602a.n(G1(e2Var), this.f26051a).b() : this.f19748o.m() + x7.l0.t1(e2Var.f18604c);
    }

    private void E2(ExoPlaybackException exoPlaybackException) {
        e2 e2Var = this.f19761u0;
        e2 e2VarC = e2Var.c(e2Var.f18603b);
        e2VarC.f18618q = e2VarC.f18620s;
        e2VarC.f18619r = 0L;
        e2 e2VarN2 = n2(e2VarC, 1);
        if (exoPlaybackException != null) {
            e2VarN2 = e2VarN2.f(exoPlaybackException);
        }
        this.K++;
        this.f19742l.H1();
        H2(e2VarN2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private long F1(e2 e2Var) {
        if (e2Var.f18602a.q()) {
            return x7.l0.S0(this.f19767x0);
        }
        long jM = e2Var.f18617p ? e2Var.m() : e2Var.f18620s;
        return e2Var.f18603b.b() ? jM : t2(e2Var.f18602a, e2Var.f18603b, jM);
    }

    private void F2() {
        u7.y.b bVar = this.R;
        u7.y.b bVarO = x7.l0.O(this.f19730f, this.f19724c);
        this.R = bVarO;
        if (bVarO.equals(bVar)) {
            return;
        }
        this.f19744m.i(13, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.g0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                this.f18650a.Y1((u7.y.d) obj);
            }
        });
    }

    private int G1(e2 e2Var) {
        return e2Var.f18602a.q() ? this.f19763v0 : e2Var.f18602a.h(e2Var.f18603b.f19684a, this.f19748o).f26020c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2(boolean z10, int i10) {
        int iX1 = x1(z10);
        e2 e2VarA = this.f19761u0;
        if (e2VarA.f18613l == z10 && e2VarA.f18615n == iX1 && e2VarA.f18614m == i10) {
            return;
        }
        this.K++;
        if (e2VarA.f18617p) {
            e2VarA = e2VarA.a();
        }
        e2 e2VarE = e2VarA.e(z10, i10, iX1);
        this.f19742l.l1(z10, i10, iX1);
        H2(e2VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void H2(final e2 e2Var, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        e2 e2Var2 = this.f19761u0;
        this.f19761u0 = e2Var;
        boolean z12 = !e2Var2.f18602a.equals(e2Var.f18602a);
        Pair<Boolean, Integer> pairC1 = C1(e2Var, e2Var2, z10, i11, z12, z11);
        boolean zBooleanValue = ((Boolean) pairC1.first).booleanValue();
        final int iIntValue = ((Integer) pairC1.second).intValue();
        final u7.s sVar = null;
        if (zBooleanValue) {
            if (!e2Var.f18602a.q()) {
                sVar = e2Var.f18602a.n(e2Var.f18602a.h(e2Var.f18603b.f19684a, this.f19748o).f26020c, this.f26051a).f26037c;
            }
            this.f19759t0 = u7.u.I;
        }
        if (zBooleanValue || !e2Var2.f18611j.equals(e2Var.f18611j)) {
            this.f19759t0 = this.f19759t0.a().M(e2Var.f18611j).J();
        }
        u7.u uVarU1 = u1();
        boolean z13 = !uVarU1.equals(this.S);
        this.S = uVarU1;
        boolean z14 = e2Var2.f18613l != e2Var.f18613l;
        boolean z15 = e2Var2.f18606e != e2Var.f18606e;
        if (z15 || z14) {
            J2();
        }
        boolean z16 = e2Var2.f18608g;
        boolean z17 = e2Var.f18608g;
        boolean z18 = z16 != z17;
        if (z18) {
            I2(z17);
        }
        if (z12) {
            this.f19744m.i(0, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.s
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.Z1(e2Var, i10, (u7.y.d) obj);
                }
            });
        }
        if (z10) {
            final u7.y.e eVarJ1 = J1(i11, e2Var2, i12);
            final u7.y.e eVarI1 = I1(j10);
            this.f19744m.i(11, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.p0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.a2(i11, eVarJ1, eVarI1, (u7.y.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f19744m.i(1, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.q0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).N(sVar, iIntValue);
                }
            });
        }
        if (e2Var2.f18607f != e2Var.f18607f) {
            this.f19744m.i(10, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.r0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.c2(e2Var, (u7.y.d) obj);
                }
            });
            if (e2Var.f18607f != null) {
                this.f19744m.i(10, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.s0
                    @Override // x7.q.a
                    public final void invoke(Object obj) {
                        u0.d2(e2Var, (u7.y.d) obj);
                    }
                });
            }
        }
        q8.w wVar = e2Var2.f18610i;
        q8.w wVar2 = e2Var.f18610i;
        if (wVar != wVar2) {
            this.f19736i.i(wVar2.f24615e);
            this.f19744m.i(2, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.t0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.e2(e2Var, (u7.y.d) obj);
                }
            });
        }
        if (z13) {
            final u7.u uVar = this.S;
            this.f19744m.i(14, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.t
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).W(uVar);
                }
            });
        }
        if (z18) {
            this.f19744m.i(3, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.u
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.g2(e2Var, (u7.y.d) obj);
                }
            });
        }
        if (z15 || z14) {
            this.f19744m.i(-1, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.v
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.h2(e2Var, (u7.y.d) obj);
                }
            });
        }
        if (z15) {
            this.f19744m.i(4, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.w
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.i2(e2Var, (u7.y.d) obj);
                }
            });
        }
        if (z14 || e2Var2.f18614m != e2Var.f18614m) {
            this.f19744m.i(5, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.d0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.j2(e2Var, (u7.y.d) obj);
                }
            });
        }
        if (e2Var2.f18615n != e2Var.f18615n) {
            this.f19744m.i(6, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.m0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.k2(e2Var, (u7.y.d) obj);
                }
            });
        }
        if (e2Var2.n() != e2Var.n()) {
            this.f19744m.i(7, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.n0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.l2(e2Var, (u7.y.d) obj);
                }
            });
        }
        if (!e2Var2.f18616o.equals(e2Var.f18616o)) {
            this.f19744m.i(12, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.o0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.m2(e2Var, (u7.y.d) obj);
                }
            });
        }
        F2();
        this.f19744m.f();
        if (e2Var2.f18617p != e2Var.f18617p) {
            Iterator<ExoPlayer.a> it = this.f19746n.iterator();
            while (it.hasNext()) {
                it.next().F(e2Var.f18617p);
            }
        }
    }

    private u7.y.e I1(long j10) {
        u7.s sVar;
        Object obj;
        int iB;
        Object obj2;
        int iS = S();
        if (this.f19761u0.f18602a.q()) {
            sVar = null;
            obj = null;
            iB = -1;
            obj2 = null;
        } else {
            e2 e2Var = this.f19761u0;
            Object obj3 = e2Var.f18603b.f19684a;
            e2Var.f18602a.h(obj3, this.f19748o);
            iB = this.f19761u0.f18602a.b(obj3);
            obj = obj3;
            obj2 = this.f19761u0.f18602a.n(iS, this.f26051a).f26035a;
            sVar = this.f26051a.f26037c;
        }
        long jT1 = x7.l0.t1(j10);
        long jT2 = this.f19761u0.f18603b.b() ? x7.l0.t1(K1(this.f19761u0)) : jT1;
        io.bidmachine.media3.exoplayer.source.r.b bVar = this.f19761u0.f18603b;
        return new u7.y.e(obj2, iS, sVar, obj, iB, jT1, jT2, bVar.f19685b, bVar.f19686c);
    }

    private void I2(boolean z10) {
        PriorityTaskManager priorityTaskManager = this.f19749o0;
        if (priorityTaskManager != null) {
            if (z10 && !this.f19751p0) {
                priorityTaskManager.a(this.f19747n0);
                this.f19751p0 = true;
            } else {
                if (z10 || !this.f19751p0) {
                    return;
                }
                priorityTaskManager.b(this.f19747n0);
                this.f19751p0 = false;
            }
        }
    }

    private u7.y.e J1(int i10, e2 e2Var, int i11) {
        int i12;
        Object obj;
        u7.s sVar;
        Object obj2;
        int i13;
        long jK1;
        long jK2;
        u7.d0.b bVar = new u7.d0.b();
        if (e2Var.f18602a.q()) {
            i12 = i11;
            obj = null;
            sVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = e2Var.f18603b.f19684a;
            e2Var.f18602a.h(obj3, bVar);
            int i14 = bVar.f26020c;
            int iB = e2Var.f18602a.b(obj3);
            Object obj4 = e2Var.f18602a.n(i14, this.f26051a).f26035a;
            sVar = this.f26051a.f26037c;
            obj2 = obj3;
            i13 = iB;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (e2Var.f18603b.b()) {
                io.bidmachine.media3.exoplayer.source.r.b bVar2 = e2Var.f18603b;
                jK1 = bVar.b(bVar2.f19685b, bVar2.f19686c);
                jK2 = K1(e2Var);
            } else {
                jK1 = e2Var.f18603b.f19688e != -1 ? K1(this.f19761u0) : bVar.f26022e + bVar.f26021d;
                jK2 = jK1;
            }
        } else if (e2Var.f18603b.b()) {
            jK1 = e2Var.f18620s;
            jK2 = K1(e2Var);
        } else {
            jK1 = bVar.f26022e + e2Var.f18620s;
            jK2 = jK1;
        }
        long jT1 = x7.l0.t1(jK1);
        long jT2 = x7.l0.t1(jK2);
        io.bidmachine.media3.exoplayer.source.r.b bVar3 = e2Var.f18603b;
        return new u7.y.e(obj, i12, sVar, obj2, i13, jT1, jT2, bVar3.f19685b, bVar3.f19686c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J2() {
        int iR = R();
        if (iR != 1) {
            if (iR == 2 || iR == 3) {
                this.D.f(D() && !M1());
                this.E.f(D());
                return;
            } else if (iR != 4) {
                throw new IllegalStateException();
            }
        }
        this.D.f(false);
        this.E.f(false);
    }

    private static long K1(e2 e2Var) {
        u7.d0.c cVar = new u7.d0.c();
        u7.d0.b bVar = new u7.d0.b();
        e2Var.f18602a.h(e2Var.f18603b.f19684a, bVar);
        return e2Var.f18604c == -9223372036854775807L ? e2Var.f18602a.n(bVar.f26020c, cVar).c() : bVar.n() + e2Var.f18604c;
    }

    private void K2() {
        this.f19726d.b();
        if (Thread.currentThread() != v().getThread()) {
            String strG = x7.l0.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), v().getThread().getName());
            if (this.f19743l0) {
                throw new IllegalStateException(strG);
            }
            x7.r.i("ExoPlayerImpl", strG, this.f19745m0 ? null : new IllegalStateException());
            this.f19745m0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
    public void P1(i1.e eVar) {
        long jT2;
        int i10 = this.K - eVar.f19073c;
        this.K = i10;
        boolean z10 = true;
        if (eVar.f19074d) {
            this.L = eVar.f19075e;
            this.M = true;
        }
        if (i10 == 0) {
            u7.d0 d0Var = eVar.f19072b.f18602a;
            if (!this.f19761u0.f18602a.q() && d0Var.q()) {
                this.f19763v0 = -1;
                this.f19767x0 = 0L;
                this.f19765w0 = 0;
            }
            if (!d0Var.q()) {
                List<u7.d0> listF = ((g2) d0Var).F();
                x7.a.g(listF.size() == this.f19750p.size());
                for (int i11 = 0; i11 < listF.size(); i11++) {
                    this.f19750p.get(i11).c(listF.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.M) {
                if (eVar.f19072b.f18603b.equals(this.f19761u0.f18603b) && eVar.f19072b.f18605d == this.f19761u0.f18620s) {
                    z10 = false;
                }
                if (z10) {
                    if (d0Var.q() || eVar.f19072b.f18603b.b()) {
                        jT2 = eVar.f19072b.f18605d;
                    } else {
                        e2 e2Var = eVar.f19072b;
                        jT2 = t2(d0Var, e2Var.f18603b, e2Var.f18605d);
                    }
                    j10 = jT2;
                }
            } else {
                z10 = false;
            }
            this.M = false;
            H2(eVar.f19072b, 1, z10, this.L, j10, -1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1(u7.y.d dVar, u7.o oVar) {
        dVar.C(this.f19730f, new u7.y.c(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q1(final i1.e eVar) {
        this.f19738j.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18678a.P1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R1() {
        this.H.i(Integer.valueOf(x7.l0.J(this.f19728e)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T1(u7.y.d dVar) {
        dVar.P(ExoPlaybackException.f(new ExoTimeoutException(1), ErrorCodes.MALFORMED_URL_EXCEPTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1(u7.y.d dVar) {
        dVar.i0(this.R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z1(e2 e2Var, int i10, u7.y.d dVar) {
        dVar.S(e2Var.f18602a, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a2(int i10, u7.y.e eVar, u7.y.e eVar2, u7.y.d dVar) {
        dVar.X(i10);
        dVar.Y(eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c2(e2 e2Var, u7.y.d dVar) {
        dVar.e0(e2Var.f18607f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d2(e2 e2Var, u7.y.d dVar) {
        dVar.P(e2Var.f18607f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e2(e2 e2Var, u7.y.d dVar) {
        dVar.G(e2Var.f18610i.f24614d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g2(e2 e2Var, u7.y.d dVar) {
        dVar.D(e2Var.f18608g);
        dVar.a0(e2Var.f18608g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h2(e2 e2Var, u7.y.d dVar) {
        dVar.j0(e2Var.f18613l, e2Var.f18606e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i2(e2 e2Var, u7.y.d dVar) {
        dVar.I(e2Var.f18606e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j2(e2 e2Var, u7.y.d dVar) {
        dVar.n0(e2Var.f18613l, e2Var.f18614m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k2(e2 e2Var, u7.y.d dVar) {
        dVar.B(e2Var.f18615n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l2(e2 e2Var, u7.y.d dVar) {
        dVar.q0(e2Var.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m2(e2 e2Var, u7.y.d dVar) {
        dVar.x(e2Var.f18616o);
    }

    private static e2 n2(e2 e2Var, int i10) {
        e2 e2VarH = e2Var.h(i10);
        return (i10 == 1 || i10 == 4) ? e2VarH.b(false) : e2VarH;
    }

    private e2 o2(e2 e2Var, u7.d0 d0Var, Pair<Object, Long> pair) {
        x7.a.a(d0Var.q() || pair != null);
        u7.d0 d0Var2 = e2Var.f18602a;
        long jE1 = E1(e2Var);
        e2 e2VarJ = e2Var.j(d0Var);
        if (d0Var.q()) {
            io.bidmachine.media3.exoplayer.source.r.b bVarL = e2.l();
            long jS0 = x7.l0.S0(this.f19767x0);
            e2 e2VarC = e2VarJ.d(bVarL, jS0, jS0, jS0, 0L, n8.x.f22835d, this.f19722b, com.google.common.collect.u.H()).c(bVarL);
            e2VarC.f18618q = e2VarC.f18620s;
            return e2VarC;
        }
        Object obj = e2VarJ.f18603b.f19684a;
        boolean z10 = !obj.equals(((Pair) x7.l0.i(pair)).first);
        io.bidmachine.media3.exoplayer.source.r.b bVar = z10 ? new io.bidmachine.media3.exoplayer.source.r.b(pair.first) : e2VarJ.f18603b;
        long jLongValue = ((Long) pair.second).longValue();
        long jS1 = x7.l0.S0(jE1);
        if (!d0Var2.q()) {
            jS1 -= d0Var2.h(obj, this.f19748o).n();
        }
        if (z10 || jLongValue < jS1) {
            x7.a.g(!bVar.b());
            e2 e2VarC2 = e2VarJ.d(bVar, jLongValue, jLongValue, jLongValue, 0L, z10 ? n8.x.f22835d : e2VarJ.f18609h, z10 ? this.f19722b : e2VarJ.f18610i, z10 ? com.google.common.collect.u.H() : e2VarJ.f18611j).c(bVar);
            e2VarC2.f18618q = jLongValue;
            return e2VarC2;
        }
        if (jLongValue == jS1) {
            int iB = d0Var.b(e2VarJ.f18612k.f19684a);
            if (iB == -1 || d0Var.f(iB, this.f19748o).f26020c != d0Var.h(bVar.f19684a, this.f19748o).f26020c) {
                d0Var.h(bVar.f19684a, this.f19748o);
                long jB = bVar.b() ? this.f19748o.b(bVar.f19685b, bVar.f19686c) : this.f19748o.f26021d;
                e2VarJ = e2VarJ.d(bVar, e2VarJ.f18620s, e2VarJ.f18620s, e2VarJ.f18605d, jB - e2VarJ.f18620s, e2VarJ.f18609h, e2VarJ.f18610i, e2VarJ.f18611j).c(bVar);
                e2VarJ.f18618q = jB;
            }
        } else {
            x7.a.g(!bVar.b());
            long jMax = Math.max(0L, e2VarJ.f18619r - (jLongValue - jS1));
            long j10 = e2VarJ.f18618q;
            if (e2VarJ.f18612k.equals(e2VarJ.f18603b)) {
                j10 = jLongValue + jMax;
            }
            e2VarJ = e2VarJ.d(bVar, jLongValue, jLongValue, jLongValue, jMax, e2VarJ.f18609h, e2VarJ.f18610i, e2VarJ.f18611j);
            e2VarJ.f18618q = j10;
        }
        return e2VarJ;
    }

    private Pair<Object, Long> p2(u7.d0 d0Var, int i10, long j10) {
        if (d0Var.q()) {
            this.f19763v0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f19767x0 = j10;
            this.f19765w0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= d0Var.p()) {
            i10 = d0Var.a(this.J);
            j10 = d0Var.n(i10, this.f26051a).b();
        }
        return d0Var.j(this.f26051a, this.f19748o, i10, x7.l0.S0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q2(final int i10, final int i11) {
        if (i10 == this.f19729e0.b() && i11 == this.f19729e0.a()) {
            return;
        }
        this.f19729e0 = new x7.c0(i10, i11);
        this.f19744m.l(24, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.x
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((u7.y.d) obj).V(i10, i11);
            }
        });
        w2(2, 14, new x7.c0(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r2(int i10, final int i11) {
        K2();
        w2(1, 10, Integer.valueOf(i11));
        w2(2, 10, Integer.valueOf(i11));
        this.f19744m.l(21, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.j0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((u7.y.d) obj).H(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2(boolean z10) {
        if (this.f19753q0) {
            return;
        }
        if (!z10) {
            G2(this.f19761u0.f18613l, 1);
            return;
        }
        e2 e2Var = this.f19761u0;
        if (e2Var.f18615n == 3) {
            G2(e2Var.f18613l, 1);
        }
    }

    private List<d2.c> t1(int i10, List<io.bidmachine.media3.exoplayer.source.r> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            d2.c cVar = new d2.c(list.get(i11), this.f19752q);
            arrayList.add(cVar);
            this.f19750p.add(i11 + i10, new e(cVar.f18349b, cVar.f18348a));
        }
        this.O = this.O.g(i10, arrayList.size());
        return arrayList;
    }

    private long t2(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10) {
        d0Var.h(bVar.f19684a, this.f19748o);
        return j10 + this.f19748o.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u7.u u1() {
        u7.d0 d0VarU = u();
        if (d0VarU.q()) {
            return this.f19759t0;
        }
        return this.f19759t0.a().L(d0VarU.n(S(), this.f26051a).f26037c.f26305e).J();
    }

    private void u2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f19750p.remove(i12);
        }
        this.O = this.O.a(i10, i11);
    }

    private void w2(int i10, int i11, Object obj) {
        for (h2 h2Var : this.f19732g) {
            if (i10 == -1 || h2Var.g() == i10) {
                B1(h2Var).m(i11).l(obj).k();
            }
        }
        for (h2 h2Var2 : this.f19734h) {
            if (h2Var2 != null && (i10 == -1 || h2Var2.g() == i10)) {
                B1(h2Var2).m(i11).l(obj).k();
            }
        }
    }

    private int x1(boolean z10) {
        q2 q2Var = this.G;
        if (q2Var == null || q2Var.a()) {
            return (this.f19761u0.f18615n != 1 || z10) ? 0 : 1;
        }
        return 3;
    }

    private void x2(int i10, Object obj) {
        w2(-1, i10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u7.k y1(o2 o2Var) {
        return new u7.k.b(0).g(o2Var != null ? o2Var.j() : 0).f(o2Var != null ? o2Var.i() : 0).e();
    }

    private u7.d0 z1() {
        return new g2(this.f19750p, this.O);
    }

    private void z2(List<io.bidmachine.media3.exoplayer.source.r> list, int i10, long j10, boolean z10) {
        int iA;
        long j11;
        int iG1 = G1(this.f19761u0);
        long currentPosition = getCurrentPosition();
        this.K++;
        if (!this.f19750p.isEmpty()) {
            u2(0, this.f19750p.size());
        }
        List<d2.c> listT1 = t1(0, list);
        u7.d0 d0VarZ1 = z1();
        if (!d0VarZ1.q() && i10 >= d0VarZ1.p()) {
            throw new IllegalSeekPositionException(d0VarZ1, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            iA = d0VarZ1.a(this.J);
        } else if (i10 == -1) {
            iA = iG1;
            j11 = currentPosition;
        } else {
            iA = i10;
            j11 = j10;
        }
        e2 e2VarO2 = o2(this.f19761u0, d0VarZ1, p2(d0VarZ1, iA, j11));
        int i11 = e2VarO2.f18606e;
        if (iA != -1 && i11 != 1) {
            i11 = (d0VarZ1.q() || iA >= d0VarZ1.p()) ? 4 : 2;
        }
        e2 e2VarN2 = n2(e2VarO2, i11);
        this.f19742l.i1(listT1, iA, x7.l0.S0(j11), this.O);
        H2(e2VarN2, 0, (this.f19761u0.f18603b.f19684a.equals(e2VarN2.f18603b.f19684a) || this.f19761u0.f18602a.q()) ? false : true, 4, F1(e2VarN2), -1, false);
    }

    @Override // u7.y
    public void A(u7.y.d dVar) {
        K2();
        this.f19744m.k((u7.y.d) x7.a.e(dVar));
    }

    @Override // u7.y
    public u7.y.b C() {
        K2();
        return this.R;
    }

    @Override // u7.y
    public boolean D() {
        K2();
        return this.f19761u0.f18613l;
    }

    public x7.h D1() {
        return this.f19768y;
    }

    public void D2(SurfaceHolder surfaceHolder) {
        K2();
        if (surfaceHolder == null) {
            v1();
            return;
        }
        v2();
        this.f19721a0 = true;
        this.Y = surfaceHolder;
        surfaceHolder.addCallback(this.f19769z);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            C2(null);
            q2(0, 0);
        } else {
            C2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            q2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // u7.y
    public void E(final boolean z10) {
        K2();
        if (this.J != z10) {
            this.J = z10;
            this.f19742l.t1(z10);
            this.f19744m.i(9, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.k0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).M(z10);
                }
            });
            F2();
            this.f19744m.f();
        }
    }

    @Override // u7.y
    public long F() {
        K2();
        return this.f19766x;
    }

    @Override // u7.y
    public int H() {
        K2();
        if (this.f19761u0.f18602a.q()) {
            return this.f19765w0;
        }
        e2 e2Var = this.f19761u0;
        return e2Var.f18602a.b(e2Var.f18603b.f19684a);
    }

    public Looper H1() {
        return this.f19742l.L();
    }

    @Override // u7.y
    public void I(TextureView textureView) {
        K2();
        if (textureView == null || textureView != this.f19723b0) {
            return;
        }
        v1();
    }

    @Override // u7.y
    public u7.l0 J() {
        K2();
        return this.f19757s0;
    }

    @Override // u7.y
    public int M() {
        K2();
        if (b()) {
            return this.f19761u0.f18603b.f19686c;
        }
        return -1;
    }

    public boolean M1() {
        K2();
        return this.f19761u0.f18617p;
    }

    @Override // u7.y
    public long O() {
        K2();
        return this.f19764w;
    }

    @Override // u7.y
    public long P() {
        K2();
        return E1(this.f19761u0);
    }

    @Override // u7.y
    public int R() {
        K2();
        return this.f19761u0.f18606e;
    }

    @Override // u7.y
    public int S() {
        K2();
        int iG1 = G1(this.f19761u0);
        if (iG1 == -1) {
            return 0;
        }
        return iG1;
    }

    @Override // u7.y
    public void T(final int i10) {
        K2();
        if (this.I != i10) {
            this.I = i10;
            this.f19742l.q1(i10);
            this.f19744m.i(8, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.e0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).w(i10);
                }
            });
            F2();
            this.f19744m.f();
        }
    }

    @Override // u7.y
    public void U(SurfaceView surfaceView) {
        K2();
        w1(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // u7.y
    public int V() {
        K2();
        return this.I;
    }

    @Override // u7.y
    public boolean W() {
        K2();
        return this.J;
    }

    @Override // u7.y
    public long X() {
        K2();
        if (this.f19761u0.f18602a.q()) {
            return this.f19767x0;
        }
        e2 e2Var = this.f19761u0;
        if (e2Var.f18612k.f19687d != e2Var.f18603b.f19687d) {
            return e2Var.f18602a.n(S(), this.f26051a).d();
        }
        long j10 = e2Var.f18618q;
        if (this.f19761u0.f18612k.b()) {
            e2 e2Var2 = this.f19761u0;
            u7.d0.b bVarH = e2Var2.f18602a.h(e2Var2.f18612k.f19684a, this.f19748o);
            long jF = bVarH.f(this.f19761u0.f18612k.f19685b);
            j10 = jF == Long.MIN_VALUE ? bVarH.f26021d : jF;
        }
        e2 e2Var3 = this.f19761u0;
        return x7.l0.t1(t2(e2Var3.f18602a, e2Var3.f18612k, j10));
    }

    @Override // u7.y
    public u7.u a0() {
        K2();
        return this.S;
    }

    @Override // u7.y
    public boolean b() {
        K2();
        return this.f19761u0.f18603b.b();
    }

    @Override // u7.y
    public long b0() {
        K2();
        return this.f19762v;
    }

    @Override // u7.y
    public void c(u7.x xVar) {
        K2();
        if (xVar == null) {
            xVar = u7.x.f26515d;
        }
        if (this.f19761u0.f18616o.equals(xVar)) {
            return;
        }
        e2 e2VarG = this.f19761u0.g(xVar);
        this.K++;
        this.f19742l.n1(xVar);
        H2(e2VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // u7.y
    public long d() {
        K2();
        return x7.l0.t1(this.f19761u0.f18619r);
    }

    @Override // u7.y
    public u7.x e() {
        K2();
        return this.f19761u0.f18616o;
    }

    @Override // u7.y
    public void g(List<u7.s> list, boolean z10) {
        K2();
        y2(A1(list), z10);
    }

    @Override // u7.y
    public long getCurrentPosition() {
        K2();
        return x7.l0.t1(F1(this.f19761u0));
    }

    @Override // u7.y
    public long getDuration() {
        K2();
        if (!b()) {
            return G();
        }
        e2 e2Var = this.f19761u0;
        io.bidmachine.media3.exoplayer.source.r.b bVar = e2Var.f18603b;
        e2Var.f18602a.h(bVar.f19684a, this.f19748o);
        return x7.l0.t1(this.f19748o.b(bVar.f19685b, bVar.f19686c));
    }

    @Override // u7.y
    public float getVolume() {
        K2();
        return this.f19737i0;
    }

    @Override // u7.y
    public void h(SurfaceView surfaceView) {
        K2();
        if (surfaceView instanceof t8.g) {
            v2();
            C2(surfaceView);
            A2(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof u8.l)) {
                D2(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            v2();
            this.Z = (u8.l) surfaceView;
            B1(this.A).m(10000).l(this.Z).k();
            this.Z.d(this.f19769z);
            C2(this.Z.getVideoSurface());
            A2(surfaceView.getHolder());
        }
    }

    @Override // u7.y
    public void i(u7.y.d dVar) {
        this.f19744m.c((u7.y.d) x7.a.e(dVar));
    }

    @Override // u7.e
    protected void i0(int i10, long j10, int i11, boolean z10) {
        K2();
        if (i10 == -1) {
            return;
        }
        x7.a.a(i10 >= 0);
        u7.d0 d0Var = this.f19761u0.f18602a;
        if (d0Var.q() || i10 < d0Var.p()) {
            this.f19756s.L();
            this.K++;
            if (b()) {
                x7.r.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                i1.e eVar = new i1.e(this.f19761u0);
                eVar.b(1);
                this.f19740k.a(eVar);
                return;
            }
            e2 e2VarN2 = this.f19761u0;
            int i12 = e2VarN2.f18606e;
            if (i12 == 3 || (i12 == 4 && !d0Var.q())) {
                e2VarN2 = n2(this.f19761u0, 2);
            }
            int iS = S();
            e2 e2VarO2 = o2(e2VarN2, d0Var, p2(d0Var, i10, j10));
            this.f19742l.U0(d0Var, i10, x7.l0.S0(j10));
            H2(e2VarO2, 0, true, 1, F1(e2VarO2), iS, z10);
        }
    }

    @Override // u7.y
    public void k() {
        K2();
        e2 e2Var = this.f19761u0;
        if (e2Var.f18606e != 1) {
            return;
        }
        e2 e2VarF = e2Var.f(null);
        e2 e2VarN2 = n2(e2VarF, e2VarF.f18602a.q() ? 4 : 2);
        this.K++;
        this.f19742l.C0();
        H2(e2VarN2, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // u7.y
    public void l(boolean z10) {
        K2();
        G2(z10, 1);
    }

    @Override // u7.y
    public u7.h0 m() {
        K2();
        return this.f19761u0.f18610i.f24614d;
    }

    @Override // u7.y
    public w7.b p() {
        K2();
        return this.f19741k0;
    }

    @Override // u7.y
    public int q() {
        K2();
        if (b()) {
            return this.f19761u0.f18603b.f19685b;
        }
        return -1;
    }

    public void r1(c8.b bVar) {
        this.f19756s.r0((c8.b) x7.a.e(bVar));
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void release() {
        x7.r.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + x7.l0.f28140e + "] [" + u7.t.b() + "]");
        K2();
        this.B.f(false);
        o2 o2Var = this.C;
        if (o2Var != null) {
            o2Var.o();
        }
        this.D.f(false);
        this.E.f(false);
        q2 q2Var = this.G;
        if (q2Var != null) {
            q2Var.d();
        }
        if (!this.f19742l.E0()) {
            this.f19744m.l(10, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.i0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    u0.T1((u7.y.d) obj);
                }
            });
        }
        this.f19744m.j();
        this.f19738j.f(null);
        this.f19760u.d(this.f19756s);
        e2 e2Var = this.f19761u0;
        if (e2Var.f18617p) {
            this.f19761u0 = e2Var.a();
        }
        e2 e2VarN2 = n2(this.f19761u0, 1);
        this.f19761u0 = e2VarN2;
        e2 e2VarC = e2VarN2.c(e2VarN2.f18603b);
        this.f19761u0 = e2VarC;
        e2VarC.f18618q = e2VarC.f18620s;
        this.f19761u0.f18619r = 0L;
        this.f19756s.release();
        v2();
        Surface surface = this.X;
        if (surface != null) {
            surface.release();
            this.X = null;
        }
        if (this.f19751p0) {
            ((PriorityTaskManager) x7.a.e(this.f19749o0)).b(this.f19747n0);
            this.f19751p0 = false;
        }
        this.f19741k0 = w7.b.f27577c;
        this.f19753q0 = true;
    }

    public void s1(ExoPlayer.a aVar) {
        this.f19746n.add(aVar);
    }

    @Override // io.bidmachine.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        K2();
        w2(4, 15, imageOutput);
    }

    @Override // u7.y
    public void setVolume(float f10) {
        K2();
        final float fO = x7.l0.o(f10, 0.0f, 1.0f);
        if (this.f19737i0 == fO) {
            return;
        }
        this.f19737i0 = fO;
        this.f19742l.z1(fO);
        this.f19744m.l(22, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.f0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((u7.y.d) obj).c0(fO);
            }
        });
    }

    @Override // u7.y
    public void stop() {
        K2();
        E2(null);
        this.f19741k0 = new w7.b(com.google.common.collect.u.H(), this.f19761u0.f18620s);
    }

    @Override // u7.y
    public int t() {
        K2();
        return this.f19761u0.f18615n;
    }

    @Override // u7.y
    public u7.d0 u() {
        K2();
        return this.f19761u0.f18602a;
    }

    @Override // u7.y
    public Looper v() {
        return this.f19758t;
    }

    public void v1() {
        K2();
        v2();
        C2(null);
        q2(0, 0);
    }

    @Override // u7.y
    public u7.g0 w() {
        K2();
        return this.f19736i.c();
    }

    public void w1(SurfaceHolder surfaceHolder) {
        K2();
        if (surfaceHolder == null || surfaceHolder != this.Y) {
            return;
        }
        v1();
    }

    @Override // u7.y
    public void y(final u7.g0 g0Var) {
        K2();
        if (!this.f19736i.h() || g0Var.equals(this.f19736i.c())) {
            return;
        }
        this.f19736i.m(g0Var);
        this.f19744m.l(19, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.l0
            @Override // x7.q.a
            public final void invoke(Object obj) {
                ((u7.y.d) obj).F(g0Var);
            }
        });
    }

    public void y2(List<io.bidmachine.media3.exoplayer.source.r> list, boolean z10) {
        K2();
        z2(list, -1, -9223372036854775807L, z10);
    }

    @Override // u7.y
    public void z(TextureView textureView) {
        K2();
        if (textureView == null) {
            v1();
            return;
        }
        v2();
        this.f19723b0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            x7.r.h("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f19769z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            C2(null);
            q2(0, 0);
        } else {
            B2(surfaceTexture);
            q2(textureView.getWidth(), textureView.getHeight());
        }
    }

    private void v2() {
        if (this.Z != null) {
            B1(this.A).m(10000).l(null).k();
            this.Z.i(this.f19769z);
            this.Z = null;
        }
        TextureView textureView = this.f19723b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f19769z) {
                x7.r.h(sRGQSqxgxlS.XqOsxBF, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f19723b0.setSurfaceTextureListener(null);
            }
            this.f19723b0 = null;
        }
        SurfaceHolder surfaceHolder = this.Y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f19769z);
            this.Y = null;
        }
    }

    @Override // u7.y
    public ExoPlaybackException a() {
        K2();
        return this.f19761u0.f18607f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    final class c implements io.bidmachine.media3.exoplayer.video.p, io.bidmachine.media3.exoplayer.audio.e, p8.h, l8.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, u8.l.b, io.bidmachine.media3.exoplayer.d.b, o2.b, ExoPlayer.a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Q(u7.y.d dVar) {
            dVar.W(u0.this.S);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void A(long j10, int i10) {
            u0.this.f19756s.A(j10, i10);
        }

        @Override // u8.l.b
        public void B(Surface surface) {
            u0.this.C2(null);
        }

        @Override // u8.l.b
        public void D(Surface surface) {
            u0.this.C2(surface);
        }

        @Override // io.bidmachine.media3.exoplayer.o2.b
        public void E(final int i10, final boolean z10) {
            u0.this.f19744m.l(30, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.b1
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).O(i10, z10);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.ExoPlayer.a
        public void F(boolean z10) {
            u0.this.J2();
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void a(final boolean z10) {
            if (u0.this.f19739j0 == z10) {
                return;
            }
            u0.this.f19739j0 = z10;
            u0.this.f19744m.l(23, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.d1
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).a(z10);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void b(Exception exc) {
            u0.this.f19756s.b(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void c(final u7.l0 l0Var) {
            u0.this.f19757s0 = l0Var;
            u0.this.f19744m.l(25, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.a1
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).c(l0Var);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void d(AudioSink.a aVar) {
            u0.this.f19756s.d(aVar);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void e(AudioSink.a aVar) {
            u0.this.f19756s.e(aVar);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void f(String str) {
            u0.this.f19756s.f(str);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void g(String str, long j10, long j11) {
            u0.this.f19756s.g(str, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void h(String str) {
            u0.this.f19756s.h(str);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void i(String str, long j10, long j11) {
            u0.this.f19756s.i(str, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void j(u7.q qVar, b8.c cVar) {
            u0.this.U = qVar;
            u0.this.f19756s.j(qVar, cVar);
        }

        @Override // p8.h
        public void k(final List<w7.a> list) {
            u0.this.f19744m.l(27, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.x0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).k(list);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void l(long j10) {
            u0.this.f19756s.l(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void m(Exception exc) {
            u0.this.f19756s.m(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void n(b8.b bVar) {
            u0.this.f19731f0 = bVar;
            u0.this.f19756s.n(bVar);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void o(b8.b bVar) {
            u0.this.f19756s.o(bVar);
            u0.this.V = null;
            u0.this.f19733g0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            u0.this.B2(surfaceTexture);
            u0.this.q2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            u0.this.C2(null);
            u0.this.q2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            u0.this.q2(i10, i11);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void p(b8.b bVar) {
            u0.this.f19733g0 = bVar;
            u0.this.f19756s.p(bVar);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void q(int i10, long j10) {
            u0.this.f19756s.q(i10, j10);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void r(u7.q qVar, b8.c cVar) {
            u0.this.V = qVar;
            u0.this.f19756s.r(qVar, cVar);
        }

        @Override // p8.h
        public void s(final w7.b bVar) {
            u0.this.f19741k0 = bVar;
            u0.this.f19744m.l(27, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.w0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).s(bVar);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            u0.this.q2(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (u0.this.f19721a0) {
                u0.this.C2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (u0.this.f19721a0) {
                u0.this.C2(null);
            }
            u0.this.q2(0, 0);
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void t(b8.b bVar) {
            u0.this.f19756s.t(bVar);
            u0.this.U = null;
            u0.this.f19731f0 = null;
        }

        @Override // io.bidmachine.media3.exoplayer.video.p
        public void u(Object obj, long j10) {
            u0.this.f19756s.u(obj, j10);
            if (u0.this.W == obj) {
                u0.this.f19744m.l(26, new x7.q.a() { // from class: b8.s
                    @Override // x7.q.a
                    public final void invoke(Object obj2) {
                        ((u7.y.d) obj2).Q();
                    }
                });
            }
        }

        @Override // l8.b
        public void v(final u7.v vVar) {
            u0 u0Var = u0.this;
            u0Var.f19759t0 = u0Var.f19759t0.a().N(vVar).J();
            u7.u uVarU1 = u0.this.u1();
            if (!uVarU1.equals(u0.this.S)) {
                u0.this.S = uVarU1;
                u0.this.f19744m.i(14, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.y0
                    @Override // x7.q.a
                    public final void invoke(Object obj) {
                        this.f20006a.Q((u7.y.d) obj);
                    }
                });
            }
            u0.this.f19744m.i(28, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.z0
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).v(vVar);
                }
            });
            u0.this.f19744m.f();
        }

        @Override // io.bidmachine.media3.exoplayer.o2.b
        public void w(int i10) {
            final u7.k kVarY1 = u0.y1(u0.this.C);
            if (kVarY1.equals(u0.this.f19755r0)) {
                return;
            }
            u0.this.f19755r0 = kVarY1;
            u0.this.f19744m.l(29, new x7.q.a() { // from class: io.bidmachine.media3.exoplayer.c1
                @Override // x7.q.a
                public final void invoke(Object obj) {
                    ((u7.y.d) obj).h0(kVarY1);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.d.b
        public void x() {
            u0.this.G2(false, 3);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void y(Exception exc) {
            u0.this.f19756s.y(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.e
        public void z(int i10, long j10, long j11) {
            u0.this.f19756s.z(i10, j10, j11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
