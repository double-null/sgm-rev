package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhwz {
    private zzhxc zza = null;
    private zziba zzb = null;
    private zziba zzc = null;
    private zziba zzd = null;
    private zziba zze = null;
    private zziba zzf = null;
    private zziba zzg = null;

    private zzhwz() {
    }

    public final zzhwz zza(zzhxc zzhxcVar) {
        this.zza = zzhxcVar;
        return this;
    }

    public final zzhwz zzb(zziba zzibaVar, zziba zzibaVar2) {
        this.zzc = zzibaVar;
        this.zzd = zzibaVar2;
        return this;
    }

    public final zzhwz zzc(zziba zzibaVar) {
        this.zzb = zzibaVar;
        return this;
    }

    public final zzhwz zzd(zziba zzibaVar, zziba zzibaVar2) {
        this.zze = zzibaVar;
        this.zzf = zzibaVar2;
        return this;
    }

    public final zzhwz zze(zziba zzibaVar) {
        this.zzg = zzibaVar;
        return this;
    }

    public final zzhxa zzf() throws GeneralSecurityException {
        zzhxc zzhxcVar = this.zza;
        if (zzhxcVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerZzd = zzhxcVar.zzf().zzd();
        BigInteger bigIntegerZzd2 = this.zza.zzd();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzhdo.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzhdo.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzhdo.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzhdo.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzhdo.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzhdo.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(bigInteger);
        if (!bigIntegerZzd.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(bigInteger)) {
            return new zzhxa(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    /* synthetic */ zzhwz(byte[] bArr) {
    }
}
