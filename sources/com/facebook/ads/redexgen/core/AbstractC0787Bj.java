package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0787Bj implements InterfaceC1742fK {
    public final EnumC1734fC A00;
    public final AbstractC05591z A01;

    public AbstractC0787Bj(AbstractC05591z abstractC05591z, EnumC1734fC enumC1734fC) {
        this.A01 = abstractC05591z;
        this.A00 = enumC1734fC;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1742fK
    public void A45(Map<InterfaceC1725f2, EnumC1747fP> map, Map<SyncModifiableBundle, EnumC1734fC> map2) {
        map2.put(null, this.A00);
    }
}
