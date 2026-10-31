package io.bidmachine;

import android.util.Pair;
import io.bidmachine.protobuf.AdCachePlacementControl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: AdResponseManager.java */
/* JADX INFO: loaded from: classes4.dex */
class o0 implements z6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile o0 f20369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, AdCachePlacementControl> f20370d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20371a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<AdResponse> f20372b = new ArrayList();

    /* JADX INFO: compiled from: AdResponseManager.java */
    class a implements Comparator<AdResponse> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AdResponse adResponse, AdResponse adResponse2) {
            return -Double.compare(adResponse.getPrice(), adResponse2.getPrice());
        }
    }

    o0() {
    }

    public static o0 f() {
        o0 o0Var = f20369c;
        if (o0Var == null) {
            synchronized (o0.class) {
                o0Var = f20369c;
                if (o0Var == null) {
                    o0Var = new o0();
                    f20369c = o0Var;
                }
            }
        }
        return o0Var;
    }

    private AdCachePlacementControl g(AdRequestParameters adRequestParameters) {
        return f20370d.get(adRequestParameters.getAdsType().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(AdResponse adResponse) {
        return String.format("receive - %s", adResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(AdResponse adResponse) {
        return String.format("remove - %s", adResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(AdResponse adResponse) {
        return String.format("store - %s", adResponse);
    }

    static void p(Map<String, AdCachePlacementControl> map) {
        Map<String, AdCachePlacementControl> map2 = f20370d;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
    }

    @Override // z6.a
    public final List<Pair<Double, String>> a(AdRequestParameters adRequestParameters) {
        ArrayList arrayList;
        synchronized (this.f20371a) {
            arrayList = new ArrayList();
            for (AdResponse adResponse : this.f20372b) {
                if (adRequestParameters.isParametersMatched(adResponse.getAdRequestParameters())) {
                    arrayList.add(new Pair(Double.valueOf(adResponse.getPrice()), adResponse.responseId));
                }
            }
        }
        return arrayList;
    }

    boolean e(AdResponse adResponse) {
        boolean zContains;
        synchronized (this.f20371a) {
            zContains = this.f20372b.contains(adResponse);
        }
        return zContains;
    }

    int h(AdRequestParameters adRequestParameters) {
        AdCachePlacementControl adCachePlacementControlG = g(adRequestParameters);
        int maxRetainCount = adCachePlacementControlG != null ? adCachePlacementControlG.getMaxRetainCount() : 0;
        if (maxRetainCount > 0) {
            return maxRetainCount;
        }
        return 2;
    }

    int i(AdRequestParameters adRequestParameters) {
        AdCachePlacementControl adCachePlacementControlG = g(adRequestParameters);
        int maxCacheSize = adCachePlacementControlG != null ? adCachePlacementControlG.getMaxCacheSize() : 0;
        if (maxCacheSize > 0) {
            return maxCacheSize;
        }
        return 8;
    }

    List<AdResponse> m(AdRequestParameters adRequestParameters) {
        synchronized (this.f20371a) {
            ArrayList arrayList = new ArrayList();
            for (AdResponse adResponse : this.f20372b) {
                if (adResponse.getStatus() == p0.Idle && adRequestParameters.isParametersMatched(adResponse.getAdRequestParameters())) {
                    arrayList.add(adResponse);
                }
            }
            if (arrayList.isEmpty()) {
                return arrayList;
            }
            Collections.sort(arrayList, new a());
            return arrayList.subList(0, Math.min(h(adRequestParameters), arrayList.size()));
        }
    }

    AdResponse n(AdRequestParameters adRequestParameters) {
        synchronized (this.f20371a) {
            int iH = h(adRequestParameters);
            int i10 = 0;
            final AdResponse adResponse = null;
            AdResponse adResponse2 = null;
            for (AdResponse adResponse3 : this.f20372b) {
                if (!adResponse3.wasShown() && adRequestParameters.isParametersMatched(adResponse3.getAdRequestParameters())) {
                    p0 status = adResponse3.getStatus();
                    p0 p0Var = p0.Idle;
                    if (status == p0Var) {
                        if (adResponse == null || adResponse3.getPrice() > adResponse.getPrice()) {
                            adResponse = adResponse3;
                        }
                    } else if (adResponse3.getStatus() == p0.Busy) {
                        i10++;
                        if (adResponse2 == null) {
                            adResponse2 = adResponse3;
                        }
                        if (i10 >= iH) {
                            adResponse2.expireAdRequests(null);
                            adResponse2.clearAdRequestList();
                            adResponse2.setStatus(p0Var);
                            if (adResponse == null || adResponse2.getPrice() >= adResponse.getPrice()) {
                                adResponse = adResponse2;
                            }
                        }
                    }
                }
            }
            if (adResponse == null || !adRequestParameters.isPricePassedByPriceFloor(adResponse.getPrice())) {
                return null;
            }
            adResponse.setCached(true);
            adResponse.setStatus(p0.Busy);
            io.bidmachine.core.a.b("AdResponseManager", new qc.b() { // from class: io.bidmachine.n0
                @Override // qc.b
                public final Object get() {
                    return o0.j(adResponse);
                }
            });
            this.f20372b.remove(adResponse);
            this.f20372b.add(adResponse);
            return adResponse;
        }
    }

    void o(final AdResponse adResponse) {
        io.bidmachine.core.a.b("AdResponseManager", new qc.b() { // from class: io.bidmachine.l0
            @Override // qc.b
            public final Object get() {
                return o0.k(adResponse);
            }
        });
        adResponse.setCached(false);
        synchronized (this.f20371a) {
            this.f20372b.remove(adResponse);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    void q(final AdResponse adResponse) {
        if (adResponse.canCache()) {
            io.bidmachine.core.a.b("AdResponseManager", new qc.b() { // from class: io.bidmachine.m0
                @Override // qc.b
                public final Object get() {
                    return o0.l(adResponse);
                }
            });
            synchronized (this.f20371a) {
                AdRequestParameters adRequestParameters = adResponse.getAdRequestParameters();
                AdResponse adResponse2 = null;
                int i10 = 0;
                int i11 = 0;
                AdResponse adResponse3 = null;
                for (AdResponse adResponse4 : this.f20372b) {
                    if (adRequestParameters.isParametersMatched(adResponse4.getAdRequestParameters())) {
                        i11++;
                        if (adResponse4.getStatus() == p0.Idle) {
                            if (adResponse3 == null || adResponse3.getPrice() > adResponse4.getPrice()) {
                                adResponse3 = adResponse4;
                            }
                        } else if (adResponse4.getStatus() == p0.Busy) {
                            i10++;
                            if (adResponse2 == null) {
                                adResponse2 = adResponse4;
                            }
                        }
                    }
                }
                if (adResponse.getStatus() != p0.Busy || adResponse2 == null || i10 < h(adRequestParameters)) {
                    adResponse2 = adResponse3;
                } else {
                    adResponse2.setStatus(p0.Idle);
                    if (adResponse3 != null && adResponse3.getPrice() <= adResponse2.getPrice()) {
                        adResponse2 = adResponse3;
                    }
                }
                if (i11 >= i(adRequestParameters) && adResponse2 != null) {
                    if (adResponse.getPrice() < adResponse2.getPrice()) {
                        return;
                    }
                    adResponse2.notifyExpired(true);
                    this.f20372b.remove(adResponse2);
                }
                this.f20372b.add(adResponse);
            }
        }
    }
}
