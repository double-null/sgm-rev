package com.google.android.gms.common.api.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public interface RemoteCall<T, U> {
    void accept(T t10, U u10) throws RemoteException;
}
