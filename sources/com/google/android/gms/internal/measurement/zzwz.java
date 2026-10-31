package com.google.android.gms.internal.measurement;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwz implements Runnable {
    final /* synthetic */ h0 zza;
    final /* synthetic */ zzws zzb;
    final /* synthetic */ Runnable zzc;

    zzwz(h0 h0Var, zzws zzwsVar, Runnable runnable) {
        this.zza = h0Var;
        this.zzb = zzwsVar;
        this.zzc = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (((zzxe) this.zza.f21514a) != null) {
            throw null;
        }
        zzws zzwsVar = this.zzb;
        t.d(zzwsVar, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        Runnable runnable = this.zzc;
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVarZzc = zzvy.zzc(zzwqVarZzd, zzwsVar);
        try {
            runnable.run();
            g0 g0Var = g0.f27756a;
            zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
        } catch (Throwable th) {
            try {
                zzvu.zza(th);
                throw th;
            } catch (Throwable th2) {
                zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
                throw th2;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.zzc;
        StringBuilder sb2 = new StringBuilder(runnable.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(runnable);
        sb2.append("]");
        return sb2.toString();
    }
}
