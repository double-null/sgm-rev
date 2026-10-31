package com.facebook.internal.instrument.threadcheck;

import android.os.Looper;
import android.util.Log;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ThreadCheckHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadCheckHandler {
    public static final ThreadCheckHandler INSTANCE = new ThreadCheckHandler();
    private static final String TAG = ThreadCheckHandler.class.getCanonicalName();
    private static boolean enabled;

    private ThreadCheckHandler() {
    }

    public static final void enable() {
        enabled = true;
    }

    private final void log(String str, Class<?> cls, String str2, String str3) {
        if (enabled) {
            l0 l0Var = l0.f21527a;
            String str4 = String.format(Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", Arrays.copyOf(new Object[]{str, cls.getName(), str2, str3, Looper.myLooper(), Looper.getMainLooper()}, 6));
            t.e(str4, "format(locale, format, *args)");
            Exception exc = new Exception();
            Log.e(TAG, str4, exc);
            InstrumentData.Builder.build(exc, InstrumentData.Type.ThreadCheck).save();
        }
    }

    public static final void uiThreadViolationDetected(Class<?> clazz, String methodName, String methodDesc) {
        t.f(clazz, "clazz");
        t.f(methodName, "methodName");
        t.f(methodDesc, "methodDesc");
        INSTANCE.log("@UiThread", clazz, methodName, methodDesc);
    }

    public static final void workerThreadViolationDetected(Class<?> clazz, String methodName, String methodDesc) {
        t.f(clazz, "clazz");
        t.f(methodName, "methodName");
        t.f(methodDesc, "methodDesc");
        INSTANCE.log("@WorkerThread", clazz, methodName, methodDesc);
    }
}
