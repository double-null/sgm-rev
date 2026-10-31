package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import com.facebook.internal.AnalyticsEvents;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: WaterfallController.java */
/* JADX INFO: loaded from: classes4.dex */
class l0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final dc.d f16635w = new ec.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f16636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f16637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q6.s f16638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AdsFormat f16639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r6.b f16640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f16641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g f16642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f16643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q6.u f16644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final List<Waterfall.Configuration.AdUnit> f16645j = new LinkedList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final AtomicBoolean f16646k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final AtomicBoolean f16647l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final AtomicBoolean f16648m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final AtomicInteger f16649n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    String f16650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    String f16651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f16652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f16653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f16654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f16655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    StringValue f16656u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    s0 f16657v;

    /* JADX INFO: compiled from: WaterfallController.java */
    class a implements io.bidmachine.core.b.InterfaceC0315b, io.bidmachine.core.b.c {
        a() {
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(oc.a aVar) {
            l0.this.s(aVar != null ? aVar.g() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Waterfall.Configuration configuration) {
            if (configuration != null) {
                l0.this.t(configuration);
            } else {
                l0.this.s("Configuration response is null");
            }
        }

        @Override // io.bidmachine.core.b.c
        public void onCanceled() {
            l0.this.s("Request is canceled");
        }
    }

    /* JADX INFO: compiled from: WaterfallController.java */
    class b implements s0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicBoolean f16659a = new AtomicBoolean(false);

        public b() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.s0.c
        public void a(Queue<Waterfall.Result.AdUnit> queue) {
            l0.this.f16647l.set(false);
            if (!this.f16659a.get()) {
                l0.this.f16649n.incrementAndGet();
            }
            l0.this.v(queue);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.s0.c
        public void onAdLoaded() {
            this.f16659a.set(true);
            l0.this.f16649n.set(0);
        }
    }

    public l0(Context context, q6.s sVar, AdsFormat adsFormat, Waterfall.Configuration configuration, r6.b bVar, o oVar, g gVar, j jVar, q6.u uVar) {
        this.f16636a = new oc.p(sVar.getNetworkName() + "WaterfallController");
        this.f16637b = context.getApplicationContext();
        this.f16638c = sVar;
        this.f16639d = adsFormat;
        this.f16640e = bVar;
        this.f16641f = oVar;
        this.f16642g = gVar;
        this.f16644i = uVar;
        this.f16643h = jVar;
        w(configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j(long j10) {
        return String.format("(%s) Execution waterfall load started after - %s ms (failedAttempts - %s, maxRetryDegree - %s, retryBase - %s sec)", this.f16639d, Long.valueOf(j10), Integer.valueOf(this.f16649n.get()), Integer.valueOf(this.f16654s), Integer.valueOf(this.f16653r));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String k() {
        return String.format("(%s) Fail to start loading waterfall", this.f16639d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String l(String str) {
        return String.format("(%s) onWaterfallRequestFail - %s", this.f16639d, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String m() {
        return String.format("(%s) onWaterfallRequestSuccess", this.f16639d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String n() {
        return String.format("(%s) Loading completed", this.f16639d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String o() {
        return String.format("(%s) Request next waterfall", this.f16639d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(Waterfall.Configuration.AdUnit adUnit, Waterfall.Configuration.AdUnit adUnit2) {
        return -Double.compare(adUnit.getPrice(), adUnit2.getPrice());
    }

    long h() {
        return (long) (Math.pow(this.f16653r, Math.min(this.f16649n.get(), this.f16654s)) * 1000.0d);
    }

    void i() {
        this.f16657v = null;
    }

    public void q(boolean z10) {
        if (this.f16646k.compareAndSet(false, true)) {
            this.f16647l.set(true);
            this.f16649n.set(0);
            r();
        } else {
            if (!z10 || this.f16647l.get()) {
                return;
            }
            this.f16648m.set(true);
        }
    }

    void r() {
        this.f16648m.set(false);
        this.f16657v = new s0(this.f16637b, this.f16638c, this.f16639d, this.f16640e, this.f16641f, this.f16642g, this.f16643h, this.f16644i, this.f16650o, this.f16645j, this.f16652q, new b());
        final long jH = h();
        io.bidmachine.core.a.b(this.f16636a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.e0
            @Override // qc.b
            public final Object get() {
                return this.f16615a.j(jH);
            }
        });
        if (this.f16644i.a(this.f16657v, jH)) {
            return;
        }
        io.bidmachine.core.a.b(this.f16636a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.f0
            @Override // qc.b
            public final Object get() {
                return this.f16617a.k();
            }
        });
        u();
    }

    void s(final String str) {
        io.bidmachine.core.a.b(this.f16636a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.k0
            @Override // qc.b
            public final Object get() {
                return this.f16631a.l(str);
            }
        });
        r();
    }

    void t(Waterfall.Configuration configuration) {
        io.bidmachine.core.a.b(this.f16636a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.j0
            @Override // qc.b
            public final Object get() {
                return this.f16630a.m();
            }
        });
        w(configuration);
        if (this.f16648m.get() || !configuration.getShouldBreak()) {
            r();
        } else {
            u();
        }
    }

    void u() {
        io.bidmachine.core.a.b(this.f16636a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.h0
            @Override // qc.b
            public final Object get() {
                return this.f16627a.n();
            }
        });
        i();
        this.f16646k.set(false);
    }

    void v(Queue<Waterfall.Result.AdUnit> queue) {
        io.bidmachine.core.a.b(this.f16636a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.i0
            @Override // qc.b
            public final Object get() {
                return this.f16629a.o();
            }
        });
        if (TextUtils.isEmpty(this.f16651p) || !io.bidmachine.core.h.E(this.f16651p)) {
            s("Request next waterfall failed (refreshUrl is null or empty or incorrect)");
            return;
        }
        Waterfall.Result.Builder builderAddAllAdUnitResults = Waterfall.Result.newBuilder().setFormat(StringValue.newBuilder().setValue(this.f16639d.getRemoteName()).build()).addAllAdUnitResults(queue);
        String str = this.f16650o;
        if (str != null) {
            builderAddAllAdUnitResults.setWaterfallId(str);
        }
        List<Waterfall.Result.CachedAdUnit> listI = this.f16642g.i(this.f16639d);
        if (listI != null && !listI.isEmpty()) {
            builderAddAllAdUnitResults.addAllCachedAdUnits(listI);
        }
        Struct structB = this.f16638c.b(this.f16637b);
        if (structB != null) {
            builderAddAllAdUnitResults.setExt(structB);
        }
        StringValue stringValue = this.f16656u;
        if (stringValue != null) {
            builderAddAllAdUnitResults.setServerParams(stringValue);
        }
        a aVar = new a();
        q6.v vVar = new q6.v(this.f16651p, builderAddAllAdUnitResults.build(), (int) this.f16655t);
        vVar.setCallback(aVar);
        vVar.setCancelCallback(aVar);
        vVar.request(f16635w);
    }

    void w(Waterfall.Configuration configuration) {
        this.f16650o = configuration.getId();
        this.f16645j.clear();
        List<Waterfall.Configuration.AdUnit> adUnitsList = configuration.getAdUnitsList();
        if (adUnitsList != null && !adUnitsList.isEmpty()) {
            this.f16645j.addAll(adUnitsList);
            x(this.f16645j);
        }
        StringValue refreshUrl = configuration.hasRefreshUrl() ? configuration.getRefreshUrl() : null;
        if (refreshUrl != null) {
            String value = refreshUrl.getValue();
            if (!TextUtils.isEmpty(value) && io.bidmachine.core.h.E(value)) {
                this.f16651p = refreshUrl.getValue();
            }
        }
        UInt32Value cacheSize = configuration.hasCacheSize() ? configuration.getCacheSize() : null;
        this.f16652q = cacheSize != null ? cacheSize.getValue() : 1;
        UInt32Value retryBase = configuration.hasRetryBase() ? configuration.getRetryBase() : null;
        this.f16653r = retryBase != null ? retryBase.getValue() : 2;
        UInt32Value maxRetryDegree = configuration.hasMaxRetryDegree() ? configuration.getMaxRetryDegree() : null;
        this.f16654s = maxRetryDegree != null ? maxRetryDegree.getValue() : 5;
        UInt64Value refreshTimeout = configuration.hasRefreshTimeout() ? configuration.getRefreshTimeout() : null;
        this.f16655t = refreshTimeout != null ? refreshTimeout.getValue() : 10000L;
        this.f16656u = configuration.hasServerParams() ? configuration.getServerParams() : null;
    }

    void x(List<Waterfall.Configuration.AdUnit> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.g0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l0.p((Waterfall.Configuration.AdUnit) obj, (Waterfall.Configuration.AdUnit) obj2);
            }
        });
    }
}
