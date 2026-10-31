package o4;

/* JADX INFO: compiled from: Token.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final g f23035b = new e(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f23036a;

    g(g gVar) {
        this.f23036a = gVar;
    }

    final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    abstract void c(p4.a aVar, byte[] bArr);

    final g d() {
        return this.f23036a;
    }
}
