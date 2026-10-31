package g1;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.l;
import androidx.work.u;
import f1.e;
import f1.i;
import i1.c;
import i1.d;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m1.p;

/* JADX INFO: compiled from: GreedyScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements e, c, f1.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f15264i = l.f("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f15266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f15267c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f15269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15270f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Boolean f15272h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<p> f15268d = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f15271g = new Object();

    public b(Context context, androidx.work.b bVar, o1.a aVar, i iVar) {
        this.f15265a = context;
        this.f15266b = iVar;
        this.f15267c = new d(context, aVar, this);
        this.f15269e = new a(this, bVar.k());
    }

    private void g() {
        this.f15272h = Boolean.valueOf(n1.i.b(this.f15265a, this.f15266b.i()));
    }

    private void h() {
        if (this.f15270f) {
            return;
        }
        this.f15266b.m().c(this);
        this.f15270f = true;
    }

    private void i(String str) {
        synchronized (this.f15271g) {
            for (p pVar : this.f15268d) {
                if (pVar.f22078a.equals(str)) {
                    l.c().a(f15264i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f15268d.remove(pVar);
                    this.f15267c.d(this.f15268d);
                    break;
                }
            }
        }
    }

    @Override // f1.e
    public void a(String str) {
        if (this.f15272h == null) {
            g();
        }
        if (!this.f15272h.booleanValue()) {
            l.c().d(f15264i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        l.c().a(f15264i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f15269e;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f15266b.x(str);
    }

    @Override // i1.c
    public void b(List<String> list) {
        for (String str : list) {
            l.c().a(f15264i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f15266b.x(str);
        }
    }

    @Override // f1.e
    public void c(p... pVarArr) {
        if (this.f15272h == null) {
            g();
        }
        if (!this.f15272h.booleanValue()) {
            l.c().d(f15264i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long jA = pVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (pVar.f22079b == u.a.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f15269e;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (!pVar.b()) {
                    l.c().a(f15264i, String.format("Starting work for %s", pVar.f22078a), new Throwable[0]);
                    this.f15266b.u(pVar.f22078a);
                } else if (pVar.f22087j.h()) {
                    l.c().a(f15264i, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                } else if (pVar.f22087j.e()) {
                    l.c().a(f15264i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                } else {
                    hashSet.add(pVar);
                    hashSet2.add(pVar.f22078a);
                }
            }
        }
        synchronized (this.f15271g) {
            if (!hashSet.isEmpty()) {
                l.c().a(f15264i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f15268d.addAll(hashSet);
                this.f15267c.d(this.f15268d);
            }
        }
    }

    @Override // f1.e
    public boolean d() {
        return false;
    }

    @Override // f1.b
    public void e(String str, boolean z10) {
        i(str);
    }

    @Override // i1.c
    public void f(List<String> list) {
        for (String str : list) {
            l.c().a(f15264i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f15266b.u(str);
        }
    }
}
