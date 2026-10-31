package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzapy implements zzapt {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzarl zzb;
    private zzapx zzg;
    private long zzh;
    private String zzi;
    private zzahk zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzapw zze = new zzapw(128);
    private long zzl = -9223372036854775807L;
    private final zzaqk zzf = new zzaqk(178, 128);
    private final zzet zzc = new zzet();

    zzapy(zzarl zzarlVar, String str) {
        this.zzb = zzarlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        zzgp.zzj(this.zzd);
        this.zze.zza();
        zzapx zzapxVar = this.zzg;
        if (zzapxVar != null) {
            zzapxVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzi = zzarhVar.zzc();
        zzahk zzahkVarZzu = zzagbVar.zzu(zzarhVar.zzb(), 2);
        this.zzj = zzahkVarZzu;
        this.zzg = new zzapx(zzahkVarZzu);
        this.zzb.zza(zzagbVar, zzarhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        this.zzl = j10;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x010c  */
    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) {
        int i10;
        int i11;
        this.zzg.getClass();
        this.zzj.getClass();
        int iZzg = zzetVar.zzg();
        int iZze = zzetVar.zze();
        byte[] bArrZzi = zzetVar.zzi();
        this.zzh += (long) zzetVar.zzd();
        this.zzj.zzc(zzetVar, zzetVar.zzd());
        while (true) {
            int iZzi = zzgp.zzi(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzi == iZze) {
                break;
            }
            int i12 = iZzi + 3;
            int i13 = zzetVar.zzi()[i12] & 255;
            int i14 = iZzi - iZzg;
            if (!this.zzk) {
                if (i14 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzi);
                }
                int i15 = i14 < 0 ? -i14 : 0;
                zzapw zzapwVar = this.zze;
                if (zzapwVar.zzb(i13, i15)) {
                    zzahk zzahkVar = this.zzj;
                    int i16 = zzapwVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzapwVar.zzc, zzapwVar.zza);
                    zzes zzesVar = new zzes(bArrCopyOf, bArrCopyOf.length);
                    zzesVar.zzo(i16);
                    zzesVar.zzo(4);
                    zzesVar.zzg();
                    zzesVar.zzh(8);
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(4);
                        zzesVar.zzh(3);
                    }
                    int iZzj = zzesVar.zzj(4);
                    float f10 = 1.0f;
                    if (iZzj == 15) {
                        int iZzj2 = zzesVar.zzj(8);
                        int iZzj3 = zzesVar.zzj(8);
                        if (iZzj3 == 0) {
                            zzeg.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f10 = iZzj2 / iZzj3;
                        }
                    } else if (iZzj < 7) {
                        f10 = zza[iZzj];
                    } else {
                        zzeg.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f11 = f10;
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(2);
                        zzesVar.zzh(1);
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(15);
                            zzesVar.zzg();
                            zzesVar.zzh(15);
                            zzesVar.zzg();
                            zzesVar.zzh(15);
                            zzesVar.zzg();
                            zzesVar.zzh(3);
                            zzesVar.zzh(11);
                            zzesVar.zzg();
                            zzesVar.zzh(15);
                            zzesVar.zzg();
                            i11 = 2;
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 2;
                    }
                    if (zzesVar.zzj(i11) != 0) {
                        zzeg.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzesVar.zzg();
                    int iZzj4 = zzesVar.zzj(16);
                    zzesVar.zzg();
                    if (zzesVar.zzi()) {
                        if (iZzj4 == 0) {
                            zzeg.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i17 = iZzj4 - 1;
                            int i18 = 0;
                            while (i17 > 0) {
                                i17 >>= 1;
                                i18++;
                            }
                            zzesVar.zzh(i18);
                        }
                    }
                    zzesVar.zzg();
                    int iZzj5 = zzesVar.zzj(13);
                    zzesVar.zzg();
                    int iZzj6 = zzesVar.zzj(13);
                    zzesVar.zzg();
                    zzesVar.zzg();
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzn("video/mp2t");
                    zztVar.zzo("video/mp4v-es");
                    zztVar.zzv(iZzj5);
                    zztVar.zzw(iZzj6);
                    zztVar.zzB(f11);
                    zztVar.zzr(Collections.singletonList(bArrCopyOf));
                    zzahkVar.zzA(zztVar.zzO());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzi);
            zzaqk zzaqkVar = this.zzf;
            if (i14 > 0) {
                zzaqkVar.zzd(bArrZzi, iZzg, iZzi);
                i10 = 0;
            } else {
                i10 = -i14;
            }
            if (zzaqkVar.zze(i10)) {
                int iZza = zzgp.zza(zzaqkVar.zza, zzaqkVar.zzb);
                zzet zzetVar2 = this.zzc;
                String str2 = zzfl.zza;
                zzetVar2.zzb(zzaqkVar.zza, iZza);
                this.zzb.zzb(this.zzl, zzetVar2);
            }
            if (i13 == 178) {
                if (zzetVar.zzi()[iZzi + 2] == 1) {
                    zzaqkVar.zzc(178);
                }
                i13 = 178;
            }
            int i19 = iZze - iZzi;
            this.zzg.zzd(this.zzh - ((long) i19), i19, this.zzk);
            this.zzg.zzb(i13, this.zzl);
            iZzg = i12;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
        zzapx zzapxVar = this.zzg;
        zzapxVar.getClass();
        if (z10) {
            zzapxVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
