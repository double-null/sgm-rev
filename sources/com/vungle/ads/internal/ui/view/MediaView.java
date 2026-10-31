package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.nativead.NativeVideoContract;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MediaView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MediaView extends RelativeLayout {
    private BaseContentView contentView;
    private NativeVideoListener videoListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        this(context, null, 0, 6, null);
        t.f(context, "context");
    }

    public final void destroy$vungle_ads_release() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
        BaseContentView baseContentView = this.contentView;
        if (baseContentView != null) {
            baseContentView.destroy$vungle_ads_release();
        }
        this.contentView = null;
    }

    public final int getCurrentTime() {
        NativeVideoContract.VideoControl videoControl$vungle_ads_release = getVideoControl$vungle_ads_release();
        return (videoControl$vungle_ads_release != null ? videoControl$vungle_ads_release.getCurrentTime() : 0) / 1000;
    }

    public final int getDuration() {
        NativeVideoContract.VideoControl videoControl$vungle_ads_release = getVideoControl$vungle_ads_release();
        return (videoControl$vungle_ads_release != null ? videoControl$vungle_ads_release.getDuration() : 0) / 1000;
    }

    public final NativeVideoContract.VideoControl getVideoControl$vungle_ads_release() {
        ViewParent viewParent = this.contentView;
        if (viewParent instanceof NativeVideoContract.VideoControl) {
            return (NativeVideoContract.VideoControl) viewParent;
        }
        return null;
    }

    public final void present$vungle_ads_release(NativeAdInternal internal) {
        t.f(internal, "internal");
        if (internal.hasVideoContent()) {
            if (this.contentView == null) {
                Context context = getContext();
                t.e(context, "context");
                VideoContentView videoContentView = new VideoContentView(context, internal);
                videoContentView.setNativeVideoListener(this.videoListener);
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
                singleValueMetric.setValue(1L);
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, internal.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.contentView = videoContentView;
            }
        } else if (this.contentView == null) {
            Context context2 = getContext();
            t.e(context2, "context");
            BaseContentView baseContentView = new BaseContentView(context2, internal);
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric2 = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
            singleValueMetric2.setValue(2L);
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, singleValueMetric2, internal.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            this.contentView = baseContentView;
        }
        BaseContentView baseContentView2 = this.contentView;
        if (baseContentView2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            baseContentView2.setLayoutParams(layoutParams);
            if (!t.a(baseContentView2.getParent(), this)) {
                ViewGroup viewGroup = (ViewGroup) baseContentView2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(baseContentView2);
                }
                addView(baseContentView2);
            }
            Context context3 = getContext();
            t.e(context3, "context");
            baseContentView2.render(context3);
        }
    }

    public final void setNativeVideoListener(NativeVideoListener listener) {
        t.f(listener, "listener");
        this.videoListener = listener;
        BaseContentView baseContentView = this.contentView;
        VideoContentView videoContentView = baseContentView instanceof VideoContentView ? (VideoContentView) baseContentView : null;
        if (videoContentView == null) {
            return;
        }
        videoContentView.setNativeVideoListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.f(context, "context");
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i10, int i11, k kVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        t.f(context, "context");
    }
}
