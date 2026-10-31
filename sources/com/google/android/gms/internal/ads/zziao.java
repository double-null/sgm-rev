package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziao implements zzhqd {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public zziao(String str, Key key) throws GeneralSecurityException {
        byte b10;
        int i10;
        zzian zzianVar = new zzian(this);
        this.zza = zzianVar;
        if (!zzhkr.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b10 = 0;
                break;
            case "HMACSHA224":
                b10 = 1;
                break;
            case "HMACSHA256":
                b10 = 2;
                break;
            case "HMACSHA384":
                b10 = 3;
                break;
            case "HMACSHA512":
                b10 = 4;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            i10 = 20;
        } else if (b10 == 1) {
            i10 = 28;
        } else if (b10 == 2) {
            i10 = 32;
        } else if (b10 == 3) {
            i10 = 48;
        } else {
            if (b10 != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i10 = 64;
        }
        this.zzd = i10;
        zzianVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhqd
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.zza;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i10);
    }

    final /* synthetic */ String zzb() {
        return this.zzb;
    }

    final /* synthetic */ Key zzc() {
        return this.zzc;
    }
}
