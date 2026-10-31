package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzsg {
    private final zzsf zza;
    private final int zzb;
    private final zzte zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzsg(AudioTrack audioTrack, zzte zzteVar) {
        this.zza = new zzsf(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzteVar;
        zzf(0);
    }

    private final void zzf(int i10) {
        this.zzd = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.zzf = 10000L;
                return;
            }
            j10 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j10;
    }

    private final long zzg(long j10, float f10) {
        zzsf zzsfVar = this.zza;
        return zzh(zzsfVar.zzc(), zzsfVar.zzb(), j10, f10);
    }

    private final long zzh(long j10, long j11, long j12, float f10) {
        return zzfl.zzt(j10, this.zzb) + zzfl.zzx(j12 - j11, f10);
    }

    public final void zza(long j10, float f10, long j11, boolean z10) {
        boolean z11;
        if (z10 || j10 - this.zzg >= this.zzf) {
            this.zzg = j10;
            zzsf zzsfVar = this.zza;
            boolean zZza = zzsfVar.zza();
            if (zZza) {
                long jZzb = zzsfVar.zzb();
                long jZzg = zzg(j10, f10);
                if (Math.abs(jZzb - j10) > 5000000) {
                    zzte zzteVar = this.zzc;
                    long jZzc = zzsfVar.zzc();
                    long jZzs = ((zzsr) zzteVar).zza.zzs();
                    int length = String.valueOf(jZzc).length();
                    int length2 = String.valueOf(jZzb).length();
                    int length3 = String.valueOf(j10).length();
                    int length4 = length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j11).length() + 2;
                    z11 = zZza;
                    StringBuilder sb2 = new StringBuilder(length4 + String.valueOf(jZzs).length());
                    sb2.append("Spurious audio timestamp (system clock mismatch): ");
                    sb2.append(jZzc);
                    sb2.append(", ");
                    sb2.append(jZzb);
                    sb2.append(", ");
                    sb2.append(j10);
                    sb2.append(", ");
                    sb2.append(j11);
                    sb2.append(", ");
                    sb2.append(jZzs);
                    zzeg.zzc("AudioTrackAudioOutput", sb2.toString());
                    zzf(4);
                } else {
                    z11 = zZza;
                    if (Math.abs(jZzg - j11) > 5000000) {
                        zzte zzteVar2 = this.zzc;
                        long jZzc2 = zzsfVar.zzc();
                        long jZzs2 = ((zzsr) zzteVar2).zza.zzs();
                        int length5 = String.valueOf(jZzc2).length();
                        int length6 = String.valueOf(jZzb).length();
                        int length7 = String.valueOf(j10).length();
                        StringBuilder sb3 = new StringBuilder(length5 + 54 + length6 + 2 + length7 + 2 + String.valueOf(j11).length() + 2 + String.valueOf(jZzs2).length());
                        sb3.append("Spurious audio timestamp (frame position mismatch): ");
                        sb3.append(jZzc2);
                        sb3.append(", ");
                        sb3.append(jZzb);
                        sb3.append(", ");
                        sb3.append(j10);
                        sb3.append(", ");
                        sb3.append(j11);
                        sb3.append(", ");
                        sb3.append(jZzs2);
                        zzeg.zzc("AudioTrackAudioOutput", sb3.toString());
                        zzf(4);
                    } else if (this.zzd == 4) {
                        zzf(0);
                    }
                }
            } else {
                z11 = zZza;
            }
            int i10 = this.zzd;
            if (i10 == 0) {
                if (!z11) {
                    if (j10 - this.zze > 500000) {
                        zzf(3);
                        return;
                    }
                    return;
                } else {
                    if (zzsfVar.zzb() >= this.zze) {
                        this.zzh = zzsfVar.zzc();
                        this.zzi = zzsfVar.zzb();
                        zzf(1);
                        return;
                    }
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    if (z11) {
                        return;
                    }
                    zzf(0);
                    return;
                } else {
                    if (i10 == 3 && z11) {
                        zzf(0);
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                zzf(0);
                return;
            }
            long jZzc3 = zzsfVar.zzc();
            long j12 = this.zzh;
            if (jZzc3 > j12) {
                if (Math.abs(zzg(j10, f10) - zzh(j12, this.zzi, j10, f10)) < 1000) {
                    zzf(2);
                    return;
                }
            }
            if (j10 - this.zze > 2000000) {
                zzf(3);
            } else {
                this.zzh = zzsfVar.zzc();
                this.zzi = zzsfVar.zzb();
            }
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i10 = this.zzd;
        return i10 == 0 || i10 == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j10, float f10) {
        return zzg(j10, f10);
    }
}
