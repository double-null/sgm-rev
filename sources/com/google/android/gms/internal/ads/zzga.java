package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzga implements zzao {
    public final float zza;
    public final float zzb;

    public zzga(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzgtj.zzb(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzga.class == obj.getClass()) {
            zzga zzgaVar = (zzga) obj;
            if (this.zza == zzgaVar.zza && this.zzb == zzgaVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + 527) * 31) + Float.hashCode(this.zzb);
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        float f11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }
}
