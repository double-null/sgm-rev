package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2226ne implements InterfaceC06324w {
    public final C5H A00;

    public C2226ne() {
        this(null);
    }

    public C2226ne(C5H c5h) {
        this.A00 = c5h;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06324w
    public final InterfaceC2233nl A5A() {
        AnonymousClass17 anonymousClass17 = new AnonymousClass17();
        if (this.A00 != null) {
            anonymousClass17.A3v(this.A00);
        }
        return anonymousClass17;
    }
}
