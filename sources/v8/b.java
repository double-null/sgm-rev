package v8;

import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Ac3Util.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f27228a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f27229b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f27230c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f27231d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f27232e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, UserVerificationMethods.USER_VERIFY_HANDPRINT, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f27233f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: v8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ac3Util.java */
    public static final class C0453b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f27236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f27238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f27239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f27240g;

        private C0453b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f27234a = str;
            this.f27235b = i10;
            this.f27237d = i11;
            this.f27236c = i12;
            this.f27238e = i13;
            this.f27239f = i14;
            this.f27240g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((x7.l0.P(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f27229b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f27233f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f27232e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static u7.q d(x7.a0 a0Var, String str, String str2, u7.l lVar) {
        x7.z zVar = new x7.z();
        zVar.m(a0Var);
        int i10 = f27229b[zVar.h(2)];
        zVar.r(8);
        int i11 = f27231d[zVar.h(3)];
        if (zVar.h(1) != 0) {
            i11++;
        }
        int i12 = f27232e[zVar.h(5)] * 1000;
        zVar.c();
        a0Var.W(zVar.d());
        return new u7.q.b().f0(str).u0("audio/ac3").R(i11).v0(i10).Y(lVar).j0(str2).Q(i12).p0(i12).N();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f27228a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 1536;
    }

    public static C0453b f(x7.z zVar) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iE = zVar.e();
        zVar.r(40);
        boolean z10 = zVar.h(5) > 10;
        zVar.p(iE);
        int i22 = -1;
        if (z10) {
            zVar.r(16);
            int iH = zVar.h(2);
            if (iH == 0) {
                i22 = 0;
            } else if (iH == 1) {
                i22 = 1;
            } else if (iH == 2) {
                i22 = 2;
            }
            zVar.r(3);
            int iH2 = (zVar.h(11) + 1) * 2;
            int iH3 = zVar.h(2);
            if (iH3 == 3) {
                i17 = f27230c[zVar.h(2)];
                i16 = 3;
                i18 = 6;
            } else {
                int iH4 = zVar.h(2);
                int i23 = f27228a[iH4];
                i16 = iH4;
                i17 = f27229b[iH3];
                i18 = i23;
            }
            int i24 = i18 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
            int iA = a(iH2, i17, i18);
            int iH5 = zVar.h(3);
            boolean zG = zVar.g();
            i10 = f27231d[iH5] + (zG ? 1 : 0);
            zVar.r(10);
            if (zVar.g()) {
                zVar.r(8);
            }
            if (iH5 == 0) {
                zVar.r(5);
                if (zVar.g()) {
                    zVar.r(8);
                }
            }
            if (i22 == 1 && zVar.g()) {
                zVar.r(16);
            }
            if (zVar.g()) {
                if (iH5 > 2) {
                    zVar.r(2);
                }
                if ((iH5 & 1) == 0 || iH5 <= 2) {
                    i20 = 6;
                } else {
                    i20 = 6;
                    zVar.r(6);
                }
                if ((iH5 & 4) != 0) {
                    zVar.r(i20);
                }
                if (zG && zVar.g()) {
                    zVar.r(5);
                }
                if (i22 == 0) {
                    if (zVar.g()) {
                        i21 = 6;
                        zVar.r(6);
                    } else {
                        i21 = 6;
                    }
                    if (iH5 == 0 && zVar.g()) {
                        zVar.r(i21);
                    }
                    if (zVar.g()) {
                        zVar.r(i21);
                    }
                    int iH6 = zVar.h(2);
                    if (iH6 == 1) {
                        zVar.r(5);
                    } else if (iH6 == 2) {
                        zVar.r(12);
                    } else if (iH6 == 3) {
                        int iH7 = zVar.h(5);
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                            }
                        }
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(7);
                                if (zVar.g()) {
                                    zVar.r(8);
                                }
                            }
                        }
                        zVar.r((iH7 + 2) * 8);
                        zVar.c();
                    }
                    if (iH5 < 2) {
                        if (zVar.g()) {
                            zVar.r(14);
                        }
                        if (iH5 == 0 && zVar.g()) {
                            zVar.r(14);
                        }
                    }
                    if (zVar.g()) {
                        if (i16 == 0) {
                            zVar.r(5);
                        } else {
                            for (int i25 = 0; i25 < i18; i25++) {
                                if (zVar.g()) {
                                    zVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.g()) {
                zVar.r(5);
                if (iH5 == 2) {
                    zVar.r(4);
                }
                if (iH5 >= 6) {
                    zVar.r(2);
                }
                if (zVar.g()) {
                    zVar.r(8);
                }
                if (iH5 == 0 && zVar.g()) {
                    zVar.r(8);
                }
                if (iH3 < 3) {
                    zVar.q();
                }
            }
            if (i22 == 0 && i16 != 3) {
                zVar.q();
            }
            if (i22 == 2 && (i16 == 3 || zVar.g())) {
                i19 = 6;
                zVar.r(6);
            } else {
                i19 = 6;
            }
            str = (zVar.g() && zVar.h(i19) == 1 && zVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i22;
            i12 = i24;
            i14 = iH2;
            i15 = i17;
            i13 = iA;
        } else {
            zVar.r(32);
            int iH8 = zVar.h(2);
            String str2 = iH8 == 3 ? null : "audio/ac3";
            int iH9 = zVar.h(6);
            int i26 = f27232e[iH9 / 2] * 1000;
            int iC = c(iH8, iH9);
            zVar.r(8);
            int iH10 = zVar.h(3);
            if ((iH10 & 1) != 0 && iH10 != 1) {
                zVar.r(2);
            }
            if ((iH10 & 4) != 0) {
                zVar.r(2);
            }
            if (iH10 == 2) {
                zVar.r(2);
            }
            int[] iArr = f27229b;
            int i27 = iH8 < iArr.length ? iArr[iH8] : -1;
            i10 = f27231d[iH10] + (zVar.g() ? 1 : 0);
            i11 = -1;
            str = str2;
            i12 = 1536;
            i13 = i26;
            i14 = iC;
            i15 = i27;
        }
        return new C0453b(str, i11, i10, i15, i14, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static u7.q h(x7.a0 a0Var, String str, String str2, u7.l lVar) {
        String str3;
        x7.z zVar = new x7.z();
        zVar.m(a0Var);
        int iH = zVar.h(13) * 1000;
        zVar.r(3);
        int i10 = f27229b[zVar.h(2)];
        zVar.r(10);
        int i11 = f27231d[zVar.h(3)];
        if (zVar.h(1) != 0) {
            i11++;
        }
        zVar.r(3);
        int iH2 = zVar.h(4);
        zVar.r(1);
        if (iH2 > 0) {
            zVar.r(6);
            if (zVar.h(1) != 0) {
                i11 += 2;
            }
            zVar.r(1);
        }
        if (zVar.b() > 7) {
            zVar.r(7);
            if (zVar.h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zVar.c();
        a0Var.W(zVar.d());
        return new u7.q.b().f0(str).u0(str3).R(i11).v0(i10).Y(lVar).j0(str2).p0(iH).N();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
