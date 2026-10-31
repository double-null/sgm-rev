package n1;

import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1.c f22667a = new f1.c();

    /* JADX INFO: renamed from: n1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    class C0376a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1.i f22668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f22669c;

        C0376a(f1.i iVar, UUID uuid) {
            this.f22668b = iVar;
            this.f22669c = uuid;
        }

        @Override // n1.a
        void i() {
            WorkDatabase workDatabaseO = this.f22668b.o();
            workDatabaseO.c();
            try {
                a(this.f22668b, this.f22669c.toString());
                workDatabaseO.r();
                workDatabaseO.g();
                h(this.f22668b);
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1.i f22670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22671c;

        b(f1.i iVar, String str) {
            this.f22670b = iVar;
            this.f22671c = str;
        }

        @Override // n1.a
        void i() {
            WorkDatabase workDatabaseO = this.f22670b.o();
            workDatabaseO.c();
            try {
                Iterator<String> it = workDatabaseO.B().h(this.f22671c).iterator();
                while (it.hasNext()) {
                    a(this.f22670b, it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                h(this.f22670b);
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1.i f22672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f22674d;

        c(f1.i iVar, String str, boolean z10) {
            this.f22672b = iVar;
            this.f22673c = str;
            this.f22674d = z10;
        }

        @Override // n1.a
        void i() {
            WorkDatabase workDatabaseO = this.f22672b.o();
            workDatabaseO.c();
            try {
                Iterator<String> it = workDatabaseO.B().e(this.f22673c).iterator();
                while (it.hasNext()) {
                    a(this.f22672b, it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                if (this.f22674d) {
                    h(this.f22672b);
                }
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    public static a c(UUID uuid, f1.i iVar) {
        return new C0376a(iVar, uuid);
    }

    public static a d(String str, f1.i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a e(String str, f1.i iVar) {
        return new b(iVar, str);
    }

    private void g(WorkDatabase workDatabase, String str) {
        m1.q qVarB = workDatabase.B();
        m1.b bVarT = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            u.a aVarF = qVarB.f(str2);
            if (aVarF != u.a.SUCCEEDED && aVarF != u.a.FAILED) {
                qVarB.b(u.a.CANCELLED, str2);
            }
            linkedList.addAll(bVarT.a(str2));
        }
    }

    void a(f1.i iVar, String str) {
        g(iVar.o(), str);
        iVar.m().l(str);
        Iterator<f1.e> it = iVar.n().iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
    }

    public androidx.work.o f() {
        return this.f22667a;
    }

    void h(f1.i iVar) {
        f1.f.b(iVar.i(), iVar.o(), iVar.n());
    }

    abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
            this.f22667a.a(androidx.work.o.f3824a);
        } catch (Throwable th) {
            this.f22667a.a(new androidx.work.o.b.a(th));
        }
    }
}
