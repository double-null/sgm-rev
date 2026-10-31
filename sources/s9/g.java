package s9;

import com.google.common.collect.n0;
import com.google.common.collect.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x7.l0;

/* JADX INFO: compiled from: CuesWithTimingSubtitle.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n0<e> f25320c = n0.e().f(new com.google.common.base.g() { // from class: s9.f
        @Override // com.google.common.base.g
        public final Object apply(Object obj) {
            return g.g((e) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.u<com.google.common.collect.u<w7.a>> f25321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f25322b;

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public g(List<e> list) {
        if (list.size() == 1) {
            e eVar = (e) y.g(list);
            long jH = h(eVar.f25317b);
            if (eVar.f25318c == -9223372036854775807L) {
                this.f25321a = com.google.common.collect.u.I(eVar.f25316a);
                this.f25322b = new long[]{jH};
                return;
            } else {
                this.f25321a = com.google.common.collect.u.K(eVar.f25316a, com.google.common.collect.u.H());
                this.f25322b = new long[]{jH, jH + eVar.f25318c};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f25322b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        com.google.common.collect.u uVarE0 = com.google.common.collect.u.e0(f25320c, list);
        int i10 = 0;
        for (int i11 = 0; i11 < uVarE0.size(); i11++) {
            e eVar2 = (e) uVarE0.get(i11);
            long jH2 = h(eVar2.f25317b);
            long j10 = eVar2.f25318c + jH2;
            if (i10 != 0) {
                int i12 = i10 - 1;
                long j11 = this.f25322b[i12];
                if (j11 < jH2) {
                    this.f25322b[i10] = jH2;
                    arrayList.add(eVar2.f25316a);
                    i10++;
                } else if (j11 == jH2 && ((com.google.common.collect.u) arrayList.get(i12)).isEmpty()) {
                    arrayList.set(i12, eVar2.f25316a);
                } else {
                    x7.r.h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f25322b[i12] = jH2;
                    arrayList.set(i12, eVar2.f25316a);
                }
            } else {
                this.f25322b[i10] = jH2;
                arrayList.add(eVar2.f25316a);
                i10++;
            }
            if (eVar2.f25318c != -9223372036854775807L) {
                this.f25322b[i10] = j10;
                arrayList.add(com.google.common.collect.u.H());
                i10++;
            }
        }
        this.f25321a = com.google.common.collect.u.B(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable g(e eVar) {
        return Long.valueOf(h(eVar.f25317b));
    }

    private static long h(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }

    @Override // s9.k
    public int a(long j10) {
        int iD = l0.d(this.f25322b, j10, false, false);
        if (iD < this.f25321a.size()) {
            return iD;
        }
        return -1;
    }

    @Override // s9.k
    public long c(int i10) {
        x7.a.a(i10 < this.f25321a.size());
        return this.f25322b[i10];
    }

    @Override // s9.k
    public int d() {
        return this.f25321a.size();
    }

    @Override // s9.k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.google.common.collect.u<w7.a> b(long j10) {
        int iH = l0.h(this.f25322b, j10, true, false);
        return iH == -1 ? com.google.common.collect.u.H() : this.f25321a.get(iH);
    }
}
