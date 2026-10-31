package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: WorkManager.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    protected v() {
    }

    public static v d(Context context) {
        return f1.i.k(context);
    }

    public static void e(Context context, b bVar) {
        f1.i.e(context, bVar);
    }

    public abstract o a(String str);

    public final o b(w wVar) {
        return c(Collections.singletonList(wVar));
    }

    public abstract o c(List<? extends w> list);
}
