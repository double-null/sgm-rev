package r6;

/* JADX INFO: compiled from: BaseVersionWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uc.a f24909b;

    public a(int i10, uc.a aVar) {
        this.f24908a = i10;
        this.f24909b = aVar;
    }

    @Override // r6.b
    public int b() {
        return this.f24908a;
    }

    @Override // r6.b
    public uc.a c() {
        return this.f24909b;
    }
}
