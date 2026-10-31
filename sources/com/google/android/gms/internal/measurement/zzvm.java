package com.google.android.gms.internal.measurement;

import com.applovin.impl.sdk.i0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.l0;
import com.google.common.util.concurrent.x;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzvm {
    private final zzvg zza;
    private final AtomicLong zzb = new AtomicLong(zzi(Integer.MIN_VALUE, Integer.MIN_VALUE));
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(null);
    private final Executor zze = g0.c(g0.a());
    private final l0 zzf;

    public zzvm(i iVar, Executor executor) {
        l0 l0VarA = l0.a();
        this.zzf = l0VarA;
        zzvg zzvgVar = new zzvg(iVar, executor);
        this.zza = zzvgVar;
        l0VarA.addListener(zzvgVar, g0.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture zzd(int i10) {
        AtomicReference atomicReference;
        zzvl zzvlVar;
        Executor executorZzb;
        AtomicLong atomicLong = this.zzb;
        if (((int) (atomicLong.get() >>> 32)) > i10) {
            return x.e();
        }
        zzvl zzvlVar2 = new zzvl(i10);
        do {
            atomicReference = this.zzc;
            zzvlVar = (zzvl) atomicReference.get();
            if (zzvlVar != null && zzvlVar.zza() > i10) {
                return x.e();
            }
        } while (!i0.a(atomicReference, zzvlVar, zzvlVar2));
        if (((int) (atomicLong.get() >>> 32)) > i10) {
            zzvlVar2.cancel(true);
            i0.a(atomicReference, zzvlVar2, null);
            return zzvlVar2;
        }
        zzvg zzvgVar = this.zza;
        i iVarZza = zzvgVar.zza();
        if (iVarZza == null || (executorZzb = zzvgVar.zzb()) == null) {
            zzvlVar2.setFuture(this.zzf);
        } else {
            zzvlVar2.setFuture(x.k(zzxa.zzb(iVarZza), executorZzb));
        }
        return zzvlVar2;
    }

    private static long zzi(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (i10 << 32);
    }

    public final ListenableFuture zza() {
        AtomicLong atomicLong;
        long j10;
        final int i10;
        l0 l0Var = this.zzf;
        if (l0Var.isDone()) {
            return l0Var;
        }
        do {
            atomicLong = this.zzb;
            j10 = atomicLong.get();
            i10 = (int) (j10 >>> 32);
        } while (!atomicLong.compareAndSet(j10, zzi(i10, ((int) j10) + 1)));
        AtomicReference atomicReference = this.zzd;
        final l0 l0VarA = l0.a();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(l0VarA);
        l0VarA.setFuture(listenableFuture == null ? x.k(zzxa.zzb(new i() { // from class: com.google.android.gms.internal.measurement.zzvi
            @Override // com.google.common.util.concurrent.i
            public final /* synthetic */ ListenableFuture call() {
                return this.zza.zzd(i10);
            }
        }), g0.a()) : x.c(listenableFuture, Throwable.class, zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzvh
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzc(i10, (Throwable) obj);
            }
        }), this.zze));
        final zzvk zzvkVar = new zzvk(this, i10, null);
        l0VarA.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzvj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(l0VarA, zzvkVar);
            }
        }, g0.a());
        return zzvkVar;
    }

    final /* synthetic */ void zzb(l0 l0Var, zzvk zzvkVar) {
        try {
            Object objD = x.d(l0Var);
            l0 l0Var2 = this.zzf;
            l0Var2.set(objD);
            zzvkVar.setFuture(l0Var2);
        } catch (Throwable unused) {
            zzvkVar.setFuture(l0Var);
        }
    }

    final /* synthetic */ ListenableFuture zzc(int i10, Throwable th) {
        return zzd(i10);
    }

    final /* synthetic */ boolean zze() {
        AtomicLong atomicLong;
        long j10;
        int i10;
        int i11;
        boolean z10;
        do {
            atomicLong = this.zzb;
            j10 = atomicLong.get();
            i10 = (int) j10;
            long j11 = j10 >>> 32;
            if (i10 == Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 13);
                sb2.append("Refcount is: ");
                sb2.append(j10);
                throw new AssertionError(sb2.toString());
            }
            i11 = (int) j11;
            z10 = i10 == -2147483647;
            if (z10) {
                i11++;
            }
        } while (!atomicLong.compareAndSet(j10, zzi(i11, i10 - 1)));
        return z10;
    }

    final /* synthetic */ zzvg zzf() {
        return this.zza;
    }

    final /* synthetic */ AtomicReference zzg() {
        return this.zzc;
    }
}
