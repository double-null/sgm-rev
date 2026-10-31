package ue;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import kotlin.jvm.internal.t;
import rd.c0;

/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f26890a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final af.h f26891b = af.h.f361d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f26892c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f26893d = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f26894e;

    static {
        String[] strArr = new String[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            t.e(binaryString, "toBinaryString(it)");
            strArr[i11] = c0.J(ne.d.t("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f26894e = strArr;
        String[] strArr2 = f26893d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = t.n("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f26893d;
            int i15 = i14 | i13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i14]);
            sb2.append('|');
            sb2.append((Object) strArr3[i13]);
            strArr3[i15] = sb2.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f26893d.length;
        while (i10 < length) {
            int i16 = i10 + 1;
            String[] strArr4 = f26893d;
            if (strArr4[i10] == null) {
                strArr4[i10] = f26894e[i10];
            }
            i10 = i16;
        }
    }

    private d() {
    }

    public final String b(int i10) {
        String[] strArr = f26892c;
        return i10 < strArr.length ? strArr[i10] : ne.d.t("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return ne.d.t("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return cTJaRZ.qmsrGd;
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f26894e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f26893d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    t.c(str);
                } else {
                    str = f26894e[i11];
                }
                String str2 = str;
                if (i10 != 5 || (i11 & 4) == 0) {
                    return (i10 != 0 || (i11 & 32) == 0) ? str2 : c0.K(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return c0.K(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f26894e[i11];
    }
}
