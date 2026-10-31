package v9;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import s9.e;
import s9.r;
import x7.a0;
import x7.l;
import x7.l0;

/* JADX INFO: compiled from: PgsParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f27455a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f27456b = new a0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0457a f27457c = new C0457a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f27458d;

    /* JADX INFO: renamed from: v9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PgsParser.java */
    private static final class C0457a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0 f27459a = new a0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f27460b = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f27461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f27463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f27464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f27465g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27466h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27467i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(a0 a0Var, int i10) {
            int iK;
            if (i10 < 4) {
                return;
            }
            a0Var.X(3);
            int i11 = i10 - 4;
            if ((a0Var.H() & 128) != 0) {
                if (i11 < 7 || (iK = a0Var.K()) < 4) {
                    return;
                }
                this.f27466h = a0Var.P();
                this.f27467i = a0Var.P();
                this.f27459a.S(iK - 4);
                i11 -= 7;
            }
            int iF = this.f27459a.f();
            int iG = this.f27459a.g();
            if (iF >= iG || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iG - iF);
            a0Var.l(this.f27459a.e(), iF, iMin);
            this.f27459a.W(iF + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(a0 a0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f27462d = a0Var.P();
            this.f27463e = a0Var.P();
            a0Var.X(11);
            this.f27464f = a0Var.P();
            this.f27465g = a0Var.P();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(a0 a0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            a0Var.X(2);
            Arrays.fill(this.f27460b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iH = a0Var.H();
                int iH2 = a0Var.H();
                int iH3 = a0Var.H();
                int iH4 = a0Var.H();
                double d10 = iH2;
                double d11 = iH3 - 128;
                double d12 = iH4 - 128;
                this.f27460b[iH] = (l0.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (a0Var.H() << 24) | (l0.p((int) ((1.402d * d11) + d10), 0, 255) << 16) | l0.p((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f27461c = true;
        }

        public w7.a d() {
            int iH;
            if (this.f27462d == 0 || this.f27463e == 0 || this.f27466h == 0 || this.f27467i == 0 || this.f27459a.g() == 0 || this.f27459a.f() != this.f27459a.g() || !this.f27461c) {
                return null;
            }
            this.f27459a.W(0);
            int i10 = this.f27466h * this.f27467i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iH2 = this.f27459a.H();
                if (iH2 != 0) {
                    iH = i11 + 1;
                    iArr[i11] = this.f27460b[iH2];
                } else {
                    int iH3 = this.f27459a.H();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f27459a.H()) + i11;
                        Arrays.fill(iArr, i11, iH, (iH3 & 128) == 0 ? this.f27460b[0] : this.f27460b[this.f27459a.H()]);
                    }
                }
                i11 = iH;
            }
            return new w7.a.b().f(Bitmap.createBitmap(iArr, this.f27466h, this.f27467i, Bitmap.Config.ARGB_8888)).k(this.f27464f / this.f27462d).l(0).h(this.f27465g / this.f27463e, 0).i(0).n(this.f27466h / this.f27462d).g(this.f27467i / this.f27463e).a();
        }

        public void h() {
            this.f27462d = 0;
            this.f27463e = 0;
            this.f27464f = 0;
            this.f27465g = 0;
            this.f27466h = 0;
            this.f27467i = 0;
            this.f27459a.S(0);
            this.f27461c = false;
        }
    }

    private static w7.a d(a0 a0Var, C0457a c0457a) {
        int iG = a0Var.g();
        int iH = a0Var.H();
        int iP = a0Var.P();
        int iF = a0Var.f() + iP;
        w7.a aVarD = null;
        if (iF > iG) {
            a0Var.W(iG);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c0457a.g(a0Var, iP);
                    break;
                case 21:
                    c0457a.e(a0Var, iP);
                    break;
                case 22:
                    c0457a.f(a0Var, iP);
                    break;
            }
        } else {
            aVarD = c0457a.d();
            c0457a.h();
        }
        a0Var.W(iF);
        return aVarD;
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<e> lVar) {
        this.f27455a.U(bArr, i11 + i10);
        this.f27455a.W(i10);
        if (this.f27458d == null) {
            this.f27458d = new Inflater();
        }
        if (l0.P0(this.f27455a, this.f27456b, this.f27458d)) {
            this.f27455a.U(this.f27456b.e(), this.f27456b.g());
        }
        this.f27457c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f27455a.a() >= 3) {
            w7.a aVarD = d(this.f27455a, this.f27457c);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        lVar.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // s9.r
    public int c() {
        return 2;
    }
}
