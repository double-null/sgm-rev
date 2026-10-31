package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InvalidCTAUrl extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCTAUrl(String msg) {
        super(Sdk.SDKError.Reason.INVALID_CTA_URL, msg, null);
        t.f(msg, "msg");
    }
}
