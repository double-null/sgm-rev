package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzsf {
    private final AudioTrack zza;
    private final AudioTimestamp zzb = new AudioTimestamp();
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzsf(AudioTrack audioTrack) {
        this.zza = audioTrack;
    }

    public final boolean zza() {
        AudioTrack audioTrack = this.zza;
        AudioTimestamp audioTimestamp = this.zzb;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j10 = audioTimestamp.framePosition;
            if (this.zzd > j10) {
                this.zzc++;
            }
            this.zzd = j10;
            this.zze = j10 + this.zzf + (this.zzc << 32);
        }
        return timestamp;
    }

    public final long zzb() {
        return this.zzb.nanoTime / 1000;
    }

    public final long zzc() {
        return this.zze;
    }
}
