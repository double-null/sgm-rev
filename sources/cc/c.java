package cc;

import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: HeadersResponseProcessor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements n<Map<String, ? extends List<? extends String>>> {
    @Override // cc.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map<String, List<String>> a(URLConnection urlConnection) throws Throwable {
        t.f(urlConnection, "urlConnection");
        Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
        t.e(headerFields, "urlConnection.headerFields");
        return headerFields;
    }
}
