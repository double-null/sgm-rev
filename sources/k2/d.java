package k2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: JobInfoScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.d f21147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f21148c;

    public d(Context context, l2.d dVar, f fVar) {
        this.f21146a = context;
        this.f21147b = dVar;
        this.f21148c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // k2.x
    public void a(d2.p pVar, int i10) {
        b(pVar, i10, false);
    }

    @Override // k2.x
    public void b(d2.p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f21146a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f21146a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            h2.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jQ = this.f21147b.Q(pVar);
        JobInfo.Builder builderC = this.f21148c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jQ, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", o2.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        h2.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f21148c.g(pVar.d(), jQ, i10)), Long.valueOf(jQ), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    int c(d2.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f21146a.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(pVar.b().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(o2.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
