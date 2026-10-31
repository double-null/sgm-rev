package t4;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: Code93Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f25508a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f25509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f25510c;

    static {
        int[] iArr = {276, 328, 324, Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, 468, 466, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 366, 374, 430, 294, 474, 470, 306, 350};
        f25509b = iArr;
        f25510c = iArr[47];
    }
}
