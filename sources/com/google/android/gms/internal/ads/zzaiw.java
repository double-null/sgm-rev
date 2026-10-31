package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaiw implements zzaiv {
    private final long zza;
    private final String zzb;

    public zzaiw(long j10, long j11, String str) {
        this.zza = j10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaiw.class == obj.getClass()) {
            zzaiw zzaiwVar = (zzaiw) obj;
            if (this.zza == zzaiwVar.zza && Objects.equals(this.zzb, zzaiwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(-9223372036854775807L)) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        long j10 = this.zza;
        Object objValueOf = j10 == -9223372036854775807L ? "UNSET" : Long.valueOf(j10);
        String str = this.zzb;
        String string = objValueOf.toString();
        int length = string.length();
        String strConcat = ", title=".concat(str);
        StringBuilder sb2 = new StringBuilder(length + 21 + strConcat.length());
        sb2.append(RHIpdOnfgiYkEj.GRpy);
        sb2.append(string);
        sb2.append("");
        sb2.append(strConcat);
        return sb2.toString();
    }
}
