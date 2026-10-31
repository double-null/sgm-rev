package s9;

import java.util.List;

/* JADX INFO: compiled from: LegacySubtitleUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class i {
    private static int a(k kVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int iA = kVar.a(j10);
        if (iA == -1) {
            iA = kVar.d();
        }
        return (iA <= 0 || kVar.c(iA + (-1)) != j10) ? iA : iA - 1;
    }

    private static void b(k kVar, int i10, x7.l<e> lVar) {
        long jC = kVar.c(i10);
        List<w7.a> listB = kVar.b(jC);
        if (listB.isEmpty()) {
            return;
        }
        if (i10 == kVar.d() - 1) {
            throw new IllegalStateException();
        }
        long jC2 = kVar.c(i10 + 1) - kVar.c(i10);
        if (jC2 > 0) {
            lVar.accept(new e(listB, jC, jC2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    public static void c(k kVar, r.b bVar, x7.l<e> lVar) {
        boolean z10;
        int iA = a(kVar, bVar.f25345a);
        if (bVar.f25345a == -9223372036854775807L || iA >= kVar.d()) {
            z10 = false;
        } else {
            List<w7.a> listB = kVar.b(bVar.f25345a);
            long jC = kVar.c(iA);
            if (listB.isEmpty()) {
                z10 = false;
            } else {
                long j10 = bVar.f25345a;
                if (j10 < jC) {
                    lVar.accept(new e(listB, j10, jC - j10));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = iA; i10 < kVar.d(); i10++) {
            b(kVar, i10, lVar);
        }
        if (bVar.f25346b) {
            if (z10) {
                iA--;
            }
            for (int i11 = 0; i11 < iA; i11++) {
                b(kVar, i11, lVar);
            }
            if (z10) {
                lVar.accept(new e(kVar.b(bVar.f25345a), kVar.c(iA), bVar.f25345a - kVar.c(iA)));
            }
        }
    }
}
