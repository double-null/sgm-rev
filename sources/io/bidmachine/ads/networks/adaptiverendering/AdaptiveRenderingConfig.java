package io.bidmachine.ads.networks.adaptiverendering;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: AdaptiveRenderingConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdaptiveRenderingConfig extends NetworkConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16512a = new a(null);

    /* JADX INFO: compiled from: AdaptiveRenderingConfig.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public AdaptiveRenderingConfig() {
        super("adaptive_rendering", null);
    }

    @Override // io.bidmachine.NetworkConfig
    protected NetworkAdapter createNetworkAdapter() {
        return new AdaptiveRenderingAdapter();
    }
}
