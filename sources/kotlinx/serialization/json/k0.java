package kotlinx.serialization.json;

import java.io.InputStream;
import ke.q0;

/* JADX INFO: compiled from: JvmStreams.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k0 {
    public static final <T> T a(b bVar, fe.c<? extends T> deserializer, InputStream stream) {
        kotlin.jvm.internal.t.f(bVar, "<this>");
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        kotlin.jvm.internal.t.f(stream, "stream");
        ke.h0 h0Var = new ke.h0(stream);
        try {
            return (T) q0.a(bVar, deserializer, h0Var);
        } finally {
            h0Var.b();
        }
    }
}
