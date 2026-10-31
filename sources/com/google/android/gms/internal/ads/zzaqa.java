package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaqa implements zzapt {
    private final zzaqw zza;
    private long zzf;
    private String zzh;
    private zzahk zzi;
    private zzapz zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzaqk zzc = new zzaqk(7, 128);
    private final zzaqk zzd = new zzaqk(8, 128);
    private final zzaqk zze = new zzaqk(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzet zzn = new zzet();

    public zzaqa(zzaqw zzaqwVar, boolean z10, boolean z11, String str) {
        this.zza = zzaqwVar;
    }

    private final void zzf(long j10, int i10, long j11) {
        if (!this.zzk) {
            this.zzc.zzc(i10);
            this.zzd.zzc(i10);
        }
        this.zze.zzc(i10);
        this.zzj.zzd(j10, i10, j11, this.zzm);
    }

    private final void zzg(byte[] bArr, int i10, int i11) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i10, i11);
            this.zzd.zzd(bArr, i10, i11);
        }
        this.zze.zzd(bArr, i10, i11);
    }

    private final void zzh(long j10, int i10, int i11, long j11) {
        if (!this.zzk) {
            zzaqk zzaqkVar = this.zzc;
            zzaqkVar.zze(i11);
            zzaqk zzaqkVar2 = this.zzd;
            zzaqkVar2.zze(i11);
            if (this.zzk) {
                if (zzaqkVar.zzb()) {
                    zzgo zzgoVarZze = zzgp.zze(zzaqkVar.zza, 4, zzaqkVar.zzb);
                    this.zza.zzb(zzgoVarZze.zzm);
                    this.zzj.zza(zzgoVarZze);
                    zzaqkVar.zza();
                } else if (zzaqkVar2.zzb()) {
                    this.zzj.zzb(zzgp.zzh(zzaqkVar2.zza, 4, zzaqkVar2.zzb));
                    zzaqkVar2.zza();
                }
            } else if (zzaqkVar.zzb() && zzaqkVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaqkVar.zza, zzaqkVar.zzb));
                arrayList.add(Arrays.copyOf(zzaqkVar2.zza, zzaqkVar2.zzb));
                zzgo zzgoVarZze2 = zzgp.zze(zzaqkVar.zza, 4, zzaqkVar.zzb);
                zzgn zzgnVarZzh = zzgp.zzh(zzaqkVar2.zza, 4, zzaqkVar2.zzb);
                String strZzb = zzdq.zzb(zzgoVarZze2.zza, zzgoVarZze2.zzb, zzgoVarZze2.zzc);
                zzahk zzahkVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzn(this.zzb);
                zztVar.zzo("video/avc");
                zztVar.zzk(strZzb);
                zztVar.zzv(zzgoVarZze2.zze);
                zztVar.zzw(zzgoVarZze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzgoVarZze2.zzj);
                zzhVar.zzb(zzgoVarZze2.zzk);
                zzhVar.zzc(zzgoVarZze2.zzl);
                zzhVar.zze(zzgoVarZze2.zzh + 8);
                zzhVar.zzf(zzgoVarZze2.zzi + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zzgoVarZze2.zzg);
                zztVar.zzr(arrayList);
                int i12 = zzgoVarZze2.zzm;
                zztVar.zzq(i12);
                zzahkVar.zzA(zztVar.zzO());
                this.zzk = true;
                this.zza.zzb(i12);
                this.zzj.zza(zzgoVarZze2);
                this.zzj.zzb(zzgnVarZzh);
                zzaqkVar.zza();
                zzaqkVar2.zza();
            }
        }
        zzaqk zzaqkVar3 = this.zze;
        if (zzaqkVar3.zze(i11)) {
            int iZza = zzgp.zza(zzaqkVar3.zza, zzaqkVar3.zzb);
            zzet zzetVar = this.zzn;
            zzetVar.zzb(zzaqkVar3.zza, iZza);
            zzetVar.zzh(4);
            this.zza.zzc(j11, zzetVar);
        }
        if (this.zzj.zze(j10, i10, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgp.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzapz zzapzVar = this.zzj;
        if (zzapzVar != null) {
            zzapzVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzh = zzarhVar.zzc();
        zzahk zzahkVarZzu = zzagbVar.zzu(zzarhVar.zzb(), 2);
        this.zzi = zzahkVarZzu;
        this.zzj = new zzapz(zzahkVarZzu, false, false);
        this.zza.zza(zzagbVar, zzarhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        this.zzl = j10;
        int i11 = i10 & 2;
        this.zzm = (i11 != 0) | this.zzm;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) {
        int i10;
        int i11;
        this.zzi.getClass();
        String str = zzfl.zza;
        int iZzg = zzetVar.zzg();
        int iZze = zzetVar.zze();
        byte[] bArrZzi = zzetVar.zzi();
        this.zzf += (long) zzetVar.zzd();
        this.zzi.zzc(zzetVar, zzetVar.zzd());
        while (true) {
            int iZzi = zzgp.zzi(bArrZzi, iZzg, iZze, this.zzg);
            if (iZzi == iZze) {
                zzg(bArrZzi, iZzg, iZze);
                return;
            }
            int i12 = bArrZzi[iZzi + 3] & 31;
            if (iZzi > 0) {
                int i13 = iZzi - 1;
                if (bArrZzi[i13] == 0) {
                    i11 = 4;
                    i10 = i13;
                } else {
                    i10 = iZzi;
                    i11 = 3;
                }
            } else {
                i10 = iZzi;
                i11 = 3;
            }
            int i14 = i10 - iZzg;
            if (i14 > 0) {
                zzg(bArrZzi, iZzg, i10);
            }
            int i15 = iZze - i10;
            long j10 = this.zzf - ((long) i15);
            zzh(j10, i15, i14 < 0 ? -i14 : 0, this.zzl);
            zzf(j10, i12, this.zzl);
            iZzg = i10 + i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
        this.zzi.getClass();
        String str = zzfl.zza;
        if (z10) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
