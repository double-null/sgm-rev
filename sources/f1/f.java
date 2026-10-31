package f1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.l;
import java.util.Iterator;
import java.util.List;
import m1.p;
import m1.q;

/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14551a = l.f("Schedulers");

    static e a(Context context, i iVar) {
        h1.g gVar = new h1.g(context, iVar);
        n1.f.a(context, SystemJobService.class, true);
        l.c().a(f14551a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return gVar;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q qVarB = workDatabase.B();
        workDatabase.c();
        try {
            List<p> listO = qVarB.o(bVar.h());
            List<p> listJ = qVarB.j(200);
            if (listO != null && listO.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<p> it = listO.iterator();
                while (it.hasNext()) {
                    qVarB.l(it.next().f22078a, jCurrentTimeMillis);
                }
            }
            workDatabase.r();
            workDatabase.g();
            if (listO != null && listO.size() > 0) {
                p[] pVarArr = (p[]) listO.toArray(new p[listO.size()]);
                for (e eVar : list) {
                    if (eVar.d()) {
                        eVar.c(pVarArr);
                    }
                }
            }
            if (listJ == null || listJ.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) listJ.toArray(new p[listJ.size()]);
            for (e eVar2 : list) {
                if (!eVar2.d()) {
                    eVar2.c(pVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
