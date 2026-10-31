package z2;

import android.util.Log;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final f f28936c = new f("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28938b = 4;

    public f(String str) {
        this.f28937a = str;
    }

    private boolean a(int i10) {
        return this.f28938b <= i10 || Log.isLoggable(this.f28937a, i10);
    }

    public static f f() {
        return f28936c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f28937a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f28937a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f28937a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f28937a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f28937a, str, th);
        }
    }
}
