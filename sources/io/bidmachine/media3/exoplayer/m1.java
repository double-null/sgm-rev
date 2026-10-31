package io.bidmachine.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes4.dex */
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.exoplayer.source.r.b f19165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19174j;

    m1(io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = false;
        x7.a.a(!z14 || z12);
        x7.a.a(!z13 || z12);
        if (!z11 || (!z12 && !z13 && !z14)) {
            z15 = true;
        }
        x7.a.a(z15);
        this.f19165a = bVar;
        this.f19166b = j10;
        this.f19167c = j11;
        this.f19168d = j12;
        this.f19169e = j13;
        this.f19170f = z10;
        this.f19171g = z11;
        this.f19172h = z12;
        this.f19173i = z13;
        this.f19174j = z14;
    }

    public m1 a(long j10) {
        return j10 == this.f19167c ? this : new m1(this.f19165a, this.f19166b, j10, this.f19168d, this.f19169e, this.f19170f, this.f19171g, this.f19172h, this.f19173i, this.f19174j);
    }

    public m1 b(long j10) {
        return j10 == this.f19166b ? this : new m1(this.f19165a, j10, this.f19167c, this.f19168d, this.f19169e, this.f19170f, this.f19171g, this.f19172h, this.f19173i, this.f19174j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m1.class != obj.getClass()) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f19166b == m1Var.f19166b && this.f19167c == m1Var.f19167c && this.f19168d == m1Var.f19168d && this.f19169e == m1Var.f19169e && this.f19170f == m1Var.f19170f && this.f19171g == m1Var.f19171g && this.f19172h == m1Var.f19172h && this.f19173i == m1Var.f19173i && this.f19174j == m1Var.f19174j && Objects.equals(this.f19165a, m1Var.f19165a);
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f19165a.hashCode()) * 31) + ((int) this.f19166b)) * 31) + ((int) this.f19167c)) * 31) + ((int) this.f19168d)) * 31) + ((int) this.f19169e)) * 31) + (this.f19170f ? 1 : 0)) * 31) + (this.f19171g ? 1 : 0)) * 31) + (this.f19172h ? 1 : 0)) * 31) + (this.f19173i ? 1 : 0)) * 31) + (this.f19174j ? 1 : 0);
    }
}
