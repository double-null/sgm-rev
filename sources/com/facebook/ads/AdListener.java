package com.facebook.ads;

/* JADX INFO: loaded from: classes.dex */
public interface AdListener {
    void onAdClicked(Ad ad2);

    void onAdLoaded(Ad ad2);

    void onError(Ad ad2, AdError adError);

    void onLoggingImpression(Ad ad2);
}
