package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfwa extends WebViewClient {
    final /* synthetic */ zzfwc zza;

    zzfwa(zzfwc zzfwcVar) {
        Objects.requireNonNull(zzfwcVar);
        this.zza = zzfwcVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String string = renderProcessGoneDetail.toString();
        String strValueOf = String.valueOf(webView);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length());
        sb2.append("WebView renderer gone: ");
        sb2.append(string);
        sb2.append("for WebView: ");
        sb2.append(strValueOf);
        Log.w("NativeBridge", sb2.toString());
        zzfwc zzfwcVar = this.zza;
        if (zzfwcVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfwcVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
