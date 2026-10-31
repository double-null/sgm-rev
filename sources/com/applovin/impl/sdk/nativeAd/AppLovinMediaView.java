package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final com.applovin.impl.sdk.p logger;
    protected final AppLovinNativeAdImpl nativeAd;
    protected final com.applovin.impl.sdk.l sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.l lVar, Context context) {
        super(context);
        setBackgroundColor(-16777216);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = lVar;
        this.logger = lVar.Q();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        r7 vastAd = appLovinNativeAdImpl.getVastAd();
        Uri uriN0 = vastAd != null ? vastAd.n0() : null;
        if (mainImageUri == null && uriN0 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) lVar.a(z4.J2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.f9233g0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(imageView, mainImageUri);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
    }
}
