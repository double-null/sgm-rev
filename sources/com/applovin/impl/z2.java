package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class z2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f9173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f9174c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9175d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9176e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f9177f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public z2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f9172a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f9177f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f9173b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, i.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.f9173b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f9176e) {
            maxAd = null;
            while (!this.f9174c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (MaxAd) this.f9174c.remove();
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f9177f = null;
        a();
        this.f9173b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f9176e) {
            z10 = !this.f9174c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f9176e) {
            if (!this.f9175d && this.f9174c.size() < this.f9172a) {
                this.f9175d = true;
                this.f9173b.loadAd();
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f9177f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f9177f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f9177f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f9176e) {
            this.f9174c.add(maxAd);
            this.f9175d = false;
            e();
        }
        a aVar = this.f9177f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.f9176e) {
            Iterator it = this.f9174c.iterator();
            while (it.hasNext()) {
                a((MaxAd) it.next());
            }
            this.f9174c.clear();
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f9173b.render(maxNativeAdView, maxAd);
    }
}
