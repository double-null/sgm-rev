package v5;

import android.webkit.WebView;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o5.d;
import o5.n;
import o5.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s5.g;
import s5.h;
import w5.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z5.b f27143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o5.a f27144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p5.b f27145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC0449a f27146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f27147f;

    /* JADX INFO: renamed from: v5.a$a, reason: collision with other inner class name */
    enum EnumC0449a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a(String str) {
        d();
        this.f27142a = str;
        this.f27143b = new z5.b(null);
    }

    private JSONArray a(List<q5.b> list) {
        JSONArray jSONArray = new JSONArray();
        for (q5.b bVar : list) {
            Iterator<String> it = bVar.c().iterator();
            while (it.hasNext()) {
                jSONArray.put(c(bVar, it.next()));
            }
        }
        return jSONArray;
    }

    private JSONObject b(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        w5.c.g(jSONObject, "supportedAttestationMechanisms", jSONArray);
        return jSONObject;
    }

    private void o(JSONObject jSONObject) {
        h.a().o(B(), jSONObject);
    }

    public void A() {
        h.a().l(B(), this.f27142a);
    }

    public WebView B() {
        return this.f27143b.get();
    }

    public void C() {
        u(null);
    }

    public void D() {
    }

    public void d() {
        this.f27147f = f.b();
        this.f27146e = EnumC0449a.AD_STATE_IDLE;
    }

    public void e(float f10) {
        h.a().c(B(), this.f27142a, f10);
    }

    void f(WebView webView) {
        this.f27143b = new z5.b(webView);
    }

    public void g(String str) {
        i(str, null);
    }

    public void h(String str, long j10) {
        if (j10 >= this.f27147f) {
            EnumC0449a enumC0449a = this.f27146e;
            EnumC0449a enumC0449a2 = EnumC0449a.AD_STATE_NOTVISIBLE;
            if (enumC0449a != enumC0449a2) {
                this.f27146e = enumC0449a2;
                h.a().m(B(), this.f27142a, str);
            }
        }
    }

    public void i(String str, JSONObject jSONObject) {
        h.a().e(B(), this.f27142a, str, jSONObject);
    }

    public void j(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        w5.c.g(jSONObject, SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(date.getTime()));
        h.a().j(B(), jSONObject);
    }

    public void k(o5.a aVar) {
        this.f27144c = aVar;
    }

    public void l(o5.c cVar) {
        h.a().f(B(), this.f27142a, cVar.d());
    }

    public void m(o oVar, d dVar) {
        n(oVar, dVar, null);
    }

    protected void n(o oVar, d dVar, JSONObject jSONObject) {
        String strK = oVar.k();
        JSONObject jSONObject2 = new JSONObject();
        w5.c.g(jSONObject2, "environment", "app");
        w5.c.g(jSONObject2, "adSessionType", dVar.d());
        w5.c.g(jSONObject2, "deviceInfo", w5.b.d());
        w5.c.g(jSONObject2, "deviceCategory", w5.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        w5.c.g(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        w5.c.g(jSONObject3, "partnerName", dVar.i().b());
        w5.c.g(jSONObject3, "partnerVersion", dVar.i().c());
        w5.c.g(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        w5.c.g(jSONObject4, "libraryVersion", "1.6.2-Vungle");
        w5.c.g(jSONObject4, "appId", g.c().a().getApplicationContext().getPackageName());
        w5.c.g(jSONObject2, "app", jSONObject4);
        if (dVar.e() != null) {
            w5.c.g(jSONObject2, "contentUrl", dVar.e());
        }
        if (dVar.f() != null) {
            w5.c.g(jSONObject2, "customReferenceData", dVar.f());
        }
        dVar.j();
        JSONObject jSONObject5 = new JSONObject();
        for (n nVar : dVar.k()) {
            w5.c.g(jSONObject5, nVar.c(), nVar.d());
        }
        h.a().g(B(), strK, jSONObject2, jSONObject5, jSONObject);
    }

    public void p(p5.b bVar) {
        this.f27145d = bVar;
    }

    public void q(boolean z10) {
        if (y()) {
            h.a().p(B(), this.f27142a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void r() {
        this.f27143b.clear();
    }

    public void s(String str, long j10) {
        if (j10 >= this.f27147f) {
            this.f27146e = EnumC0449a.AD_STATE_VISIBLE;
            h.a().m(B(), this.f27142a, str);
        }
    }

    public void t(List<q5.b> list) {
        try {
            o(b(a(list)));
        } catch (JSONException e10) {
            w5.d.b("Error creating JSON object publishSupportedAttestationMechanisms", e10);
        }
    }

    public void u(JSONObject jSONObject) {
        h.a().n(B(), this.f27142a, jSONObject);
    }

    public void v(boolean z10) {
        if (y()) {
            h.a().d(B(), this.f27142a, z10 ? "locked" : "unlocked");
        }
    }

    public o5.a w() {
        return this.f27144c;
    }

    public p5.b x() {
        return this.f27145d;
    }

    public boolean y() {
        return this.f27143b.get() != null;
    }

    public void z() {
        h.a().b(B(), this.f27142a);
    }

    private JSONObject c(q5.b bVar, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(wHzciBnJlYkdX.Eds, bVar.a());
        jSONObject.put("executionEnvironment", bVar.b().toString());
        jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str);
        return jSONObject;
    }
}
