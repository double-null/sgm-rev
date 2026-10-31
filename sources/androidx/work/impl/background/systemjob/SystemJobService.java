package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.l;
import f1.b;
import f1.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3735c = l.f("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f3736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, JobParameters> f3737b = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // f1.b
    public void e(String str, boolean z10) {
        JobParameters jobParametersRemove;
        l.c().a(f3735c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f3737b) {
            jobParametersRemove = this.f3737b.remove(str);
        }
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i iVarK = i.k(getApplicationContext());
            this.f3736a = iVarK;
            iVarK.m().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            l.c().h(f3735c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f3736a;
        if (iVar != null) {
            iVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f3736a == null) {
            l.c().a(f3735c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            l.c().b(f3735c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f3737b) {
            if (this.f3737b.containsKey(strA)) {
                l.c().a(f3735c, String.format("Job is already being executed by SystemJobService: %s", strA), new Throwable[0]);
                return false;
            }
            l.c().a(f3735c, String.format("onStartJob for %s", strA), new Throwable[0]);
            this.f3737b.put(strA, jobParameters);
            int i10 = Build.VERSION.SDK_INT;
            WorkerParameters.a aVar = new WorkerParameters.a();
            if (jobParameters.getTriggeredContentUris() != null) {
                aVar.f3609b = Arrays.asList(jobParameters.getTriggeredContentUris());
            }
            if (jobParameters.getTriggeredContentAuthorities() != null) {
                aVar.f3608a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
            }
            if (i10 >= 28) {
                aVar.f3610c = jobParameters.getNetwork();
            }
            this.f3736a.v(strA, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f3736a == null) {
            l.c().a(f3735c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            l.c().b(f3735c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        l.c().a(f3735c, String.format("onStopJob for %s", strA), new Throwable[0]);
        synchronized (this.f3737b) {
            this.f3737b.remove(strA);
        }
        this.f3736a.x(strA);
        return !this.f3736a.m().f(strA);
    }
}
