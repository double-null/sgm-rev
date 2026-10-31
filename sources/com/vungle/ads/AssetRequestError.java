package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AssetRequestError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetRequestError(String msg) {
        super(Sdk.SDKError.Reason.ASSET_REQUEST_ERROR, msg, null);
        t.f(msg, "msg");
    }
}
