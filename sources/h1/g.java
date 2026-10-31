package h1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.l;
import androidx.work.u;
import f1.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m1.p;
import m1.q;

/* JADX INFO: compiled from: SystemJobScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class g implements f1.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f15589e = l.f("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JobScheduler f15591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f15592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f15593d;

    public g(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new f(context));
    }

    public static void b(Context context) {
        List<JobInfo> listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listG.iterator();
        while (it.hasNext()) {
            e(jobScheduler, it.next().getId());
        }
    }

    private static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            l.c().b(f15589e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            l.c().b(f15589e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List<String> listB = iVar.o().y().b();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                String strH = h(jobInfo);
                if (TextUtils.isEmpty(strH)) {
                    e(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strH);
                }
            }
        }
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                l.c().a(f15589e, "Reconciling jobs", new Throwable[0]);
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase workDatabaseO = iVar.o();
            workDatabaseO.c();
            try {
                q qVarB = workDatabaseO.B();
                Iterator<String> it2 = listB.iterator();
                while (it2.hasNext()) {
                    qVarB.l(it2.next(), -1L);
                }
                workDatabaseO.r();
            } finally {
                workDatabaseO.g();
            }
        }
        return z10;
    }

    @Override // f1.e
    public void a(String str) {
        List<Integer> listF = f(this.f15590a, this.f15591b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            e(this.f15591b, it.next().intValue());
        }
        this.f15592c.o().y().c(str);
    }

    @Override // f1.e
    public void c(p... pVarArr) {
        WorkDatabase workDatabaseO = this.f15592c.o();
        n1.e eVar = new n1.e(workDatabaseO);
        for (p pVar : pVarArr) {
            workDatabaseO.c();
            try {
                p pVarG = workDatabaseO.B().g(pVar.f22078a);
                if (pVarG == null) {
                    l.c().h(f15589e, "Skipping scheduling " + pVar.f22078a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseO.r();
                } else if (pVarG.f22079b != u.a.ENQUEUED) {
                    l.c().h(f15589e, "Skipping scheduling " + pVar.f22078a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseO.r();
                } else {
                    m1.g gVarA = workDatabaseO.y().a(pVar.f22078a);
                    int iD = gVarA != null ? gVarA.f22056b : eVar.d(this.f15592c.i().i(), this.f15592c.i().g());
                    if (gVarA == null) {
                        this.f15592c.o().y().d(new m1.g(pVar.f22078a, iD));
                    }
                    j(pVar, iD);
                    workDatabaseO.r();
                }
                workDatabaseO.g();
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    @Override // f1.e
    public boolean d() {
        return true;
    }

    public void j(p pVar, int i10) {
        JobInfo jobInfoA = this.f15593d.a(pVar, i10);
        l lVarC = l.c();
        String str = f15589e;
        lVarC.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f22078a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f15591b.schedule(jobInfoA) == 0) {
                l.c().h(str, String.format("Unable to schedule work ID %s", pVar.f22078a), new Throwable[0]);
                if (pVar.f22094q && pVar.f22095r == androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f22094q = false;
                    l.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f22078a), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> listG = g(this.f15590a, this.f15591b);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f15592c.o().B().d().size()), Integer.valueOf(this.f15592c.i().h()));
            l.c().b(f15589e, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e10);
        } catch (Throwable th) {
            l.c().b(f15589e, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public g(Context context, i iVar, JobScheduler jobScheduler, f fVar) {
        this.f15590a = context;
        this.f15592c = iVar;
        this.f15591b = jobScheduler;
        this.f15593d = fVar;
    }
}
