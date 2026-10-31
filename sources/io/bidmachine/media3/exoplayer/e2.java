package io.bidmachine.media3.exoplayer;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: PlaybackInfo.java */
/* JADX INFO: loaded from: classes4.dex */
final class e2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final io.bidmachine.media3.exoplayer.source.r.b f18601u = new io.bidmachine.media3.exoplayer.source.r.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u7.d0 f18602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.exoplayer.source.r.b f18603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f18607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n8.x f18609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q8.w f18610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<u7.v> f18611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final io.bidmachine.media3.exoplayer.source.r.b f18612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u7.x f18616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f18617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f18618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f18619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f18620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f18621t;

    public e2(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, n8.x xVar, q8.w wVar, List<u7.v> list, io.bidmachine.media3.exoplayer.source.r.b bVar2, boolean z11, int i11, int i12, u7.x xVar2, long j12, long j13, long j14, long j15, boolean z12) {
        this.f18602a = d0Var;
        this.f18603b = bVar;
        this.f18604c = j10;
        this.f18605d = j11;
        this.f18606e = i10;
        this.f18607f = exoPlaybackException;
        this.f18608g = z10;
        this.f18609h = xVar;
        this.f18610i = wVar;
        this.f18611j = list;
        this.f18612k = bVar2;
        this.f18613l = z11;
        this.f18614m = i11;
        this.f18615n = i12;
        this.f18616o = xVar2;
        this.f18618q = j12;
        this.f18619r = j13;
        this.f18620s = j14;
        this.f18621t = j15;
        this.f18617p = z12;
    }

    public static e2 k(q8.w wVar) {
        u7.d0 d0Var = u7.d0.f26009a;
        io.bidmachine.media3.exoplayer.source.r.b bVar = f18601u;
        return new e2(d0Var, bVar, -9223372036854775807L, 0L, 1, null, false, n8.x.f22835d, wVar, com.google.common.collect.u.H(), bVar, false, 1, 0, u7.x.f26515d, 0L, 0L, 0L, 0L, false);
    }

    public static io.bidmachine.media3.exoplayer.source.r.b l() {
        return f18601u;
    }

    public e2 a() {
        return new e2(this.f18602a, this.f18603b, this.f18604c, this.f18605d, this.f18606e, this.f18607f, this.f18608g, this.f18609h, this.f18610i, this.f18611j, this.f18612k, this.f18613l, this.f18614m, this.f18615n, this.f18616o, this.f18618q, this.f18619r, m(), SystemClock.elapsedRealtime(), this.f18617p);
    }

    public e2 b(boolean z10) {
        return new e2(this.f18602a, this.f18603b, this.f18604c, this.f18605d, this.f18606e, this.f18607f, z10, this.f18609h, this.f18610i, this.f18611j, this.f18612k, this.f18613l, this.f18614m, this.f18615n, this.f18616o, this.f18618q, this.f18619r, this.f18620s, this.f18621t, this.f18617p);
    }

    public e2 c(io.bidmachine.media3.exoplayer.source.r.b bVar) {
        return new e2(this.f18602a, this.f18603b, this.f18604c, this.f18605d, this.f18606e, this.f18607f, this.f18608g, this.f18609h, this.f18610i, this.f18611j, bVar, this.f18613l, this.f18614m, this.f18615n, this.f18616o, this.f18618q, this.f18619r, this.f18620s, this.f18621t, this.f18617p);
    }

    public e2 d(io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, long j11, long j12, long j13, n8.x xVar, q8.w wVar, List<u7.v> list) {
        return new e2(this.f18602a, bVar, j11, j12, this.f18606e, this.f18607f, this.f18608g, xVar, wVar, list, this.f18612k, this.f18613l, this.f18614m, this.f18615n, this.f18616o, this.f18618q, j13, j10, SystemClock.elapsedRealtime(), this.f18617p);
    }

    public e2 e(boolean z10, int i10, int i11) {
        return new e2(this.f18602a, this.f18603b, this.f18604c, this.f18605d, this.f18606e, this.f18607f, this.f18608g, this.f18609h, this.f18610i, this.f18611j, this.f18612k, z10, i10, i11, this.f18616o, this.f18618q, this.f18619r, this.f18620s, this.f18621t, this.f18617p);
    }

    public e2 f(ExoPlaybackException exoPlaybackException) {
        return new e2(this.f18602a, this.f18603b, this.f18604c, this.f18605d, this.f18606e, exoPlaybackException, this.f18608g, this.f18609h, this.f18610i, this.f18611j, this.f18612k, this.f18613l, this.f18614m, this.f18615n, this.f18616o, this.f18618q, this.f18619r, this.f18620s, this.f18621t, this.f18617p);
    }

    public e2 g(u7.x xVar) {
        return new e2(this.f18602a, this.f18603b, this.f18604c, this.f18605d, this.f18606e, this.f18607f, this.f18608g, this.f18609h, this.f18610i, this.f18611j, this.f18612k, this.f18613l, this.f18614m, this.f18615n, xVar, this.f18618q, this.f18619r, this.f18620s, this.f18621t, this.f18617p);
    }

    public e2 h(int i10) {
        return new e2(this.f18602a, this.f18603b, this.f18604c, this.f18605d, i10, this.f18607f, this.f18608g, this.f18609h, this.f18610i, this.f18611j, this.f18612k, this.f18613l, this.f18614m, this.f18615n, this.f18616o, this.f18618q, this.f18619r, this.f18620s, this.f18621t, this.f18617p);
    }

    public e2 i(boolean z10) {
        return new e2(this.f18602a, this.f18603b, this.f18604c, this.f18605d, this.f18606e, this.f18607f, this.f18608g, this.f18609h, this.f18610i, this.f18611j, this.f18612k, this.f18613l, this.f18614m, this.f18615n, this.f18616o, this.f18618q, this.f18619r, this.f18620s, this.f18621t, z10);
    }

    public e2 j(u7.d0 d0Var) {
        return new e2(d0Var, this.f18603b, this.f18604c, this.f18605d, this.f18606e, this.f18607f, this.f18608g, this.f18609h, this.f18610i, this.f18611j, this.f18612k, this.f18613l, this.f18614m, this.f18615n, this.f18616o, this.f18618q, this.f18619r, this.f18620s, this.f18621t, this.f18617p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f18620s;
        }
        do {
            j10 = this.f18621t;
            j11 = this.f18620s;
        } while (j10 != this.f18621t);
        return x7.l0.S0(x7.l0.t1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f18616o.f26518a)));
    }

    public boolean n() {
        return this.f18606e == 3 && this.f18613l && this.f18615n == 0;
    }

    public void o(long j10) {
        this.f18620s = j10;
        this.f18621t = SystemClock.elapsedRealtime();
    }
}
