package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbcj extends zzbdf {
    private final long zzh;

    public zzbcj(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, long j10, int i10, int i11) {
        super(zzbbsVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzaxmVar, i10, 25);
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzac(jLongValue);
            long j10 = this.zzh;
            if (j10 != 0) {
                zzaxmVar.zzk(jLongValue - j10);
                zzaxmVar.zzn(j10);
            }
        }
    }
}
