package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhwp {
    private zzhwm zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzhwp() {
    }

    public final zzhwp zza(zzhwm zzhwmVar) {
        this.zza = zzhwmVar;
        return this;
    }

    public final zzhwp zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhwp zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhwq zzd() throws GeneralSecurityException {
        zziaz zziazVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length());
            sb2.append("Got modulus size ");
            sb2.append(iBitLength);
            sb2.append(", but parameters requires modulus size ");
            sb2.append(iZzc);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhwl.zzd) {
            zziazVarZza = zzhms.zza;
        } else if (this.zza.zze() == zzhwl.zzc || this.zza.zze() == zzhwl.zzb) {
            zziazVarZza = zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhwl.zza) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zziazVarZza = zzhms.zzb(this.zzc.intValue());
        }
        return new zzhwq(this.zza, this.zzb, zziazVarZza, this.zzc, null);
    }

    /* synthetic */ zzhwp(byte[] bArr) {
    }
}
