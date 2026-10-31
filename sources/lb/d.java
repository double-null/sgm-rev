package lb;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import wb.y;
import wc.g0;

/* JADX INFO: loaded from: classes5.dex */
public class d implements lb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f21948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f21950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f21951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f21952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f21953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f21954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f21955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f21956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f21957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f21958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f21959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f21960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f21961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f21962o;

    public static final class a implements lb.a.b {
        a() {
        }

        @Override // lb.a.b
        public void a(lb.a source, lb.a.EnumC0355a event) {
            t.f(source, "source");
            t.f(event, "event");
            pa.t.g(d.this.f21948a, "Event: " + event, new Object[0]);
        }
    }

    public d(String parent) {
        t.f(parent, "parent");
        this.f21948a = new y("DefaultAdState (" + parent + ')');
        this.f21949b = new AtomicBoolean(false);
        this.f21950c = new AtomicBoolean(false);
        this.f21951d = new AtomicBoolean(false);
        this.f21952e = new AtomicBoolean(false);
        this.f21953f = new AtomicBoolean(false);
        this.f21954g = new AtomicBoolean(false);
        this.f21955h = new AtomicBoolean(false);
        this.f21956i = new AtomicBoolean(false);
        this.f21957j = new AtomicBoolean(false);
        this.f21958k = new AtomicBoolean(false);
        this.f21959l = new AtomicBoolean(false);
        this.f21960m = new AtomicBoolean(false);
        this.f21961n = new AtomicBoolean(false);
        this.f21962o = new LinkedHashSet();
        l(new a());
    }

    @Override // lb.a
    public boolean b() {
        boolean zCompareAndSet = this.f21950c.compareAndSet(false, true);
        if (zCompareAndSet) {
            c(lb.a.EnumC0355a.LoadingStarted);
        }
        return zCompareAndSet;
    }

    @Override // lb.a
    public boolean c() {
        return this.f21951d.get();
    }

    @Override // lb.a
    public boolean d() {
        boolean zCompareAndSet = this.f21956i.compareAndSet(false, true);
        if (zCompareAndSet) {
            c(lb.a.EnumC0355a.FailedToShow);
        }
        return zCompareAndSet;
    }

    @Override // lb.a
    public void destroy() {
        this.f21952e.set(true);
        this.f21949b.set(false);
        this.f21950c.set(false);
        this.f21951d.set(false);
        this.f21953f.set(false);
        this.f21954g.set(false);
        this.f21955h.set(false);
        this.f21956i.set(false);
        this.f21957j.set(false);
        this.f21958k.set(false);
        this.f21959l.set(false);
        this.f21960m.set(false);
        this.f21961n.set(false);
        c(lb.a.EnumC0355a.Destroyed);
        synchronized (this.f21962o) {
            this.f21962o.clear();
            g0 g0Var = g0.f27756a;
        }
    }

    @Override // lb.a
    public boolean e() {
        boolean zCompareAndSet = this.f21957j.compareAndSet(false, true);
        if (zCompareAndSet) {
            c(lb.a.EnumC0355a.Clicked);
        }
        return zCompareAndSet;
    }

    @Override // lb.a
    public boolean f() {
        boolean zCompareAndSet = this.f21954g.compareAndSet(false, true);
        if (zCompareAndSet) {
            c(lb.a.EnumC0355a.ViewabilityShow);
        }
        return zCompareAndSet;
    }

    @Override // lb.a
    public boolean g() {
        return this.f21958k.get();
    }

    @Override // lb.a
    public boolean h() {
        return this.f21954g.get();
    }

    @Override // lb.a
    public boolean i() {
        return this.f21952e.get();
    }

    @Override // lb.a
    public boolean j() {
        boolean zCompareAndSet = this.f21955h.compareAndSet(false, true);
        if (zCompareAndSet) {
            c(lb.a.EnumC0355a.Shown);
        }
        return zCompareAndSet;
    }

    @Override // lb.a
    public boolean k() {
        return this.f21961n.get();
    }

    @Override // lb.a
    public void l() {
        this.f21961n.set(true);
    }

    @Override // lb.a
    public final void m(lb.a.b observer) {
        t.f(observer, "observer");
        synchronized (this.f21962o) {
            this.f21962o.remove(observer);
        }
    }

    @Override // lb.a
    public boolean n() {
        return this.f21955h.get();
    }

    @Override // lb.a
    public boolean o() {
        return this.f21959l.get();
    }

    @Override // lb.a
    public boolean r() {
        boolean zCompareAndSet = this.f21960m.compareAndSet(false, true);
        if (zCompareAndSet) {
            c(lb.a.EnumC0355a.Expired);
        }
        return zCompareAndSet;
    }

    @Override // lb.a
    public void s() {
        this.f21951d.set(true);
        c(lb.a.EnumC0355a.ShowInitiated);
    }

    private final void c(lb.a.EnumC0355a enumC0355a) {
        synchronized (this.f21962o) {
            Iterator it = this.f21962o.iterator();
            while (it.hasNext()) {
                ((lb.a.b) it.next()).a(this, enumC0355a);
            }
            g0 g0Var = g0.f27756a;
        }
    }

    @Override // lb.a
    public boolean a() {
        return this.f21949b.get() && !i();
    }

    @Override // lb.a
    public final void l(lb.a.b observer) {
        t.f(observer, "observer");
        if (i()) {
            return;
        }
        synchronized (this.f21962o) {
            this.f21962o.add(observer);
        }
    }

    @Override // lb.a
    public boolean a(boolean z10) {
        boolean z11 = false;
        this.f21950c.set(false);
        this.f21949b.set(z10);
        if (this.f21953f.compareAndSet(false, true) && !i()) {
            z11 = true;
        }
        if (z11) {
            c(z10 ? lb.a.EnumC0355a.Loaded : lb.a.EnumC0355a.FailedToLoad);
        }
        return z11;
    }

    @Override // lb.a
    public boolean b(boolean z10) {
        boolean zCompareAndSet = this.f21959l.compareAndSet(!z10, z10);
        if (zCompareAndSet) {
            c(z10 ? lb.a.EnumC0355a.Appeared : lb.a.EnumC0355a.Disappeared);
        }
        return zCompareAndSet;
    }

    @Override // lb.a
    public boolean m() {
        boolean zCompareAndSet = this.f21958k.compareAndSet(false, true);
        if (zCompareAndSet) {
            c(lb.a.EnumC0355a.Finished);
        }
        return zCompareAndSet;
    }
}
