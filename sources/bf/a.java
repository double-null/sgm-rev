package bf;

import af.e;
import af.f0;
import af.x;
import java.io.EOFException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f4508a = f0.a("0123456789abcdef");

    public static final byte[] a() {
        return f4508a;
    }

    public static final String b(e eVar, long j10) throws EOFException {
        t.f(eVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.t(j11) == 13) {
                String utf8 = eVar.readUtf8(j11);
                eVar.skip(2L);
                return utf8;
            }
        }
        String utf9 = eVar.readUtf8(j10);
        eVar.skip(1L);
        return utf9;
    }

    public static final int c(e eVar, af.t options, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        x xVar;
        t.f(eVar, "<this>");
        t.f(options, "options");
        x xVar2 = eVar.f352a;
        if (xVar2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = xVar2.f401a;
        int i14 = xVar2.f402b;
        int i15 = xVar2.f403c;
        int[] trie$okio = options.getTrie$okio();
        x xVar3 = xVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = trie$okio[i17];
            int i20 = i18 + 1;
            int i21 = trie$okio[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (xVar3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == trie$okio[i20]) {
                        i11 = trie$okio[i20 + i19];
                        if (i10 == i15) {
                            xVar3 = xVar3.f406f;
                            t.c(xVar3);
                            i10 = xVar3.f402b;
                            bArr = xVar3.f401a;
                            i15 = xVar3.f403c;
                            if (xVar3 == xVar2) {
                                xVar3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != trie$okio[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    t.c(xVar3);
                    x xVar4 = xVar3.f406f;
                    t.c(xVar4);
                    i13 = xVar4.f402b;
                    byte[] bArr2 = xVar4.f401a;
                    i12 = xVar4.f403c;
                    if (xVar4 != xVar2) {
                        xVar = xVar4;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        xVar = null;
                    }
                } else {
                    x xVar5 = xVar3;
                    i12 = i15;
                    i13 = i25;
                    xVar = xVar5;
                }
                if (z11) {
                    i11 = trie$okio[i26];
                    i10 = i13;
                    i15 = i12;
                    xVar3 = xVar;
                    break;
                }
                i14 = i13;
                i15 = i12;
                i20 = i26;
                xVar3 = xVar;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int d(e eVar, af.t tVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c(eVar, tVar, z10);
    }
}
