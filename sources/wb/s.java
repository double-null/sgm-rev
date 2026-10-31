package wb;

import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: MimeTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f27716a = new s();

    private s() {
    }

    private static final boolean b(byte[] bArr, int i10, int... iArr) {
        if (i10 < 0 || bArr.length < iArr.length + i10) {
            return false;
        }
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if ((bArr[i10 + i11] & 255) != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    private static final boolean c(byte[] bArr, int... iArr) {
        if (bArr.length < iArr.length) {
            return false;
        }
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if ((bArr[i10] & 255) != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    private final String d(String str) {
        int iH0;
        if (str == null || (iH0 = rd.f0.h0(str, '/', 0, false, 6, null)) == -1) {
            return null;
        }
        String strSubstring = str.substring(0, iH0);
        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String a(File file) {
        int i10;
        kotlin.jvm.internal.t.f(file, "file");
        byte[] bArrCopyOf = new byte[16];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                i10 = fileInputStream.read(bArrCopyOf);
                fd.b.a(fileInputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            i10 = -1;
        }
        if (i10 < 4) {
            return "application/octet-stream";
        }
        if (i10 < 16) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i10);
            kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(this, newSize)");
        }
        if (c(bArrCopyOf, 255, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 255)) {
            return "image/jpeg";
        }
        if (c(bArrCopyOf, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 80, 78, 71)) {
            return "image/png";
        }
        if (c(bArrCopyOf, 71, 73, 70)) {
            return "image/gif";
        }
        if (c(bArrCopyOf, 82, 73, 70, 70) && b(bArrCopyOf, 8, 87, 69, 66, 80)) {
            return "image/webp";
        }
        if (c(bArrCopyOf, 0, 0, 0, 24, 102, 116, 121, 112, 109, 112, 52) || c(bArrCopyOf, 0, 0, 0, 32, 102, 116, 121, 112, 109, 112, 52)) {
            return "video/mp4";
        }
        if (c(bArrCopyOf, 26, 69, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 163)) {
            return "video/webm";
        }
        if (c(bArrCopyOf, 82, 73, 70, 70) && b(bArrCopyOf, 8, 65, 86, 73, 32)) {
            return "video/avi";
        }
        if (c(bArrCopyOf, 73, 68, 51) || c(bArrCopyOf, 255, 251) || c(bArrCopyOf, 255, 243)) {
            return "audio/mpeg";
        }
        if (c(bArrCopyOf, 37, 80, 68, 70)) {
            return "application/pdf";
        }
        return (c(bArrCopyOf, 80, 75, 3, 4) || c(bArrCopyOf, 80, 75, 5, 6) || c(bArrCopyOf, 80, 75, 7, 8)) ? "application/zip" : "application/octet-stream";
    }

    public final boolean e(String str) {
        return kotlin.jvm.internal.t.a("image", d(str));
    }

    public final boolean f(String str) {
        return kotlin.jvm.internal.t.a("video", d(str));
    }

    public final boolean g(String str) {
        return f(str) || e(str);
    }
}
