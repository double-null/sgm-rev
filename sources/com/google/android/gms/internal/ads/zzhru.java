package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhru extends zziee implements zzifq {
    private static final zzhru zzd;
    private static volatile zzifx zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhru zzhruVar = new zzhru();
        zzd = zzhruVar;
        zziee.zzbu(zzhru.class, zzhruVar);
    }

    private zzhru() {
    }

    public static zzhrt zzb() {
        return (zzhrt) zzd.zzbn();
    }

    public static zzhru zzc() {
        return zzd;
    }

    public final zzhsh zza() {
        zzhsh zzhshVarZzb = zzhsh.zzb(this.zza);
        return zzhshVarZzb == null ? zzhsh.UNRECOGNIZED : zzhshVarZzb;
    }

    final /* synthetic */ void zzd(zzhsh zzhshVar) {
        this.zza = zzhshVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhru();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrt(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzidzVar = zze;
        if (zzidzVar == null) {
            synchronized (zzhru.class) {
                zzidzVar = zze;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzd);
                    zze = zzidzVar;
                }
            }
        }
        return zzidzVar;
    }

    public final int zzg() {
        int i10 = this.zzb;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 == 2) {
                i11 = 4;
            } else if (i10 == 3) {
                i11 = 5;
            } else if (i10 != 4) {
                i11 = i10 != 5 ? 0 : 7;
            } else {
                i11 = 6;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzh() {
        int i10 = this.zzc;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                i11 = i10 != 2 ? 0 : 4;
            } else {
                i11 = 3;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zzb = zzhsg.zza(i10);
    }

    final /* synthetic */ void zzj(int i10) {
        this.zzc = zzhrz.zza(i10);
    }
}
