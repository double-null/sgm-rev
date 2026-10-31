package com.vungle.ads;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VungleCSBData.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleCSBData implements Serializable {
    private final String adUnitId;
    private final String auctionId;
    private final double bidFloor;
    private final String creativeId;
    private final Map<String, String> extras;
    private final boolean isVXWinner;
    private final int phase;

    /* JADX INFO: compiled from: VungleCSBData.kt */
    public static final class Builder {
        private String adUnitId;
        private String auctionId;
        private final double bidFloor;
        private String creativeId;
        private Map<String, String> extras;
        private boolean isPriorityAccess;
        private boolean isVXWinner;

        public Builder(double d10) {
            this.bidFloor = d10;
        }

        public final Builder adUnitId(String str) {
            this.adUnitId = str;
            return this;
        }

        public final Builder auctionId(String str) {
            this.auctionId = str;
            return this;
        }

        public final VungleCSBData build() {
            double d10 = this.bidFloor;
            String str = this.auctionId;
            String str2 = str == null ? "" : str;
            String str3 = this.creativeId;
            String str4 = str3 == null ? "" : str3;
            String str5 = this.adUnitId;
            return new VungleCSBData(d10, str2, str4, str5 == null ? "" : str5, this.isPriorityAccess ? 2 : 1, this.isVXWinner, this.extras, null);
        }

        public final Builder creativeId(String str) {
            this.creativeId = str;
            return this;
        }

        public final Builder isPriorityAccess(boolean z10) {
            this.isPriorityAccess = z10;
            return this;
        }

        public final Builder isVXWinner(boolean z10) {
            this.isVXWinner = z10;
            return this;
        }

        public final Builder putExtras(Map<String, String> map) {
            this.extras = map;
            return this;
        }
    }

    public /* synthetic */ VungleCSBData(double d10, String str, String str2, String str3, int i10, boolean z10, Map map, k kVar) {
        this(d10, str, str2, str3, i10, z10, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VungleCSBData)) {
            return false;
        }
        VungleCSBData vungleCSBData = (VungleCSBData) obj;
        return Double.compare(this.bidFloor, vungleCSBData.bidFloor) == 0 && t.a(this.auctionId, vungleCSBData.auctionId) && t.a(this.creativeId, vungleCSBData.creativeId) && t.a(this.adUnitId, vungleCSBData.adUnitId) && this.phase == vungleCSBData.phase && this.isVXWinner == vungleCSBData.isVXWinner && t.a(this.extras, vungleCSBData.extras);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final double getBidFloor() {
        return this.bidFloor;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final int getPhase() {
        return this.phase;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Double.hashCode(this.bidFloor) * 31) + this.auctionId.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.adUnitId.hashCode()) * 31) + this.phase) * 31) + Boolean.hashCode(this.isVXWinner)) * 31;
        Map<String, String> map = this.extras;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final boolean isVXWinner() {
        return this.isVXWinner;
    }

    private VungleCSBData(double d10, String str, String str2, String str3, int i10, boolean z10, Map<String, String> map) {
        this.bidFloor = d10;
        this.auctionId = str;
        this.creativeId = str2;
        this.adUnitId = str3;
        this.phase = i10;
        this.isVXWinner = z10;
        this.extras = map;
    }

    /* synthetic */ VungleCSBData(double d10, String str, String str2, String str3, int i10, boolean z10, Map map, int i11, k kVar) {
        this(d10, str, str2, str3, i10, z10, (i11 & 64) != 0 ? null : map);
    }
}
