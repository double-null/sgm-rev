package io.bidmachine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: BidMachineActivityManager.java */
/* JADX INFO: loaded from: classes4.dex */
class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f17573a = new AtomicBoolean(false);

    static Activity a() {
        return wb.z.f27734a.a();
    }

    static void b(Context context) {
        if (f17573a.compareAndSet(false, true)) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(new b());
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    static void c(Activity activity) {
        wb.z.f27734a.b(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: BidMachineActivityManager.java */
    static class b implements Application.ActivityLifecycleCallbacks {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c() {
            try {
                SessionManager.get().pause();
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d() {
            try {
                SessionManager.get().resume();
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            try {
                io.bidmachine.core.h.Q(new Runnable() { // from class: io.bidmachine.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        f1.b.c();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                f1.c(activity);
                io.bidmachine.core.h.Q(new Runnable() { // from class: io.bidmachine.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        f1.b.d();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            try {
                f1.c(activity);
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
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
