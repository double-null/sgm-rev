package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: AdSize.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum BannerAdSize {
    VUNGLE_MREC("mrec", 300, 250),
    BANNER("banner", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
    BANNER_SHORT("banner_short", 300, 50),
    BANNER_LEADERBOARD("banner_leaderboard", 728, 90);

    private final int height;
    private final String sizeName;
    private final int width;

    BannerAdSize(String str, int i10, int i11) {
        this.sizeName = str;
        this.width = i10;
        this.height = i11;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getSizeName() {
        return this.sizeName;
    }

    public final int getWidth() {
        return this.width;
    }
}
