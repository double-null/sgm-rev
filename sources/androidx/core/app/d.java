package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class<?> f1705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f1706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f1707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f1708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f1709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f1710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f1711g = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: ActivityRecreator.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0029d f1712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1713b;

        a(C0029d c0029d, Object obj) {
            this.f1712a = c0029d;
            this.f1713b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1712a.f1718a = this.f1713b;
        }
    }

    /* JADX INFO: compiled from: ActivityRecreator.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f1714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0029d f1715b;

        b(Application application, C0029d c0029d) {
            this.f1714a = application;
            this.f1715b = c0029d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1714a.unregisterActivityLifecycleCallbacks(this.f1715b);
        }
    }

    /* JADX INFO: compiled from: ActivityRecreator.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f1716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1717b;

        c(Object obj, Object obj2) {
            this.f1716a = obj;
            this.f1717b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f1708d;
                if (method != null) {
                    method.invoke(this.f1716a, this.f1717b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f1709e.invoke(this.f1716a, this.f1717b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class<?> clsA = a();
        f1705a = clsA;
        f1706b = b();
        f1707c = f();
        f1708d = d(clsA);
        f1709e = c(clsA);
        f1710f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f1707c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f1711g.postAtFrontOfQueue(new c(f1706b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f1710f == null) {
            return false;
        }
        if (f1709e == null && f1708d == null) {
            return false;
        }
        try {
            Object obj2 = f1707c.get(activity);
            if (obj2 == null || (obj = f1706b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0029d c0029d = new C0029d(activity);
            application.registerActivityLifecycleCallbacks(c0029d);
            f1711g.post(new a(c0029d, obj2));
            try {
                if (g()) {
                    Method method = f1710f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f1711g.post(new b(application, c0029d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    private static final class C0029d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f1719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1721d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1722e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1723f = false;

        C0029d(Activity activity) {
            this.f1719b = activity;
            this.f1720c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1719b == activity) {
                this.f1719b = null;
                this.f1722e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1722e || this.f1723f || this.f1721d || !d.h(this.f1718a, this.f1720c, activity)) {
                return;
            }
            this.f1723f = true;
            this.f1718a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1719b == activity) {
                this.f1721d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
