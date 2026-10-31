package p8;

import com.google.common.collect.n0;
import com.google.common.collect.u;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MergingCuesResolver.java */
/* JADX INFO: loaded from: classes4.dex */
final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n0<s9.e> f23508b = n0.e().f(new com.google.common.base.g() { // from class: p8.c
        @Override // com.google.common.base.g
        public final Object apply(Object obj) {
            return e.h((s9.e) obj);
        }
    }).b(n0.e().g().f(new com.google.common.base.g() { // from class: p8.d
        @Override // com.google.common.base.g
        public final Object apply(Object obj) {
            return e.i((s9.e) obj);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<s9.e> f23509a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long h(s9.e eVar) {
        return Long.valueOf(eVar.f25317b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long i(s9.e eVar) {
        return Long.valueOf(eVar.f25318c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p8.a
    public u<w7.a> a(long j10) {
        if (!this.f23509a.isEmpty()) {
            if (j10 >= this.f23509a.get(0).f25317b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f23509a.size(); i10++) {
                    s9.e eVar = this.f23509a.get(i10);
                    if (j10 >= eVar.f25317b && j10 < eVar.f25319d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f25317b) {
                        break;
                    }
                }
                u uVarE0 = u.e0(f23508b, arrayList);
                u.a aVarV = u.v();
                for (int i11 = 0; i11 < uVarE0.size(); i11++) {
                    aVarV.k(((s9.e) uVarE0.get(i11)).f25316a);
                }
                return aVarV.m();
            }
        }
        return u.H();
    }

    @Override // p8.a
    public long b(long j10) {
        if (this.f23509a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < this.f23509a.get(0).f25317b) {
            return -9223372036854775807L;
        }
        long jMax = this.f23509a.get(0).f25317b;
        for (int i10 = 0; i10 < this.f23509a.size(); i10++) {
            long j11 = this.f23509a.get(i10).f25317b;
            long j12 = this.f23509a.get(i10).f25319d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // p8.a
    public long c(long j10) {
        long jMin = -9223372036854775807L;
        for (int i10 = 0; i10 < this.f23509a.size(); i10++) {
            long j11 = this.f23509a.get(i10).f25317b;
            long j12 = this.f23509a.get(i10).f25319d;
            if (j10 < j11) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j11);
                    break;
                }
                jMin = j11;
                break;
            }
            if (j10 < j12) {
                jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p8.a
    public void clear() {
        this.f23509a.clear();
    }

    @Override // p8.a
    public boolean d(s9.e eVar, long j10) {
        x7.a.a(eVar.f25317b != -9223372036854775807L);
        x7.a.a(eVar.f25318c != -9223372036854775807L);
        boolean z10 = eVar.f25317b <= j10 && j10 < eVar.f25319d;
        for (int size = this.f23509a.size() - 1; size >= 0; size--) {
            if (eVar.f25317b >= this.f23509a.get(size).f25317b) {
                this.f23509a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f23509a.add(0, eVar);
        return z10;
    }

    @Override // p8.a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f23509a.size()) {
            long j11 = this.f23509a.get(i10).f25317b;
            if (j10 > j11 && j10 > this.f23509a.get(i10).f25319d) {
                this.f23509a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
