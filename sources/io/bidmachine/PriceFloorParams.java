package io.bidmachine;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class PriceFloorParams {
    private final Map<String, Double> priceFloorsMap = new HashMap();

    Map<String, Double> getPriceFloors() {
        return this.priceFloorsMap;
    }

    /* JADX INFO: renamed from: addPriceFloor, reason: merged with bridge method [inline-methods] */
    public PriceFloorParams m331addPriceFloor(double d10) {
        m332addPriceFloor(UUID.randomUUID().toString(), d10);
        return this;
    }

    /* JADX INFO: renamed from: addPriceFloor, reason: merged with bridge method [inline-methods] */
    public PriceFloorParams m332addPriceFloor(String str, double d10) {
        this.priceFloorsMap.put(str, Double.valueOf(d10));
        return this;
    }
}
