package n1;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: WorkForegroundRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f22697g = androidx.work.l.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f22698a = androidx.work.impl.utils.futures.c.s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f22699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final m1.p f22700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ListenableWorker f22701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.work.h f22702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final o1.a f22703f;

    /* JADX INFO: compiled from: WorkForegroundRunnable.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f22704a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f22704a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22704a.q(n.this.f22701d.getForegroundInfoAsync());
        }
    }

    /* JADX INFO: compiled from: WorkForegroundRunnable.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f22706a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f22706a = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.g gVar = (androidx.work.g) this.f22706a.get();
                if (gVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", n.this.f22700c.f22080c));
                }
                androidx.work.l.c().a(n.f22697g, String.format("Updating notification for %s", n.this.f22700c.f22080c), new Throwable[0]);
                n.this.f22701d.setRunInForeground(true);
                n nVar = n.this;
                nVar.f22698a.q(nVar.f22702e.a(nVar.f22699b, nVar.f22701d.getId(), gVar));
            } catch (Throwable th) {
                n.this.f22698a.p(th);
            }
        }
    }

    public n(Context context, m1.p pVar, ListenableWorker listenableWorker, androidx.work.h hVar, o1.a aVar) {
        this.f22699b = context;
        this.f22700c = pVar;
        this.f22701d = listenableWorker;
        this.f22702e = hVar;
        this.f22703f = aVar;
    }

    public ListenableFuture<Void> a() {
        return this.f22698a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f22700c.f22094q || androidx.core.os.a.b()) {
            this.f22698a.o(null);
            return;
        }
        androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
        this.f22703f.a().execute(new a(cVarS));
        cVarS.addListener(new b(cVarS), this.f22703f.a());
    }
}
