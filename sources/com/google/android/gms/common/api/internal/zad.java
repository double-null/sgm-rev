package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zad extends zac {
    protected final TaskCompletionSource zaa;

    public zad(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.zaa = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(zabk zabkVar) throws DeadObjectException {
        try {
            zah(zabkVar);
        } catch (DeadObjectException e10) {
            zad(zai.zai(e10));
            throw e10;
        } catch (RemoteException e11) {
            zad(zai.zai(e11));
        } catch (RuntimeException e12) {
            this.zaa.trySetException(e12);
        }
    }

    protected abstract void zah(zabk zabkVar) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.zai
    public void zaf(zaaa zaaaVar, boolean z10) {
    }
}
