package v8;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingExtractorInput.java */
/* JADX INFO: loaded from: classes4.dex */
public class z implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f27454a;

    public z(q qVar) {
        this.f27454a = qVar;
    }

    @Override // v8.q
    public boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f27454a.b(bArr, i10, i11, z10);
    }

    @Override // v8.q
    public void d() {
        this.f27454a.d();
    }

    @Override // v8.q
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f27454a.e(bArr, i10, i11, z10);
    }

    @Override // v8.q
    public long f() {
        return this.f27454a.f();
    }

    @Override // v8.q
    public void g(int i10) throws IOException {
        this.f27454a.g(i10);
    }

    @Override // v8.q
    public long getLength() {
        return this.f27454a.getLength();
    }

    @Override // v8.q
    public long getPosition() {
        return this.f27454a.getPosition();
    }

    @Override // v8.q
    public int h(int i10) throws IOException {
        return this.f27454a.h(i10);
    }

    @Override // v8.q
    public int j(byte[] bArr, int i10, int i11) throws IOException {
        return this.f27454a.j(bArr, i10, i11);
    }

    @Override // v8.q
    public void k(int i10) throws IOException {
        this.f27454a.k(i10);
    }

    @Override // v8.q
    public boolean l(int i10, boolean z10) throws IOException {
        return this.f27454a.l(i10, z10);
    }

    @Override // v8.q
    public void n(byte[] bArr, int i10, int i11) throws IOException {
        this.f27454a.n(bArr, i10, i11);
    }

    @Override // v8.q, u7.h
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f27454a.read(bArr, i10, i11);
    }

    @Override // v8.q
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f27454a.readFully(bArr, i10, i11);
    }
}
