package z7;

import android.net.Uri;
import android.util.Base64;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.datasource.DataSourceException;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import x7.l0;

/* JADX INFO: compiled from: DataSchemeDataSource.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f28999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f29000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29002h;

    public c() {
        super(false);
    }

    @Override // z7.d
    public void close() {
        if (this.f29000f != null) {
            this.f29000f = null;
            p();
        }
        this.f28999e = null;
    }

    @Override // z7.d
    public long i(g gVar) throws IOException {
        q(gVar);
        this.f28999e = gVar;
        Uri uriNormalizeScheme = gVar.f29009a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        x7.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrM1 = l0.m1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrM1.length != 2) {
            throw ParserException.c("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrM1[1];
        if (strArrM1[0].contains(";base64")) {
            try {
                this.f29000f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw ParserException.c("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f29000f = l0.u0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j10 = gVar.f29015g;
        byte[] bArr = this.f29000f;
        if (j10 > bArr.length) {
            this.f29000f = null;
            throw new DataSourceException(2008);
        }
        int i10 = (int) j10;
        this.f29001g = i10;
        int length = bArr.length - i10;
        this.f29002h = length;
        long j11 = gVar.f29016h;
        if (j11 != -1) {
            this.f29002h = (int) Math.min(length, j11);
        }
        r(gVar);
        long j12 = gVar.f29016h;
        return j12 != -1 ? j12 : this.f29002h;
    }

    @Override // z7.d
    public Uri m() {
        g gVar = this.f28999e;
        if (gVar != null) {
            return gVar.f29009a;
        }
        return null;
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f29002h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(l0.i(this.f29000f), this.f29001g, bArr, i10, iMin);
        this.f29001g += iMin;
        this.f29002h -= iMin;
        o(iMin);
        return iMin;
    }
}
