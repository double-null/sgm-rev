package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzilx extends zziee implements zzifq {
    private static final zzilx zze;
    private static volatile zzifx zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        zzilx zzilxVar = new zzilx();
        zze = zzilxVar;
        zziee.zzbu(zzilx.class, zzilxVar);
    }

    private zzilx() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    byte[] bArr = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                zzifx zzidzVar = zzf;
                                if (zzidzVar == null) {
                                    synchronized (zzilx.class) {
                                        zzidzVar = zzf;
                                        if (zzidzVar == null) {
                                            zzidzVar = new zzidz(zze);
                                            zzf = zzidzVar;
                                        }
                                    }
                                }
                                return zzidzVar;
                            }
                            throw null;
                        }
                        return zze;
                    }
                    return new zzilw(bArr);
                }
                return new zzilx();
            }
            return zziee.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", zzima.zza, RHIpdOnfgiYkEj.wKrEyDSOzlgUi});
        }
        return (byte) 1;
    }
}
