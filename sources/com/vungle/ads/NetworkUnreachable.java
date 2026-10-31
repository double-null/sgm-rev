package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkUnreachable extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkUnreachable(String message) {
        super(Sdk.SDKError.Reason.API_REQUEST_ERROR, message, null);
        t.f(message, "message");
    }
}
