package io.bidmachine.ads.networks.gam;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: GAMUnitDataFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class u {
    static t a(String str, String str2, String str3, Map<String, String> map) {
        return new t(str, Float.parseFloat(str2), Float.parseFloat(str3), map);
    }

    static t b(String str, Map<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        String str2 = map.get("score");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = map.get("price");
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        return a(str, str2, str3, map);
    }

    static t c(String str, JSONObject jSONObject) {
        try {
            return b(str, io.bidmachine.core.h.h0(jSONObject));
        } catch (Throwable unused) {
            return null;
        }
    }
}
