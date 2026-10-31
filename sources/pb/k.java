package pb;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f24147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f24148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y0 f24149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24150d;

    public k(float f10, l lVar, y0 y0Var) {
        this.f24147a = f10;
        this.f24148b = lVar;
        this.f24149c = y0Var;
        this.f24150d = (lVar instanceof x) && ((x) lVar).a().b();
    }

    public final float a() {
        return this.f24147a;
    }

    public final y0 b() {
        return this.f24149c;
    }

    public final l c() {
        return this.f24148b;
    }

    public final boolean d() {
        return this.f24150d;
    }

    public /* synthetic */ k(float f10, l lVar, y0 y0Var, int i10, kotlin.jvm.internal.k kVar) {
        this(f10, (i10 & 2) != 0 ? null : lVar, (i10 & 4) != 0 ? null : y0Var);
    }
}
