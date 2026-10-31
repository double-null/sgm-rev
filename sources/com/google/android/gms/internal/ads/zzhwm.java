package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhwm extends zzhxi {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhwl zzd;
    private final zzhwk zze;

    /* synthetic */ zzhwm(int i10, BigInteger bigInteger, zzhwl zzhwlVar, zzhwk zzhwkVar, byte[] bArr) {
        this.zzb = i10;
        this.zzc = bigInteger;
        this.zzd = zzhwlVar;
        this.zze = zzhwkVar;
    }

    public static zzhwj zzb() {
        return new zzhwj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwm)) {
            return false;
        }
        zzhwm zzhwmVar = (zzhwm) obj;
        return zzhwmVar.zzb == this.zzb && Objects.equals(zzhwmVar.zzc, this.zzc) && zzhwmVar.zzd == this.zzd && zzhwmVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhwm.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhwk zzhwkVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhwkVar);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i10).length() + 13);
        sb2.append("RSA SSA PKCS1 Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzd != zzhwl.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhwl zze() {
        return this.zzd;
    }

    public final zzhwk zzf() {
        return this.zze;
    }
}
