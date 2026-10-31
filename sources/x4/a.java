package x4;

/* JADX INFO: compiled from: ErrorCorrectionLevel.java */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a[] f28012f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28014a;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        f28012f = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i10) {
        this.f28014a = i10;
    }

    public int b() {
        return this.f28014a;
    }
}
