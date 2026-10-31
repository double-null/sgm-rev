package io.bidmachine.media3.datasource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f18038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f18039g;

    public HttpDataSource$InvalidResponseCodeException(int i10, String str, IOException iOException, Map<String, List<String>> map, g gVar, byte[] bArr) {
        super("Response code: " + i10, iOException, gVar, 2004, 1);
        this.f18036d = i10;
        this.f18037e = str;
        this.f18038f = map;
        this.f18039g = bArr;
    }
}
