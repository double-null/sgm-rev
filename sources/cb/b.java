package cb;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.t;
import qb.j;
import wb.i;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    void a(Context context, Uri uri, i iVar);

    boolean a(Uri uri);

    default void b(Context context, String url, i iVar) {
        t.f(context, "context");
        t.f(url, "url");
        a(context, j.d(url), iVar);
    }
}
