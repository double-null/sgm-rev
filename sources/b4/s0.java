package b4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: SessionsActivityLifecycleCallbacks.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f4012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4013b;

    public s0(u0 sharedSessionRepository) {
        kotlin.jvm.internal.t.f(sharedSessionRepository, "sharedSessionRepository");
        this.f4012a = sharedSessionRepository;
        this.f4013b = true;
    }

    public final void a() {
        this.f4013b = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.t.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        if (this.f4013b) {
            this.f4012a.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        if (this.f4013b) {
            this.f4012a.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.t.f(activity, "activity");
        kotlin.jvm.internal.t.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
    }
}
