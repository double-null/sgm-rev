package x7;

import android.util.Pair;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.internal.NativeProtocol;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: CodecSpecificDataUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f28125a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f28126b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f28127c = Pattern.compile("^\\D?(\\d+)$");

    private static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return Http2.INITIAL_MAX_FRAME_SIZE;
            case 15:
                return 32768;
            case 16:
                return NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int b(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return Http2.INITIAL_MAX_FRAME_SIZE;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int c(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String d(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> e(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String f(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = f28126b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(z10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(l0.G("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f28125a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static com.google.common.collect.u<byte[]> h(byte b10, byte b11, byte b12, byte b13) {
        return com.google.common.collect.u.I(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    private static Integer i(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals(OgqfiHA.ZQBR)) {
                    b10 = 0;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    b10 = 1;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    b10 = 2;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    b10 = 3;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    b10 = 4;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b10 = 5;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b10 = 6;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b10 = 7;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b10 = 8;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    b10 = 9;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b10 = 10;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case 9:
                return 512;
            case 10:
                return 1024;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> k(String str, String[] strArr) {
        int iT;
        if (strArr.length != 3) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(u7.w.h(Integer.parseInt(strArr[1], 16))) && (iT = t(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iT), 0);
            }
        } catch (NumberFormatException unused) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static Pair<Integer, Integer> l(String str, String[] strArr, u7.g gVar) {
        int i10;
        if (strArr.length < 4) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i11 = 1;
        try {
            int i12 = Integer.parseInt(strArr[1]);
            int i13 = Integer.parseInt(strArr[2].substring(0, 2));
            int i14 = Integer.parseInt(strArr[3]);
            if (i12 != 0) {
                r.h("CodecSpecificDataUtil", "Unknown AV1 profile: " + i12);
                return null;
            }
            if (i14 != 8 && i14 != 10) {
                r.h("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i14);
                return null;
            }
            if (i14 != 8) {
                i11 = (gVar == null || !(gVar.f26079d != null || (i10 = gVar.f26078c) == 7 || i10 == 6)) ? 2 : 4096;
            }
            int iA = a(i13);
            if (iA != -1) {
                return new Pair<>(Integer.valueOf(i11), Integer.valueOf(iA));
            }
            r.h("CodecSpecificDataUtil", "Unknown AV1 level: " + i13);
            return null;
        } catch (NumberFormatException unused) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> m(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    r.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int iC = c(i11);
            if (iC == -1) {
                r.h("CodecSpecificDataUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int iB = b(i10);
            if (iB != -1) {
                return new Pair<>(Integer.valueOf(iC), Integer.valueOf(iB));
            }
            r.h("CodecSpecificDataUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> n(u7.q qVar) {
        String str = qVar.f26248k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(qVar.f26252o)) {
            return o(qVar.f26248k, strArrSplit);
        }
        byte b10 = 0;
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    b10 = -1;
                }
                break;
            case 3006243:
                b10 = !str2.equals("avc1") ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b10 = !str2.equals("avc2") ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b10 = !str2.equals("hev1") ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b10 = !str2.equals("hvc1") ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b10 = !str2.equals("mp4a") ? (byte) -1 : (byte) 5;
                break;
            case 3475740:
                b10 = !str2.equals("s263") ? (byte) -1 : (byte) 6;
                break;
            case 3624515:
                b10 = !str2.equals("vp09") ? (byte) -1 : (byte) 7;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return l(qVar.f26248k, strArrSplit, qVar.C);
            case 1:
            case 2:
                return m(qVar.f26248k, strArrSplit);
            case 3:
            case 4:
                return q(qVar.f26248k, strArrSplit, qVar.C);
            case 5:
                return k(qVar.f26248k, strArrSplit);
            case 6:
                return p(qVar.f26248k, strArrSplit);
            case 7:
                return r(qVar.f26248k, strArrSplit);
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        int length = strArr.length;
        String str2 = UomBEukHFwrS.aycF;
        if (length < 3) {
            r.h("CodecSpecificDataUtil", str2 + str);
            return null;
        }
        Matcher matcher = f28127c.matcher(strArr[1]);
        if (!matcher.matches()) {
            r.h("CodecSpecificDataUtil", str2 + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numJ = j(strGroup);
        if (numJ == null) {
            r.h("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str3 = strArr[2];
        Integer numI = i(str3);
        if (numI != null) {
            return new Pair<>(numJ, numI);
        }
        r.h("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str3);
        return null;
    }

    private static Pair<Integer, Integer> p(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair<Integer, Integer> q(String str, String[] strArr, u7.g gVar) {
        if (strArr.length < 4) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f28127c.matcher(strArr[1]);
        if (!matcher.matches()) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(strGroup)) {
            i10 = 6;
            if ("2".equals(strGroup)) {
                i10 = (gVar == null || gVar.f26078c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                r.h("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numS = s(str2);
        if (numS != null) {
            return new Pair<>(Integer.valueOf(i10), numS);
        }
        r.h("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> r(String str, String[] strArr) {
        if (strArr.length < 3) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iX = x(i10);
            if (iX == -1) {
                r.h("CodecSpecificDataUtil", "Unknown VP9 profile: " + i10);
                return null;
            }
            int iW = w(i11);
            if (iW != -1) {
                return new Pair<>(Integer.valueOf(iX), Integer.valueOf(iW));
            }
            r.h("CodecSpecificDataUtil", wHzciBnJlYkdX.KdbjekGVMtH + i11);
            return null;
        } catch (NumberFormatException unused) {
            r.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer s(String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b10 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b10 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b10 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b10 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b10 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b10 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b10 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b10 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b10 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b10 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b10 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b10 = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b10 = 12;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b10 = 13;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b10 = 14;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b10 = 15;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b10 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b10 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b10 = 18;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b10 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b10 = 20;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b10 = 21;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b10 = 22;
                }
                break;
            case 2312989:
                if (str.equals(cTJaRZ.RLtYjH)) {
                    b10 = 23;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b10 = 24;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b10 = 25;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE);
            case 21:
                return Integer.valueOf(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            default:
                return null;
        }
    }

    private static int t(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static Pair<Integer, Integer> u(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        a0Var.W(9);
        int iH = a0Var.H();
        a0Var.W(20);
        return Pair.create(Integer.valueOf(a0Var.L()), Integer.valueOf(iH));
    }

    public static boolean v(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    private static int w(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int x(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }
}
