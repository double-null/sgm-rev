package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaps implements zzapt {
    private final List zza;
    private final zzahk[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzaps(List list, String str) {
        this.zza = list;
        this.zzc = new zzahk[list.size()];
    }

    private final boolean zzf(zzet zzetVar, int i10) {
        if (zzetVar.zzd() == 0) {
            return false;
        }
        if (zzetVar.zzs() != i10) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        int i10 = 0;
        while (true) {
            zzahk[] zzahkVarArr = this.zzc;
            if (i10 >= zzahkVarArr.length) {
                return;
            }
            zzare zzareVar = (zzare) this.zza.get(i10);
            zzarhVar.zza();
            zzahk zzahkVarZzu = zzagbVar.zzu(zzarhVar.zzb(), 3);
            zzt zztVar = new zzt();
            zztVar.zza(zzarhVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo("application/dvbsubs");
            zztVar.zzr(Collections.singletonList(zzareVar.zzb));
            zztVar.zze(zzareVar.zza);
            zzahkVarZzu.zzA(zztVar.zzO());
            zzahkVarArr[i10] = zzahkVarZzu;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j10;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzetVar, 32)) {
                if (this.zze != 1 || zzf(zzetVar, 0)) {
                    int iZzg = zzetVar.zzg();
                    int iZzd = zzetVar.zzd();
                    for (zzahk zzahkVar : this.zzc) {
                        zzetVar.zzh(iZzg);
                        zzahkVar.zzc(zzetVar, iZzd);
                    }
                    this.zzf += iZzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
        if (this.zzd) {
            zzgtj.zzi(this.zzg != -9223372036854775807L);
            for (zzahk zzahkVar : this.zzc) {
                zzahkVar.zze(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }
}
