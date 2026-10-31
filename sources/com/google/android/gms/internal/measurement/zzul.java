package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzul implements i {
    final /* synthetic */ zzut zza;
    private List zzb;

    /* synthetic */ zzul(zzut zzutVar, byte[] bArr) {
        Objects.requireNonNull(zzutVar);
        this.zza = zzutVar;
    }

    @Override // com.google.common.util.concurrent.i
    public final ListenableFuture call() throws Exception {
        zzut zzutVar = this.zza;
        zzwi zzwiVarZza = zzutVar.zzi().zza("Initialize ".concat(String.valueOf(zzutVar.zze())), zzxd.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            synchronized (zzutVar.zzh()) {
                if (this.zzb == null) {
                    this.zzb = zzutVar.zzj();
                    zzutVar.zzk(Collections.emptyList());
                }
            }
            ArrayList arrayList = new ArrayList(this.zzb.size());
            zzus zzusVar = new zzus(this.zza, null);
            Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((j) it.next()).apply(zzusVar));
                } catch (Exception e10) {
                    arrayList.add(x.f(e10));
                }
            }
            ListenableFuture listenableFutureA = x.o(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.measurement.zzuk
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zza();
                    return null;
                }
            }, g0.a());
            zzwiVarZza.zza(listenableFutureA);
            zzwiVarZza.close();
            return listenableFutureA;
        } catch (Throwable th) {
            try {
                zzwiVarZza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final /* synthetic */ Object zza() {
        synchronized (this.zza.zzh()) {
            this.zzb = null;
        }
        return null;
    }
}
