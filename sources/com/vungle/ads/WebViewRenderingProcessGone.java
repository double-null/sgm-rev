package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class WebViewRenderingProcessGone extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewRenderingProcessGone() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WebViewRenderingProcessGone(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public WebViewRenderingProcessGone(String str) {
        super(Sdk.SDKError.Reason.WEBVIEW_ERROR, "WebRenderingProcessGone: " + str, null);
    }
}
