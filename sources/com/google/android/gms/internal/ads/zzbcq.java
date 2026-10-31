package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbcq extends zzbdf {
    private final zzbav zzh;
    private final long zzi;
    private final long zzj;

    public zzbcq(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11, zzbav zzbavVar, long j10, long j11) {
        super(zzbbsVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", zzaxmVar, i10, 11);
        this.zzh = zzbavVar;
        this.zzi = j10;
        this.zzj = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzbav zzbavVar = this.zzh;
        if (zzbavVar != null) {
            zzbat zzbatVar = new zzbat((String) this.zze.invoke(null, zzbavVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzaxm zzaxmVar = this.zzd;
            synchronized (zzaxmVar) {
                zzaxmVar.zzf(zzbatVar.zza.longValue());
                if (zzbatVar.zzb.longValue() >= 0) {
                    zzaxmVar.zzW(zzbatVar.zzb.longValue());
                }
                if (zzbatVar.zzc.longValue() >= 0) {
                    zzaxmVar.zzX(zzbatVar.zzc.longValue());
                }
            }
        }
    }
}
