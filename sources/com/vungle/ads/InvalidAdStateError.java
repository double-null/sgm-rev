package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InvalidAdStateError extends VungleError {
    public /* synthetic */ InvalidAdStateError(Sdk.SDKError.Reason reason, String str, int i10, k kVar) {
        this(reason, (i10 & 2) != 0 ? "Ad state is invalid" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAdStateError(Sdk.SDKError.Reason loggableReason, String errorMessage) {
        super(loggableReason, errorMessage, null);
        t.f(loggableReason, "loggableReason");
        t.f(errorMessage, "errorMessage");
    }
}
