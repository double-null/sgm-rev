package com.applovin.mediation.nativeAds;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f9505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9512h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9513i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f9514j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f9515k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f9516l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f9517m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f9518n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f9505a, this.f9506b, this.f9507c, this.f9508d, this.f9509e, this.f9510f, this.f9511g, this.f9514j, this.f9512h, this.f9513i, this.f9515k, this.f9516l, this.f9517m, this.f9518n);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f9508d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f9509e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f9517m = i10;
            return this;
        }

        @Deprecated
        protected Builder setIconContentViewId(int i10) {
            this.f9511g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f9510f = i10;
            return this;
        }

        @Deprecated
        protected Builder setMediaContentFrameLayoutId(int i10) {
            this.f9516l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f9515k = i10;
            return this;
        }

        @Deprecated
        protected Builder setOptionsContentFrameLayoutId(int i10) {
            this.f9513i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f9512h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i10) {
            this.f9514j = i10;
            return this;
        }

        protected Builder setTemplateType(String str) {
            this.f9518n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f9507c = i10;
            return this;
        }

        public Builder(int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f9507c = -1;
            this.f9508d = -1;
            this.f9509e = -1;
            this.f9510f = -1;
            this.f9511g = -1;
            this.f9512h = -1;
            this.f9513i = -1;
            this.f9514j = -1;
            this.f9515k = -1;
            this.f9516l = -1;
            this.f9517m = -1;
            this.f9506b = i10;
            this.f9505a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
