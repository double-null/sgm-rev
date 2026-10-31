package t6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;
import q6.q;
import q6.r;
import q6.s;
import q6.u;

/* JADX INFO: loaded from: classes4.dex */
class k extends r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RewardedAd f25549k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f25550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f25551b;

        public b(k kVar, q qVar) {
            this.f25550a = kVar;
            this.f25551b = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(LoadAdError loadAdError) {
            this.f25551b.b(this.f25550a, o.d(oc.a.f23345q, loadAdError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(RewardedAd rewardedAd) {
            q6.l lVarG = o.g(rewardedAd);
            this.f25550a.C(lVarG);
            this.f25551b.a(this.f25550a, lVarG);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f25550a.E(new Runnable() { // from class: t6.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25555a.c(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final RewardedAd rewardedAd) {
            rewardedAd.setOnPaidEventListener(new c());
            this.f25550a.f25549k = rewardedAd;
            this.f25550a.E(new Runnable() { // from class: t6.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25553a.d(rewardedAd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f25552a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(AdValue adValue) {
            this.f25552a.F(o.b(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f25552a.E(new Runnable() { // from class: t6.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25557a.b(adValue);
                }
            });
        }

        private c(k kVar) {
            this.f25552a = kVar;
        }
    }

    k(s sVar, u uVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, q6.k kVar) {
        super(sVar, uVar, adsFormat, adUnit, kVar);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    protected void B(Context context, q qVar) {
        RewardedAd.load(context, getAdUnitId(), o.a(m()), (RewardedAdLoadCallback) new b(this, qVar));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.y
    protected void N(Activity activity, q6.o oVar) {
        RewardedAd rewardedAd = this.f25549k;
        if (rewardedAd == null) {
            oVar.b(oc.a.i("Internal GAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new f(oVar));
            this.f25549k.show(activity, new d());
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    protected void k() {
        RewardedAd rewardedAd = this.f25549k;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f25549k.setOnPaidEventListener(null);
            this.f25549k = null;
        }
    }

    private static final class d implements OnUserEarnedRewardListener {
        private d() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
        }
    }
}
