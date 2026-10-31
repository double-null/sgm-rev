package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InvalidBannerSizeError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public InvalidBannerSizeError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ InvalidBannerSizeError(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public InvalidBannerSizeError(String str) {
        super(Sdk.SDKError.Reason.BANNER_VIEW_INVALID_SIZE, "Invalidate size for banner ad: " + str, null);
    }
}
