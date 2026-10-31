package n1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: PreferenceUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f22680a;

    public g(WorkDatabase workDatabase) {
        this.f22680a = workDatabase;
    }

    public static void b(Context context, x0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.a();
            try {
                bVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                bVar.x("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                bVar.w();
            } finally {
                bVar.A();
            }
        }
    }

    public boolean a() {
        Long lB = this.f22680a.x().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f22680a.x().a(new m1.d("reschedule_needed", z10));
    }
}
