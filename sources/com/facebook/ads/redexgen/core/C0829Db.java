package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0829Db implements InterfaceC1635dZ {
    public final View A00;
    public final C1621dL A01;

    public C0829Db(C1621dL c1621dL, View view) {
        this.A01 = c1621dL;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1635dZ
    public final double A9N() {
        C1695eY result = C1694eX.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
