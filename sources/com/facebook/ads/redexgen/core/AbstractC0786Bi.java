package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0786Bi implements InterfaceC1742fK {
    public final By A00;
    public final EnumC1747fP A01;

    public AbstractC0786Bi(By by, EnumC1747fP enumC1747fP) {
        this.A00 = by;
        this.A01 = enumC1747fP;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1742fK
    public void A45(Map<InterfaceC1725f2, EnumC1747fP> map, Map<SyncModifiableBundle, EnumC1734fC> map2) {
        map.put(this.A00, this.A01);
    }
}
