package wb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: IntentUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f27709a = new m();

    private m() {
    }

    public static final boolean a(Context context, String str, i<Boolean> iVar) {
        kotlin.jvm.internal.t.f(context, "context");
        return p.f(context, str, iVar);
    }

    public static final ComponentName b(List<? extends ResolveInfo> resolveInfoList) {
        Object next;
        kotlin.jvm.internal.t.f(resolveInfoList, "resolveInfoList");
        Iterator<T> it = resolveInfoList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.t.a(((ResolveInfo) next).activityInfo.packageName, "com.android.vending"));
        ResolveInfo resolveInfo = (ResolveInfo) next;
        if (resolveInfo == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    public static final Intent c(Uri uri) {
        kotlin.jvm.internal.t.f(uri, "uri");
        return p.o(uri, false, 1, null);
    }

    public static final Intent d(String url) {
        kotlin.jvm.internal.t.f(url, "url");
        Uri uri = Uri.parse(url);
        kotlin.jvm.internal.t.e(uri, "parse(url)");
        return c(uri);
    }
}
