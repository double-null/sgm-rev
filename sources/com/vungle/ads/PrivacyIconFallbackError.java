package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyIconFallbackError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyIconFallbackError(String errorMessage) {
        super(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR, errorMessage, null);
        t.f(errorMessage, "errorMessage");
    }
}
