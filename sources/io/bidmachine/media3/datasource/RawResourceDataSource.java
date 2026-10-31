package io.bidmachine.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import x7.l0;
import z7.a;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class RawResourceDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f18040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f18041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f18042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f18043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18045j;

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f18040e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor s(Context context, g gVar) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = gVar.f29009a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = t(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) x7.a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = t(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new RawResourceDataSourceException(null, e11, 2005);
        }
    }

    private static int t(String str) throws RawResourceDataSourceException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws io.bidmachine.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        /*
            r5 = this;
            r0 = 0
            r5.f18041f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f18043h     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f18043h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f18042g     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f18042g = r0
            boolean r0 = r5.f18045j
            if (r0 == 0) goto L21
            r5.f18045j = r2
            r5.p()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            io.bidmachine.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new io.bidmachine.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L22
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f18042g = r0
            boolean r0 = r5.f18045j
            if (r0 == 0) goto L36
            r5.f18045j = r2
            r5.p()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            io.bidmachine.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new io.bidmachine.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f18043h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f18042g     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f18042g = r0
            boolean r0 = r5.f18045j
            if (r0 == 0) goto L54
            r5.f18045j = r2
            r5.p()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            io.bidmachine.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new io.bidmachine.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L55
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f18042g = r0
            boolean r0 = r5.f18045j
            if (r0 == 0) goto L69
            r5.f18045j = r2
            r5.p()
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.datasource.RawResourceDataSource.close():void");
    }

    @Override // z7.d
    public long i(g gVar) throws RawResourceDataSourceException {
        this.f18041f = gVar;
        q(gVar);
        AssetFileDescriptor assetFileDescriptorS = s(this.f18040e, gVar);
        this.f18042g = assetFileDescriptorS;
        long length = assetFileDescriptorS.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f18042g.getFileDescriptor());
        this.f18043h = fileInputStream;
        if (length != -1) {
            try {
                if (gVar.f29015g > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        }
        long startOffset = this.f18042g.getStartOffset();
        long jSkip = fileInputStream.skip(gVar.f29015g + startOffset) - startOffset;
        if (jSkip != gVar.f29015g) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f18044i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f18044i = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f18044i = j10;
            if (j10 < 0) {
                throw new DataSourceException(2008);
            }
        }
        long jMin = gVar.f29016h;
        if (jMin != -1) {
            long j11 = this.f18044i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f18044i = jMin;
        }
        this.f18045j = true;
        r(gVar);
        long j12 = gVar.f29016h;
        return j12 != -1 ? j12 : this.f18044i;
    }

    @Override // z7.d
    public Uri m() {
        g gVar = this.f18041f;
        if (gVar != null) {
            return gVar.f29009a;
        }
        return null;
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18044i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) l0.i(this.f18043h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f18044i == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f18044i;
        if (j11 != -1) {
            this.f18044i = j11 - ((long) i12);
        }
        o(i12);
        return i12;
    }
}
