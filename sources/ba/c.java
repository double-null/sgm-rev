package ba;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4186f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4188h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f4195o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4181a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4182b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f4183c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f4184d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f4185e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4187g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4189i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4190j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4191k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4192l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4193m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f4194n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f4196p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f4197q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f4191k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f4189i) {
            return this.f4188h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f4197q;
    }

    public int c() {
        if (this.f4187g) {
            return this.f4186f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f4185e;
    }

    public float e() {
        return this.f4195o;
    }

    public int f() {
        return this.f4194n;
    }

    public int g() {
        return this.f4196p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f4181a.isEmpty() && this.f4182b.isEmpty() && this.f4183c.isEmpty() && this.f4184d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f4181a, str, 1073741824), this.f4182b, str2, 2), this.f4184d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f4183c)) {
            return 0;
        }
        return iB + (this.f4183c.size() * 4);
    }

    public int i() {
        int i10 = this.f4192l;
        if (i10 == -1 && this.f4193m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f4193m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f4189i;
    }

    public boolean k() {
        return this.f4187g;
    }

    public boolean l() {
        return this.f4190j == 1;
    }

    public boolean m() {
        return this.f4191k == 1;
    }

    public c n(int i10) {
        this.f4188h = i10;
        this.f4189i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f4192l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f4197q = z10;
        return this;
    }

    public c q(int i10) {
        this.f4186f = i10;
        this.f4187g = true;
        return this;
    }

    public c r(String str) {
        this.f4185e = str == null ? null : com.google.common.base.c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f4195o = f10;
        return this;
    }

    public c t(int i10) {
        this.f4194n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f4193m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f4196p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f4183c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f4181a = str;
    }

    public void y(String str) {
        this.f4182b = str;
    }

    public void z(String str) {
        this.f4184d = str;
    }
}
