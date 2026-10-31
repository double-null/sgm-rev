package io.bidmachine.ads.networks.nast;

import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.util.HashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import vb.d;
import vb.l;

/* JADX INFO: compiled from: NastAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NastAdapter extends HeaderBiddingAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16718a = new a(null);

    /* JADX INFO: compiled from: NastAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public NastAdapter() {
        super("nast", "1.0", "3.6.1.1", 1, new AdsType[]{AdsType.Native});
    }

    @Override // io.bidmachine.NetworkAdapter
    public l createNativeAd() {
        return new io.bidmachine.ads.networks.nast.a();
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
    protected void onCollectHeaderBiddingParams(ContextProvider contextProvider, d adRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams hbAdRequestParams, HeaderBiddingCollectParamsCallback collectCallback) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(adRequestParams, "adRequestParams");
        t.f(networkAdUnit, "networkAdUnit");
        t.f(hbAdRequestParams, "hbAdRequestParams");
        t.f(collectCallback, "collectCallback");
        collectCallback.onCollectFinished(new HashMap());
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback callback) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(initializationParams, "initializationParams");
        t.f(networkConfigParams, "networkConfigParams");
        t.f(callback, "callback");
        callback.onSuccess();
    }
}
