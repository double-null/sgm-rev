package p5;

import org.json.JSONException;
import org.json.JSONObject;
import w5.g;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f23475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f23477d;

    private d(boolean z10, Float f10, boolean z11, c cVar) {
        this.f23474a = z10;
        this.f23475b = f10;
        this.f23476c = z11;
        this.f23477d = cVar;
    }

    public static d b(boolean z10, c cVar) {
        g.b(cVar, "Position is null");
        return new d(false, null, z10, cVar);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23474a);
            if (this.f23474a) {
                jSONObject.put("skipOffset", this.f23475b);
            }
            jSONObject.put("autoPlay", this.f23476c);
            jSONObject.put("position", this.f23477d);
        } catch (JSONException e10) {
            w5.d.b("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }
}
