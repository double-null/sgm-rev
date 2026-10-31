package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class WebViewError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WebViewError(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public WebViewError(String str) {
        super(Sdk.SDKError.Reason.WEBVIEW_ERROR, "WebViewError: " + str, null);
    }
}
