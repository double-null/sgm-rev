package io.bidmachine.ads.networks.gam;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* JADX INFO: loaded from: classes4.dex */
public class GAMConfig extends NetworkConfig {
    @Override // io.bidmachine.NetworkConfig
    protected NetworkAdapter createNetworkAdapter() {
        return new GAMAdapter();
    }
}
