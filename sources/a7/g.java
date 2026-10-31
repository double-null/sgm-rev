package a7;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineTrackingObject;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import vb.d;

/* JADX INFO: compiled from: HeaderBiddingPlacementBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
class g<UnifiedAdRequestParamsType extends vb.d> {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: HeaderBiddingPlacementBuilder.java */
    static final class a<UnifiedAdRequestParamsType extends vb.d> implements Runnable, HeaderBiddingAdRequestParams, HeaderBiddingCollectParamsCallback {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Executor f108k = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContextProvider f109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HeaderBiddingAdapter f110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdsType f111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AdContentType f112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final UnifiedAdRequestParamsType f113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final NetworkAdUnit f114f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CountDownLatch f116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private HeaderBiddingPlacement.AdUnit f117i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f118j = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ub.k f115g = new BidMachineTrackingObject();

        a(ContextProvider contextProvider, HeaderBiddingAdapter headerBiddingAdapter, AdsType adsType, AdContentType adContentType, UnifiedAdRequestParamsType unifiedadrequestparamstype, NetworkAdUnit networkAdUnit) {
            this.f109a = contextProvider;
            this.f110b = headerBiddingAdapter;
            this.f111c = adsType;
            this.f112d = adContentType;
            this.f113e = unifiedadrequestparamstype;
            this.f114f = networkAdUnit;
        }

        private void g() {
            this.f118j = true;
            this.f116h.countDown();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String j() {
            return String.format("%s (%s) - Header bidding collect fail: timeout", this.f111c, this.f112d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String k(oc.a aVar) {
            return String.format("%s (%s) - Header bidding collect fail - %s", this.f111c, this.f112d, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String l() {
            return String.format("%s (%s) - Header bidding collect finished", this.f111c, this.f112d);
        }

        void e() {
            if (this.f118j) {
                return;
            }
            io.bidmachine.core.a.b(this.f110b.getKey(), new qc.b() { // from class: a7.e
                @Override // qc.b
                public final Object get() {
                    return this.f105a.j();
                }
            });
            g();
        }

        void f(CountDownLatch countDownLatch) {
            this.f115g.eventStart(TrackEventType.HeaderBiddingNetworkPrepare, new ub.j().e("HB_NETWORK", this.f110b.getKey()).e("BM_AD_TYPE", this.f111c.getName()));
            this.f116h = countDownLatch;
            f108k.execute(this);
        }

        @Override // io.bidmachine.HeaderBiddingAdRequestParams
        public AdContentType getAdContentType() {
            return this.f112d;
        }

        @Override // io.bidmachine.HeaderBiddingAdRequestParams
        public AdsType getAdsType() {
            return this.f111c;
        }

        HeaderBiddingPlacement.AdUnit h() {
            return this.f117i;
        }

        boolean i() {
            return this.f118j;
        }

        @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
        public void onCollectFail(final oc.a aVar) {
            if (this.f118j) {
                return;
            }
            io.bidmachine.core.a.b(this.f110b.getKey(), new qc.b() { // from class: a7.f
                @Override // qc.b
                public final Object get() {
                    return this.f106a.k(aVar);
                }
            });
            g();
            this.f115g.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.f111c, new ub.a().k(this.f110b.getKey()), aVar);
        }

        @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
        public void onCollectFinished(Map<String, String> map) {
            if (this.f118j) {
                return;
            }
            this.f117i = HeaderBiddingPlacement.AdUnit.newBuilder().setBidder(this.f110b.getKey()).setBidderSdkver(this.f110b.obtainNetworkSdkVersion()).putClientParams(ProtoExtConstants.AD_UNIT_ID, this.f114f.getId()).putAllClientParams(this.f114f.getMediationConfig()).putAllClientParams(map).build();
            io.bidmachine.core.a.b(this.f110b.getKey(), new qc.b() { // from class: a7.d
                @Override // qc.b
                public final Object get() {
                    return this.f104a.l();
                }
            });
            g();
            this.f115g.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.f111c, new ub.a().k(this.f110b.getKey()), null);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f110b.collectHeaderBiddingParams(this.f109a, this.f113e, this.f114f, this, this);
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
                onCollectFail(oc.a.l("Exception collecting header bidding parameters", th));
            }
        }
    }

    g() {
    }

    private HeaderBiddingAd d(List<Any> list) {
        for (Any any : list) {
            if (any.is(HeaderBiddingAd.class)) {
                try {
                    return (HeaderBiddingAd) any.unpack(HeaderBiddingAd.class);
                } catch (InvalidProtocolBufferException e10) {
                    io.bidmachine.core.a.o(e10);
                }
            }
        }
        return null;
    }

    ga.b a(Ad ad2) {
        HeaderBiddingAd headerBiddingAdC = c(ad2);
        if (headerBiddingAdC != null) {
            return new c(ad2, headerBiddingAdC);
        }
        return null;
    }

    HeaderBiddingPlacement.Builder b(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, AdContentType adContentType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i10) {
        ArrayList<a> arrayList = new ArrayList();
        Iterator<NetworkConfig> it = collection.iterator();
        while (it.hasNext()) {
            NetworkConfig next = it.next();
            NetworkAdapter adapter = NetworkRegistry.getAdapter(next.getNetworkKey());
            if ((adapter instanceof HeaderBiddingAdapter) && adapter.isInitialized(contextProvider)) {
                for (NetworkAdUnit networkAdUnit : next.createNetworkAdUnitList(adsType, unifiedadrequestparamstype, adContentType, adapter)) {
                    list.add(networkAdUnit);
                    arrayList.add(new a(contextProvider, (HeaderBiddingAdapter) adapter, adsType, adContentType, unifiedadrequestparamstype, networkAdUnit));
                    it = it;
                }
            }
            it = it;
        }
        if (!arrayList.isEmpty()) {
            BidMachineTrackingObject bidMachineTrackingObject = new BidMachineTrackingObject();
            bidMachineTrackingObject.eventStart(TrackEventType.HeaderBiddingNetworksPrepare);
            try {
                CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).f(countDownLatch);
                }
                try {
                    countDownLatch.await(i10 > 0 ? i10 : 10L, TimeUnit.SECONDS);
                } catch (InterruptedException e10) {
                    io.bidmachine.core.a.o(e10);
                }
                ArrayList arrayList2 = null;
                for (a aVar : arrayList) {
                    HeaderBiddingPlacement.AdUnit adUnitH = aVar.h();
                    if (adUnitH != null) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(adUnitH);
                    } else if (!aVar.i()) {
                        aVar.e();
                    }
                }
                if (!io.bidmachine.core.h.C(arrayList2)) {
                    HeaderBiddingPlacement.Builder builderNewBuilder = HeaderBiddingPlacement.newBuilder();
                    builderNewBuilder.addAllAdUnits(arrayList2);
                    bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, null, null);
                    return builderNewBuilder;
                }
                bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, null, null);
            } catch (Throwable th) {
                bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, null, null);
                throw th;
            }
        }
        return null;
    }

    HeaderBiddingAd c(Ad ad2) {
        HeaderBiddingAd headerBiddingAdD = null;
        if (ad2.hasDisplay()) {
            Ad.Display display = ad2.getDisplay();
            headerBiddingAdD = display.hasBanner() ? d(display.getBanner().getExtProtoList()) : null;
            if (headerBiddingAdD == null && display.hasNative()) {
                headerBiddingAdD = d(display.getNative().getExtProtoList());
            }
        }
        return (headerBiddingAdD == null && ad2.hasVideo()) ? d(ad2.getVideo().getExtProtoList()) : headerBiddingAdD;
    }
}
