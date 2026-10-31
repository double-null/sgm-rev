package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhlr {
    private final zziaz zza;
    private final Class zzb;

    /* synthetic */ zzhlr(zziaz zziazVar, Class cls, byte[] bArr) {
        this.zza = zziazVar;
        this.zzb = cls;
    }

    public static zzhlr zzd(zzhlq zzhlqVar, zziaz zziazVar, Class cls) {
        return new zzhlp(zziazVar, cls, zzhlqVar);
    }

    public abstract zzhdq zza(zzhns zzhnsVar, zzhel zzhelVar) throws GeneralSecurityException;

    public final zziaz zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
