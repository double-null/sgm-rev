package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.i;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwx implements i {
    final /* synthetic */ zzws zza;
    final /* synthetic */ i zzb;

    zzwx(zzws zzwsVar, i iVar) {
        this.zza = zzwsVar;
        this.zzb = iVar;
    }

    @Override // com.google.common.util.concurrent.i
    public final ListenableFuture call() {
        zzws zzwsVar = this.zza;
        t.c(zzwsVar);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVarZzc = zzvy.zzc(zzwqVarZzd, zzwsVar);
        try {
            ListenableFuture listenableFutureCall = this.zzb.call();
            zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
            t.e(listenableFutureCall, "wrapInTrace(...)");
            return listenableFutureCall;
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
        i iVar = this.zzb;
        StringBuilder sb2 = new StringBuilder(iVar.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(iVar);
        sb2.append("]");
        return sb2.toString();
    }
}
