package x7;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f28175b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f28176c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f28174a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f28177d = a.f28178a;

    /* JADX INFO: compiled from: Log.java */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28178a = new C0468a();

        /* JADX INFO: renamed from: x7.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Log.java */
        class C0468a implements a {
            C0468a() {
            }

            @Override // x7.r.a
            public void a(String str, String str2, Throwable th) {
                Log.d(str, r.a(str2, th));
            }

            @Override // x7.r.a
            public void b(String str, String str2, Throwable th) {
                Log.w(str, r.a(str2, th));
            }

            @Override // x7.r.a
            public void c(String str, String str2, Throwable th) {
                Log.e(str, r.a(str2, th));
            }

            @Override // x7.r.a
            public void d(String str, String str2, Throwable th) {
                Log.i(str, r.a(str2, th));
            }
        }

        void a(String str, String str2, Throwable th);

        void b(String str, String str2, Throwable th);

        void c(String str, String str2, Throwable th);

        void d(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String strE = e(th);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f28174a) {
            if (f28175b == 0) {
                f28177d.a(str, str2, null);
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f28174a) {
            if (f28175b <= 3) {
                f28177d.c(str, str2, null);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f28174a) {
            if (f28175b <= 3) {
                f28177d.c(str, str2, th);
            }
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f28174a) {
            if (g(th)) {
                return "UnknownHostException (no network)";
            }
            if (f28176c) {
                return Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
            return th.getMessage();
        }
    }

    public static void f(String str, String str2) {
        synchronized (f28174a) {
            if (f28175b <= 1) {
                f28177d.d(str, str2, null);
            }
        }
    }

    private static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f28174a) {
            if (f28175b <= 2) {
                f28177d.b(str, str2, null);
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (f28174a) {
            if (f28175b <= 2) {
                f28177d.b(str, str2, th);
            }
        }
    }
}
