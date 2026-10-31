package j2;

import b2.j;
import d2.p;
import d2.u;
import e2.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k2.x;

/* JADX INFO: compiled from: DefaultScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f20552f = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f20553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f20554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e2.e f20555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l2.d f20556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m2.a f20557e;

    public c(Executor executor, e2.e eVar, x xVar, l2.d dVar, m2.a aVar) {
        this.f20554b = executor;
        this.f20555c = eVar;
        this.f20553a = xVar;
        this.f20556d = dVar;
        this.f20557e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, d2.i iVar) {
        this.f20556d.d0(pVar, iVar);
        this.f20553a.a(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final p pVar, j jVar, d2.i iVar) {
        try {
            m mVarA = this.f20555c.a(pVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f20552f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                final d2.i iVarB = mVarA.b(iVar);
                this.f20557e.e(new m2.a.InterfaceC0362a() { // from class: j2.b
                    @Override // m2.a.InterfaceC0362a
                    public final Object execute() {
                        return this.f20549a.d(pVar, iVarB);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e10) {
            f20552f.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    @Override // j2.e
    public void a(final p pVar, final d2.i iVar, final j jVar) {
        this.f20554b.execute(new Runnable() { // from class: j2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f20545a.e(pVar, jVar, iVar);
            }
        });
    }
}
