package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import com.google.common.util.concurrent.ListenableFuture;
import f1.i;
import i1.c;
import i1.d;
import java.util.Collections;
import java.util.List;
import m1.p;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3803f = l.f("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WorkerParameters f3804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f3805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f3806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f3807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListenableWorker f3808e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListenableFuture f3810a;

        b(ListenableFuture listenableFuture) {
            this.f3810a = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f3805b) {
                if (ConstraintTrackingWorker.this.f3806c) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f3807d.q(this.f3810a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3804a = workerParameters;
        this.f3805b = new Object();
        this.f3806c = false;
        this.f3807d = androidx.work.impl.utils.futures.c.s();
    }

    public WorkDatabase a() {
        return i.k(getApplicationContext()).o();
    }

    @Override // i1.c
    public void b(List<String> list) {
        l.c().a(f3803f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f3805b) {
            this.f3806c = true;
        }
    }

    void c() {
        this.f3807d.o(ListenableWorker.a.a());
    }

    void d() {
        this.f3807d.o(ListenableWorker.a.b());
    }

    void e() {
        String strI = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strI)) {
            l.c().b(f3803f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker listenableWorkerB = getWorkerFactory().b(getApplicationContext(), strI, this.f3804a);
        this.f3808e = listenableWorkerB;
        if (listenableWorkerB == null) {
            l.c().a(f3803f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p pVarG = a().B().g(getId().toString());
        if (pVarG == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(pVarG));
        if (!dVar.c(getId().toString())) {
            l.c().a(f3803f, String.format("Constraints not met for delegate %s. Requesting retry.", strI), new Throwable[0]);
            d();
            return;
        }
        l.c().a(f3803f, String.format("Constraints met for delegate %s", strI), new Throwable[0]);
        try {
            ListenableFuture<ListenableWorker.a> listenableFutureStartWork = this.f3808e.startWork();
            listenableFutureStartWork.addListener(new b(listenableFutureStartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            l lVarC = l.c();
            String str = f3803f;
            lVarC.a(str, String.format("Delegated worker %s threw exception in startWork.", strI), th);
            synchronized (this.f3805b) {
                if (this.f3806c) {
                    l.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                    d();
                } else {
                    c();
                }
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public o1.a getTaskExecutor() {
        return i.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f3808e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f3808e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f3808e.stop();
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f3807d;
    }

    @Override // i1.c
    public void f(List<String> list) {
    }
}
