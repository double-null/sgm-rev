package p9;

import java.io.IOException;
import v8.n0;
import x7.a0;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f23667a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f23667a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static n0 b(v8.q qVar) throws IOException {
        return c(qVar, true, false);
    }

    private static n0 c(v8.q qVar, boolean z10, boolean z11) throws IOException {
        int i10;
        int i11;
        int i12;
        boolean z12;
        int[] iArr;
        long length = qVar.getLength();
        long j10 = -1;
        long j11 = 4096;
        if (length != -1 && length <= 4096) {
            j11 = length;
        }
        int i13 = (int) j11;
        a0 a0Var = new a0(64);
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            if (i15 < i13) {
                a0Var.S(8);
                if (qVar.b(a0Var.e(), i14, 8, true)) {
                    long J = a0Var.J();
                    int iQ = a0Var.q();
                    if (J == 1) {
                        qVar.n(a0Var.e(), 8, 8);
                        i11 = 16;
                        a0Var.V(16);
                        J = a0Var.A();
                    } else {
                        if (J == 0) {
                            long length2 = qVar.getLength();
                            if (length2 != j10) {
                                J = (length2 - qVar.f()) + ((long) 8);
                            }
                        }
                        i11 = 8;
                    }
                    long j12 = J;
                    long j13 = i11;
                    if (j12 < j13) {
                        return new a(iQ, j12, i11);
                    }
                    i15 += i11;
                    if (iQ == 1836019574) {
                        i13 += (int) j12;
                        if (length != -1 && i13 > length) {
                            i13 = (int) length;
                        }
                    } else {
                        if (iQ == 1836019558 || iQ == 1836475768) {
                            i10 = 1;
                            break;
                        }
                        long j14 = length;
                        if (iQ == 1835295092) {
                            z13 = true;
                        }
                        if ((((long) i15) + j12) - j13 >= i13) {
                            i10 = 0;
                            break;
                        }
                        int i16 = (int) (j12 - j13);
                        i15 += i16;
                        if (iQ != 1718909296) {
                            i12 = 0;
                            if (i16 != 0) {
                                qVar.g(i16);
                            }
                        } else {
                            if (i16 < 8) {
                                return new a(iQ, i16, 8);
                            }
                            a0Var.S(i16);
                            i12 = 0;
                            qVar.n(a0Var.e(), 0, i16);
                            int iQ2 = a0Var.q();
                            if (a(iQ2, z11)) {
                                z13 = true;
                            }
                            a0Var.X(4);
                            int iA = a0Var.a() / 4;
                            if (!z13 && iA > 0) {
                                iArr = new int[iA];
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= iA) {
                                        z12 = z13;
                                        break;
                                    }
                                    int iQ3 = a0Var.q();
                                    iArr[i17] = iQ3;
                                    if (a(iQ3, z11)) {
                                        z12 = true;
                                        break;
                                    }
                                    i17++;
                                }
                            } else {
                                z12 = z13;
                                iArr = null;
                            }
                            if (!z12) {
                                return new x(iQ2, iArr);
                            }
                            z13 = z12;
                        }
                        i14 = i12;
                        length = j14;
                    }
                    j10 = -1;
                }
            }
            i10 = i14;
            break;
        }
        if (!z13) {
            return o.f23654a;
        }
        if (z10 != i10) {
            return i10 != 0 ? i.f23620b : i.f23621c;
        }
        return null;
    }

    public static n0 d(v8.q qVar, boolean z10) throws IOException {
        return c(qVar, false, z10);
    }
}
