package pb;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f24089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f24090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f24091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f24093e;

    public h(f event, i style, g gVar, long j10, e eVar) {
        kotlin.jvm.internal.t.f(event, "event");
        kotlin.jvm.internal.t.f(style, "style");
        this.f24089a = event;
        this.f24090b = style;
        this.f24091c = gVar;
        this.f24092d = j10;
        this.f24093e = eVar;
    }

    public final e a() {
        e eVar = this.f24093e;
        return eVar == null ? e.Left : eVar;
    }

    public final long b() {
        return this.f24092d;
    }

    public final g c() {
        return this.f24091c;
    }

    public final i d() {
        return this.f24090b;
    }
}
