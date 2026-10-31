package s4;

import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: ErrorCorrection.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f25219a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f25220b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 240, 92, 254}, new int[]{28, 24, ModuleDescriptor.MODULE_VERSION, 166, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 248, 116, 255, 110, 61}, new int[]{175, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 45, 18, 186, 83, ModuleDescriptor.MODULE_VERSION}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 109, Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE, 94, 254, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 88, 205, 109, 39, 176, 21, 155, 197, 251, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 110, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 141, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 250, 162, 181, 102, 120, 84, 179, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 95, 119, 115, 44, 175, 184, 59, 25, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 98, 81, 112}, new int[]{77, 193, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 242, 8, 175, 95, 100, 9, 167, 105, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 5, 9, 5}, new int[]{245, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 172, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 96, 32, 117, 22, 238, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 88, 120, 100, 66, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 92, 253, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 19}, new int[]{175, 9, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 238, 12, 17, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 208, 100, 29, 175, 170, 230, 192, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 235, 150, 159, 36, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 38, 200, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 54, 228, 146, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, ModuleDescriptor.MODULE_VERSION, 112, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 230, 245, 63, 197, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 250, 106, ModuleDescriptor.MODULE_VERSION, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 175, 64, 114, 71, 161, 44, 147, 6, 27, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 51, 63, 87, 10, 40, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 124, 86, 47, 11, 204}, new int[]{Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 248, 180, 234, 197, 158, 177, 68, 122, 93, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 15, 160, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 236, 66, 139, 153, ModuleDescriptor.MODULE_VERSION, 202, 167, 179, 25, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 232, 96, 210, 231, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 239, 181, 241, 59, 52, 172, 25, 49, 232, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 189, 64, 54, 108, 153, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 63, 96, 103, 82, 186}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f25221c = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f25222d = new int[255];

    static {
        int i10 = 1;
        for (int i11 = 0; i11 < 255; i11++) {
            f25222d[i11] = i10;
            f25221c[i10] = i11;
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
            }
        }
    }

    private static String a(CharSequence charSequence, int i10) {
        return b(charSequence, 0, charSequence.length(), i10);
    }

    private static String b(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = 0;
        while (true) {
            int[] iArr = f25219a;
            if (i15 >= iArr.length) {
                i15 = -1;
                break;
            }
            if (iArr[i15] == i12) {
                break;
            }
            i15++;
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i12)));
        }
        int[] iArr2 = f25220b[i15];
        char[] cArr = new char[i12];
        for (int i16 = 0; i16 < i12; i16++) {
            cArr[i16] = 0;
        }
        for (int i17 = i10; i17 < i10 + i11; i17++) {
            int i18 = i12 - 1;
            int iCharAt = cArr[i18] ^ charSequence.charAt(i17);
            while (i18 > 0) {
                if (iCharAt == 0 || (i14 = iArr2[i18]) == 0) {
                    cArr[i18] = cArr[i18 - 1];
                } else {
                    char c10 = cArr[i18 - 1];
                    int[] iArr3 = f25222d;
                    int[] iArr4 = f25221c;
                    cArr[i18] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i14]) % 255] ^ c10);
                }
                i18--;
            }
            if (iCharAt == 0 || (i13 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = f25222d;
                int[] iArr6 = f25221c;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i13]) % 255];
            }
        }
        char[] cArr2 = new char[i12];
        for (int i19 = 0; i19 < i12; i19++) {
            cArr2[i19] = cArr[(i12 - i19) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String c(String str, k kVar) {
        if (str.length() != kVar.a()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb2 = new StringBuilder(kVar.a() + kVar.c());
        sb2.append(str);
        int iF = kVar.f();
        if (iF == 1) {
            sb2.append(a(str, kVar.c()));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr = new int[iF];
            int[] iArr2 = new int[iF];
            int[] iArr3 = new int[iF];
            int i10 = 0;
            while (i10 < iF) {
                int i11 = i10 + 1;
                iArr[i10] = kVar.b(i11);
                iArr2[i10] = kVar.d(i11);
                iArr3[i10] = 0;
                if (i10 > 0) {
                    iArr3[i10] = iArr3[i10 - 1] + iArr[i10];
                }
                i10 = i11;
            }
            for (int i12 = 0; i12 < iF; i12++) {
                StringBuilder sb3 = new StringBuilder(iArr[i12]);
                for (int i13 = i12; i13 < kVar.a(); i13 += iF) {
                    sb3.append(str.charAt(i13));
                }
                String strA = a(sb3.toString(), iArr2[i12]);
                int i14 = i12;
                int i15 = 0;
                while (i14 < iArr2[i12] * iF) {
                    sb2.setCharAt(kVar.a() + i14, strA.charAt(i15));
                    i14 += iF;
                    i15++;
                }
            }
        }
        return sb2.toString();
    }
}
