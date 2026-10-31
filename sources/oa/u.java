package oa;

import android.content.Context;
import io.bidmachine.rendering.ad.view.ExpandActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference f23328a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
        WeakReference weakReference = f23328a;
        if (weakReference != null) {
            weakReference.clear();
        }
        f23328a = null;
    }

    public static final void d(s sVar) {
        kotlin.jvm.internal.t.f(sVar, "<this>");
        try {
            f23328a = new WeakReference(sVar);
            Context context = sVar.getContext();
            Context context2 = sVar.getContext();
            kotlin.jvm.internal.t.e(context2, "context");
            context.startActivity(pa.c.a(context2, ExpandActivity.class));
        } catch (Throwable unused) {
            sVar.u0();
        }
    }
}
