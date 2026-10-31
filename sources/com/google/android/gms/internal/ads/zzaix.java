package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaix implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaix(long j10, long j11, long j12, long j13, long j14) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaix.class == obj.getClass()) {
            zzaix zzaixVar = (zzaix) obj;
            if (this.zza == zzaixVar.zza && this.zzb == zzaixVar.zzb && this.zzc == zzaixVar.zzc && this.zzd == zzaixVar.zzd && this.zze == zzaixVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc)) * 31) + Long.hashCode(this.zzd)) * 31) + Long.hashCode(this.zze);
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        long j11 = this.zzb;
        int length2 = String.valueOf(j11).length();
        long j12 = this.zzc;
        int length3 = String.valueOf(j12).length();
        long j13 = this.zzd;
        int length4 = String.valueOf(j13).length();
        long j14 = this.zze;
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j14).length());
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j10);
        sb2.append(", photoSize=");
        sb2.append(j11);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j12);
        sb2.append(", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }
}
