package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleHeader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleHeader {
    public static final VungleHeader INSTANCE;
    private static String appId;
    private static String appVersion;
    private static String headerUa;

    static {
        VungleHeader vungleHeader = new VungleHeader();
        INSTANCE = vungleHeader;
        headerUa = vungleHeader.defaultHeader();
    }

    private VungleHeader() {
    }

    private final String defaultHeader() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t.a("Amazon", Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/");
        sb2.append(BuildConfig.VERSION_NAME);
        return sb2.toString();
    }

    public final String getAppId() {
        return appId;
    }

    public final String getAppVersion() {
        return appVersion;
    }

    public final String getHeaderUa() {
        return headerUa;
    }

    public final void reset() {
        headerUa = defaultHeader();
    }

    public final void setAppId(String str) {
        appId = str;
    }

    public final void setAppVersion(String str) {
        appVersion = str;
    }

    public final void setHeaderUa(String str) {
        t.f(str, "<set-?>");
        headerUa = str;
    }
}
