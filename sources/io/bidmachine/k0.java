package io.bidmachine;

import c2.YDwL.tFQWuE;
import com.explorestack.protobuf.openrtb.Response;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: AdResponseLoader.java */
/* JADX INFO: loaded from: classes4.dex */
class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f17883a = new oc.p("AdResponseLoader");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f17885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f17886d;

    /* JADX INFO: compiled from: AdResponseLoader.java */
    interface a {
        void a(oc.a aVar);

        void b(AdResponse adResponse);

        void onCancel();
    }

    /* JADX INFO: compiled from: AdResponseLoader.java */
    static class b implements io.bidmachine.core.b.InterfaceC0315b<Response, oc.a>, io.bidmachine.core.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdRequestParameters f17889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NetworkAdUnitManager f17890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final WeakReference<a> f17891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f17892f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AtomicBoolean f17893g = new AtomicBoolean(false);

        /* JADX INFO: compiled from: AdResponseLoader.java */
        class a implements x4.a<AdResponse> {
            a() {
            }

            @Override // io.bidmachine.x4.a
            public void a(oc.a aVar) {
                b.this.f17890d.notifyNetworkAuctionResult(null);
                b.this.f17890d.notifyNetworkClearAuction();
                b.this.l(aVar);
            }

            @Override // io.bidmachine.x4.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AdResponse adResponse) {
                boolean zF = b.this.f();
                adResponse.setStatus(zF ? p0.Idle : p0.Busy);
                o0.f().q(adResponse);
                if (zF) {
                    adResponse.release();
                } else {
                    b.this.f17890d.notifyNetworkAuctionResult(adResponse.getWinnerNetworkAdUnit());
                    b.this.m(adResponse);
                }
            }
        }

        public b(String str, String str2, AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, a aVar) {
            this.f17887a = str;
            this.f17888b = str2;
            this.f17889c = adRequestParameters;
            this.f17890d = networkAdUnitManager;
            this.f17891e = new WeakReference<>(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f() {
            return this.f17893g.get() || this.f17892f.get() || this.f17891e.get() == null;
        }

        private a j() {
            if (f()) {
                return null;
            }
            this.f17892f.set(true);
            return this.f17891e.get();
        }

        private void k() {
            a aVarJ = j();
            if (aVarJ != null) {
                aVarJ.onCancel();
            }
            g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(oc.a aVar) {
            a aVarJ = j();
            if (aVarJ != null) {
                aVarJ.a(aVar);
            }
            g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(AdResponse adResponse) {
            a aVarJ = j();
            if (aVarJ != null) {
                aVarJ.b(adResponse);
            } else {
                adResponse.setStatus(p0.Idle);
            }
            g();
        }

        public void g() {
            this.f17893g.set(true);
            this.f17891e.clear();
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void a(oc.a aVar) {
            u4.b().c(this.f17887a);
            this.f17890d.notifyNetworkAuctionResult(null);
            this.f17890d.notifyNetworkClearAuction();
            AdResponse adResponseN = o0.f().n(this.f17889c);
            if (adResponseN != null) {
                m(adResponseN);
            } else {
                l(aVar);
            }
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Response response) {
            u4.b().c(this.f17887a);
            UrlProvider.setAuctionUrlFromSuccessRequest(this.f17888b);
            x4.a(this.f17889c, this.f17890d, response, new a());
        }

        @Override // io.bidmachine.core.b.c
        public void onCanceled() {
            u4.b().c(this.f17887a);
            this.f17890d.notifyNetworkClearAuction();
            k();
        }
    }

    public k0(String str) {
        this.f17884b = str;
    }

    public void b(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, ApiRequest.Builder<?, Response> builder, a aVar) {
        io.bidmachine.core.a.a(this.f17883a, "load");
        b bVar = this.f17886d;
        if (bVar != null) {
            bVar.g();
        }
        this.f17885c = aVar;
        b bVar2 = new b(this.f17884b, builder.getUrl(), adRequestParameters, networkAdUnitManager, aVar);
        this.f17886d = bVar2;
        builder.setCallback(bVar2);
        builder.setCancelCallback(this.f17886d);
        u4.b().a(this.f17884b, builder.request());
    }

    public void a() {
        io.bidmachine.core.a.a(this.f17883a, tFQWuE.ORLOtaWHH);
        this.f17885c = null;
        b bVar = this.f17886d;
        if (bVar != null) {
            bVar.g();
            this.f17886d = null;
        }
    }
}
