package z7;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataSourceInputStream.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f29003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f29004b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f29008f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29006d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29007e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f29005c = new byte[1];

    public e(d dVar, g gVar) {
        this.f29003a = dVar;
        this.f29004b = gVar;
    }

    private void b() throws IOException {
        if (this.f29006d) {
            return;
        }
        this.f29003a.i(this.f29004b);
        this.f29006d = true;
    }

    public void c() throws IOException {
        b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f29007e) {
            return;
        }
        this.f29003a.close();
        this.f29007e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f29005c) == -1) {
            return -1;
        }
        return this.f29005c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        x7.a.g(!this.f29007e);
        b();
        int i12 = this.f29003a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f29008f += (long) i12;
        return i12;
    }
}
