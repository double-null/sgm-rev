package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: OnBackPressedCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f514b = new CopyOnWriteArrayList<>();

    public b(boolean z10) {
        this.f513a = z10;
    }

    void a(a aVar) {
        this.f514b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f513a;
    }

    public final void d() {
        Iterator<a> it = this.f514b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(a aVar) {
        this.f514b.remove(aVar);
    }

    public final void f(boolean z10) {
        this.f513a = z10;
    }
}
