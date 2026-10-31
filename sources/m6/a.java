package m6;

/* JADX INFO: compiled from: BaseVersionWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uc.a f22171b;

    public a(int i10, uc.a aVar) {
        this.f22170a = i10;
        this.f22171b = aVar;
    }

    @Override // m6.b
    public int b() {
        return this.f22170a;
    }

    @Override // m6.b
    public uc.a c() {
        return this.f22171b;
    }
}
