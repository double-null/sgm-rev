package io.bidmachine;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkAdUnitManager {
    private final AtomicBoolean isNetworkAuctionNotified;
    private final List<NetworkAdUnit> networkAdUnitList;
    private final oc.p tag;

    public NetworkAdUnitManager() {
        this(null);
    }

    NetworkAdUnit findOrAddWinnerNetworkAdUnit(NetworkAdapter networkAdapter, AdsFormat adsFormat, Map<String, String> map) {
        String str = map.get(ProtoExtConstants.AD_UNIT_ID);
        NetworkAdUnit networkAdUnit = null;
        if (!TextUtils.isEmpty(str)) {
            for (NetworkAdUnit networkAdUnit2 : this.networkAdUnitList) {
                if (networkAdUnit2.getId().equals(str)) {
                    networkAdUnit = networkAdUnit2;
                }
            }
        }
        if (networkAdUnit != null) {
            return networkAdUnit;
        }
        NetworkAdUnit networkAdUnit3 = new NetworkAdUnit(networkAdapter, adsFormat, map);
        this.networkAdUnitList.add(networkAdUnit3);
        return networkAdUnit3;
    }

    List<NetworkAdUnit> getNetworkAdUnitList() {
        return this.networkAdUnitList;
    }

    void notifyNetworkAuctionResult(NetworkAdUnit networkAdUnit) {
        if (this.isNetworkAuctionNotified.compareAndSet(false, true)) {
            io.bidmachine.core.a.a(this.tag, "notifyNetworkAuctionResult");
            for (NetworkAdUnit networkAdUnit2 : this.networkAdUnitList) {
                if (networkAdUnit2 == networkAdUnit) {
                    try {
                        networkAdUnit2.onWinAuction();
                    } catch (Throwable unused) {
                    }
                } else {
                    networkAdUnit2.onLossAuction();
                }
            }
        }
    }

    void notifyNetworkClearAuction() {
        if (this.networkAdUnitList.isEmpty()) {
            return;
        }
        io.bidmachine.core.a.a(this.tag, "notifyNetworkClearAuction");
        Iterator<NetworkAdUnit> it = this.networkAdUnitList.iterator();
        while (it.hasNext()) {
            try {
                it.next().clearAuction();
            } catch (Throwable unused) {
            }
        }
        this.networkAdUnitList.clear();
    }

    void setNetworkAdUnitList(List<NetworkAdUnit> list) {
        this.networkAdUnitList.clear();
        if (io.bidmachine.core.h.C(list)) {
            return;
        }
        this.networkAdUnitList.addAll(list);
    }

    public NetworkAdUnitManager(List<NetworkAdUnit> list) {
        this.tag = new oc.p("NetworkAdUnitManager");
        this.isNetworkAuctionNotified = new AtomicBoolean(false);
        this.networkAdUnitList = new CopyOnWriteArrayList();
        setNetworkAdUnitList(list);
    }
}
