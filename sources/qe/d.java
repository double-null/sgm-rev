package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f24778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f24781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<a> f24782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24783f;

    public d(e taskRunner, String name) {
        t.f(taskRunner, "taskRunner");
        t.f(name, "name");
        this.f24778a = taskRunner;
        this.f24779b = name;
        this.f24782e = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f24778a) {
            if (b()) {
                h().h(this);
            }
            g0 g0Var = g0.f27756a;
        }
    }

    public final boolean b() {
        a aVar = this.f24781d;
        if (aVar != null) {
            t.c(aVar);
            if (aVar.a()) {
                this.f24783f = true;
            }
        }
        int size = this.f24782e.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (this.f24782e.get(size).a()) {
                    a aVar2 = this.f24782e.get(size);
                    if (e.f24784h.a().isLoggable(Level.FINE)) {
                        b.c(aVar2, this, "canceled");
                    }
                    this.f24782e.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f24781d;
    }

    public final boolean d() {
        return this.f24783f;
    }

    public final List<a> e() {
        return this.f24782e;
    }

    public final String f() {
        return this.f24779b;
    }

    public final boolean g() {
        return this.f24780c;
    }

    public final e h() {
        return this.f24778a;
    }

    public final void i(a task, long j10) {
        t.f(task, "task");
        synchronized (this.f24778a) {
            if (!g()) {
                if (k(task, j10, false)) {
                    h().h(this);
                }
                g0 g0Var = g0.f27756a;
            } else if (task.a()) {
                if (e.f24784h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f24784h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a task, long j10, boolean z10) {
        t.f(task, "task");
        task.e(this);
        long jNanoTime = this.f24778a.g().nanoTime();
        long j11 = jNanoTime + j10;
        int iIndexOf = this.f24782e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j11) {
                if (e.f24784h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f24782e.remove(iIndexOf);
        }
        task.g(j11);
        if (e.f24784h.a().isLoggable(Level.FINE)) {
            b.c(task, this, z10 ? t.n("run again after ", b.b(j11 - jNanoTime)) : t.n("scheduled after ", b.b(j11 - jNanoTime)));
        }
        Iterator<a> it = this.f24782e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().c() - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f24782e.size();
        }
        this.f24782e.add(size, task);
        return size == 0;
    }

    public final void l(a aVar) {
        this.f24781d = aVar;
    }

    public final void m(boolean z10) {
        this.f24783f = z10;
    }

    public final void n(boolean z10) {
        this.f24780c = z10;
    }

    public final void o() {
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f24778a) {
            n(true);
            if (b()) {
                h().h(this);
            }
            g0 g0Var = g0.f27756a;
        }
    }

    public String toString() {
        return this.f24779b;
    }
}
