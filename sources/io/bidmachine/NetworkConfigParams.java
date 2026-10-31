package io.bidmachine;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface NetworkConfigParams {
    String getFromNetworkParams(String str);

    @Deprecated(since = "3.5.0")
    EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr);

    Map<String, List<Map<String, String>>> obtainNetworkMediationConfigs(String... strArr);

    Map<String, String> obtainNetworkParams();

    String removeFromNetworkParams(String str);
}
