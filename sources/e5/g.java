package e5;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f14476b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f14477a;

    private g() {
    }

    public static g c() {
        return f14476b;
    }

    public Context a() {
        return this.f14477a;
    }

    public void b(Context context) {
        this.f14477a = context != null ? context.getApplicationContext() : null;
    }
}
