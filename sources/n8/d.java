package n8;

import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.source.g0;
import java.util.List;

/* JADX INFO: compiled from: CompositeSequenceableLoader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.u<a> f22772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f22773b;

    /* JADX INFO: compiled from: CompositeSequenceableLoader.java */
    private static final class a implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g0 f22774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.collect.u<Integer> f22775b;

        public a(g0 g0Var, List<Integer> list) {
            this.f22774a = g0Var;
            this.f22775b = com.google.common.collect.u.B(list);
        }

        public com.google.common.collect.u<Integer> a() {
            return this.f22775b;
        }

        @Override // io.bidmachine.media3.exoplayer.source.g0
        public long b() {
            return this.f22774a.b();
        }

        @Override // io.bidmachine.media3.exoplayer.source.g0
        public boolean c(k1 k1Var) {
            return this.f22774a.c(k1Var);
        }

        @Override // io.bidmachine.media3.exoplayer.source.g0
        public long f() {
            return this.f22774a.f();
        }

        @Override // io.bidmachine.media3.exoplayer.source.g0
        public void g(long j10) {
            this.f22774a.g(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.source.g0
        public boolean isLoading() {
            return this.f22774a.isLoading();
        }
    }

    public d(List<? extends g0> list, List<List<Integer>> list2) {
        com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
        x7.a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarV.a(new a(list.get(i10), list2.get(i10)));
        }
        this.f22772a = aVarV.m();
        this.f22773b = -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f22772a.size(); i10++) {
            long jB = this.f22772a.get(i10).b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        boolean zC;
        boolean z10 = false;
        do {
            long jB = b();
            if (jB == Long.MIN_VALUE) {
                break;
            }
            zC = false;
            for (int i10 = 0; i10 < this.f22772a.size(); i10++) {
                long jB2 = this.f22772a.get(i10).b();
                boolean z11 = jB2 != Long.MIN_VALUE && jB2 <= k1Var.f19124a;
                if (jB2 == jB || z11) {
                    zC |= this.f22772a.get(i10).c(k1Var);
                }
            }
            z10 |= zC;
        } while (zC);
        return z10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f22772a.size(); i10++) {
            a aVar = this.f22772a.get(i10);
            long jF = aVar.f();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
            if (jF != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jF);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f22773b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f22773b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        for (int i10 = 0; i10 < this.f22772a.size(); i10++) {
            this.f22772a.get(i10).g(j10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        for (int i10 = 0; i10 < this.f22772a.size(); i10++) {
            if (this.f22772a.get(i10).isLoading()) {
                return true;
            }
        }
        return false;
    }
}
