package androidx.core.app;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ActivityOptionsCompat {

    private static class a extends ActivityOptionsCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ActivityOptions f1685a;

        a(ActivityOptions activityOptions) {
            this.f1685a = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle c() {
            return this.f1685a.toBundle();
        }
    }

    static class b {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeClipRevealAnimation(view, i10, i11, i12, i13);
        }

        static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    protected ActivityOptionsCompat() {
    }

    public static ActivityOptionsCompat a() {
        return new a(b.a());
    }

    public static ActivityOptionsCompat b(Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    public Bundle c() {
        throw null;
    }
}
