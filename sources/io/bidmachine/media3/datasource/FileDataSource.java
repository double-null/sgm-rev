package io.bidmachine.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import x7.l0;
import z7.a;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class FileDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f18029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f18030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f18031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18032h;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }

        public FileDataSourceException(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile s(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) x7.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSourceException(e11, 2006);
        } catch (RuntimeException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws io.bidmachine.media3.datasource.FileDataSource.FileDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f18030f = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.f18029e     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.f18029e = r0
            boolean r0 = r5.f18032h
            if (r0 == 0) goto L16
            r5.f18032h = r1
            r5.p()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            io.bidmachine.media3.datasource.FileDataSource$FileDataSourceException r3 = new io.bidmachine.media3.datasource.FileDataSource$FileDataSourceException     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.f18029e = r0
            boolean r0 = r5.f18032h
            if (r0 == 0) goto L2d
            r5.f18032h = r1
            r5.p()
        L2d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.datasource.FileDataSource.close():void");
    }

    @Override // z7.d
    public long i(g gVar) throws FileDataSourceException {
        Uri uri = gVar.f29009a;
        this.f18030f = uri;
        q(gVar);
        RandomAccessFile randomAccessFileS = s(uri);
        this.f18029e = randomAccessFileS;
        try {
            randomAccessFileS.seek(gVar.f29015g);
            long length = gVar.f29016h;
            if (length == -1) {
                length = this.f18029e.length() - gVar.f29015g;
            }
            this.f18031g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f18032h = true;
            r(gVar);
            return this.f18031g;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    @Override // z7.d
    public Uri m() {
        return this.f18030f;
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f18031g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) l0.i(this.f18029e)).read(bArr, i10, (int) Math.min(this.f18031g, i11));
            if (i12 > 0) {
                this.f18031g -= (long) i12;
                o(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
