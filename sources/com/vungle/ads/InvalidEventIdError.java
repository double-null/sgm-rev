package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InvalidEventIdError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidEventIdError(String msg) {
        super(Sdk.SDKError.Reason.INVALID_EVENT_ID_ERROR, msg, null);
        t.f(msg, "msg");
    }
}
