package k2;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: WorkInitializer.java */
/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.d f21203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f21204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m2.a f21205d;

    v(Executor executor, l2.d dVar, x xVar, m2.a aVar) {
        this.f21202a = executor;
        this.f21203b = dVar;
        this.f21204c = xVar;
        this.f21205d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<d2.p> it = this.f21203b.r().iterator();
        while (it.hasNext()) {
            this.f21204c.a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f21205d.e(new m2.a.InterfaceC0362a() { // from class: k2.u
            @Override // m2.a.InterfaceC0362a
            public final Object execute() {
                return this.f21201a.d();
            }
        });
    }

    public void c() {
        this.f21202a.execute(new Runnable() { // from class: k2.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f21200a.e();
            }
        });
    }
}
