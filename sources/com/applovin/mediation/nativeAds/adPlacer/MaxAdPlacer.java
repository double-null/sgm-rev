package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.f3;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.y2;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdPlacer implements z2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f9520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f9521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y2 f9522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z2 f9523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Listener f9524e;
    protected final p logger;
    protected final l sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, l.p());
    }

    public void clearAds() {
        a(this.f9522c.b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9548a.b();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i10) {
        final Collection<Integer> collectionE = this.f9522c.e(i10);
        if (!collectionE.isEmpty()) {
            a(collectionE, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9543a.a(i10, collectionE);
                }
            });
        }
        return collectionE;
    }

    public void destroy() {
        if (p.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f9523d.c();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return -System.identityHashCode(this.f9522c.a(i10));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10) {
        if (isFilledPosition(i10)) {
            boolean z10 = this.f9520a != AppLovinSdkUtils.Size.ZERO;
            f3 f3Var = (f3) this.f9522c.a(i10);
            if (z10) {
                return this.f9520a;
            }
            if (f3Var.v0() != null) {
                View mainView = f3Var.v0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f9522c.b(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f9522c.c(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f9522c.d(i10);
    }

    public void insertItem(int i10) {
        if (p.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i10);
        }
        this.f9522c.f(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f9522c.g(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f9522c.h(i10);
    }

    public void loadAds() {
        if (p.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f9523d.e();
    }

    public void moveItem(int i10, int i11) {
        this.f9522c.b(i10, i11);
    }

    @Override // com.applovin.impl.z2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f9524e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.z2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f9524e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.z2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (p.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.z2.a
    public void onNativeAdLoaded() {
        if (p.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(final int i10) {
        a(isFilledPosition(i10) ? Collections.singletonList(Integer.valueOf(i10)) : Collections.emptyList(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f9546a.a(i10);
            }
        });
    }

    public void renderAd(int i10, ViewGroup viewGroup) {
        MaxAd maxAdA = this.f9522c.a(i10);
        if (maxAdA == null) {
            if (p.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i10);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewV0 = ((f3) maxAdA).v0();
        if (maxNativeAdViewV0 == null) {
            if (this.f9521b == null) {
                if (p.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewV0 = new MaxNativeAdView(this.f9521b, viewGroup.getContext());
            if (this.f9523d.a(maxNativeAdViewV0, maxAdA)) {
                if (p.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i10);
                }
            } else if (p.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10);
            }
        } else if (p.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i10);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewV0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewV0.getParent()).removeView(maxNativeAdViewV0);
        }
        viewGroup.addView(maxNativeAdViewV0, -1, -1);
    }

    public void setAdSize(int i10, int i11) {
        this.f9520a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f9524e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f9521b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f9522c.c(i10, i11);
        if (i10 == -1 || i11 == -1) {
            return;
        }
        a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10, Collection collection) {
        if (p.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i10);
        }
        this.f9522c.a(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (p.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f9522c.a();
        this.f9523d.a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f9520a = AppLovinSdkUtils.Size.ZERO;
        l lVarA = appLovinSdk.a();
        this.sdk = lVarA;
        p pVarQ = lVarA.Q();
        this.logger = pVarQ;
        this.f9522c = new y2(maxAdPlacerSettings);
        this.f9523d = new z2(maxAdPlacerSettings, context, this);
        if (p.a()) {
            pVarQ.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (p.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i10);
        }
        this.f9522c.i(i10);
    }

    private void a() {
        int iC;
        while (this.f9523d.d() && (iC = this.f9522c.c()) != -1) {
            if (p.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + iC);
            }
            this.f9522c.a(this.f9523d.b(), iC);
            Listener listener = this.f9524e;
            if (listener != null) {
                listener.onAdLoaded(iC);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f9523d.a(this.f9522c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (p.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f9524e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f9524e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
