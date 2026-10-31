package bb;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends rb.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pa.d f4438b;

    public s(pa.d adElement) {
        kotlin.jvm.internal.t.f(adElement, "adElement");
        this.f4438b = adElement;
    }

    @Override // rb.b
    public void d() {
        try {
            this.f4438b.b();
        } catch (Throwable th) {
            pa.t.i(th);
        }
    }
}
