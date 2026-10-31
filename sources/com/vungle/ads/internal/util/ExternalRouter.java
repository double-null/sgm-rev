package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import java.net.URISyntaxException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ExternalRouter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ExternalRouter {
    public static final ExternalRouter INSTANCE = new ExternalRouter();
    private static final String TAG = "ExternalRouter";

    private ExternalRouter() {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0012  */
    /* JADX WARN: Code duplicated, block: B:13:0x0013 A[Catch: URISyntaxException -> 0x000d, TryCatch #0 {URISyntaxException -> 0x000d, blocks: (B:4:0x0004, B:16:0x001c, B:13:0x0013), top: B:20:0x0004 }] */
    private final Intent getIntentFromUrl(String str, boolean z10) {
        boolean z11;
        Intent uri = null;
        if (str != null) {
            try {
                z11 = str.length() == 0;
                if (z11) {
                    uri = Intent.parseUri(str, 0);
                }
                if (uri != null && z10) {
                    uri.setFlags(268435456);
                }
            } catch (URISyntaxException e10) {
                Logger.Companion.e(TAG, "url format is not correct " + e10.getLocalizedMessage());
            }
        } else {
            if (z11) {
                uri = Intent.parseUri(str, 0);
            }
            if (uri != null) {
                uri.setFlags(268435456);
            }
        }
        return uri;
    }

    static /* synthetic */ Intent getIntentFromUrl$default(ExternalRouter externalRouter, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return externalRouter.getIntentFromUrl(str, z10);
    }

    public static /* synthetic */ Intent getIntentFromUrl$vungle_ads_release$default(ExternalRouter externalRouter, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return externalRouter.getIntentFromUrl$vungle_ads_release(context, str);
    }

    public final Intent getIntentFromUrl$vungle_ads_release(Context context, String str) {
        t.f(context, "context");
        return getIntentFromUrl(str, !(context instanceof Activity));
    }

    public final boolean launch$vungle_ads_release(String str, String str2, Context context, LogEntry logEntry, PresenterAdOpenCallback presenterAdOpenCallback) {
        t.f(context, "context");
        boolean z10 = true;
        if (str == null || str.length() == 0) {
            if (str2 == null || str2.length() == 0) {
                return false;
            }
        }
        boolean z11 = !(context instanceof Activity);
        try {
            return ActivityManager.Companion.startWhenForeground(context, getIntentFromUrl(str, z11), getIntentFromUrl(str2, z11), presenterAdOpenCallback);
        } catch (Exception e10) {
            if (str != null && str.length() != 0) {
                z10 = false;
            }
            if (z10) {
                new LinkError(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, "Fail to open " + str2).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + str).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
            }
            Logger.Companion companion = Logger.Companion;
            companion.e(TAG, "Error while opening url" + e10.getLocalizedMessage());
            companion.d(TAG, "Cannot open url " + str2);
            return false;
        }
    }
}
