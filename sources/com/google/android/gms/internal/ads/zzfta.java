package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfta extends zzfub {
    public zzfta(ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock) {
        super(clientApi, context, i10, zzfluVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfooVar, zzfswVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final ListenableFuture zza(Context context) {
        zzbvc zzbvcVarZzd = this.zzd.zzd();
        if (zzbvcVarZzd == null) {
            return zzhbw.zzc(new zzfso(1, "Failed to create an interstitial ad manager."));
        }
        zzetk zzetkVar = (zzetk) this.zza.zzc(ObjectWrapper.wrap(context), new com.google.android.gms.ads.internal.client.zzr(), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzbvcVarZzd, this.zzc);
        if (zzetkVar == null) {
            return zzhbw.zzc(new zzfso(1, "Failed to create an interstitial ad manager."));
        }
        zzhcp zzhcpVarZze = zzhcp.zze();
        try {
            zzB(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc);
            zzfsn zzfsnVar = this.zzf;
            if (zzfsnVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzT)).booleanValue()) {
                    zzetkVar.zzL(new zzfsy(zzfsnVar, this.zzi, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzU)).longValue(), this));
                }
            }
            zzetkVar.zzQ(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc, new zzfsz(zzetkVar, new zzfto(this, zzhcpVarZze), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza));
            return zzhcpVarZze;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad.", e10);
            return zzhbw.zzc(new zzfso(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzQ)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbu) obj).zzt();
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for  the interstitial ad.", e10);
            return null;
        }
    }

    public zzfta(String str, ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock, zzfsn zzfsnVar) {
        super(str, clientApi, context, i10, zzfluVar, zzfpVar, zzceVar, scheduledExecutorService, zzfooVar, zzfswVar, clock, zzfsnVar);
    }
}
