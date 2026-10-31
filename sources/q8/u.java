package q8;

import android.graphics.Point;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import n8.x;
import u7.e0;
import u7.h0;
import x7.l0;

/* JADX INFO: compiled from: TrackSelectionUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class u {
    public static h0 a(s.a aVar, List<? extends t>[] listArr) {
        boolean z10;
        com.google.common.collect.u.a aVar2 = new com.google.common.collect.u.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            x xVarF = aVar.f(i10);
            List<? extends t> list = listArr[i10];
            for (int i11 = 0; i11 < xVarF.f22837a; i11++) {
                e0 e0VarB = xVarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = e0VarB.f26054a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < e0VarB.f26054a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        t tVar = list.get(i14);
                        if (tVar.m().equals(e0VarB) && tVar.k(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new h0.a(e0VarB, z11, iArr, zArr));
            }
        }
        x xVarH = aVar.h();
        for (int i15 = 0; i15 < xVarH.f22837a; i15++) {
            e0 e0VarB2 = xVarH.b(i15);
            int[] iArr2 = new int[e0VarB2.f26054a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new h0.a(e0VarB2, false, iArr2, new boolean[e0VarB2.f26054a]));
        }
        return new h0(aVar2.m());
    }

    public static h0 b(s.a aVar, t[] tVarArr) {
        List[] listArr = new List[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            t tVar = tVarArr[i10];
            listArr[i10] = tVar != null ? com.google.common.collect.u.I(tVar) : com.google.common.collect.u.H();
        }
        return a(aVar, listArr);
    }

    public static io.bidmachine.media3.exoplayer.upstream.b.a c(q qVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = qVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (qVar.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new io.bidmachine.media3.exoplayer.upstream.b.a(1, 0, length, i10);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    public static Point d(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            if ((i12 > i13) == (i10 > i11)) {
                i11 = i10;
                i10 = i11;
            }
        } else {
            i11 = i10;
            i10 = i11;
        }
        int i14 = i12 * i10;
        int i15 = i13 * i11;
        return i14 >= i15 ? new Point(i11, l0.k(i15, i12)) : new Point(l0.k(i14, i13), i10);
    }
}
