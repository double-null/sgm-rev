package o0;

import android.content.Context;
import android.util.Log;
import id.l;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: BackCompatManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23003a = new b();

    private b() {
    }

    public final <T> T a(Context context, String tag, l<? super Context, ? extends T> manager) {
        t.f(context, "context");
        t.f(tag, "tag");
        t.f(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + a.f23000a.b());
            return null;
        }
    }
}
