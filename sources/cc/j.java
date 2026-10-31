package cc;

import java.net.URLConnection;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ProtoRequestProcessor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface j extends l {
    @Override // cc.l
    default void a(URLConnection urlConnection) {
        t.f(urlConnection, "urlConnection");
        urlConnection.setRequestProperty("Content-Type", "application/x-protobuf");
    }
}
