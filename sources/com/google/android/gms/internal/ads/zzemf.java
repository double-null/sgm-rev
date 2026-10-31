package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzemf implements zzdno {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfkf zzc;
    private final zzcku zzd;
    private final zzfky zze;
    private final zzbpt zzf;
    private final boolean zzg;
    private final zzekr zzh;
    private final zzdzl zzi;

    zzemf(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfkf zzfkfVar, zzcku zzckuVar, zzfky zzfkyVar, boolean z10, zzbpt zzbptVar, zzekr zzekrVar, zzdzl zzdzlVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfkfVar;
        this.zzd = zzckuVar;
        this.zze = zzfkyVar;
        this.zzg = z10;
        this.zzf = zzbptVar;
        this.zzh = zzekrVar;
        this.zzi = zzdzlVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    @Override // com.google.android.gms.internal.ads.zzdno
    public final void zza(boolean z10, Context context, zzdde zzddeVar) {
        boolean z11;
        zzcuw zzcuwVar = (zzcuw) zzhbw.zzt(this.zzb);
        zzcku zzckuVar = this.zzd;
        zzckuVar.zzag(true);
        boolean z12 = this.zzg;
        boolean zZzc = z12 ? this.zzf.zzc(true) : true;
        boolean z13 = false;
        if (!z12) {
            z11 = z13;
        } else if (this.zzf.zzd()) {
            z13 = true;
            z11 = z13;
        } else {
            z11 = false;
            z13 = true;
        }
        float fZze = z13 ? this.zzf.zze() : 0.0f;
        zzfkf zzfkfVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, true, z11, fZze, -1, z10, zzfkfVar.zzO, false);
        if (zzddeVar != null) {
            zzddeVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdnd zzdndVarZzj = zzcuwVar.zzj();
        int i10 = zzfkfVar.zzQ;
        if (i10 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
            if (zzxVar == null) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i12 = zzxVar.zza;
                if (i12 == 1) {
                    i10 = 7;
                } else if (i12 == 2) {
                    i10 = 6;
                } else {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        int i14 = i10;
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfkfVar.zzB;
        zzfkk zzfkkVar = zzfkfVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdndVarZzj, null, zzckuVar, i14, versionInfoParcel, str, zzlVar, zzfkkVar.zzb, zzfkkVar.zza, this.zze.zzg, zzddeVar, zzfkfVar.zzb() ? this.zzh : null, zzckuVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdno
    public final zzfkf zzb() {
        return this.zzc;
    }
}
