package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaij implements zzafy {
    private zzagb zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaih zzo;
    private zzain zzp;
    private final zzet zza = new zzet(4);
    private final zzet zzb = new zzet(9);
    private final zzet zzc = new zzet(11);
    private final zzet zzd = new zzet();
    private final zzaik zze = new zzaik();
    private int zzg = 1;

    static {
        int i10 = zzaii.zza;
    }

    private final zzet zzh(zzafz zzafzVar) throws IOException {
        zzet zzetVar = this.zzd;
        if (this.zzl > zzetVar.zzj()) {
            int iZzj = zzetVar.zzj();
            zzetVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzetVar.zzh(0);
        }
        zzetVar.zzf(this.zzl);
        zzafzVar.zzc(zzetVar.zzi(), 0, this.zzl);
        return zzetVar;
    }

    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzaha(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        zzet zzetVar = this.zza;
        zzafp zzafpVar = (zzafp) zzafzVar;
        zzafpVar.zzh(zzetVar.zzi(), 0, 3, false);
        zzetVar.zzh(0);
        if (zzetVar.zzx() != 4607062) {
            return false;
        }
        zzafpVar.zzh(zzetVar.zzi(), 0, 2, false);
        zzetVar.zzh(0);
        if ((zzetVar.zzt() & 250) != 0) {
            return false;
        }
        zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
        zzetVar.zzh(0);
        int iZzB = zzetVar.zzB();
        zzafzVar.zzl();
        zzafp zzafpVar2 = (zzafp) zzafzVar;
        zzafpVar2.zzj(iZzB, false);
        zzafpVar2.zzh(zzetVar.zzi(), 0, 4, false);
        zzetVar.zzh(0);
        return zzetVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzf = zzagbVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        long j10;
        boolean zZzf;
        boolean z10;
        long j11;
        this.zzf.getClass();
        while (true) {
            int i10 = this.zzg;
            int i11 = 8;
            boolean z11 = false;
            if (i10 == 1) {
                zzet zzetVar = this.zzb;
                if (zzafzVar.zzb(zzetVar.zzi(), 0, 9, true)) {
                    zzetVar.zzh(0);
                    zzetVar.zzk(4);
                    int iZzs = zzetVar.zzs();
                    int i12 = iZzs & 4;
                    int i13 = iZzs & 1;
                    if (i12 != 0 && this.zzo == null) {
                        this.zzo = new zzaih(this.zzf.zzu(8, 1));
                    }
                    if (i13 != 0 && this.zzp == null) {
                        this.zzp = new zzain(this.zzf.zzu(9, 2));
                    }
                    this.zzf.zzv();
                    this.zzj = zzetVar.zzB() - 5;
                    this.zzg = 2;
                    z11 = true;
                }
                if (!z11) {
                    return -1;
                }
            } else if (i10 == 2) {
                zzafzVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i10 == 3) {
                zzet zzetVar2 = this.zzc;
                if (zzafzVar.zzb(zzetVar2.zzi(), 0, 11, true)) {
                    zzetVar2.zzh(0);
                    this.zzk = zzetVar2.zzs();
                    this.zzl = zzetVar2.zzx();
                    this.zzm = zzetVar2.zzx();
                    this.zzm = (((long) (zzetVar2.zzs() << 24)) | this.zzm) * 1000;
                    zzetVar2.zzk(3);
                    this.zzg = 4;
                    z11 = true;
                }
                if (!z11) {
                    return -1;
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                if (this.zzh) {
                    j10 = this.zzi + this.zzm;
                } else {
                    j10 = this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                }
                int i14 = this.zzk;
                if (i14 == 8) {
                    if (this.zzo != null) {
                        zzi();
                        zZzf = this.zzo.zzf(zzh(zzafzVar), j10);
                    }
                    z10 = true;
                    if (!this.zzh && zZzf) {
                        this.zzh = true;
                        if (this.zze.zzc() == -9223372036854775807L) {
                            j11 = -this.zzm;
                        } else {
                            j11 = 0;
                        }
                        this.zzi = j11;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (z10) {
                        return 0;
                    }
                } else {
                    i11 = i14;
                }
                if (i11 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        zZzf = this.zzp.zzf(zzh(zzafzVar), j10);
                        z10 = true;
                    } else {
                        zzafzVar.zzf(this.zzl);
                        zZzf = false;
                        z10 = false;
                    }
                } else if (i11 != 18 || this.zzn) {
                    zzafzVar.zzf(this.zzl);
                    zZzf = false;
                    z10 = false;
                } else {
                    zzaik zzaikVar = this.zze;
                    zZzf = zzaikVar.zzf(zzh(zzafzVar), j10);
                    long jZzc = zzaikVar.zzc();
                    if (jZzc != -9223372036854775807L) {
                        this.zzf.zzw(new zzagu(zzaikVar.zze(), zzaikVar.zzd(), jZzc));
                        this.zzn = true;
                    }
                    z10 = true;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    if (this.zze.zzc() == -9223372036854775807L) {
                        j11 = -this.zzm;
                    } else {
                        j11 = 0;
                    }
                    this.zzi = j11;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (z10) {
                    return 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
