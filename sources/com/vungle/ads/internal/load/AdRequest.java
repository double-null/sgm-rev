package com.vungle.ads.internal.load;

import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import java.io.Serializable;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AdRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdRequest implements Serializable {
    private final BidPayload adMarkup;
    private final VungleCSBData csbData;
    private final Placement placement;
    private final VungleAdSize requestAdSize;

    public AdRequest(Placement placement, BidPayload bidPayload, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        t.f(placement, "placement");
        this.placement = placement;
        this.adMarkup = bidPayload;
        this.requestAdSize = vungleAdSize;
        this.csbData = vungleCSBData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t.a(AdRequest.class, obj.getClass())) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (!t.a(this.placement.getReferenceId(), adRequest.placement.getReferenceId()) || !t.a(this.requestAdSize, adRequest.requestAdSize)) {
            return false;
        }
        BidPayload bidPayload = this.adMarkup;
        if (bidPayload != null) {
            if (!t.a(bidPayload, adRequest.adMarkup)) {
                return false;
            }
        } else if (adRequest.adMarkup != null) {
            return false;
        }
        VungleCSBData vungleCSBData = this.csbData;
        VungleCSBData vungleCSBData2 = adRequest.csbData;
        if (vungleCSBData != null) {
            return t.a(vungleCSBData, vungleCSBData2);
        }
        return vungleCSBData2 == null;
    }

    public final BidPayload getAdMarkup() {
        return this.adMarkup;
    }

    public final VungleCSBData getCsbData() {
        return this.csbData;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final VungleAdSize getRequestAdSize() {
        return this.requestAdSize;
    }

    public int hashCode() {
        int iHashCode = this.placement.getReferenceId().hashCode() * 31;
        VungleAdSize vungleAdSize = this.requestAdSize;
        int iHashCode2 = (iHashCode + (vungleAdSize != null ? vungleAdSize.hashCode() : 0)) * 31;
        BidPayload bidPayload = this.adMarkup;
        int iHashCode3 = (iHashCode2 + (bidPayload != null ? bidPayload.hashCode() : 0)) * 31;
        VungleCSBData vungleCSBData = this.csbData;
        return iHashCode3 + (vungleCSBData != null ? vungleCSBData.hashCode() : 0);
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + ", csbData=" + this.csbData + '}';
    }

    public /* synthetic */ AdRequest(Placement placement, BidPayload bidPayload, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData, int i10, k kVar) {
        this(placement, bidPayload, vungleAdSize, (i10 & 8) != 0 ? null : vungleCSBData);
    }
}
