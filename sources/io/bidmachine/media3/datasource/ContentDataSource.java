package io.bidmachine.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import x7.l0;
import z7.a;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f18022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f18023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f18024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f18025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18027j;

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f18022e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws io.bidmachine.media3.datasource.ContentDataSource.ContentDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f18023f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f18025h     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f18025h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f18024g     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f18024g = r0
            boolean r0 = r5.f18027j
            if (r0 == 0) goto L21
            r5.f18027j = r2
            r5.p()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            io.bidmachine.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new io.bidmachine.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f18024g = r0
            boolean r0 = r5.f18027j
            if (r0 == 0) goto L36
            r5.f18027j = r2
            r5.p()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            io.bidmachine.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new io.bidmachine.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f18025h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f18024g     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f18024g = r0
            boolean r0 = r5.f18027j
            if (r0 == 0) goto L54
            r5.f18027j = r2
            r5.p()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            io.bidmachine.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new io.bidmachine.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f18024g = r0
            boolean r0 = r5.f18027j
            if (r0 == 0) goto L69
            r5.f18027j = r2
            r5.p()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.datasource.ContentDataSource.close():void");
    }

    @Override // z7.d
    public long i(g gVar) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = gVar.f29009a.normalizeScheme();
            this.f18023f = uriNormalizeScheme;
            q(gVar);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f18022e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f18022e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f18024g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f18025h = fileInputStream;
            if (length != -1 && gVar.f29015g > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(gVar.f29015g + startOffset) - startOffset;
            if (jSkip != gVar.f29015g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f18026i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f18026i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f18026i = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = gVar.f29016h;
            if (jMin != -1) {
                long j11 = this.f18026i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f18026i = jMin;
            }
            this.f18027j = true;
            r(gVar);
            long j12 = gVar.f29016h;
            return j12 != -1 ? j12 : this.f18026i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // z7.d
    public Uri m() {
        return this.f18023f;
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18026i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) l0.i(this.f18025h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f18026i;
        if (j11 != -1) {
            this.f18026i = j11 - ((long) i12);
        }
        o(i12);
        return i12;
    }
}
