package com.facebook.ads.redexgen.core;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0780Bc implements InterfaceC1803gK {
    public static final C0780Bc A00 = new C0780Bc();

    public static C0780Bc A00() {
        return A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1803gK
    public final long AC6() {
        return SystemClock.elapsedRealtime();
    }
}
