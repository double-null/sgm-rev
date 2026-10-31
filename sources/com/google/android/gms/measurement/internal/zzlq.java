package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlq extends zzg {
    private JobScheduler zza;

    public zzlq(zzic zzicVar) {
        super(zzicVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final void zzf() {
        this.zza = (JobScheduler) this.zzu.zzaZ().getSystemService("jobscheduler");
    }

    public final void zzh(long j10) {
        zzb();
        zzg();
        JobScheduler jobScheduler = this.zza;
        if (jobScheduler != null && jobScheduler.getPendingJob(zzi()) != null) {
            this.zzu.zzaW().zzk().zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.zzin zzinVarZzj = zzj();
        if (zzinVarZzj != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE) {
            this.zzu.zzaW().zzk().zzb("[sgtm] Not eligible for Scion upload", zzinVarZzj.name());
            return;
        }
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzk().zzb("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        zzicVar.zzaW().zzk().zzb("[sgtm] Scion upload job scheduled with result", ((JobScheduler) Preconditions.checkNotNull(this.zza)).schedule(new JobInfo.Builder(zzi(), new ComponentName(zzicVar.zzaZ(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    final int zzi() {
        return "measurement-client".concat(String.valueOf(this.zzu.zzaZ().getPackageName())).hashCode();
    }

    final com.google.android.gms.internal.measurement.zzin zzj() {
        zzb();
        zzg();
        if (this.zza == null) {
            return com.google.android.gms.internal.measurement.zzin.MISSING_JOB_SCHEDULER;
        }
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzx()) {
            return com.google.android.gms.internal.measurement.zzin.NOT_ENABLED_IN_MANIFEST;
        }
        zzic zzicVar2 = this.zzu;
        if (zzicVar2.zzv().zzn() < 119000) {
            return com.google.android.gms.internal.measurement.zzin.SDK_TOO_OLD;
        }
        if (zzpp.zzT(zzicVar.zzaZ(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return !zzicVar2.zzt().zzK() ? com.google.android.gms.internal.measurement.zzin.NON_PLAY_MODE : com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
        }
        return com.google.android.gms.internal.measurement.zzin.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
