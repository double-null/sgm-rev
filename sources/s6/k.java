package s6;

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
    private RewardedAd f25295k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f25296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f25297b;

        public b(k kVar, q qVar) {
            this.f25296a = kVar;
            this.f25297b = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(LoadAdError loadAdError) {
            this.f25297b.b(this.f25296a, o.d(oc.a.f23345q, loadAdError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(RewardedAd rewardedAd) {
            q6.l lVarG = o.g(rewardedAd);
            this.f25296a.C(lVarG);
            this.f25297b.a(this.f25296a, lVarG);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.f25296a.E(new Runnable() { // from class: s6.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25299a.c(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final RewardedAd rewardedAd) {
            rewardedAd.setOnPaidEventListener(new c());
            this.f25296a.f25295k = rewardedAd;
            this.f25296a.E(new Runnable() { // from class: s6.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25301a.d(rewardedAd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f25298a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(AdValue adValue) {
            this.f25298a.F(o.b(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.f25298a.E(new Runnable() { // from class: s6.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25303a.b(adValue);
                }
            });
        }

        private c(k kVar) {
            this.f25298a = kVar;
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
        RewardedAd rewardedAd = this.f25295k;
        if (rewardedAd == null) {
            oVar.b(oc.a.i("Internal GAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new f(oVar));
            this.f25295k.show(activity, new d());
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.u
    protected void k() {
        RewardedAd rewardedAd = this.f25295k;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.f25295k.setOnPaidEventListener(null);
            this.f25295k = null;
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
