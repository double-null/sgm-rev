package com.applovin.shadow.okio;

import com.vungle.ads.internal.protos.Sdk;
import wc.g0;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i10) {
        if (i10 >= 0 && i10 < 32) {
            return true;
        }
        return 127 <= i10 && i10 < 160;
    }

    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i10, int i11, id.l<? super Integer, g0> yield) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        kotlin.jvm.internal.t.f(yield, "yield");
        int i12 = i10 + 1;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if (!((b11 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i10, int i11, id.l<? super Integer, g0> yield) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        kotlin.jvm.internal.t.f(yield, "yield");
        int i12 = i10 + 2;
        boolean z10 = false;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            if (i11 > i13) {
                if ((bArr[i13] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (!((b11 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i12];
        if (!((b12 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i14 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 <= i14 && i14 < 57344) {
            z10 = true;
        }
        if (z10) {
            yield.invoke(numValueOf);
            return 3;
        }
        yield.invoke(Integer.valueOf(i14));
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i10, int i11, id.l<? super Integer, g0> yield) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        kotlin.jvm.internal.t.f(yield, "yield");
        int i12 = i10 + 3;
        boolean z10 = false;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            if (i11 > i13) {
                if ((bArr[i13] & 192) == 128) {
                    int i14 = i10 + 2;
                    if (i11 > i14) {
                        if ((bArr[i14] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (!((b11 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if (!((b12 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b13 = bArr[i12];
        if (!((b13 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
        if (i15 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i15 && i15 < 57344) {
            z10 = true;
        }
        if (z10) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i15 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i15));
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    public static final void processUtf16Chars(byte[] bArr, int i10, int i11, id.l<? super Character, g0> yield) {
        int i12;
        char c10;
        kotlin.jvm.internal.t.f(bArr, "<this>");
        kotlin.jvm.internal.t.f(yield, "yield");
        int i13 = i10;
        while (i13 < i11) {
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                yield.invoke(Character.valueOf((char) b10));
                i13++;
                while (i13 < i11) {
                    byte b11 = bArr[i13];
                    if (b11 < 0) {
                        break;
                    }
                    i13++;
                    yield.invoke(Character.valueOf((char) b11));
                }
            } else {
                boolean z10 = false;
                if ((b10 >> 5) == -2) {
                    int i14 = i13 + 1;
                    if (i11 > i14) {
                        byte b12 = bArr[i14];
                        if ((b12 & 192) == 128) {
                            int i15 = (b10 << 6) ^ (b12 ^ 3968);
                            yield.invoke(Character.valueOf(i15 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i15));
                            g0 g0Var = g0.f27756a;
                            i12 = 2;
                            i13 += i12;
                        }
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    g0 g0Var2 = g0.f27756a;
                    i12 = 1;
                    i13 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i16 = i13 + 2;
                    if (i11 <= i16) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        g0 g0Var3 = g0.f27756a;
                        int i17 = i13 + 1;
                        if (i11 > i17) {
                            if ((bArr[i17] & 192) == 128) {
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b13 = bArr[i13 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i16];
                            if ((b14 & 192) == 128) {
                                int i18 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i18 >= 2048) {
                                    if (55296 <= i18 && i18 < 57344) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        c10 = (char) REPLACEMENT_CODE_POINT;
                                    } else {
                                        c10 = (char) i18;
                                    }
                                } else {
                                    c10 = (char) REPLACEMENT_CODE_POINT;
                                }
                                yield.invoke(Character.valueOf(c10));
                                g0 g0Var4 = g0.f27756a;
                                i12 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                g0 g0Var5 = g0.f27756a;
                                i12 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            g0 g0Var6 = g0.f27756a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i19 = i13 + 3;
                    if (i11 <= i19) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        g0 g0Var7 = g0.f27756a;
                        int i20 = i13 + 1;
                        if (i11 > i20) {
                            if ((bArr[i20] & 192) == 128) {
                                int i21 = i13 + 2;
                                if (i11 > i21) {
                                    if ((bArr[i21] & 192) == 128) {
                                        i12 = 3;
                                    }
                                }
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b15 = bArr[i13 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i13 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = bArr[i19];
                                if ((b17 & 192) == 128) {
                                    int i22 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i22 <= 1114111) {
                                        if (55296 <= i22 && i22 < 57344) {
                                            z10 = true;
                                        }
                                        if (z10 || i22 < 65536 || i22 == 65533) {
                                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                        } else {
                                            yield.invoke(Character.valueOf((char) ((i22 >>> 10) + HIGH_SURROGATE_HEADER)));
                                            yield.invoke(Character.valueOf((char) ((i22 & 1023) + LOG_SURROGATE_HEADER)));
                                        }
                                    } else {
                                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    }
                                    g0 g0Var8 = g0.f27756a;
                                    i12 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    g0 g0Var9 = g0.f27756a;
                                    i12 = 3;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                g0 g0Var10 = g0.f27756a;
                                i12 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            g0 g0Var11 = g0.f27756a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    i13++;
                }
            }
        }
    }

    public static final void processUtf8Bytes(String str, int i10, int i11, id.l<? super Byte, g0> yield) {
        int i12;
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(yield, "yield");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (kotlin.jvm.internal.t.g(cCharAt, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt));
                i10++;
                while (i10 < i11 && kotlin.jvm.internal.t.g(str.charAt(i10), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i10)));
                    i10++;
                }
            } else {
                if (kotlin.jvm.internal.t.g(cCharAt, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                } else {
                    boolean z10 = false;
                    if (55296 <= cCharAt && cCharAt < 57344) {
                        if (kotlin.jvm.internal.t.g(cCharAt, 56319) <= 0 && i11 > (i12 = i10 + 1)) {
                            char cCharAt2 = str.charAt(i12);
                            if (56320 <= cCharAt2 && cCharAt2 < 57344) {
                                z10 = true;
                            }
                            if (z10) {
                                int iCharAt = ((cCharAt << '\n') + str.charAt(i12)) - 56613888;
                                yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                                yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                                yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                                yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                                i10 += 2;
                            }
                        }
                        yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                    } else {
                        yield.invoke(Byte.valueOf((byte) ((cCharAt >> '\f') | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE)));
                        yield.invoke(Byte.valueOf((byte) (((cCharAt >> 6) & 63) | 128)));
                        yield.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                    }
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    public static final void processUtf8CodePoints(byte[] bArr, int i10, int i11, id.l<? super Integer, g0> yield) {
        int i12;
        Integer numValueOf;
        Integer numValueOf2;
        kotlin.jvm.internal.t.f(bArr, "<this>");
        kotlin.jvm.internal.t.f(yield, "yield");
        int i13 = i10;
        while (i13 < i11) {
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                yield.invoke(Integer.valueOf(b10));
                i13++;
                while (i13 < i11) {
                    byte b11 = bArr[i13];
                    if (b11 < 0) {
                        break;
                    }
                    i13++;
                    yield.invoke(Integer.valueOf(b11));
                }
            } else {
                boolean z10 = false;
                if ((b10 >> 5) == -2) {
                    int i14 = i13 + 1;
                    if (i11 > i14) {
                        byte b12 = bArr[i14];
                        if ((b12 & 192) == 128) {
                            int i15 = (b10 << 6) ^ (b12 ^ 3968);
                            yield.invoke(i15 < 128 ? Integer.valueOf(REPLACEMENT_CODE_POINT) : Integer.valueOf(i15));
                            g0 g0Var = g0.f27756a;
                            i12 = 2;
                            i13 += i12;
                        }
                    }
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    g0 g0Var2 = g0.f27756a;
                    i12 = 1;
                    i13 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i16 = i13 + 2;
                    if (i11 <= i16) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        g0 g0Var3 = g0.f27756a;
                        int i17 = i13 + 1;
                        if (i11 > i17) {
                            if ((bArr[i17] & 192) == 128) {
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b13 = bArr[i13 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i16];
                            if ((b14 & 192) == 128) {
                                int i18 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i18 >= 2048) {
                                    if (55296 <= i18 && i18 < 57344) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
                                    } else {
                                        numValueOf = Integer.valueOf(i18);
                                    }
                                } else {
                                    numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
                                }
                                yield.invoke(numValueOf);
                                g0 g0Var4 = g0.f27756a;
                                i12 = 3;
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                g0 g0Var5 = g0.f27756a;
                                i12 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            g0 g0Var6 = g0.f27756a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i19 = i13 + 3;
                    if (i11 <= i19) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        g0 g0Var7 = g0.f27756a;
                        int i20 = i13 + 1;
                        if (i11 > i20) {
                            if ((bArr[i20] & 192) == 128) {
                                int i21 = i13 + 2;
                                if (i11 > i21) {
                                    if ((bArr[i21] & 192) == 128) {
                                        i12 = 3;
                                    }
                                }
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b15 = bArr[i13 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i13 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = bArr[i19];
                                if ((b17 & 192) == 128) {
                                    int i22 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i22 <= 1114111) {
                                        if (55296 <= i22 && i22 < 57344) {
                                            z10 = true;
                                        }
                                        if (!z10 && i22 >= 65536) {
                                            numValueOf2 = Integer.valueOf(i22);
                                        } else {
                                            numValueOf2 = Integer.valueOf(REPLACEMENT_CODE_POINT);
                                        }
                                    } else {
                                        numValueOf2 = Integer.valueOf(REPLACEMENT_CODE_POINT);
                                    }
                                    yield.invoke(numValueOf2);
                                    g0 g0Var8 = g0.f27756a;
                                    i12 = 4;
                                } else {
                                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    g0 g0Var9 = g0.f27756a;
                                    i12 = 3;
                                }
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                g0 g0Var10 = g0.f27756a;
                                i12 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            g0 g0Var11 = g0.f27756a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else {
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    i13++;
                }
            }
        }
    }

    public static final long size(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return size(str, i10, i11);
    }

    public static final long size(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return size$default(str, i10, 0, 2, null);
    }

    public static final long size(String str, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.t.f(str, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 >= i10) {
            if (!(i11 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            long j10 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt < 128) {
                    j10++;
                } else {
                    if (cCharAt < 2048) {
                        i12 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i12 = 3;
                    } else {
                        int i13 = i10 + 1;
                        char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j10++;
                            i10 = i13;
                        } else {
                            j10 += (long) 4;
                            i10 += 2;
                        }
                    }
                    j10 += (long) i12;
                }
                i10++;
            }
            return j10;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
    }
}
