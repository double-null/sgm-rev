package s5;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f25256b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25257a;

    private g() {
    }

    public static g c() {
        return f25256b;
    }

    public Context a() {
        return this.f25257a;
    }

    public void b(Context context) {
        this.f25257a = context != null ? context.getApplicationContext() : null;
    }
}
