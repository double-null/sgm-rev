package io.bidmachine.ads.networks.mraid;

import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import d7.f;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.iab.mraid.b0;
import io.bidmachine.iab.mraid.j0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import t7.c;
import v6.d;
import vb.e;
import vb.h;

/* JADX INFO: compiled from: MraidAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MraidAdapter extends HeaderBiddingAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16716a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f16717b = new AtomicBoolean(false);

    /* JADX INFO: compiled from: MraidAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public MraidAdapter() {
        super("mraid", "3.6.1", "3.6.1.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new d();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new v6.h(j0.Static);
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new v6.h(j0.Rewarded);
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

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback callback) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(initializationParams, "initializationParams");
        t.f(networkConfigParams, "networkConfigParams");
        t.f(callback, "callback");
        if (f16717b.compareAndSet(false, true)) {
            d7.d.e(new f());
        }
        c.f(contextProvider.getContext());
        callback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        b0.h(z10);
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(ContextProvider contextProvider, vb.d adRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback collectCallback) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(adRequestParams, "adRequestParams");
        t.f(networkAdUnit, "networkAdUnit");
        t.f(headerBiddingAdRequestParams, EFLCCdIRcb.AcMtJH);
        t.f(collectCallback, "collectCallback");
        collectCallback.onCollectFinished(new HashMap());
    }
}
