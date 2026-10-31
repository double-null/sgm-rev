package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import d5.LXP.wcAlQCOdREZdI;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.util.HashMap;
import java.util.Map;
import m1.p;

/* JADX INFO: compiled from: CommandHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements f1.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3700d = l.f("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, f1.b> f3702b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3703c = new Object();

    b(Context context) {
        this.f3701a = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void g(Intent intent, int i10, e eVar) {
        l.c().a(f3700d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f3701a, i10, eVar).a();
    }

    private void h(Intent intent, int i10, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f3703c) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            l lVarC = l.c();
            String str = f3700d;
            lVarC.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f3702b.containsKey(string)) {
                l.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                d dVar = new d(this.f3701a, i10, string, eVar);
                this.f3702b.put(string, dVar);
                dVar.d();
            }
        }
    }

    private void i(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        l.c().a(f3700d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        e(string, z10);
    }

    private void j(Intent intent, int i10, e eVar) {
        l.c().a(f3700d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        eVar.g().s();
    }

    private void k(Intent intent, int i10, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        l lVarC = l.c();
        String str = f3700d;
        lVarC.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseO = eVar.g().o();
        workDatabaseO.c();
        try {
            p pVarG = workDatabaseO.B().g(string);
            if (pVarG == null) {
                l.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (pVarG.f22079b.b()) {
                l.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = pVarG.a();
            if (pVarG.b()) {
                l.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                a.c(this.f3701a, eVar.g(), string, jA);
                eVar.k(new e.b(eVar, a(this.f3701a), i10));
            } else {
                l.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                a.c(this.f3701a, eVar.g(), string, jA);
            }
            workDatabaseO.r();
        } finally {
            workDatabaseO.g();
        }
    }

    private void l(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        l.c().a(f3700d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().x(string);
        a.a(this.f3701a, eVar.g(), string);
        eVar.e(string, false);
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // f1.b
    public void e(String str, boolean z10) {
        synchronized (this.f3703c) {
            f1.b bVarRemove = this.f3702b.remove(str);
            if (bVarRemove != null) {
                bVarRemove.e(str, z10);
            }
        }
    }

    boolean n() {
        boolean z10;
        synchronized (this.f3703c) {
            z10 = !this.f3702b.isEmpty();
        }
        return z10;
    }

    static Intent c(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra(wcAlQCOdREZdI.zczpaLHdR, str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    void o(Intent intent, int i10, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, eVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            l.c().b(f3700d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, eVar);
        } else if (WKirgUEJJ.SQFQ.equals(action)) {
            i(intent, i10);
        } else {
            l.c().h(f3700d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
