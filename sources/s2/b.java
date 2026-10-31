package s2;

/* JADX INFO: compiled from: AbstractHasher.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class b implements f {
    b() {
    }

    @Override // s2.f
    public f a(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public abstract f d(byte[] bArr, int i10, int i11);
}
