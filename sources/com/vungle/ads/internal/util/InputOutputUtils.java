package com.vungle.ads.internal.util;

import android.util.Base64;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InputOutputUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class InputOutputUtils {
    public static final InputOutputUtils INSTANCE = new InputOutputUtils();

    private InputOutputUtils() {
    }

    public final String convertForSending(String stringToConvert) throws IOException {
        t.f(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = stringToConvert.getBytes(rd.d.f24999b);
                t.e(bytes, sRGQSqxgxlS.snLHdOvbX);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                t.e(strEncodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                fd.b.a(gZIPOutputStream, null);
                fd.b.a(byteArrayOutputStream, null);
                return strEncodeToString;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(gZIPOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                fd.b.a(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }
}
