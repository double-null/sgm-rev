package io.bidmachine;

import android.util.Pair;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AdResponseCacheParamsAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdResponseCacheParamsAdapter implements z6.c<AdResponse> {
    private final z6.a cacheParamsAccessor;

    public AdResponseCacheParamsAdapter(z6.a cacheParamsAccessor) {
        kotlin.jvm.internal.t.f(cacheParamsAccessor, "cacheParamsAccessor");
        this.cacheParamsAccessor = cacheParamsAccessor;
    }

    @Override // z6.c
    public /* bridge */ /* synthetic */ Object getCacheParams(AdResponse adResponse, zc.f fVar) {
        return getCacheParams2(adResponse, (zc.f<? super Map<String, ? extends Object>>) fVar);
    }

    /* JADX INFO: renamed from: getCacheParams, reason: avoid collision after fix types in other method */
    public Object getCacheParams2(AdResponse adResponse, zc.f<? super Map<String, ? extends Object>> fVar) {
        try {
            z6.a aVar = this.cacheParamsAccessor;
            AdRequestParameters adRequestParameters = adResponse.getAdRequestParameters();
            kotlin.jvm.internal.t.e(adRequestParameters, "adRequestParameters");
            List<Pair<Double, String>> listA = aVar.a(adRequestParameters);
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(kotlin.collections.o0.k(wc.w.a("price", pair.first), wc.w.a(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, pair.second)));
            }
            Map mapC = kotlin.collections.n0.c();
            String responseId = adResponse.responseId;
            kotlin.jvm.internal.t.e(responseId, "responseId");
            mapC.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, responseId);
            mapC.put("is_bid_cached", kotlin.coroutines.jvm.internal.b.a(adResponse.isCached()));
            mapC.put("price", kotlin.coroutines.jvm.internal.b.b(adResponse.getPrice()));
            if (!arrayList.isEmpty()) {
                mapC.put("cache", arrayList);
            }
            return kotlin.collections.n0.f(wc.w.a("ad_response_cache", kotlin.collections.n0.b(mapC)));
        } catch (Exception unused) {
            return kotlin.collections.o0.h();
        }
    }
}
