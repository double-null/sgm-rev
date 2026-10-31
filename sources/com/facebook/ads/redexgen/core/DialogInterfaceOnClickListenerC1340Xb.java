package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC1340Xb implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1122Om A00;

    public DialogInterfaceOnClickListenerC1340Xb(C1122Om c1122Om) {
        this.A00 = c1122Om;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }
}
