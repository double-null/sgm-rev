package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TypeIntrinsics.java */
/* JADX INFO: loaded from: classes5.dex */
public class m0 {
    public static Collection a(Object obj) {
        if ((obj instanceof jd.a) && !(obj instanceof jd.b)) {
            m(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static List b(Object obj) {
        if ((obj instanceof jd.a) && !(obj instanceof jd.c)) {
            m(obj, "kotlin.collections.MutableList");
        }
        return f(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof jd.a) && !(obj instanceof jd.d)) {
            m(obj, "kotlin.collections.MutableMap");
        }
        return g(obj);
    }

    public static Object d(Object obj, int i10) {
        if (obj != null && !i(obj, i10)) {
            m(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw l(e10);
        }
    }

    public static List f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw l(e10);
        }
    }

    public static Map g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw l(e10);
        }
    }

    public static int h(Object obj) {
        if (obj instanceof o) {
            return ((o) obj).getArity();
        }
        if (obj instanceof id.a) {
            return 0;
        }
        if (obj instanceof id.l) {
            return 1;
        }
        if (obj instanceof id.p) {
            return 2;
        }
        if (obj instanceof id.q) {
            return 3;
        }
        if (obj instanceof id.r) {
            return 4;
        }
        if (obj instanceof id.s) {
            return 5;
        }
        if (obj instanceof id.t) {
            return 6;
        }
        if (obj instanceof id.u) {
            return 7;
        }
        if (obj instanceof id.v) {
            return 8;
        }
        if (obj instanceof id.w) {
            return 9;
        }
        if (obj instanceof id.b) {
            return 10;
        }
        if (obj instanceof id.c) {
            return 11;
        }
        if (obj instanceof id.d) {
            return 12;
        }
        if (obj instanceof id.e) {
            return 13;
        }
        if (obj instanceof id.f) {
            return 14;
        }
        if (obj instanceof id.g) {
            return 15;
        }
        if (obj instanceof id.h) {
            return 16;
        }
        if (obj instanceof id.i) {
            return 17;
        }
        if (obj instanceof id.j) {
            return 18;
        }
        if (obj instanceof id.k) {
            return 19;
        }
        if (obj instanceof id.m) {
            return 20;
        }
        if (obj instanceof id.n) {
            return 21;
        }
        return obj instanceof id.o ? 22 : -1;
    }

    public static boolean i(Object obj, int i10) {
        return (obj instanceof wc.g) && h(obj) == i10;
    }

    public static boolean j(Object obj) {
        return (obj instanceof List) && (!(obj instanceof jd.a) || (obj instanceof jd.c));
    }

    private static <T extends Throwable> T k(T t10) {
        return (T) t.m(t10, m0.class.getName());
    }

    public static ClassCastException l(ClassCastException classCastException) {
        throw ((ClassCastException) k(classCastException));
    }

    public static void m(Object obj, String str) {
        n((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void n(String str) {
        throw l(new ClassCastException(str));
    }
}
