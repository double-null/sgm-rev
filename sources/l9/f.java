package l9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x7.a0;

/* JADX INFO: compiled from: SpliceScheduleCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends l9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f21897a;

    /* JADX INFO: compiled from: SpliceScheduleCommand.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21899b;

        private b(int i10, long j10) {
            this.f21898a = i10;
            this.f21899b = j10;
        }
    }

    /* JADX INFO: compiled from: SpliceScheduleCommand.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f21904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f21905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f21906g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f21907h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f21908i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f21909j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f21910k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f21900a = j10;
            this.f21901b = z10;
            this.f21902c = z11;
            this.f21903d = z12;
            this.f21905f = Collections.unmodifiableList(list);
            this.f21904e = j11;
            this.f21906g = z13;
            this.f21907h = j12;
            this.f21908i = i10;
            this.f21909j = i11;
            this.f21910k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(a0 a0Var) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int iH;
            boolean z12;
            boolean z13;
            long J;
            long J2 = a0Var.J();
            boolean z14 = (a0Var.H() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iH = 0;
                z12 = false;
            } else {
                int iH2 = a0Var.H();
                boolean z15 = (iH2 & 128) != 0;
                boolean z16 = (iH2 & 64) != 0;
                boolean z17 = (iH2 & 32) != 0;
                long J3 = z16 ? a0Var.J() : -9223372036854775807L;
                if (!z16) {
                    int iH3 = a0Var.H();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    for (int i12 = 0; i12 < iH3; i12++) {
                        arrayList3.add(new b(a0Var.H(), a0Var.J()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jH = a0Var.H();
                    boolean z18 = (128 & jH) != 0;
                    J = ((((jH & 1) << 32) | a0Var.J()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    J = -9223372036854775807L;
                }
                int iP = a0Var.P();
                int iH4 = a0Var.H();
                z12 = z16;
                iH = a0Var.H();
                j11 = J;
                arrayList = arrayList2;
                long j12 = J3;
                i10 = iP;
                i11 = iH4;
                j10 = j12;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(J2, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, iH);
        }
    }

    private f(List<c> list) {
        this.f21897a = Collections.unmodifiableList(list);
    }

    static f d(a0 a0Var) {
        int iH = a0Var.H();
        ArrayList arrayList = new ArrayList(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            arrayList.add(c.b(a0Var));
        }
        return new f(arrayList);
    }
}
