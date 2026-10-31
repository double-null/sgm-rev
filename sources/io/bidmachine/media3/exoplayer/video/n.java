package io.bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import x7.l0;

/* JADX INFO: compiled from: VideoFrameReleaseControl.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f19958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t8.i f19959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19961d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19964g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19967j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19971n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19962e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19963f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19965h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19966i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f19968k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private x7.h f19969l = x7.h.f28124a;

    /* JADX INFO: compiled from: VideoFrameReleaseControl.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f19972a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f19973b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f19972a = -9223372036854775807L;
            this.f19973b = -9223372036854775807L;
        }

        public long f() {
            return this.f19972a;
        }

        public long g() {
            return this.f19973b;
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseControl.java */
    public interface b {
        boolean C(long j10, long j11);

        boolean E(long j10, long j11, long j12, boolean z10, boolean z11) throws ExoPlaybackException;

        boolean M(long j10, long j11, boolean z10);
    }

    public n(Context context, b bVar, long j10) {
        this.f19958a = bVar;
        this.f19960c = j10;
        this.f19959b = new t8.i(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.f19968k));
        return this.f19961d ? j13 - (l0.S0(this.f19969l.elapsedRealtime()) - j11) : j13;
    }

    private void f(int i10) {
        this.f19962e = Math.min(this.f19962e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f19966i != -9223372036854775807L && !this.f19967j) {
            return false;
        }
        int i10 = this.f19962e;
        if (i10 == 0) {
            return this.f19961d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.f19961d && this.f19958a.C(j11, l0.S0(this.f19969l.elapsedRealtime()) - this.f19964g);
        }
        throw new IllegalStateException();
    }

    public void a() {
        if (this.f19962e == 0) {
            this.f19962e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, a aVar) throws ExoPlaybackException {
        aVar.h();
        if (this.f19963f == -9223372036854775807L) {
            this.f19963f = j11;
        }
        if (this.f19965h != j10) {
            this.f19959b.h(j10);
            this.f19965h = j10;
        }
        aVar.f19972a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f19970m) {
            this.f19971n = true;
            if (this.f19958a.E(aVar.f19972a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f19961d || aVar.f19972a >= 30000) ? 5 : 3;
        }
        if (s(j11, aVar.f19972a, j13)) {
            return 0;
        }
        if (!this.f19961d || j11 == this.f19963f) {
            return 5;
        }
        long jNanoTime = this.f19969l.nanoTime();
        aVar.f19973b = this.f19959b.b((aVar.f19972a * 1000) + jNanoTime);
        aVar.f19972a = (aVar.f19973b - jNanoTime) / 1000;
        boolean z12 = (this.f19966i == -9223372036854775807L || this.f19967j) ? false : true;
        if (this.f19958a.E(aVar.f19972a, j11, j12, z11, z12)) {
            return 4;
        }
        if (this.f19958a.M(aVar.f19972a, j12, z11)) {
            return z12 ? 3 : 2;
        }
        return aVar.f19972a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f19962e == 3 || (!this.f19970m && this.f19971n))) {
            this.f19966i = -9223372036854775807L;
            return true;
        }
        if (this.f19966i == -9223372036854775807L) {
            return false;
        }
        if (this.f19969l.elapsedRealtime() < this.f19966i) {
            return true;
        }
        this.f19966i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z10) {
        this.f19967j = z10;
        this.f19966i = this.f19960c > 0 ? this.f19969l.elapsedRealtime() + this.f19960c : -9223372036854775807L;
    }

    public void g() {
        f(0);
    }

    public void h(boolean z10) {
        this.f19962e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10 = this.f19962e != 3;
        this.f19962e = 3;
        this.f19964g = l0.S0(this.f19969l.elapsedRealtime());
        return z10;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f19961d = true;
        this.f19964g = l0.S0(this.f19969l.elapsedRealtime());
        this.f19959b.k();
    }

    public void l() {
        this.f19961d = false;
        this.f19966i = -9223372036854775807L;
        this.f19959b.l();
    }

    public void m() {
        this.f19959b.j();
        this.f19965h = -9223372036854775807L;
        this.f19963f = -9223372036854775807L;
        f(1);
        this.f19966i = -9223372036854775807L;
    }

    public void n(int i10) {
        this.f19959b.o(i10);
    }

    public void o(x7.h hVar) {
        this.f19969l = hVar;
    }

    public void p(float f10) {
        this.f19959b.g(f10);
    }

    public void q(Surface surface) {
        this.f19970m = surface != null;
        this.f19971n = false;
        this.f19959b.m(surface);
        f(1);
    }

    public void r(float f10) {
        x7.a.a(f10 > 0.0f);
        if (f10 == this.f19968k) {
            return;
        }
        this.f19968k = f10;
        this.f19959b.i(f10);
    }
}
