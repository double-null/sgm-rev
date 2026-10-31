package h5;

import a5.d;
import a5.o;
import a5.p;
import android.webkit.WebView;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import e5.g;
import e5.h;
import i5.f;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l5.b f15597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a5.a f15598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b5.b f15599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC0237a f15600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f15601f;

    /* JADX INFO: renamed from: h5.a$a, reason: collision with other inner class name */
    enum EnumC0237a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a(String str) {
        d();
        this.f15596a = str;
        this.f15597b = new l5.b(null);
    }

    private JSONArray a(List<c5.b> list) {
        JSONArray jSONArray = new JSONArray();
        for (c5.b bVar : list) {
            Iterator<String> it = bVar.c().iterator();
            while (it.hasNext()) {
                jSONArray.put(b(bVar, it.next()));
            }
        }
        return jSONArray;
    }

    private JSONObject b(c5.b bVar, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mechanism", bVar.a());
        jSONObject.put("executionEnvironment", bVar.b().toString());
        jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str);
        return jSONObject;
    }

    private JSONObject c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        i5.c.i(jSONObject, "supportedAttestationMechanisms", jSONArray);
        return jSONObject;
    }

    private void q(JSONObject jSONObject) {
        h.a().p(C(), jSONObject);
    }

    public void A() {
        h.a().b(C(), this.f15596a);
    }

    public void B() {
        h.a().m(C(), this.f15596a);
    }

    public WebView C() {
        return this.f15597b.get();
    }

    public void D() {
        v(null);
    }

    public void d() {
        this.f15601f = f.b();
        this.f15600e = EnumC0237a.AD_STATE_IDLE;
    }

    public void e(float f10) {
        h.a().c(C(), this.f15596a, f10);
    }

    public void f(a5.a aVar) {
        this.f15598c = aVar;
    }

    public void g(a5.c cVar) {
        h.a().g(C(), this.f15596a, cVar.d());
    }

    public void h(a5.h hVar, String str) {
        h.a().d(C(), this.f15596a, hVar, str);
    }

    public void i(p pVar, d dVar) {
        j(pVar, dVar, null);
    }

    protected void j(p pVar, d dVar, JSONObject jSONObject) {
        String strL = pVar.l();
        JSONObject jSONObject2 = new JSONObject();
        i5.c.i(jSONObject2, "environment", "app");
        i5.c.i(jSONObject2, "adSessionType", dVar.d());
        i5.c.i(jSONObject2, "deviceInfo", i5.b.d());
        i5.c.i(jSONObject2, "deviceCategory", i5.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        i5.c.i(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        i5.c.i(jSONObject3, "partnerName", dVar.i().b());
        i5.c.i(jSONObject3, "partnerVersion", dVar.i().c());
        i5.c.i(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        i5.c.i(jSONObject4, "libraryVersion", "1.6.1-Appodeal");
        i5.c.i(jSONObject4, "appId", g.c().a().getApplicationContext().getPackageName());
        i5.c.i(jSONObject2, "app", jSONObject4);
        if (dVar.e() != null) {
            i5.c.i(jSONObject2, "contentUrl", dVar.e());
        }
        if (dVar.f() != null) {
            i5.c.i(jSONObject2, "customReferenceData", dVar.f());
        }
        dVar.j();
        JSONObject jSONObject5 = new JSONObject();
        for (o oVar : dVar.k()) {
            i5.c.i(jSONObject5, oVar.d(), oVar.e());
        }
        h.a().h(C(), strL, jSONObject2, jSONObject5, jSONObject);
    }

    void k(WebView webView) {
        this.f15597b = new l5.b(webView);
    }

    public void l(b5.b bVar) {
        this.f15599d = bVar;
    }

    public void m(String str) {
        o(str, null);
    }

    public void n(String str, long j10) {
        if (j10 >= this.f15601f) {
            EnumC0237a enumC0237a = this.f15600e;
            EnumC0237a enumC0237a2 = EnumC0237a.AD_STATE_NOTVISIBLE;
            if (enumC0237a != enumC0237a2) {
                this.f15600e = enumC0237a2;
                h.a().n(C(), this.f15596a, str);
            }
        }
    }

    public void o(String str, JSONObject jSONObject) {
        h.a().f(C(), this.f15596a, str, jSONObject);
    }

    public void p(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        i5.c.i(jSONObject, SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(date.getTime()));
        h.a().k(C(), jSONObject);
    }

    public void r(boolean z10) {
        if (z()) {
            h.a().q(C(), this.f15596a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void s() {
        this.f15597b.clear();
    }

    public void t(String str, long j10) {
        if (j10 >= this.f15601f) {
            this.f15600e = EnumC0237a.AD_STATE_VISIBLE;
            h.a().n(C(), this.f15596a, str);
        }
    }

    public void u(List<c5.b> list) {
        try {
            q(c(a(list)));
        } catch (JSONException e10) {
            i5.d.b("Error creating JSON object publishSupportedAttestationMechanisms", e10);
        }
    }

    public void v(JSONObject jSONObject) {
        h.a().o(C(), this.f15596a, jSONObject);
    }

    public void w(boolean z10) {
        if (z()) {
            h.a().e(C(), this.f15596a, z10 ? "locked" : "unlocked");
        }
    }

    public a5.a x() {
        return this.f15598c;
    }

    public b5.b y() {
        return this.f15599d;
    }

    public boolean z() {
        return this.f15597b.get() != null;
    }

    public void E() {
    }
}
