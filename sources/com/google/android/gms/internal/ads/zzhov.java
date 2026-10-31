package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhov extends zzhoy {
    private final int zza;
    private final int zzb;
    private final zzhou zzc;
    private final zzhot zzd;

    /* synthetic */ zzhov(int i10, int i11, zzhou zzhouVar, zzhot zzhotVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhouVar;
        this.zzd = zzhotVar;
    }

    public static zzhos zzb() {
        return new zzhos(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhov)) {
            return false;
        }
        zzhov zzhovVar = (zzhov) obj;
        return zzhovVar.zza == this.zza && zzhovVar.zze() == zze() && zzhovVar.zzc == this.zzc && zzhovVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhov.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhot zzhotVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhotVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i10 = this.zzb;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("HMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzc != zzhou.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhou zzhouVar = this.zzc;
        if (zzhouVar == zzhou.zzd) {
            return this.zzb;
        }
        if (zzhouVar == zzhou.zza || zzhouVar == zzhou.zzb || zzhouVar == zzhou.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhou zzf() {
        return this.zzc;
    }

    public final zzhot zzg() {
        return this.zzd;
    }
}
