package com.explorestack.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeUtil.java */
/* JADX INFO: loaded from: classes.dex */
final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f10916a = I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f10917b = com.explorestack.protobuf.d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f10918c = q(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f10919d = q(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f10920e = F();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f10921f = Z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f10922g = Y();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f10923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f10924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f10925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f10926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f10927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f10928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f10929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f10930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f10931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f10932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f10933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f10934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f10935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f10936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f10937v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f10938w;

    /* JADX INFO: compiled from: UnsafeUtil.java */
    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.explorestack.protobuf.z2.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.z2.e
        public boolean d(Object obj, long j10) {
            return z2.f10938w ? z2.u(obj, j10) : z2.v(obj, j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.z2.e
        public byte f(Object obj, long j10) {
            return z2.f10938w ? z2.y(obj, j10) : z2.z(obj, j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.explorestack.protobuf.z2.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.explorestack.protobuf.z2.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.z2.e
        public Object m(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.explorestack.protobuf.z2.e
        public void o(Object obj, long j10, boolean z10) {
            if (z2.f10938w) {
                z2.O(obj, j10, z10);
            } else {
                z2.P(obj, j10, z10);
            }
        }

        @Override // com.explorestack.protobuf.z2.e
        public void p(Object obj, long j10, byte b10) {
            if (z2.f10938w) {
                z2.R(obj, j10, b10);
            } else {
                z2.S(obj, j10, b10);
            }
        }

        @Override // com.explorestack.protobuf.z2.e
        public void q(Object obj, long j10, double d10) {
            t(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.explorestack.protobuf.z2.e
        public void r(Object obj, long j10, float f10) {
            s(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.explorestack.protobuf.z2.e
        public boolean w() {
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.explorestack.protobuf.z2.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.z2.e
        public boolean d(Object obj, long j10) {
            return z2.f10938w ? z2.u(obj, j10) : z2.v(obj, j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.z2.e
        public byte f(Object obj, long j10) {
            return z2.f10938w ? z2.y(obj, j10) : z2.z(obj, j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.explorestack.protobuf.z2.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.explorestack.protobuf.z2.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.z2.e
        public Object m(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.explorestack.protobuf.z2.e
        public void o(Object obj, long j10, boolean z10) {
            if (z2.f10938w) {
                z2.O(obj, j10, z10);
            } else {
                z2.P(obj, j10, z10);
            }
        }

        @Override // com.explorestack.protobuf.z2.e
        public void p(Object obj, long j10, byte b10) {
            if (z2.f10938w) {
                z2.R(obj, j10, b10);
            } else {
                z2.S(obj, j10, b10);
            }
        }

        @Override // com.explorestack.protobuf.z2.e
        public void q(Object obj, long j10, double d10) {
            t(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.explorestack.protobuf.z2.e
        public void r(Object obj, long j10, float f10) {
            s(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.explorestack.protobuf.z2.e
        public boolean w() {
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.explorestack.protobuf.z2.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f10939a.copyMemory((Object) null, j10, bArr, z2.f10923h + j11, j12);
        }

        @Override // com.explorestack.protobuf.z2.e
        public boolean d(Object obj, long j10) {
            return this.f10939a.getBoolean(obj, j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public byte e(long j10) {
            return this.f10939a.getByte(j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public byte f(Object obj, long j10) {
            return this.f10939a.getByte(obj, j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public double g(Object obj, long j10) {
            return this.f10939a.getDouble(obj, j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public float h(Object obj, long j10) {
            return this.f10939a.getFloat(obj, j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public long j(long j10) {
            return this.f10939a.getLong(j10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public Object m(java.lang.reflect.Field field) {
            return l(this.f10939a.staticFieldBase(field), this.f10939a.staticFieldOffset(field));
        }

        @Override // com.explorestack.protobuf.z2.e
        public void o(Object obj, long j10, boolean z10) {
            this.f10939a.putBoolean(obj, j10, z10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public void p(Object obj, long j10, byte b10) {
            this.f10939a.putByte(obj, j10, b10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public void q(Object obj, long j10, double d10) {
            this.f10939a.putDouble(obj, j10, d10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public void r(Object obj, long j10, float f10) {
            this.f10939a.putFloat(obj, j10, f10);
        }

        @Override // com.explorestack.protobuf.z2.e
        public boolean v() {
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls = this.f10939a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                z2.L(th);
                return false;
            }
        }

        @Override // com.explorestack.protobuf.z2.e
        public boolean w() {
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls = this.f10939a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                z2.L(th);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f10939a;

        e(Unsafe unsafe) {
            this.f10939a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f10939a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f10939a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f10939a.getInt(obj, j10);
        }

        public abstract long j(long j10);

        public final long k(Object obj, long j10) {
            return this.f10939a.getLong(obj, j10);
        }

        public final Object l(Object obj, long j10) {
            return this.f10939a.getObject(obj, j10);
        }

        public abstract Object m(java.lang.reflect.Field field);

        public final long n(java.lang.reflect.Field field) {
            return this.f10939a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j10, boolean z10);

        public abstract void p(Object obj, long j10, byte b10);

        public abstract void q(Object obj, long j10, double d10);

        public abstract void r(Object obj, long j10, float f10);

        public final void s(Object obj, long j10, int i10) {
            this.f10939a.putInt(obj, j10, i10);
        }

        public final void t(Object obj, long j10, long j11) {
            this.f10939a.putLong(obj, j10, j11);
        }

        public final void u(Object obj, long j10, Object obj2) {
            this.f10939a.putObject(obj, j10, obj2);
        }

        public boolean v() {
            Unsafe unsafe = this.f10939a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                z2.L(th);
                return false;
            }
        }

        public boolean w() {
            Unsafe unsafe = this.f10939a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return z2.o() != null;
            } catch (Throwable th) {
                z2.L(th);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        f10923h = jM;
        f10924i = m(boolean[].class);
        f10925j = n(boolean[].class);
        f10926k = m(int[].class);
        f10927l = n(int[].class);
        f10928m = m(long[].class);
        f10929n = n(long[].class);
        f10930o = m(float[].class);
        f10931p = n(float[].class);
        f10932q = m(double[].class);
        f10933r = n(double[].class);
        f10934s = m(Object[].class);
        f10935t = n(Object[].class);
        f10936u = s(o());
        f10937v = (int) (jM & 7);
        f10938w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private z2() {
    }

    static double A(Object obj, long j10) {
        return f10920e.g(obj, j10);
    }

    static float B(Object obj, long j10) {
        return f10920e.h(obj, j10);
    }

    static int C(Object obj, long j10) {
        return f10920e.i(obj, j10);
    }

    static long D(long j10) {
        return f10920e.j(j10);
    }

    static long E(Object obj, long j10) {
        return f10920e.k(obj, j10);
    }

    private static e F() {
        Unsafe unsafe = f10916a;
        if (unsafe == null) {
            return null;
        }
        if (!com.explorestack.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f10918c) {
            return new c(unsafe);
        }
        if (f10919d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object G(Object obj, long j10) {
        return f10920e.l(obj, j10);
    }

    static Object H(java.lang.reflect.Field field) {
        return f10920e.m(field);
    }

    static Unsafe I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean J() {
        return f10922g;
    }

    static boolean K() {
        return f10921f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Throwable th) {
        Logger.getLogger(z2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static long M(java.lang.reflect.Field field) {
        return f10920e.n(field);
    }

    static void N(Object obj, long j10, boolean z10) {
        f10920e.o(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(Object obj, long j10, boolean z10) {
        R(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j10, boolean z10) {
        S(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void Q(byte[] bArr, long j10, byte b10) {
        f10920e.p(bArr, f10923h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iC = C(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        V(obj, j11, ((255 & b10) << i10) | (iC & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        V(obj, j11, ((255 & b10) << i10) | (C(obj, j11) & (~(255 << i10))));
    }

    static void T(Object obj, long j10, double d10) {
        f10920e.q(obj, j10, d10);
    }

    static void U(Object obj, long j10, float f10) {
        f10920e.r(obj, j10, f10);
    }

    static void V(Object obj, long j10, int i10) {
        f10920e.s(obj, j10, i10);
    }

    static void W(Object obj, long j10, long j11) {
        f10920e.t(obj, j10, j11);
    }

    static void X(Object obj, long j10, Object obj2) {
        f10920e.u(obj, j10, obj2);
    }

    private static boolean Y() {
        e eVar = f10920e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    private static boolean Z() {
        e eVar = f10920e;
        if (eVar == null) {
            return false;
        }
        return eVar.w();
    }

    static long k(ByteBuffer byteBuffer) {
        return f10920e.k(byteBuffer, f10936u);
    }

    static <T> T l(Class<T> cls) {
        try {
            return (T) f10916a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int m(Class<?> cls) {
        if (f10922g) {
            return f10920e.a(cls);
        }
        return -1;
    }

    private static int n(Class<?> cls) {
        if (f10922g) {
            return f10920e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field o() {
        java.lang.reflect.Field fieldR;
        if (com.explorestack.protobuf.d.c() && (fieldR = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldR;
        }
        java.lang.reflect.Field fieldR2 = r(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (fieldR2 == null || fieldR2.getType() != Long.TYPE) {
            return null;
        }
        return fieldR2;
    }

    static void p(long j10, byte[] bArr, long j11, long j12) {
        f10920e.c(j10, bArr, j11, j12);
    }

    static boolean q(Class<?> cls) {
        if (!com.explorestack.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f10917b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    private static java.lang.reflect.Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long s(java.lang.reflect.Field field) {
        e eVar;
        if (field == null || (eVar = f10920e) == null) {
            return -1L;
        }
        return eVar.n(field);
    }

    static boolean t(Object obj, long j10) {
        return f10920e.d(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u(Object obj, long j10) {
        return y(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j10) {
        return z(obj, j10) != 0;
    }

    static byte w(long j10) {
        return f10920e.e(j10);
    }

    static byte x(byte[] bArr, long j10) {
        return f10920e.f(bArr, f10923h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte y(Object obj, long j10) {
        return (byte) ((C(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j10) {
        return (byte) ((C(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }
}
