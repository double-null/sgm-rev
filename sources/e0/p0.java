package e0;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: UncloseableOutputStream.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f13788a;

    public p0(FileOutputStream fileOutputStream) {
        kotlin.jvm.internal.t.f(fileOutputStream, "fileOutputStream");
        this.f13788a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f13788a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f13788a.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        kotlin.jvm.internal.t.f(b10, "b");
        this.f13788a.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.t.f(bytes, "bytes");
        this.f13788a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
