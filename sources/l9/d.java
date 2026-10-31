package l9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x7.a0;
import x7.g0;

/* JADX INFO: compiled from: SpliceInsertCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends l9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f21888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f21890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f21891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f21892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f21893m;

    /* JADX INFO: compiled from: SpliceInsertCommand.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f21896c;

        private b(int i10, long j10, long j11) {
            this.f21894a = i10;
            this.f21895b = j10;
            this.f21896c = j11;
        }
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f21881a = j10;
        this.f21882b = z10;
        this.f21883c = z11;
        this.f21884d = z12;
        this.f21885e = z13;
        this.f21886f = j11;
        this.f21887g = j12;
        this.f21888h = Collections.unmodifiableList(list);
        this.f21889i = z14;
        this.f21890j = j13;
        this.f21891k = i10;
        this.f21892l = i11;
        this.f21893m = i12;
    }

    static d d(a0 a0Var, long j10, g0 g0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int iP;
        int iH;
        int iH2;
        boolean z13;
        boolean z14;
        long J;
        long J2 = a0Var.J();
        boolean z15 = (a0Var.H() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            iP = 0;
            iH = 0;
            iH2 = 0;
            z13 = false;
        } else {
            int iH3 = a0Var.H();
            boolean z16 = (iH3 & 128) != 0;
            boolean z17 = (iH3 & 64) != 0;
            boolean z18 = (iH3 & 32) != 0;
            boolean z19 = (iH3 & 16) != 0;
            long jE = (!z17 || z19) ? -9223372036854775807L : g.e(a0Var, j10);
            if (!z17) {
                int iH4 = a0Var.H();
                ArrayList arrayList = new ArrayList(iH4);
                for (int i10 = 0; i10 < iH4; i10++) {
                    int iH5 = a0Var.H();
                    long jE2 = !z19 ? g.e(a0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(iH5, jE2, g0Var.b(jE2)));
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jH = a0Var.H();
                boolean z20 = (128 & jH) != 0;
                J = ((((jH & 1) << 32) | a0Var.J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                J = -9223372036854775807L;
            }
            iP = a0Var.P();
            z13 = z17;
            iH = a0Var.H();
            iH2 = a0Var.H();
            list = listEmptyList;
            long j13 = jE;
            z12 = z14;
            j12 = J;
            z11 = z19;
            z10 = z16;
            j11 = j13;
        }
        return new d(J2, z15, z10, z13, z11, j11, g0Var.b(j11), list, z12, j12, iP, iH, iH2);
    }

    @Override // l9.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f21886f + ", programSplicePlaybackPositionUs= " + this.f21887g + " }";
    }
}
