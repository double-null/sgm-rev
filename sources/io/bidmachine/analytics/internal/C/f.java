package io.bidmachine.analytics.internal.C;

import io.bidmachine.analytics.internal.g.h;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final e a(io.bidmachine.analytics.internal.g.e eVar) {
        byte[] bytes;
        JSONObject jSONObjectA;
        String string;
        String strC = eVar.c();
        String strD = eVar.d();
        long jF = eVar.f();
        String strA = eVar.a();
        String string2 = a(eVar.e()).toString();
        h hVarB = eVar.b();
        if (hVarB == null || (jSONObjectA = g.a(hVarB)) == null || (string = jSONObjectA.toString()) == null || (bytes = string.getBytes(rd.d.f24999b)) == null) {
            bytes = new byte[0];
        }
        return new e(strC, strD, jF, strA, string2, bytes, eVar.g());
    }

    public static final io.bidmachine.analytics.internal.g.e a(e eVar) {
        return new io.bidmachine.analytics.internal.g.e(eVar.c(), eVar.d(), eVar.f(), eVar.a(), a(new JSONObject(eVar.e())), eVar.b().length == 0 ? null : g.a(new JSONObject(new String(eVar.b(), rd.d.f24999b))), eVar.g());
    }

    public static final JSONObject a(io.bidmachine.analytics.internal.g.e.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (aVar instanceof io.bidmachine.analytics.internal.g.e.a.C0280a) {
            jSONObject.put("type", "gen");
            io.bidmachine.analytics.internal.g.e.a.C0280a c0280a = (io.bidmachine.analytics.internal.g.e.a.C0280a) aVar;
            jSONObject.put("tag", c0280a.b());
            jSONObject.put("path", c0280a.a());
        } else if (aVar instanceof io.bidmachine.analytics.internal.g.e.a.b) {
            jSONObject.put("type", "pur");
            io.bidmachine.analytics.internal.g.e.a.b bVar = (io.bidmachine.analytics.internal.g.e.a.b) aVar;
            jSONObject.put("tag", bVar.d());
            jSONObject.put("path", bVar.a());
            jSONObject.putOpt("query", bVar.b());
            jSONObject.put("shouldRep", bVar.c());
        }
        return jSONObject;
    }

    public static final io.bidmachine.analytics.internal.g.e.a a(JSONObject jSONObject) {
        if (t.a(jSONObject.optString("type", "gen"), "pur")) {
            return new io.bidmachine.analytics.internal.g.e.a.b(jSONObject.optString("tag"), jSONObject.optString("path"), jSONObject.has("query") ? jSONObject.optString("query") : null, jSONObject.optBoolean("shouldRep", true));
        }
        return new io.bidmachine.analytics.internal.g.e.a.C0280a(jSONObject.optString("tag"), jSONObject.optString("path"));
    }
}
