package o5;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f23038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f23039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f23041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f23042e;

    private c(f fVar, i iVar, k kVar, k kVar2, boolean z10) {
        this.f23041d = fVar;
        this.f23042e = iVar;
        this.f23038a = kVar;
        if (kVar2 == null) {
            this.f23039b = k.NONE;
        } else {
            this.f23039b = kVar2;
        }
        this.f23040c = z10;
    }

    public static c a(f fVar, i iVar, k kVar, k kVar2, boolean z10) {
        w5.g.b(fVar, "CreativeType is null");
        w5.g.b(iVar, "ImpressionType is null");
        w5.g.b(kVar, "Impression owner is null");
        w5.g.e(kVar, fVar, iVar);
        return new c(fVar, iVar, kVar, kVar2, z10);
    }

    public boolean b() {
        return k.NATIVE == this.f23038a;
    }

    public boolean c() {
        return k.NATIVE == this.f23039b;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        w5.c.g(jSONObject, "impressionOwner", this.f23038a);
        w5.c.g(jSONObject, "mediaEventsOwner", this.f23039b);
        w5.c.g(jSONObject, "creativeType", this.f23041d);
        w5.c.g(jSONObject, "impressionType", this.f23042e);
        w5.c.g(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f23040c));
        return jSONObject;
    }
}
