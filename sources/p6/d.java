package p6;

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
    private final AdSize f23480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AdManagerAdView f23481i;

    private static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f23482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f23483b;

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            e0 e0VarK = this.f23482a.k();
            if (e0VarK != null) {
                e0VarK.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.f23483b.a(this.f23482a, new oc.a(oc.a.f23345q, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            e0 e0VarK = this.f23482a.k();
            if (e0VarK != null) {
                e0VarK.j();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f23482a.C();
            this.f23483b.d(this.f23482a);
        }

        private b(c0 c0Var, o0 o0Var) {
            this.f23482a = c0Var;
            this.f23483b = o0Var;
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
        this.f23480h = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam.c0
    public void B(Context context, o0 o0Var) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f23481i = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f23481i.setAdUnitId(l());
        this.f23481i.setAdListener(new b(this, o0Var));
        this.f23481i.setAdSize(this.f23480h);
        this.f23481i.loadAd(p6.b.a(n(), o()));
    }

    @Override // io.bidmachine.ads.networks.gam.f0
    protected View H() {
        return this.f23481i;
    }

    @Override // io.bidmachine.ads.networks.gam.c0
    protected void j() {
        AdManagerAdView adManagerAdView = this.f23481i;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.f23481i = null;
        }
    }
}
