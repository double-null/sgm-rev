package e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: ContextAwareHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f13548a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f13549b;

    public void a(b bVar) {
        if (this.f13549b != null) {
            bVar.a(this.f13549b);
        }
        this.f13548a.add(bVar);
    }

    public void b() {
        this.f13549b = null;
    }

    public void c(Context context) {
        this.f13549b = context;
        Iterator<b> it = this.f13548a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    public Context d() {
        return this.f13549b;
    }

    public void e(b bVar) {
        this.f13548a.remove(bVar);
    }
}
