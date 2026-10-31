package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.j;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwy implements j {
    final /* synthetic */ zzws zza;
    final /* synthetic */ j zzb;

    zzwy(zzws zzwsVar, j jVar) {
        this.zza = zzwsVar;
        this.zzb = jVar;
    }

    @Override // com.google.common.util.concurrent.j
    public final ListenableFuture apply(Object obj) {
        zzws zzwsVar = this.zza;
        t.c(zzwsVar);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVarZzc = zzvy.zzc(zzwqVarZzd, zzwsVar);
        try {
            ListenableFuture listenableFutureApply = this.zzb.apply(obj);
            if (listenableFutureApply == null) {
                throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            }
            zzvy.zzc(zzwqVarZzd, zzwsVarZzc);
            return listenableFutureApply;
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
        j jVar = this.zzb;
        StringBuilder sb2 = new StringBuilder(jVar.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(jVar);
        sb2.append("]");
        return sb2.toString();
    }
}
