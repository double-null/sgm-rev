package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2103le implements InterfaceC0857Ed {
    public final int A00;

    public C2103le() {
        this(-1);
    }

    public C2103le(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0857Ed
    public final int A8R(int i10) {
        if (this.A00 == -1) {
            if (i10 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0857Ed
    public final long A8m(C0856Ec c0856Ec) {
        IOException iOException = c0856Ec.A03;
        if ((iOException instanceof C05662i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C07349h) || (iOException instanceof C0867En) || C06354z.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c0856Ec.A00 - 1) * 1000, Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
    }
}
