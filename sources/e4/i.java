package e4;

import androidx.datastore.core.CorruptionException;
import e0.g0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import rd.c0;

/* JADX INFO: compiled from: SessionConfigs.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements g0<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f14430a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f14431b = new h(null, null, null, null, null);

    private i() {
    }

    @Override // e0.g0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h getDefaultValue() {
        return f14431b;
    }

    @Override // e0.g0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(h hVar, OutputStream outputStream, zc.f<? super wc.g0> fVar) throws IOException {
        outputStream.write(c0.y(kotlinx.serialization.json.b.f21551d.b(h.Companion.serializer(), hVar)));
        return wc.g0.f27756a;
    }

    @Override // e0.g0
    public Object readFrom(InputStream inputStream, zc.f<? super h> fVar) throws CorruptionException {
        try {
            kotlinx.serialization.json.b.a aVar = kotlinx.serialization.json.b.f21551d;
            String strX = c0.x(fd.a.c(inputStream));
            aVar.a();
            return (h) aVar.c(h.Companion.serializer(), strX);
        } catch (Exception e10) {
            throw new CorruptionException("Cannot parse session configs", e10);
        }
    }
}
