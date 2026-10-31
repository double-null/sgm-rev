package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.f;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.b f12597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f12598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaEvents f12599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f12600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f12601f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f12596a = str;
        this.f12597b = new com.iab.omid.library.applovin.weakreference.b(null);
    }

    private JSONArray a(List<com.iab.omid.library.applovin.attestation.b> list) {
        JSONArray jSONArray = new JSONArray();
        for (com.iab.omid.library.applovin.attestation.b bVar : list) {
            Iterator<String> it = bVar.c().iterator();
            while (it.hasNext()) {
                jSONArray.put(a(bVar, it.next()));
            }
        }
        return jSONArray;
    }

    public void b() {
        this.f12597b.clear();
    }

    public AdEvents c() {
        return this.f12598c;
    }

    public MediaEvents d() {
        return this.f12599d;
    }

    public boolean e() {
        return this.f12597b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f12596a);
    }

    public void g() {
        h.a().b(getWebView(), this.f12596a);
    }

    public WebView getWebView() {
        return this.f12597b.get();
    }

    public void h() {
        b((JSONObject) null);
    }

    private JSONObject a(com.iab.omid.library.applovin.attestation.b bVar, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mechanism", bVar.a());
        jSONObject.put("executionEnvironment", bVar.b().toString());
        jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str);
        return jSONObject;
    }

    public void b(String str, long j10) {
        if (j10 >= this.f12601f) {
            this.f12600e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f12596a, str);
        }
    }

    private JSONObject a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "supportedAttestationMechanisms", jSONArray);
        return jSONObject;
    }

    public void b(List<com.iab.omid.library.applovin.attestation.b> list) {
        try {
            a(a(a(list)));
        } catch (JSONException e10) {
            d.a("Error creating JSON object publishSupportedAttestationMechanisms", e10);
        }
    }

    public void a() {
        this.f12601f = f.b();
        this.f12600e = a.AD_STATE_IDLE;
    }

    public void b(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f12596a, jSONObject);
    }

    public void a(float f10) {
        h.a().a(getWebView(), this.f12596a, f10);
    }

    public void b(boolean z10) {
        if (e()) {
            h.a().a(getWebView(), this.f12596a, z10 ? "locked" : "unlocked");
        }
    }

    void a(WebView webView) {
        this.f12597b = new com.iab.omid.library.applovin.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f12598c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f12596a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f12596a, errorType, str);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    protected void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.applovin.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.applovin.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.6.2-Applovin");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            c.a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f12599d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f12601f) {
            a aVar = this.f12600e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f12600e = aVar2;
                h.a().b(getWebView(), this.f12596a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f12596a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    private void a(JSONObject jSONObject) {
        h.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            h.a().c(getWebView(), this.f12596a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void i() {
    }
}
