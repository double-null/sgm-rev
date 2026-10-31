package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.network.converters.vY.vgmm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzijd extends zziee implements zzifq {
    private static final zzijd zzi;
    private static volatile zzifx zzj;
    private int zza;
    private zzijc zzb;
    private zzida zzd;
    private zzida zze;
    private int zzf;
    private zzida zzg;
    private byte zzh = 2;
    private zzieq zzc = zziee.zzbM();

    static {
        zzijd zzijdVar = new zzijd();
        zzi = zzijdVar;
        zziee.zzbu(zzijd.class, zzijdVar);
    }

    private zzijd() {
        zzida zzidaVar = zzida.zza;
        this.zzd = zzidaVar;
        this.zze = zzidaVar;
        this.zzg = zzidaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        byte b10 = 1;
        byte[] bArr = null;
        switch (zziedVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b10 = 0;
                }
                this.zzh = b10;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziee.zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{vgmm.vYwEfoKfiEesQgw, "zzb", "zzc", zziiv.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzijd();
            case zze:
                return new zzija(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzifx zzidzVar = zzj;
                if (zzidzVar == null) {
                    synchronized (zzijd.class) {
                        zzidzVar = zzj;
                        if (zzidzVar == null) {
                            zzidzVar = new zzidz(zzi);
                            zzj = zzidzVar;
                        }
                        break;
                    }
                }
                return zzidzVar;
            default:
                throw null;
        }
    }
}
