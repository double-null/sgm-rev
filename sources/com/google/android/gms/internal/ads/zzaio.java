package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaio implements zzafy {
    private zzagb zzb;
    private zzaix zzc;
    private zzafz zzd;
    private zzahg zze;
    private zzamc zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzet zza = new zzet(16);
    private long zzk = -1;
    private int zzg = 0;

    private final void zzh() {
        zzagb zzagbVar = this.zzb;
        zzagbVar.getClass();
        zzagbVar.zzv();
        this.zzb.zzw(new zzaha(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        int i10;
        zzet zzetVar = new zzet(16);
        boolean z10 = true;
        while (true) {
            zzetVar.zza(8);
            if (!zzafzVar.zzh(zzetVar.zzi(), 0, 8, true)) {
                break;
            }
            long jZzz = zzetVar.zzz();
            int iZzB = zzetVar.zzB();
            if (jZzz != 1) {
                i10 = 8;
            } else {
                if (!zzafzVar.zzh(zzetVar.zzi(), 8, 8, true)) {
                    break;
                }
                jZzz = zzetVar.zzJ();
                i10 = 16;
            }
            long j10 = i10;
            if (jZzz < j10) {
                break;
            }
            int i11 = (int) (jZzz - j10);
            if (z10) {
                if (iZzB != 1718909296 || i11 < 8) {
                    break;
                }
                zzetVar.zza(4);
                zzafp zzafpVar = (zzafp) zzafzVar;
                zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
                if (zzetVar.zzB() != 1751476579) {
                    break;
                }
                zzafpVar.zzj(i11 - 4, false);
            } else {
                if (iZzB == 1836086884) {
                    return true;
                }
                if (i11 != 0) {
                    ((zzafp) zzafzVar).zzj(i11, false);
                }
            }
            z10 = false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzb = zzagbVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        long jZzJ;
        while (true) {
            int i10 = this.zzg;
            boolean z10 = false;
            if (i10 == 0) {
                if (this.zzj == 0) {
                    zzet zzetVar = this.zza;
                    if (zzafzVar.zzb(zzetVar.zzi(), 0, 8, true)) {
                        this.zzj = 8;
                        zzetVar.zzh(0);
                        this.zzi = zzetVar.zzz();
                        this.zzh = zzetVar.zzB();
                        jZzJ = this.zzi;
                        if (jZzJ == 1) {
                            zzet zzetVar2 = this.zza;
                            zzafzVar.zzc(zzetVar2.zzi(), 8, 8);
                            this.zzj += 8;
                            jZzJ = zzetVar2.zzJ();
                            this.zzi = jZzJ;
                        }
                        if (this.zzh == 1836086884) {
                            long jZzn = zzafzVar.zzn();
                            this.zzk = jZzn;
                            long j10 = this.zzj;
                            zzaix zzaixVar = new zzaix(0L, jZzn - j10, -9223372036854775807L, jZzn, jZzJ - j10);
                            this.zzc = zzaixVar;
                            zzagb zzagbVar = this.zzb;
                            zzagbVar.getClass();
                            zzahk zzahkVarZzu = zzagbVar.zzu(1024, 4);
                            zzt zztVar = new zzt();
                            zztVar.zzn("image/heic");
                            zztVar.zzl(new zzap(-9223372036854775807L, zzaixVar));
                            zzahkVarZzu.zzA(zztVar.zzO());
                            this.zzg = 2;
                        } else {
                            this.zzg = 1;
                        }
                        z10 = true;
                    }
                } else {
                    jZzJ = this.zzi;
                    if (jZzJ == 1) {
                        zzet zzetVar3 = this.zza;
                        zzafzVar.zzc(zzetVar3.zzi(), 8, 8);
                        this.zzj += 8;
                        jZzJ = zzetVar3.zzJ();
                        this.zzi = jZzJ;
                    }
                    if (this.zzh == 1836086884) {
                        long jZzn2 = zzafzVar.zzn();
                        this.zzk = jZzn2;
                        long j11 = this.zzj;
                        zzaix zzaixVar2 = new zzaix(0L, jZzn2 - j11, -9223372036854775807L, jZzn2, jZzJ - j11);
                        this.zzc = zzaixVar2;
                        zzagb zzagbVar2 = this.zzb;
                        zzagbVar2.getClass();
                        zzahk zzahkVarZzu2 = zzagbVar2.zzu(1024, 4);
                        zzt zztVar2 = new zzt();
                        zztVar2.zzn("image/heic");
                        zztVar2.zzl(new zzap(-9223372036854775807L, zzaixVar2));
                        zzahkVarZzu2.zzA(zztVar2.zzO());
                        this.zzg = 2;
                    } else {
                        this.zzg = 1;
                    }
                    z10 = true;
                }
                if (!z10) {
                    zzh();
                    return -1;
                }
            } else if (i10 == 1) {
                zzafzVar.zzf((int) (this.zzi - ((long) this.zzj)));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzafzVar != this.zzd) {
                        this.zzd = zzafzVar;
                        this.zze = new zzahg(zzafzVar, this.zzk);
                    }
                    zzamc zzamcVar = this.zzf;
                    zzamcVar.getClass();
                    int iZzd = zzamcVar.zzd(this.zze, zzagyVar);
                    if (iZzd == 1) {
                        zzagyVar.zza += this.zzk;
                    }
                    return iZzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzamc(zzanj.zza, 8);
                }
                zzahg zzahgVar = new zzahg(zzafzVar, this.zzk);
                this.zze = zzahgVar;
                if (this.zzf.zza(zzahgVar)) {
                    zzamc zzamcVar2 = this.zzf;
                    long j12 = this.zzk;
                    zzagb zzagbVar3 = this.zzb;
                    zzagbVar3.getClass();
                    zzamcVar2.zzc(new zzahi(j12, zzagbVar3));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        if (j10 != 0) {
            if (this.zzg == 3) {
                zzamc zzamcVar = this.zzf;
                zzamcVar.getClass();
                zzamcVar.zze(j10, j11);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }
}
