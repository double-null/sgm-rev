package cc;

import android.content.Context;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.io.File;
import java.io.InputStream;
import java.net.URLConnection;
import kotlin.jvm.internal.t;
import wb.e0;

/* JADX INFO: compiled from: FileResponseProcessor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements n<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f5468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f5469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f5470c;

    @Override // cc.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public File a(URLConnection urlConnection) throws Throwable {
        t.f(urlConnection, "urlConnection");
        File cacheDir = this.f5469b;
        if (cacheDir == null) {
            cacheDir = this.f5470c.getCacheDir();
        }
        if (cacheDir == null) {
            throw new IllegalStateException("Can't create temp file, temp dir is null".toString());
        }
        cacheDir.mkdirs();
        if (!cacheDir.exists()) {
            throw new IllegalStateException(("Can't create temp dir " + cacheDir.getPath()).toString());
        }
        boolean z10 = true;
        File fileD = ac.b.d(cacheDir, null, 1, null);
        long contentLength = urlConnection.getContentLength();
        try {
            InputStream inputStream = urlConnection.getInputStream();
            t.e(inputStream, "urlConnection.getInputStream()");
            if (!(e0.D(inputStream, fileD) == contentLength)) {
                throw new IllegalStateException("The downloaded file size does not match the stated size".toString());
            }
            File parentFile = this.f5468a.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            File parentFile2 = this.f5468a.getParentFile();
            if (parentFile2 == null || !parentFile2.exists()) {
                z10 = false;
            }
            if (z10) {
                if (!fileD.renameTo(this.f5468a) && !ac.b.i(this.f5468a)) {
                    throw new IllegalStateException("Can't rename temp file".toString());
                }
                return this.f5468a;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't create target file dir ");
            File parentFile3 = this.f5468a.getParentFile();
            sb2.append(parentFile3 != null ? parentFile3.getPath() : null);
            throw new IllegalStateException(sb2.toString().toString());
        } catch (Throwable th) {
            ac.b.f(fileD);
            throw th;
        }
    }

    public b(Context context, File file, File file2) {
        t.f(context, CwEo.CykyMnNbEDDrELE);
        t.f(file, "file");
        this.f5468a = file;
        this.f5469b = file2;
        Context applicationContext = context.getApplicationContext();
        t.e(applicationContext, "context.applicationContext");
        this.f5470c = applicationContext;
    }
}
