package b5;

import a5.p;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.facebook.login.LoginLogger;
import e5.i;
import i5.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f4095a;

    private b(p pVar) {
        this.f4095a = pVar;
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

    public static b e(a5.b bVar) {
        p pVar = (p) bVar;
        g.d(bVar, "AdSession is null");
        g.k(pVar);
        g.h(pVar);
        g.g(pVar);
        g.m(pVar);
        b bVar2 = new b(pVar);
        pVar.m().l(bVar2);
        return bVar2;
    }

    public void b() {
        g.c(this.f4095a);
        this.f4095a.m().m("complete");
    }

    public void f() {
        g.c(this.f4095a);
        this.f4095a.m().m("firstQuartile");
    }

    public void g() {
        g.c(this.f4095a);
        this.f4095a.m().m("midpoint");
    }

    public void h() {
        g.c(this.f4095a);
        this.f4095a.m().m("pause");
    }

    public void i() {
        g.c(this.f4095a);
        this.f4095a.m().m("resume");
    }

    public void j() {
        g.c(this.f4095a);
        this.f4095a.m().m(LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED);
    }

    public void k(float f10, float f11) {
        c(f10);
        d(f11);
        g.c(this.f4095a);
        JSONObject jSONObject = new JSONObject();
        i5.c.i(jSONObject, "duration", Float.valueOf(f10));
        i5.c.i(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        i5.c.i(jSONObject, "deviceVolume", Float.valueOf(i.d().c()));
        this.f4095a.m().o("start", jSONObject);
    }

    public void l() {
        g.c(this.f4095a);
        this.f4095a.m().m("thirdQuartile");
    }

    public void m(float f10) {
        d(f10);
        g.c(this.f4095a);
        JSONObject jSONObject = new JSONObject();
        i5.c.i(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        i5.c.i(jSONObject, "deviceVolume", Float.valueOf(i.d().c()));
        this.f4095a.m().o("volumeChange", jSONObject);
    }

    public void a(a aVar) {
        g.d(aVar, "InteractionType is null");
        g.c(this.f4095a);
        JSONObject jSONObject = new JSONObject();
        i5.c.i(jSONObject, sRGQSqxgxlS.ZBIoGfSituBIQu, aVar);
        this.f4095a.m().o("adUserInteraction", jSONObject);
    }
}
