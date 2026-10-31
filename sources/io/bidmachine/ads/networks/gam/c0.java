package io.bidmachine.ads.networks.gam;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: InternalGAMAd.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 implements ExpirationHandler.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f16521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f16522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdsFormat f16523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f16524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExpirationHandler f16525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile a f16526f = a.Idle;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<e0> f16527g;

    /* JADX INFO: compiled from: InternalGAMAd.java */
    enum a {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    c0(j jVar, AdsFormat adsFormat, t tVar) {
        this.f16521a = new oc.p(jVar.l() + "Ad");
        this.f16522b = jVar;
        this.f16523c = adsFormat;
        this.f16524d = tVar;
        this.f16525e = new ExpirationHandler(jVar.k(), this);
    }

    private void i(boolean z10) {
        io.bidmachine.core.a.b(this.f16521a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.v
            @Override // qc.b
            public final Object get() {
                return this.f16594a.t();
            }
        });
        WeakReference<e0> weakReference = this.f16527g;
        if (weakReference != null) {
            weakReference.clear();
            this.f16527g = null;
        }
        this.f16525e.stop();
        this.f16522b.x(this, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t() {
        return String.format("destroy (%s)", this.f16524d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String u() {
        return String.format("load (%s)", this.f16524d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Context context, o0 o0Var) {
        try {
            G(a.Loading);
            B(context, o0Var);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            o0Var.a(this, oc.a.l("Exception loading InternalGAM object", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String w() {
        return String.format("onAdLoaded (%s)", this.f16524d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String x() {
        return String.format("onAdShown (%s)", this.f16524d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String y() {
        return String.format("onExpired (%s)", this.f16524d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        try {
            j();
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    final void A(Context context, final o0 o0Var) {
        io.bidmachine.core.a.b(this.f16521a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.x
            @Override // qc.b
            public final Object get() {
                return this.f16596a.u();
            }
        });
        final Context applicationContext = context.getApplicationContext();
        io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.ads.networks.gam.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f16597a.v(applicationContext, o0Var);
            }
        });
    }

    protected abstract void B(Context context, o0 o0Var) throws Throwable;

    public void C() {
        io.bidmachine.core.a.b(this.f16521a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.b0
            @Override // qc.b
            public final Object get() {
                return this.f16520a.w();
            }
        });
        G(a.Loaded);
        this.f16525e.start();
    }

    public void D() {
        io.bidmachine.core.a.b(this.f16521a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.a0
            @Override // qc.b
            public final Object get() {
                return this.f16518a.x();
            }
        });
        this.f16522b.y(this);
        G(a.Shown);
        this.f16525e.stop();
    }

    final void E() {
        io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.ads.networks.gam.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f16600a.z();
            }
        });
    }

    public void F(e0 e0Var) {
        this.f16527g = new WeakReference<>(e0Var);
    }

    void G(a aVar) {
        this.f16526f = aVar;
    }

    public void h() {
        i(s());
    }

    protected abstract void j() throws Throwable;

    public e0 k() {
        WeakReference<e0> weakReference = this.f16527g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public String l() {
        return o().a();
    }

    public AdsFormat m() {
        return this.f16523c;
    }

    public j n() {
        return this.f16522b;
    }

    public t o() {
        return this.f16524d;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (s()) {
            return;
        }
        io.bidmachine.core.a.b(this.f16521a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.w
            @Override // qc.b
            public final Object get() {
                return this.f16595a.y();
            }
        });
        G(a.Expired);
        e0 e0VarK = k();
        if (e0VarK != null) {
            e0VarK.a();
        }
        i(true);
        this.f16522b.v(this.f16523c);
    }

    public float p() {
        return o().d();
    }

    boolean q() {
        return this.f16526f == a.Expired;
    }

    boolean r() {
        return this.f16526f == a.Loaded;
    }

    boolean s() {
        a aVar = this.f16526f;
        return aVar != null && aVar.ordinal() >= a.Shown.ordinal();
    }

    public String toString() {
        return this.f16521a + ", " + o();
    }
}
