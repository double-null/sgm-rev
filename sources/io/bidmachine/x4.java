package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;

/* JADX INFO: compiled from: ProtoTransformer.java */
/* JADX INFO: loaded from: classes4.dex */
class x4 {

    /* JADX INFO: compiled from: ProtoTransformer.java */
    interface a<AdResponse> {
        void a(oc.a aVar);

        void onSuccess(AdResponse adresponse);
    }

    static void a(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, Response response, a<AdResponse> aVar) {
        if (response == null || response.getSeatbidCount() == 0) {
            aVar.a(oc.a.k("Response"));
            return;
        }
        Response.Seatbid seatbid = response.getSeatbid(0);
        if (seatbid == null || seatbid.getBidCount() == 0) {
            aVar.a(oc.a.k("Seatbid"));
            return;
        }
        Response.Seatbid.Bid bid = seatbid.getBid(0);
        if (bid == null) {
            aVar.a(oc.a.k("Bid"));
            return;
        }
        Any media = bid.getMedia();
        if (media == null) {
            aVar.a(oc.a.k("Media"));
            return;
        }
        if (!media.is(Ad.class)) {
            aVar.a(oc.a.h("Media not valid"));
            return;
        }
        try {
            Ad ad2 = (Ad) media.unpack(Ad.class);
            if (ad2 == null) {
                aVar.a(oc.a.k("Ad"));
                return;
            }
            NetworkAdapter networkAdapterFindNetworkAdapter = adRequestParameters.getAdsType().findNetworkAdapter(ad2);
            if (networkAdapterFindNetworkAdapter == null) {
                aVar.a(oc.a.k("NetworkAdapter"));
            } else {
                aVar.onSuccess(new AdResponse(adRequestParameters, networkAdUnitManager, response, seatbid, bid, ad2, networkAdapterFindNetworkAdapter));
            }
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            aVar.a(oc.a.l("Failed to process response", th));
        }
    }
}
