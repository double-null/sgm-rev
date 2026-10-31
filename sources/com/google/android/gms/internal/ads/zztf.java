package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zztf {
    private boolean zzA;
    private long zzB;
    private final zzte zza;
    private final zzdo zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzsg zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zztf(zzte zzteVar, zzdo zzdoVar, AudioTrack audioTrack, int i10, int i11, int i12) {
        this.zza = zzteVar;
        this.zzb = zzdoVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzsg(audioTrack, zzteVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zZzD = zzfl.zzD(i10);
        this.zzg = zZzD;
        this.zzf = zZzD ? zzfl.zzt(i12 / i11, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j10) {
        long j11 = this.zzj;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        long jZzy = zzfl.zzy(j10 - j11, this.zzi);
        zzdo zzdoVar = this.zzb;
        long jZza = zzdoVar.zza() - zzfl.zzr(jZzy);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(jZza);
    }

    private final long zzh(long j10) {
        long jZzx;
        if (this.zzt == 0) {
            jZzx = this.zzu != -9223372036854775807L ? zzfl.zzt(zzl(), this.zze) : zzj();
        } else {
            jZzx = zzfl.zzx(j10 + this.zzk, this.zzi);
        }
        long jMax = Math.max(0L, jZzx - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfl.zzt(this.zzx, this.zze), jMax) : jMax;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfl.zzt(zzk(), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return Math.min(this.zzx, zzl());
        }
        long jZzb = this.zzb.zzb();
        if (jZzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                    this.zzv = -9223372036854775807L;
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (this.zzv == -9223372036854775807L) {
                    this.zzv = jZzb;
                }
            }
            this.zzp = jZzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfl.zzu(zzfl.zzx(zzfl.zzs(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a7, blocks: (B:22:0x007b, B:24:0x009f), top: B:56:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    public final long zza() {
        long j10;
        boolean z10;
        Method method;
        long jMax;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzb.zzc() / 1000;
            if (jZzc - this.zzl >= 30000) {
                long jZzj = zzj();
                if (jZzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfl.zzy(jZzj, this.zzi) - jZzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i10 = this.zzt;
                    if (i10 < 10) {
                        this.zzt = i10 + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = this.zzt;
                        if (i11 >= i12) {
                            break;
                        }
                        this.zzk += jArr[i11] / ((long) i12);
                        i11++;
                    }
                    j10 = this.zzn;
                    if (this.zzg && (method = this.zzm) != null && jZzc - this.zzo >= 500000) {
                        try {
                            Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                            String str = zzfl.zza;
                            long jIntValue = (((long) num.intValue()) * 1000) - this.zzf;
                            this.zzn = jIntValue;
                            jMax = Math.max(jIntValue, 0L);
                            this.zzn = jMax;
                            if (jMax > 10000000) {
                                this.zza.zza(jMax);
                                this.zzn = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzm = null;
                        }
                        this.zzo = jZzc;
                    }
                    if (j10 != this.zzn) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.zzh.zza(jZzc, this.zzi, zzh(jZzc), z10);
                }
            } else {
                j10 = this.zzn;
                if (this.zzg) {
                    Integer num2 = (Integer) method.invoke(audioTrack, new Object[0]);
                    String str2 = zzfl.zza;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.zzf;
                    this.zzn = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.zzn = jMax;
                    if (jMax > 10000000) {
                        this.zza.zza(jMax);
                        this.zzn = 0L;
                    }
                    this.zzo = jZzc;
                }
                if (j10 != this.zzn) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.zzh.zza(jZzc, this.zzi, zzh(jZzc), z10);
            }
        }
        long jZzc2 = this.zzb.zzc() / 1000;
        zzsg zzsgVar = this.zzh;
        boolean zZzb = zzsgVar.zzb();
        long jZze = zZzb ? zzsgVar.zze(jZzc2, this.zzi) : zzh(jZzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zZzb || !zzsgVar.zzc()) {
                zzg(jZze);
            }
            long j11 = this.zzz;
            if (j11 != -9223372036854775807L) {
                long j12 = jZze - this.zzy;
                long jZzx = zzfl.zzx(jZzc2 - j11, this.zzi);
                long j13 = this.zzy + jZzx;
                long jAbs = Math.abs(j13 - jZze);
                if (j12 != 0 && jAbs < 1000000) {
                    long j14 = (jZzx * 10) / 100;
                    jZze = Math.max(j13 - j14, Math.min(jZze, j13 + j14));
                }
            }
            this.zzz = jZzc2;
            this.zzy = jZze;
        } else if (playState == 1) {
            zzg(jZze);
            return jZze;
        }
        return jZze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfl.zzs(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j10) {
        return this.zzv != -9223372036854775807L && j10 > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j10) {
        this.zzw = zzk();
        this.zzu = zzfl.zzs(this.zzb.zzb());
        this.zzx = j10;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
