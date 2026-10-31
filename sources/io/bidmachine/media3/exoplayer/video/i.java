package io.bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.common.base.w;
import com.google.common.base.x;
import com.google.common.collect.u;
import io.bidmachine.media3.common.VideoFrameProcessingException;
import io.bidmachine.media3.exoplayer.h2;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import u7.i0;
import u7.j0;
import u7.k0;
import u7.l0;
import u7.q;
import u7.z;
import x7.c0;
import x7.f0;

/* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements k0.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Executor f19900z = new Executor() { // from class: t8.c
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            io.bidmachine.media3.exoplayer.video.i.H(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0<Long> f19902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z.a f19903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<d> f19904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Object> f19905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i0 f19906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final VideoSink f19907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final VideoSink.b f19908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x7.h f19909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArraySet<e> f19910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f19911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f19912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private x7.n f19913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private z f19914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Pair<Surface, c0> f19916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h2.a f19919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f19920t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f19921u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f19924x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19925y;

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    class a implements VideoSink.b {
        a() {
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.b
        public void a(long j10) {
            ((z) x7.a.i(i.this.f19914n)).b(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.b
        public void b() {
            ((z) x7.a.i(i.this.f19914n)).b(-2L);
        }
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f19927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f19928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private j0.a f19929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private z.a f19930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<Object> f19931e = u.H();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i0 f19932f = i0.f26178a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x7.h f19933g = x7.h.f28124a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f19934h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f19935i;

        public b(Context context, n nVar) {
            this.f19927a = context.getApplicationContext();
            this.f19928b = nVar;
        }

        public i h() {
            x7.a.g(!this.f19935i);
            a aVar = null;
            if (this.f19930d == null) {
                if (this.f19929c == null) {
                    this.f19929c = new f(aVar);
                }
                this.f19930d = new g(this.f19929c);
            }
            i iVar = new i(this, aVar);
            this.f19935i = true;
            return iVar;
        }

        public b i(x7.h hVar) {
            this.f19933g = hVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    private final class c implements VideoSink.a {
        private c() {
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
        public void a(VideoSink videoSink) {
            Iterator it = i.this.f19910j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).j(i.this);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
        public void b(VideoSink videoSink) {
            Iterator it = i.this.f19910j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c(i.this);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
        public void c(VideoSink videoSink, l0 l0Var) {
            Iterator it = i.this.f19910j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).q(i.this, l0Var);
            }
        }

        /* synthetic */ c(i iVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    final class d implements VideoSink, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19938b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j0 f19940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private q f19941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f19942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f19943g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f19947k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u<Object> f19939c = u.H();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f19944h = -9223372036854775807L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private VideoSink.a f19945i = VideoSink.a.f19835a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Executor f19946j = i.f19900z;

        public d(Context context, int i10) {
            this.f19938b = i10;
            this.f19937a = x7.l0.f0(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void E(VideoSink.a aVar) {
            aVar.b(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void F(VideoSink.a aVar) {
            aVar.a((VideoSink) x7.a.i(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void G(VideoSink.a aVar, l0 l0Var) {
            aVar.c(this, l0Var);
        }

        private void H(q qVar) {
            ((j0) x7.a.i(this.f19940d)).b(this.f19942f, qVar.b().T(i.B(qVar.C)).N(), this.f19939c, 0L);
        }

        private void I(List<Object> list) {
            if (i.this.f19903c.b()) {
                this.f19939c = u.B(list);
            } else {
                this.f19939c = new u.a().k(list).k(i.this.f19905e).m();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void A(t8.h hVar) {
            i.this.Q(hVar);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public Surface a() {
            x7.a.g(isInitialized());
            return ((j0) x7.a.i(this.f19940d)).a();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean b() {
            return isInitialized() && i.this.D();
        }

        @Override // io.bidmachine.media3.exoplayer.video.i.e
        public void c(i iVar) {
            final VideoSink.a aVar = this.f19945i;
            this.f19946j.execute(new Runnable() { // from class: io.bidmachine.media3.exoplayer.video.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19951a.E(aVar);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void d(int i10, q qVar, List<Object> list) {
            x7.a.g(isInitialized());
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i10);
            }
            I(list);
            this.f19942f = i10;
            this.f19941e = qVar;
            i.this.f19921u = -9223372036854775807L;
            i.this.f19922v = false;
            H(qVar);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void e(h2.a aVar) {
            i.this.f19919s = aVar;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void f() {
            i.this.f19907g.f();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void g() {
            i.this.f19921u = this.f19944h;
            if (i.this.f19920t >= i.this.f19921u) {
                i.this.f19907g.g();
                i.this.f19922v = true;
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void h(long j10, long j11) {
            f0 f0Var = i.this.f19902b;
            long j12 = this.f19944h;
            f0Var.a(j12 == -9223372036854775807L ? 0L : j12 + 1, Long.valueOf(j10));
            this.f19943g = j11;
            i.this.M(j11);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void i(long j10, long j11) throws VideoSink.VideoSinkException {
            i.this.L(j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.f19940d != null;
        }

        @Override // io.bidmachine.media3.exoplayer.video.i.e
        public void j(i iVar) {
            final VideoSink.a aVar = this.f19945i;
            this.f19946j.execute(new Runnable() { // from class: io.bidmachine.media3.exoplayer.video.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19953a.F(aVar);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void k() {
            i.this.f19907g.k();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void l(List<Object> list) {
            if (this.f19939c.equals(list)) {
                return;
            }
            I(list);
            q qVar = this.f19941e;
            if (qVar != null) {
                H(qVar);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean m(q qVar) throws VideoSink.VideoSinkException {
            x7.a.g(!isInitialized());
            j0 j0VarJ = i.this.J(qVar, this.f19938b);
            this.f19940d = j0VarJ;
            return j0VarJ != null;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean n(boolean z10) {
            return i.this.F(z10 && isInitialized());
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void o(boolean z10) {
            i.this.f19907g.o(z10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void p() {
            i.this.f19907g.p();
        }

        @Override // io.bidmachine.media3.exoplayer.video.i.e
        public void q(i iVar, final l0 l0Var) {
            final VideoSink.a aVar = this.f19945i;
            this.f19946j.execute(new Runnable() { // from class: io.bidmachine.media3.exoplayer.video.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19955a.G(aVar, l0Var);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public boolean r(long j10, boolean z10, VideoSink.b bVar) {
            x7.a.g(isInitialized());
            if (!i.this.R() || ((j0) x7.a.i(this.f19940d)).d() >= this.f19937a || !((j0) x7.a.i(this.f19940d)).c()) {
                return false;
            }
            this.f19944h = j10 - this.f19943g;
            bVar.a(j10 * 1000);
            return true;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void release() {
            i.this.K();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void s() {
            i.this.f19907g.s();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void t(int i10) {
            i.this.f19907g.t(i10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void u(float f10) {
            i.this.O(f10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void v() {
            i.this.z();
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void w(VideoSink.a aVar, Executor executor) {
            this.f19945i = aVar;
            this.f19946j = executor;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void x(boolean z10) {
            if (isInitialized()) {
                this.f19940d.flush();
            }
            this.f19944h = -9223372036854775807L;
            i.this.A(z10);
            this.f19947k = false;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void y(Surface surface, c0 c0Var) {
            i.this.N(surface, c0Var);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink
        public void z(boolean z10) {
            i.this.f19907g.z(z10);
        }
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    public interface e {
        void c(i iVar);

        void j(i iVar);

        void q(i iVar, l0 l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    static final class f implements j0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final w<j0.a> f19949a = x.a(new w() { // from class: io.bidmachine.media3.exoplayer.video.m
            @Override // com.google.common.base.w
            public final Object get() {
                return i.f.b();
            }
        });

        private f() {
        }

        /* synthetic */ f(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ j0.a b() {
            try {
                Class<?> cls = Class.forName("io.bidmachine.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (j0.a) x7.a.e(cls.getMethod(InAppPurchaseConstants.METHOD_BUILD, new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: PlaybackVideoGraphWrapper.java */
    private static final class g implements z.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j0.a f19950a;

        public g(j0.a aVar) {
            this.f19950a = aVar;
        }

        @Override // u7.z.a
        public z a(Context context, u7.g gVar, u7.j jVar, k0.a aVar, Executor executor, i0 i0Var, List<Object> list, long j10) throws VideoFrameProcessingException {
            try {
                Constructor<?> constructor = Class.forName("io.bidmachine.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(j0.a.class);
                Object[] objArr = new Object[1];
                try {
                    objArr[0] = this.f19950a;
                    return ((z.a) constructor.newInstance(objArr)).a(context, gVar, jVar, aVar, executor, i0Var, list, j10);
                } catch (Exception e10) {
                    e = e10;
                    throw VideoFrameProcessingException.b(e);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }

        @Override // u7.z.a
        public boolean b() {
            return false;
        }
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        if (E()) {
            this.f19917q++;
            this.f19907g.x(z10);
            while (this.f19902b.l() > 1) {
                this.f19902b.i();
            }
            if (this.f19902b.l() == 1) {
                this.f19907g.h(((Long) x7.a.e(this.f19902b.i())).longValue(), this.f19923w);
            }
            this.f19920t = -9223372036854775807L;
            this.f19921u = -9223372036854775807L;
            this.f19922v = false;
            ((x7.n) x7.a.i(this.f19913m)).i(new Runnable() { // from class: t8.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25630a.G();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u7.g B(u7.g gVar) {
        return (gVar == null || !gVar.g()) ? u7.g.f26068h : gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D() {
        return this.f19917q == 0 && this.f19922v && this.f19907g.b();
    }

    private boolean E() {
        return this.f19918r == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F(boolean z10) {
        return this.f19907g.n(z10 && this.f19917q == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f19917q--;
    }

    private void I(Surface surface, int i10, int i11) {
        z zVar = this.f19914n;
        if (zVar == null) {
            return;
        }
        if (surface != null) {
            zVar.c(new u7.c0(surface, i10, i11));
            this.f19907g.y(surface, new c0(i10, i11));
        } else {
            zVar.c(null);
            this.f19907g.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j0 J(q qVar, int i10) throws VideoSink.VideoSinkException {
        a aVar = null;
        if (i10 == 0) {
            x7.a.g(this.f19918r == 0);
            u7.g gVarB = B(qVar.C);
            if (this.f19911k) {
                gVarB = u7.g.f26068h;
            } else if (gVarB.f26078c == 7 && x7.l0.f28136a < 34) {
                gVarB = gVarB.a().e(6).a();
            }
            u7.g gVar = gVarB;
            final x7.n nVarB = this.f19909i.b((Looper) x7.a.i(Looper.myLooper()), null);
            this.f19913m = nVarB;
            try {
                z.a aVar2 = this.f19903c;
                Context context = this.f19901a;
                u7.j jVar = u7.j.f26179a;
                Objects.requireNonNull(nVarB);
                z zVarA = aVar2.a(context, gVar, jVar, this, new Executor() { // from class: t8.e
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        nVarB.i(runnable);
                    }
                }, this.f19906f, this.f19905e, 0L);
                this.f19914n = zVarA;
                zVarA.initialize();
                Pair<Surface, c0> pair = this.f19916p;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    c0 c0Var = (c0) pair.second;
                    I(surface, c0Var.b(), c0Var.a());
                }
                this.f19907g.m(qVar);
                this.f19918r = 1;
            } catch (VideoFrameProcessingException e10) {
                throw new VideoSink.VideoSinkException(e10, qVar);
            }
        } else if (!E()) {
            return null;
        }
        try {
            ((z) x7.a.e(this.f19914n)).d(i10);
            this.f19925y++;
            VideoSink videoSink = this.f19907g;
            c cVar = new c(this, aVar);
            final x7.n nVar = (x7.n) x7.a.e(this.f19913m);
            Objects.requireNonNull(nVar);
            videoSink.w(cVar, new Executor() { // from class: t8.e
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    nVar.i(runnable);
                }
            });
            return this.f19914n.a(i10);
        } catch (VideoFrameProcessingException e11) {
            throw new VideoSink.VideoSinkException(e11, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(long j10, long j11) throws VideoSink.VideoSinkException {
        this.f19907g.i(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j10) {
        this.f19923w = j10;
        this.f19907g.h(this.f19915o, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(float f10) {
        this.f19907g.u(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(t8.h hVar) {
        this.f19907g.A(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R() {
        int i10 = this.f19924x;
        return i10 != -1 && i10 == this.f19925y;
    }

    public VideoSink C(int i10) {
        x7.a.g(!x7.l0.r(this.f19904d, i10));
        d dVar = new d(this.f19901a, i10);
        y(dVar);
        this.f19904d.put(i10, dVar);
        return dVar;
    }

    public void K() {
        if (this.f19918r == 2) {
            return;
        }
        x7.n nVar = this.f19913m;
        if (nVar != null) {
            nVar.f(null);
        }
        z zVar = this.f19914n;
        if (zVar != null) {
            zVar.release();
        }
        this.f19916p = null;
        this.f19918r = 2;
    }

    public void N(Surface surface, c0 c0Var) {
        Pair<Surface, c0> pair = this.f19916p;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((c0) this.f19916p.second).equals(c0Var)) {
            return;
        }
        this.f19916p = Pair.create(surface, c0Var);
        I(surface, c0Var.b(), c0Var.a());
    }

    public void P(int i10) {
        this.f19924x = i10;
    }

    public void y(e eVar) {
        this.f19910j.add(eVar);
    }

    public void z() {
        c0 c0Var = c0.f28098c;
        I(null, c0Var.b(), c0Var.a());
        this.f19916p = null;
    }

    private i(b bVar) {
        this.f19901a = bVar.f19927a;
        this.f19902b = new f0<>();
        this.f19903c = (z.a) x7.a.i(bVar.f19930d);
        this.f19904d = new SparseArray<>();
        this.f19905e = bVar.f19931e;
        this.f19906f = bVar.f19932f;
        x7.h hVar = bVar.f19933g;
        this.f19909i = hVar;
        this.f19907g = new io.bidmachine.media3.exoplayer.video.d(bVar.f19928b, hVar);
        this.f19908h = new a();
        this.f19910j = new CopyOnWriteArraySet<>();
        this.f19911k = bVar.f19934h;
        this.f19912l = new q.b().N();
        this.f19920t = -9223372036854775807L;
        this.f19921u = -9223372036854775807L;
        this.f19924x = -1;
        this.f19918r = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(Runnable runnable) {
    }
}
