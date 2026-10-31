package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class LinkError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkError(Sdk.SDKError.Reason reason, String msg) {
        super(reason, msg, null);
        t.f(reason, "reason");
        t.f(msg, "msg");
    }
}
