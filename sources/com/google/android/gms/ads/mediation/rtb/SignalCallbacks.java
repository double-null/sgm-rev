package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface SignalCallbacks {
    void onFailure(AdError adError);

    void onSuccess(String str);
}
