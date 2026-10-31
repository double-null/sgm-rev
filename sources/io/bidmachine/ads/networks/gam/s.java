package io.bidmachine.ads.networks.gam;

import io.bidmachine.AdsFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: GAMTypeConfigFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class s {
    public static r a(JSONObject jSONObject) {
        try {
            AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(jSONObject.getString("format"));
            if (adsFormatByRemoteName == null) {
                return null;
            }
            String string = jSONObject.getString("ad_unit_id");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("units");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(u.c(string, jSONArray.getJSONObject(i10)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new r(adsFormatByRemoteName, arrayList, jSONObject.optInt("cache_size", 2));
        } catch (Throwable unused) {
            return null;
        }
    }
}
