package p8;

import com.google.common.collect.u;
import com.google.common.collect.y;
import java.util.ArrayList;

/* JADX INFO: compiled from: ReplacingCuesResolver.java */
/* JADX INFO: loaded from: classes4.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<s9.e> f23510a = new ArrayList<>();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f23510a.size(); i10++) {
            if (j10 < this.f23510a.get(i10).f25317b) {
                return i10;
            }
        }
        return this.f23510a.size();
    }

    @Override // p8.a
    public u<w7.a> a(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return u.H();
        }
        s9.e eVar = this.f23510a.get(iF - 1);
        long j11 = eVar.f25319d;
        return (j11 == -9223372036854775807L || j10 < j11) ? eVar.f25316a : u.H();
    }

    @Override // p8.a
    public long b(long j10) {
        if (this.f23510a.isEmpty() || j10 < this.f23510a.get(0).f25317b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f23510a.size(); i10++) {
            long j11 = this.f23510a.get(i10).f25317b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                s9.e eVar = this.f23510a.get(i10 - 1);
                long j12 = eVar.f25319d;
                return (j12 == -9223372036854775807L || j12 > j10) ? eVar.f25317b : j12;
            }
        }
        s9.e eVar2 = (s9.e) y.d(this.f23510a);
        long j13 = eVar2.f25319d;
        return (j13 == -9223372036854775807L || j10 < j13) ? eVar2.f25317b : j13;
    }

    @Override // p8.a
    public long c(long j10) {
        if (this.f23510a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < this.f23510a.get(0).f25317b) {
            return this.f23510a.get(0).f25317b;
        }
        for (int i10 = 1; i10 < this.f23510a.size(); i10++) {
            s9.e eVar = this.f23510a.get(i10);
            if (j10 < eVar.f25317b) {
                long j11 = this.f23510a.get(i10 - 1).f25319d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= eVar.f25317b) ? eVar.f25317b : j11;
            }
        }
        long j12 = ((s9.e) y.d(this.f23510a)).f25319d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // p8.a
    public void clear() {
        this.f23510a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // p8.a
    public boolean d(s9.e eVar, long j10) {
        boolean z10;
        x7.a.a(eVar.f25317b != -9223372036854775807L);
        if (eVar.f25317b <= j10) {
            long j11 = eVar.f25319d;
            if (j11 == -9223372036854775807L || j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        for (int size = this.f23510a.size() - 1; size >= 0; size--) {
            if (eVar.f25317b >= this.f23510a.get(size).f25317b) {
                this.f23510a.add(size + 1, eVar);
                return z10;
            }
            if (this.f23510a.get(size).f25317b <= j10) {
                z10 = false;
            }
        }
        this.f23510a.add(0, eVar);
        return z10;
    }

    @Override // p8.a
    public void e(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return;
        }
        long j11 = this.f23510a.get(iF - 1).f25319d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iF--;
        }
        this.f23510a.subList(0, iF).clear();
    }
}
