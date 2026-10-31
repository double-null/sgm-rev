package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.protobuf.Waterfall;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: GAMNetworkImpl.java */
/* JADX INFO: loaded from: classes4.dex */
class s implements o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, g> f16674f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f16675g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f16676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f16677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r6.b f16678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final g f16679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<AdsFormat, l0> f16680e;

    s(Context context, q6.s sVar, Waterfall.Context context2, r6.b bVar) {
        this(context, sVar, context2, bVar, o(sVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load banner (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load interstitial (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load rewarded (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    private static g o(String str) {
        Map<String, g> map = f16674f;
        g gVar = map.get(str);
        if (gVar != null) {
            return gVar;
        }
        synchronized (f16675g) {
            g gVar2 = map.get(str);
            if (gVar2 != null) {
                return gVar2;
            }
            g gVar3 = new g(str);
            map.put(str, gVar3);
            return gVar3;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public void a() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            b(adsFormat, false);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public boolean b(AdsFormat adsFormat, boolean z10) {
        l0 l0Var = this.f16680e.get(adsFormat);
        if (l0Var == null) {
            return false;
        }
        l0Var.q(z10);
        return true;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public void c(final NetworkAdUnit networkAdUnit, z zVar) {
        u uVarK = this.f16679d.k(networkAdUnit);
        if (uVarK == null) {
            io.bidmachine.core.a.b(this.f16676a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.q
                @Override // qc.b
                public final Object get() {
                    return s.m(networkAdUnit);
                }
            });
            p(zVar, null, oc.a.i("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(uVarK instanceof q6.p)) {
            p(zVar, uVarK, oc.a.i("InternalAd object has an incompatible ad type"));
        } else {
            uVarK.H(zVar);
            zVar.d((q6.p) uVarK);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public void d(NetworkAdUnit networkAdUnit) {
        this.f16679d.z(networkAdUnit);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public void e(final NetworkAdUnit networkAdUnit, a0 a0Var) {
        u uVarK = this.f16679d.k(networkAdUnit);
        if (uVarK == null) {
            io.bidmachine.core.a.b(this.f16676a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.r
                @Override // qc.b
                public final Object get() {
                    return s.n(networkAdUnit);
                }
            });
            p(a0Var, null, oc.a.i("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(uVarK instanceof q6.r)) {
            p(a0Var, uVarK, oc.a.i("InternalAd object has an incompatible ad type"));
        } else {
            uVarK.H(a0Var);
            a0Var.d((q6.r) uVarK);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public q6.j f(NetworkAdUnit networkAdUnit, AdsFormat adsFormat) {
        AdsFormat parent;
        q6.j jVarV = this.f16679d.v(networkAdUnit, adsFormat);
        return (jVarV != null || (parent = adsFormat.getParent()) == null) ? jVarV : this.f16679d.v(networkAdUnit, parent);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public void g(final NetworkAdUnit networkAdUnit, x xVar) {
        u uVarK = this.f16679d.k(networkAdUnit);
        if (uVarK == null) {
            io.bidmachine.core.a.b(this.f16676a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.p
                @Override // qc.b
                public final Object get() {
                    return s.l(networkAdUnit);
                }
            });
            p(xVar, null, oc.a.i("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(uVarK instanceof w)) {
            p(xVar, uVarK, oc.a.i("InternalAd object has an incompatible ad type"));
        } else {
            uVarK.H(xVar);
            xVar.d((w) uVarK);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public String getVersion() {
        try {
            uc.a version = this.f16678c.getVersion();
            if (version != null) {
                return version.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public void h(Context context) {
        if (this.f16677b.getAndSet(true)) {
            return;
        }
        try {
            this.f16678c.a(context);
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.o
    public boolean isInitialized() {
        return this.f16677b.get();
    }

    void p(v<?> vVar, u uVar, oc.a aVar) {
        if (uVar != null) {
            uVar.i();
        }
        if (aVar == null) {
            aVar = oc.a.f23345q;
        }
        vVar.c(aVar);
    }

    s(Context context, q6.s sVar, Waterfall.Context context2, r6.b bVar, g gVar) {
        s sVar2 = this;
        sVar2.f16676a = new oc.p(sVar.getNetworkName() + "Network");
        sVar2.f16677b = new AtomicBoolean(false);
        sVar2.f16678c = bVar;
        sVar2.f16679d = gVar;
        sVar2.f16680e = new EnumMap(AdsFormat.class);
        k kVar = new k(context2.getEventConfig());
        b0 b0Var = new b0();
        for (Waterfall.Configuration configuration : context2.getConfigurationsList()) {
            AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(configuration.getFormat());
            if (adsFormatByRemoteName != null) {
                sVar2.f16680e.put(adsFormatByRemoteName, new l0(context, sVar, adsFormatByRemoteName, configuration, bVar, this, gVar, kVar, b0Var));
                sVar2 = this;
            }
        }
    }
}
