package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InvalidCSBDataError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCSBDataError(String message) {
        super(Sdk.SDKError.Reason.INVALID_CSB_DATA, "Invalid CSB data: " + message, null);
        t.f(message, "message");
    }
}
