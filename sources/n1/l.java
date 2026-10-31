package n1;

import androidx.work.impl.WorkDatabase;
import androidx.work.u;

/* JADX INFO: compiled from: StopWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f22691d = androidx.work.l.f("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1.i f22692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22694c;

    public l(f1.i iVar, String str, boolean z10) {
        this.f22692a = iVar;
        this.f22693b = str;
        this.f22694c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO;
        WorkDatabase workDatabaseO = this.f22692a.o();
        f1.d dVarM = this.f22692a.m();
        m1.q qVarB = workDatabaseO.B();
        workDatabaseO.c();
        try {
            boolean zH = dVarM.h(this.f22693b);
            if (this.f22694c) {
                zO = this.f22692a.m().n(this.f22693b);
            } else {
                if (!zH && qVarB.f(this.f22693b) == u.a.RUNNING) {
                    qVarB.b(u.a.ENQUEUED, this.f22693b);
                }
                zO = this.f22692a.m().o(this.f22693b);
            }
            androidx.work.l.c().a(f22691d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f22693b, Boolean.valueOf(zO)), new Throwable[0]);
            workDatabaseO.r();
        } finally {
            workDatabaseO.g();
        }
    }
}
