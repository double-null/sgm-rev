package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f12511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f12513d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f12510a = z10;
        this.f12511b = f10;
        this.f12512c = z11;
        this.f12513d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f12510a);
            if (this.f12510a) {
                jSONObject.put("skipOffset", this.f12511b);
            }
            jSONObject.put("autoPlay", this.f12512c);
            jSONObject.put("position", this.f12513d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f12513d;
    }

    public Float getSkipOffset() {
        return this.f12511b;
    }

    public boolean isAutoPlay() {
        return this.f12512c;
    }

    public boolean isSkippable() {
        return this.f12510a;
    }
}
