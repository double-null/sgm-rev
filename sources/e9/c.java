package e9;

import java.nio.ByteBuffer;
import u7.v;

/* JADX INFO: compiled from: SimpleMetadataDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements a {
    @Override // e9.a
    public final v a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(bVar.f18057d);
        x7.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract v b(b bVar, ByteBuffer byteBuffer);
}
