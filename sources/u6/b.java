package u6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.w;
import io.bidmachine.protobuf.Waterfall;
import q6.q;
import q6.s;
import q6.u;

/* JADX INFO: loaded from: classes4.dex */
class b extends w {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AdSize f25907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdManagerAdView f25908l;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u6.b$b, reason: collision with other inner class name */
    static final class C0438b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f25909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f25910b;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            q6.l lVarE = o.e(this.f25909a.f25908l);
            this.f25909a.C(lVarE);
            this.f25910b.a(this.f25909a, lVarE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(LoadAdError loadAdError) {
            this.f25910b.b(this.f25909a, o.d(oc.a.f23345q, loadAdError));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            q6.m mVarL = this.f25909a.l();
            if (mVarL != null) {
                mVarL.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f25909a.E(new Runnable() { // from class: u6.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25912a.d(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            q6.m mVarL = this.f25909a.l();
            if (mVarL != null) {
                mVarL.j();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f25909a.E(new Runnable() { // from class: u6.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25914a.c();
                }
            });
        }

        private C0438b(b bVar, q qVar) {
            this.f25909a = bVar;
            this.f25910b = qVar;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f25911a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(AdValue adValue) {
            this.f25911a.F(o.b(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f25911a.E(new Runnable() { // from class: u6.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25915a.b(adValue);
                }
            });
        }

        private c(b bVar) {
            this.f25911a = bVar;
        }
    }

    b(s sVar, u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, q6.k kVar, AdSize adSize) {
        super(sVar, uVar, adsFormat, adUnit, kVar);
        this.f25907k = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    public void B(Context context, q qVar) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f25908l = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f25908l.setAdUnitId(getAdUnitId());
        this.f25908l.setAdListener(new C0438b(qVar));
        this.f25908l.setOnPaidEventListener(new c());
        this.f25908l.setAdSize(this.f25907k);
        this.f25908l.loadAd(o.a(m()));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.w
    protected View K() {
        return this.f25908l;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    protected void k() {
        AdManagerAdView adManagerAdView = this.f25908l;
        if (adManagerAdView != null) {
            adManagerAdView.setOnPaidEventListener(null);
            this.f25908l.destroy();
            this.f25908l = null;
        }
    }
}
