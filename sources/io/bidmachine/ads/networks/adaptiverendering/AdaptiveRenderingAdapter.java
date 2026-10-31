package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.iab.mraid.c0;
import java.util.HashMap;
import kotlin.collections.o;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import la.f;
import o7.d;
import t7.c;
import vb.e;
import vb.h;

/* JADX INFO: compiled from: AdaptiveRenderingAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdaptiveRenderingAdapter extends HeaderBiddingAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16510a = new a(null);

    /* JADX INFO: compiled from: AdaptiveRenderingAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AdaptiveRenderingAdapter.kt */
    static final class b extends u implements id.a<xb.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f16511d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f16511d = context;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final xb.a invoke() {
            return d.b(this.f16511d);
        }
    }

    public AdaptiveRenderingAdapter() {
        super("adaptive_rendering", "3.6.1", "3.6.1.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new k6.b();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new k6.d();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new k6.d();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        t.f(contextProvider, "contextProvider");
        return false;
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(ContextProvider contextProvider, vb.d adRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams hbAdRequestParams, HeaderBiddingCollectParamsCallback collectCallback) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(adRequestParams, "adRequestParams");
        t.f(networkAdUnit, "networkAdUnit");
        t.f(hbAdRequestParams, "hbAdRequestParams");
        t.f(collectCallback, "collectCallback");
        HashMap map = new HashMap();
        String[] strArrB = c0.b(contextProvider.getApplicationContext());
        t.e(strArrB, "getSupportedFeatures(con….getApplicationContext())");
        map.put("features", o.Q(strArrB, ",", null, null, 0, null, null, 62, null));
        collectCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback callback) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(initializationParams, "initializationParams");
        t.f(networkConfigParams, "networkConfigParams");
        t.f(callback, "callback");
        Context applicationContext = contextProvider.getApplicationContext();
        t.e(applicationContext, "contextProvider.getApplicationContext()");
        c.f(applicationContext);
        f.f21923a.e(applicationContext, new k6.f(), new b(applicationContext));
        callback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        f.f21923a.f(z10);
    }
}
