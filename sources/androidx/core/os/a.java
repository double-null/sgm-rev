package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: BuildCompat.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1874a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1878e;

    /* JADX INFO: renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuildCompat.kt */
    private static final class C0035a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0035a f1879a = new C0035a();

        private C0035a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f1875b = i10 >= 30 ? C0035a.f1879a.a(30) : 0;
        f1876c = i10 >= 30 ? C0035a.f1879a.a(31) : 0;
        f1877d = i10 >= 30 ? C0035a.f1879a.a(33) : 0;
        f1878e = i10 >= 30 ? C0035a.f1879a.a(1000000) : 0;
    }

    private a() {
    }

    public static final boolean a(String codename, String buildCodename) {
        t.f(codename, "codename");
        t.f(buildCodename, "buildCodename");
        if (t.a("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        t.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        t.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            if (i10 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                t.e(CODENAME, "CODENAME");
                if (a("S", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 34) {
            if (i10 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                t.e(CODENAME, "CODENAME");
                if (a("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean d() {
        if (Build.VERSION.SDK_INT >= 34) {
            String CODENAME = Build.VERSION.CODENAME;
            t.e(CODENAME, "CODENAME");
            if (a("VanillaIceCream", CODENAME)) {
                return true;
            }
        }
        return false;
    }
}
