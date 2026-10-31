package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbvv implements MediationAdLoadCallback {
    final /* synthetic */ zzbvi zza;
    final /* synthetic */ Adapter zzb;
    final /* synthetic */ zzbwd zzc;

    zzbvv(zzbwd zzbwdVar, zzbvi zzbviVar, Adapter adapter) {
        this.zza = zzbviVar;
        this.zzb = adapter;
        Objects.requireNonNull(zzbwdVar);
        this.zzc = zzbwdVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(code);
            sb2.append(". ErrorMessage = ");
            sb2.append(message);
            sb2.append(". ErrorDomain = ");
            sb2.append(domain);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
            zzbvi zzbviVar = this.zza;
            zzbviVar.zzx(adError.zza());
            zzbviVar.zzw(adError.getCode(), adError.getMessage());
            zzbviVar.zzg(adError.getCode());
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzc.zzT((MediationInterscrollerAd) obj);
            this.zza.zzj();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        return new zzbvt(this.zza);
    }
}
