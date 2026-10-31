package s5;

import android.view.View;
import java.util.Iterator;
import o5.o;

/* JADX INFO: loaded from: classes4.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static b f25243d = new b();

    private b() {
    }

    public static b k() {
        return f25243d;
    }

    @Override // s5.d
    public void f(boolean z10) {
        Iterator<o> it = c.e().c().iterator();
        while (it.hasNext()) {
            it.next().l().q(z10);
        }
    }

    @Override // s5.d
    public boolean h() {
        Iterator<o> it = c.e().a().iterator();
        while (it.hasNext()) {
            View viewM = it.next().m();
            if (viewM != null && viewM.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
