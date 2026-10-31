package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfsu extends zzbgl {
    private zzfsp zza;
    private String zzb;

    zzfsu(zzfsp zzfspVar, String str) {
        this.zza = zzfspVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzb(zzbgj zzbgjVar) {
        zzfsp zzfspVar = this.zza;
        if (zzfspVar == null) {
            return;
        }
        zzfspVar.zza(zzbgjVar);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzc(int i10) {
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsp zzfspVar = this.zza;
        if (zzfspVar == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.zzb;
        StringBuilder sb2 = new StringBuilder(string.length() + 60 + String.valueOf(str).length());
        sb2.append("Failed to load app open ad with error parcel: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        ((zzfto) zzfspVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
    }
}
