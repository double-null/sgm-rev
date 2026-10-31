package se;

import af.a0;
import af.c0;
import java.io.IOException;
import me.b0;
import me.z;

/* JADX INFO: compiled from: ExchangeCodec.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface d {
    void a(z zVar) throws IOException;

    long b(b0 b0Var) throws IOException;

    c0 c(b0 b0Var) throws IOException;

    void cancel();

    a0 d(z zVar, long j10) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    re.f getConnection();

    b0.a readResponseHeaders(boolean z10) throws IOException;
}
