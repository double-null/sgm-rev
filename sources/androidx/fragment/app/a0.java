package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: LogWriter.java */
/* JADX INFO: loaded from: classes.dex */
final class a0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f2527b = new StringBuilder(128);

    a0(String str) {
        this.f2526a = str;
    }

    private void b() {
        if (this.f2527b.length() > 0) {
            Log.d(this.f2526a, this.f2527b.toString());
            StringBuilder sb2 = this.f2527b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                b();
            } else {
                this.f2527b.append(c10);
            }
        }
    }
}
