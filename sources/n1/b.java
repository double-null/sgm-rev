package n1;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.u;
import androidx.work.w;
import g7.EinF.ZHgPsTG;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m1.s;

/* JADX INFO: compiled from: EnqueueRunnable.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22675c = androidx.work.l.f("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1.g f22676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f1.c f22677b = new f1.c();

    public b(f1.g gVar) {
        this.f22676a = gVar;
    }

    private static boolean c(f1.g gVar) {
        boolean zD = d(gVar.g(), gVar.f(), (String[]) f1.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x013c A[PHI: r0 r8 r11 r12 r13
      0x013c: PHI (r0v1 java.lang.String[]) = (r0v0 java.lang.String[]), (r0v0 java.lang.String[]), (r0v13 java.lang.String[]), (r0v13 java.lang.String[]) binds: [B:32:0x006a, B:34:0x0078, B:83:0x013b, B:82:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:32:0x006a, B:34:0x0078, B:83:0x013b, B:82:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:32:0x006a, B:34:0x0078, B:83:0x013b, B:82:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:32:0x006a, B:34:0x0078, B:83:0x013b, B:82:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:32:0x006a, B:34:0x0078, B:83:0x013b, B:82:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean d(f1.i iVar, List<? extends w> list, String[] strArr, String str, androidx.work.f fVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabaseO = iVar.o();
        boolean z13 = true;
        boolean z14 = strArr2 != null && strArr2.length > 0;
        if (z14) {
            z10 = true;
            z11 = false;
            z12 = false;
            for (String str2 : strArr2) {
                m1.p pVarG = workDatabaseO.B().g(str2);
                if (pVarG == null) {
                    androidx.work.l.c().b(f22675c, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    return false;
                }
                u.a aVar = pVarG.f22079b;
                z10 &= aVar == u.a.SUCCEEDED;
                if (aVar == u.a.FAILED) {
                    z12 = true;
                } else if (aVar == u.a.CANCELLED) {
                    z11 = true;
                }
            }
        } else {
            z10 = true;
            z11 = false;
            z12 = false;
        }
        boolean z15 = !TextUtils.isEmpty(str);
        if (z15 && !z14) {
            List<m1.p.b> listN = workDatabaseO.B().n(str);
            if (listN.isEmpty()) {
                z13 = false;
            } else if (fVar == androidx.work.f.APPEND || fVar == androidx.work.f.APPEND_OR_REPLACE) {
                m1.b bVarT = workDatabaseO.t();
                List arrayList = new ArrayList();
                for (m1.p.b bVar : listN) {
                    if (!bVarT.d(bVar.f22096a)) {
                        u.a aVar2 = bVar.f22097b;
                        boolean z16 = (aVar2 == u.a.SUCCEEDED) & z10;
                        if (aVar2 == u.a.FAILED) {
                            z12 = true;
                        } else if (aVar2 == u.a.CANCELLED) {
                            z11 = true;
                        }
                        arrayList.add(bVar.f22096a);
                        z10 = z16;
                    }
                }
                if (fVar == androidx.work.f.APPEND_OR_REPLACE && (z11 || z12)) {
                    m1.q qVarB = workDatabaseO.B();
                    Iterator<m1.p.b> it = qVarB.n(str).iterator();
                    while (it.hasNext()) {
                        qVarB.a(it.next().f22096a);
                    }
                    arrayList = Collections.emptyList();
                    z11 = false;
                    z12 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z14 = strArr2.length > 0;
                z13 = false;
            } else {
                if (fVar == androidx.work.f.KEEP) {
                    Iterator<m1.p.b> it2 = listN.iterator();
                    while (it2.hasNext()) {
                        u.a aVar3 = it2.next().f22097b;
                        if (aVar3 == u.a.ENQUEUED || aVar3 == u.a.RUNNING) {
                            return false;
                        }
                    }
                }
                a.d(str, iVar, false).run();
                m1.q qVarB2 = workDatabaseO.B();
                Iterator<m1.p.b> it3 = listN.iterator();
                while (it3.hasNext()) {
                    qVarB2.a(it3.next().f22096a);
                }
            }
        } else {
            z13 = false;
        }
        Iterator<? extends w> it4 = list.iterator();
        while (it4.hasNext()) {
            w next = it4.next();
            m1.p pVarC = next.c();
            if (!z14 || z10) {
                if (pVarC.d()) {
                    pVarC.f22091n = 0L;
                } else {
                    pVarC.f22091n = jCurrentTimeMillis;
                }
            } else if (z12) {
                pVarC.f22079b = u.a.FAILED;
            } else if (z11) {
                pVarC.f22079b = u.a.CANCELLED;
            } else {
                pVarC.f22079b = u.a.BLOCKED;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                h(pVarC);
            }
            if (pVarC.f22079b == u.a.ENQUEUED) {
                z13 = true;
            }
            workDatabaseO.B().m(pVarC);
            if (z14) {
                int length = strArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    workDatabaseO.t().c(new m1.a(next.a(), strArr2[i10]));
                    i10++;
                    strArr2 = strArr2;
                    it4 = it4;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends w> it5 = it4;
            Iterator<String> it6 = next.b().iterator();
            while (it6.hasNext()) {
                workDatabaseO.C().a(new s(it6.next(), next.a()));
            }
            if (z15) {
                workDatabaseO.z().a(new m1.j(str, next.a()));
            }
            strArr2 = strArr3;
            it4 = it5;
        }
        return z13;
    }

    private static boolean f(f1.g gVar) {
        List<f1.g> listE = gVar.e();
        boolean z10 = false;
        if (listE != null) {
            boolean zF = false;
            for (f1.g gVar2 : listE) {
                if (gVar2.j()) {
                    androidx.work.l.c().h(f22675c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                } else {
                    zF |= f(gVar2);
                }
            }
            z10 = zF;
        }
        return c(gVar) | z10;
    }

    private static void h(m1.p pVar) {
        androidx.work.c cVar = pVar.f22087j;
        String str = pVar.f22080c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.f() || cVar.i()) {
            androidx.work.e.a aVar = new androidx.work.e.a();
            aVar.c(pVar.f22082e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f22080c = ConstraintTrackingWorker.class.getName();
            pVar.f22082e = aVar.a();
        }
    }

    public boolean a() {
        WorkDatabase workDatabaseO = this.f22676a.g().o();
        workDatabaseO.c();
        try {
            boolean zF = f(this.f22676a);
            workDatabaseO.r();
            return zF;
        } finally {
            workDatabaseO.g();
        }
    }

    public androidx.work.o e() {
        return this.f22677b;
    }

    public void g() {
        f1.i iVarG = this.f22676a.g();
        f1.f.b(iVarG.i(), iVarG.o(), iVarG.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f22676a.h()) {
                throw new IllegalStateException(String.format(ZHgPsTG.tpjAxkQd, this.f22676a));
            }
            if (a()) {
                f.a(this.f22676a.g().h(), RescheduleReceiver.class, true);
                g();
            }
            this.f22677b.a(androidx.work.o.f3824a);
        } catch (Throwable th) {
            this.f22677b.a(new androidx.work.o.b.a(th));
        }
    }
}
