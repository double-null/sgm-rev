package k2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Uploader.java */
/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e2.e f21183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l2.d f21184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f21185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f21186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m2.a f21187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n2.a f21188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n2.a f21189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l2.c f21190i;

    public r(Context context, e2.e eVar, l2.d dVar, x xVar, Executor executor, m2.a aVar, n2.a aVar2, n2.a aVar3, l2.c cVar) {
        this.f21182a = context;
        this.f21183b = eVar;
        this.f21184c = dVar;
        this.f21185d = xVar;
        this.f21186e = executor;
        this.f21187f = aVar;
        this.f21188g = aVar2;
        this.f21189h = aVar3;
        this.f21190i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(d2.p pVar) {
        return Boolean.valueOf(this.f21184c.M(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(d2.p pVar) {
        return this.f21184c.E(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, d2.p pVar, long j10) {
        this.f21184c.O(iterable);
        this.f21184c.W(pVar, this.f21188g.getTime() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f21184c.g(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f21190i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f21190i.c(((Integer) entry.getValue()).intValue(), g2.c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(d2.p pVar, long j10) {
        this.f21184c.W(pVar, this.f21188g.getTime() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(d2.p pVar, int i10) {
        this.f21185d.a(pVar, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final d2.p pVar, final int i10, Runnable runnable) {
        try {
            try {
                m2.a aVar = this.f21187f;
                final l2.d dVar = this.f21184c;
                Objects.requireNonNull(dVar);
                aVar.e(new m2.a.InterfaceC0362a() { // from class: k2.i
                    @Override // m2.a.InterfaceC0362a
                    public final Object execute() {
                        return Integer.valueOf(dVar.d());
                    }
                });
                if (k()) {
                    u(pVar, i10);
                } else {
                    this.f21187f.e(new m2.a.InterfaceC0362a() { // from class: k2.j
                        @Override // m2.a.InterfaceC0362a
                        public final Object execute() {
                            return this.f21163a.s(pVar, i10);
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f21185d.a(pVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public d2.i j(e2.m mVar) {
        m2.a aVar = this.f21187f;
        final l2.c cVar = this.f21190i;
        Objects.requireNonNull(cVar);
        return mVar.b(d2.i.a().i(this.f21188g.getTime()).o(this.f21189h.getTime()).n("GDT_CLIENT_METRICS").h(new d2.h(b2.b.b("proto"), ((g2.a) aVar.e(new m2.a.InterfaceC0362a() { // from class: k2.h
            @Override // m2.a.InterfaceC0362a
            public final Object execute() {
                return cVar.f();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f21182a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public e2.g u(final d2.p pVar, int i10) {
        e2.g gVarA;
        e2.m mVarA = this.f21183b.a(pVar.b());
        long jMax = 0;
        e2.g gVarE = e2.g.e(0L);
        while (true) {
            final long j10 = jMax;
            while (true) {
                if (!((Boolean) this.f21187f.e(new m2.a.InterfaceC0362a() { // from class: k2.k
                    @Override // m2.a.InterfaceC0362a
                    public final Object execute() {
                        return this.f21166a.l(pVar);
                    }
                })).booleanValue()) {
                    this.f21187f.e(new m2.a.InterfaceC0362a() { // from class: k2.q
                        @Override // m2.a.InterfaceC0362a
                        public final Object execute() {
                            return this.f21179a.r(pVar, j10);
                        }
                    });
                    return gVarE;
                }
                final Iterable iterable = (Iterable) this.f21187f.e(new m2.a.InterfaceC0362a() { // from class: k2.l
                    @Override // m2.a.InterfaceC0362a
                    public final Object execute() {
                        return this.f21168a.m(pVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVarA == null) {
                    h2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    gVarA = e2.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((l2.k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(mVarA));
                    }
                    gVarA = mVarA.a(e2.f.a().b(arrayList).c(pVar.c()).a());
                }
                gVarE = gVarA;
                if (gVarE.c() == e2.g.a.TRANSIENT_ERROR) {
                    this.f21187f.e(new m2.a.InterfaceC0362a() { // from class: k2.m
                        @Override // m2.a.InterfaceC0362a
                        public final Object execute() {
                            return this.f21170a.n(iterable, pVar, j10);
                        }
                    });
                    this.f21185d.b(pVar, i10 + 1, true);
                    return gVarE;
                }
                this.f21187f.e(new m2.a.InterfaceC0362a() { // from class: k2.n
                    @Override // m2.a.InterfaceC0362a
                    public final Object execute() {
                        return this.f21174a.o(iterable);
                    }
                });
                if (gVarE.c() == e2.g.a.OK) {
                    break;
                }
                if (gVarE.c() == e2.g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strN = ((l2.k) it2.next()).b().n();
                        if (map.containsKey(strN)) {
                            map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                        } else {
                            map.put(strN, 1);
                        }
                    }
                    this.f21187f.e(new m2.a.InterfaceC0362a() { // from class: k2.p
                        @Override // m2.a.InterfaceC0362a
                        public final Object execute() {
                            return this.f21177a.q(map);
                        }
                    });
                }
            }
            jMax = Math.max(j10, gVarE.b());
            if (pVar.e()) {
                this.f21187f.e(new m2.a.InterfaceC0362a() { // from class: k2.o
                    @Override // m2.a.InterfaceC0362a
                    public final Object execute() {
                        return this.f21176a.p();
                    }
                });
            }
        }
    }

    public void v(final d2.p pVar, final int i10, final Runnable runnable) {
        this.f21186e.execute(new Runnable() { // from class: k2.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f21157a.t(pVar, i10, runnable);
            }
        });
    }
}
