package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.k6;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.List;
import k9.dW.xjwcmjDeOXR;
import org.json.JSONArray;
import org.json.JSONObject;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: loaded from: classes2.dex */
public class b extends k5 implements a.InterfaceC0119a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f8531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f8532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f8533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f8535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f8536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Double f8537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Uri f8539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f8540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r7 f8541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f8542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Uri f8543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Uri f8544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Uri f8545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f8546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f8547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f8548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f8549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f8550z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderNativeAd", lVar);
        this.f8534j = "";
        this.f8535k = "";
        this.f8536l = "";
        this.f8537m = null;
        this.f8538n = "";
        this.f8539o = null;
        this.f8540p = null;
        this.f8542r = null;
        this.f8543s = null;
        this.f8544t = null;
        this.f8545u = null;
        this.f8546v = new ArrayList();
        this.f8547w = new ArrayList();
        this.f8548x = new ArrayList();
        this.f8549y = new ArrayList();
        this.f8550z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f8531g = jSONObject;
        this.f8532h = jSONObject2;
        this.f8533i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f8544t = Uri.parse(string);
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Processed click destination URL: " + this.f8544t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f8545u = Uri.parse(string2);
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Processed click destination backup URL: " + this.f8545u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f8531g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f6990a.a(z4.S2)).booleanValue()) {
                try {
                    this.f8546v.addAll(JsonUtils.toList(jSONArray));
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, "Processed click tracking URLs: " + this.f8546v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, xjwcmjDeOXR.LKzDzPhbtVIfcUv, th);
                        return;
                    }
                    return;
                }
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f8548x.add(new com.applovin.impl.sdk.network.e.a(this.f6990a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Processed click tracking requests: " + this.f8548x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f8533i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f6990a.E().a(this.f6991b, "prepareNativeComponents", th);
        }
    }

    private void c(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f8564a.b(appLovinNativeAdImpl);
            }
        });
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f8531g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f6990a.a(z4.R2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "VAST ad rendered successfully");
        }
        this.f8541q = (r7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r10 = 0;
        String string = JsonUtils.getString(this.f8531g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f8542r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f8531g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f8543s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8531g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "No oRtb response provided: " + this.f8531g);
            }
            b(VRfCTjjLv.WHE);
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to retrieve assets - failing ad load: " + this.f8531g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r10);
            if (jSONObject4.has("title")) {
                this.f8534j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r10), "text", r10);
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.a(this.f6991b, "Processed title: " + this.f8534j);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r10));
            } else if (jSONObject4.has("img")) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r10);
                int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r10);
                if (i12 == 1 || 3 == i11) {
                    this.f8539o = Uri.parse(string4);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, "Processed icon URL: " + this.f8539o);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f8540p = Uri.parse(string4);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, "Processed main image URL: " + this.f8540p);
                    }
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.k(this.f6991b, "Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i13 <= 0 || i14 <= 0) {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6992c.k(this.f6991b, "Skipping...");
                        }
                    } else if (i13 / i14 > 1.0d) {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6992c.a(this.f6991b, "Inferring main image from " + i13 + "x" + i14 + "...");
                        }
                        this.f8540p = Uri.parse(string4);
                    } else {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6992c.a(this.f6991b, "Inferring icon image from " + i13 + "x" + i14 + "...");
                        }
                        this.f8539o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, "Processed VAST video");
                    }
                } else if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.k(this.f6991b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i16 == 1 || i15 == 8) {
                    this.f8535k = string6;
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, XDucgbzInpQa.coGqEcLgnR + this.f8535k);
                    }
                } else if (i16 == 2 || i15 == 4) {
                    this.f8536l = string6;
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, "Processed body: " + this.f8536l);
                    }
                } else if (i16 == 12 || i15 == 5) {
                    this.f8538n = string6;
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, "Processed cta: " + this.f8538n);
                    }
                } else if (i16 == 3 || i15 == 6) {
                    double dA = q7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f8537m = Double.valueOf(dA);
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6992c.a(this.f6991b, sRGQSqxgxlS.NtDdNik + this.f8537m);
                        }
                    } else if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, "Received invalid star rating: " + string6);
                    }
                } else if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.k(this.f6991b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unsupported asset object: " + jSONObject4);
            }
            i10++;
            r10 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f8547w.add(string7);
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i17 = 0;
            while (i17 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f8549y.add(new com.applovin.impl.sdk.network.e.a(this.f6990a).b(str2).b(false).a(false).h(f()).a());
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6992c.a(this.f6991b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i17++;
                obj = null;
            }
        }
        ?? r11 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i18 = 0;
            while (i18 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r11);
                int i19 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r11);
                if (!TextUtils.isEmpty(string8)) {
                    if (i20 == 1 || i20 == 2) {
                        if (i20 == 2 && string8.startsWith("<script")) {
                            this.f8547w.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e eVarA = new com.applovin.impl.sdk.network.e.a(this.f6990a).b(string8).b(false).a(false).h(f() || i20 == 2).a();
                            if (i19 == 1) {
                                this.f8549y.add(eVarA);
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6992c.a(this.f6991b, "Processed impression URL: " + string8);
                                }
                            } else if (i19 == 2) {
                                this.f8550z.add(eVarA);
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6992c.a(this.f6991b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i19 == 3) {
                                this.A.add(eVarA);
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6992c.a(this.f6991b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i19 == 4) {
                                this.B.add(eVarA);
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6992c.a(this.f6991b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i19 == 555) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6992c.a(this.f6991b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (com.applovin.impl.sdk.p.a()) {
                                this.f6992c.b(this.f6991b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.b(this.f6991b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i18++;
                r11 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Processing VAST video...");
        }
        this.f6990a.s0().a(k6.a(str, JsonUtils.shallowCopy(this.f8531g), JsonUtils.shallowCopy(this.f8532h), this, this.f6990a));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f8531g), JsonUtils.shallowCopy(this.f8532h), this.f6990a).setTitle(this.f8534j).setAdvertiser(this.f8535k).setBody(this.f8536l).setCallToAction(this.f8538n).setStarRating(this.f8537m).setIconUri(this.f8539o).setMainImageUri(this.f8540p).setPrivacyIconUri(this.f8542r).setVastAd(this.f8541q).setPrivacyDestinationUri(this.f8543s).setClickDestinationUri(this.f8544t).setClickDestinationBackupUri(this.f8545u).setClickTrackingUrls(this.f8546v).setJsTrackers(this.f8547w).setClickTrackingRequests(this.f8548x).setImpressionRequests(this.f8549y).setViewableMRC50Requests(this.f8550z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f6990a.s0().a((k5) new a(appLovinNativeAdImplBuild, this.f6990a, this), f6.b.CORE);
    }

    private void b(String str) {
        this.f8533i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0119a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
