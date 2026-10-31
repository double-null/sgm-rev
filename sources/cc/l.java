package cc;

import java.net.URLConnection;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: RequestProcessor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface l {
    default void a(URLConnection urlConnection) throws Throwable {
        t.f(urlConnection, "urlConnection");
    }

    default byte[] getBody() throws Throwable {
        return null;
    }
}
