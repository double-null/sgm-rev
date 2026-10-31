package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC1341Xc implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1122Om A01;

    public DialogInterfaceOnClickListenerC1341Xc(C1122Om c1122Om, EditText editText) {
        this.A01 = c1122Om;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.A01.A03.execute(new C1125Op(this, dialogInterface));
    }
}
