package io.bidmachine.media3.datasource;

import com.google.common.base.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f18033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18034c;

    public HttpDataSource$HttpDataSourceException(g gVar, int i10, int i11) {
        super(c(i10, i11));
        this.f18033b = gVar;
        this.f18034c = i11;
    }

    private static int c(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException e(final IOException iOException, final g gVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, gVar) { // from class: io.bidmachine.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, gVar, i11, i10);
    }

    public HttpDataSource$HttpDataSourceException(String str, g gVar, int i10, int i11) {
        super(str, c(i10, i11));
        this.f18033b = gVar;
        this.f18034c = i11;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, g gVar, int i10, int i11) {
        super(iOException, c(i10, i11));
        this.f18033b = gVar;
        this.f18034c = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, g gVar, int i10, int i11) {
        super(str, iOException, c(i10, i11));
        this.f18033b = gVar;
        this.f18034c = i11;
    }
}
