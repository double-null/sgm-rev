package g1;

import androidx.work.l;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;
import m1.p;

/* JADX INFO: compiled from: DelayedWorkTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f15258d = l.f("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f15259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f15260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Runnable> f15261c = new HashMap();

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DelayedWorkTracker.java */
    class RunnableC0227a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f15262a;

        RunnableC0227a(p pVar) {
            this.f15262a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.c().a(a.f15258d, String.format("Scheduling work %s", this.f15262a.f22078a), new Throwable[0]);
            a.this.f15259a.c(this.f15262a);
        }
    }

    public a(b bVar, s sVar) {
        this.f15259a = bVar;
        this.f15260b = sVar;
    }

    public void a(p pVar) {
        Runnable runnableRemove = this.f15261c.remove(pVar.f22078a);
        if (runnableRemove != null) {
            this.f15260b.a(runnableRemove);
        }
        RunnableC0227a runnableC0227a = new RunnableC0227a(pVar);
        this.f15261c.put(pVar.f22078a, runnableC0227a);
        this.f15260b.b(pVar.a() - System.currentTimeMillis(), runnableC0227a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f15261c.remove(str);
        if (runnableRemove != null) {
            this.f15260b.a(runnableRemove);
        }
    }
}
