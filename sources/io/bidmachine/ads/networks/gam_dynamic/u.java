package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.protobuf.Waterfall;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: InternalAd.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements q6.j, ExpirationHandler.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f16699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q6.u f16700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdsFormat f16701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Waterfall.Configuration.AdUnit f16702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q6.k f16703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExpirationHandler f16704f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakReference<q6.m> f16707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q6.l f16708j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile a f16706h = a.Idle;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f16705g = new ConcurrentHashMap();

    /* JADX INFO: compiled from: InternalAd.java */
    enum a {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    u(q6.s sVar, q6.u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, q6.k kVar) {
        this.f16699a = new oc.p(sVar.getNetworkName() + "Ad");
        this.f16700b = uVar;
        this.f16701c = adsFormat;
        this.f16702d = adUnit;
        this.f16703e = kVar;
        this.f16704f = new ExpirationHandler(adUnit.getExpirationTime(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String s() {
        return String.format("destroy (%s)", q6.a.a(this.f16702d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t() {
        return String.format("load (%s)", q6.a.a(this.f16702d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Context context, q6.q qVar) {
        try {
            J(a.Loading);
            B(context, qVar);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            qVar.b(this, oc.a.l("Exception loading InternalAd object", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String v(Waterfall.Result.EstimatedPrice estimatedPrice) {
        return String.format("onAdLoaded (%s, %s)", q6.a.a(this.f16702d), q6.a.c(estimatedPrice));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String w() {
        return String.format("onAdShown (%s)", q6.a.a(this.f16702d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String x() {
        return String.format("onExpired (%s)", q6.a.a(this.f16702d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String y(Waterfall.Result.EstimatedPrice estimatedPrice) {
        return String.format("onPaidEvent (%s, %s)", q6.a.a(this.f16702d), q6.a.c(estimatedPrice));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        try {
            k();
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    final void A(Context context, final q6.q qVar) {
        io.bidmachine.core.a.b(this.f16699a, new qc.b() { // from class: q6.f
            @Override // qc.b
            public final Object get() {
                return this.f24445a.t();
            }
        });
        final Context applicationContext = context.getApplicationContext();
        io.bidmachine.core.h.S(new Runnable() { // from class: q6.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f24446a.u(applicationContext, qVar);
            }
        });
    }

    protected abstract void B(Context context, q6.q qVar) throws Throwable;

    public void C(q6.l lVar) {
        this.f16708j = lVar;
        final Waterfall.Result.EstimatedPrice estimatedPriceB = lVar != null ? lVar.b() : null;
        io.bidmachine.core.a.b(this.f16699a, new qc.b() { // from class: q6.i
            @Override // qc.b
            public final Object get() {
                return this.f24451a.v(estimatedPriceB);
            }
        });
        String strD = oc.h.d(estimatedPriceB);
        if (strD != null) {
            I("gam_estimated_price", strD);
        }
        J(a.Loaded);
        this.f16704f.start();
    }

    public void D() {
        io.bidmachine.core.a.b(this.f16699a, new qc.b() { // from class: q6.c
            @Override // qc.b
            public final Object get() {
                return this.f24442a.w();
            }
        });
        this.f16703e.a(this);
        J(a.Shown);
        this.f16704f.stop();
    }

    protected void E(Runnable runnable) {
        this.f16700b.execute(runnable);
    }

    public void F(final Waterfall.Result.EstimatedPrice estimatedPrice) {
        io.bidmachine.core.a.b(this.f16699a, new qc.b() { // from class: q6.h
            @Override // qc.b
            public final Object get() {
                return this.f24449a.y(estimatedPrice);
            }
        });
        String strD = oc.h.d(estimatedPrice);
        if (strD != null) {
            I("gam_estimated_price", strD);
        }
        this.f16703e.d(this);
    }

    void G() {
        this.f16704f.stop();
        io.bidmachine.core.h.S(new Runnable() { // from class: q6.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f24444a.z();
            }
        });
    }

    public void H(q6.m mVar) {
        this.f16707i = new WeakReference<>(mVar);
    }

    public void I(String str, Object obj) {
        this.f16705g.put(str, obj);
    }

    void J(a aVar) {
        this.f16706h = aVar;
    }

    @Override // q6.j
    public String getAdUnitId() {
        return m().getAdUnitId();
    }

    @Override // q6.j
    public Map<String, Object> getCustomParamsMap() {
        return this.f16705g;
    }

    @Override // q6.j
    public double getPrice() {
        return m().getPrice();
    }

    public void i() {
        j(r());
    }

    void j(boolean z10) {
        try {
            io.bidmachine.core.a.b(this.f16699a, new qc.b() { // from class: q6.d
                @Override // qc.b
                public final Object get() {
                    return this.f24443a.s();
                }
            });
            WeakReference<q6.m> weakReference = this.f16707i;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f16707i = null;
            if (z10) {
                G();
            }
            this.f16703e.c(this, z10);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    protected abstract void k() throws Throwable;

    public q6.m l() {
        WeakReference<q6.m> weakReference = this.f16707i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public Waterfall.Configuration.AdUnit m() {
        return this.f16702d;
    }

    public AdsFormat n() {
        return this.f16701c;
    }

    public q6.l o() {
        return this.f16708j;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (r()) {
            return;
        }
        io.bidmachine.core.a.b(this.f16699a, new qc.b() { // from class: q6.b
            @Override // qc.b
            public final Object get() {
                return this.f24441a.x();
            }
        });
        this.f16703e.b(this);
        J(a.Expired);
        q6.m mVarL = l();
        if (mVarL != null) {
            mVarL.a();
        }
        j(true);
    }

    boolean p() {
        return this.f16706h == a.Expired;
    }

    boolean q() {
        return this.f16706h == a.Loaded;
    }

    boolean r() {
        a aVar = this.f16706h;
        return aVar != null && aVar.ordinal() >= a.Shown.ordinal();
    }

    public String toString() {
        return this.f16699a + ", " + q6.a.a(this.f16702d);
    }
}
