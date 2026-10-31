package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhog {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhoh zzc = zzhoh.zzd;

    private zzhog() {
    }

    public final zzhog zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhog zzb(int i10) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40);
        sb2.append("Invalid tag size for AesCmacParameters: ");
        sb2.append(i10);
        throw new GeneralSecurityException(sb2.toString());
    }

    public final zzhog zzc(zzhoh zzhohVar) {
        this.zzc = zzhohVar;
        return this;
    }

    public final zzhoi zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhoi(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    /* synthetic */ zzhog(byte[] bArr) {
    }
}
