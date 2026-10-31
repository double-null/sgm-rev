package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.a;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import androidx.work.u;
import f1.f;
import f1.h;
import f1.i;
import h1.g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m1.n;
import m1.p;
import m1.q;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3768d = l.f("ForceStopRunnable");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f3769e = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f3771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3772c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f3773a = l.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            l.c().g(f3773a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.h(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f3770a = context.getApplicationContext();
        this.f3771b = iVar;
    }

    static Intent d(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent e(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, d(context), i10);
    }

    static void h(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentE = e(context, a.b() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3769e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentE);
        }
    }

    public boolean a() {
        boolean zI = g.i(this.f3770a, this.f3771b);
        WorkDatabase workDatabaseO = this.f3771b.o();
        q qVarB = workDatabaseO.B();
        n nVarA = workDatabaseO.A();
        workDatabaseO.c();
        try {
            List<p> listQ = qVarB.q();
            boolean z10 = (listQ == null || listQ.isEmpty()) ? false : true;
            if (z10) {
                for (p pVar : listQ) {
                    qVarB.b(u.a.ENQUEUED, pVar.f22078a);
                    qVarB.l(pVar.f22078a, -1L);
                }
            }
            nVarA.c();
            workDatabaseO.r();
            workDatabaseO.g();
            return z10 || zI;
        } catch (Throwable th) {
            workDatabaseO.g();
            throw th;
        }
    }

    public void c() {
        boolean zA = a();
        if (i()) {
            l.c().a(f3768d, "Rescheduling Workers.", new Throwable[0]);
            this.f3771b.s();
            this.f3771b.l().c(false);
        } else if (f()) {
            l.c().a(f3768d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f3771b.s();
        } else if (zA) {
            l.c().a(f3768d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f3771b.i(), this.f3771b.o(), this.f3771b.n());
        }
    }

    public boolean f() {
        try {
            PendingIntent pendingIntentE = e(this.f3770a, a.b() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentE != null) {
                    pendingIntentE.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f3770a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i10)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentE == null) {
                h(this.f3770a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            l.c().h(f3768d, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean g() {
        b bVarI = this.f3771b.i();
        if (TextUtils.isEmpty(bVarI.c())) {
            l.c().a(f3768d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zB = n1.i.b(this.f3770a, bVarI);
        l.c().a(f3768d, String.format("Is default app process = %s", Boolean.valueOf(zB)), new Throwable[0]);
        return zB;
    }

    boolean i() {
        return this.f3771b.l().a();
    }

    public void j(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (!g()) {
                this.f3771b.r();
                return;
            }
            while (true) {
                h.e(this.f3770a);
                l.c().a(f3768d, "Performing cleanup operations.", new Throwable[0]);
                try {
                    c();
                    this.f3771b.r();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    i10 = this.f3772c + 1;
                    this.f3772c = i10;
                    if (i10 >= 3) {
                        l.c().b(f3768d, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        this.f3771b.i().d();
                        throw illegalStateException;
                    }
                    l.c().a(f3768d, String.format("Retrying after %s", Long.valueOf(((long) i10) * 300)), e10);
                    j(((long) this.f3772c) * 300);
                }
                l.c().a(f3768d, String.format("Retrying after %s", Long.valueOf(((long) i10) * 300)), e10);
                j(((long) this.f3772c) * 300);
            }
        } catch (Throwable th) {
            this.f3771b.r();
            throw th;
        }
    }
}
