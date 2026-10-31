package o5;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class o extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f23096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f23097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s5.f f23098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z5.a f23099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v5.a f23100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f23103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23105j;

    o(c cVar, d dVar) {
        this(cVar, dVar, UUID.randomUUID().toString());
    }

    private void e() {
        if (this.f23104i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void f(View view) {
        Collection<o> collectionC = s5.c.e().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (o oVar : collectionC) {
            if (oVar != this && oVar.m() == view) {
                oVar.f23099d.clear();
            }
        }
    }

    private void i() {
        if (this.f23105j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void j(View view) {
        this.f23099d = new z5.a(view);
    }

    @Override // o5.b
    public void b() {
        if (this.f23102g) {
            return;
        }
        this.f23099d.clear();
        w();
        this.f23102g = true;
        l().z();
        s5.c.e().d(this);
        l().r();
        this.f23100e = null;
    }

    @Override // o5.b
    public void c(View view) {
        if (this.f23102g || m() == view) {
            return;
        }
        j(view);
        l().d();
        f(view);
    }

    @Override // o5.b
    public void d() {
        if (this.f23101f || this.f23100e == null) {
            return;
        }
        this.f23101f = true;
        s5.c.e().f(this);
        this.f23100e.e(s5.i.d().c());
        this.f23100e.j(s5.a.a().c());
        this.f23100e.t(q5.c.b(s5.g.c().a()).a());
        this.f23100e.m(this, this.f23096a);
    }

    public void g(List<z5.a> list) {
        if (o()) {
            ArrayList arrayList = new ArrayList();
            Iterator<z5.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    void h(JSONObject jSONObject) {
        i();
        l().u(jSONObject);
        this.f23105j = true;
    }

    public String k() {
        return this.f23103h;
    }

    public v5.a l() {
        return this.f23100e;
    }

    public View m() {
        return this.f23099d.get();
    }

    public List<s5.e> n() {
        return this.f23098c.a();
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return this.f23101f && !this.f23102g;
    }

    public boolean q() {
        return this.f23102g;
    }

    public boolean r() {
        return this.f23097b.b();
    }

    public boolean s() {
        return this.f23097b.c();
    }

    public boolean t() {
        return this.f23101f;
    }

    void u() {
        e();
        l().A();
        this.f23104i = true;
    }

    void v() {
        i();
        l().C();
        this.f23105j = true;
    }

    public void w() {
        if (this.f23102g) {
            return;
        }
        this.f23098c.b();
    }

    o(c cVar, d dVar, String str) {
        this.f23098c = new s5.f();
        this.f23101f = false;
        this.f23102g = false;
        this.f23097b = cVar;
        this.f23096a = dVar;
        this.f23103h = str;
        j(null);
        this.f23100e = (dVar.d() == e.HTML || dVar.d() == e.JAVASCRIPT) ? new v5.b(str, dVar.l()) : new v5.c(str, dVar.g(), dVar.h());
        this.f23100e.D();
        s5.c.e().b(this);
        this.f23100e.l(cVar);
    }
}
