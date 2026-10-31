package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j2 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6898b;

    public j2(com.applovin.impl.sdk.l lVar) {
        this.f6897a = lVar;
        this.f6898b = lVar.Q();
    }

    @Override // com.applovin.impl.i2
    public InputStream a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f6897a.a(z4.Y2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f6897a.a(z4.Z2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int responseCode = httpURLConnection.getResponseCode();
        this.f6897a.E().a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
        if (s0.a(responseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6898b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, "HttpUrlConnectionLoader", mapHashMap);
        this.f6897a.g().d(f2.R, mapHashMap);
        return inputStream;
    }
}
