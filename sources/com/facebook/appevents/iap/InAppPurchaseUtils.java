package com.facebook.appevents.iap;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InAppPurchaseUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseUtils {
    public static final InAppPurchaseUtils INSTANCE = new InAppPurchaseUtils();

    /* JADX INFO: compiled from: InAppPurchaseUtils.kt */
    public enum BillingClientVersion {
        NONE("none"),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");

        private final String type;

        BillingClientVersion(String str) {
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseUtils.kt */
    public enum IAPProductType {
        INAPP(BillingClient.ProductType.INAPP),
        SUBS(BillingClient.ProductType.SUBS);

        private final String type;

        IAPProductType(String str) {
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }

    private InAppPurchaseUtils() {
    }

    public static final Class<?> getClass(String className) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            t.f(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    public static final Class<?> getClassFromContext$facebook_core_release(Context context, String className) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            t.f(context, "context");
            t.f(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    public static final Method getDeclaredMethod$facebook_core_release(Class<?> clazz, String methodName, Class<?>... args) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            t.f(clazz, "clazz");
            t.f(methodName, "methodName");
            t.f(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    public static final Method getMethod(Class<?> clazz, String methodName, Class<?>... args) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            t.f(clazz, "clazz");
            t.f(methodName, "methodName");
            t.f(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }

    public static final Object invokeMethod(Class<?> clazz, Method method, Object obj, Object... args) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseUtils.class)) {
            return null;
        }
        try {
            t.f(clazz, "clazz");
            t.f(method, "method");
            t.f(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseUtils.class);
            return null;
        }
    }
}
