package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class v4 extends WebViewClient {
    protected abstract Map a();

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        mapHashMap.putAll(a());
        if (p0.e()) {
            mapHashMap.put(ShareConstants.FEED_SOURCE_PARAM, renderProcessGoneDetail.didCrash() ? AppMeasurement.CRASH_ORIGIN : "non_crash");
            mapHashMap.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null) {
            com.applovin.impl.sdk.l.E0.E().a(f2.f6499k1, mapHashMap, ((Long) lVar.a(z4.f9371v3)).longValue());
        }
        com.applovin.impl.sdk.p.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
