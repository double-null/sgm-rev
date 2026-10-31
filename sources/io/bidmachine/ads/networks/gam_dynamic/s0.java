package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.UInt32Value;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.Waterfall;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: WaterfallLoader.java */
/* JADX INFO: loaded from: classes4.dex */
class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f16681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f16682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q6.s f16683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdsFormat f16684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r6.b f16685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f16686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f16687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f16688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q6.u f16689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f16690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Queue<Waterfall.Configuration.AdUnit> f16691k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f16693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f16694n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Queue<Waterfall.Result.AdUnit> f16692l = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final AtomicBoolean f16695o = new AtomicBoolean(false);

    /* JADX INFO: compiled from: WaterfallLoader.java */
    class a implements q6.k {
        a() {
        }

        @Override // q6.k
        public void a(u uVar) {
            s0.this.y(uVar);
            s0.this.A(TrackEventType.AdUnitShown, uVar);
        }

        @Override // q6.k
        public void b(u uVar) {
            s0.this.A(TrackEventType.AdUnitExpired, uVar);
        }

        @Override // q6.k
        public void c(u uVar, boolean z10) {
            if (z10) {
                s0.this.y(uVar);
            } else {
                s0.this.f16686f.A(uVar);
            }
        }

        @Override // q6.k
        public void d(u uVar) {
            s0.this.A(TrackEventType.AdUnitPaidEvent, uVar);
        }
    }

    /* JADX INFO: compiled from: WaterfallLoader.java */
    class b implements q6.q {
        b() {
        }

        @Override // q6.q
        public void a(u uVar, q6.l lVar) {
            s0.this.A(TrackEventType.AdUnitLoadFinish, uVar);
            s0.this.A(TrackEventType.AdUnitWin, uVar);
            s0.this.j(uVar.m(), Waterfall.Result.AdUnit.Status.STATUS_SUCCESS, lVar, null);
            u uVarY = s0.this.f16686f.y(uVar, s0.this.f16693m);
            if (uVarY != null) {
                s0.this.A(TrackEventType.AdUnitCheapestDequeued, uVarY);
                uVarY.i();
            }
            s0.this.f16694n.onAdLoaded();
            s0.this.w(null);
        }

        @Override // q6.q
        public void b(u uVar, oc.a aVar) {
            Waterfall.Configuration.AdUnit adUnitM = uVar.m();
            s0.this.B(TrackEventType.AdUnitLoadFinish, adUnitM, uVar, aVar);
            s0.this.A(TrackEventType.AdUnitLoss, uVar);
            s0.this.j(adUnitM, Waterfall.Result.AdUnit.Status.STATUS_ERROR, null, aVar);
            uVar.i();
            s0 s0Var = s0.this;
            s0Var.w(Long.valueOf(s0Var.m(adUnitM)));
        }
    }

    /* JADX INFO: compiled from: WaterfallLoader.java */
    public interface c {
        void a(Queue<Waterfall.Result.AdUnit> queue);

        void onAdLoaded();
    }

    public s0(Context context, q6.s sVar, AdsFormat adsFormat, r6.b bVar, o oVar, g gVar, j jVar, q6.u uVar, String str, List<Waterfall.Configuration.AdUnit> list, int i10, c cVar) {
        this.f16681a = new oc.p(sVar.getNetworkName() + "WaterfallLoader");
        this.f16682b = context.getApplicationContext();
        this.f16683c = sVar;
        this.f16684d = adsFormat;
        this.f16685e = bVar;
        this.f16688h = oVar;
        this.f16686f = gVar;
        this.f16687g = jVar;
        this.f16689i = uVar;
        this.f16690j = str;
        this.f16691k = new ConcurrentLinkedQueue(list);
        this.f16693m = i10;
        this.f16694n = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String o() {
        return String.format("(%s) Polling started (waterfallId - %s, ad unit count - %s)", this.f16684d, this.f16690j, Integer.valueOf(this.f16691k.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String q(long j10) {
        return String.format("(%s) Execution ad unit load started after %s ms", this.f16684d, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String r() {
        return String.format("(%s) Stop polling. Waterfall already filled with expensive ads", this.f16684d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String s() {
        return String.format("(%s) Can't create InternalAd", this.f16684d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Waterfall.Configuration.AdUnit adUnit) {
        u uVarG = this.f16686f.g(this.f16684d);
        if (uVarG != null && adUnit.getPrice() <= uVarG.m().getPrice() && this.f16686f.j(this.f16684d) >= this.f16693m) {
            io.bidmachine.core.a.b(this.f16681a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.q0
                @Override // qc.b
                public final Object get() {
                    return this.f16671a.r();
                }
            });
            j(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
            Iterator<Waterfall.Configuration.AdUnit> it = this.f16691k.iterator();
            while (it.hasNext()) {
                j(it.next(), Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
            }
            x();
            return;
        }
        try {
            u uVarE = this.f16685e.e(this.f16683c, this.f16689i, this.f16684d, adUnit, new a());
            if (uVarE == null) {
                io.bidmachine.core.a.b(this.f16681a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.r0
                    @Override // qc.b
                    public final Object get() {
                        return this.f16673a.s();
                    }
                });
                j(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, oc.a.i("Can't create InternalAd"));
                w(null);
            } else {
                if (!TextUtils.isEmpty(this.f16690j)) {
                    uVarE.I("gam_waterfall_id", this.f16690j);
                    uVarE.I("gam_ad_unit_id", adUnit.getAdUnitId());
                }
                uVarE.A(this.f16682b, new b());
                A(TrackEventType.AdUnitLoadStart, uVarE);
            }
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            j(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, oc.a.l("Exception loading InternalAd object", th));
            w(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String u() {
        StringBuilder sb2 = new StringBuilder(String.format("(%s) Polling completed (waterfallId - %s, ad unit count - %s)", this.f16684d, this.f16690j, Integer.valueOf(this.f16692l.size())));
        Iterator<Waterfall.Result.AdUnit> it = this.f16692l.iterator();
        while (it.hasNext()) {
            sb2.append(String.format("\n> %s", q6.a.b(it.next())));
        }
        return sb2.toString();
    }

    void A(TrackEventType trackEventType, u uVar) {
        B(trackEventType, uVar.m(), uVar, null);
    }

    void B(TrackEventType trackEventType, Waterfall.Configuration.AdUnit adUnit, u uVar, oc.a aVar) {
        ub.a aVarK = new ub.a().k(this.f16683c.a());
        if (adUnit != null) {
            aVarK.l(Double.valueOf(adUnit.getPrice()));
        }
        if (uVar != null) {
            aVarK.i(uVar.getCustomParamsMap());
        }
        if (!TextUtils.isEmpty(this.f16690j)) {
            aVarK.h("gam_waterfall_id", this.f16690j);
        }
        this.f16687g.a(trackEventType, this.f16684d, aVarK, aVar);
    }

    void j(Waterfall.Configuration.AdUnit adUnit, Waterfall.Result.AdUnit.Status status, q6.l lVar, oc.a aVar) {
        this.f16692l.add(l(adUnit, status, lVar, aVar));
    }

    long k(Waterfall.Configuration.AdUnit adUnit, Long l10) {
        long jN = n(adUnit);
        return l10 != null ? jN + l10.longValue() : jN;
    }

    Waterfall.Result.AdUnit l(Waterfall.Configuration.AdUnit adUnit, Waterfall.Result.AdUnit.Status status, q6.l lVar, oc.a aVar) {
        Waterfall.Result.AdUnit.Builder price = Waterfall.Result.AdUnit.newBuilder().setStatus(status).setPrice(adUnit.getPrice());
        if (adUnit.getAdUnitId() != null) {
            price.setAdUnitId(adUnit.getAdUnitId());
        }
        StringValue serverParams = adUnit.getServerParams();
        if (serverParams != null) {
            price.setServerParams(serverParams);
        }
        if (lVar != null) {
            Waterfall.Result.EstimatedPrice estimatedPriceB = lVar.b();
            if (estimatedPriceB != null) {
                price.setEstimatedPrice(estimatedPriceB);
            }
            String strA = lVar.a();
            if (!TextUtils.isEmpty(strA)) {
                price.setAdResponse(StringValue.newBuilder().setValue(strA).build());
            }
        }
        if (aVar != null) {
            price.setError(Waterfall.Result.AdUnit.Error.newBuilder().setCode(aVar.e()).setDescription(aVar.g()));
        }
        return price.build();
    }

    long m(Waterfall.Configuration.AdUnit adUnit) {
        UInt32Value sleepTimeAfter = adUnit.hasSleepTimeAfter() ? adUnit.getSleepTimeAfter() : null;
        if (sleepTimeAfter != null) {
            return sleepTimeAfter.getValue();
        }
        return 0L;
    }

    long n(Waterfall.Configuration.AdUnit adUnit) {
        UInt32Value sleepTimeBefore = adUnit.hasSleepTimeBefore() ? adUnit.getSleepTimeBefore() : null;
        if (sleepTimeBefore != null) {
            return sleepTimeBefore.getValue();
        }
        return 0L;
    }

    @Override // java.lang.Runnable
    public void run() {
        v();
    }

    void v() {
        if (this.f16695o.compareAndSet(false, true)) {
            io.bidmachine.core.a.b(this.f16681a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.m0
                @Override // qc.b
                public final Object get() {
                    return this.f16662a.o();
                }
            });
            z(TrackEventType.WaterfallLoadStart);
            w(null);
        }
    }

    void w(Long l10) {
        if (this.f16691k.isEmpty()) {
            x();
            return;
        }
        final Waterfall.Configuration.AdUnit adUnitPoll = this.f16691k.poll();
        if (adUnitPoll == null) {
            w(l10);
            return;
        }
        final long jK = k(adUnitPoll, l10);
        io.bidmachine.core.a.b(this.f16681a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.n0
            @Override // qc.b
            public final Object get() {
                return this.f16664a.q(jK);
            }
        });
        if (this.f16689i.a(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16666a.t(adUnitPoll);
            }
        }, jK)) {
            return;
        }
        x();
    }

    void x() {
        io.bidmachine.core.a.b(this.f16681a, new qc.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.p0
            @Override // qc.b
            public final Object get() {
                return this.f16669a.u();
            }
        });
        z(TrackEventType.WaterfallLoadFinish);
        this.f16695o.set(false);
        this.f16694n.a(this.f16692l);
    }

    void y(u uVar) {
        if (this.f16686f.t(uVar)) {
            this.f16688h.b(uVar.n(), true);
        }
    }

    void z(TrackEventType trackEventType) {
        B(trackEventType, null, null, null);
    }
}
