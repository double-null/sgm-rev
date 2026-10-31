package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkTimeoutError extends VungleError {
    public NetworkTimeoutError() {
        super(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT, "Ads: Network Timeout", null);
    }
}
