package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzkn extends zzbm implements zzko {
    public zzkn() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        zzbn.zzf(parcel);
        zzb(bArrCreateByteArray);
        return true;
    }
}
