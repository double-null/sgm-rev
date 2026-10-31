package v8;

import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: FlacMetadataReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: compiled from: FlacMetadataReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f27437a;

        public a(y yVar) {
            this.f27437a = yVar;
        }
    }

    public static boolean a(q qVar) throws IOException {
        x7.a0 a0Var = new x7.a0(4);
        qVar.n(a0Var.e(), 0, 4);
        return a0Var.J() == 1716281667;
    }

    public static int b(q qVar) throws IOException {
        qVar.d();
        x7.a0 a0Var = new x7.a0(2);
        qVar.n(a0Var.e(), 0, 2);
        int iP = a0Var.P();
        if ((iP >> 2) == 16382) {
            qVar.d();
            return iP;
        }
        qVar.d();
        throw ParserException.b("First frame does not start with sync code.", null);
    }

    public static u7.v c(q qVar, boolean z10) throws IOException {
        u7.v vVarA = new d0().a(qVar, z10 ? null : j9.h.f20719b);
        if (vVarA == null || vVarA.e() == 0) {
            return null;
        }
        return vVarA;
    }

    public static u7.v d(q qVar, boolean z10) throws IOException {
        qVar.d();
        long jF = qVar.f();
        u7.v vVarC = c(qVar, z10);
        qVar.k((int) (qVar.f() - jF));
        return vVarC;
    }

    public static boolean e(q qVar, a aVar) throws IOException {
        qVar.d();
        x7.z zVar = new x7.z(new byte[4]);
        qVar.n(zVar.f28202a, 0, 4);
        boolean zG = zVar.g();
        int iH = zVar.h(7);
        int iH2 = zVar.h(24) + 4;
        if (iH == 0) {
            aVar.f27437a = h(qVar);
        } else {
            y yVar = aVar.f27437a;
            if (yVar == null) {
                throw new IllegalArgumentException();
            }
            if (iH == 3) {
                aVar.f27437a = yVar.b(f(qVar, iH2));
            } else if (iH == 4) {
                aVar.f27437a = yVar.c(j(qVar, iH2));
            } else if (iH == 6) {
                x7.a0 a0Var = new x7.a0(iH2);
                qVar.readFully(a0Var.e(), 0, iH2);
                a0Var.X(4);
                aVar.f27437a = yVar.a(com.google.common.collect.u.I(h9.a.d(a0Var)));
            } else {
                qVar.k(iH2);
            }
        }
        return zG;
    }

    private static y.a f(q qVar, int i10) throws IOException {
        x7.a0 a0Var = new x7.a0(i10);
        qVar.readFully(a0Var.e(), 0, i10);
        return g(a0Var);
    }

    public static y.a g(x7.a0 a0Var) {
        a0Var.X(1);
        int iK = a0Var.K();
        long jF = ((long) a0Var.f()) + ((long) iK);
        int i10 = iK / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jA = a0Var.A();
            if (jA == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jA;
            jArrCopyOf2[i11] = a0Var.A();
            a0Var.X(2);
        }
        a0Var.X((int) (jF - ((long) a0Var.f())));
        return new y.a(jArrCopyOf, jArrCopyOf2);
    }

    private static y h(q qVar) throws IOException {
        byte[] bArr = new byte[38];
        qVar.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(q qVar) throws IOException {
        x7.a0 a0Var = new x7.a0(4);
        qVar.readFully(a0Var.e(), 0, 4);
        if (a0Var.J() != 1716281667) {
            throw ParserException.b("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(q qVar, int i10) throws IOException {
        x7.a0 a0Var = new x7.a0(i10);
        qVar.readFully(a0Var.e(), 0, i10);
        a0Var.X(4);
        return Arrays.asList(r0.k(a0Var, false, false).f27419b);
    }
}
