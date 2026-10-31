package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class APIFailedStatusCodeError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public APIFailedStatusCodeError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ APIFailedStatusCodeError(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public APIFailedStatusCodeError(String str) {
        super(Sdk.SDKError.Reason.API_FAILED_STATUS_CODE, "Failed to get a successful response: " + str, null);
    }
}
