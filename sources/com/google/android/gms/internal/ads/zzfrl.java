package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfrl extends zziee implements zzifq {
    private static final zzfrl zze;
    private static volatile zzifx zzf;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzfrl zzfrlVar = new zzfrl();
        zze = zzfrlVar;
        zziee.zzbu(zzfrl.class, zzfrlVar);
    }

    private zzfrl() {
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
                                    synchronized (zzfrl.class) {
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
                    return new zzfrk(bArr);
                }
                return new zzfrl();
            }
            return zziee.zzbv(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zza", RHIpdOnfgiYkEj.WeYkxg, "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
