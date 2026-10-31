package io.bidmachine.ads.networks.nast;

import android.text.TextUtils;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.j;
import vb.k;
import vb.l;
import vb.m;
import vb.n;

/* JADX INFO: compiled from: NastNative.java */
/* JADX INFO: loaded from: classes4.dex */
class a extends l {

    /* JADX INFO: compiled from: NastNative.java */
    private static final class b extends ha.l {
        private b() {
        }

        @Override // ha.l, ha.m
        public boolean hasVideo() {
            return (TextUtils.isEmpty(m()) && TextUtils.isEmpty(k())) ? false : true;
        }
    }

    a() {
    }

    @Override // vb.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, m mVar, n nVar, k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        io.bidmachine.ads.networks.nast.b bVar = new io.bidmachine.ads.networks.nast.b(kVar);
        if (bVar.d(nVar, mVar)) {
            mVar.setVisibilitySource(j.BidMachine);
            ha.l lVarV = new b().x(bVar.f16719b).r(bVar.f16720c).p(bVar.f16721d).s(new ImageDataImpl(bVar.f16723f)).t(new ImageDataImpl(bVar.f16724g)).z(bVar.f16725h).y(bVar.f16726i).q(bVar.f16727j).u(false).o(bVar.f16728k).v(bVar.f16729l);
            Float f10 = bVar.f16722e;
            if (f10 != null) {
                lVarV.w(f10.floatValue());
            }
            mVar.e(lVarV);
        }
    }
}
