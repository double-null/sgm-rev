package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhow {
    static {
        int i10 = zzhto.zza;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhpa.zzc();
        zzhok.zzc();
        zzhor.zza(true);
        if (zzhks.zza()) {
            return;
        }
        zzhof.zza(true);
    }
}
