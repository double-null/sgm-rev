package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbdf implements Callable {
    protected final zzbbs zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzaxm zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbdf(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        this.zza = zzbbsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaxmVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            zzbbs zzbbsVar = this.zza;
            Method methodZzo = zzbbsVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo == null) {
                return null;
            }
            zza();
            zzbaj zzbajVarZzh = zzbbsVar.zzh();
            if (zzbajVarZzh == null || (i10 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzbajVarZzh.zza(this.zzg, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
