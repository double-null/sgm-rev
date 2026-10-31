package xa;

import android.content.Context;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f28276a = new c();

    private c() {
    }

    public static final b a(Context context, String str) {
        t.f(context, "context");
        if (t.a(str, "exo")) {
            pa.t.g("PlayerFactory", "Create player (ExoPlayerImpl)", new Object[0]);
            return new ya.a(context);
        }
        pa.t.g("PlayerFactory", "Create player (MediaPlayerImpl)", new Object[0]);
        return new za.a(context);
    }
}
