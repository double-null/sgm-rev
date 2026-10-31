package v8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f27449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f27450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u7.v f27451l;

    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f27452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f27453b;

        public a(long[] jArr, long[] jArr2) {
            this.f27452a = jArr;
            this.f27453b = jArr2;
        }
    }

    public y(byte[] bArr, int i10) {
        x7.z zVar = new x7.z(bArr);
        zVar.p(i10 * 8);
        this.f27440a = zVar.h(16);
        this.f27441b = zVar.h(16);
        this.f27442c = zVar.h(24);
        this.f27443d = zVar.h(24);
        int iH = zVar.h(20);
        this.f27444e = iH;
        this.f27445f = j(iH);
        this.f27446g = zVar.h(3) + 1;
        int iH2 = zVar.h(5) + 1;
        this.f27447h = iH2;
        this.f27448i = e(iH2);
        this.f27449j = zVar.j(36);
        this.f27450k = null;
        this.f27451l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List<h9.a> list) {
        return new y(this.f27440a, this.f27441b, this.f27442c, this.f27443d, this.f27444e, this.f27446g, this.f27447h, this.f27449j, this.f27450k, h(new u7.v(list)));
    }

    public y b(a aVar) {
        return new y(this.f27440a, this.f27441b, this.f27442c, this.f27443d, this.f27444e, this.f27446g, this.f27447h, this.f27449j, aVar, this.f27451l);
    }

    public y c(List<String> list) {
        return new y(this.f27440a, this.f27441b, this.f27442c, this.f27443d, this.f27444e, this.f27446g, this.f27447h, this.f27449j, this.f27450k, h(r0.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f27443d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f27442c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f27440a;
            j10 = ((((i11 != this.f27441b || i11 <= 0) ? 4096L : i11) * ((long) this.f27446g)) * ((long) this.f27447h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f27449j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f27444e);
    }

    public u7.q g(byte[] bArr, u7.v vVar) {
        bArr[4] = -128;
        int i10 = this.f27443d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new u7.q.b().u0("audio/flac").k0(i10).R(this.f27446g).v0(this.f27444e).o0(x7.l0.i0(this.f27447h)).g0(Collections.singletonList(bArr)).n0(h(vVar)).N();
    }

    public u7.v h(u7.v vVar) {
        u7.v vVar2 = this.f27451l;
        return vVar2 == null ? vVar : vVar2.b(vVar);
    }

    public long i(long j10) {
        return x7.l0.q((j10 * ((long) this.f27444e)) / 1000000, 0L, this.f27449j - 1);
    }

    private y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, u7.v vVar) {
        this.f27440a = i10;
        this.f27441b = i11;
        this.f27442c = i12;
        this.f27443d = i13;
        this.f27444e = i14;
        this.f27445f = j(i14);
        this.f27446g = i15;
        this.f27447h = i16;
        this.f27448i = e(i16);
        this.f27449j = j10;
        this.f27450k = aVar;
        this.f27451l = vVar;
    }
}
