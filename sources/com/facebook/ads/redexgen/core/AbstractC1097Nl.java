package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1097Nl {

    @Nullable
    public static HandlerC1096Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC1096Nk A00(C1595cu c1595cu) {
        if (A00 == null) {
            A00 = new HandlerC1096Nk(c1595cu);
        }
        return A00;
    }

    public static void A01(C1595cu c1595cu) {
        if (UA.A0F(c1595cu)) {
            A03(c1595cu);
        }
    }

    public static void A02(C1595cu c1595cu) {
        if (UA.A0E(c1595cu)) {
            A03(c1595cu);
        }
    }

    public static void A03(C1595cu c1595cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C1831go(c1595cu));
        }
    }
}
