package io.bidmachine.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import x7.l0;
import z7.a;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class AssetDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f18017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f18018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f18019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18021i;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f18017e = context.getAssets();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws io.bidmachine.media3.datasource.AssetDataSource.AssetDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f18018f = r0
            r1 = 0
            java.io.InputStream r2 = r5.f18019g     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f18019g = r0
            boolean r0 = r5.f18021i
            if (r0 == 0) goto L16
            r5.f18021i = r1
            r5.p()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            io.bidmachine.media3.datasource.AssetDataSource$AssetDataSourceException r3 = new io.bidmachine.media3.datasource.AssetDataSource$AssetDataSourceException     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f18019g = r0
            boolean r0 = r5.f18021i
            if (r0 == 0) goto L2d
            r5.f18021i = r1
            r5.p()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.datasource.AssetDataSource.close():void");
    }

    @Override // z7.d
    public long i(g gVar) throws AssetDataSourceException {
        try {
            Uri uri = gVar.f29009a;
            this.f18018f = uri;
            String strSubstring = (String) x7.a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            q(gVar);
            InputStream inputStreamOpen = this.f18017e.open(strSubstring, 1);
            this.f18019g = inputStreamOpen;
            if (inputStreamOpen.skip(gVar.f29015g) < gVar.f29015g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j10 = gVar.f29016h;
            if (j10 != -1) {
                this.f18020h = j10;
            } else {
                long jAvailable = this.f18019g.available();
                this.f18020h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f18020h = -1L;
                }
            }
            this.f18021i = true;
            r(gVar);
            return this.f18020h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // z7.d
    public Uri m() {
        return this.f18018f;
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18020h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        int i12 = ((InputStream) l0.i(this.f18019g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f18020h;
        if (j11 != -1) {
            this.f18020h = j11 - ((long) i12);
        }
        o(i12);
        return i12;
    }
}
