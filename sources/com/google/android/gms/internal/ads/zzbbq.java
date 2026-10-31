package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbbq implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbbs zzb;

    zzbbq(zzbbs zzbbsVar, int i10, boolean z10) {
        this.zza = i10;
        Objects.requireNonNull(zzbbsVar);
        this.zzb = zzbbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaym zzaymVarZza;
        int i10 = this.zza;
        zzbbs zzbbsVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbbsVar.zza;
            zzaymVarZza = zzfxn.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzaymVarZza = null;
        }
        zzbbs zzbbsVar2 = this.zzb;
        zzbbsVar2.zzs(zzaymVarZza);
        int i11 = this.zza;
        if (i11 < 4) {
            if (zzaymVarZza != null && zzaymVarZza.zza() && !zzaymVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaymVarZza.zzg() && zzaymVarZza.zzh().zza() && zzaymVarZza.zzh().zzb() != -2) {
                return;
            }
            zzbbsVar2.zzp(i11 + 1, true);
        }
    }
}
