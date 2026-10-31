package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhwy extends zzhxi {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhwx zzd;
    private final zzhww zze;
    private final zzhww zzf;
    private final int zzg;

    /* synthetic */ zzhwy(int i10, BigInteger bigInteger, zzhwx zzhwxVar, zzhww zzhwwVar, zzhww zzhwwVar2, int i11, byte[] bArr) {
        this.zzb = i10;
        this.zzc = bigInteger;
        this.zzd = zzhwxVar;
        this.zze = zzhwwVar;
        this.zzf = zzhwwVar2;
        this.zzg = i11;
    }

    public static zzhwv zzb() {
        return new zzhwv(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwy)) {
            return false;
        }
        zzhwy zzhwyVar = (zzhwy) obj;
        return zzhwyVar.zzb == this.zzb && Objects.equals(zzhwyVar.zzc, this.zzc) && Objects.equals(zzhwyVar.zzd, this.zzd) && Objects.equals(zzhwyVar.zze, this.zze) && Objects.equals(zzhwyVar.zzf, this.zzf) && zzhwyVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzhwy.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhww zzhwwVar = this.zzf;
        zzhww zzhwwVar2 = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhwwVar2);
        String strValueOf3 = String.valueOf(zzhwwVar);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.zzg;
        int length4 = String.valueOf(i10).length();
        int length5 = strValueOf4.length();
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i11).length() + 13);
        sb2.append("RSA SSA PSS Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", signature hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(strValueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i10);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf4);
        sb2.append(", and ");
        sb2.append(i11);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzd != zzhwx.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhwx zze() {
        return this.zzd;
    }

    public final zzhww zzf() {
        return this.zze;
    }

    public final zzhww zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}
