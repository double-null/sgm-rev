package a5;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f29a;

    private a(p pVar) {
        this.f29a = pVar;
    }

    public static a a(b bVar) {
        p pVar = (p) bVar;
        i5.g.d(bVar, "AdSession is null");
        i5.g.l(pVar);
        i5.g.g(pVar);
        a aVar = new a(pVar);
        pVar.m().f(aVar);
        return aVar;
    }

    public void b() {
        i5.g.g(this.f29a);
        i5.g.j(this.f29a);
        if (!this.f29a.q()) {
            try {
                this.f29a.e();
            } catch (Exception unused) {
            }
        }
        if (this.f29a.q()) {
            this.f29a.v();
        }
    }

    public void c() {
        i5.g.c(this.f29a);
        i5.g.j(this.f29a);
        this.f29a.w();
    }

    public void d(b5.d dVar) {
        i5.g.d(dVar, "VastProperties is null");
        i5.g.c(this.f29a);
        i5.g.j(this.f29a);
        this.f29a.i(dVar.a());
    }
}
