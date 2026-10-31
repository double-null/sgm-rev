package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zam extends com.google.android.gms.internal.base.zaa {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService");
    }

    public final void zae(com.google.android.gms.common.internal.zai zaiVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zab(parcelZaa, zaiVar);
        zad(1, parcelZaa);
    }
}
