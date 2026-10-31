package com.applovin.impl;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s1 extends g2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private JSONObject f8155i;

    public s1(com.applovin.impl.sdk.l lVar) {
        super(lVar, f2.b.ERROR);
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void b() {
        this.f8155i = JsonUtils.deserialize((String) this.f6622a.a(z4.K));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(str + ":" + str2, th, map);
    }

    public void b(final String str, final String str2, final Throwable th) {
        this.f6622a.s0().a((k5) new u6(this.f6622a, "reportCaughtException", new Runnable() { // from class: com.applovin.impl.me
            @Override // java.lang.Runnable
            public final void run() {
                this.f7136a.a(str, str2, th);
            }
        }), f6.b.OTHER);
    }

    public void a(String str, Throwable th, Map map) {
        map.put(ShareConstants.FEED_SOURCE_PARAM, str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), map2);
            arrayList.add(map2);
        }
        a(f2.W0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        map.put(ShareConstants.FEED_SOURCE_PARAM, str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(h2.a((AppLovinAdImpl) bVar));
            map.putAll(h2.a(bVar));
            boolean zD0 = bVar.D0();
            map.put("is_video_stream", String.valueOf(zD0));
            if (zD0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).j1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.K(), map);
            }
        }
        d(f2.f6475c1, map);
    }

    public void a(String str, String str2, int i10, String str3) {
        List listA = a(str2);
        boolean z10 = listA != null;
        if (z10 && listA.contains(Integer.valueOf(i10))) {
            return;
        }
        if (z10 || i10 >= 400) {
            HashMap map = new HashMap(4);
            map.put(ShareConstants.FEED_SOURCE_PARAM, str);
            map.put("url", StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i10));
            map.put("error_message", h2.a(str3));
            d(f2.f6484f1, map);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f8155i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f8155i, "default", null) : integerList;
    }
}
