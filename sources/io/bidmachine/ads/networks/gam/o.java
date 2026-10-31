package io.bidmachine.ads.networks.gam;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: GAMNetwork.java */
/* JADX INFO: loaded from: classes4.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f16574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f16575b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m6.b f16576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f16577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16578e;

    o(Context context, m6.b bVar, String str, Map<AdsFormat, r> map, String str2, long j10, boolean z10) {
        this.f16574a = new oc.p(str + "Network");
        this.f16576c = bVar;
        this.f16577d = new j(context, bVar, str, map, str2, j10);
        this.f16578e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load banner (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load interstitial (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load rewarded (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    private void p(d0<?> d0Var, c0 c0Var, oc.a aVar) {
        if (c0Var != null) {
            try {
                c0Var.h();
            } catch (Throwable unused) {
            }
        }
        if (aVar == null) {
            aVar = oc.a.f23345q;
        }
        d0Var.c(aVar);
    }

    void d() {
        this.f16577d.u();
    }

    void e(AdsFormat adsFormat) {
        AdsFormat parent;
        if (this.f16577d.v(adsFormat) || (parent = adsFormat.getParent()) == null) {
            return;
        }
        this.f16577d.v(parent);
    }

    public String f() {
        try {
            uc.a version = this.f16576c.getVersion();
            if (version != null) {
                return version.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    void g(Context context) {
        if (this.f16575b.getAndSet(true)) {
            return;
        }
        try {
            this.f16576c.a(context);
        } catch (Throwable unused) {
        }
    }

    boolean h() {
        return this.f16575b.get();
    }

    public boolean i() {
        return this.f16578e;
    }

    void m(final NetworkAdUnit networkAdUnit, g0 g0Var) {
        c0 c0VarN = this.f16577d.n(networkAdUnit);
        if (c0VarN == null) {
            io.bidmachine.core.a.b(this.f16574a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.l
                @Override // qc.b
                public final Object get() {
                    return o.j(networkAdUnit);
                }
            });
            p(g0Var, null, oc.a.i("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(c0VarN instanceof f0)) {
            p(g0Var, c0VarN, oc.a.i("InternalGAM object has an incompatible ad type"));
        } else {
            c0VarN.F(g0Var);
            g0Var.d((f0) c0VarN);
        }
    }

    void n(final NetworkAdUnit networkAdUnit, l0 l0Var) {
        c0 c0VarN = this.f16577d.n(networkAdUnit);
        if (c0VarN == null) {
            io.bidmachine.core.a.b(this.f16574a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.n
                @Override // qc.b
                public final Object get() {
                    return o.k(networkAdUnit);
                }
            });
            p(l0Var, null, oc.a.i("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(c0VarN instanceof k0)) {
            p(l0Var, c0VarN, oc.a.i("InternalGAM object has an incompatible ad type"));
        } else {
            c0VarN.F(l0Var);
            l0Var.d((k0) c0VarN);
        }
    }

    void o(final NetworkAdUnit networkAdUnit, n0 n0Var) {
        c0 c0VarN = this.f16577d.n(networkAdUnit);
        if (c0VarN == null) {
            io.bidmachine.core.a.b(this.f16574a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.m
                @Override // qc.b
                public final Object get() {
                    return o.l(networkAdUnit);
                }
            });
            p(n0Var, null, oc.a.i("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(c0VarN instanceof m0)) {
            p(n0Var, c0VarN, oc.a.i("InternalGAM object has an incompatible ad type"));
        } else {
            c0VarN.F(n0Var);
            n0Var.d((m0) c0VarN);
        }
    }

    t q(NetworkAdUnit networkAdUnit, String str) {
        return this.f16577d.B(networkAdUnit, str);
    }

    void r(NetworkAdUnit networkAdUnit) {
        this.f16577d.E(networkAdUnit);
    }
}
