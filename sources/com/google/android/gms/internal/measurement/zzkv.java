package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.l0;
import com.google.common.util.concurrent.x;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkv extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ l0 zzc;
    final /* synthetic */ i zzd;
    final /* synthetic */ Executor zze;

    zzkv(AtomicBoolean atomicBoolean, Context context, l0 l0Var, i iVar, Executor executor) {
        this.zza = atomicBoolean;
        this.zzb = context;
        this.zzc = l0Var;
        this.zzd = iVar;
        this.zze = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zza.compareAndSet(false, true)) {
            zzky.zzh(this.zzb, this);
            this.zzc.setFuture(x.k(this.zzd, this.zze));
        }
    }
}
