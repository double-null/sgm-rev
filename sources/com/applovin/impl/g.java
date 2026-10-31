package com.applovin.impl;

import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.l lVar) {
        String strB = d.b(appLovinFullscreenActivity);
        String strA = d.a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z10 = StringUtils.isValidString(strB) && !strB.equals(packageName);
        boolean z11 = StringUtils.isValidString(strA) && !strA.equals(packageName);
        if (z10 || z11) {
            Map mapA = h2.a((AppLovinAdImpl) bVar);
            mapA.put("details", "activityTaskAffinityMismatch=" + z10 + ",baseActivityTaskAffinityMismatch=" + z11);
            lVar.E().a(f2.M0, "taskAffinityMismatch", mapA);
        }
    }

    public static void a(com.applovin.impl.adview.b bVar, com.applovin.impl.sdk.l lVar) {
        if (bVar == null) {
            return;
        }
        boolean zA = s.a(bVar);
        boolean zCanDrawOverlays = Settings.canDrawOverlays(bVar.getContext());
        if (zCanDrawOverlays || zA) {
            Map mapA = h2.a((AppLovinAdImpl) bVar.getCurrentAd());
            mapA.put("details", "canDrawOverlays=" + zCanDrawOverlays + ",isViewOverlaid=" + zA);
            lVar.E().a(f2.M0, "overlayViolation", mapA);
        }
    }
}
