package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zal extends zao {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ Activity zab;
    final /* synthetic */ int zac;

    zal(Intent intent, Activity activity, int i10) {
        this.zaa = intent;
        this.zab = activity;
        this.zac = i10;
    }

    @Override // com.google.android.gms.common.internal.zao
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
