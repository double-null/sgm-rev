package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.vungle.ads.internal.Constants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeay {
    private final zzbqq zza;

    zzeay(zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
    }

    private final void zzs(zzeax zzeaxVar) throws RemoteException {
        String strZza = zzeaxVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzeax("initialize", null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax("creation", null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("nativeObjectCreated");
        zzs(zzeaxVar);
    }

    public final void zzc(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax("creation", null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("nativeObjectNotCreated");
        zzs(zzeaxVar);
    }

    public final void zzd(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzeaxVar);
    }

    public final void zze(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onAdLoaded");
        zzs(zzeaxVar);
    }

    public final void zzf(long j10, int i10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onAdFailedToLoad");
        zzeaxVar.zzd(Integer.valueOf(i10));
        zzs(zzeaxVar);
    }

    public final void zzg(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onAdOpened");
        zzs(zzeaxVar);
    }

    public final void zzh(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onAdClicked");
        this.zza.zzb(zzeaxVar.zza());
    }

    public final void zzi(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onAdClosed");
        zzs(zzeaxVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzeaxVar);
    }

    public final void zzk(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onRewardedAdLoaded");
        zzs(zzeaxVar);
    }

    public final void zzl(long j10, int i10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onRewardedAdFailedToLoad");
        zzeaxVar.zzd(Integer.valueOf(i10));
        zzs(zzeaxVar);
    }

    public final void zzm(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onRewardedAdOpened");
        zzs(zzeaxVar);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onRewardedAdFailedToShow");
        zzeaxVar.zzd(Integer.valueOf(i10));
        zzs(zzeaxVar);
    }

    public final void zzo(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onRewardedAdClosed");
        zzs(zzeaxVar);
    }

    public final void zzp(long j10, zzccf zzccfVar) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onUserEarnedReward");
        zzeaxVar.zze(zzccfVar.zze());
        zzeaxVar.zzf(Integer.valueOf(zzccfVar.zzf()));
        zzs(zzeaxVar);
    }

    public final void zzq(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onAdImpression");
        zzs(zzeaxVar);
    }

    public final void zzr(long j10) throws RemoteException {
        zzeax zzeaxVar = new zzeax(Constants.PLACEMENT_TYPE_REWARDED, null);
        zzeaxVar.zzb(Long.valueOf(j10));
        zzeaxVar.zzc("onAdClicked");
        zzs(zzeaxVar);
    }
}
