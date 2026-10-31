package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PlacementNotFoundError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacementNotFoundError(String placementId) {
        super(Sdk.SDKError.Reason.INVALID_PLACEMENT_ID, "Placement '" + placementId + "' is invalid", null);
        t.f(placementId, "placementId");
    }
}
