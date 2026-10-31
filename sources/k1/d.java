package k1;

import android.content.Context;
import androidx.work.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: ConstraintTracker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f21118f = l.f("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o1.a f21119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f21120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21121c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<i1.a<T>> f21122d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    T f21123e;

    /* JADX INFO: compiled from: ConstraintTracker.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f21124a;

        a(List list) {
            this.f21124a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f21124a.iterator();
            while (it.hasNext()) {
                ((i1.a) it.next()).a(d.this.f21123e);
            }
        }
    }

    d(Context context, o1.a aVar) {
        this.f21120b = context.getApplicationContext();
        this.f21119a = aVar;
    }

    public void a(i1.a<T> aVar) {
        synchronized (this.f21121c) {
            if (this.f21122d.add(aVar)) {
                if (this.f21122d.size() == 1) {
                    this.f21123e = b();
                    l.c().a(f21118f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f21123e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f21123e);
            }
        }
    }

    public abstract T b();

    public void c(i1.a<T> aVar) {
        synchronized (this.f21121c) {
            if (this.f21122d.remove(aVar) && this.f21122d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t10) {
        synchronized (this.f21121c) {
            T t11 = this.f21123e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f21123e = t10;
                this.f21119a.a().execute(new a(new ArrayList(this.f21122d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
