package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbwo extends zzbef implements zzbwp {
    public zzbwo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbeg.zzh(parcel);
            zze(iObjectWrapperAsInterface);
        } else if (i10 == 2) {
            String string = parcel.readString();
            zzbeg.zzh(parcel);
            zzf(string);
        } else if (i10 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbeg.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            zzbvl zzbvlVarZzb = zzbvk.zzb(parcel.readStrongBinder());
            zzbeg.zzh(parcel);
            zzh(zzbvlVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
