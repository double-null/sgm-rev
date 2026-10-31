package q9;

import com.google.common.collect.u;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import u7.q;
import v8.r0;
import x7.a0;

/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f24673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f24674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r0.c f24676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private r0.a f24677r;

    /* JADX INFO: compiled from: VorbisReader.java */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0.c f24678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0.a f24679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f24680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r0.b[] f24681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f24682e;

        public a(r0.c cVar, r0.a aVar, byte[] bArr, r0.b[] bVarArr, int i10) {
            this.f24678a = cVar;
            this.f24679b = aVar;
            this.f24680c = bArr;
            this.f24681d = bVarArr;
            this.f24682e = i10;
        }
    }

    j() {
    }

    static void n(a0 a0Var, long j10) {
        if (a0Var.b() < a0Var.g() + 4) {
            a0Var.T(Arrays.copyOf(a0Var.e(), a0Var.g() + 4));
        } else {
            a0Var.V(a0Var.g() + 4);
        }
        byte[] bArrE = a0Var.e();
        bArrE[a0Var.g() - 4] = (byte) (j10 & 255);
        bArrE[a0Var.g() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrE[a0Var.g() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrE[a0Var.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f24681d[p(b10, aVar.f24682e, 1)].f27421a ? aVar.f24678a.f27431g : aVar.f24678a.f27432h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(a0 a0Var) {
        try {
            return r0.o(1, a0Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // q9.i
    protected void e(long j10) {
        super.e(j10);
        this.f24675p = j10 != 0;
        r0.c cVar = this.f24676q;
        this.f24674o = cVar != null ? cVar.f27431g : 0;
    }

    @Override // q9.i
    protected long f(a0 a0Var) {
        if ((a0Var.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(a0Var.e()[0], (a) x7.a.i(this.f24673n));
        long j10 = this.f24675p ? (this.f24674o + iO) / 4 : 0;
        n(a0Var, j10);
        this.f24675p = true;
        this.f24674o = iO;
        return j10;
    }

    @Override // q9.i
    protected boolean i(a0 a0Var, long j10, i.b bVar) throws IOException {
        if (this.f24673n != null) {
            x7.a.e(bVar.f24671a);
            return false;
        }
        a aVarQ = q(a0Var);
        this.f24673n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        r0.c cVar = aVarQ.f24678a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f27434j);
        arrayList.add(aVarQ.f24680c);
        bVar.f24671a = new q.b().U("audio/ogg").u0("audio/vorbis").Q(cVar.f27429e).p0(cVar.f27428d).R(cVar.f27426b).v0(cVar.f27427c).g0(arrayList).n0(r0.d(u.D(aVarQ.f24679b.f27419b))).N();
        return true;
    }

    @Override // q9.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f24673n = null;
            this.f24676q = null;
            this.f24677r = null;
        }
        this.f24674o = 0;
        this.f24675p = false;
    }

    a q(a0 a0Var) throws IOException {
        r0.c cVar = this.f24676q;
        if (cVar == null) {
            this.f24676q = r0.l(a0Var);
            return null;
        }
        r0.a aVar = this.f24677r;
        if (aVar == null) {
            this.f24677r = r0.j(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.g()];
        System.arraycopy(a0Var.e(), 0, bArr, 0, a0Var.g());
        r0.b[] bVarArrM = r0.m(a0Var, cVar.f27426b);
        return new a(cVar, aVar, bArr, bVarArrM, r0.b(bVarArrM.length - 1));
    }
}
