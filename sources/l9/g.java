package l9;

import x7.a0;
import x7.g0;

/* JADX INFO: compiled from: TimeSignalCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21912b;

    private g(long j10, long j11) {
        this.f21911a = j10;
        this.f21912b = j11;
    }

    static g d(a0 a0Var, long j10, g0 g0Var) {
        long jE = e(a0Var, j10);
        return new g(jE, g0Var.b(jE));
    }

    static long e(a0 a0Var, long j10) {
        long jH = a0Var.H();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | a0Var.J()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // l9.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f21911a + ", playbackPositionUs= " + this.f21912b + " }";
    }
}
