package d2;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: TransportRuntime.java */
/* JADX INFO: loaded from: classes3.dex */
public class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile v f13237e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n2.a f13238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n2.a f13239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j2.e f13240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2.r f13241d;

    u(n2.a aVar, n2.a aVar2, j2.e eVar, k2.r rVar, k2.v vVar) {
        this.f13238a = aVar;
        this.f13239b = aVar2;
        this.f13240c = eVar;
        this.f13241d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a aVarG = i.a().i(this.f13238a.getTime()).o(this.f13239b.getTime()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        oVar.c().e();
        oVar.c().b();
        return aVarG.d();
    }

    public static u c() {
        v vVar = f13237e;
        if (vVar != null) {
            return vVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b2.b> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(b2.b.b("proto"));
    }

    public static void f(Context context) {
        if (f13237e == null) {
            synchronized (u.class) {
                if (f13237e == null) {
                    f13237e = e.a().a(context).build();
                }
            }
        }
    }

    @Override // d2.t
    public void a(o oVar, b2.j jVar) {
        this.f13240c.a(oVar.f().f(oVar.c().d()), b(oVar), jVar);
    }

    public k2.r e() {
        return this.f13241d;
    }

    public b2.i g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
