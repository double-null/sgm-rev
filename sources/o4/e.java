package o4;

/* JADX INFO: compiled from: SimpleToken.java */
/* JADX INFO: loaded from: classes4.dex */
final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f23028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f23029d;

    e(g gVar, int i10, int i11) {
        super(gVar);
        this.f23028c = (short) i10;
        this.f23029d = (short) i11;
    }

    @Override // o4.g
    void c(p4.a aVar, byte[] bArr) {
        aVar.d(this.f23028c, this.f23029d);
    }

    public String toString() {
        short s10 = this.f23028c;
        short s11 = this.f23029d;
        return "<" + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f23029d)).substring(1) + '>';
    }
}
