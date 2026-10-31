package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f7140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7142c;

    /* JADX INFO: loaded from: classes2.dex */
    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f7143a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7144b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7145c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f7143a;
        }

        public int getAdaptiveWidth() {
            return this.f7144b;
        }

        public int getInlineMaximumHeight() {
            return this.f7145c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i10) {
            com.applovin.impl.sdk.p.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i10 + ")");
            this.f7145c = i10;
            return this;
        }

        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.f7143a + ", adaptiveWidth=" + this.f7144b + ", inlineMaximumHeight=" + this.f7145c + "}";
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.p.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + xjwcmjDeOXR.fLzUcitOcUskSd);
            this.f7143a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i10) {
            com.applovin.impl.sdk.p.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i10 + OgqfiHA.ChHJuSZ);
            this.f7144b = i10;
            return this;
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f7140a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f7141b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f7142c;
    }

    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.f7140a + ", adaptiveWidth=" + this.f7141b + ", inlineMaximumHeight=" + this.f7142c + "}";
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f7140a = builderImpl.f7143a;
        this.f7141b = builderImpl.f7144b;
        this.f7142c = builderImpl.f7145c;
    }
}
