package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzefx extends zzegc {
    private final Context zzg;
    private final VersionInfoParcel zzh;
    private final zzefw zzi;

    zzefx(Context context, VersionInfoParcel versionInfoParcel, zzefw zzefwVar, zzcag zzcagVar) {
        this.zzg = context;
        this.zzh = versionInfoParcel;
        this.zzi = zzefwVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzi(this.zzh.afmaVersion);
                    this.zzi.zza();
                } catch (RemoteException e10) {
                    this.zzi.zzb(e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegc, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.zzi.zzb(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.getErrorMessage()))));
    }

    @Override // com.google.android.gms.internal.ads.zzegc, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 33);
        sb2.append("Connection suspended with cause: ");
        sb2.append(i10);
        this.zzi.zzb(new RemoteException(sb2.toString()));
    }

    public final void zza() {
        synchronized (this.zzb) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzcaf zzcafVar = new zzcaf(this.zzg, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
            this.zzf = zzcafVar;
            zzcafVar.checkAvailabilityAndConnect();
        }
    }
}
