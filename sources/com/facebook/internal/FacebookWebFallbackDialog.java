package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacebookWebFallbackDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookWebFallbackDialog extends WebDialog {
    private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
    private boolean waitingForDialogToClose;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FacebookWebFallbackDialog.class.getName();

    /* JADX INFO: compiled from: FacebookWebFallbackDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final FacebookWebFallbackDialog newInstance(Context context, String url, String expectedRedirectUrl) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(url, "url");
            kotlin.jvm.internal.t.f(expectedRedirectUrl, "expectedRedirectUrl");
            WebDialog.initDefaultTheme(context);
            return new FacebookWebFallbackDialog(context, url, expectedRedirectUrl, null);
        }
    }

    public /* synthetic */ FacebookWebFallbackDialog(Context context, String str, String str2, kotlin.jvm.internal.k kVar) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel$lambda$0(FacebookWebFallbackDialog this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        super.cancel();
    }

    public static final FacebookWebFallbackDialog newInstance(Context context, String str, String str2) {
        return Companion.newInstance(context, str, str2);
    }

    @Override // com.facebook.internal.WebDialog, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webView = getWebView();
        if (!isPageFinished() || isListenerCalled() || webView == null || !webView.isShown()) {
            super.cancel();
            return;
        }
        if (this.waitingForDialogToClose) {
            return;
        }
        this.waitingForDialogToClose = true;
        webView.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                FacebookWebFallbackDialog.cancel$lambda$0(this.f11089a);
            }
        }, 1500L);
    }

    @Override // com.facebook.internal.WebDialog
    public Bundle parseResponseUri(String str) {
        Bundle urlQueryString = Utility.parseUrlQueryString(Uri.parse(str).getQuery());
        String string = urlQueryString.getString(ServerProtocol.FALLBACK_DIALOG_PARAM_BRIDGE_ARGS);
        urlQueryString.remove(ServerProtocol.FALLBACK_DIALOG_PARAM_BRIDGE_ARGS);
        if (!Utility.isNullOrEmpty(string)) {
            try {
                urlQueryString.putBundle(NativeProtocol.EXTRA_PROTOCOL_BRIDGE_ARGS, BundleJSONConverter.convertToBundle(new JSONObject(string)));
            } catch (JSONException e10) {
                Utility.logd(TAG, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = urlQueryString.getString(ServerProtocol.FALLBACK_DIALOG_PARAM_METHOD_RESULTS);
        urlQueryString.remove(ServerProtocol.FALLBACK_DIALOG_PARAM_METHOD_RESULTS);
        if (!Utility.isNullOrEmpty(string2)) {
            try {
                urlQueryString.putBundle(NativeProtocol.EXTRA_PROTOCOL_METHOD_RESULTS, BundleJSONConverter.convertToBundle(new JSONObject(string2)));
            } catch (JSONException e11) {
                Utility.logd(TAG, "Unable to parse bridge_args JSON", e11);
            }
        }
        urlQueryString.remove(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
        urlQueryString.putInt(NativeProtocol.EXTRA_PROTOCOL_VERSION, NativeProtocol.getLatestKnownVersion());
        return urlQueryString;
    }

    private FacebookWebFallbackDialog(Context context, String str, String str2) {
        super(context, str);
        setExpectedRedirectUrl(str2);
    }
}
