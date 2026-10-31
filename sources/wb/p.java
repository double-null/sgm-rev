package wb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.collections.u0;

/* JADX INFO: compiled from: IntentUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p {
    public static final Set<String> c(String urlString) {
        kotlin.jvm.internal.t.f(urlString, "urlString");
        Uri uriA = c0.a(urlString);
        if (uriA == null) {
            return u0.e();
        }
        String queryParameter = uriA.getQueryParameter("bmcp");
        if (queryParameter == null) {
            queryParameter = "";
        }
        List listK0 = rd.f0.K0(queryParameter, new String[]{"_"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (!rd.f0.k0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.b0.t0(arrayList);
    }

    public static final boolean d(Context context, Intent intent) {
        kotlin.jvm.internal.t.f(context, "<this>");
        kotlin.jvm.internal.t.f(intent, "intent");
        ComponentName componentNameE = e(context, intent);
        if (componentNameE == null) {
            return false;
        }
        intent.setComponent(componentNameE);
        return true;
    }

    public static final ComponentName e(Context context, Intent intent) {
        kotlin.jvm.internal.t.f(context, "<this>");
        kotlin.jvm.internal.t.f(intent, "intent");
        List<ResolveInfo> listH = h(context, intent);
        if (!(!listH.isEmpty())) {
            return null;
        }
        ComponentName componentNameB = m.b(listH);
        return componentNameB == null ? new ComponentName(listH.get(0).activityInfo.packageName, listH.get(0).activityInfo.name) : componentNameB;
    }

    public static final boolean f(Context context, String str, final i<Boolean> iVar) {
        kotlin.jvm.internal.t.f(context, "<this>");
        if (str == null || str.length() == 0) {
            if (iVar != null) {
                iVar.execute(Boolean.FALSE);
            }
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        final String strP = d0.p(str);
        if (strP == null || strP.length() == 0) {
            if (iVar != null) {
                iVar.execute(Boolean.FALSE);
            }
            return false;
        }
        Set<String> setC = c(strP);
        if (setC.contains("lraw")) {
            if (setC.contains("rcp")) {
                str = m(str);
            }
            return i(context, str, iVar);
        }
        if (d0.u(strP)) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: wb.n
                @Override // java.lang.Runnable
                public final void run() {
                    p.g(applicationContext, strP, iVar);
                }
            });
            return true;
        }
        kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
        return k(applicationContext, strP, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context applicationContext, String str, i iVar) {
        kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
        k(applicationContext, cc.h.d(str, 0, 2, null), iVar);
    }

    public static final List<ResolveInfo> h(Context context, Intent intent) {
        kotlin.jvm.internal.t.f(context, "<this>");
        kotlin.jvm.internal.t.f(intent, "intent");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        kotlin.jvm.internal.t.e(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        return listQueryIntentActivities;
    }

    public static final boolean i(Context context, String urlString, i<Boolean> iVar) {
        Object objC;
        kotlin.jvm.internal.t.f(context, "<this>");
        kotlin.jvm.internal.t.f(urlString, "urlString");
        Uri uriA = c0.a(urlString);
        if (uriA == null) {
            if (iVar != null) {
                iVar.execute(Boolean.FALSE);
            }
            return false;
        }
        try {
            wc.r.a aVar = wc.r.f27774b;
            wc.g0 g0Var = null;
            context.startActivity(o(uriA, false, 1, null));
            if (iVar != null) {
                iVar.execute(Boolean.TRUE);
                g0Var = wc.g0.f27756a;
            }
            objC = wc.r.c(g0Var);
        } catch (Throwable th) {
            wc.r.a aVar2 = wc.r.f27774b;
            objC = wc.r.c(wc.s.a(th));
        }
        if (wc.r.g(objC) != null && iVar != null) {
            iVar.execute(Boolean.FALSE);
        }
        return wc.r.n(objC);
    }

    public static final boolean j(Context context, String str) {
        Boolean bool;
        kotlin.jvm.internal.t.f(context, "<this>");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Intent intentD = m.d(str);
            if (!d(context, intentD)) {
                String strDecode = URLDecoder.decode(str, rd.d.f24999b.name());
                kotlin.jvm.internal.t.e(strDecode, "decode(url, Charsets.UTF_8.name())");
                intentD = m.d(strDecode);
                d(context, intentD);
            }
            context.startActivity(intentD);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return kotlin.jvm.internal.t.a(bool, Boolean.TRUE);
    }

    public static final boolean k(Context context, String str, final i<Boolean> iVar) {
        kotlin.jvm.internal.t.f(context, "<this>");
        final boolean zJ = j(context, str);
        a0.c(new Runnable() { // from class: wb.o
            @Override // java.lang.Runnable
            public final void run() {
                p.l(iVar, zJ);
            }
        });
        return zJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(i iVar, boolean z10) {
        if (iVar != null) {
            iVar.execute(Boolean.valueOf(z10));
        }
    }

    public static final String m(String urlString) {
        kotlin.jvm.internal.t.f(urlString, "urlString");
        Uri uriA = c0.a(urlString);
        if (uriA == null) {
            return urlString;
        }
        String string = c0.b(uriA, "bmcp").toString();
        kotlin.jvm.internal.t.e(string, "uri.removeQueryParameter…CUSTOM_PARAMS).toString()");
        return string;
    }

    public static final Intent n(Uri uri, boolean z10) {
        kotlin.jvm.internal.t.f(uri, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (z10) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static /* synthetic */ Intent o(Uri uri, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return n(uri, z10);
    }
}
