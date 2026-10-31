package com.iab.omid.library.applovin.internal;

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

    public static void b(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                com.iab.omid.library.applovin.utils.d.b("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available");
                return;
            }
            if (((queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) ? (byte) 0 : (byte) -1) == 0) {
                a(a(uri));
                return;
            }
            com.iab.omid.library.applovin.utils.d.b("Unknown method in OmidNativeUrlHandler.handle :" + queryParameter);
        } catch (Exception e10) {
            com.iab.omid.library.applovin.utils.d.a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "]", e10);
        }
    }

    private static void a(Map<String, String> map) {
        try {
            com.iab.omid.library.applovin.attestation.e.a(g.b().a().getApplicationContext(), map.get("mechanism"), new com.iab.omid.library.applovin.attestation.a(map));
        } catch (Exception e10) {
            com.iab.omid.library.applovin.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e10);
        }
    }
}
