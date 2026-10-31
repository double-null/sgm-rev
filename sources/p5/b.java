package p5;

import o5.o;
import org.json.JSONObject;
import s5.i;
import w5.g;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f23467a;

    private b(o oVar) {
        this.f23467a = oVar;
    }

    private void c(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void d(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static b e(o5.b bVar) {
        o oVar = (o) bVar;
        g.b(bVar, "AdSession is null");
        g.k(oVar);
        g.h(oVar);
        g.g(oVar);
        g.m(oVar);
        b bVar2 = new b(oVar);
        oVar.l().p(bVar2);
        return bVar2;
    }

    public void a(a aVar) {
        g.b(aVar, "InteractionType is null");
        g.f(this.f23467a);
        JSONObject jSONObject = new JSONObject();
        w5.c.g(jSONObject, "interactionType", aVar);
        this.f23467a.l().i("adUserInteraction", jSONObject);
    }

    public void b() {
        g.f(this.f23467a);
        this.f23467a.l().g("complete");
    }

    public void f() {
        g.f(this.f23467a);
        this.f23467a.l().g("firstQuartile");
    }

    public void g() {
        g.f(this.f23467a);
        this.f23467a.l().g("midpoint");
    }

    public void h() {
        g.f(this.f23467a);
        this.f23467a.l().g("pause");
    }

    public void i() {
        g.f(this.f23467a);
        this.f23467a.l().g("resume");
    }

    public void j(float f10, float f11) {
        c(f10);
        d(f11);
        g.f(this.f23467a);
        JSONObject jSONObject = new JSONObject();
        w5.c.g(jSONObject, "duration", Float.valueOf(f10));
        w5.c.g(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        w5.c.g(jSONObject, "deviceVolume", Float.valueOf(i.d().c()));
        this.f23467a.l().i("start", jSONObject);
    }

    public void k() {
        g.f(this.f23467a);
        this.f23467a.l().g("thirdQuartile");
    }

    public void l(float f10) {
        d(f10);
        g.f(this.f23467a);
        JSONObject jSONObject = new JSONObject();
        w5.c.g(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        w5.c.g(jSONObject, "deviceVolume", Float.valueOf(i.d().c()));
        this.f23467a.l().i("volumeChange", jSONObject);
    }
}
