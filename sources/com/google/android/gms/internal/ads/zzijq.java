package com.google.android.gms.internal.ads;

import io.bidmachine.analytics.internal.s.bOI.CwEo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzijq extends zziee implements zzifq {
    private static final zzijq zzf;
    private static volatile zzifx zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzijq zzijqVar = new zzijq();
        zzf = zzijqVar;
        zziee.zzbu(zzijq.class, zzijqVar);
    }

    private zzijq() {
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
                                zzifx zzidzVar = zzg;
                                if (zzidzVar == null) {
                                    synchronized (zzijq.class) {
                                        zzidzVar = zzg;
                                        if (zzidzVar == null) {
                                            zzidzVar = new zzidz(zzf);
                                            zzg = zzidzVar;
                                        }
                                    }
                                }
                                return zzidzVar;
                            }
                            throw null;
                        }
                        return zzf;
                    }
                    return new zzijo(bArr);
                }
                return new zzijq();
            }
            return zziee.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zzijp.zza, "zzc", CwEo.nVwgsuiQeqfZp, "zze"});
        }
        return (byte) 1;
    }
}
