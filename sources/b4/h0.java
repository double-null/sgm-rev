package b4;

import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: SessionData.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements e0.g0<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f3949a;

    public h0(p0 sessionGenerator) {
        kotlin.jvm.internal.t.f(sessionGenerator, "sessionGenerator");
        this.f3949a = sessionGenerator;
    }

    @Override // e0.g0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0 getDefaultValue() {
        return new g0(this.f3949a.a(null), (x0) null, (Map) null, 6, (kotlin.jvm.internal.k) null);
    }

    @Override // e0.g0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(g0 g0Var, OutputStream outputStream, zc.f<? super wc.g0> fVar) throws IOException {
        outputStream.write(rd.c0.y(kotlinx.serialization.json.b.f21551d.b(g0.Companion.serializer(), g0Var)));
        return wc.g0.f27756a;
    }

    @Override // e0.g0
    public Object readFrom(InputStream inputStream, zc.f<? super g0> fVar) throws CorruptionException {
        try {
            kotlinx.serialization.json.b.a aVar = kotlinx.serialization.json.b.f21551d;
            String strX = rd.c0.x(fd.a.c(inputStream));
            aVar.a();
            return (g0) aVar.c(g0.Companion.serializer(), strX);
        } catch (Exception e10) {
            throw new CorruptionException("Cannot parse session data", e10);
        }
    }
}
