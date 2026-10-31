package aa;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.u;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import s9.e;
import s9.r;
import x7.a0;
import x7.l;
import x7.l0;
import x7.z;

/* JADX INFO: compiled from: VobsubParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f190a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f191b = new a0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f193d;

    public a(List<byte[]> list) {
        b bVar = new b();
        this.f192c = bVar;
        bVar.i(new String(list.get(0), StandardCharsets.UTF_8));
    }

    private w7.a d() {
        if (this.f193d == null) {
            this.f193d = new Inflater();
        }
        if (l0.P0(this.f190a, this.f191b, this.f193d)) {
            this.f190a.U(this.f191b.e(), this.f191b.g());
        }
        this.f192c.m();
        int iA = this.f190a.a();
        if (iA < 2 || this.f190a.P() != iA) {
            return null;
        }
        this.f192c.l(this.f190a);
        return this.f192c.a(this.f190a);
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<e> lVar) {
        this.f190a.U(bArr, i11 + i10);
        this.f190a.W(i10);
        w7.a aVarD = d();
        lVar.accept(new e(aVarD != null ? u.I(aVarD) : u.H(), -9223372036854775807L, 5000000L));
    }

    @Override // s9.r
    public int c() {
        return 2;
    }

    /* JADX INFO: compiled from: VobsubParser.java */
    private static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int[] f197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Rect f200g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f194a = new int[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f201h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f202i = -1;

        /* JADX INFO: renamed from: aa.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VobsubParser.java */
        private static final class C0003a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f204b;

            private C0003a() {
            }
        }

        private static int b(int[] iArr, int i10) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        private static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void d(int[] iArr, a0 a0Var, int i10) {
            while (a0Var.f() < i10 && a0Var.a() > 0) {
                switch (a0Var.H()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (!g(iArr, a0Var)) {
                            return;
                        }
                        break;
                    case 4:
                        if (!e(a0Var)) {
                            return;
                        }
                        break;
                    case 5:
                        if (!f(a0Var)) {
                            return;
                        }
                        break;
                    case 6:
                        if (!h(a0Var)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            }
        }

        private boolean e(a0 a0Var) {
            if (a0Var.a() < 2 || !this.f196c) {
                return false;
            }
            int iH = a0Var.H();
            int iH2 = a0Var.H();
            int[] iArr = this.f194a;
            iArr[3] = n(iArr[3], iH >> 4);
            int[] iArr2 = this.f194a;
            iArr2[2] = n(iArr2[2], iH & 15);
            int[] iArr3 = this.f194a;
            iArr3[1] = n(iArr3[1], iH2 >> 4);
            int[] iArr4 = this.f194a;
            iArr4[0] = n(iArr4[0], iH2 & 15);
            return true;
        }

        private boolean f(a0 a0Var) {
            if (a0Var.a() < 6) {
                return false;
            }
            int iH = a0Var.H();
            int iH2 = a0Var.H();
            int i10 = (iH << 4) | (iH2 >> 4);
            int iH3 = ((iH2 & 15) << 8) | a0Var.H();
            int iH4 = a0Var.H();
            int iH5 = a0Var.H();
            this.f200g = new Rect(i10, (iH4 << 4) | (iH5 >> 4), iH3 + 1, (a0Var.H() | ((iH5 & 15) << 8)) + 1);
            return true;
        }

        private boolean g(int[] iArr, a0 a0Var) {
            if (a0Var.a() < 2) {
                return false;
            }
            int iH = a0Var.H();
            int iH2 = a0Var.H();
            this.f194a[3] = b(iArr, iH >> 4);
            this.f194a[2] = b(iArr, iH & 15);
            this.f194a[1] = b(iArr, iH2 >> 4);
            this.f194a[0] = b(iArr, iH2 & 15);
            this.f196c = true;
            return true;
        }

        private boolean h(a0 a0Var) {
            if (a0Var.a() < 4) {
                return false;
            }
            this.f201h = a0Var.P();
            this.f202i = a0Var.P();
            return true;
        }

        private void j(z zVar, boolean z10, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i10 = !z10 ? 1 : 0;
            int i11 = i10 * iWidth;
            C0003a c0003a = new C0003a();
            while (true) {
                int i12 = 0;
                do {
                    k(zVar, iWidth, c0003a);
                    int iMin = Math.min(c0003a.f204b, iWidth - i12);
                    if (iMin > 0) {
                        int i13 = i11 + iMin;
                        Arrays.fill(iArr, i11, i13, this.f194a[c0003a.f203a]);
                        i12 += iMin;
                        i11 = i13;
                    }
                } while (i12 < iWidth);
                i10 += 2;
                if (i10 >= iHeight) {
                    return;
                }
                i11 = i10 * iWidth;
                zVar.c();
            }
        }

        private static void k(z zVar, int i10, C0003a c0003a) {
            int iH = 0;
            for (int i11 = 1; iH < i11 && i11 <= 64; i11 <<= 2) {
                if (zVar.b() < 4) {
                    c0003a.f203a = -1;
                    c0003a.f204b = 0;
                    return;
                }
                iH = (iH << 4) | zVar.h(4);
            }
            c0003a.f203a = iH & 3;
            if (iH >= 4) {
                i10 = iH >> 2;
            }
            c0003a.f204b = i10;
        }

        private static int n(int i10, int i11) {
            return (i10 & 16777215) | ((i11 * 17) << 24);
        }

        public w7.a a(a0 a0Var) {
            Rect rect;
            if (this.f197d == null || !this.f195b || !this.f196c || (rect = this.f200g) == null || this.f201h == -1 || this.f202i == -1 || rect.width() < 2 || this.f200g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f200g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            z zVar = new z();
            a0Var.W(this.f201h);
            zVar.m(a0Var);
            j(zVar, true, rect2, iArr);
            a0Var.W(this.f202i);
            zVar.m(a0Var);
            j(zVar, false, rect2, iArr);
            return new w7.a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f198e).l(0).h(rect2.top / this.f199f, 0).i(0).n(rect2.width() / this.f198e).g(rect2.height() / this.f199f).a();
        }

        public void l(a0 a0Var) {
            int[] iArr = this.f197d;
            if (iArr == null || !this.f195b) {
                return;
            }
            a0Var.X(a0Var.P() - 2);
            d(iArr, a0Var, a0Var.P());
        }

        public void m() {
            this.f196c = false;
            this.f200g = null;
            this.f201h = -1;
            this.f202i = -1;
        }

        public void i(String str) {
            for (String str2 : l0.m1(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrM1 = l0.m1(str2.substring(9), ",");
                    this.f197d = new int[strArrM1.length];
                    for (int i10 = 0; i10 < strArrM1.length; i10++) {
                        this.f197d[i10] = c(strArrM1[i10].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrM2 = l0.m1(str2.substring(6).trim(), "x");
                    if (strArrM2.length == 2) {
                        try {
                            this.f198e = Integer.parseInt(strArrM2[0]);
                            this.f199f = Integer.parseInt(strArrM2[1]);
                            this.f195b = true;
                        } catch (RuntimeException e10) {
                            x7.r.i("VobsubParser", RHIpdOnfgiYkEj.xIBeFg, e10);
                        }
                    }
                }
            }
        }
    }
}
