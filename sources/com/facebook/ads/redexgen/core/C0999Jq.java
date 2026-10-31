package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0999Jq implements InterfaceC1317Wc {
    public final /* synthetic */ C06395d A00;

    public C0999Jq(C06395d c06395d) {
        this.A00 = c06395d;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1317Wc
    public final void ACp() {
        this.A00.A0B = false;
        if (this.A00.A06 != null) {
            this.A00.A06.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1317Wc
    public final void AEn(float f10) {
        if (this.A00.A06 != null) {
            this.A00.A06.setProgressImmediate(100.0f * (1.0f - (f10 / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
