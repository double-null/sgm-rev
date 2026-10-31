package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements z0.a<c> {

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.l
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }
    }

    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                h.i(context);
            }
        });
    }

    @Override // z0.a
    public List<Class<? extends z0.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // z0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c create(Context context) {
        f(context.getApplicationContext());
        return new c();
    }

    void f(final Context context) {
        a.c(new Runnable() { // from class: androidx.profileinstaller.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f3077a.h(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void h(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: androidx.profileinstaller.j
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.k(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
    }
}
