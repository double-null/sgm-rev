package cc;

import java.net.URLConnection;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ByteResponseProcessor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements n<byte[]> {
    @Override // cc.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] a(URLConnection urlConnection) throws Throwable {
        t.f(urlConnection, "urlConnection");
        return i.c(urlConnection);
    }
}
