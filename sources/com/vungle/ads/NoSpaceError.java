package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NoSpaceError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public NoSpaceError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NoSpaceError(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? "No space left on device" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSpaceError(String msg) {
        super(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE, msg, null);
        t.f(msg, "msg");
    }
}
