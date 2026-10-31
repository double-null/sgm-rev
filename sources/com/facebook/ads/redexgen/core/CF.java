package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class CF implements InterfaceC1715es {
    public static byte[] A01;
    public final InterfaceC1716et A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, -114, -114, -112, -101, -97, 88, 110, -109, -116, -99, -98, -112, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, -62, 3, 2, -39, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, 108, -109, -72, -81, -92, -126, -127, 115, 90, 101};
    }

    public CF(InterfaceC1716et interfaceC1716et) {
        this.A00 = interfaceC1716et;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1715es
    public final boolean ADE(C1713eq c1713eq) {
        InterfaceC1699ec interfaceC1699ecA00 = c1713eq.A00();
        if (this.A00.AAQ()) {
            Log.e(CF.class.getSimpleName(), A00(14, 27, 123), c1713eq);
        }
        if (interfaceC1699ecA00 != null && interfaceC1699ecA00.A94() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1715es
    public final HttpURLConnection AG1(String str, Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1715es
    public final InputStream AG2(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1715es
    public final OutputStream AG3(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1715es
    public final void AGM(HttpURLConnection httpURLConnection, EnumC1711eo enumC1711eo, String str) throws IOException {
        httpURLConnection.setRequestMethod(enumC1711eo.A03());
        httpURLConnection.setDoOutput(enumC1711eo.A05());
        httpURLConnection.setDoInput(enumC1711eo.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1715es
    public final byte[] AGj(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1715es
    public final void AKN(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
