package a5;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static b a(c cVar, d dVar) {
        i5.g.a();
        i5.g.d(cVar, "AdSessionConfiguration is null");
        i5.g.d(dVar, "AdSessionContext is null");
        return new p(cVar, dVar);
    }

    public abstract void b(h hVar, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
