package androidx.datastore.preferences.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import pb.vBC.NyXuoef;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeUtil.java */
/* JADX INFO: loaded from: classes2.dex */
final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f2229a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f2230b = androidx.datastore.preferences.protobuf.d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f2231c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f2232d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f2233e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f2234f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f2235g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f2236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f2237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f2238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f2239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f2240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f2241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f2242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f2243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f2244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f2245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f2246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f2247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f2248t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f2249u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f2250v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f2251w;

    /* JADX INFO: compiled from: UnsafeUtil.java */
    /* JADX INFO: loaded from: classes.dex */
    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
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
    /* JADX INFO: loaded from: classes.dex */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean c(Object obj, long j10) {
            return n1.f2251w ? n1.q(obj, j10) : n1.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void j(Object obj, long j10, boolean z10) {
            if (n1.f2251w) {
                n1.F(obj, j10, z10);
            } else {
                n1.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void k(Object obj, long j10, byte b10) {
            if (n1.f2251w) {
                n1.I(obj, j10, b10);
            } else {
                n1.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean c(Object obj, long j10) {
            return n1.f2251w ? n1.q(obj, j10) : n1.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void j(Object obj, long j10, boolean z10) {
            if (n1.f2251w) {
                n1.F(obj, j10, z10);
            } else {
                n1.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void k(Object obj, long j10, byte b10) {
            if (n1.f2251w) {
                n1.I(obj, j10, b10);
            } else {
                n1.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean r() {
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean c(Object obj, long j10) {
            return this.f2252a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public double d(Object obj, long j10) {
            return this.f2252a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public float e(Object obj, long j10) {
            return this.f2252a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void j(Object obj, long j10, boolean z10) {
            this.f2252a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void k(Object obj, long j10, byte b10) {
            this.f2252a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void l(Object obj, long j10, double d10) {
            this.f2252a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public void m(Object obj, long j10, float f10) {
            this.f2252a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f2252a.getClass();
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
                n1.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.n1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f2252a.getClass();
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
                n1.D(th);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    /* JADX INFO: loaded from: classes.dex */
    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f2252a;

        e(Unsafe unsafe) {
            this.f2252a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f2252a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f2252a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public final int f(Object obj, long j10) {
            return this.f2252a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f2252a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f2252a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f2252a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f2252a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f2252a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f2252a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f2252a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
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
                n1.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f2252a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return n1.l() != null;
            } catch (Throwable th) {
                n1.D(th);
                return false;
            }
        }
    }

    static {
        long j10 = j(byte[].class);
        f2236h = j10;
        f2237i = j(boolean[].class);
        f2238j = k(boolean[].class);
        f2239k = j(int[].class);
        f2240l = k(int[].class);
        f2241m = j(long[].class);
        f2242n = k(long[].class);
        f2243o = j(float[].class);
        f2244p = k(float[].class);
        f2245q = j(double[].class);
        f2246r = k(double[].class);
        f2247s = j(Object[].class);
        f2248t = k(Object[].class);
        f2249u = o(l());
        f2250v = (int) (j10 & 7);
        f2251w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private n1() {
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f2235g;
    }

    static boolean C() {
        return f2234f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void E(Object obj, long j10, boolean z10) {
        f2233e.j(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f2233e.k(bArr, f2236h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iW = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iW & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f2233e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f2233e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f2233e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f2233e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f2233e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f2233e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f2233e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) f2229a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f2235g) {
            return f2233e.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f2235g) {
            return f2233e.b(cls);
        }
        return -1;
    }

    static boolean m(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f2230b;
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

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f2233e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j10) {
        return f2233e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return s(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    private static byte s(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j10) {
        return (byte) ((w(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j10) {
        return f2233e.d(obj, j10);
    }

    static float v(Object obj, long j10) {
        return f2233e.e(obj, j10);
    }

    static int w(Object obj, long j10) {
        return f2233e.f(obj, j10);
    }

    static long x(Object obj, long j10) {
        return f2233e.g(obj, j10);
    }

    private static e y() {
        Unsafe unsafe = f2229a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f2231c) {
            return new c(unsafe);
        }
        if (f2232d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j10) {
        return f2233e.h(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (androidx.datastore.preferences.protobuf.d.c() && (fieldN = n(Buffer.class, NyXuoef.fRMRxFLPmV)) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }
}
