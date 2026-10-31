package com.google.android.gms.internal.ads;

import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhsd extends zziee implements zzifq {
    private static final zzhsd zze;
    private static volatile zzifx zzf;
    private int zza;
    private int zzb;
    private zzida zzc = zzida.zza;
    private zzhsf zzd;

    static {
        zzhsd zzhsdVar = new zzhsd();
        zze = zzhsdVar;
        zziee.zzbu(zzhsd.class, zzhsdVar);
    }

    private zzhsd() {
    }

    public static zzhsd zzd(zzida zzidaVar, zzido zzidoVar) throws zziet {
        return (zzhsd) zziee.zzbT(zze, zzidaVar, zzidoVar);
    }

    public static zzhsc zze() {
        return (zzhsc) zze.zzbn();
    }

    public static zzifx zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzida zzb() {
        return this.zzc;
    }

    public final zzhsf zzc() {
        zzhsf zzhsfVar = this.zzd;
        return zzhsfVar == null ? zzhsf.zze() : zzhsfVar;
    }

    final /* synthetic */ void zzh(zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzc = zzidaVar;
    }

    final /* synthetic */ void zzi(zzhsf zzhsfVar) {
        zzhsfVar.getClass();
        this.zzd = zzhsfVar;
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
                                zzifx zzidzVar = zzf;
                                if (zzidzVar == null) {
                                    synchronized (zzhsd.class) {
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
                    return new zzhsc(bArr);
                }
                return new zzhsd();
            }
            return zziee.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", UyXgnuLGEkgnZE.GFOfgYkVjguWV, "zzc", "zzd"});
        }
        return (byte) 1;
    }
}
