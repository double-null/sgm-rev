package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdFormat f9474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f9478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f9479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private View f9480g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f9481h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private View f9482i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f9483j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f9484k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Double f9485l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f9474a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f9476c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f9477d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f9478e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f9479f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f9480g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f9483j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f9484k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f9482i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f9481h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f9485l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f9475b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f9474a;
        this.title = builder.f9475b;
        this.advertiser = builder.f9476c;
        this.body = builder.f9477d;
        this.callToAction = builder.f9478e;
        this.icon = builder.f9479f;
        this.iconView = builder.f9480g;
        this.optionsView = builder.f9481h;
        this.mediaView = builder.f9482i;
        this.mainImage = builder.f9483j;
        this.mediaContentAspectRatio = builder.f9484k;
        Double d10 = builder.f9485l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f9486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f9487b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f9486a = drawable;
        }

        public Drawable getDrawable() {
            return this.f9486a;
        }

        public Uri getUri() {
            return this.f9487b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f9487b = uri;
        }
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }
}
