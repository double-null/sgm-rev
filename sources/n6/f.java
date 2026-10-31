package n6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.j;
import io.bidmachine.ads.networks.gam.j0;
import io.bidmachine.ads.networks.gam.m0;
import io.bidmachine.ads.networks.gam.o0;
import io.bidmachine.ads.networks.gam.t;

/* JADX INFO: loaded from: classes4.dex */
class f extends m0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RewardedAd f22749h;

    private static final class b extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f22750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f22751b;

        public b(f fVar, o0 o0Var) {
            this.f22750a = fVar;
            this.f22751b = o0Var;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.f22751b.a(this.f22750a, new oc.a(oc.a.f23345q, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            this.f22750a.f22749h = rewardedAd;
            this.f22750a.C();
            this.f22751b.d(this.f22750a);
        }
    }

    f(j jVar, AdsFormat adsFormat, t tVar) {
        super(jVar, adsFormat, tVar);
    }

    @Override // io.bidmachine.ads.networks.gam.c0
    protected void B(Context context, o0 o0Var) {
        RewardedAd.load(context, l(), n6.b.a(n(), o()), (RewardedAdLoadCallback) new b(this, o0Var));
    }

    @Override // io.bidmachine.ads.networks.gam.i0
    protected void K(Activity activity, j0 j0Var) {
        RewardedAd rewardedAd = this.f22749h;
        if (rewardedAd == null) {
            j0Var.b(oc.a.i("InternalGAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new n6.c(j0Var));
            this.f22749h.show(activity, new c());
        }
    }

    @Override // io.bidmachine.ads.networks.gam.c0
    protected void j() {
        RewardedAd rewardedAd = this.f22749h;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f22749h = null;
        }
    }

    private static final class c implements OnUserEarnedRewardListener {
        private c() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
        }
    }
}
