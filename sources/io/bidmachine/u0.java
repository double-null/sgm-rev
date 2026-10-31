package io.bidmachine;

import android.text.TextUtils;
import c0.IbU.elEbP;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: AuctionResultImpl.java */
/* JADX INFO: loaded from: classes4.dex */
final class u0 implements ga.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f20429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f20432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f20433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, String> f20435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CreativeFormat f20436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, String> f20437k;

    u0(AdsType adsType, Response.Seatbid seatbid, Response.Seatbid.Bid bid, Ad ad2, NetworkAdapter networkAdapter, AdExtension adExtension) {
        this.f20427a = bid.getId();
        this.f20428b = seatbid.getSeat();
        this.f20429c = bid.getPrice();
        this.f20430d = bid.getDeal();
        this.f20431e = ad2.getId();
        this.f20432f = bid.getCid();
        if (ad2.getAdomainCount() > 0) {
            this.f20433g = (String[]) ad2.m165getAdomainList().toArray(new String[0]);
        } else {
            this.f20433g = null;
        }
        this.f20437k = e(adExtension);
        this.f20434h = networkAdapter.getKey();
        this.f20435i = d(adsType.obtainHeaderBiddingAd(ad2));
        this.f20436j = f(ad2);
    }

    private Map<String, String> e(AdExtension adExtension) {
        HashMap map = new HashMap();
        if (adExtension != null) {
            try {
                map.putAll(adExtension.getCustomParamsMap());
            } catch (Exception unused) {
            }
        }
        return map;
    }

    static CreativeFormat f(Ad ad2) {
        if (!ad2.hasDisplay()) {
            if (ad2.hasVideo()) {
                return CreativeFormat.Video;
            }
            return null;
        }
        Ad.Display display = ad2.getDisplay();
        if (display.hasBanner() || !TextUtils.isEmpty(display.getAdm())) {
            return CreativeFormat.Banner;
        }
        if (display.hasNative()) {
            return CreativeFormat.Native;
        }
        return null;
    }

    @Override // ga.c
    public String a() {
        return this.f20434h;
    }

    @Override // ga.c
    public CreativeFormat b() {
        return this.f20436j;
    }

    @Override // ga.c
    public Map<String, String> c() {
        return this.f20435i;
    }

    Map<String, String> d(HeaderBiddingAd headerBiddingAd) {
        Map<String, String> clientParamsMap;
        HashMap map = new HashMap();
        if (headerBiddingAd != null && (clientParamsMap = headerBiddingAd.getClientParamsMap()) != null) {
            map.putAll(clientParamsMap);
        }
        return map;
    }

    @Override // ga.c
    public String getCreativeId() {
        return this.f20431e;
    }

    @Override // ga.c
    public Map<String, String> getCustomParams() {
        return this.f20437k;
    }

    @Override // ga.c
    public String getDeal() {
        return this.f20430d;
    }

    @Override // ga.c
    public String getId() {
        return this.f20427a;
    }

    @Override // ga.c
    public double getPrice() {
        return this.f20429c;
    }

    public String toString() {
        return elEbP.wHDGDBMjn + this.f20427a + ", demandSource=" + this.f20428b + ", price=" + this.f20429c + ", creativeId=" + this.f20431e + ", cid=" + this.f20432f;
    }
}
