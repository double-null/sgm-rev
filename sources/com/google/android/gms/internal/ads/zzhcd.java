package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzhcd extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzhcc(null);
    private static final Runnable zzb = new zzhcc(null);

    zzhcd() {
    }

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzhcb zzhcbVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof zzhcb)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzhcbVar = (zzhcb) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(zzhcbVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z10 = !zzd();
            if (z10) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        zzhco.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzg(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (z10) {
                zzf(objZza);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            string = "running=[DONE]";
        } else if (runnable instanceof zzhcb) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append("]");
            string = sb2.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        StringBuilder sb3 = new StringBuilder(string.length() + 2 + String.valueOf(strZzc).length());
        sb3.append(string);
        sb3.append(", ");
        sb3.append(strZzc);
        return sb3.toString();
    }

    abstract Object zza() throws Exception;

    abstract String zzc();

    abstract boolean zzd();

    abstract void zzf(Object obj);

    abstract void zzg(Throwable th);

    final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzhcb zzhcbVar = new zzhcb(this, null);
            zzhcbVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzhcbVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                    }
                } finally {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }
}
