package qb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.ArrayList;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import pb.a1;
import rd.c0;
import rd.f0;
import wb.e0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f24728a = new e();

    private e() {
    }

    private final a1.b a(String str) {
        for (a1.b bVar : a1.b.values()) {
            if (c0.B(bVar.name(), str, true)) {
                return bVar;
            }
        }
        return null;
    }

    private final Bitmap b(String str) {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            byte[] bytes = str.getBytes(rd.d.f24999b);
            t.e(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrH = e0.h(bytes, 0, 1, null);
            objC = r.c(bArrH == null ? null : BitmapFactory.decodeByteArray(bArrH, 0, bArrH.length));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        return (Bitmap) (r.k(objC) ? null : objC);
    }

    public static final a1 c(String json) {
        Object objC;
        t.f(json, "json");
        e eVar = f24728a;
        try {
            r.a aVar = r.f27774b;
            JSONObject jSONObject = new JSONObject(json);
            String title = jSONObject.optString("title");
            String subtitle = jSONObject.optString("subtitle");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            } else {
                t.e(jSONArrayOptJSONArray, "rootObject.optJSONArray(\"actions\") ?: JSONArray()");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                String strOptString = jSONObject2.optString("type");
                t.e(strOptString, "actionObject.optString(\"type\")");
                a1.b bVarA = eVar.a(strOptString);
                if (bVarA != null) {
                    String actionTitle = jSONObject2.optString("title");
                    String data = jSONObject2.optString("data");
                    String it = jSONObject2.optString("icon");
                    t.e(it, "it");
                    if (f0.k0(it)) {
                        it = null;
                    }
                    Bitmap bitmapB = it != null ? eVar.b(it) : null;
                    t.e(actionTitle, "actionTitle");
                    t.e(data, "data");
                    arrayList.add(new a1.a(bVarA, actionTitle, data, bitmapB));
                }
            }
            t.e(title, "title");
            t.e(subtitle, "subtitle");
            objC = r.c(new a1(title, subtitle, arrayList));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        return (a1) (r.k(objC) ? null : objC);
    }
}
