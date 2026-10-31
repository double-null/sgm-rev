package b4;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import g7.EinF.ZHgPsTG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ProcessDetailsProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f3940a = new e0();

    private e0() {
    }

    public final List<d0> a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listK;
        kotlin.jvm.internal.t.f(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listK = activityManager.getRunningAppProcesses()) == null) {
            listK = kotlin.collections.t.k();
        }
        List listL = kotlin.collections.b0.L(listK);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.u.u(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            kotlin.jvm.internal.t.e(processName, "processName");
            arrayList2.add(new d0(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.t.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final d0 b(Context context) {
        Object next;
        kotlin.jvm.internal.t.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((d0) next).b() == iMyPid));
        d0 d0Var = (d0) next;
        return d0Var == null ? new d0(c(), iMyPid, 0, false) : d0Var;
    }

    private final String c() throws Throwable {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            String strMyProcessName = Process.myProcessName();
            kotlin.jvm.internal.t.e(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i10 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : ZHgPsTG.DTJp;
    }
}
