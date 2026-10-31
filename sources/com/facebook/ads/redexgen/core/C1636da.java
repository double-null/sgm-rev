package com.facebook.ads.redexgen.core;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1636da extends ContentObserver {
    public final C0830Dc A00;

    public C1636da(Handler handler, C0830Dc c0830Dc) {
        super(handler);
        this.A00 = c0830Dc;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0f();
    }
}
