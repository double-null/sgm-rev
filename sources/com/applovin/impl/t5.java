package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class t5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final u f8825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8826h;

    public t5(u uVar, String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
        this.f8825g = uVar;
        this.f8826h = lVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f8825g.e());
        if (this.f8825g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f8825g.f().getLabel());
        }
        if (this.f8825g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f8825g.g().getLabel());
        }
        return map;
    }

    protected abstract k5 a(JSONObject jSONObject);

    protected void a(int i10, String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "Unable to fetch " + this.f8825g + " ad: server returned " + i10);
        }
        this.f6990a.g().a(f2.A, this.f8825g, new AppLovinError(i10, str));
    }

    protected void b(JSONObject jSONObject) {
        s0.c(jSONObject, this.f6990a);
        s0.b(jSONObject, this.f6990a);
        s0.a(jSONObject, this.f6990a);
        u.a(jSONObject);
        this.f6990a.s0().a(a(jSONObject));
    }

    protected abstract String e();

    protected abstract String f();

    protected Map h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.f8825g.e());
        if (this.f8825g.f() != null) {
            map.put("size", this.f8825g.f().getLabel());
        }
        if (this.f8825g.g() != null) {
            map.put("require", this.f8825g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        w4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Fetching next ad of zone: " + this.f8825g);
        }
        if (((Boolean) this.f6990a.a(z4.Z3)).booleanValue() && q7.k() && com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "User is connected to a VPN");
        }
        q7.a(this.f6990a, this.f6991b);
        this.f6990a.g().a(f2.f6529y, this.f8825g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f6990a.l().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f6990a.a(z4.f9290m3)).booleanValue()) {
                aVarA = w4.a.a(((Integer) this.f6990a.a(z4.f9391x5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f6990a.B().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f6990a.a(z4.I5)).booleanValue() && !((Boolean) this.f6990a.a(z4.E5)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f6990a.a(z4.f9319p5)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f6990a.k0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                w4.a aVarA2 = w4.a.a(((Integer) this.f6990a.a(z4.f9399y5)).intValue());
                Map mapA = q7.a(this.f6990a.B().a(h(), false, false));
                if (!((Boolean) this.f6990a.a(z4.Q6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (q7.h(a()) || q7.j(a())) {
                map.putAll(this.f6990a.l().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f8826h)) {
                map.put("sts", this.f8826h);
            }
            com.applovin.impl.sdk.network.a.C0120a c0120aF = com.applovin.impl.sdk.network.a.a(this.f6990a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f6990a.a(z4.f9191b3)).intValue()).c(((Boolean) this.f6990a.a(z4.f9200c3)).booleanValue()).d(((Boolean) this.f6990a.a(z4.f9209d3)).booleanValue()).c(((Integer) this.f6990a.a(z4.f9183a3)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0120aF.a(andResetCustomPostBody);
                c0120aF.b(((Boolean) this.f6990a.a(z4.T5)).booleanValue());
            }
            a aVar = new a(c0120aF.a(), this.f6990a);
            aVar.c(z4.f9278l0);
            aVar.b(z4.f9287m0);
            this.f6990a.s0().a(aVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Unable to fetch ad for zone id: " + this.f8825g, th);
            }
            a(0, th.getMessage());
        }
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f7769m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f7769m.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
                CollectionUtils.putStringIfValid("ad_zone_id", t5.this.f8825g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f7769m.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f7769m.b()), map);
                this.f6990a.g().d(f2.f6531z, map);
                t5.this.b(jSONObject);
                return;
            }
            t5.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            t5.this.a(i10, str2);
            this.f6990a.E().a("fetchAd", str, i10, str2);
        }
    }
}
