package com.google.android.gms.internal.ads;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhrg extends zziee implements zzifq {
    private static final zzhrg zzc;
    private static volatile zzifx zzd;
    private int zza;
    private zzida zzb = zzida.zza;

    static {
        zzhrg zzhrgVar = new zzhrg();
        zzc = zzhrgVar;
        zziee.zzbu(zzhrg.class, zzhrgVar);
    }

    private zzhrg() {
    }

    public static zzhrg zzc(zzida zzidaVar, zzido zzidoVar) throws zziet {
        return (zzhrg) zziee.zzbT(zzc, zzidaVar, zzidoVar);
    }

    public static zzhrf zzd() {
        return (zzhrf) zzc.zzbn();
    }

    public static zzifx zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzida zzb() {
        return this.zzb;
    }

    final /* synthetic */ void zzg(zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzb = zzidaVar;
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
                                zzifx zzidzVar = zzd;
                                if (zzidzVar == null) {
                                    synchronized (zzhrg.class) {
                                        zzidzVar = zzd;
                                        if (zzidzVar == null) {
                                            zzidzVar = new zzidz(zzc);
                                            zzd = zzidzVar;
                                        }
                                    }
                                }
                                return zzidzVar;
                            }
                            throw null;
                        }
                        return zzc;
                    }
                    return new zzhrf(bArr);
                }
                return new zzhrg();
            }
            return zziee.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", ljglrLUdGZhMhQ.zCLxPZ});
        }
        return (byte) 1;
    }
}
