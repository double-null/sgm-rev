package y9;

import android.text.Layout;

/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28846e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f28852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f28853l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f28856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f28857p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f28859r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f28861t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f28862u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28847f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28848g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28849h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28850i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28851j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28854m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28855n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f28858q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f28860s = Float.MAX_VALUE;

    private g t(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f28844c && gVar.f28844c) {
                z(gVar.f28843b);
            }
            if (this.f28849h == -1) {
                this.f28849h = gVar.f28849h;
            }
            if (this.f28850i == -1) {
                this.f28850i = gVar.f28850i;
            }
            if (this.f28842a == null && (str = gVar.f28842a) != null) {
                this.f28842a = str;
            }
            if (this.f28847f == -1) {
                this.f28847f = gVar.f28847f;
            }
            if (this.f28848g == -1) {
                this.f28848g = gVar.f28848g;
            }
            if (this.f28855n == -1) {
                this.f28855n = gVar.f28855n;
            }
            if (this.f28856o == null && (alignment2 = gVar.f28856o) != null) {
                this.f28856o = alignment2;
            }
            if (this.f28857p == null && (alignment = gVar.f28857p) != null) {
                this.f28857p = alignment;
            }
            if (this.f28858q == -1) {
                this.f28858q = gVar.f28858q;
            }
            if (this.f28851j == -1) {
                this.f28851j = gVar.f28851j;
                this.f28852k = gVar.f28852k;
            }
            if (this.f28859r == null) {
                this.f28859r = gVar.f28859r;
            }
            if (this.f28860s == Float.MAX_VALUE) {
                this.f28860s = gVar.f28860s;
            }
            if (this.f28861t == null) {
                this.f28861t = gVar.f28861t;
            }
            if (this.f28862u == null) {
                this.f28862u = gVar.f28862u;
            }
            if (z10 && !this.f28846e && gVar.f28846e) {
                w(gVar.f28845d);
            }
            if (z10 && this.f28854m == -1 && (i10 = gVar.f28854m) != -1) {
                this.f28854m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f28842a = str;
        return this;
    }

    public g B(float f10) {
        this.f28852k = f10;
        return this;
    }

    public g C(int i10) {
        this.f28851j = i10;
        return this;
    }

    public g D(String str) {
        this.f28853l = str;
        return this;
    }

    public g E(boolean z10) {
        this.f28850i = z10 ? 1 : 0;
        return this;
    }

    public g F(boolean z10) {
        this.f28847f = z10 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f28857p = alignment;
        return this;
    }

    public g H(String str) {
        this.f28861t = str;
        return this;
    }

    public g I(int i10) {
        this.f28855n = i10;
        return this;
    }

    public g J(int i10) {
        this.f28854m = i10;
        return this;
    }

    public g K(float f10) {
        this.f28860s = f10;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f28856o = alignment;
        return this;
    }

    public g M(boolean z10) {
        this.f28858q = z10 ? 1 : 0;
        return this;
    }

    public g N(b bVar) {
        this.f28859r = bVar;
        return this;
    }

    public g O(boolean z10) {
        this.f28848g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f28846e) {
            return this.f28845d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f28862u;
    }

    public int d() {
        if (this.f28844c) {
            return this.f28843b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f28842a;
    }

    public float f() {
        return this.f28852k;
    }

    public int g() {
        return this.f28851j;
    }

    public String h() {
        return this.f28853l;
    }

    public Layout.Alignment i() {
        return this.f28857p;
    }

    public String j() {
        return this.f28861t;
    }

    public int k() {
        return this.f28855n;
    }

    public int l() {
        return this.f28854m;
    }

    public float m() {
        return this.f28860s;
    }

    public int n() {
        int i10 = this.f28849h;
        if (i10 == -1 && this.f28850i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f28850i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f28856o;
    }

    public boolean p() {
        return this.f28858q == 1;
    }

    public b q() {
        return this.f28859r;
    }

    public boolean r() {
        return this.f28846e;
    }

    public boolean s() {
        return this.f28844c;
    }

    public boolean u() {
        return this.f28847f == 1;
    }

    public boolean v() {
        return this.f28848g == 1;
    }

    public g w(int i10) {
        this.f28845d = i10;
        this.f28846e = true;
        return this;
    }

    public g x(boolean z10) {
        this.f28849h = z10 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f28862u = str;
        return this;
    }

    public g z(int i10) {
        this.f28843b = i10;
        this.f28844c = true;
        return this;
    }
}
