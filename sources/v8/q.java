package v8;

import java.io.IOException;

/* JADX INFO: compiled from: ExtractorInput.java */
/* JADX INFO: loaded from: classes4.dex */
public interface q extends u7.h {
    boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void d();

    boolean e(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long f();

    void g(int i10) throws IOException;

    long getLength();

    long getPosition();

    int h(int i10) throws IOException;

    int j(byte[] bArr, int i10, int i11) throws IOException;

    void k(int i10) throws IOException;

    boolean l(int i10, boolean z10) throws IOException;

    void n(byte[] bArr, int i10, int i11) throws IOException;

    @Override // u7.h
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
