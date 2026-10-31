package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import b2.Bo.yeILL;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h6 extends k5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f6737o = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f6738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f6739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f6740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0112a f6741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f6742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f6743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f6744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f6745n;

    /* JADX INFO: loaded from: classes.dex */
    private class b extends k5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f6746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f6747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final a3 f6748i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f6749j;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = h6.this.f6738g.b();
            MaxAdFormat maxAdFormatA = h6.this.f6738g.a();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Loading ad " + (this.f6747h + 1) + " of " + this.f6749j.size() + " from " + this.f6748i.c() + " for " + maxAdFormatA.getLabel() + " ad unit " + strB);
            }
            b("started to load ad");
            Context context = (Context) h6.this.f6742k.get();
            Activity activityW0 = context instanceof Activity ? (Activity) context : this.f6990a.w0();
            this.f6990a.c0().b(this.f6748i);
            this.f6990a.Z().loadThirdPartyMediatedAd(strB, this.f6748i, activityW0, new a(h6.this.f6741j, maxAdFormatA, strB));
        }

        /* JADX INFO: loaded from: classes2.dex */
        class a extends k3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f6751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f6752c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0112a);
                this.f6751b = maxAdFormat;
                this.f6752c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f6746g;
                com.applovin.impl.sdk.p unused = b.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    b.this.f6992c.a(b.this.f6991b, "Ad loaded in " + jElapsedRealtime + "ms for " + this.f6751b.getLabel() + " ad unit " + this.f6752c);
                }
                a3 a3Var = (a3) maxAd;
                b.this.a(a3Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i10 = b.this.f6747h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f6749j.size()) {
                        h6.this.b(a3Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((a3) bVar.f6749j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f6746g;
                com.applovin.impl.sdk.p unused = b.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    b.this.f6992c.a(b.this.f6991b, "Ad failed to load in " + jElapsedRealtime + " ms for " + this.f6751b.getLabel() + " ad unit " + str + yeILL.HZfI + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f6748i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f6747h < b.this.f6749j.size() - 1) {
                    b bVar2 = b.this;
                    b.this.f6990a.s0().a((k5) new b(bVar2.f6747h + 1, b.this.f6749j), f6.b.MEDIATION);
                } else {
                    h6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }
        }

        private b(int i10, List list) {
            super(h6.this.f6991b, h6.this.f6990a, h6.this.f6738g.b());
            this.f6746g = SystemClock.elapsedRealtime();
            this.f6747h = i10;
            this.f6748i = (a3) list.get(i10);
            this.f6749j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(a3 a3Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            h6.this.f6745n.add(new MaxNetworkResponseInfoImpl(adLoadState, y3.a(a3Var.b()), a3Var.F(), a3Var.Z(), j10, a3Var.C(), maxError));
        }
    }

    public h6(c3 c3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.l lVar, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
        super("TaskProcessMediationWaterfall", lVar, c3Var.b());
        this.f6738g = c3Var;
        this.f6739h = jSONObject;
        this.f6741j = interfaceC0112a;
        this.f6742k = new WeakReference(context);
        this.f6743l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.f6740i = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f6740i.add(a3.a(c3Var, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, lVar));
        }
        this.f6745n = new ArrayList(this.f6740i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f6744m = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f6739h.optBoolean("is_testing", false) && !this.f6990a.u0().c() && f6737o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.za
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9434a.e();
                }
            });
        }
        String strB = this.f6738g.b();
        MaxAdFormat maxAdFormatA = this.f6738g.a();
        if (this.f6740i.size() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f6740i.size() + " ad(s)...");
            }
            this.f6990a.s0().a(new b(i10, this.f6740i));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.k(this.f6991b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        q7.a(strB, maxAdFormatA, this.f6739h, this.f6990a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f6739h, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (y3.a(this.f6739h, strB, this.f6990a)) {
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
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.ab
            @Override // java.lang.Runnable
            public final void run() {
                this.f5968a.b(maxErrorImpl);
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
    public void b(a3 a3Var) {
        this.f6990a.c0().c(a3Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6744m;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.d(this.f6991b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + a3Var.c() + " for " + this.f6738g.a().getLabel() + " ad unit " + this.f6738g.b());
        }
        a3Var.a(new MaxAdWaterfallInfoImpl(a3Var, jElapsedRealtime, this.f6745n, this.f6743l));
        v2.f(this.f6741j, a3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f6745n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f6745n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
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
        String strB = this.f6738g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6744m;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.d(this.f6991b, CwEo.eAFHx + jElapsedRealtime + "ms for " + this.f6738g.a().getLabel() + " ad unit " + strB + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f6739h, "waterfall_name", ""), JsonUtils.getString(this.f6739h, "waterfall_test_name", ""), jElapsedRealtime, this.f6745n, this.f6738g, JsonUtils.optList(JsonUtils.getJSONArray(this.f6739h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f6743l, JsonUtils.getString(this.f6739h, "event_id", "")));
        v2.a(this.f6741j, strB, maxError);
    }
}
