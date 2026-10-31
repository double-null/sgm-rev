package com.google.android.gms.internal.ads;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zziha {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzigz zzf;
    private static final boolean zzg;
    private static final long zzh;

    static {
        boolean z10;
        zzigz zzigzVar;
        Unsafe unsafeZzr = zzr();
        zzc = unsafeZzr;
        int i10 = zzicn.zza;
        zzd = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zZzs = zzs(cls);
        zze = zZzs;
        boolean zZzs2 = zzs(Integer.TYPE);
        zzigz zzigxVar = null;
        if (unsafeZzr != null) {
            if (zZzs) {
                zzigxVar = new zzigy(unsafeZzr);
            } else if (zZzs2) {
                zzigxVar = new zzigx(unsafeZzr);
            }
        }
        zzf = zzigxVar;
        if (zzigxVar != null) {
            try {
                Class<?> cls2 = zzigxVar.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                zzC();
            } catch (Throwable th) {
                zzz(th);
            }
        }
        zzigz zzigzVar2 = zzf;
        if (zzigzVar2 == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = zzigzVar2.zza.getClass();
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
                zzz(th2);
                z10 = false;
            }
        }
        zzg = z10;
        zza = zzA(byte[].class);
        zzA(boolean[].class);
        zzB(boolean[].class);
        zzA(int[].class);
        zzB(int[].class);
        zzA(long[].class);
        zzB(long[].class);
        zzA(float[].class);
        zzB(float[].class);
        zzA(double[].class);
        zzB(double[].class);
        zzA(Object[].class);
        zzB(Object[].class);
        Field fieldZzC = zzC();
        long jObjectFieldOffset = -1;
        if (fieldZzC != null && (zzigzVar = zzf) != null) {
            jObjectFieldOffset = zzigzVar.zza.objectFieldOffset(fieldZzC);
        }
        zzh = jObjectFieldOffset;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zziha() {
    }

    private static int zzA(Class cls) {
        if (zzg) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzB(Class cls) {
        if (zzg) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzC() {
        int i10 = zzicn.zza;
        Field fieldZzD = zzD(Buffer.class, "effectiveDirectAddress");
        if (fieldZzD != null) {
            return fieldZzD;
        }
        Field fieldZzD2 = zzD(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (fieldZzD2 == null || fieldZzD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzD2;
    }

    private static Field zzD(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzF(Object obj, long j10, byte b10) {
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

    static byte zzp(long j10) {
        return zzf.zzh(j10);
    }

    static long zzq(ByteBuffer byteBuffer) {
        zzigz zzigzVar = zzf;
        return zzigzVar.zza.getLong(byteBuffer, zzh);
    }

    static Unsafe zzr() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzigw());
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
            Logger.getLogger(zziha.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzs(Class cls) {
        int i10 = zzicn.zza;
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

    static /* synthetic */ boolean zzv(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzw(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void zzz(Throwable th) {
        Logger.getLogger(zziha.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }
}
