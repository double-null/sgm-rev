package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1002Jt implements InterfaceC1317Wc {
    public final /* synthetic */ C06415f A00;

    public C1002Jt(C06415f c06415f) {
        this.A00 = c06415f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1317Wc
    public final void ACp() {
        this.A00.A02 = false;
        if (this.A00.A07 != null) {
            this.A00.A07.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1317Wc
    public final void AEn(float f10) {
        if (this.A00.A07 != null) {
            this.A00.A07.setProgressImmediate(100.0f * (1.0f - (f10 / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
