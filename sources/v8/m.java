package v8;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: DiscardingTrackOutput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27382a = new byte[4096];

    @Override // v8.o0
    public void d(x7.a0 a0Var, int i10, int i11) {
        a0Var.X(i10);
    }

    @Override // v8.o0
    public int e(u7.h hVar, int i10, boolean z10, int i11) throws IOException {
        int i12 = hVar.read(this.f27382a, 0, Math.min(this.f27382a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // v8.o0
    public void a(u7.q qVar) {
    }

    @Override // v8.o0
    public void f(long j10, int i10, int i11, int i12, o0.a aVar) {
    }
}
