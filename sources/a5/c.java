package a5;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f30a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f31b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f33d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f34e;

    private c(f fVar, j jVar, l lVar, l lVar2, boolean z10) {
        this.f33d = fVar;
        this.f34e = jVar;
        this.f30a = lVar;
        if (lVar2 == null) {
            this.f31b = l.NONE;
        } else {
            this.f31b = lVar2;
        }
        this.f32c = z10;
    }

    public static c a(f fVar, j jVar, l lVar, l lVar2, boolean z10) {
        i5.g.d(fVar, "CreativeType is null");
        i5.g.d(jVar, "ImpressionType is null");
        i5.g.d(lVar, "Impression owner is null");
        i5.g.b(lVar, fVar, jVar);
        return new c(fVar, jVar, lVar, lVar2, z10);
    }

    public boolean b() {
        return l.NATIVE == this.f30a;
    }

    public boolean c() {
        return l.NATIVE == this.f31b;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        i5.c.i(jSONObject, "impressionOwner", this.f30a);
        i5.c.i(jSONObject, "mediaEventsOwner", this.f31b);
        i5.c.i(jSONObject, "creativeType", this.f33d);
        i5.c.i(jSONObject, "impressionType", this.f34e);
        i5.c.i(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f32c));
        return jSONObject;
    }
}
