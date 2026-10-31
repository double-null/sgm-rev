package io.bidmachine.ads.networks.mraid;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* JADX INFO: compiled from: MraidConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MraidConfig extends NetworkConfig {
    public MraidConfig() {
        super("mraid", null);
    }

    @Override // io.bidmachine.NetworkConfig
    protected NetworkAdapter createNetworkAdapter() {
        return new MraidAdapter();
    }
}
