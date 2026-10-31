package na;

import android.content.Context;
import io.bidmachine.rendering.ad.fullscreen.FullScreenActivity;
import kotlin.jvm.internal.t;
import pb.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static n f22921a;

    public static final void c(n nVar, Context context) {
        t.f(nVar, "<this>");
        t.f(context, "context");
        try {
            f22921a = nVar;
            context.startActivity(pa.c.a(context, FullScreenActivity.class));
        } catch (Throwable unused) {
            f22921a = null;
            nVar.Z(new b0("Ad is null"));
        }
    }
}
