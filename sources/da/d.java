package da;

import android.util.Pair;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import v8.q;
import x7.a0;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: compiled from: WavHeaderReader.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f13479b;

        private a(int i10, long j10) {
            this.f13478a = i10;
            this.f13479b = j10;
        }

        public static a a(q qVar, a0 a0Var) throws IOException {
            qVar.n(a0Var.e(), 0, 8);
            a0Var.W(0);
            return new a(a0Var.q(), a0Var.x());
        }
    }

    public static boolean a(q qVar) throws IOException {
        a0 a0Var = new a0(8);
        int i10 = a.a(qVar, a0Var).f13478a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        qVar.n(a0Var.e(), 0, 4);
        a0Var.W(0);
        int iQ = a0Var.q();
        if (iQ == 1463899717) {
            return true;
        }
        r.c("WavHeaderReader", "Unsupported form type: " + iQ);
        return false;
    }

    public static c b(q qVar) throws IOException {
        byte[] bArr;
        a0 a0Var = new a0(16);
        a aVarD = d(1718449184, qVar, a0Var);
        x7.a.g(aVarD.f13479b >= 16);
        qVar.n(a0Var.e(), 0, 16);
        a0Var.W(0);
        int iZ = a0Var.z();
        int iZ2 = a0Var.z();
        int iY = a0Var.y();
        int iY2 = a0Var.y();
        int iZ3 = a0Var.z();
        int iZ4 = a0Var.z();
        int i10 = ((int) aVarD.f13479b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            qVar.n(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = l0.f28141f;
        }
        qVar.k((int) (qVar.f() - qVar.getPosition()));
        return new c(iZ, iZ2, iY, iY2, iZ3, iZ4, bArr);
    }

    public static long c(q qVar) throws IOException {
        a0 a0Var = new a0(8);
        a aVarA = a.a(qVar, a0Var);
        if (aVarA.f13478a != 1685272116) {
            qVar.d();
            return -1L;
        }
        qVar.g(8);
        a0Var.W(0);
        qVar.n(a0Var.e(), 0, 8);
        long jV = a0Var.v();
        qVar.k(((int) aVarA.f13479b) + 8);
        return jV;
    }

    private static a d(int i10, q qVar, a0 a0Var) throws IOException {
        a aVarA = a.a(qVar, a0Var);
        while (aVarA.f13478a != i10) {
            r.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f13478a);
            long j10 = aVarA.f13479b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11++;
            }
            if (j11 > 2147483647L) {
                throw ParserException.f("Chunk is too large (~2GB+) to skip; id: " + aVarA.f13478a);
            }
            qVar.k((int) j11);
            aVarA = a.a(qVar, a0Var);
        }
        return aVarA;
    }

    public static Pair<Long, Long> e(q qVar) throws IOException {
        qVar.d();
        a aVarD = d(1684108385, qVar, new a0(8));
        qVar.k(8);
        return Pair.create(Long.valueOf(qVar.getPosition()), Long.valueOf(aVarD.f13479b));
    }
}
