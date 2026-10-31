package a5;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class p extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f92a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f93b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e5.f f94c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l5.a f95d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h5.a f96e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f97f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f98g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f99h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f101j;

    p(c cVar, d dVar) {
        this(cVar, dVar, UUID.randomUUID().toString());
    }

    private void f() {
        if (this.f100i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void g(View view) {
        Collection<p> collectionC = e5.c.e().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (p pVar : collectionC) {
            if (pVar != this && pVar.n() == view) {
                pVar.f95d.clear();
            }
        }
    }

    private void j() {
        if (this.f101j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void k(View view) {
        this.f95d = new l5.a(view);
    }

    @Override // a5.b
    public void b(h hVar, String str) {
        if (this.f98g) {
            throw new IllegalStateException("AdSession is finished");
        }
        i5.g.d(hVar, "Error type is null");
        i5.g.f(str, "Message is null");
        m().h(hVar, str);
    }

    @Override // a5.b
    public void c() {
        if (this.f98g) {
            return;
        }
        this.f95d.clear();
        x();
        this.f98g = true;
        m().A();
        e5.c.e().d(this);
        m().s();
        this.f96e = null;
    }

    @Override // a5.b
    public void d(View view) {
        if (this.f98g || n() == view) {
            return;
        }
        k(view);
        m().d();
        g(view);
    }

    @Override // a5.b
    public void e() {
        if (this.f97f || this.f96e == null) {
            return;
        }
        this.f97f = true;
        e5.c.e().f(this);
        this.f96e.e(e5.i.d().c());
        this.f96e.p(e5.a.a().c());
        this.f96e.u(c5.c.a(e5.g.c().a()).b());
        this.f96e.i(this, this.f92a);
    }

    public void h(List<l5.a> list) {
        if (p()) {
            ArrayList arrayList = new ArrayList();
            Iterator<l5.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    void i(JSONObject jSONObject) {
        j();
        m().v(jSONObject);
        this.f101j = true;
    }

    public String l() {
        return this.f99h;
    }

    public h5.a m() {
        return this.f96e;
    }

    public View n() {
        return this.f95d.get();
    }

    public List<e5.e> o() {
        return this.f94c.a();
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return this.f97f && !this.f98g;
    }

    public boolean r() {
        return this.f98g;
    }

    public boolean s() {
        return this.f93b.b();
    }

    public boolean t() {
        return this.f93b.c();
    }

    public boolean u() {
        return this.f97f;
    }

    void v() {
        f();
        m().B();
        this.f100i = true;
    }

    void w() {
        j();
        m().D();
        this.f101j = true;
    }

    public void x() {
        if (this.f98g) {
            return;
        }
        this.f94c.b();
    }

    p(c cVar, d dVar, String str) {
        this.f94c = new e5.f();
        this.f97f = false;
        this.f98g = false;
        this.f93b = cVar;
        this.f92a = dVar;
        this.f99h = str;
        k(null);
        this.f96e = (dVar.d() == e.HTML || dVar.d() == e.JAVASCRIPT) ? new h5.b(str, dVar.l()) : new h5.c(str, dVar.g(), dVar.h());
        this.f96e.E();
        e5.c.e().b(this);
        this.f96e.g(cVar);
    }
}
