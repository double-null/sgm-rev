package t6;

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
    private final AdSize f25528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdManagerAdView f25529l;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t6.b$b, reason: collision with other inner class name */
    static final class C0422b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f25530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f25531b;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            q6.l lVarE = o.e(this.f25530a.f25529l);
            this.f25530a.C(lVarE);
            this.f25531b.a(this.f25530a, lVarE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(LoadAdError loadAdError) {
            this.f25531b.b(this.f25530a, o.d(oc.a.f23345q, loadAdError));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            q6.m mVarL = this.f25530a.l();
            if (mVarL != null) {
                mVarL.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f25530a.E(new Runnable() { // from class: t6.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25533a.d(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            q6.m mVarL = this.f25530a.l();
            if (mVarL != null) {
                mVarL.j();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f25530a.E(new Runnable() { // from class: t6.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25535a.c();
                }
            });
        }

        private C0422b(b bVar, q qVar) {
            this.f25530a = bVar;
            this.f25531b = qVar;
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
        private final b f25532a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(AdValue adValue) {
            this.f25532a.F(o.b(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f25532a.E(new Runnable() { // from class: t6.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25536a.b(adValue);
                }
            });
        }

        private c(b bVar) {
            this.f25532a = bVar;
        }
    }

    b(s sVar, u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, q6.k kVar, AdSize adSize) {
        super(sVar, uVar, adsFormat, adUnit, kVar);
        this.f25528k = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    public void B(Context context, q qVar) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f25529l = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f25529l.setAdUnitId(getAdUnitId());
        this.f25529l.setAdListener(new C0422b(qVar));
        this.f25529l.setOnPaidEventListener(new c());
        this.f25529l.setAdSize(this.f25528k);
        this.f25529l.loadAd(o.a(m()));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.w
    protected View K() {
        return this.f25529l;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    protected void k() {
        AdManagerAdView adManagerAdView = this.f25529l;
        if (adManagerAdView != null) {
            adManagerAdView.setOnPaidEventListener(null);
            this.f25529l.destroy();
            this.f25529l = null;
        }
    }
}
