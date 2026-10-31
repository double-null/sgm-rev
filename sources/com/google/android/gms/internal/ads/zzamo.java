package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzamo implements zzamv {
    private final zzamu zza;
    private final long zzb;
    private final long zzc;
    private final zzamz zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzamo(zzamz zzamzVar, long j10, long j11, long j12, long j13, boolean z10) {
        zzgtj.zza(j10 >= 0 && j11 > j10);
        this.zzd = zzamzVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 == j11 - j10 || z10) {
            this.zzf = j13;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzamu();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // com.google.android.gms.internal.ads.zzamv
    public final long zza(zzafz zzafzVar) throws IOException {
        long jMax;
        int i10 = this.zze;
        if (i10 == 0) {
            long jZzn = zzafzVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j10 = this.zzc - 65307;
            if (j10 > jZzn) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j11 = this.zzi;
                long j12 = this.zzj;
                if (j11 == j12) {
                    jMax = -1;
                } else {
                    long jZzn2 = zzafzVar.zzn();
                    zzamu zzamuVar = this.zza;
                    if (zzamuVar.zzb(zzafzVar, j12)) {
                        zzamuVar.zzc(zzafzVar, false);
                        zzafzVar.zzl();
                        long j13 = this.zzh;
                        long j14 = zzamuVar.zzb;
                        long j15 = j13 - j14;
                        int i11 = zzamuVar.zzd + zzamuVar.zze;
                        if (j15 < 0 || j15 >= 72000) {
                            if (j15 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j14;
                            } else {
                                this.zzi = ((long) i11) + zzafzVar.zzn();
                                this.zzk = j14;
                            }
                            long j16 = this.zzj;
                            long j17 = this.zzi;
                            long j18 = j16 - j17;
                            if (j18 < 100000) {
                                this.zzj = j17;
                                jMax = j17;
                            } else {
                                long j19 = i11;
                                long j20 = j15 <= 0 ? 2L : 1L;
                                String str = zzfl.zza;
                                jMax = Math.max(j17, Math.min((zzafzVar.zzn() - (j19 * j20)) + ((j15 * j18) / (this.zzl - this.zzk)), j16 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                if (jMax != -1) {
                    return jMax;
                }
                this.zze = 3;
            } else if (i10 != 3) {
                return -1L;
            }
            while (true) {
                zzamu zzamuVar2 = this.zza;
                zzamuVar2.zzb(zzafzVar, -1L);
                zzamuVar2.zzc(zzafzVar, false);
                if (zzamuVar2.zzb > this.zzh) {
                    zzafzVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                zzafzVar.zzf(zzamuVar2.zzd + zzamuVar2.zze);
                this.zzi = zzafzVar.zzn();
                this.zzk = zzamuVar2.zzb;
            }
        }
        zzamu zzamuVar3 = this.zza;
        zzamuVar3.zza();
        if (!zzamuVar3.zzb(zzafzVar, -1L)) {
            throw new EOFException();
        }
        zzamuVar3.zzc(zzafzVar, false);
        zzafzVar.zzf(zzamuVar3.zzd + zzamuVar3.zze);
        long j21 = zzamuVar3.zzb;
        while ((zzamuVar3.zza & 4) != 4 && zzamuVar3.zzb(zzafzVar, -1L) && zzafzVar.zzn() < this.zzc && zzamuVar3.zzc(zzafzVar, true) && zzagc.zzd(zzafzVar, zzamuVar3.zzd + zzamuVar3.zze)) {
            j21 = zzamuVar3.zzb;
        }
        this.zzf = j21;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(long j10) {
        long j11 = this.zzf - 1;
        String str = zzfl.zza;
        this.zzh = Math.max(0L, Math.min(j10, j11));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final /* bridge */ /* synthetic */ zzahb zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzamn(this, bArr);
        }
        return null;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ zzamz zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
