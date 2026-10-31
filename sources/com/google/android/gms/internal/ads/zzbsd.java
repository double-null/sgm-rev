package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbsd extends zzbef implements zzbse {
    public zzbsd() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbsh zzbsfVar;
        if (i10 == 3) {
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = zzb();
            parcel2.writeNoException();
            zzbeg.zze(parcel2, zzeaVarZzb);
            return true;
        }
        if (i10 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 5) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbsfVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbsfVar = iInterfaceQueryLocalInterface instanceof zzbsh ? (zzbsh) iInterfaceQueryLocalInterface : new zzbsf(strongBinder);
            }
            zzbeg.zzh(parcel);
            zzd(iObjectWrapperAsInterface, zzbsfVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 6) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbeg.zzh(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        zzbmb zzbmbVarZzf = zzf();
        parcel2.writeNoException();
        zzbeg.zze(parcel2, zzbmbVarZzf);
        return true;
    }
}
