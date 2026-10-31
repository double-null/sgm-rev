package k1;

import android.content.Context;

/* JADX INFO: compiled from: Trackers.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static g f21133e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f21135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f21136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f21137d;

    private g(Context context, o1.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21134a = new a(applicationContext, aVar);
        this.f21135b = new b(applicationContext, aVar);
        this.f21136c = new e(applicationContext, aVar);
        this.f21137d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, o1.a aVar) {
        if (f21133e == null) {
            f21133e = new g(context, aVar);
        }
        return f21133e;
    }

    public a a() {
        return this.f21134a;
    }

    public b b() {
        return this.f21135b;
    }

    public e d() {
        return this.f21136c;
    }

    public f e() {
        return this.f21137d;
    }
}
