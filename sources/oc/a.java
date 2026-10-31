package oc;

import android.text.TextUtils;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;

/* JADX INFO: compiled from: BMError.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23333e = new a(100, "Can't connect to server");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23334f = new a(102, "Timeout reached");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f23335g = new a(110, "Request contains bad syntax or cannot be fulfilled");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f23336h = new a(109, "Server failed to fulfil an apparently valid request");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f23337i = new a(107, "AdRequest expired, load new one please");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f23338j = new a(106, "AdRequest destroyed, create new one please");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f23339k = new a(107, "AdResponse expired, load new one please");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f23340l = new a(111, "AdResponse already was shown");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f23341m = new a(111, "Ads was already shown, load new one please");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f23342n = new a(107, "Ads was expired, load new one please");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f23343o = new a(106, "Ads destroyed, load new one please");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f23344p = new a(201, "Placeholder timeout error");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f23345q = new a(103, "No ads fill");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f23346r = i("Unknown error");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f23347s = new a(103, "No bid", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f23351d;

    public a(a aVar, int i10, String str) {
        this(aVar.e(), aVar.g(), aVar.j(), new a(i10, str));
    }

    public static a a(String str) {
        return new a(200, str);
    }

    public static a b(String str) {
        return a(str + " not found");
    }

    public static a c(String str) {
        return a("Adapter SDK initialization error: " + str);
    }

    public static a d() {
        return a("Adapter SDK not initialized");
    }

    public static a h(String str) {
        return new a(101, str);
    }

    public static a i(String str) {
        return new a(108, str);
    }

    public static a k(String str) {
        return new a(103, str + " not found");
    }

    public static a l(String str, Throwable th) {
        a aVar = null;
        if (th != null) {
            try {
                StringBuilder sb2 = new StringBuilder(th.getClass().getName());
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb2.append(": ");
                    sb2.append(message);
                }
                aVar = new a(-1, sb2.toString());
            } catch (Throwable unused) {
            }
        }
        return new a(108, str, true, aVar);
    }

    public int e() {
        return this.f23348a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f23348a != aVar.f23348a) {
            return false;
        }
        return this.f23349b.equals(aVar.f23349b);
    }

    public a f() {
        return this.f23351d;
    }

    public String g() {
        return this.f23349b;
    }

    public int hashCode() {
        return (this.f23348a * 31) + this.f23349b.hashCode();
    }

    public boolean j() {
        return this.f23350c;
    }

    public String toString() {
        if (this.f23351d == null) {
            return "(" + this.f23348a + ") " + this.f23349b;
        }
        return "(" + this.f23348a + ") " + this.f23349b + edUJlCZxhVnO.WrkitaPcxuVs + this.f23351d.e() + " - " + this.f23351d.g() + ")";
    }

    public a(int i10, String str) {
        this(i10, str, true);
    }

    private a(int i10, String str, boolean z10) {
        this(i10, str, z10, null);
    }

    private a(int i10, String str, boolean z10, a aVar) {
        this.f23348a = i10;
        this.f23349b = io.bidmachine.core.h.g(str, "Unknown error");
        this.f23350c = z10;
        this.f23351d = aVar;
    }
}
