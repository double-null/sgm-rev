package io.bidmachine.media3.exoplayer.source;

import android.content.Context;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import io.bidmachine.media3.exoplayer.hls.HlsMediaSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import v8.o0;

/* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f19591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z7.d.a f19592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s9.r.a f19593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r.a f19594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f19595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.upstream.b f19596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f19600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f19601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19602n;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v8.u f19603a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private z7.d.a f19606d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s9.r.a f19608f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19609g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r8.e.a f19610h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g8.k f19611i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.upstream.b f19612j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Integer, com.google.common.base.w<r.a>> f19604b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<Integer, r.a> f19605c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f19607e = true;

        public a(v8.u uVar, s9.r.a aVar) {
            this.f19603a = uVar;
            this.f19608f = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ r.a k(z7.d.a aVar) {
            return new c0.b(aVar, this.f19603a);
        }

        private com.google.common.base.w<r.a> l(int i10) throws ClassNotFoundException {
            com.google.common.base.w<r.a> wVar;
            com.google.common.base.w<r.a> wVar2;
            com.google.common.base.w<r.a> wVar3 = this.f19604b.get(Integer.valueOf(i10));
            if (wVar3 != null) {
                return wVar3;
            }
            final z7.d.a aVar = (z7.d.a) x7.a.e(this.f19606d);
            if (i10 == 0) {
                int i11 = DashMediaSource.Factory.f18372l;
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(r.a.class);
                wVar = new com.google.common.base.w() { // from class: io.bidmachine.media3.exoplayer.source.d
                    @Override // com.google.common.base.w
                    public final Object get() {
                        return i.j(clsAsSubclass, aVar);
                    }
                };
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i12 = HlsMediaSource.Factory.f18695s;
                        final Class clsAsSubclass2 = HlsMediaSource.Factory.class.asSubclass(r.a.class);
                        wVar = new com.google.common.base.w() { // from class: io.bidmachine.media3.exoplayer.source.f
                            @Override // com.google.common.base.w
                            public final Object get() {
                                return i.j(clsAsSubclass2, aVar);
                            }
                        };
                    } else if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("io.bidmachine.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(r.a.class);
                        wVar2 = new com.google.common.base.w() { // from class: io.bidmachine.media3.exoplayer.source.g
                            @Override // com.google.common.base.w
                            public final Object get() {
                                return i.i(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        wVar2 = new com.google.common.base.w() { // from class: io.bidmachine.media3.exoplayer.source.h
                            @Override // com.google.common.base.w
                            public final Object get() {
                                return this.f19568a.k(aVar);
                            }
                        };
                    }
                    this.f19604b.put(Integer.valueOf(i10), wVar2);
                    return wVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("io.bidmachine.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(r.a.class);
                wVar = new com.google.common.base.w() { // from class: io.bidmachine.media3.exoplayer.source.e
                    @Override // com.google.common.base.w
                    public final Object get() {
                        return i.j(clsAsSubclass4, aVar);
                    }
                };
            }
            wVar2 = wVar;
            this.f19604b.put(Integer.valueOf(i10), wVar2);
            return wVar2;
        }

        public r.a f(int i10) throws ClassNotFoundException {
            r.a aVar = this.f19605c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            r.a aVar2 = l(i10).get();
            r8.e.a aVar3 = this.f19610h;
            if (aVar3 != null) {
                aVar2.e(aVar3);
            }
            g8.k kVar = this.f19611i;
            if (kVar != null) {
                aVar2.d(kVar);
            }
            io.bidmachine.media3.exoplayer.upstream.b bVar = this.f19612j;
            if (bVar != null) {
                aVar2.g(bVar);
            }
            aVar2.a(this.f19608f);
            aVar2.c(this.f19607e);
            aVar2.b(this.f19609g);
            this.f19605c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void m(r8.e.a aVar) {
            this.f19610h = aVar;
            Iterator<r.a> it = this.f19605c.values().iterator();
            while (it.hasNext()) {
                it.next().e(aVar);
            }
        }

        public void n(int i10) {
            this.f19609g = i10;
            this.f19603a.b(i10);
        }

        public void o(z7.d.a aVar) {
            if (aVar != this.f19606d) {
                this.f19606d = aVar;
                this.f19604b.clear();
                this.f19605c.clear();
            }
        }

        public void p(g8.k kVar) {
            this.f19611i = kVar;
            Iterator<r.a> it = this.f19605c.values().iterator();
            while (it.hasNext()) {
                it.next().d(kVar);
            }
        }

        public void q(int i10) {
            v8.u uVar = this.f19603a;
            if (uVar instanceof v8.l) {
                ((v8.l) uVar).o(i10);
            }
        }

        public void r(io.bidmachine.media3.exoplayer.upstream.b bVar) {
            this.f19612j = bVar;
            Iterator<r.a> it = this.f19605c.values().iterator();
            while (it.hasNext()) {
                it.next().g(bVar);
            }
        }

        public void s(boolean z10) {
            this.f19607e = z10;
            this.f19603a.e(z10);
            Iterator<r.a> it = this.f19605c.values().iterator();
            while (it.hasNext()) {
                it.next().c(z10);
            }
        }

        public void t(s9.r.a aVar) {
            this.f19608f = aVar;
            this.f19603a.a(aVar);
            Iterator<r.a> it = this.f19605c.values().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    public i(Context context, v8.u uVar) {
        this(new z7.h.a(context), uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ r.a i(Class cls) {
        return p(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ r.a j(Class cls, z7.d.a aVar) {
        return q(cls, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ v8.p[] m(u7.q qVar) {
        v8.p[] pVarArr = new v8.p[1];
        pVarArr[0] = this.f19593e.a(qVar) ? new s9.n(this.f19593e.c(qVar), null) : new b(qVar);
        return pVarArr;
    }

    private static r n(u7.s sVar, r rVar) {
        u7.s.d dVar = sVar.f26306f;
        return (dVar.f26331b == 0 && dVar.f26333d == Long.MIN_VALUE && !dVar.f26335f) ? rVar : new ClippingMediaSource.b(rVar).m(sVar.f26306f.f26331b).k(sVar.f26306f.f26333d).j(!sVar.f26306f.f26336g).i(sVar.f26306f.f26334e).l(sVar.f26306f.f26335f).h();
    }

    private r o(u7.s sVar, r rVar) {
        x7.a.e(sVar.f26302b);
        sVar.f26302b.getClass();
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a p(Class<? extends r.a> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a q(Class<? extends r.a> cls, z7.d.a aVar) {
        try {
            return cls.getConstructor(z7.d.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.r.a
    public r f(u7.s sVar) {
        x7.a.e(sVar.f26302b);
        String scheme = sVar.f26302b.f26394a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((r.a) x7.a.e(this.f19594f)).f(sVar);
        }
        if (Objects.equals(sVar.f26302b.f26395b, "application/x-image-uri")) {
            return new l.b(x7.l0.S0(sVar.f26302b.f26402i), (j) x7.a.e(this.f19595g)).f(sVar);
        }
        u7.s.h hVar = sVar.f26302b;
        int iA0 = x7.l0.A0(hVar.f26394a, hVar.f26395b);
        if (sVar.f26302b.f26402i != -9223372036854775807L) {
            this.f19591c.q(1);
        }
        try {
            r.a aVarF = this.f19591c.f(iA0);
            u7.s.g.a aVarA = sVar.f26304d.a();
            if (sVar.f26304d.f26376a == -9223372036854775807L) {
                aVarA.k(this.f19597i);
            }
            if (sVar.f26304d.f26379d == -3.4028235E38f) {
                aVarA.j(this.f19600l);
            }
            if (sVar.f26304d.f26380e == -3.4028235E38f) {
                aVarA.h(this.f19601m);
            }
            if (sVar.f26304d.f26377b == -9223372036854775807L) {
                aVarA.i(this.f19598j);
            }
            if (sVar.f26304d.f26378c == -9223372036854775807L) {
                aVarA.g(this.f19599k);
            }
            u7.s.g gVarF = aVarA.f();
            if (!gVarF.equals(sVar.f26304d)) {
                sVar = sVar.a().b(gVarF).a();
            }
            r rVarF = aVarF.f(sVar);
            com.google.common.collect.u<u7.s.k> uVar = ((u7.s.h) x7.l0.i(sVar.f26302b)).f26399f;
            if (!uVar.isEmpty()) {
                r[] rVarArr = new r[uVar.size() + 1];
                rVarArr[0] = rVarF;
                for (int i10 = 0; i10 < uVar.size(); i10++) {
                    if (this.f19602n) {
                        final u7.q qVarN = new u7.q.b().u0(uVar.get(i10).f26421b).j0(uVar.get(i10).f26422c).w0(uVar.get(i10).f26423d).s0(uVar.get(i10).f26424e).h0(uVar.get(i10).f26425f).f0(uVar.get(i10).f26426g).N();
                        c0.b bVar = new c0.b(this.f19592d, new v8.u() { // from class: n8.g
                            @Override // v8.u
                            public final v8.p[] g() {
                                return this.f22776b.m(qVarN);
                            }
                        });
                        if (this.f19593e.a(qVarN)) {
                            qVarN = qVarN.b().u0("application/x-media3-cues").S(qVarN.f26252o).W(this.f19593e.b(qVarN)).N();
                        }
                        c0.b bVarJ = bVar.j(0, qVarN);
                        io.bidmachine.media3.exoplayer.upstream.b bVar2 = this.f19596h;
                        if (bVar2 != null) {
                            bVarJ.g(bVar2);
                        }
                        rVarArr[i10 + 1] = bVarJ.f(u7.s.b(uVar.get(i10).f26420a.toString()));
                    } else {
                        i0.b bVar3 = new i0.b(this.f19592d);
                        io.bidmachine.media3.exoplayer.upstream.b bVar4 = this.f19596h;
                        if (bVar4 != null) {
                            bVar3.b(bVar4);
                        }
                        rVarArr[i10 + 1] = bVar3.a(uVar.get(i10), -9223372036854775807L);
                    }
                }
                rVarF = new MergingMediaSource(rVarArr);
            }
            return o(sVar, n(sVar, rVarF));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.r.a
    @Deprecated
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public i c(boolean z10) {
        this.f19602n = z10;
        this.f19591c.s(z10);
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i b(int i10) {
        this.f19591c.n(i10);
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public i e(r8.e.a aVar) {
        this.f19591c.m((r8.e.a) x7.a.e(aVar));
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public i d(g8.k kVar) {
        this.f19591c.p((g8.k) x7.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public i g(io.bidmachine.media3.exoplayer.upstream.b bVar) {
        this.f19596h = (io.bidmachine.media3.exoplayer.upstream.b) x7.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f19591c.r(bVar);
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public i a(s9.r.a aVar) {
        this.f19593e = (s9.r.a) x7.a.e(aVar);
        this.f19591c.t(aVar);
        return this;
    }

    public i(z7.d.a aVar, v8.u uVar) {
        this.f19592d = aVar;
        s9.h hVar = new s9.h();
        this.f19593e = hVar;
        a aVar2 = new a(uVar, hVar);
        this.f19591c = aVar2;
        aVar2.o(aVar);
        this.f19597i = -9223372036854775807L;
        this.f19598j = -9223372036854775807L;
        this.f19599k = -9223372036854775807L;
        this.f19600l = -3.4028235E38f;
        this.f19601m = -3.4028235E38f;
        this.f19602n = true;
    }

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    private static final class b implements v8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u7.q f19613a;

        public b(u7.q qVar) {
            this.f19613a = qVar;
        }

        @Override // v8.p
        public void c(v8.r rVar) {
            o0 o0VarE = rVar.e(0, 3);
            rVar.h(new v8.j0.b(-9223372036854775807L));
            rVar.r();
            o0VarE.a(this.f19613a.b().u0("text/x-unknown").S(this.f19613a.f26252o).N());
        }

        @Override // v8.p
        public boolean e(v8.q qVar) {
            return true;
        }

        @Override // v8.p
        public int l(v8.q qVar, v8.i0 i0Var) throws IOException {
            return qVar.h(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // v8.p
        public void release() {
        }

        @Override // v8.p
        public void a(long j10, long j11) {
        }
    }
}
