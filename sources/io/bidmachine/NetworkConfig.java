package io.bidmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NetworkConfig {
    static final String CONFIG_SKIP_INITIALIZATION = "skip_initialization";
    private Map<String, String> baseMediationConfig;
    private AdsType[] mergedAdsTypes;
    private final String networkKey;
    private AdsType[] supportedAdsTypes;
    private final SortedMap<String, List<Map<String, String>>> typedMediationConfigs = new TreeMap(new Comparator() { // from class: io.bidmachine.i4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    });
    private final NetworkConfigParams networkConfigParams = new a();
    private final Map<String, String> networkParams = new HashMap();

    protected NetworkConfig(String str, Map<String, String> map) {
        this.networkKey = str;
        withNetworkParams(map);
    }

    private boolean contains(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> prepareTypedMediationConfig(Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (useNetworkParamsAsMediationBase()) {
            map2.putAll(this.networkParams);
        }
        Map<String, String> map3 = this.baseMediationConfig;
        if (map3 != null) {
            map2.putAll(map3);
        }
        map2.putAll(map);
        return map2;
    }

    public <T extends vb.d> List<NetworkAdUnit> createNetworkAdUnitList(AdsType adsType, T t10, AdContentType adContentType, NetworkAdapter networkAdapter) {
        List<Map<String, String>> value;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Map<String, String>>> entry : this.typedMediationConfigs.entrySet()) {
            AdFormat adFormatByRemoteName = AdFormat.byRemoteName(entry.getKey());
            if (adFormatByRemoteName != null && adFormatByRemoteName.isMatch(adsType, t10, adContentType) && (value = entry.getValue()) != null) {
                Iterator<Map<String, String>> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(new NetworkAdUnit(networkAdapter, adFormatByRemoteName, prepareTypedMediationConfig(it.next())));
                }
            }
        }
        return arrayList;
    }

    protected abstract NetworkAdapter createNetworkAdapter();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return getNetworkKey().equals(((NetworkConfig) obj).getNetworkKey());
    }

    public NetworkConfig forAdTypes(AdsType... adsTypeArr) {
        this.supportedAdsTypes = adsTypeArr;
        return this;
    }

    NetworkConfigParams getNetworkConfigParams() {
        return this.networkConfigParams;
    }

    public String getNetworkKey() {
        return this.networkKey;
    }

    AdsType[] getSupportedAdsTypes(NetworkAdapter networkAdapter) {
        if (this.mergedAdsTypes == null) {
            ArrayList arrayList = new ArrayList();
            for (AdsType adsType : networkAdapter.getSupportedTypes()) {
                AdsType[] adsTypeArr = this.supportedAdsTypes;
                if (adsTypeArr == null || contains(adsTypeArr, adsType)) {
                    arrayList.add(adsType);
                }
            }
            this.mergedAdsTypes = (AdsType[]) arrayList.toArray(new AdsType[0]);
        }
        return this.mergedAdsTypes;
    }

    public int hashCode() {
        return getNetworkKey().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T extends NetworkConfig> T internalSetSkipInitialization(boolean z10) {
        setNetworkParam(CONFIG_SKIP_INITIALIZATION, String.valueOf(z10));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setBaseMediationParam(String str, String str2) {
        if (this.baseMediationConfig == null) {
            this.baseMediationConfig = new HashMap();
        }
        this.baseMediationConfig.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setNetworkParam(String str, String str2) {
        this.networkParams.put(str, str2);
        return this;
    }

    protected boolean useNetworkParamsAsMediationBase() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withBaseMediationConfig(Map<String, String> map) {
        this.baseMediationConfig = map;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withMediationConfig(String str, Map<String, String> map) {
        if (map == null) {
            this.typedMediationConfigs.remove(str);
        } else {
            List<Map<String, String>> arrayList = this.typedMediationConfigs.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.typedMediationConfigs.put(str, arrayList);
            }
            arrayList.add(map);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withNetworkParams(Map<String, String> map) {
        this.networkParams.clear();
        if (map != null) {
            this.networkParams.putAll(map);
        }
        return this;
    }

    class a implements NetworkConfigParams {
        a() {
        }

        private Map<String, List<Map<String, String>>> a(List<String> list) {
            ArrayList arrayList;
            HashMap map = null;
            for (String str : list) {
                List list2 = (List) NetworkConfig.this.typedMediationConfigs.get(str);
                if (list2 != null) {
                    arrayList = null;
                    for (int i10 = 0; i10 < list2.size(); i10++) {
                        Map map2 = (Map) list2.get(i10);
                        Map<String, String> mapPrepareTypedMediationConfig = map2 != null ? NetworkConfig.this.prepareTypedMediationConfig(map2) : null;
                        if (mapPrepareTypedMediationConfig != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(mapPrepareTypedMediationConfig);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(str, arrayList);
                }
            }
            return map;
        }

        @Override // io.bidmachine.NetworkConfigParams
        public String getFromNetworkParams(String str) {
            return (String) NetworkConfig.this.networkParams.get(str);
        }

        @Override // io.bidmachine.NetworkConfigParams
        public Map<String, List<Map<String, String>>> obtainNetworkMediationConfigs(String... strArr) {
            if (strArr == null || strArr.length == 0) {
                return null;
            }
            return a(Arrays.asList(strArr));
        }

        @Override // io.bidmachine.NetworkConfigParams
        public Map<String, String> obtainNetworkParams() {
            return new HashMap(NetworkConfig.this.networkParams);
        }

        @Override // io.bidmachine.NetworkConfigParams
        public String removeFromNetworkParams(String str) {
            return (String) NetworkConfig.this.networkParams.remove(str);
        }

        @Override // io.bidmachine.NetworkConfigParams
        public EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr) {
            EnumMap<AdsFormat, List<Map<String, String>>> enumMap = null;
            if (adsFormatArr != null && adsFormatArr.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (AdsFormat adsFormat : adsFormatArr) {
                    arrayList.add(adsFormat.getRemoteName());
                }
                Map<String, List<Map<String, String>>> mapA = a(arrayList);
                if (mapA == null) {
                    return null;
                }
                enumMap = new EnumMap<>(AdsFormat.class);
                for (Map.Entry<String, List<Map<String, String>>> entry : mapA.entrySet()) {
                    AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(entry.getKey());
                    if (adsFormatByRemoteName != null) {
                        enumMap.put(adsFormatByRemoteName, entry.getValue());
                    }
                }
            }
            return enumMap;
        }
    }

    public <T extends NetworkConfig> T withMediationConfig(AdFormat adFormat, Map<String, String> map) {
        return (T) withMediationConfig(adFormat.getRemoteName(), map);
    }

    @Deprecated(since = "3.5.0")
    public <T extends NetworkConfig> T withMediationConfig(AdsFormat adsFormat, Map<String, String> map) {
        return (T) withMediationConfig(adsFormat.getRemoteName(), map);
    }

    @Deprecated
    public <T extends NetworkConfig> T withMediationConfig(AdsFormat adsFormat, Map<String, String> map, Orientation orientation) {
        io.bidmachine.core.a.n("The parameter 'orientation' is no longer supported and has no effect.");
        return (T) withMediationConfig(adsFormat, map);
    }
}
