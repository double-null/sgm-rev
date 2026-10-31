package com.facebook.internal.gatekeeper;

import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: GateKeeperRuntimeCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GateKeeperRuntimeCache {
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, GateKeeper>> gateKeepers = new ConcurrentHashMap<>();

    public static /* synthetic */ List dumpGateKeepers$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.dumpGateKeepers(str);
    }

    public static /* synthetic */ GateKeeper getGateKeeper$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeper(str, str2);
    }

    public static /* synthetic */ boolean getGateKeeperValue$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeperValue(str, str2, z10);
    }

    public static /* synthetic */ void resetCache$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.resetCache(str);
    }

    public static /* synthetic */ void setGateKeeper$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, GateKeeper gateKeeper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeper(str, gateKeeper);
    }

    public static /* synthetic */ void setGateKeeperValue$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeperValue(str, str2, z10);
    }

    public static /* synthetic */ void setGateKeepers$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeepers(str, list);
    }

    public final List<GateKeeper> dumpGateKeepers(String appId) {
        t.f(appId, "appId");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, GateKeeper>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public final GateKeeper getGateKeeper(String appId, String name) {
        t.f(appId, "appId");
        t.f(name, "name");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(name);
        }
        return null;
    }

    public final boolean getGateKeeperValue(String appId, String name, boolean z10) {
        t.f(appId, "appId");
        t.f(name, "name");
        GateKeeper gateKeeper = getGateKeeper(appId, name);
        return gateKeeper != null ? gateKeeper.getValue() : z10;
    }

    public final void resetCache(String appId) {
        t.f(appId, "appId");
        this.gateKeepers.remove(appId);
    }

    public final void setGateKeeper(String appId, GateKeeper gateKeeper) {
        t.f(appId, "appId");
        t.f(gateKeeper, "gateKeeper");
        if (!this.gateKeepers.containsKey(appId)) {
            this.gateKeepers.put(appId, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap != null) {
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
    }

    public final void setGateKeeperValue(String appId, String name, boolean z10) {
        t.f(appId, "appId");
        t.f(name, "name");
        setGateKeeper(appId, new GateKeeper(name, z10));
    }

    public final void setGateKeepers(String appId, List<GateKeeper> gateKeeperList) {
        t.f(appId, "appId");
        t.f(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = new ConcurrentHashMap<>();
        for (GateKeeper gateKeeper : gateKeeperList) {
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
        this.gateKeepers.put(appId, concurrentHashMap);
    }
}
