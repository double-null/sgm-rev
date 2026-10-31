package com.google.android.gms.internal.ads;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhqs extends zziee implements zzifq {
    private static final zzhqs zzd;
    private static volatile zzifx zze;
    private int zza;
    private zzhqw zzb;
    private zzhsl zzc;

    static {
        zzhqs zzhqsVar = new zzhqs();
        zzd = zzhqsVar;
        zziee.zzbu(zzhqs.class, zzhqsVar);
    }

    private zzhqs() {
    }

    public static zzhqs zzc(zzida zzidaVar, zzido zzidoVar) throws zziet {
        return (zzhqs) zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static zzhqr zzd() {
        return (zzhqr) zzd.zzbn();
    }

    public final zzhqw zza() {
        zzhqw zzhqwVar = this.zzb;
        return zzhqwVar == null ? zzhqw.zzd() : zzhqwVar;
    }

    public final zzhsl zzb() {
        zzhsl zzhslVar = this.zzc;
        return zzhslVar == null ? zzhsl.zzg() : zzhslVar;
    }

    final /* synthetic */ void zze(zzhqw zzhqwVar) {
        zzhqwVar.getClass();
        this.zzb = zzhqwVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhsl zzhslVar) {
        zzhslVar.getClass();
        this.zzc = zzhslVar;
        this.zza |= 2;
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
                                zzifx zzidzVar = zze;
                                if (zzidzVar == null) {
                                    synchronized (zzhqs.class) {
                                        zzidzVar = zze;
                                        if (zzidzVar == null) {
                                            zzidzVar = new zzidz(zzd);
                                            zze = zzidzVar;
                                        }
                                    }
                                }
                                return zzidzVar;
                            }
                            throw null;
                        }
                        return zzd;
                    }
                    return new zzhqr(bArr);
                }
                return new zzhqs();
            }
            return zziee.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{ljglrLUdGZhMhQ.ERsOnB, "zzb", "zzc"});
        }
        return (byte) 1;
    }
}
