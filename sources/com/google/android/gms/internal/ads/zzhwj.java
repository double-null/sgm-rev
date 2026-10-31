package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhwj {
    private static final BigInteger zze;
    private static final BigInteger zzf;
    private Integer zza = null;
    private BigInteger zzb = zzhwm.zza;
    private zzhwk zzc = null;
    private zzhwl zzd = zzhwl.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zze = bigIntegerValueOf;
        zzf = bigIntegerValueOf.pow(UserVerificationMethods.USER_VERIFY_HANDPRINT);
    }

    private zzhwj() {
    }

    public final zzhwj zza(int i10) {
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhwj zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhwj zzc(zzhwl zzhwlVar) {
        this.zzd = zzhwlVar;
        return this;
    }

    public final zzhwj zzd(zzhwk zzhwkVar) {
        this.zzc = zzhwkVar;
        return this;
    }

    public final zzhwm zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.zza));
        }
        BigInteger bigInteger = this.zzb;
        int iCompareTo = bigInteger.compareTo(zzhwm.zza);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zze).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzf) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhwm(this.zza.intValue(), this.zzb, this.zzd, this.zzc, null);
    }

    /* synthetic */ zzhwj(byte[] bArr) {
    }
}
