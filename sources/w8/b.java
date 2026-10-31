package w8;

import io.bidmachine.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import u7.q;
import v8.e0;
import v8.h;
import v8.i0;
import v8.j0;
import v8.m;
import v8.o0;
import v8.p;
import v8.r;
import v8.u;
import x7.l0;

/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f27599s = new u() { // from class: w8.a
        @Override // v8.u
        public final p[] g() {
            return b.p();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f27600t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f27601u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f27602v = l0.u0("#!AMR\n");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f27603w = l0.u0("#!AMR-WB\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f27606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f27608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f27611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f27614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f27615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o0 f27616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f27617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j0 f27618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f27619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f27620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27621r;

    public b() {
        this(0);
    }

    private void d() {
        x7.a.i(this.f27616m);
        l0.i(this.f27615l);
    }

    private static int g(int i10, long j10) {
        return (int) (((((long) i10) * 8) * 1000000) / j10);
    }

    private j0 h(long j10, boolean z10) {
        return new h(j10, this.f27611h, g(this.f27612i, 20000L), this.f27612i, z10);
    }

    private int j(int i10) throws ParserException {
        if (n(i10)) {
            return this.f27607d ? f27601u[i10] : f27600t[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f27607d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.b(sb2.toString(), null);
    }

    private boolean k(int i10) {
        return !this.f27607d && (i10 < 12 || i10 > 14);
    }

    private boolean m(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    private boolean n(int i10) {
        return i10 >= 0 && i10 <= 15 && (o(i10) || k(i10));
    }

    private boolean o(int i10) {
        return this.f27607d && (i10 < 10 || i10 > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p[] p() {
        return new p[]{new b()};
    }

    private void q() {
        if (this.f27621r) {
            return;
        }
        this.f27621r = true;
        boolean z10 = this.f27607d;
        String str = z10 ? "audio/amr-wb" : "audio/amr";
        this.f27616m.a(new q.b().U(str).u0(z10 ? "audio/amr-wb" : "audio/3gpp").k0(z10 ? f27601u[8] : f27600t[7]).R(1).v0(z10 ? 16000 : 8000).N());
    }

    private void r(long j10, int i10) {
        int i11;
        if (this.f27618o != null) {
            return;
        }
        int i12 = this.f27605b;
        if ((i12 & 4) != 0) {
            this.f27618o = new e0(new long[]{this.f27611h}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f27612i) == -1 || i11 == this.f27609f)) {
            this.f27618o = new j0.b(-9223372036854775807L);
        } else if (this.f27613j >= 20 || i10 == -1) {
            j0 j0VarH = h(j10, (i12 & 2) != 0);
            this.f27618o = j0VarH;
            this.f27616m.g(j0VarH.k());
        }
        j0 j0Var = this.f27618o;
        if (j0Var != null) {
            this.f27615l.h(j0Var);
        }
    }

    private static boolean s(v8.q qVar, byte[] bArr) throws IOException {
        qVar.d();
        byte[] bArr2 = new byte[bArr.length];
        qVar.n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int t(v8.q qVar) throws IOException {
        qVar.d();
        qVar.n(this.f27604a, 0, 1);
        byte b10 = this.f27604a[0];
        if ((b10 & 131) <= 0) {
            return j((b10 >> 3) & 15);
        }
        throw ParserException.b("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean u(v8.q qVar) throws IOException {
        byte[] bArr = f27602v;
        if (s(qVar, bArr)) {
            this.f27607d = false;
            qVar.k(bArr.length);
            return true;
        }
        byte[] bArr2 = f27603w;
        if (!s(qVar, bArr2)) {
            return false;
        }
        this.f27607d = true;
        qVar.k(bArr2.length);
        return true;
    }

    private int v(v8.q qVar) throws IOException {
        if (this.f27610g == 0) {
            try {
                int iT = t(qVar);
                this.f27609f = iT;
                this.f27610g = iT;
                if (this.f27612i == -1) {
                    this.f27611h = qVar.getPosition();
                    this.f27612i = this.f27609f;
                }
                if (this.f27612i == this.f27609f) {
                    this.f27613j++;
                }
                j0 j0Var = this.f27618o;
                if (j0Var instanceof e0) {
                    e0 e0Var = (e0) j0Var;
                    long j10 = this.f27614k + this.f27608e + 20000;
                    long position = qVar.getPosition() + ((long) this.f27609f);
                    if (!e0Var.c(j10, 100000L)) {
                        e0Var.a(j10, position);
                    }
                    if (this.f27619p && m(j10, this.f27620q)) {
                        this.f27619p = false;
                        this.f27617n = this.f27616m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iC = this.f27617n.c(qVar, this.f27610g, true);
        if (iC == -1) {
            return -1;
        }
        int i10 = this.f27610g - iC;
        this.f27610g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f27617n.f(this.f27614k + this.f27608e, 1, this.f27609f, 0, null);
        this.f27608e += 20000;
        return 0;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f27608e = 0L;
        this.f27609f = 0;
        this.f27610g = 0;
        this.f27620q = j11;
        j0 j0Var = this.f27618o;
        if (!(j0Var instanceof e0)) {
            if (j10 == 0 || !(j0Var instanceof h)) {
                this.f27614k = 0L;
                return;
            } else {
                this.f27614k = ((h) j0Var).c(j10);
                return;
            }
        }
        long jB = ((e0) j0Var).b(j10);
        this.f27614k = jB;
        if (m(jB, this.f27620q)) {
            return;
        }
        this.f27619p = true;
        this.f27617n = this.f27606c;
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f27615l = rVar;
        o0 o0VarE = rVar.e(0, 1);
        this.f27616m = o0VarE;
        this.f27617n = o0VarE;
        rVar.r();
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        return u(qVar);
    }

    @Override // v8.p
    public int l(v8.q qVar, i0 i0Var) throws IOException {
        d();
        if (qVar.getPosition() == 0 && !u(qVar)) {
            throw ParserException.b("Could not find AMR header.", null);
        }
        q();
        int iV = v(qVar);
        r(qVar.getLength(), iV);
        if (iV == -1) {
            j0 j0Var = this.f27618o;
            if (j0Var instanceof e0) {
                long j10 = this.f27614k + this.f27608e;
                ((e0) j0Var).e(j10);
                this.f27615l.h(this.f27618o);
                this.f27616m.g(j10);
            }
        }
        return iV;
    }

    public b(int i10) {
        this.f27605b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f27604a = new byte[1];
        this.f27612i = -1;
        m mVar = new m();
        this.f27606c = mVar;
        this.f27617n = mVar;
    }

    @Override // v8.p
    public void release() {
    }
}
