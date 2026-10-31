package io.bidmachine;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HeaderBiddingAdapter extends NetworkAdapter {
    protected HeaderBiddingAdapter(String str, String str2, String str3, int i10, AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }

    public final void collectHeaderBiddingParams(ContextProvider contextProvider, vb.d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        int adapterMinDeviceApiVersion = getAdapterMinDeviceApiVersion();
        if (Build.VERSION.SDK_INT < adapterMinDeviceApiVersion) {
            headerBiddingCollectParamsCallback.onCollectFail(oc.a.a("minSdkVersion is " + adapterMinDeviceApiVersion));
            return;
        }
        if (isInitialized(contextProvider)) {
            onCollectHeaderBiddingParams(contextProvider, dVar, networkAdUnit, headerBiddingAdRequestParams, headerBiddingCollectParamsCallback);
        } else {
            headerBiddingCollectParamsCallback.onCollectFail(oc.a.d());
        }
    }

    protected abstract void onCollectHeaderBiddingParams(ContextProvider contextProvider, vb.d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable;
}
