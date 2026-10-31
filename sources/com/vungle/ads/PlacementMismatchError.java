package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PlacementMismatchError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacementMismatchError(String message) {
        super(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH, message, null);
        t.f(message, "message");
    }
}
