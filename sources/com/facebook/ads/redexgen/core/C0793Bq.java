package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0793Bq extends BroadcastReceiver {
    public final /* synthetic */ C0798Bv A00;

    public C0793Bq(C0798Bv c0798Bv) {
        this.A00 = c0798Bv;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}
