package n6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.c0;
import io.bidmachine.ads.networks.gam.e0;
import io.bidmachine.ads.networks.gam.f0;
import io.bidmachine.ads.networks.gam.j;
import io.bidmachine.ads.networks.gam.o0;
import io.bidmachine.ads.networks.gam.t;

/* JADX INFO: loaded from: classes4.dex */
class d extends f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AdSize f22742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AdManagerAdView f22743i;

    private static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f22744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f22745b;

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            e0 e0VarK = this.f22744a.k();
            if (e0VarK != null) {
                e0VarK.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.f22745b.a(this.f22744a, new oc.a(oc.a.f23345q, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            e0 e0VarK = this.f22744a.k();
            if (e0VarK != null) {
                e0VarK.j();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f22744a.C();
            this.f22745b.d(this.f22744a);
        }

        private b(c0 c0Var, o0 o0Var) {
            this.f22744a = c0Var;
            this.f22745b = o0Var;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }
    }

    d(j jVar, AdsFormat adsFormat, t tVar, AdSize adSize) {
        super(jVar, adsFormat, tVar);
        this.f22742h = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam.c0
    public void B(Context context, o0 o0Var) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f22743i = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f22743i.setAdUnitId(l());
        this.f22743i.setAdListener(new b(this, o0Var));
        this.f22743i.setAdSize(this.f22742h);
        this.f22743i.loadAd(n6.b.a(n(), o()));
    }

    @Override // io.bidmachine.ads.networks.gam.f0
    protected View H() {
        return this.f22743i;
    }

    @Override // io.bidmachine.ads.networks.gam.c0
    protected void j() {
        AdManagerAdView adManagerAdView = this.f22743i;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.f22743i = null;
        }
    }
}
