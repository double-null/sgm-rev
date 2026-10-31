package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zacr extends com.google.android.gms.internal.base.zas {
    final /* synthetic */ zacs zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacr(zacs zacsVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zacsVar);
        this.zaa = zacsVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 59);
            sb2.append("TransformationResultHandler received unknown message type: ");
            sb2.append(i10);
            Log.e("TransformedResultImpl", sb2.toString());
            return;
        }
        PendingResult pendingResult = (PendingResult) message.obj;
        zacs zacsVar = this.zaa;
        synchronized (zacsVar.zaf()) {
            zacs zacsVar2 = (zacs) Preconditions.checkNotNull(zacsVar.zae());
            if (pendingResult == null) {
                zacsVar2.zac(new Status(13, "Transform returned null"));
            } else if (pendingResult instanceof zach) {
                zacsVar2.zac(((zach) pendingResult).zaa());
            } else {
                zacsVar2.zaa(pendingResult);
            }
        }
    }
}
