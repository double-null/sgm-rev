package a1;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Trace.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f17a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f18b;

    public static void a(String str) {
        c.a(str);
    }

    public static void b() {
        c.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        try {
            if (f18b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        try {
            if (f18b == null) {
                f17a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f18b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f18b.invoke(null, Long.valueOf(f17a))).booleanValue();
        } catch (Exception e10) {
            c("isTagEnabled", e10);
            return false;
        }
    }
}
