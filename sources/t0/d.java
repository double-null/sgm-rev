package t0;

import androidx.room.h;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.f;

/* JADX INFO: compiled from: SharedSQLiteStatement.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f25460a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f25461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile f f25462c;

    public d(h hVar) {
        this.f25461b = hVar;
    }

    private f c() {
        return this.f25461b.d(d());
    }

    private f e(boolean z10) {
        if (!z10) {
            return c();
        }
        if (this.f25462c == null) {
            this.f25462c = c();
        }
        return this.f25462c;
    }

    public f a() {
        b();
        return e(this.f25460a.compareAndSet(false, true));
    }

    protected void b() {
        this.f25461b.a();
    }

    protected abstract String d();

    public void f(f fVar) {
        if (fVar == this.f25462c) {
            this.f25460a.set(false);
        }
    }
}
