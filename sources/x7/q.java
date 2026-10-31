package x7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: ListenerSet.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f28161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f28162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f28163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f28164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f28165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f28166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f28167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f28168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28169i;

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface a<T> {
        void invoke(T t10);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    public interface b<T> {
        void a(T t10, u7.o oVar);
    }

    /* JADX INFO: compiled from: ListenerSet.java */
    private static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f28170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u7.o.b f28171b = new u7.o.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f28172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f28173d;

        public c(T t10) {
            this.f28170a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f28173d) {
                return;
            }
            if (i10 != -1) {
                this.f28171b.a(i10);
            }
            this.f28172c = true;
            aVar.invoke(this.f28170a);
        }

        public void b(b<T> bVar) {
            if (this.f28173d || !this.f28172c) {
                return;
            }
            u7.o oVarE = this.f28171b.e();
            this.f28171b = new u7.o.b();
            this.f28172c = false;
            bVar.a(this.f28170a, oVarE);
        }

        public void c(b<T> bVar) {
            this.f28173d = true;
            if (this.f28172c) {
                this.f28172c = false;
                bVar.a(this.f28170a, this.f28171b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f28170a.equals(((c) obj).f28170a);
        }

        public int hashCode() {
            return this.f28170a.hashCode();
        }
    }

    public q(Looper looper, h hVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, hVar, bVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f28164d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f28163c);
            if (this.f28162b.c(1)) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    private void m() {
        if (this.f28169i) {
            x7.a.g(Thread.currentThread() == this.f28162b.g().getThread());
        }
    }

    public void c(T t10) {
        x7.a.e(t10);
        synchronized (this.f28167g) {
            if (this.f28168h) {
                return;
            }
            this.f28164d.add(new c<>(t10));
        }
    }

    public q<T> d(Looper looper, h hVar, b<T> bVar) {
        return new q<>(this.f28164d, looper, hVar, bVar, this.f28169i);
    }

    public q<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f28161a, bVar);
    }

    public void f() {
        m();
        if (this.f28166f.isEmpty()) {
            return;
        }
        if (!this.f28162b.c(1)) {
            n nVar = this.f28162b;
            nVar.b(nVar.a(1));
        }
        boolean z10 = !this.f28165e.isEmpty();
        this.f28165e.addAll(this.f28166f);
        this.f28166f.clear();
        if (z10) {
            return;
        }
        while (!this.f28165e.isEmpty()) {
            this.f28165e.peekFirst().run();
            this.f28165e.removeFirst();
        }
    }

    public void i(final int i10, final a<T> aVar) {
        m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f28164d);
        this.f28166f.add(new Runnable() { // from class: x7.o
            @Override // java.lang.Runnable
            public final void run() {
                q.h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        m();
        synchronized (this.f28167g) {
            this.f28168h = true;
        }
        Iterator<c<T>> it = this.f28164d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f28163c);
        }
        this.f28164d.clear();
    }

    public void k(T t10) {
        m();
        for (c<T> cVar : this.f28164d) {
            if (cVar.f28170a.equals(t10)) {
                cVar.c(this.f28163c);
                this.f28164d.remove(cVar);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }

    private q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, h hVar, b<T> bVar, boolean z10) {
        this.f28161a = hVar;
        this.f28164d = copyOnWriteArraySet;
        this.f28163c = bVar;
        this.f28167g = new Object();
        this.f28165e = new ArrayDeque<>();
        this.f28166f = new ArrayDeque<>();
        this.f28162b = hVar.b(looper, new Handler.Callback() { // from class: x7.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f28160a.g(message);
            }
        });
        this.f28169i = z10;
    }
}
