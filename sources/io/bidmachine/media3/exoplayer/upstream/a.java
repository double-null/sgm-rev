package io.bidmachine.media3.exoplayer.upstream;

import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.datasource.DataSourceException;
import io.bidmachine.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import io.bidmachine.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19806a;

    public a() {
        this(-1);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.b
    public int a(int i10) {
        int i11 = this.f19806a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.b
    public b.C0329b b(b.a aVar, b.c cVar) {
        if (!e(cVar.f19815c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new b.C0329b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new b.C0329b(2, 60000L);
        }
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.b
    public long c(b.c cVar) {
        IOException iOException = cVar.f19815c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.b(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f19816d - 1) * 1000, Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource$InvalidResponseCodeException) iOException).f18036d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    public a(int i10) {
        this.f19806a = i10;
    }
}
