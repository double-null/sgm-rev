package wb;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TopActivityHolder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f27734a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference<Activity> f27735b;

    private z() {
    }

    public final Activity a() {
        WeakReference<Activity> weakReference = f27735b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void b(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        f27735b = new WeakReference<>(activity);
    }
}
