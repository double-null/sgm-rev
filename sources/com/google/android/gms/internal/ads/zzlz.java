package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlz {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlz() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzlz zza(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzlz zzb(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzgtj.zza(z10);
        this.zzb = f10;
        return this;
    }

    public final zzlz zzc(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzgtj.zza(z10);
        this.zzc = j10;
        return this;
    }

    public final zzma zzd() {
        return new zzma(this, null);
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ float zzf() {
        return this.zzb;
    }

    final /* synthetic */ long zzg() {
        return this.zzc;
    }

    /* synthetic */ zzlz(zzma zzmaVar, byte[] bArr) {
        this.zza = zzmaVar.zza;
        this.zzb = zzmaVar.zzb;
        this.zzc = zzmaVar.zzc;
    }
}
