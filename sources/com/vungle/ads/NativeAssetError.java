package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeAssetError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAssetError(String msg) {
        super(Sdk.SDKError.Reason.NATIVE_ASSET_ERROR, msg, null);
        t.f(msg, "msg");
    }
}
