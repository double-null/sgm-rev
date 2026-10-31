package l6;

import a5.o;
import android.content.Context;
import android.text.TextUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ob.e;
import ob.g;
import ob.h;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: AdMeasurerFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements g {
    static void c(List<o> list, String str, String str2, String str3) {
        try {
            URL url = new URL(str);
            list.add((TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? o.b(url) : o.a(str2, url, str3));
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    static Float d(Map<String, String> map) {
        String str = map.get("skip_offset");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Float.valueOf(Long.parseLong(str) / 1000.0f);
        } catch (Throwable unused) {
            return null;
        }
    }

    static List<o> e(Map<String, String> map) {
        String str = map.get("verifications");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    c(arrayList, jSONObjectOptJSONObject.optString("java_script_resource_url"), jSONObjectOptJSONObject.optString("vendor"), jSONObjectOptJSONObject.optString("verification_parameters"));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // ob.g
    public e a(Context context, String str, Map<String, String> map) {
        if (str.equalsIgnoreCase("om") && t7.c.g()) {
            return new b();
        }
        return null;
    }

    @Override // ob.g
    public h b(Context context, String str, Map<String, String> map) {
        List<o> listE;
        if (!str.equalsIgnoreCase("om") || !t7.c.g() || map == null || map.isEmpty() || (listE = e(map)) == null || listE.isEmpty()) {
            return null;
        }
        return new d(listE, d(map));
    }
}
