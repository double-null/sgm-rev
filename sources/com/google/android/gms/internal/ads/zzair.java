package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzair implements zzafy {
    private zzagb zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaix zzg;
    private zzafz zzh;
    private zzahg zzi;
    private zzamc zzj;
    private final zzet zza = new zzet(2);
    private long zzf = -1;

    private final int zzh(zzafz zzafzVar) throws IOException {
        zzet zzetVar = this.zza;
        zzetVar.zza(2);
        ((zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, 2, false);
        return zzetVar.zzt();
    }

    private final int zzi(zzafz zzafzVar) throws IOException {
        zzet zzetVar = this.zza;
        zzetVar.zza(2);
        zzafzVar.zzi(zzetVar.zzi(), 0, 2);
        return zzetVar.zzt() - 2;
    }

    private final void zzj() {
        zzagb zzagbVar = this.zzb;
        zzagbVar.getClass();
        zzagbVar.zzv();
        this.zzb.zzw(new zzaha(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        int iZzi;
        if (zzh(zzafzVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzafzVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzafzVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzafp) zzafzVar).zzj(iZzi, false);
                } else {
                    zzet zzetVar = this.zza;
                    zzetVar.zza(iZzi);
                    ((zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, iZzi, false);
                    if (!Objects.equals(zzetVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") ? false : zzaiu.zzb(zzetVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzb = zzagbVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        int i10;
        String strZzM;
        zzait zzaitVarZza;
        zzaix zzaixVar;
        long j10;
        int i11 = this.zzc;
        boolean z10 = true;
        boolean z11 = false;
        if (i11 == 0) {
            zzet zzetVar = this.zza;
            zzetVar.zza(2);
            zzafzVar.zzc(zzetVar.zzi(), 0, 2);
            int iZzt = zzetVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzj();
                return 0;
            }
            if ((iZzt >= 65488 && iZzt <= 65497) || iZzt == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i11 == 1) {
            this.zze = zzi(zzafzVar);
            zzafzVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzafzVar != this.zzh) {
                    this.zzh = zzafzVar;
                    this.zzi = new zzahg(zzafzVar, this.zzf);
                }
                zzamc zzamcVar = this.zzj;
                zzamcVar.getClass();
                int iZzd = zzamcVar.zzd(this.zzi, zzagyVar);
                if (iZzd == 1) {
                    zzagyVar.zza += this.zzf;
                }
                return iZzd;
            }
            long jZzn = zzafzVar.zzn();
            long j11 = this.zzf;
            if (jZzn != j11) {
                zzagyVar.zza = j11;
                return 1;
            }
            if (zzafzVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzafzVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzamc(zzanj.zza, 8);
                }
                zzahg zzahgVar = new zzahg(zzafzVar, this.zzf);
                this.zzi = zzahgVar;
                if (this.zzj.zza(zzahgVar)) {
                    zzamc zzamcVar2 = this.zzj;
                    long j12 = this.zzf;
                    zzagb zzagbVar = this.zzb;
                    zzagbVar.getClass();
                    zzamcVar2.zzc(new zzahi(j12, zzagbVar));
                    zzaix zzaixVar2 = this.zzg;
                    zzaixVar2.getClass();
                    zzagb zzagbVar2 = this.zzb;
                    zzagbVar2.getClass();
                    zzahk zzahkVarZzu = zzagbVar2.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/jpeg");
                    zztVar.zzl(new zzap(-9223372036854775807L, zzaixVar2));
                    zzahkVarZzu.zzA(zztVar.zzO());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzet zzetVar2 = new zzet(this.zze);
            zzafzVar.zzc(zzetVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzetVar2.zzM((char) 0)) && (strZzM = zzetVar2.zzM((char) 0)) != null) {
                long jZzo = zzafzVar.zzo();
                if (jZzo == -1 || (zzaitVarZza = zzaiu.zza(strZzM)) == null) {
                    zzaixVar = null;
                } else {
                    List list = zzaitVarZza.zzb;
                    if (list.size() < 2) {
                        zzaixVar = null;
                    } else {
                        int size = list.size() - 1;
                        long j13 = -1;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        while (size >= 0) {
                            zzais zzaisVar = (zzais) list.get(size);
                            String str = zzaisVar.zza;
                            boolean z12 = (str.equals("video/mp4") || str.equals("video/quicktime")) ? z10 : z11;
                            if (size == 0) {
                                jZzo -= zzaisVar.zzc;
                                j10 = 0;
                            } else {
                                j10 = jZzo - zzaisVar.zzb;
                            }
                            long j17 = jZzo;
                            jZzo = j10;
                            if (z12 && jZzo != j17) {
                                j16 = j17 - jZzo;
                                j15 = jZzo;
                            }
                            if (size == 0) {
                                j14 = j17;
                            }
                            if (size == 0) {
                                j13 = jZzo;
                            }
                            size--;
                            z10 = true;
                            z11 = false;
                        }
                        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
                            zzaixVar = null;
                        } else {
                            zzaixVar = new zzaix(j13, j14, zzaitVarZza.zza, j15, j16);
                        }
                    }
                }
                this.zzg = zzaixVar;
                if (zzaixVar != null) {
                    this.zzf = zzaixVar.zzd;
                }
            } else {
                i10 = 0;
            }
            this.zzc = i10;
            return i10;
        }
        zzafzVar.zzf(this.zze);
        i10 = 0;
        this.zzc = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzamc zzamcVar = this.zzj;
            zzamcVar.getClass();
            zzamcVar.zze(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
