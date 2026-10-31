package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbza extends zzbef implements zzbzb {
    public zzbza() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) zzbeg.zzb(parcel, Bundle.CREATOR);
                zzbeg.zzh(parcel);
                zzh(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzi();
                parcel2.writeNoException();
                return true;
            case 3:
                zzj();
                parcel2.writeNoException();
                return true;
            case 4:
                zzk();
                parcel2.writeNoException();
                return true;
            case 5:
                zzl();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzbeg.zzb(parcel, Bundle.CREATOR);
                zzbeg.zzh(parcel);
                zzo(bundle2);
                parcel2.writeNoException();
                zzbeg.zzd(parcel2, bundle2);
                return true;
            case 7:
                zzp();
                parcel2.writeNoException();
                return true;
            case 8:
                zzq();
                parcel2.writeNoException();
                return true;
            case 9:
                zzs();
                parcel2.writeNoException();
                return true;
            case 10:
                zze();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzg = zzg();
                parcel2.writeNoException();
                int i12 = zzbeg.zza;
                parcel2.writeInt(zZzg ? 1 : 0);
                return true;
            case 12:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Intent intent = (Intent) zzbeg.zzb(parcel, Intent.CREATOR);
                zzbeg.zzh(parcel);
                zzm(i13, i14, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbeg.zzh(parcel);
                zzn(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 14:
                zzf();
                parcel2.writeNoException();
                return true;
            case 15:
                int i15 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                zzbeg.zzh(parcel);
                zzH(i15, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public static zzbzb zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(WKirgUEJJ.JugEadWR);
        return iInterfaceQueryLocalInterface instanceof zzbzb ? (zzbzb) iInterfaceQueryLocalInterface : new zzbyz(iBinder);
    }
}
