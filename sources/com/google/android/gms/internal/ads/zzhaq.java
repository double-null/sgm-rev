package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzhaq<V> extends zzhcy implements ListenableFuture<V> {
    private static final zza zzbs;
    static final Object zze = new Object();
    static final zzhce zzf = new zzhce(zzhap.class);
    static final boolean zzg;
    volatile zzhap.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    abstract class zza {
        /* synthetic */ zza(byte[] bArr) {
        }

        abstract void zza(zze zzeVar, Thread thread);

        abstract void zzb(zze zzeVar, zze zzeVar2);

        abstract boolean zzc(zzhaq zzhaqVar, zze zzeVar, zze zzeVar2);

        abstract boolean zzd(zzhaq zzhaqVar, zzhap.zzd zzdVar, zzhap.zzd zzdVar2);

        abstract zze zze(zzhaq zzhaqVar, zze zzeVar);

        abstract zzhap.zzd zzf(zzhaq zzhaqVar, zzhap.zzd zzdVar);

        abstract boolean zzg(zzhaq zzhaqVar, Object obj, Object obj2);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzhaq<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzhaq.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzhaq<?>, zzhap.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzhaq.class, zzhap.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzhaq<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzhaq.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzc(zzhaq zzhaqVar, zze zzeVar, zze zzeVar2) {
            return androidx.concurrent.futures.b.a(zzc, zzhaqVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzd(zzhaq zzhaqVar, zzhap.zzd zzdVar, zzhap.zzd zzdVar2) {
            return androidx.concurrent.futures.b.a(zzd, zzhaqVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final zze zze(zzhaq zzhaqVar, zze zzeVar) {
            return zzc.getAndSet(zzhaqVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final zzhap.zzd zzf(zzhaq zzhaqVar, zzhap.zzd zzdVar) {
            return zzd.getAndSet(zzhaqVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzg(zzhaq zzhaqVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(zze, zzhaqVar, obj, obj2);
        }

        /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzc(zzhaq zzhaqVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzhaqVar) {
                if (zzhaqVar.waitersField != zzeVar) {
                    return false;
                }
                zzhaqVar.waitersField = zzeVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzd(zzhaq zzhaqVar, zzhap.zzd zzdVar, zzhap.zzd zzdVar2) {
            synchronized (zzhaqVar) {
                if (zzhaqVar.listenersField != zzdVar) {
                    return false;
                }
                zzhaqVar.listenersField = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final zze zze(zzhaq zzhaqVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzhaqVar) {
                zzeVar2 = zzhaqVar.waitersField;
                if (zzeVar2 != zzeVar) {
                    zzhaqVar.waitersField = zzeVar;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final zzhap.zzd zzf(zzhaq zzhaqVar, zzhap.zzd zzdVar) {
            zzhap.zzd zzdVar2;
            synchronized (zzhaqVar) {
                zzdVar2 = zzhaqVar.listenersField;
                if (zzdVar2 != zzdVar) {
                    zzhaqVar.listenersField = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzg(zzhaq zzhaqVar, Object obj, Object obj2) {
            synchronized (zzhaqVar) {
                if (zzhaqVar.valueField != obj) {
                    return false;
                }
                zzhaqVar.valueField = obj2;
                return true;
            }
        }

        /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(zzhar.zza);
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzhaq.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzhaq.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzhaq.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzc(zzhaq zzhaqVar, zze zzeVar, zze zzeVar2) {
            return d0.a(zza, zzhaqVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzd(zzhaq zzhaqVar, zzhap.zzd zzdVar, zzhap.zzd zzdVar2) {
            return d0.a(zza, zzhaqVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final zze zze(zzhaq zzhaqVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzhaqVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzhaqVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final zzhap.zzd zzf(zzhaq zzhaqVar, zzhap.zzd zzdVar) {
            zzhap.zzd zzdVar2;
            do {
                zzdVar2 = zzhaqVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzhaqVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzg(zzhaq zzhaqVar, Object obj, Object obj2) {
            return d0.a(zza, zzhaqVar, zzd, obj, obj2);
        }

        /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze() {
            zzhaq.zzv(this, Thread.currentThread());
        }

        zze(boolean z10) {
        }
    }

    zzhaq() {
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                        }
                    } else if (!zzbs.zzc(this, zzeVar2, zzeVar4)) {
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static boolean zzr(zzhaq zzhaqVar, Object obj, Object obj2) {
        return zzbs.zzg(zzhaqVar, obj, obj2);
    }

    static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbs.zza(zzeVar, thread);
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    final boolean zzp(zzhap.zzd zzdVar, zzhap.zzd zzdVar2) {
        return zzbs.zzd(this, zzdVar, zzdVar2);
    }

    final zzhap.zzd zzq(zzhap.zzd zzdVar) {
        return zzbs.zzf(this, zzdVar);
    }

    final void zzs() {
        for (zze zzeVarZze = zzbs.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final Object zzt(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzhap.zzh(obj)) {
            return zzhap.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                while (true) {
                    zza zzaVar = zzbs;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzhap.zzh(obj2)) {
                                return zzhap.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                        break;
                    }
                    zzeVar = this.waitersField;
                    if (zzeVar == zze.zza) {
                    }
                }
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzhap.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzhap.zzh(obj4)) {
                return zzhap.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 8 + String.valueOf(lowerCase2).length());
        sb2.append("Waited ");
        sb2.append(j10);
        sb2.append(" ");
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb3 = new StringBuilder(strConcat.length() + String.valueOf(jConvert).length() + 1 + String.valueOf(lowerCase).length());
                sb3.append(strConcat);
                sb3.append(jConvert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z10) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z10) {
                StringBuilder sb4 = new StringBuilder(strConcat.length() + String.valueOf(nanos2).length() + 13);
                sb4.append(strConcat);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        StringBuilder sb5 = new StringBuilder(string3.length() + 5 + String.valueOf(string).length());
        sb5.append(string3);
        sb5.append(" for ");
        sb5.append(string);
        throw new TimeoutException(sb5.toString());
    }

    final Object zzu() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzhap.zzh(obj2)) {
            return zzhap.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbs;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzhap.zzh(obj)));
                    return zzhap.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzhap.zzg(obj3);
    }

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzg = z10;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e10) {
                try {
                    th = e10;
                    th2 = null;
                    zzcVar = new zzb(bArr);
                } catch (Error | Exception e11) {
                    th = e10;
                    th2 = e11;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th2 = null;
        th = null;
        zzbs = zzcVar;
        if (th2 != null) {
            zzhce zzhceVar = zzf;
            Logger loggerZza = zzhceVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", GEmOVMyH.LycFlPWXPaCqeYv, th);
            zzhceVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }
}
