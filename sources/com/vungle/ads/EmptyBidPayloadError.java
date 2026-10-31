package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class EmptyBidPayloadError extends VungleError {
    public EmptyBidPayloadError(String str) {
        super(Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD, str + " header bidding status does not match with loadAd parameters", null);
    }
}
