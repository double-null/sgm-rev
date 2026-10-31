package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzayq extends zziee implements zzifq {
    private static final zzayq zzc;
    private static volatile zzifx zzd;
    private zziep zza = zziee.zzbE();
    private zziep zzb = zziee.zzbE();

    static {
        zzayq zzayqVar = new zzayq();
        zzc = zzayqVar;
        zziee.zzbu(zzayq.class, zzayqVar);
    }

    private zzayq() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzc, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzayq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayp(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzidzVar = zzd;
        if (zzidzVar == null) {
            synchronized (zzayq.class) {
                zzidzVar = zzd;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzc);
                    zzd = zzidzVar;
                }
            }
        }
        return zzidzVar;
    }
}
