package n1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: compiled from: WorkForegroundUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public class o implements androidx.work.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f22708d = androidx.work.l.f("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o1.a f22709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l1.a f22710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final m1.q f22711c;

    /* JADX INFO: compiled from: WorkForegroundUpdater.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f22712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f22713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.g f22714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f22715d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, androidx.work.g gVar, Context context) {
            this.f22712a = cVar;
            this.f22713b = uuid;
            this.f22714c = gVar;
            this.f22715d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f22712a.isCancelled()) {
                    String string = this.f22713b.toString();
                    u.a aVarF = o.this.f22711c.f(string);
                    if (aVarF == null || aVarF.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    o.this.f22710b.b(string, this.f22714c);
                    this.f22715d.startService(androidx.work.impl.foreground.a.a(this.f22715d, string, this.f22714c));
                }
                this.f22712a.o(null);
            } catch (Throwable th) {
                this.f22712a.p(th);
            }
        }
    }

    public o(WorkDatabase workDatabase, l1.a aVar, o1.a aVar2) {
        this.f22710b = aVar;
        this.f22709a = aVar2;
        this.f22711c = workDatabase.B();
    }

    @Override // androidx.work.h
    public ListenableFuture<Void> a(Context context, UUID uuid, androidx.work.g gVar) {
        androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
        this.f22709a.b(new a(cVarS, uuid, gVar, context));
        return cVarS;
    }
}
