package q9;

import java.util.Arrays;
import v8.j0;
import v8.q;
import v8.v;
import v8.w;
import v8.x;
import v8.y;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y f24629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f24630o;

    /* JADX INFO: compiled from: FlacReader.java */
    private static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f24631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y.a f24632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f24633c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f24634d = -1;

        public a(y yVar, y.a aVar) {
            this.f24631a = yVar;
            this.f24632b = aVar;
        }

        @Override // q9.g
        public long a(q qVar) {
            long j10 = this.f24634d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f24634d = -1L;
            return j11;
        }

        @Override // q9.g
        public j0 b() {
            x7.a.g(this.f24633c != -1);
            return new x(this.f24631a, this.f24633c);
        }

        @Override // q9.g
        public void c(long j10) {
            long[] jArr = this.f24632b.f27452a;
            this.f24634d = jArr[l0.h(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f24633c = j10;
        }
    }

    b() {
    }

    private int n(a0 a0Var) {
        int i10 = (a0Var.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            a0Var.X(4);
            a0Var.Q();
        }
        int iJ = v.j(a0Var, i10);
        a0Var.W(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(a0 a0Var) {
        return a0Var.a() >= 5 && a0Var.H() == 127 && a0Var.J() == 1179402563;
    }

    @Override // q9.i
    protected long f(a0 a0Var) {
        if (o(a0Var.e())) {
            return n(a0Var);
        }
        return -1L;
    }

    @Override // q9.i
    protected boolean i(a0 a0Var, long j10, i.b bVar) {
        byte[] bArrE = a0Var.e();
        y yVar = this.f24629n;
        if (yVar == null) {
            y yVar2 = new y(bArrE, 17);
            this.f24629n = yVar2;
            bVar.f24671a = yVar2.g(Arrays.copyOfRange(bArrE, 9, a0Var.g()), null).b().U("audio/ogg").N();
            return true;
        }
        if ((bArrE[0] & 127) == 3) {
            y.a aVarG = w.g(a0Var);
            y yVarB = yVar.b(aVarG);
            this.f24629n = yVarB;
            this.f24630o = new a(yVarB, aVarG);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f24630o;
        if (aVar != null) {
            aVar.d(j10);
            bVar.f24672b = this.f24630o;
        }
        x7.a.e(bVar.f24671a);
        return false;
    }

    @Override // q9.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f24629n = null;
            this.f24630o = null;
        }
    }
}
