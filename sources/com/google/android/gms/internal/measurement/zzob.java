package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzob extends zzoc {
    private final long zza;

    zzob(String str, String str2, zzph zzphVar, long j10) {
        super("com.google.android.gms.measurement", str2, zzphVar);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* synthetic */ Object zza() {
        return Long.valueOf(this.zza);
    }
}
