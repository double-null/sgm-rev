package ke;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g0 writer, boolean z10) {
        super(writer);
        kotlin.jvm.internal.t.f(writer, "writer");
        this.f21418c = z10;
    }

    @Override // ke.s
    public void n(String value) {
        kotlin.jvm.internal.t.f(value, "value");
        if (this.f21418c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
