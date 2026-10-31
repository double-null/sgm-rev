package io.bidmachine;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.protobuf.ResponsePayload;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AdRequestParameters {
    private AdPlacementConfig adPlacementConfig;
    private ResponsePayload bidPayload;
    private List<NetworkConfig> networkConfigList;
    private PriceFloorParams priceFloorParams;
    private TargetingParams targetingParams;
    private Integer timeOutMs;

    protected AdRequestParameters(AdPlacementConfig adPlacementConfig) {
        this.adPlacementConfig = adPlacementConfig;
    }

    public AdFormat getAdFormat() {
        return this.adPlacementConfig.getAdFormat();
    }

    public AdPlacementConfig getAdPlacementConfig() {
        return this.adPlacementConfig;
    }

    @Deprecated(since = "3.5.0")
    public AdsFormat getAdsFormat() {
        return AdsFormat.fromAdFormat(getAdFormat());
    }

    public AdsType getAdsType() {
        return getAdFormat().getAdsType();
    }

    public ResponsePayload getBidPayload() {
        return this.bidPayload;
    }

    public CustomParams getCustomParams() {
        return this.adPlacementConfig.getCustomParams();
    }

    public List<NetworkConfig> getNetworkConfigList() {
        return this.networkConfigList;
    }

    public String getPlacementId() {
        return this.adPlacementConfig.getPlacementId();
    }

    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    @Deprecated
    public SessionAdParams getSessionAdParams() {
        return null;
    }

    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    public Integer getTimeOutMs() {
        return this.timeOutMs;
    }

    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return getAdsType() == adRequestParameters.getAdsType();
    }

    public abstract boolean isPlacementObjectValid(Placement placement) throws Throwable;

    public boolean isPricePassedByPriceFloor(double d10) {
        PriceFloorParams priceFloorParams = this.priceFloorParams;
        if (priceFloorParams == null) {
            return true;
        }
        Map<String, Double> priceFloors = priceFloorParams.getPriceFloors();
        if (priceFloors.isEmpty()) {
            return true;
        }
        Iterator<Double> it = priceFloors.values().iterator();
        while (it.hasNext()) {
            if (d10 > it.next().doubleValue()) {
                return true;
            }
        }
        return false;
    }

    void setAdPlacementConfig(AdPlacementConfig adPlacementConfig) {
        AdFormat adFormat = this.adPlacementConfig.getAdFormat();
        AdFormat adFormat2 = adPlacementConfig.getAdFormat();
        if (!adFormat.equals(adFormat2)) {
            io.bidmachine.core.a.n("setAdPlacementConfig received different AdsFormat. Expected: " + adFormat + ", actual: " + adFormat2);
            adPlacementConfig = adPlacementConfig.newBuilder(adFormat).build();
        }
        this.adPlacementConfig = adPlacementConfig;
    }

    void setBidPayload(ResponsePayload responsePayload) {
        this.bidPayload = responsePayload;
    }

    void setNetworkConfigList(List<NetworkConfig> list) {
        this.networkConfigList = list;
    }

    void setPriceFloorParams(PriceFloorParams priceFloorParams) {
        this.priceFloorParams = priceFloorParams;
    }

    void setTargetingParams(TargetingParams targetingParams) {
        this.targetingParams = targetingParams;
    }

    void setTimeOutMs(Integer num) {
        this.timeOutMs = num;
    }
}
