package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhoi extends zzhoy {
    private final int zza;
    private final int zzb;
    private final zzhoh zzc;

    /* synthetic */ zzhoi(int i10, int i11, zzhoh zzhohVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhohVar;
    }

    public static zzhog zzb() {
        return new zzhog(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhoi)) {
            return false;
        }
        zzhoi zzhoiVar = (zzhoi) obj;
        return zzhoiVar.zza == this.zza && zzhoiVar.zze() == zze() && zzhoiVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhoi.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzc != zzhoh.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhoh zzhohVar = this.zzc;
        if (zzhohVar == zzhoh.zzd) {
            return this.zzb;
        }
        if (zzhohVar == zzhoh.zza || zzhohVar == zzhoh.zzb || zzhohVar == zzhoh.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhoh zzf() {
        return this.zzc;
    }
}
