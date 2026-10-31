package u7;

import java.util.Arrays;

/* JADX INFO: compiled from: ColorInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f26068h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f26069i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f26070j = x7.l0.C0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f26071k = x7.l0.C0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f26072l = x7.l0.C0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f26073m = x7.l0.C0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f26074n = x7.l0.C0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f26075o = x7.l0.C0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f26079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26082g;

    /* JADX INFO: compiled from: ColorInfo.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f26086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f26087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f26088f;

        public g a() {
            return new g(this.f26083a, this.f26084b, this.f26085c, this.f26086d, this.f26087e, this.f26088f);
        }

        public b b(int i10) {
            this.f26088f = i10;
            return this;
        }

        public b c(int i10) {
            this.f26084b = i10;
            return this;
        }

        public b d(int i10) {
            this.f26083a = i10;
            return this;
        }

        public b e(int i10) {
            this.f26085c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f26086d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f26087e = i10;
            return this;
        }

        public b() {
            this.f26083a = -1;
            this.f26084b = -1;
            this.f26085c = -1;
            this.f26087e = -1;
            this.f26088f = -1;
        }

        private b(g gVar) {
            this.f26083a = gVar.f26076a;
            this.f26084b = gVar.f26077b;
            this.f26085c = gVar.f26078c;
            this.f26086d = gVar.f26079d;
            this.f26087e = gVar.f26080e;
            this.f26088f = gVar.f26081f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static boolean h(g gVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (gVar == null) {
            return true;
        }
        int i14 = gVar.f26076a;
        return (i14 == -1 || i14 == 1 || i14 == 2) && ((i10 = gVar.f26077b) == -1 || i10 == 2) && (((i11 = gVar.f26078c) == -1 || i11 == 3) && gVar.f26079d == null && (((i12 = gVar.f26081f) == -1 || i12 == 8) && ((i13 = gVar.f26080e) == -1 || i13 == 8)));
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f26076a == gVar.f26076a && this.f26077b == gVar.f26077b && this.f26078c == gVar.f26078c && Arrays.equals(this.f26079d, gVar.f26079d) && this.f26080e == gVar.f26080e && this.f26081f == gVar.f26081f;
    }

    public boolean f() {
        return (this.f26080e == -1 || this.f26081f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f26076a == -1 || this.f26077b == -1 || this.f26078c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f26082g == 0) {
            this.f26082g = ((((((((((527 + this.f26076a) * 31) + this.f26077b) * 31) + this.f26078c) * 31) + Arrays.hashCode(this.f26079d)) * 31) + this.f26080e) * 31) + this.f26081f;
        }
        return this.f26082g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String strG = g() ? x7.l0.G("%s/%s/%s", d(this.f26076a), c(this.f26077b), e(this.f26078c)) : "NA/NA/NA";
        if (f()) {
            str = this.f26080e + "/" + this.f26081f;
        } else {
            str = "NA/NA";
        }
        return strG + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f26076a));
        sb2.append(", ");
        sb2.append(c(this.f26077b));
        sb2.append(", ");
        sb2.append(e(this.f26078c));
        sb2.append(", ");
        sb2.append(this.f26079d != null);
        sb2.append(", ");
        sb2.append(l(this.f26080e));
        sb2.append(", ");
        sb2.append(b(this.f26081f));
        sb2.append(")");
        return sb2.toString();
    }

    private g(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f26076a = i10;
        this.f26077b = i11;
        this.f26078c = i12;
        this.f26079d = bArr;
        this.f26080e = i13;
        this.f26081f = i14;
    }
}
