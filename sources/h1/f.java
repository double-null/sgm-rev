package h1;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.l;
import androidx.work.m;
import java.util.Iterator;
import m1.p;

/* JADX INFO: compiled from: SystemJobInfoConverter.java */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15586b = l.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f15587a;

    /* JADX INFO: compiled from: SystemJobInfoConverter.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15588a;

        static {
            int[] iArr = new int[m.values().length];
            f15588a = iArr;
            try {
                iArr[m.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15588a[m.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15588a[m.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15588a[m.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15588a[m.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    f(Context context) {
        this.f15587a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(androidx.work.d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(m mVar) {
        int i10 = a.f15588a[mVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        l.c().a(f15586b, String.format("API version too low. Cannot convert network type value %s", mVar), new Throwable[0]);
        return 1;
    }

    static void d(JobInfo.Builder builder, m mVar) {
        if (Build.VERSION.SDK_INT < 30 || mVar != m.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(mVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(p pVar, int i10) {
        androidx.work.c cVar = pVar.f22087j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f22078a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f15587a).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        d(extras, cVar.b());
        if (!cVar.h()) {
            extras.setBackoffCriteria(pVar.f22090m, pVar.f22089l == androidx.work.a.f3612b ? 0 : 1);
        }
        long jMax = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.f22094q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.e()) {
            Iterator<androidx.work.d.a> it = cVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        boolean z10 = pVar.f22088k > 0;
        if (androidx.core.os.a.b() && pVar.f22094q && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
