package p6;

import android.text.TextUtils;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import io.bidmachine.ads.networks.gam.j;
import io.bidmachine.ads.networks.gam.t;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
abstract class b {
    static AdManagerAdRequest a(j jVar, t tVar) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        String strM = jVar.m();
        if (!TextUtils.isEmpty(strM)) {
            builder.setRequestAgent(strM);
        }
        for (Map.Entry<String, String> entry : tVar.b().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder.addCustomTargeting(key, value);
            }
        }
        return builder.build();
    }
}
