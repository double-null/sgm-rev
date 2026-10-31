package ra;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.t;
import la.g;
import mb.b;
import qa.c;
import qb.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends qa.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b f24987s;

    /* JADX INFO: renamed from: ra.a$a, reason: collision with other inner class name */
    private final class C0408a implements b.d {
        public C0408a() {
        }

        @Override // mb.b.d
        public void a() {
            a.this.u().a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, g repository, pb.a adElementParams, c adFormListener, fb.b eventCallback, db.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(adElementParams, "adElementParams");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        b bVar = new b(context);
        bVar.setListener(new C0408a());
        this.f24987s = bVar;
    }

    @Override // qa.a
    public View J() {
        return this.f24987s;
    }

    @Override // qa.a
    protected void L() {
        this.f24987s.h();
    }

    @Override // pa.d0, pa.c0
    public void a(String str) {
        Integer numA = l.a(str);
        if (numA == null) {
            pa.t.c("Can't obtain time to start", new Object[0]);
        } else {
            this.f24987s.setDuration(numA.intValue());
            this.f24987s.n();
        }
    }

    @Override // pa.d
    public void b() {
        E().e(this);
    }

    @Override // qa.a, pa.d
    public void c() {
        this.f24987s.m();
        super.c();
    }

    @Override // qa.a, pa.d
    public void d() {
        super.d();
        this.f24987s.o();
    }
}
