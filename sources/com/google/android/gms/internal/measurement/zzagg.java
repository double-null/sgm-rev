package com.google.android.gms.internal.measurement;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzagg {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzagf zzf;
    private static final boolean zzg;

    static {
        boolean z10;
        zzagf zzagfVar;
        Unsafe unsafeZzp = zzp();
        zzc = unsafeZzp;
        int i10 = zzacf.zza;
        zzd = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zZzq = zzq(cls);
        zze = zZzq;
        boolean zZzq2 = zzq(Integer.TYPE);
        zzagf zzagdVar = null;
        if (unsafeZzp != null) {
            if (zZzq) {
                zzagdVar = new zzage(unsafeZzp);
            } else if (zZzq2) {
                zzagdVar = new zzagd(unsafeZzp);
            }
        }
        zzf = zzagdVar;
        if (zzagdVar != null) {
            try {
                Class<?> cls2 = zzagdVar.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                zzA();
            } catch (Throwable th) {
                zzx(th);
            }
        }
        zzagf zzagfVar2 = zzf;
        if (zzagfVar2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = zzagfVar2.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z10 = true;
            } catch (Throwable th2) {
                zzx(th2);
                z10 = false;
            }
        }
        zzg = z10;
        zza = zzy(byte[].class);
        zzy(boolean[].class);
        zzz(boolean[].class);
        zzy(int[].class);
        zzz(int[].class);
        zzy(long[].class);
        zzz(long[].class);
        zzy(float[].class);
        zzz(float[].class);
        zzy(double[].class);
        zzz(double[].class);
        zzy(Object[].class);
        zzz(Object[].class);
        Field fieldZzA = zzA();
        if (fieldZzA != null && (zzagfVar = zzf) != null) {
            zzagfVar.zza.objectFieldOffset(fieldZzA);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzagg() {
    }

    private static Field zzA() {
        int i10 = zzacf.zza;
        Field fieldZzB = zzB(Buffer.class, "effectiveDirectAddress");
        if (fieldZzB != null) {
            return fieldZzB;
        }
        Field fieldZzB2 = zzB(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (fieldZzB2 == null || fieldZzB2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzB2;
    }

    private static Field zzB(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzC(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    static boolean zza() {
        return zzg;
    }

    static Object zzb(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static int zzc(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    static void zzd(Object obj, long j10, int i10) {
        zzf.zza.putInt(obj, j10, i10);
    }

    static long zze(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    static void zzf(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    static boolean zzg(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    static void zzh(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    static float zzi(Object obj, long j10) {
        return zzf.zzd(obj, j10);
    }

    static void zzj(Object obj, long j10, float f10) {
        zzf.zze(obj, j10, f10);
    }

    static double zzk(Object obj, long j10) {
        return zzf.zzf(obj, j10);
    }

    static void zzl(Object obj, long j10, double d10) {
        zzf.zzg(obj, j10, d10);
    }

    static Object zzm(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    static void zzn(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    static void zzo(byte[] bArr, long j10, byte b10) {
        zzf.zza(bArr, zza + j10, b10);
    }

    static Unsafe zzp() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzagc());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzq(Class cls) {
        int i10 = zzacf.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzt(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzu(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void zzx(Throwable th) {
        Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int zzy(Class cls) {
        if (zzg) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzz(Class cls) {
        if (zzg) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }
}
