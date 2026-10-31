package io.bidmachine.ads.networks.gam_dynamic;

import android.text.TextUtils;
import com.explorestack.protobuf.StringValue;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.protobuf.Waterfall;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: GAMAdManager.java */
/* JADX INFO: loaded from: classes4.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f16618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List<u> f16619b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f16620c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map<NetworkAdUnit, u> f16621d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f16622e = new Object();

    public g(String str) {
        this.f16618a = new oc.p(str + "AdManager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String n(u uVar) {
        return String.format("Remove ad from caches (%s, size - %s)", uVar, Integer.valueOf(j(uVar.n())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String o(NetworkAdUnit networkAdUnit, u uVar) {
        return String.format("Reserve ad (networkAdUnitId - %s, %s, %s / %s)", networkAdUnit.getId(), uVar, Integer.valueOf(l(uVar.n())), Integer.valueOf(j(uVar.n())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(u uVar, u uVar2) {
        return -Double.compare(uVar.getPrice(), uVar2.getPrice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String q(u uVar) {
        return String.format("Store ad (%s, size - %s)", uVar, Integer.valueOf(j(uVar.n())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(u uVar) {
        return String.format("Remove cheapest ad (%s)", uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String s(NetworkAdUnit networkAdUnit, u uVar) {
        return String.format("UnReserve ad (networkAdUnitId - %s, %s, %s / %s)", networkAdUnit.getId(), uVar, Integer.valueOf(l(uVar.n())), Integer.valueOf(j(uVar.n())));
    }

    void A(u uVar) {
        synchronized (this.f16622e) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<NetworkAdUnit, u> entry : this.f16621d.entrySet()) {
                if (entry.getValue().equals(uVar)) {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z((NetworkAdUnit) it.next());
            }
        }
    }

    u g(AdsFormat adsFormat) {
        synchronized (this.f16620c) {
            for (int size = this.f16619b.size() - 1; size >= 0; size--) {
                u uVar = this.f16619b.get(size);
                if (uVar.n() == adsFormat && !m(uVar)) {
                    return uVar;
                }
            }
            return null;
        }
    }

    u h(AdsFormat adsFormat) {
        synchronized (this.f16620c) {
            for (u uVar : this.f16619b) {
                if (uVar.n() == adsFormat && !m(uVar)) {
                    return uVar;
                }
            }
            return null;
        }
    }

    List<Waterfall.Result.CachedAdUnit> i(AdsFormat adsFormat) {
        synchronized (this.f16620c) {
            if (this.f16619b.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (u uVar : this.f16619b) {
                if (uVar.n() == adsFormat) {
                    Waterfall.Configuration.AdUnit adUnitM = uVar.m();
                    Waterfall.Result.CachedAdUnit.Builder frozen = Waterfall.Result.CachedAdUnit.newBuilder().setPrice(adUnitM.getPrice()).setFrozen(m(uVar));
                    if (adUnitM.getAdUnitId() != null) {
                        frozen.setAdUnitId(adUnitM.getAdUnitId());
                    }
                    StringValue serverParams = adUnitM.getServerParams();
                    if (serverParams != null) {
                        frozen.setServerParams(serverParams);
                    }
                    q6.l lVarO = uVar.o();
                    if (lVarO != null) {
                        Waterfall.Result.EstimatedPrice estimatedPriceB = lVarO.b();
                        if (estimatedPriceB != null) {
                            frozen.setEstimatedPrice(estimatedPriceB);
                        }
                        String strA = lVarO.a();
                        if (!TextUtils.isEmpty(strA)) {
                            frozen.setAdResponse(StringValue.newBuilder().setValue(strA).build());
                        }
                    }
                    arrayList.add(frozen.build());
                }
            }
            return arrayList;
        }
    }

    int j(AdsFormat adsFormat) {
        int i10;
        synchronized (this.f16620c) {
            Iterator<u> it = this.f16619b.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (it.next().n() == adsFormat) {
                    i10++;
                }
            }
        }
        return i10;
    }

    u k(NetworkAdUnit networkAdUnit) {
        u uVar;
        synchronized (this.f16622e) {
            uVar = this.f16621d.get(networkAdUnit);
        }
        return uVar;
    }

    int l(AdsFormat adsFormat) {
        int i10;
        synchronized (this.f16622e) {
            Iterator<u> it = this.f16621d.values().iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (it.next().n() == adsFormat) {
                    i10++;
                }
            }
        }
        return i10;
    }

    boolean m(u uVar) {
        boolean zContainsValue;
        synchronized (this.f16622e) {
            zContainsValue = this.f16621d.containsValue(uVar);
        }
        return zContainsValue;
    }

    boolean t(final u uVar) {
        boolean zRemove;
        synchronized (this.f16620c) {
            zRemove = this.f16619b.remove(uVar);
            if (zRemove) {
                io.bidmachine.core.a.b(this.f16618a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.c
                    @Override // qc.b
                    public final Object get() {
                        return this.f16610a.n(uVar);
                    }
                });
            }
            A(uVar);
        }
        return zRemove;
    }

    void u(final NetworkAdUnit networkAdUnit, final u uVar) {
        synchronized (this.f16622e) {
            io.bidmachine.core.a.b(this.f16618a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.b
                @Override // qc.b
                public final Object get() {
                    return this.f16605a.o(networkAdUnit, uVar);
                }
            });
            this.f16621d.put(networkAdUnit, uVar);
        }
    }

    q6.j v(NetworkAdUnit networkAdUnit, AdsFormat adsFormat) {
        synchronized (this.f16620c) {
            u uVarH = h(adsFormat);
            if (uVarH == null) {
                return null;
            }
            u(networkAdUnit, uVarH);
            return uVarH;
        }
    }

    void w(List<u> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.p((u) obj, (u) obj2);
            }
        });
    }

    void x(final u uVar) {
        synchronized (this.f16620c) {
            if (this.f16619b.contains(uVar)) {
                return;
            }
            this.f16619b.add(uVar);
            w(this.f16619b);
            io.bidmachine.core.a.b(this.f16618a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.e
                @Override // qc.b
                public final Object get() {
                    return this.f16613a.q(uVar);
                }
            });
        }
    }

    u y(u uVar, int i10) {
        synchronized (this.f16620c) {
            AdsFormat adsFormatN = uVar.n();
            u uVar2 = null;
            if (j(adsFormatN) >= i10) {
                final u uVarG = g(adsFormatN);
                if (uVarG != null && uVarG.getPrice() <= uVar.getPrice()) {
                    io.bidmachine.core.a.b(this.f16618a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.d
                        @Override // qc.b
                        public final Object get() {
                            return g.r(uVarG);
                        }
                    });
                    t(uVarG);
                    uVar2 = uVarG;
                }
                return null;
            }
            x(uVar);
            return uVar2;
        }
    }

    void z(final NetworkAdUnit networkAdUnit) {
        synchronized (this.f16622e) {
            final u uVarRemove = this.f16621d.remove(networkAdUnit);
            if (uVarRemove != null) {
                io.bidmachine.core.a.b(this.f16618a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.a
                    @Override // qc.b
                    public final Object get() {
                        return this.f16602a.s(networkAdUnit, uVarRemove);
                    }
                });
            }
        }
    }
}
