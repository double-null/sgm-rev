package com.google.android.gms.internal.measurement;

import com.google.common.base.g;
import com.google.common.base.u;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.x;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzut {
    private final String zza;
    private final ListenableFuture zzb;
    private final zzuv zzc;
    private final zzvm zze;
    private final zzvm zzf = new zzvm(new zzul(this, null), g0.a());
    private final Object zzg = new Object();
    private List zzi = new ArrayList();
    private final q zzd = q.d();
    private final zzwb zzh = zzwb.zzb();

    zzut(zzuv zzuvVar, zzvc zzvcVar, ListenableFuture listenableFuture, boolean z10, String str) {
        this.zzc = zzuvVar;
        this.zzb = listenableFuture;
        this.zza = zzuvVar.zzc();
        final zzui zzuiVar = (zzui) zzuvVar;
        this.zze = new zzvm(new i() { // from class: com.google.android.gms.internal.measurement.zzuh
            @Override // com.google.common.util.concurrent.i
            public final /* synthetic */ ListenableFuture call() {
                return zzuiVar.zzd();
            }
        }, g0.a());
        zza(new j() { // from class: com.google.android.gms.internal.measurement.zzuq
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzc((zzth) obj);
            }
        });
    }

    public final void zza(j jVar) {
        synchronized (this.zzg) {
            this.zzi.add(jVar);
        }
    }

    public final ListenableFuture zzb(final g gVar, final Executor executor) {
        final j jVarZzc = zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzuo
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return x.g(gVar.apply(obj));
            }
        });
        u.c(zzxh.zza());
        zzwi zzwiVarZza = this.zzh.zza("Update ".concat(String.valueOf(this.zza)), zzxd.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            final ListenableFuture listenableFutureZza = this.zzf.zza();
            q qVar = this.zzd;
            qVar.f(new i() { // from class: com.google.android.gms.internal.measurement.zzum
                @Override // com.google.common.util.concurrent.i
                public final /* synthetic */ ListenableFuture call() {
                    return listenableFutureZza;
                }
            }, g0.a());
            ListenableFuture listenableFutureF = qVar.f(zzxa.zzb(new i() { // from class: com.google.android.gms.internal.measurement.zzun
                @Override // com.google.common.util.concurrent.i
                public final /* synthetic */ ListenableFuture call() {
                    final zzut zzutVar = this.zza;
                    final j jVar = jVarZzc;
                    final Executor executor2 = executor;
                    return x.m(listenableFutureZza, zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzup
                        @Override // com.google.common.util.concurrent.j
                        public final /* synthetic */ ListenableFuture apply(Object obj) {
                            return zzutVar.zzd(jVar, executor2, obj);
                        }
                    }), g0.a());
                }
            }), g0.a());
            x.propagateCancellation(listenableFutureF, listenableFutureZza);
            x.i(this.zzb);
            ListenableFuture listenableFutureZza2 = zzuy.zza(listenableFutureF);
            zzwiVarZza.zza(listenableFutureZza2);
            zzwiVarZza.close();
            return listenableFutureZza2;
        } catch (Throwable th) {
            try {
                zzwiVarZza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final /* synthetic */ ListenableFuture zzc(zzth zzthVar) {
        return this.zze.zza();
    }

    final /* synthetic */ ListenableFuture zzd(j jVar, Executor executor, Object obj) {
        return this.zzc.zzb(jVar, executor, null);
    }

    final /* synthetic */ String zze() {
        return this.zza;
    }

    final /* synthetic */ zzuv zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzvm zzg() {
        return this.zze;
    }

    final /* synthetic */ Object zzh() {
        return this.zzg;
    }

    final /* synthetic */ zzwb zzi() {
        return this.zzh;
    }

    final /* synthetic */ List zzj() {
        return this.zzi;
    }

    final /* synthetic */ void zzk(List list) {
        this.zzi = list;
    }
}
