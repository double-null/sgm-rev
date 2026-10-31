package qb;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.t;
import pb.v0;
import wb.g0;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public static final void a(Activity activity, View contentView, boolean z10) {
        t.f(activity, "<this>");
        t.f(contentView, "contentView");
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            if (decorView == null) {
                decorView = contentView;
            }
            contentView.setPadding(0, 0, 0, 0);
            g0.i(decorView);
            if (z10) {
                decorView.requestApplyInsets();
            }
        }
    }

    public static final void b(Activity activity, v0 v0Var) {
        t.f(activity, "<this>");
        activity.setRequestedOrientation(v0Var != null ? v0Var.c() : 4);
    }
}
