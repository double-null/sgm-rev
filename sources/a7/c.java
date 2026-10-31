package a7;

import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;

/* JADX INFO: compiled from: HeaderBiddingAdObjectParams.java */
/* JADX INFO: loaded from: classes4.dex */
class c extends ga.b {
    c(Ad ad2, HeaderBiddingAd headerBiddingAd) {
        super(ad2);
        b().putAll(headerBiddingAd.getClientParamsMap());
        b().putAll(headerBiddingAd.getServerParamsMap());
    }

    @Override // ga.b
    public boolean g() {
        return true;
    }
}
