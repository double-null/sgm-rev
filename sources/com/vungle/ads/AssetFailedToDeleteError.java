package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AssetFailedToDeleteError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetFailedToDeleteError(String message) {
        super(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE, message, null);
        t.f(message, "message");
    }
}
