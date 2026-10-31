package v8;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.a0 f27283a = new x7.a0(10);

    public u7.v a(q qVar, j9.h.a aVar) throws IOException {
        u7.v vVarE = null;
        int i10 = 0;
        while (true) {
            try {
                qVar.n(this.f27283a.e(), 0, 10);
                this.f27283a.W(0);
                if (this.f27283a.K() != 4801587) {
                    break;
                }
                this.f27283a.X(3);
                int iG = this.f27283a.G();
                int i11 = iG + 10;
                if (vVarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f27283a.e(), 0, bArr, 0, 10);
                    qVar.n(bArr, 10, iG);
                    vVarE = new j9.h(aVar).e(bArr, i11);
                } else {
                    qVar.g(iG);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        qVar.d();
        qVar.g(i10);
        return vVarE;
    }
}
