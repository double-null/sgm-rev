package f1;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.l;
import androidx.work.u;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m1.p;
import m1.q;
import m1.t;
import n1.n;
import n1.o;

/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f14577t = l.f("WorkerWrapper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f14578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<e> f14580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f14581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    p f14582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ListenableWorker f14583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o1.a f14584g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.work.b f14586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l1.a f14587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkDatabase f14588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f14589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m1.b f14590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t f14591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<String> f14592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f14593p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f14596s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ListenableWorker.a f14585h = ListenableWorker.a.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    androidx.work.impl.utils.futures.c<Boolean> f14594q = androidx.work.impl.utils.futures.c.s();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ListenableFuture<ListenableWorker.a> f14595r = null;

    /* JADX INFO: compiled from: WorkerWrapper.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListenableFuture f14597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f14598b;

        a(ListenableFuture listenableFuture, androidx.work.impl.utils.futures.c cVar) {
            this.f14597a = listenableFuture;
            this.f14598b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14597a.get();
                l.c().a(j.f14577t, String.format("Starting work for %s", j.this.f14582e.f22080c), new Throwable[0]);
                j jVar = j.this;
                jVar.f14595r = jVar.f14583f.startWork();
                this.f14598b.q(j.this.f14595r);
            } catch (Throwable th) {
                this.f14598b.p(th);
            }
        }
    }

    /* JADX INFO: compiled from: WorkerWrapper.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f14600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14601b;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f14600a = cVar;
            this.f14601b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f14600a.get();
                    if (aVar == null) {
                        l.c().b(j.f14577t, String.format("%s returned a null result. Treating it as a failure.", j.this.f14582e.f22080c), new Throwable[0]);
                    } else {
                        l.c().a(j.f14577t, String.format("%s returned a %s result.", j.this.f14582e.f22080c, aVar), new Throwable[0]);
                        j.this.f14585h = aVar;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    l.c().b(j.f14577t, String.format("%s failed because it threw an exception/error", this.f14601b), e);
                } catch (CancellationException e11) {
                    l.c().d(j.f14577t, String.format("%s was cancelled", this.f14601b), e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    l.c().b(j.f14577t, String.format("%s failed because it threw an exception/error", this.f14601b), e);
                }
                j.this.g();
            } catch (Throwable th) {
                j.this.g();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: WorkerWrapper.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f14603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ListenableWorker f14604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        l1.a f14605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        o1.a f14606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.work.b f14607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        WorkDatabase f14608f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f14609g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List<e> f14610h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        WorkerParameters.a f14611i = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, o1.a aVar, l1.a aVar2, WorkDatabase workDatabase, String str) {
            this.f14603a = context.getApplicationContext();
            this.f14606d = aVar;
            this.f14605c = aVar2;
            this.f14607e = bVar;
            this.f14608f = workDatabase;
            this.f14609g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f14611i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f14610h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f14578a = cVar.f14603a;
        this.f14584g = cVar.f14606d;
        this.f14587j = cVar.f14605c;
        this.f14579b = cVar.f14609g;
        this.f14580c = cVar.f14610h;
        this.f14581d = cVar.f14611i;
        this.f14583f = cVar.f14604b;
        this.f14586i = cVar.f14607e;
        WorkDatabase workDatabase = cVar.f14608f;
        this.f14588k = workDatabase;
        this.f14589l = workDatabase.B();
        this.f14590m = this.f14588k.t();
        this.f14591n = this.f14588k.C();
    }

    private String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f14579b);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void d(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            l.c().d(f14577t, String.format("Worker result SUCCESS for %s", this.f14593p), new Throwable[0]);
            if (this.f14582e.d()) {
                i();
                return;
            } else {
                n();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            l.c().d(f14577t, String.format("Worker result RETRY for %s", this.f14593p), new Throwable[0]);
            h();
            return;
        }
        l.c().d(f14577t, String.format("Worker result FAILURE for %s", this.f14593p), new Throwable[0]);
        if (this.f14582e.d()) {
            i();
        } else {
            m();
        }
    }

    private void f(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f14589l.f(str2) != u.a.CANCELLED) {
                this.f14589l.b(u.a.FAILED, str2);
            }
            linkedList.addAll(this.f14590m.a(str2));
        }
    }

    private void h() {
        this.f14588k.c();
        try {
            this.f14589l.b(u.a.ENQUEUED, this.f14579b);
            this.f14589l.u(this.f14579b, System.currentTimeMillis());
            this.f14589l.l(this.f14579b, -1L);
            this.f14588k.r();
        } finally {
            this.f14588k.g();
            j(true);
        }
    }

    private void i() {
        this.f14588k.c();
        try {
            this.f14589l.u(this.f14579b, System.currentTimeMillis());
            this.f14589l.b(u.a.ENQUEUED, this.f14579b);
            this.f14589l.s(this.f14579b);
            this.f14589l.l(this.f14579b, -1L);
            this.f14588k.r();
        } finally {
            this.f14588k.g();
            j(false);
        }
    }

    private void j(boolean z10) {
        ListenableWorker listenableWorker;
        this.f14588k.c();
        try {
            if (!this.f14588k.B().r()) {
                n1.f.a(this.f14578a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f14589l.b(u.a.ENQUEUED, this.f14579b);
                this.f14589l.l(this.f14579b, -1L);
            }
            if (this.f14582e != null && (listenableWorker = this.f14583f) != null && listenableWorker.isRunInForeground()) {
                this.f14587j.a(this.f14579b);
            }
            this.f14588k.r();
            this.f14588k.g();
            this.f14594q.o(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f14588k.g();
            throw th;
        }
    }

    private void k() {
        u.a aVarF = this.f14589l.f(this.f14579b);
        if (aVarF == u.a.RUNNING) {
            l.c().a(f14577t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f14579b), new Throwable[0]);
            j(true);
        } else {
            l.c().a(f14577t, String.format("Status for %s is %s; not doing any work", this.f14579b, aVarF), new Throwable[0]);
            j(false);
        }
    }

    private void l() {
        androidx.work.e eVarB;
        if (o()) {
            return;
        }
        this.f14588k.c();
        try {
            p pVarG = this.f14589l.g(this.f14579b);
            this.f14582e = pVarG;
            if (pVarG == null) {
                l.c().b(f14577t, String.format("Didn't find WorkSpec for id %s", this.f14579b), new Throwable[0]);
                j(false);
                this.f14588k.r();
                this.f14588k.g();
                return;
            }
            if (pVarG.f22079b != u.a.ENQUEUED) {
                k();
                this.f14588k.r();
                l.c().a(f14577t, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f14582e.f22080c), new Throwable[0]);
                this.f14588k.g();
                return;
            }
            if (pVarG.d() || this.f14582e.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                p pVar = this.f14582e;
                if (!(pVar.f22091n == 0) && jCurrentTimeMillis < pVar.a()) {
                    l.c().a(f14577t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f14582e.f22080c), new Throwable[0]);
                    j(true);
                    this.f14588k.r();
                    this.f14588k.g();
                    return;
                }
            }
            this.f14588k.r();
            this.f14588k.g();
            if (this.f14582e.d()) {
                eVarB = this.f14582e.f22082e;
            } else {
                androidx.work.j jVarB = this.f14586i.f().b(this.f14582e.f22081d);
                if (jVarB == null) {
                    l.c().b(f14577t, String.format("Could not create Input Merger %s", this.f14582e.f22081d), new Throwable[0]);
                    m();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f14582e.f22082e);
                    arrayList.addAll(this.f14589l.i(this.f14579b));
                    eVarB = jVarB.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f14579b), eVarB, this.f14592o, this.f14581d, this.f14582e.f22088k, this.f14586i.e(), this.f14584g, this.f14586i.m(), new n1.p(this.f14588k, this.f14584g), new o(this.f14588k, this.f14587j, this.f14584g));
            if (this.f14583f == null) {
                this.f14583f = this.f14586i.m().b(this.f14578a, this.f14582e.f22080c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f14583f;
            if (listenableWorker == null) {
                l.c().b(f14577t, String.format("Could not create Worker %s", this.f14582e.f22080c), new Throwable[0]);
                m();
                return;
            }
            if (listenableWorker.isUsed()) {
                l.c().b(f14577t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f14582e.f22080c), new Throwable[0]);
                m();
                return;
            }
            this.f14583f.setUsed();
            if (!q()) {
                k();
                return;
            }
            if (o()) {
                return;
            }
            androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
            n nVar = new n(this.f14578a, this.f14582e, this.f14583f, workerParameters.b(), this.f14584g);
            this.f14584g.a().execute(nVar);
            ListenableFuture<Void> listenableFutureA = nVar.a();
            listenableFutureA.addListener(new a(listenableFutureA, cVarS), this.f14584g.a());
            cVarS.addListener(new b(cVarS, this.f14593p), this.f14584g.getBackgroundExecutor());
        } catch (Throwable th) {
            this.f14588k.g();
            throw th;
        }
    }

    private void n() {
        this.f14588k.c();
        try {
            this.f14589l.b(u.a.SUCCEEDED, this.f14579b);
            this.f14589l.p(this.f14579b, ((ListenableWorker.a.c) this.f14585h).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f14590m.a(this.f14579b)) {
                if (this.f14589l.f(str) == u.a.BLOCKED && this.f14590m.b(str)) {
                    l.c().d(f14577t, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f14589l.b(u.a.ENQUEUED, str);
                    this.f14589l.u(str, jCurrentTimeMillis);
                }
            }
            this.f14588k.r();
        } finally {
            this.f14588k.g();
            j(false);
        }
    }

    private boolean o() {
        if (!this.f14596s) {
            return false;
        }
        l.c().a(f14577t, String.format("Work interrupted for %s", this.f14593p), new Throwable[0]);
        u.a aVarF = this.f14589l.f(this.f14579b);
        if (aVarF == null) {
            j(false);
        } else {
            j(!aVarF.b());
        }
        return true;
    }

    private boolean q() {
        this.f14588k.c();
        try {
            boolean z10 = false;
            if (this.f14589l.f(this.f14579b) == u.a.ENQUEUED) {
                this.f14589l.b(u.a.RUNNING, this.f14579b);
                this.f14589l.t(this.f14579b);
                z10 = true;
            }
            this.f14588k.r();
            return z10;
        } finally {
            this.f14588k.g();
        }
    }

    public ListenableFuture<Boolean> c() {
        return this.f14594q;
    }

    public void e() {
        boolean zIsDone;
        this.f14596s = true;
        o();
        ListenableFuture<ListenableWorker.a> listenableFuture = this.f14595r;
        if (listenableFuture != null) {
            zIsDone = listenableFuture.isDone();
            this.f14595r.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f14583f;
        if (listenableWorker == null || zIsDone) {
            l.c().a(f14577t, String.format("WorkSpec %s is already done. Not interrupting.", this.f14582e), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    void g() {
        if (!o()) {
            this.f14588k.c();
            try {
                u.a aVarF = this.f14589l.f(this.f14579b);
                this.f14588k.A().a(this.f14579b);
                if (aVarF == null) {
                    j(false);
                } else if (aVarF == u.a.RUNNING) {
                    d(this.f14585h);
                } else if (!aVarF.b()) {
                    h();
                }
                this.f14588k.r();
                this.f14588k.g();
            } catch (Throwable th) {
                this.f14588k.g();
                throw th;
            }
        }
        List<e> list = this.f14580c;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(this.f14579b);
            }
            f.b(this.f14586i, this.f14588k, this.f14580c);
        }
    }

    void m() {
        this.f14588k.c();
        try {
            f(this.f14579b);
            this.f14589l.p(this.f14579b, ((ListenableWorker.a.C0072a) this.f14585h).e());
            this.f14588k.r();
        } finally {
            this.f14588k.g();
            j(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> listB = this.f14591n.b(this.f14579b);
        this.f14592o = listB;
        this.f14593p = a(listB);
        l();
    }
}
