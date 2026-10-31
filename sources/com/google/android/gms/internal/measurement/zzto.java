package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzto implements j {
    public static final /* synthetic */ int zza = 0;
    private final List zzb;
    private final Executor zzc;

    private zzto(List list, Executor executor) {
        this.zzb = list;
        this.zzc = executor;
    }

    public static zzto zza(List list, Executor executor) {
        return new zzto(list, executor);
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ ListenableFuture apply(Object obj) throws Exception {
        List list = this.zzb;
        zzth zzthVar = (zzth) obj;
        final int size = list.size();
        final ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zztj) it.next()).zza());
        }
        return x.m(zzthVar.zza(zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zztn
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj2) {
                return this.zza.zzb(arrayList, size, (zzafc) obj2);
            }
        }), g0.a()), zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zztk
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj2) {
                return this.zza.zzc(size, arrayList, obj2);
            }
        }), g0.a());
    }

    final /* synthetic */ ListenableFuture zzb(final List list, final int i10, final zzafc zzafcVar) {
        return x.n(list).b(zzxa.zzb(new i() { // from class: com.google.android.gms.internal.measurement.zztl
            @Override // com.google.common.util.concurrent.i
            public final /* synthetic */ ListenableFuture call() {
                return this.zza.zzd(zzafcVar, i10, list);
            }
        }), this.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(int i10, List list, Object obj) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) x.d((Future) list.get(i11))).booleanValue()) {
                arrayList.add(((zztj) this.zzb.get(i11)).zzb());
            }
        }
        return x.o(arrayList).a(l.c(null), g0.a());
    }

    final /* synthetic */ ListenableFuture zzd(zzafc zzafcVar, int i10, List list) {
        ListenableFuture listenableFutureG = x.g(zzafcVar);
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) x.d((Future) list.get(i11))).booleanValue()) {
                final zztj zztjVar = (zztj) this.zzb.get(i11);
                listenableFutureG = x.m(listenableFutureG, zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zztm
                    @Override // com.google.common.util.concurrent.j
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        return zztjVar.zzc();
                    }
                }), g0.a());
            }
        }
        return listenableFutureG;
    }
}
