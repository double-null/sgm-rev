package pa;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final Intent a(Context context, Class clazz) {
        kotlin.jvm.internal.t.f(context, "<this>");
        kotlin.jvm.internal.t.f(clazz, "clazz");
        Intent intent = new Intent(context, (Class<?>) clazz);
        intent.addFlags(268435456);
        intent.addFlags(8388608);
        return intent;
    }
}
