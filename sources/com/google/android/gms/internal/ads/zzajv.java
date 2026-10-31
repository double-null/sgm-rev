package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajv {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzajv(long j10, long j11, int i10) {
        zzgtj.zza(j10 < j11);
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajv.class == obj.getClass()) {
            zzajv zzajvVar = (zzajv) obj;
            if (this.zza == zzajvVar.zza && this.zzb == zzajvVar.zzb && this.zzc == zzajvVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)};
        String str = zzfl.zza;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
