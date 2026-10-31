package b5;

import i5.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f4103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f4104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f4105d;

    private d(boolean z10, Float f10, boolean z11, c cVar) {
        this.f4102a = z10;
        this.f4103b = f10;
        this.f4104c = z11;
        this.f4105d = cVar;
    }

    public static d b(boolean z10, c cVar) {
        g.d(cVar, "Position is null");
        return new d(false, null, z10, cVar);
    }

    public static d c(float f10, boolean z10, c cVar) {
        g.d(cVar, "Position is null");
        return new d(true, Float.valueOf(f10), z10, cVar);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f4102a);
            if (this.f4102a) {
                jSONObject.put("skipOffset", this.f4103b);
            }
            jSONObject.put("autoPlay", this.f4104c);
            jSONObject.put("position", this.f4105d);
        } catch (JSONException e10) {
            i5.d.b("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }
}
