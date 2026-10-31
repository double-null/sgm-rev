package e5;

import a5.p;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static b f14463d = new b();

    private b() {
    }

    public static b k() {
        return f14463d;
    }

    @Override // e5.d
    public void f(boolean z10) {
        Iterator<p> it = c.e().c().iterator();
        while (it.hasNext()) {
            it.next().m().r(z10);
        }
    }

    @Override // e5.d
    public boolean h() {
        Iterator<p> it = c.e().a().iterator();
        while (it.hasNext()) {
            View viewN = it.next().n();
            if (viewN != null && viewN.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
