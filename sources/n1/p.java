package n1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: compiled from: WorkProgressUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public class p implements androidx.work.q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f22717c = androidx.work.l.f("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WorkDatabase f22718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o1.a f22719b;

    /* JADX INFO: compiled from: WorkProgressUpdater.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f22720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.e f22721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f22722c;

        a(UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.futures.c cVar) {
            this.f22720a = uuid;
            this.f22721b = eVar;
            this.f22722c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = this.f22720a.toString();
            androidx.work.l lVarC = androidx.work.l.c();
            String str = p.f22717c;
            lVarC.a(str, String.format("Updating progress for %s (%s)", this.f22720a, this.f22721b), new Throwable[0]);
            p.this.f22718a.c();
            try {
                m1.p pVarG = p.this.f22718a.B().g(string);
                if (pVarG == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (pVarG.f22079b == u.a.RUNNING) {
                    p.this.f22718a.A().b(new m1.m(string, this.f22721b));
                } else {
                    androidx.work.l.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
                }
                this.f22722c.o(null);
                p.this.f22718a.r();
            } catch (Throwable th) {
                try {
                    androidx.work.l.c().b(p.f22717c, "Error updating Worker progress", th);
                    this.f22722c.p(th);
                } finally {
                    p.this.f22718a.g();
                }
            }
        }
    }

    public p(WorkDatabase workDatabase, o1.a aVar) {
        this.f22718a = workDatabase;
        this.f22719b = aVar;
    }

    @Override // androidx.work.q
    public ListenableFuture<Void> a(Context context, UUID uuid, androidx.work.e eVar) {
        androidx.work.impl.utils.futures.c cVarS = androidx.work.impl.utils.futures.c.s();
        this.f22719b.b(new a(uuid, eVar, cVarS));
        return cVarS;
    }
}
