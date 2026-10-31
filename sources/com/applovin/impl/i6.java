package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i6 extends k5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f6814o = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f6815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f6816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f6817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0112a f6818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f6819k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f6820l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f6821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f6822n;

    /* JADX INFO: loaded from: classes.dex */
    class a extends k3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f6823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a, MaxAdFormat maxAdFormat) {
            super(interfaceC0112a);
            this.f6823b = maxAdFormat;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.p unused = i6.this.f6992c;
            if (com.applovin.impl.sdk.p.a()) {
                i6.this.f6992c.a(i6.this.f6991b, "Failed to load ad to cache for failover: " + maxError);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", str);
            CollectionUtils.putStringIfValid("ad_format", this.f6823b.getLabel(), mapHashMap);
            i6.this.f6990a.R().d(f2.G0, mapHashMap);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.sdk.p unused = i6.this.f6992c;
            if (com.applovin.impl.sdk.p.a()) {
                i6.this.f6992c.a(i6.this.f6991b, "Successfully loaded ad to cache for failover: " + maxAd);
            }
            e3 e3Var = (e3) maxAd;
            i6.this.f6990a.R().a(f2.F0, e3Var);
            i6.this.f6990a.H().a(e3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class b extends k5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f6825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f6826h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final a3 f6827i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f6828j;

        class a extends k3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f6830b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f6831c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0112a);
                this.f6830b = maxAdFormat;
                this.f6831c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f6825g;
                com.applovin.impl.sdk.p unused = b.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    b.this.f6992c.a(b.this.f6991b, "Ad failed to load in " + jElapsedRealtime + " ms for " + this.f6830b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f6827i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f6826h >= b.this.f6828j.size() - 1) {
                    i6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f6990a.s0().a((k5) new b(i6.this, bVar2.f6826h + 1, b.this.f6828j, null), f6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f6825g;
                com.applovin.impl.sdk.p unused = b.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    b.this.f6992c.a(b.this.f6991b, "Ad loaded in " + jElapsedRealtime + "ms for " + this.f6830b.getLabel() + " ad unit " + this.f6831c);
                }
                a3 a3Var = (a3) maxAd;
                b.this.a(a3Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i10 = b.this.f6826h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f6828j.size()) {
                        b bVar = b.this;
                        i6.this.a(a3Var, bVar.f6826h);
                        return;
                    } else {
                        b bVar2 = b.this;
                        bVar2.a((a3) bVar2.f6828j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* synthetic */ b(i6 i6Var, int i10, List list, a aVar) {
            this(i10, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = i6.this.f6815g.b();
            MaxAdFormat maxAdFormatA = i6.this.f6815g.a();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Loading ad " + (this.f6826h + 1) + " of " + this.f6828j.size() + " from " + this.f6827i.c() + " for " + maxAdFormatA.getLabel() + " ad unit " + strB);
            }
            b("started to load ad");
            Context context = (Context) i6.this.f6819k.get();
            Activity activityW0 = context instanceof Activity ? (Activity) context : this.f6990a.w0();
            this.f6990a.c0().b(this.f6827i);
            this.f6990a.Z().loadThirdPartyMediatedAd(strB, this.f6827i, activityW0, new a(i6.this.f6818j, maxAdFormatA, strB));
        }

        private b(int i10, List list) {
            super(i6.this.f6991b, i6.this.f6990a, i6.this.f6815g.b());
            this.f6825g = SystemClock.elapsedRealtime();
            this.f6826h = i10;
            this.f6827i = (a3) list.get(i10);
            this.f6828j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(a3 a3Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            i6.this.f6822n.add(new MaxNetworkResponseInfoImpl(adLoadState, y3.a(a3Var.b()), a3Var.F(), a3Var.Z(), j10, a3Var.C(), maxError));
        }
    }

    public i6(c3 c3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.l lVar, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
        super("TaskProcessMediationWaterfallV2", lVar, c3Var.b());
        this.f6815g = c3Var;
        this.f6816h = jSONObject;
        this.f6818j = interfaceC0112a;
        this.f6819k = new WeakReference(context);
        this.f6820l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.f6817i = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f6817i.add(a3.a(c3Var, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, lVar));
        }
        this.f6822n = new ArrayList(this.f6817i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f6821m = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f6816h.optBoolean("is_testing", false) && !this.f6990a.u0().c() && f6814o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.db
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6380a.e();
                }
            });
        }
        String strB = this.f6815g.b();
        MaxAdFormat maxAdFormatA = this.f6815g.a();
        if (!CollectionUtils.isEmpty(this.f6817i)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f6817i.size() + " ad(s)...");
            }
            this.f6990a.s0().a(new b(this, i10, this.f6817i, null));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.k(this.f6991b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        q7.a(strB, maxAdFormatA, this.f6816h, this.f6990a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f6816h, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (y3.a(this.f6816h, strB, this.f6990a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + strB + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (q7.c(this.f6990a) && ((Boolean) this.f6990a.a(z4.E6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.eb
            @Override // java.lang.Runnable
            public final void run() {
                this.f6438a.b(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            i0.a(millis, this.f6990a, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        q7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f6990a.w0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var, int i10) {
        this.f6990a.c0().c(a3Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6821m;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.d(this.f6991b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + a3Var.c() + " for " + this.f6815g.a().getLabel() + " ad unit " + this.f6815g.b());
        }
        a3Var.a(new MaxAdWaterfallInfoImpl(a3Var, jElapsedRealtime, this.f6822n, this.f6820l));
        v2.f(this.f6818j, a3Var);
        if (((Boolean) this.f6990a.a(t3.Q8)).booleanValue() && a3Var.getFormat().isFullscreenAd() && !y3.b(a3Var)) {
            a(i10);
        }
    }

    private void a(int i10) {
        a3 a3Var;
        String strB = this.f6815g.b();
        MaxAdFormat maxAdFormatA = this.f6815g.a();
        int size = this.f6817i.size();
        do {
            i10++;
            if (i10 < size) {
                a3Var = (a3) this.f6817i.get(i10);
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.a(this.f6991b, "No available ad in waterfall for failover cache");
                }
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", strB);
                CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), mapHashMap);
                this.f6990a.R().d(f2.D0, mapHashMap);
                return;
            }
        } while (!y3.b(a3Var));
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Loading ad for failover cache");
        }
        this.f6990a.R().a(f2.E0, a3Var);
        a(a3Var, strB, maxAdFormatA);
    }

    private void a(final a3 a3Var, final String str, final MaxAdFormat maxAdFormat) {
        ((e3) a3Var).a(true);
        Context context = (Context) this.f6819k.get();
        final Activity activityW0 = context instanceof Activity ? (Activity) context : this.f6990a.w0();
        this.f6990a.s0().a((k5) new u6(this.f6990a, UICvx.rexkSYiEqOJ, new Runnable() { // from class: com.applovin.impl.fb
            @Override // java.lang.Runnable
            public final void run() {
                this.f6592a.a(str, a3Var, activityW0, maxAdFormat);
            }
        }), f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, a3 a3Var, Activity activity, MaxAdFormat maxAdFormat) {
        this.f6990a.Z().loadThirdPartyMediatedAd(str, a3Var, activity, new a(null, maxAdFormat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f6822n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f6822n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======");
            sb2.append("\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n");
                sb2.append("..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n");
                sb2.append("..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        String strB = this.f6815g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6821m;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.d(this.f6991b, "Waterfall failed in " + jElapsedRealtime + RHIpdOnfgiYkEj.rANXlLEyYAsV + this.f6815g.a().getLabel() + " ad unit " + strB + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f6816h, "waterfall_name", ""), JsonUtils.getString(this.f6816h, "waterfall_test_name", ""), jElapsedRealtime, this.f6822n, this.f6815g, JsonUtils.optList(JsonUtils.getJSONArray(this.f6816h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f6820l, JsonUtils.getString(this.f6816h, "event_id", "")));
        v2.a(this.f6818j, strB, maxError);
    }
}
