package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InvalidAppId extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAppId(String msg) {
        super(Sdk.SDKError.Reason.INVALID_APP_ID, msg, null);
        t.f(msg, "msg");
    }
}
