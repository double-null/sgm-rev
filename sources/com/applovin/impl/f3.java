package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f3 extends j3 implements u1 {
    private final AtomicBoolean A;
    private final AtomicBoolean B;

    public f3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(c3Var, jSONObject, jSONObject2, null, lVar);
        this.A = new AtomicBoolean();
        this.B = new AtomicBoolean();
    }

    private long u0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f7104a.a(t3.f8796d8)).longValue()) : jA;
    }

    public boolean A0() {
        return this.f5941o == null;
    }

    @Override // com.applovin.impl.a3
    public a3 a(com.applovin.impl.mediation.h hVar) {
        return new f3(this, hVar);
    }

    @Override // com.applovin.impl.u1
    public long getTimeToLiveMillis() {
        return u0() - (SystemClock.elapsedRealtime() - L());
    }

    @Override // com.applovin.impl.u1
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public MaxNativeAdView v0() {
        return this.f5941o.f();
    }

    public ViewGroup w0() {
        return this.f5941o.h();
    }

    public AtomicBoolean x0() {
        return this.A;
    }

    public AtomicBoolean y0() {
        return this.B;
    }

    public boolean z0() {
        return a("inacc", (Boolean) this.f7104a.a(t3.f8819y8)).booleanValue();
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f5941o.a(maxNativeAdView);
    }

    public void a(ViewGroup viewGroup) {
        this.f5941o.a(viewGroup);
    }

    private f3(f3 f3Var, com.applovin.impl.mediation.h hVar) {
        super(f3Var.Q(), f3Var.a(), f3Var.g(), hVar, f3Var.f7104a);
        this.A = new AtomicBoolean();
        this.B = new AtomicBoolean();
    }
}
