package ke;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlinx.serialization.json.b f21322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 writer, kotlinx.serialization.json.b json) {
        super(writer);
        kotlin.jvm.internal.t.f(writer, "writer");
        kotlin.jvm.internal.t.f(json, "json");
        this.f21322c = json;
    }

    @Override // ke.s
    public void b() {
        o(true);
        this.f21323d++;
    }

    @Override // ke.s
    public void c() {
        o(false);
        k("\n");
        int i10 = this.f21323d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f21322c.e().n());
        }
    }

    @Override // ke.s
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // ke.s
    public void p() {
        f(' ');
    }

    @Override // ke.s
    public void q() {
        this.f21323d--;
    }
}
