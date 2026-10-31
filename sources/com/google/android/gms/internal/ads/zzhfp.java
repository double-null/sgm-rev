package com.google.android.gms.internal.ads;

import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhfp {
    private zzhfx zza = null;
    private zzibb zzb = null;
    private Integer zzc = null;

    private zzhfp() {
    }

    public final zzhfp zza(zzhfx zzhfxVar) {
        this.zza = zzhfxVar;
        return this;
    }

    public final zzhfp zzb(zzibb zzibbVar) {
        this.zzb = zzibbVar;
        return this;
    }

    public final zzhfp zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    /* synthetic */ zzhfp(byte[] bArr) {
    }

    public final zzhfq zzd() throws GeneralSecurityException {
        zzibb zzibbVar;
        zziaz zziazVarZzb;
        zzhfx zzhfxVar = this.zza;
        if (zzhfxVar == null || (zzibbVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhfxVar.zzc() != zzibbVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhfxVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException(WKirgUEJJ.VacjjCmkzedw);
        }
        if (this.zza.zzd() == zzhfw.zzc) {
            zziazVarZzb = zzhms.zza;
        } else if (this.zza.zzd() == zzhfw.zzb) {
            zziazVarZzb = zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhfw.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zziazVarZzb = zzhms.zzb(this.zzc.intValue());
        }
        return new zzhfq(this.zza, this.zzb, zziazVarZzb, this.zzc, null);
    }
}
