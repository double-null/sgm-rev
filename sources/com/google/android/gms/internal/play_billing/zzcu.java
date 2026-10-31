package com.google.android.gms.internal.play_billing;

import c2.YDwL.tFQWuE;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcu<V> extends zzcv<V> {

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzcv.zzc) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        zza(boolean z10, Throwable th) {
            this.zzc = z10;
            this.zzd = th;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    final class zzb<V> implements Runnable {
        final zzcu<V> zza;
        final zzdk<? extends V> zzb;

        zzb(zzcu zzcuVar, zzdk zzdkVar) {
            this.zza = zzcuVar;
            this.zzb = zzdkVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzcv.zzq(this.zza, this, zzcu.zzr(this.zzb))) {
                zzcu.zzu(this.zza, false);
            }
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.play_billing.zzcu.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    interface zze<V> extends zzdk<V> {
    }

    protected zzcu() {
    }

    static Object zzc(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((zza) obj).zzd);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzcv.zza) {
            return null;
        }
        return obj;
    }

    static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzr(zzdk zzdkVar) {
        Throwable thZze;
        if (zzdkVar instanceof zze) {
            Object zzaVar = ((zzcu) zzdkVar).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.zzc) {
                    Throwable th = zzaVar2.zzd;
                    zzaVar = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((zzdkVar instanceof zzdq) && (thZze = ((zzdq) zzdkVar).zze()) != null) {
            return new zzc(thZze);
        }
        boolean zIsCancelled = zzdkVar.isCancelled();
        if ((!zzcv.zzc) && zIsCancelled) {
            zza zzaVar3 = zza.zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzs = zzs(zzdkVar);
            if (!zIsCancelled) {
                return objZzs == null ? zzcv.zza : objZzs;
            }
            return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(zzdkVar)));
        } catch (Error e10) {
            e = e10;
            return new zzc(e);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzdkVar)), e11)) : new zza(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzdkVar)), e12)) : new zzc(e12.getCause());
        } catch (Exception e13) {
            e = e13;
            return new zzc(e);
        }
    }

    private static Object zzs(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzu(zzcu zzcuVar, boolean z10) {
        zzd zzdVar = null;
        while (true) {
            zzcuVar.zzo();
            zzcuVar.zzg();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZzk = zzcuVar.zzk(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZzk != null) {
                zzd zzdVar4 = zzdVarZzk.next;
                zzdVarZzk.next = zzdVar3;
                zzdVar3 = zzdVarZzk;
                zzdVarZzk = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzd zzdVar5 = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzcuVar = zzbVar.zza;
                    if (zzcuVar.valueField == zzbVar && zzcv.zzq(zzcuVar, zzbVar, zzr(zzbVar.zzb))) {
                        zzdVar = zzdVar5;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzv(runnable2, executor);
                }
                zzdVar3 = zzdVar5;
            }
            return;
        }
    }

    private static void zzv(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            zzcv.zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzcv.zzc) {
            zzaVar = new zza(z10, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z10 ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzcu<V> zzcuVar = this;
        boolean z11 = false;
        while (true) {
            if (zzcv.zzq(zzcuVar, obj, zzaVar)) {
                zzu(zzcuVar, z10);
                if (obj instanceof zzb) {
                    zzdk<? extends V> zzdkVar = ((zzb) obj).zzb;
                    if (zzdkVar instanceof zze) {
                        zzcuVar = (zzcu) zzdkVar;
                        obj = zzcuVar.valueField;
                        if ((obj == null) | (obj instanceof zzb)) {
                            z11 = true;
                        }
                    } else {
                        zzdkVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = zzcuVar.valueField;
            if (zzh(obj)) {
                return z11;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return zzl();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void zzb(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzbl.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzv(runnable, executor);
    }

    protected String zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    protected final Throwable zze() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    protected void zzg() {
    }

    protected final boolean zzi(Throwable th) {
        if (!zzcv.zzq(this, null, new zzc(th))) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    protected final boolean zzj(zzdk zzdkVar) {
        zzc zzcVar;
        Object obj = this.valueField;
        if (obj == null) {
            if (zzdkVar.isDone()) {
                if (!zzcv.zzq(this, null, zzr(zzdkVar))) {
                    return false;
                }
                zzu(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, zzdkVar);
            if (zzcv.zzq(this, null, zzbVar)) {
                try {
                    zzdkVar.zzb(zzbVar, zzda.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzcv.zzq(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            zzdkVar.cancel(((zza) obj).zzc);
        }
        return false;
    }

    private final void zzt(StringBuilder sb2) {
        try {
            Object objZzs = zzs(this);
            sb2.append("SUCCESS, result=[");
            if (objZzs == null) {
                sb2.append("null");
            } else if (objZzs == this) {
                sb2.append("this future");
            } else {
                sb2.append(objZzs.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objZzs)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append(EFLCCdIRcb.BcnmUofHCf);
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzm(j10, timeUnit);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(tFQWuE.AAVOByWMkfkMcMd);
        if (this.valueField instanceof zza) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzt(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb2.append(", setFuture=[");
                zzdk<? extends V> zzdkVar = ((zzb) obj).zzb;
                try {
                    if (zzdkVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(zzdkVar);
                    }
                } catch (Throwable th) {
                    zzdl.zza(th);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = zzbo.zza(zzd());
                } catch (Throwable th2) {
                    zzdl.zza(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                zzt(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
