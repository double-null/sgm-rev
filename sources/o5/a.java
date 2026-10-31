package o5;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f23037a;

    private a(o oVar) {
        this.f23037a = oVar;
    }

    public static a a(b bVar) {
        o oVar = (o) bVar;
        w5.g.b(bVar, "AdSession is null");
        w5.g.l(oVar);
        w5.g.g(oVar);
        a aVar = new a(oVar);
        oVar.l().k(aVar);
        return aVar;
    }

    public void b() {
        w5.g.g(this.f23037a);
        w5.g.j(this.f23037a);
        if (!this.f23037a.p()) {
            try {
                this.f23037a.d();
            } catch (Exception unused) {
            }
        }
        if (this.f23037a.p()) {
            this.f23037a.u();
        }
    }

    public void c() {
        w5.g.f(this.f23037a);
        w5.g.j(this.f23037a);
        this.f23037a.v();
    }

    public void d(p5.d dVar) {
        w5.g.b(dVar, "VastProperties is null");
        w5.g.f(this.f23037a);
        w5.g.j(this.f23037a);
        this.f23037a.h(dVar.a());
    }
}
