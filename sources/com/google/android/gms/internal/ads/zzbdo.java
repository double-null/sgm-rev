package com.google.android.gms.internal.ads;

import io.bidmachine.analytics.internal.s.bOI.CwEo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbdo extends zziee implements zzifq {
    private static final zzbdo zzc;
    private static volatile zzifx zzd;
    private int zza;
    private zzawq zzb;

    static {
        zzbdo zzbdoVar = new zzbdo();
        zzc = zzbdoVar;
        zziee.zzbu(zzbdo.class, zzbdoVar);
    }

    private zzbdo() {
    }

    public static zzbdn zza() {
        return (zzbdn) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzawq zzawqVar) {
        zzawqVar.getClass();
        this.zzb = zzawqVar;
        this.zza |= 1;
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
                                    synchronized (zzbdo.class) {
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
                    return new zzbdn(bArr);
                }
                return new zzbdo();
            }
            return zziee.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{CwEo.XpSDOyfU, "zzb"});
        }
        return (byte) 1;
    }
}
