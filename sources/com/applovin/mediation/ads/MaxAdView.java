package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.g8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes2.dex */
public class MaxAdView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f9464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f9465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9466c;

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i10, Context context) {
        View view = new View(context.getApplicationContext());
        this.f9465b = view;
        view.setBackgroundColor(0);
        addView(this.f9465b);
        this.f9465b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f9466c = getVisibility();
        this.f9464a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f9465b, context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f9464a.logApiCall("destroy()");
        this.f9464a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f9464a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f9464a.getAdUnitId();
    }

    public String getPlacement() {
        this.f9464a.logApiCall("getPlacement()");
        return this.f9464a.getPlacement();
    }

    public void loadAd() {
        this.f9464a.logApiCall("loadAd()");
        this.f9464a.loadAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (isInEditMode()) {
            return;
        }
        this.f9464a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
        if (this.f9464a != null && g8.a(this.f9466c, i10)) {
            this.f9464a.onWindowVisibilityChanged(i10);
        }
        this.f9466c = i10;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f9464a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f9464a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f9464a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f9465b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f9464a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f9464a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f9465b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.f9464a.logApiCall("setCustomData(value=" + str + ")");
        this.f9464a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f9464a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f9464a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f9464a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f9464a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f9464a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f9464a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f9464a.logApiCall("setPlacement(placement=" + str + ")");
        this.f9464a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f9464a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f9464a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f9464a.logApiCall("startAutoRefresh()");
        this.f9464a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f9464a.logApiCall("stopAutoRefresh()");
        this.f9464a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f9464a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f9464a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + yhXxbqGRMeI.UEpPGoIZA);
        this.f9464a.setRequestListener(maxAdRequestListener);
    }

    public MaxAdView(String str, MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, s.a(l.p()), maxAdViewConfiguration);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration) {
        super(l.p());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        a(str, maxAdFormat, maxAdViewConfiguration, 49, l.p());
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        MaxAdFormat maxAdFormatA;
        super(context, attributeSet, i10);
        String strA = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String strA2 = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(strA2)) {
            maxAdFormatA = MaxAdFormat.formatFromString(strA2);
        } else {
            maxAdFormatA = s.a(context);
        }
        MaxAdFormat maxAdFormat = maxAdFormatA;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA != null) {
            if (!TextUtils.isEmpty(strA)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(strA, maxAdFormat, null, attributeIntValue, context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }

    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, s.a(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ")");
        a(str, maxAdFormat, null, 49, context);
    }
}
