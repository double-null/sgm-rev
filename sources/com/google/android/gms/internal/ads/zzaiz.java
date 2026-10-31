package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaiz implements zzao {
    public final long zza;

    public zzaiz(long j10) {
        this.zza = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzaiz.class == obj.getClass() && this.zza == ((zzaiz) obj).zza;
    }

    public final int hashCode() {
        return Long.hashCode(this.zza) + 527;
    }

    public final String toString() {
        long j10 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j10);
        return sb2.toString();
    }
}
