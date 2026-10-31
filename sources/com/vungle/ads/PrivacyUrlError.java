package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyUrlError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyUrlError(String privacyUrl) {
        super(Sdk.SDKError.Reason.PRIVACY_URL_ERROR, "Failed to open privacy url: " + privacyUrl, null);
        t.f(privacyUrl, "privacyUrl");
    }
}
