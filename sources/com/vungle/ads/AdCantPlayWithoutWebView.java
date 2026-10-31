package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdCantPlayWithoutWebView extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public AdCantPlayWithoutWebView() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdCantPlayWithoutWebView(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public AdCantPlayWithoutWebView(String str) {
        super(Sdk.SDKError.Reason.WEBVIEW_ERROR, "No WebView when playing ads. " + str, null);
    }
}
