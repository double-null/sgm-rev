package j9;

import com.google.common.collect.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import u7.v;
import u7.w;
import x7.a0;
import x7.l0;
import x7.r;
import x7.z;

/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends e9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20719b = new a() { // from class: j9.g
        @Override // j9.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return h.A(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f20720a;

    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: compiled from: Id3Decoder.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f20721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f20722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20723c;

        public b(int i10, boolean z10, int i11) {
            this.f20721a = i10;
            this.f20722b = z10;
            this.f20723c = i11;
        }
    }

    public h() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean A(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static int B(a0 a0Var, int i10) {
        byte[] bArrE = a0Var.e();
        int iF = a0Var.f();
        int i11 = iF;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iF + i10) {
                return i10;
            }
            if ((bArrE[i11] & 255) == 255 && bArrE[i12] == 0) {
                System.arraycopy(bArrE, i11 + 2, bArrE, i12, (i10 - (i11 - iF)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[PHI: r3
      0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean C(a0 a0Var, int i10, int i11, boolean z10) {
        int iK;
        long jK;
        int iP;
        int i12;
        int iF = a0Var.f();
        while (true) {
            try {
                boolean z11 = true;
                if (a0Var.a() < i11) {
                    a0Var.W(iF);
                    return true;
                }
                if (i10 >= 3) {
                    iK = a0Var.q();
                    jK = a0Var.J();
                    iP = a0Var.P();
                } else {
                    iK = a0Var.K();
                    jK = a0Var.K();
                    iP = 0;
                }
                if (iK == 0 && jK == 0 && iP == 0) {
                    a0Var.W(iF);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jK) != 0) {
                        a0Var.W(iF);
                        return false;
                    }
                    jK = (((jK >> 24) & 255) << 21) | (jK & 255) | (((jK >> 8) & 255) << 7) | (((jK >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iP & 64) != 0 ? 1 : 0;
                    if ((iP & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iP & 32) != 0 ? 1 : 0;
                    if ((iP & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jK < i12) {
                    a0Var.W(iF);
                    return false;
                }
                if (a0Var.a() < jK) {
                    a0Var.W(iF);
                    return false;
                }
                a0Var.X((int) jK);
            } catch (Throwable th) {
                a0Var.W(iF);
                throw th;
            }
        }
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? l0.f28141f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static j9.a f(a0 a0Var, int i10, int i11) {
        int iZ;
        String str;
        int iH = a0Var.H();
        Charset charsetW = w(iH);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        a0Var.l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + com.google.common.base.c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = com.google.common.base.c.e(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iZ + 1] & 255;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iH);
        return new j9.a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iH), i12));
    }

    private static j9.b g(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        return new j9.b(str, bArr);
    }

    private static c h(a0 a0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int iF = a0Var.f();
        int iZ = z(a0Var.e(), iF);
        String str = new String(a0Var.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        a0Var.W(iZ + 1);
        int iQ = a0Var.q();
        int iQ2 = a0Var.q();
        long J = a0Var.J();
        long j10 = J == 4294967295L ? -1L : J;
        long J2 = a0Var.J();
        long j11 = J2 == 4294967295L ? -1L : J2;
        ArrayList arrayList = new ArrayList();
        int i13 = iF + i10;
        while (a0Var.f() < i13) {
            i iVarK = k(i11, a0Var, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iQ, iQ2, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(a0 a0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int iF = a0Var.f();
        int iZ = z(a0Var.e(), iF);
        String str = new String(a0Var.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        a0Var.W(iZ + 1);
        int iH = a0Var.H();
        boolean z11 = (iH & 2) != 0;
        boolean z12 = (iH & 1) != 0;
        int iH2 = a0Var.H();
        String[] strArr = new String[iH2];
        for (int i13 = 0; i13 < iH2; i13++) {
            int iF2 = a0Var.f();
            int iZ2 = z(a0Var.e(), iF2);
            strArr[i13] = new String(a0Var.e(), iF2, iZ2 - iF2, StandardCharsets.ISO_8859_1);
            a0Var.W(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iF + i10;
        while (a0Var.f() < i14) {
            i iVarK = k(i11, a0Var, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(a0 a0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iH = a0Var.H();
        Charset charsetW = w(iH);
        byte[] bArr = new byte[3];
        a0Var.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        a0Var.l(bArr2, 0, i11);
        int iY = y(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iH);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iH), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:137:0x019c  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ee A[Catch: all -> 0x012c, Exception -> 0x012f, OutOfMemoryError -> 0x0132, TRY_LEAVE, TryCatch #2 {Exception -> 0x012f, OutOfMemoryError -> 0x0132, all -> 0x012c, blocks: (B:91:0x011a, B:93:0x0122, B:106:0x0141, B:108:0x0149, B:116:0x0163, B:125:0x017b, B:136:0x0196, B:143:0x01a8, B:149:0x01b7, B:154:0x01cf, B:160:0x01e9, B:161:0x01ee), top: B:171:0x0110 }] */
    private static i k(int i10, a0 a0Var, boolean z10, int i11, a aVar) {
        int iL;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        i iVarG;
        int iH = a0Var.H();
        int iH2 = a0Var.H();
        int iH3 = a0Var.H();
        int iH4 = i10 >= 3 ? a0Var.H() : 0;
        if (i10 == 4) {
            iL = a0Var.L();
            if (!z10) {
                iL = (((iL >> 24) & 255) << 21) | (iL & 255) | (((iL >> 8) & 255) << 7) | (((iL >> 16) & 255) << 14);
            }
        } else {
            iL = i10 == 3 ? a0Var.L() : a0Var.K();
        }
        int iB = iL;
        int iP = i10 >= 3 ? a0Var.P() : 0;
        i iVar = null;
        if (iH == 0 && iH2 == 0 && iH3 == 0 && iH4 == 0 && iB == 0 && iP == 0) {
            a0Var.W(a0Var.g());
            return null;
        }
        int iF = a0Var.f() + iB;
        if (iF > a0Var.g()) {
            r.h("Id3Decoder", "Frame size exceeds remaining tag data");
            a0Var.W(a0Var.g());
            return null;
        }
        if (aVar != null) {
            i12 = iF;
            if (!aVar.a(i10, iH, iH2, iH3, iH4)) {
                a0Var.W(i12);
                return null;
            }
        } else {
            i12 = iF;
        }
        if (i10 == 3) {
            boolean z16 = (iP & 128) != 0;
            z15 = (iP & 64) != 0;
            z14 = false;
            z13 = z16;
            z12 = (iP & 32) != 0;
            z11 = z13;
        } else if (i10 == 4) {
            z12 = (iP & 64) != 0;
            boolean z17 = (iP & 8) != 0;
            boolean z18 = (iP & 4) != 0;
            z14 = (iP & 2) != 0;
            z15 = z18;
            boolean z19 = z17;
            z13 = (iP & 1) != 0;
            z11 = z19;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z11 || z15) {
            r.h("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            a0Var.W(i12);
            return null;
        }
        if (z12) {
            iB--;
            a0Var.X(1);
        }
        if (z13) {
            iB -= 4;
            a0Var.X(4);
        }
        if (z14) {
            iB = B(a0Var, iB);
        }
        try {
            if (iH == 84 && iH2 == 88 && iH3 == 88 && (i10 == 2 || iH4 == 88)) {
                iVarG = s(a0Var, iB);
            } else if (iH == 84) {
                iVarG = q(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
            } else if (iH == 87 && iH2 == 88 && iH3 == 88 && (i10 == 2 || iH4 == 88)) {
                iVarG = u(a0Var, iB);
            } else if (iH == 87) {
                iVarG = t(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
            } else if (iH == 80 && iH2 == 82 && iH3 == 73 && iH4 == 86) {
                iVarG = o(a0Var, iB);
            } else if (iH == 71 && iH2 == 69 && iH3 == 79 && (iH4 == 66 || i10 == 2)) {
                iVarG = l(a0Var, iB);
            } else if (i10 == 2) {
                if (iH == 80 && iH2 == 73 && iH3 == 67) {
                    iVarG = f(a0Var, iB, i10);
                } else if (iH != 67 && iH2 == 79 && iH3 == 77 && (iH4 == 77 || i10 == 2)) {
                    iVarG = j(a0Var, iB);
                } else if (iH != 67 && iH2 == 72 && iH3 == 65 && iH4 == 80) {
                    iVarG = h(a0Var, iB, i10, z10, i11, aVar);
                } else if (iH != 67 && iH2 == 84 && iH3 == 79 && iH4 == 67) {
                    iVarG = i(a0Var, iB, i10, z10, i11, aVar);
                } else if (iH != 77 && iH2 == 76 && iH3 == 76 && iH4 == 84) {
                    iVarG = n(a0Var, iB);
                } else {
                    iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                }
            } else if (iH == 65 && iH2 == 80 && iH3 == 73 && iH4 == 67) {
                iVarG = f(a0Var, iB, i10);
            } else if (iH != 67) {
                if (iH != 67) {
                    if (iH != 67) {
                        if (iH != 77) {
                            iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                        } else {
                            iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                        }
                    } else if (iH != 77) {
                        iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                    } else {
                        iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                    }
                } else if (iH != 67) {
                    if (iH != 77) {
                        iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                    } else {
                        iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                    }
                } else if (iH != 77) {
                    iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                } else {
                    iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                }
            } else if (iH != 67) {
                if (iH != 67) {
                    if (iH != 77) {
                        iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                    } else {
                        iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                    }
                } else if (iH != 77) {
                    iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                } else {
                    iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                }
            } else if (iH != 67) {
                if (iH != 77) {
                    iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                } else {
                    iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
                }
            } else if (iH != 77) {
                iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
            } else {
                iVarG = g(a0Var, iB, x(i10, iH, iH2, iH3, iH4));
            }
            a0Var.W(i12);
            iVar = iVarG;
            e = null;
        } catch (Exception e10) {
            e = e10;
        } catch (OutOfMemoryError e11) {
            e = e11;
        } finally {
            a0Var.W(i12);
        }
        if (iVar == null) {
            r.i("Id3Decoder", "Failed to decode frame: id=" + x(i10, iH, iH2, iH3, iH4) + ", frameSize=" + iB, e);
        }
        return iVar;
    }

    private static f l(a0 a0Var, int i10) {
        int iH = a0Var.H();
        Charset charsetW = w(iH);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strU = w.u(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iH);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iH);
        int iY2 = y(bArr, iV, iH);
        return new f(strU, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iH), i11));
    }

    private static b m(a0 a0Var) {
        if (a0Var.a() < 10) {
            r.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iK = a0Var.K();
        boolean z10 = false;
        if (iK != 4801587) {
            r.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iK)));
            return null;
        }
        int iH = a0Var.H();
        a0Var.X(1);
        int iH2 = a0Var.H();
        int iG = a0Var.G();
        if (iH == 2) {
            if ((iH2 & 64) != 0) {
                r.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iH == 3) {
            if ((iH2 & 64) != 0) {
                int iQ = a0Var.q();
                a0Var.X(iQ);
                iG -= iQ + 4;
            }
        } else {
            if (iH != 4) {
                r.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iH);
                return null;
            }
            if ((iH2 & 64) != 0) {
                int iG2 = a0Var.G();
                a0Var.X(iG2 - 4);
                iG -= iG2;
            }
            if ((iH2 & 16) != 0) {
                iG -= 10;
            }
        }
        if (iH < 4 && (iH2 & 128) != 0) {
            z10 = true;
        }
        return new b(iH, z10, iG);
    }

    private static l n(a0 a0Var, int i10) {
        int iP = a0Var.P();
        int iK = a0Var.K();
        int iK2 = a0Var.K();
        int iH = a0Var.H();
        int iH2 = a0Var.H();
        z zVar = new z();
        zVar.m(a0Var);
        int i11 = ((i10 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH3 = zVar.h(iH);
            int iH4 = zVar.h(iH2);
            iArr[i12] = iH3;
            iArr2[i12] = iH4;
        }
        return new l(iP, iK, iK2, iArr, iArr2);
    }

    private static m o(a0 a0Var, int i10) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static n q(a0 a0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iH = a0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        return new n(str, null, r(bArr, iH, 0));
    }

    private static u<String> r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return u.I("");
        }
        u.a aVarV = u.v();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            aVarV.a(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        u<String> uVarM = aVarV.m();
        return uVarM.isEmpty() ? u.I("") : uVarM;
    }

    private static n s(a0 a0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = a0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        return new n("TXXX", new String(bArr, 0, iY, w(iH)), r(bArr, iH, iY + v(iH)));
    }

    private static o t(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(a0 a0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iH = a0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int iY = y(bArr, 0, iH);
        String str = new String(bArr, 0, iY, w(iH));
        int iV = iY + v(iH);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // e9.c
    protected v b(e9.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public v e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        b bVarM = m(a0Var);
        if (bVarM == null) {
            return null;
        }
        int iF = a0Var.f();
        int i11 = bVarM.f20721a == 2 ? 6 : 10;
        int iB = bVarM.f20723c;
        if (bVarM.f20722b) {
            iB = B(a0Var, bVarM.f20723c);
        }
        a0Var.V(iF + iB);
        boolean z10 = false;
        if (!C(a0Var, bVarM.f20721a, i11, false)) {
            if (bVarM.f20721a != 4 || !C(a0Var, 4, i11, true)) {
                r.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f20721a);
                return null;
            }
            z10 = true;
        }
        while (a0Var.a() >= i11) {
            i iVarK = k(bVarM.f20721a, a0Var, z10, i11, this.f20720a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new v(arrayList);
    }

    public h(a aVar) {
        this.f20720a = aVar;
    }
}
