package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzckt extends WebChromeClient {
    private final zzcku zza;

    public zzckt(zzcku zzckuVar) {
        this.zza = zzckuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcku)) {
            return webView.getContext();
        }
        zzcku zzckuVar = (zzcku) webView;
        Activity activityZzj = zzckuVar.zzj();
        return activityZzj != null ? activityZzj : zzckuVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcku)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = ((zzcku) webView).zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzb();
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb2 = new StringBuilder(length + 6 + String.valueOf(strSourceId).length() + 1 + String.valueOf(iLineNumber).length() + 1);
        sb2.append("JS: ");
        sb2.append(strMessage);
        sb2.append(" (");
        sb2.append(strSourceId);
        sb2.append(":");
        sb2.append(iLineNumber);
        sb2.append(")");
        String string = sb2.toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzcks.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
        } else if (i10 == 2) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
        } else if (i10 == 3 || i10 == 4 || i10 != 5) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
        } else {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcku zzckuVar = this.zza;
        if (zzckuVar.zzQ() != null) {
            webView2.setWebViewClient(zzckuVar.zzQ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(j10 + Math.min(131072L, j13), 1048576L);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            zzcku zzckuVar = this.zza;
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzD(zzckuVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z10 = true;
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzD(zzckuVar.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoI)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z10, true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoJ)).booleanValue()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zza.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzc();
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zza.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzx(view, customViewCallback);
            zzmVarZzL.zzw(i10);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    protected final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        com.google.android.gms.ads.internal.zzb zzbVarZzh;
        try {
            zzcku zzckuVar = this.zza;
            if (zzckuVar != null && zzckuVar.zzP() != null && zzckuVar.zzP().zzh() != null && (zzbVarZzh = zzckuVar.zzP().zzh()) != null && !zzbVarZzh.zzb()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb2.append("window.");
                sb2.append(str);
                sb2.append("('");
                sb2.append(str3);
                sb2.append("')");
                zzbVarZzh.zzc(sb2.toString());
                return false;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builderZzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
            builderZzN.setTitle(str2);
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builderZzN.setView(linearLayout).setPositiveButton(R.string.ok, new zzckr(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzckq(jsPromptResult)).setOnCancelListener(new zzckp(jsPromptResult)).create().show();
            } else {
                builderZzN.setMessage(str3).setPositiveButton(R.string.ok, new zzcko(jsResult)).setNegativeButton(R.string.cancel, new zzckn(jsResult)).setOnCancelListener(new zzckm(jsResult)).create().show();
            }
            return true;
        } catch (WindowManager.BadTokenException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to display Dialog.", e10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
