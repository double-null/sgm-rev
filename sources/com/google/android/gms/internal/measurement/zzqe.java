package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;
import com.google.common.base.p;
import com.google.common.base.w;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.x;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqe {
    private final Context zza;
    private final w zzb;
    private final w zzc;
    private final w zzd;
    private volatile int zze = 0;
    private final CopyOnWriteArrayList zzf = new CopyOnWriteArrayList();
    private final Object zzg = new Object();
    private volatile ListenableFuture zzh = null;

    public zzqe(Context context, w wVar, w wVar2, w wVar3) {
        this.zza = context;
        this.zzb = wVar;
        this.zzc = wVar2;
        this.zzd = wVar3;
    }

    public final ListenableFuture zza(zzabz zzabzVar, boolean z10, zzqc zzqcVar) {
        final zzqm zzqmVar = (zzqm) this.zzc.get();
        if (zzqmVar == null && !z10) {
            return x.h();
        }
        int iZza = zzabzVar.zza();
        p.d(true);
        int i10 = 1 << iZza;
        if ((this.zze & i10) == 0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.zzf;
            synchronized (copyOnWriteArrayList) {
                int i11 = this.zze;
                if ((i11 & i10) == 0) {
                    copyOnWriteArrayList.add(zzqcVar);
                    this.zze = i10 | i11;
                }
            }
        }
        final ListenableFuture listenableFutureM = this.zzh;
        if (listenableFutureM == null) {
            synchronized (this.zzg) {
                listenableFutureM = this.zzh;
                if (listenableFutureM == null) {
                    if (zzqmVar == null) {
                        zzqmVar = zzqb.zza;
                    }
                    Context context = this.zza;
                    if (zzky.zzb(context)) {
                        zzpz zzpzVar = zzpz.zza;
                        w wVar = this.zzb;
                        listenableFutureM = x.m(zzky.zzd(context, Executors.callable(zzpzVar, null), (Executor) wVar.get()), new j() { // from class: com.google.android.gms.internal.measurement.zzqa
                            @Override // com.google.common.util.concurrent.j
                            public final /* synthetic */ ListenableFuture apply(Object obj) {
                                return this.zza.zzb(zzqmVar, (Void) obj);
                            }
                        }, (Executor) wVar.get());
                        this.zzh = listenableFutureM;
                    } else {
                        listenableFutureM = (ListenableFuture) p.l(((zzmj) this.zzd.get()).zze(new zzqd(this, zzqmVar)));
                        this.zzh = listenableFutureM;
                    }
                    listenableFutureM.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpy
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            try {
                                x.d(listenableFutureM);
                            } catch (Exception e10) {
                                Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e10);
                            }
                        }
                    }, (Executor) this.zzb.get());
                }
            }
        }
        return listenableFutureM;
    }

    final /* synthetic */ ListenableFuture zzb(zzqm zzqmVar, Void r10) {
        return (ListenableFuture) p.l(((zzmj) this.zzd.get()).zze(new zzqd(this, zzqmVar)));
    }

    final /* synthetic */ CopyOnWriteArrayList zzc() {
        return this.zzf;
    }
}
