package ne;

import af.e;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.t;
import rd.c0;
import rd.f0;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final boolean a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (t.g(cCharAt, 31) <= 0 || t.g(cCharAt, 127) >= 0 || f0.h0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    private static final boolean b(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (t.g(cCharAt, 48) < 0 || t.g(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[LOOP:1: B:30:0x0069->B:34:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x007c A[EDGE_INSN: B:55:0x007c->B:35:0x007c BREAK  A[LOOP:1: B:30:0x0069->B:34:0x0076], SYNTHETIC] */
    private static final InetAddress c(String str, int i10, int i11) {
        int i12;
        int i13;
        int I;
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        while (i14 < i11) {
            if (i17 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && c0.N(str, "::", i14, false, 4, null)) {
                if (i15 != -1) {
                    return null;
                }
                i17 += 2;
                if (i18 == i11) {
                    i15 = i17;
                    break;
                }
                i16 = i18;
                i15 = i17;
                i14 = i16;
                i12 = 0;
                while (i14 < i11) {
                    I = d.I(str.charAt(i14));
                    if (I == -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + I;
                    i14++;
                }
                i13 = i14 - i16;
                if (i13 != 0) {
                }
                return null;
            }
            if (i17 != 0) {
                if (!c0.N(str, ":", i14, false, 4, null)) {
                    if (!c0.N(str, ".", i14, false, 4, null) || !b(str, i16, i11, bArr, i17 - 2)) {
                        return null;
                    }
                    i17 += 2;
                    break;
                }
                i14++;
            }
            i16 = i14;
            i14 = i16;
            i12 = 0;
            while (i14 < i11) {
                I = d.I(str.charAt(i14));
                if (I == -1) {
                    break;
                }
                i12 = (i12 << 4) + I;
                i14++;
            }
            i13 = i14 - i16;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i19 = i17 + 1;
            bArr[i17] = (byte) ((i12 >>> 8) & 255);
            i17 = i19 + 1;
            bArr[i19] = (byte) (i12 & 255);
        }
        if (i17 != 16) {
            if (i15 == -1) {
                return null;
            }
            int i20 = i17 - i15;
            System.arraycopy(bArr, i15, bArr, 16 - i20, i20);
            Arrays.fill(bArr, i15, (16 - i17) + i15, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String d(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        e eVar = new e();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                eVar.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    eVar.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    eVar.writeByte(58);
                }
                eVar.writeHexadecimalUnsignedLong((d.d(bArr[i11], 255) << 8) | d.d(bArr[i11 + 1], 255));
                i11 += 2;
            }
        }
        return eVar.readUtf8();
    }

    public static final String e(String str) {
        t.f(str, "<this>");
        if (!f0.U(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                t.e(ascii, "toASCII(host)");
                Locale US = Locale.US;
                t.e(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if ((lowerCase.length() == 0) || a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressC = (c0.O(str, "[", false, 2, null) && c0.A(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            t.e(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
