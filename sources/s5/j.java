package s5;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private static Map<String, String> a(Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }

    private static void b(Map<String, String> map) {
        try {
            q5.e.a(g.c().a().getApplicationContext(), map.get("mechanism"), new q5.a(map));
        } catch (Exception e10) {
            w5.d.b("Error processing attestation request in OmidNativeUrlHandler", e10);
        }
    }

    public static void c(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                w5.d.c("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available");
                return;
            }
            if (((queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) ? (byte) 0 : (byte) -1) == 0) {
                b(a(uri));
                return;
            }
            w5.d.c("Unknown method in OmidNativeUrlHandler.handle :" + queryParameter);
        } catch (Exception e10) {
            w5.d.b("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "]", e10);
        }
    }
}
