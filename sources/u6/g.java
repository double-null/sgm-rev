package u6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;
import q6.p;
import q6.q;
import q6.s;
import q6.u;

/* JADX INFO: loaded from: classes4.dex */
class g extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AdManagerInterstitialAd f25918k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends AdManagerInterstitialAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f25919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f25920b;

        public b(g gVar, q qVar) {
            this.f25919a = gVar;
            this.f25920b = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(LoadAdError loadAdError) {
            this.f25920b.b(this.f25919a, o.d(oc.a.f23345q, loadAdError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(AdManagerInterstitialAd adManagerInterstitialAd) {
            q6.l lVarF = o.f(adManagerInterstitialAd);
            this.f25919a.C(lVarF);
            this.f25920b.a(this.f25919a, lVarF);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f25919a.E(new Runnable() { // from class: u6.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25924a.c(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final AdManagerInterstitialAd adManagerInterstitialAd) {
            adManagerInterstitialAd.setOnPaidEventListener(new c());
            this.f25919a.f25918k = adManagerInterstitialAd;
            this.f25919a.E(new Runnable() { // from class: u6.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25922a.d(adManagerInterstitialAd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f25921a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(AdValue adValue) {
            this.f25921a.F(o.b(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f25921a.E(new Runnable() { // from class: u6.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25926a.b(adValue);
                }
            });
        }

        private c(g gVar) {
            this.f25921a = gVar;
        }
    }

    g(s sVar, u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, q6.k kVar) {
        super(sVar, uVar, adsFormat, adUnit, kVar);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    protected void B(Context context, q qVar) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), o.a(m()), new b(this, qVar));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.y
    protected void N(Activity activity, q6.o oVar) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f25918k;
        if (adManagerInterstitialAd == null) {
            oVar.b(oc.a.i("Internal GAM interstitial object is null or not loaded"));
        } else {
            adManagerInterstitialAd.setFullScreenContentCallback(new f(oVar));
            this.f25918k.show(activity);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    protected void k() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f25918k;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f25918k.setOnPaidEventListener(null);
            this.f25918k = null;
        }
    }
}
