package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdMarkupJsonError extends VungleError {
    public AdMarkupJsonError(String str) {
        super(Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD, "Unable to decode payload into BidPayload object. Error: " + str, null);
    }
}
