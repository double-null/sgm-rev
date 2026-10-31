package com.google.android.gms.internal.ads;

import be.LNO.fzLzfW;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzilq extends zziee implements zzifq {
    private static final zzilq zzl;
    private static volatile zzifx zzm;
    private int zza;
    private long zzd;
    private zzils zzi;
    private zzilu zzj;
    private zzibd zzk;
    private zzida zzb = zzida.zza;
    private zziem zzc = zziee.zzbC();
    private zziem zze = zziee.zzbC();
    private zzieq zzf = zziee.zzbM();
    private String zzg = "";
    private zzieq zzh = zziee.zzbM();

    static {
        zzilq zzilqVar = new zzilq();
        zzl = zzilqVar;
        zziee.zzbu(zzilq.class, zzilqVar);
    }

    private zzilq() {
    }

    public static zzilq zzc(byte[] bArr, zzido zzidoVar) throws zziet {
        return (zzilq) zziee.zzbV(zzl, bArr, zzidoVar);
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
                                zzifx zzidzVar = zzm;
                                if (zzidzVar == null) {
                                    synchronized (zzilq.class) {
                                        zzidzVar = zzm;
                                        if (zzidzVar == null) {
                                            zzidzVar = new zzidz(zzl);
                                            zzm = zzidzVar;
                                        }
                                    }
                                }
                                return zzidzVar;
                            }
                            throw null;
                        }
                        return zzl;
                    }
                    return new zzilp(bArr);
                }
                return new zzilq();
            }
            return zziee.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", fzLzfW.OSZtEHFren, "zzd", "zze", "zzh", zzilf.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        return (byte) 1;
    }
}
