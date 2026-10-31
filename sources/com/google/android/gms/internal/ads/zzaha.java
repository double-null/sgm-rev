package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzaha implements zzahb {
    private final long zza;
    private final zzagz zzb;

    public zzaha(long j10, long j11) {
        this.zza = j10;
        zzahc zzahcVar = j11 == 0 ? zzahc.zza : new zzahc(0L, j11);
        this.zzb = new zzagz(zzahcVar, zzahcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        return this.zzb;
    }
}
