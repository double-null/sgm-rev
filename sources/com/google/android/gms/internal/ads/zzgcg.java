package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgcg {
    private final String zza;
    private final long zzb;

    public zzgcg() {
        this.zza = null;
        this.zzb = -1L;
    }

    public final String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }

    public zzgcg(String str, long j10) {
        this.zza = str;
        this.zzb = j10;
    }
}
