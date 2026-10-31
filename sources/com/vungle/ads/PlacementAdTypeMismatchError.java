package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PlacementAdTypeMismatchError extends VungleError {
    public PlacementAdTypeMismatchError(String str) {
        super(Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH, str + " Ad type does not match with placement type", null);
    }
}
