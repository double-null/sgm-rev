package n1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: IdGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f22678a;

    public e(WorkDatabase workDatabase) {
        this.f22678a = workDatabase;
    }

    public static void a(Context context, x0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.a();
            try {
                bVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                bVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                bVar.w();
            } finally {
                bVar.A();
            }
        }
    }

    private int c(String str) {
        this.f22678a.c();
        try {
            Long lB = this.f22678a.x().b(str);
            int i10 = 0;
            int iIntValue = lB != null ? lB.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i10 = iIntValue + 1;
            }
            e(str, i10);
            this.f22678a.r();
            return iIntValue;
        } finally {
            this.f22678a.g();
        }
    }

    private void e(String str, int i10) {
        this.f22678a.x().a(new m1.d(str, i10));
    }

    public int b() {
        int iC;
        synchronized (e.class) {
            iC = c("next_alarm_manager_id");
        }
        return iC;
    }

    public int d(int i10, int i11) {
        synchronized (e.class) {
            int iC = c("next_job_scheduler_id");
            if (iC < i10 || iC > i11) {
                e("next_job_scheduler_id", i10 + 1);
            } else {
                i10 = iC;
            }
        }
        return i10;
    }
}
