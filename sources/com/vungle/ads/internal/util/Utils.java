package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.Build;
import android.webkit.URLUtil;
import fd.i;
import fd.j;
import java.io.File;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    private final long getFolderSize(File file) {
        long length = 0;
        if (file.exists()) {
            for (File file2 : i.l(file)) {
                if (file2.isFile()) {
                    length += file2.length();
                }
            }
        }
        return length;
    }

    public final long getWebViewDataSize(Context context) {
        t.f(context, "context");
        long folderSize = 0;
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            folderSize = file.exists() ? 0 + getFolderSize(file) : 0L;
            File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                return folderSize;
            }
            t.e(cacheDir, "cacheDir");
            return folderSize + getFolderSize(j.q(cacheDir, "webviewCache"));
        } catch (Exception e10) {
            Logger.Companion.e("WebViewSize", "Error reading WebView data size: " + e10.getMessage());
            return folderSize;
        }
    }

    public final boolean isOSVersionInvalid() {
        return Build.VERSION.SDK_INT < 25;
    }

    public final boolean isUrlValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }
}
