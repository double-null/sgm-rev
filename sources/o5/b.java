package o5;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static b a(c cVar, d dVar) {
        w5.g.a();
        w5.g.b(cVar, "AdSessionConfiguration is null");
        w5.g.b(dVar, "AdSessionContext is null");
        return new o(cVar, dVar);
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
