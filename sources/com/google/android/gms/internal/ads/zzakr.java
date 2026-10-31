package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakr implements zzao {
    public final float zza;
    public final zzakq zzb;
    public final zzakq zzc;

    private zzakr(float f10, zzakq zzakqVar, zzakq zzakqVar2) {
        this.zza = f10;
        this.zzb = zzakqVar;
        this.zzc = zzakqVar2;
    }

    public static zzakr zzb(float f10, int i10, int i11) {
        zzakq zzakqVarZza = zzakq.zza(i10);
        zzakq zzakqVarZza2 = zzakq.zza(i11);
        if (f10 <= 0.0f && zzakqVarZza == null && zzakqVarZza2 == null) {
            return null;
        }
        return new zzakr(f10, zzakqVarZza, zzakqVarZza2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakr)) {
            return false;
        }
        zzakr zzakrVar = (zzakr) obj;
        return Float.compare(this.zza, zzakrVar.zza) == 0 && Objects.equals(this.zzb, zzakrVar.zzb) && Objects.equals(this.zzc, zzakrVar.zzc);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.zza) * 31;
        zzakq zzakqVar = this.zzb;
        int iHashCode2 = (iHashCode + (zzakqVar != null ? zzakqVar.hashCode() : 0)) * 31;
        zzakq zzakqVar2 = this.zzc;
        return iHashCode2 + (zzakqVar2 != null ? zzakqVar2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        StringBuilder sb2 = new StringBuilder(length + 37 + strValueOf.length() + 10 + strValueOf2.length());
        sb2.append("ReplayGain Xing/Info: peak=");
        sb2.append(f10);
        sb2.append(", field 1=");
        sb2.append(strValueOf);
        sb2.append(", field 2=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
