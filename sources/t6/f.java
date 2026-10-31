package t6;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes4.dex */
class f extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q6.o f25538a;

    f(q6.o oVar) {
        this.f25538a = oVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f25538a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f25538a.e();
        this.f25538a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        this.f25538a.b(o.d(oc.a.f23346r, adError));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f25538a.j();
    }
}
