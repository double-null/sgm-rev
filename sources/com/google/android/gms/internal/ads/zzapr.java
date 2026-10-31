package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzapr implements zzapt {
    private final zzet zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzahk zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzapr(String str, int i10, int i11, String str2) {
        this.zza = new zzet(new byte[i11]);
        this.zzc = str;
        this.zzd = i10;
    }

    private final boolean zzf(zzet zzetVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzetVar.zzd(), i10 - this.zzi);
        zzetVar.zzm(bArr, this.zzi, iMin);
        int i11 = this.zzi + iMin;
        this.zzi = i11;
        return i11 == i10;
    }

    private final void zzg(zzafw zzafwVar) {
        int i10;
        int i11 = zzafwVar.zzb;
        if (i11 == -2147483647 || (i10 = zzafwVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i10 == zzvVar.zzH && i11 == zzvVar.zzI && Objects.equals(zzafwVar.zza, zzvVar.zzp)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzn(this.zze);
        zztVar.zzo(zzafwVar.zza);
        zztVar.zzG(i10);
        zztVar.zzH(i11);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzvVarZzO = zztVar.zzO();
        this.zzl = zzvVarZzO;
        this.zzg.zzA(zzvVarZzO);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzf = zzarhVar.zzc();
        this.zzg = zzagbVar.zzu(zzarhVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        this.zzq = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) throws zzat {
        int i10;
        int i11;
        byte b10;
        int i12;
        this.zzg.getClass();
        while (zzetVar.zzd() > 0) {
            int i13 = this.zzh;
            boolean z10 = false;
            if (i13 == 0) {
                while (zzetVar.zzd() > 0) {
                    int i14 = this.zzj << 8;
                    this.zzj = i14;
                    int iZzs = i14 | zzetVar.zzs();
                    this.zzj = iZzs;
                    int iZza = zzafx.zza(iZzs);
                    this.zzn = iZza;
                    if (iZza != 0) {
                        byte[] bArrZzi = this.zza.zzi();
                        int i15 = this.zzj;
                        bArrZzi[0] = (byte) ((i15 >> 24) & 255);
                        bArrZzi[1] = (byte) ((i15 >> 16) & 255);
                        bArrZzi[2] = (byte) ((i15 >> 8) & 255);
                        bArrZzi[3] = (byte) (i15 & 255);
                        this.zzi = 4;
                        this.zzj = 0;
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    int i16 = this.zzn;
                    if (i16 == 3 || i16 == 4) {
                        this.zzh = 4;
                    } else if (i16 == 1) {
                        this.zzh = 1;
                    } else {
                        this.zzh = 2;
                    }
                }
            } else if (i13 == 1) {
                zzet zzetVar2 = this.zza;
                if (zzf(zzetVar, zzetVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzetVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzvVarZzb = zzafx.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzvVarZzb;
                        this.zzg.zzA(zzvVarZzb);
                    }
                    this.zzm = zzafx.zzc(bArrZzi2);
                    byte b11 = bArrZzi2[0];
                    if (b11 != -2) {
                        if (b11 != -1) {
                            if (b11 != 31) {
                                i11 = (bArrZzi2[4] & 1) << 6;
                                i12 = bArrZzi2[5] & 252;
                            } else {
                                i11 = (7 & bArrZzi2[5]) << 4;
                                b10 = bArrZzi2[6];
                            }
                            i10 = (i12 >> 2) | i11;
                        } else {
                            i11 = (bArrZzi2[4] & 7) << 4;
                            b10 = bArrZzi2[7];
                        }
                        i12 = b10 & 60;
                        i10 = (i12 >> 2) | i11;
                    } else {
                        i10 = ((bArrZzi2[4] & 252) >> 2) | ((bArrZzi2[5] & 1) << 6);
                    }
                    this.zzk = zzhah.zza(zzfl.zzt((i10 + 1) * 32, this.zzl.zzI));
                    zzetVar2.zzh(0);
                    this.zzg.zzc(zzetVar2, 18);
                    this.zzh = 6;
                }
            } else if (i13 != 2) {
                if (i13 == 3) {
                    zzet zzetVar3 = this.zza;
                    if (zzf(zzetVar, zzetVar3.zzi(), this.zzo)) {
                        zzafw zzafwVarZzd = zzafx.zzd(zzetVar3.zzi());
                        zzg(zzafwVarZzd);
                        this.zzm = zzafwVarZzd.zzd;
                        long j10 = zzafwVarZzd.zze;
                        this.zzk = j10 != -9223372036854775807L ? j10 : 0L;
                        zzetVar3.zzh(0);
                        this.zzg.zzc(zzetVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i13 == 4) {
                    zzet zzetVar4 = this.zza;
                    if (zzf(zzetVar, zzetVar4.zzi(), 6)) {
                        int iZzg = zzafx.zzg(zzetVar4.zzi());
                        this.zzp = iZzg;
                        int i17 = this.zzi;
                        if (i17 > iZzg) {
                            int i18 = i17 - iZzg;
                            this.zzi = i17 - i18;
                            zzetVar.zzh(zzetVar.zzg() - i18);
                        }
                        this.zzh = 5;
                    }
                } else if (i13 != 5) {
                    int iMin = Math.min(zzetVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzetVar, iMin);
                    int i19 = this.zzi + iMin;
                    this.zzi = i19;
                    if (i19 == this.zzm) {
                        zzgtj.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzet zzetVar5 = this.zza;
                    if (zzf(zzetVar, zzetVar5.zzi(), this.zzp)) {
                        zzafw zzafwVarZzf = zzafx.zzf(zzetVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzafwVarZzf);
                        }
                        this.zzm = zzafwVarZzf.zzd;
                        long j11 = zzafwVarZzf.zze;
                        this.zzk = j11 != -9223372036854775807L ? j11 : 0L;
                        zzetVar5.zzh(0);
                        this.zzg.zzc(zzetVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzet zzetVar6 = this.zza;
                if (zzf(zzetVar, zzetVar6.zzi(), 7)) {
                    this.zzo = zzafx.zze(zzetVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
    }
}
