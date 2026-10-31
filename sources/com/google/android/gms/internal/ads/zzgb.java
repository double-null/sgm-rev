package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgb implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgb(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgb)) {
            return false;
        }
        zzgb zzgbVar = (zzgb) obj;
        return this.zza == zzgbVar.zza && this.zzb == zzgbVar.zzb && this.zzc == zzgbVar.zzc;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j12).length());
        sb2.append("Mp4Timestamp: creation time=");
        sb2.append(j10);
        sb2.append(", modification time=");
        sb2.append(j11);
        sb2.append(", timescale=");
        sb2.append(j12);
        return sb2.toString();
    }
}
