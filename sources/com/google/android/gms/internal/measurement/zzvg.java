package com.google.android.gms.internal.measurement;

import com.google.common.base.p;
import com.google.common.util.concurrent.i;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvg implements Runnable {
    private i zza;
    private Executor zzb;

    zzvg(i iVar, Executor executor) {
        this.zza = (i) p.l(iVar);
        this.zzb = (Executor) p.l(executor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza = null;
        this.zzb = null;
    }

    final /* synthetic */ i zza() {
        return this.zza;
    }

    final /* synthetic */ Executor zzb() {
        return this.zzb;
    }
}
