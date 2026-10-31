package kotlinx.serialization.json;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f21569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f21572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f21577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f21578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private le.c f21580q;

    public e(b json) {
        kotlin.jvm.internal.t.f(json, "json");
        this.f21564a = json.e().i();
        this.f21565b = json.e().j();
        this.f21566c = json.e().k();
        this.f21567d = json.e().q();
        this.f21568e = json.e().m();
        this.f21569f = json.e().n();
        this.f21570g = json.e().g();
        this.f21571h = json.e().e();
        this.f21572i = json.e().f();
        this.f21573j = json.e().o();
        json.e().l();
        this.f21574k = json.e().h();
        this.f21575l = json.e().d();
        this.f21576m = json.e().a();
        this.f21577n = json.e().b();
        this.f21578o = json.e().c();
        this.f21579p = json.e().p();
        this.f21580q = json.a();
    }

    public final g a() {
        boolean z10 = true;
        if (this.f21579p) {
            if (!kotlin.jvm.internal.t.a(this.f21571h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
            }
            if (!(this.f21572i == a.POLYMORPHIC)) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString());
            }
        }
        if (this.f21568e) {
            if (!kotlin.jvm.internal.t.a(this.f21569f, "    ")) {
                String str = this.f21569f;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (!(cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f21569f).toString());
                }
            }
        } else if (!kotlin.jvm.internal.t.a(this.f21569f, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new g(this.f21564a, this.f21566c, this.f21567d, this.f21578o, this.f21568e, this.f21565b, this.f21569f, this.f21570g, this.f21579p, this.f21571h, this.f21577n, this.f21573j, null, this.f21574k, this.f21575l, this.f21576m, this.f21572i);
    }

    public final le.c b() {
        return this.f21580q;
    }

    public final void c(boolean z10) {
        this.f21578o = z10;
    }

    public final void d(boolean z10) {
        this.f21564a = z10;
    }

    public final void e(boolean z10) {
        this.f21565b = z10;
    }

    public final void f(boolean z10) {
        this.f21566c = z10;
    }

    public final void g(boolean z10) {
        this.f21568e = z10;
    }
}
