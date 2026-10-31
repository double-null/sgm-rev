package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.vungle.ads.internal.presenter.WebViewManager;
import kotlin.jvm.internal.t;
import wc.q;

/* JADX INFO: compiled from: ViewUtility.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewUtility {
    public static final ViewUtility INSTANCE = new ViewUtility();

    private ViewUtility() {
    }

    public final int dpToPixels(Context context, int i10) {
        t.f(context, "context");
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final q<Integer, Integer> getDeviceWidthAndHeightWithOrientation(Context context, int i10) {
        t.f(context, "context");
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i11 = resources.getConfiguration().orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        return i10 == i11 ? new q<>(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density))) : new q<>(Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
    }

    public final WebView getWebView(Context context, String str) throws InstantiationException {
        t.f(context, "context");
        try {
            return WebViewManager.INSTANCE.getOrCreateWebView(context, str);
        } catch (Resources.NotFoundException e10) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e10 + ".message");
        } catch (Exception e11) {
            throw new InstantiationException(e11.getMessage());
        }
    }
}
