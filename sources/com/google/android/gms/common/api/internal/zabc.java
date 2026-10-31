package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zabc extends com.google.android.gms.internal.base.zas {
    final /* synthetic */ zabd zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabc(zabd zabdVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zabdVar);
        this.zaa = zabdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((zabb) message.obj).zab(this.zaa);
        } else {
            if (i10 == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GACStateManager", sb2.toString());
        }
    }
}
