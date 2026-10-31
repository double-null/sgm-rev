package pb;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 {
    public static final void a(View view, w0 w0Var) {
        kotlin.jvm.internal.t.f(view, "<this>");
        if (w0Var == null) {
            return;
        }
        Context context = view.getContext();
        kotlin.jvm.internal.t.e(context, "context");
        int iK = wb.e0.k(context, w0Var.b());
        Context context2 = view.getContext();
        kotlin.jvm.internal.t.e(context2, "context");
        int iK2 = wb.e0.k(context2, w0Var.d());
        Context context3 = view.getContext();
        kotlin.jvm.internal.t.e(context3, "context");
        int iK3 = wb.e0.k(context3, w0Var.c());
        Context context4 = view.getContext();
        kotlin.jvm.internal.t.e(context4, "context");
        view.setPadding(iK, iK2, iK3, wb.e0.k(context4, w0Var.a()));
    }
}
