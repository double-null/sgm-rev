package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import f1.i;
import m1.g;
import m1.h;

/* JADX INFO: compiled from: Alarms.java */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3699a = l.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h hVarY = iVar.o().y();
        g gVarA = hVarY.a(str);
        if (gVarA != null) {
            b(context, str, gVarA.f22056b);
            l.c().a(f3699a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            hVarY.c(str);
        }
    }

    private static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        l.c().a(f3699a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j10) {
        WorkDatabase workDatabaseO = iVar.o();
        h hVarY = workDatabaseO.y();
        g gVarA = hVarY.a(str);
        if (gVarA != null) {
            b(context, str, gVarA.f22056b);
            d(context, str, gVarA.f22056b, j10);
        } else {
            int iB = new n1.e(workDatabaseO).b();
            hVarY.d(new g(str, iB));
            d(context, str, iB, j10);
        }
    }

    private static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
