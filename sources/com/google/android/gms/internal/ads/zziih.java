package com.google.android.gms.internal.ads;

import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zziih extends zziee implements zzifq {
    private static final zziih zzy;
    private static volatile zzifx zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd;
    private zzieq zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzieq zzo;
    private boolean zzp;
    private long zzu;
    private zziem zzv;
    private boolean zzw;
    private zziem zzx;

    static {
        zziih zziihVar = new zziih();
        zzy = zziihVar;
        zziee.zzbu(zziih.class, zziihVar);
    }

    private zziih() {
        String str = KBBdKxoAiHo.fTgQbmZ;
        this.zzd = str;
        this.zze = zziee.zzbM();
        this.zzj = str;
        this.zzo = zziee.zzbM();
        this.zzv = zziee.zzbC();
        this.zzx = zziee.zzbC();
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
                                zzifx zzidzVar = zzz;
                                if (zzidzVar == null) {
                                    synchronized (zziih.class) {
                                        zzidzVar = zzz;
                                        if (zzidzVar == null) {
                                            zzidzVar = new zzidz(zzy);
                                            zzz = zzidzVar;
                                        }
                                    }
                                }
                                return zzidzVar;
                            }
                            throw null;
                        }
                        return zzy;
                    }
                    return new zziia(bArr);
                }
                return new zziih();
            }
            return zziee.zzbv(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", zziig.zza, "zzc", "zzd", "zze", "zzf", zziie.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", ykDFMuXDQMaR.FIlaHLVjHhS, zziid.class, "zzp", "zzu", "zzv", zzihv.zza(), "zzw", "zzx", zziif.zza});
        }
        return (byte) 1;
    }
}
