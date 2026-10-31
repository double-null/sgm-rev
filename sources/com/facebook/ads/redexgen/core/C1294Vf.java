package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1294Vf implements ViewpointAction<UE, UJ> {
    public VN A00;

    public C1294Vf(VN vn) {
        this.A00 = vn;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6J(C2345pu<UE, UJ> c2345pu, InterfaceC2336pk interfaceC2336pk) {
        switch (interfaceC2336pk.A9M(c2345pu)) {
            case A02:
            case A04:
                this.A00.A02(c2345pu, interfaceC2336pk);
                break;
        }
    }
}
