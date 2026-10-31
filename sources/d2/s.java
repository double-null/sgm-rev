package d2;

/* JADX INFO: compiled from: TransportImpl.java */
/* JADX INFO: loaded from: classes3.dex */
final class s<T> implements b2.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f13232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2.b f13234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b2.g<T, byte[]> f13235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f13236e;

    s(p pVar, String str, b2.b bVar, b2.g<T, byte[]> gVar, t tVar) {
        this.f13232a = pVar;
        this.f13233b = str;
        this.f13234c = bVar;
        this.f13235d = gVar;
        this.f13236e = tVar;
    }

    @Override // b2.h
    public void a(b2.c<T> cVar, b2.j jVar) {
        this.f13236e.a(o.a().e(this.f13232a).c(cVar).f(this.f13233b).d(this.f13235d).b(this.f13234c).a(), jVar);
    }

    @Override // b2.h
    public void b(b2.c<T> cVar) {
        a(cVar, new b2.j() { // from class: d2.r
            @Override // b2.j
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    p d() {
        return this.f13232a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
