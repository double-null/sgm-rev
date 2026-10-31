package o6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.j;
import io.bidmachine.ads.networks.gam.j0;
import io.bidmachine.ads.networks.gam.k0;
import io.bidmachine.ads.networks.gam.o0;
import io.bidmachine.ads.networks.gam.t;

/* JADX INFO: loaded from: classes4.dex */
class e extends k0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AdManagerInterstitialAd f23112h;

    private static final class a extends AdManagerInterstitialAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f23113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f23114b;

        public a(e eVar, o0 o0Var) {
            this.f23113a = eVar;
            this.f23114b = o0Var;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.f23114b.a(this.f23113a, new oc.a(oc.a.f23345q, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
            this.f23113a.f23112h = adManagerInterstitialAd;
            this.f23113a.C();
            this.f23114b.d(this.f23113a);
        }
    }

    e(j jVar, AdsFormat adsFormat, t tVar) {
        super(jVar, adsFormat, tVar);
    }

    @Override // io.bidmachine.ads.networks.gam.c0
    protected void B(Context context, o0 o0Var) {
        AdManagerInterstitialAd.load(context, l(), b.a(n(), o()), new a(this, o0Var));
    }

    @Override // io.bidmachine.ads.networks.gam.i0
    protected void K(Activity activity, j0 j0Var) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f23112h;
        if (adManagerInterstitialAd == null) {
            j0Var.b(oc.a.i("InternalGAM interstitial object is null or not loaded"));
        } else {
            adManagerInterstitialAd.setFullScreenContentCallback(new c(j0Var));
            this.f23112h.show(activity);
        }
    }

    @Override // io.bidmachine.ads.networks.gam.c0
    protected void j() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.f23112h;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.f23112h = null;
        }
    }
}
