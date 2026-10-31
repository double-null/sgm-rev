package wb;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: UrlUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c0 {
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    public static final Uri a(String str) {
        Uri uriO;
        kotlin.jvm.internal.t.f(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            kotlin.jvm.internal.t.e(uri, "parse(this)");
            String scheme = uri.getScheme();
            boolean z10 = true;
            if ((scheme == null || scheme.length() == 0) && !rd.c0.O(str, "/", false, 2, null) && (uriO = d0.o(str)) != null) {
                String scheme2 = uriO.getScheme();
                if (scheme2 != null) {
                    kotlin.jvm.internal.t.e(scheme2, "scheme");
                    if (!(scheme2.length() > 0)) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (!z10) {
                    String string = uriO.toString();
                    kotlin.jvm.internal.t.e(string, "newUri.toString()");
                    if (rd.c0.O(string, "/", false, 2, null)) {
                    }
                }
                return uriO;
            }
            return uri;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Uri b(Uri uri, String... parameterNames) {
        kotlin.jvm.internal.t.f(uri, "<this>");
        kotlin.jvm.internal.t.f(parameterNames, "parameterNames");
        if (parameterNames.length == 0) {
            return uri;
        }
        Set setY = kotlin.collections.o.Y(parameterNames);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        kotlin.jvm.internal.t.e(builderClearQuery, "buildUpon().clearQuery()");
        for (String str : uri.getQueryParameterNames()) {
            if (!setY.contains(str)) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it.next());
                }
            }
        }
        Uri uriBuild = builderClearQuery.build();
        kotlin.jvm.internal.t.e(uriBuild, "builder.build()");
        return uriBuild;
    }
}
