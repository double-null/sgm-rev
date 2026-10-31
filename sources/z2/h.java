package z2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import e3.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ProcessDetailsProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f28939a = new h();

    private h() {
    }

    public static /* synthetic */ h0.f.d.a.c c(h hVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return hVar.b(str, i10, i11, z10);
    }

    private final String f() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 33) {
            return (i10 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        t.c(strMyProcessName);
        return strMyProcessName;
    }

    public final h0.f.d.a.c a(String processName, int i10, int i11) {
        t.f(processName, "processName");
        return c(this, processName, i10, i11, false, 8, null);
    }

    public final h0.f.d.a.c b(String processName, int i10, int i11, boolean z10) {
        t.f(processName, "processName");
        h0.f.d.a.c cVarA = h0.f.d.a.c.a().e(processName).d(i10).c(i11).b(z10).a();
        t.e(cVarA, "build(...)");
        return cVarA;
    }

    public final List<h0.f.d.a.c> d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listK;
        t.f(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listK = activityManager.getRunningAppProcesses()) == null) {
            listK = kotlin.collections.t.k();
        }
        List listL = b0.L(listK);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(u.u(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(h0.f.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(t.a(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final h0.f.d.a.c e(Context context) {
        Object next;
        t.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = d(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((h0.f.d.a.c) next).c() == iMyPid));
        h0.f.d.a.c cVar = (h0.f.d.a.c) next;
        return cVar == null ? c(this, f(), iMyPid, 0, false, 12, null) : cVar;
    }
}
