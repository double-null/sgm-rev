package g9;

import java.nio.ByteBuffer;
import java.util.Arrays;
import u7.v;
import x7.a0;

/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends e9.c {
    @Override // e9.c
    protected v b(e9.b bVar, ByteBuffer byteBuffer) {
        return new v(c(new a0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(a0 a0Var) {
        return new a((String) x7.a.e(a0Var.B()), (String) x7.a.e(a0Var.B()), a0Var.A(), a0Var.A(), Arrays.copyOfRange(a0Var.e(), a0Var.f(), a0Var.g()));
    }
}
