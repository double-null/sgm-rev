package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AdEventListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public class AdEventListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private Placement placement;
    private final AdPlayCallback playAdCallback;

    /* JADX INFO: compiled from: AdEventListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public AdEventListener(AdPlayCallback adPlayCallback, Placement placement) {
        this.playAdCallback = adPlayCallback;
        this.placement = placement;
    }

    public final void onError(VungleError error, String str) {
        t.f(error, "error");
        AdPlayCallback adPlayCallback = this.playAdCallback;
        if (adPlayCallback != null) {
            adPlayCallback.onFailure(error);
            Logger.Companion.e(TAG, "AdEventListener#PlayAdCallback " + str, error);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(String s10, String str, String str2) {
        AdPlayCallback adPlayCallback;
        AdPlayCallback adPlayCallback2;
        AdPlayCallback adPlayCallback3;
        AdPlayCallback adPlayCallback4;
        t.f(s10, "s");
        Logger.Companion.d(TAG, "s=" + s10 + KBBdKxoAiHo.BtOjUADKAyjXxo + str + ", id=" + str2);
        switch (s10.hashCode()) {
            case -1912374177:
                if (s10.equals(MRAIDPresenter.SUCCESSFUL_VIEW)) {
                    Placement placement = this.placement;
                    boolean z10 = false;
                    if (placement != null && placement.isRewardedVideo()) {
                        z10 = true;
                    }
                    if (z10 && !this.adRewarded) {
                        this.adRewarded = true;
                        AdPlayCallback adPlayCallback5 = this.playAdCallback;
                        if (adPlayCallback5 != null) {
                            adPlayCallback5.onAdRewarded(str2);
                        }
                        break;
                    }
                }
                break;
            case -1627831289:
                if (s10.equals("adViewed") && (adPlayCallback = this.playAdCallback) != null) {
                    adPlayCallback.onAdImpression(str2);
                }
                break;
            case 100571:
                if (s10.equals("end") && (adPlayCallback2 = this.playAdCallback) != null) {
                    adPlayCallback2.onAdEnd(str2);
                }
                break;
            case 3417674:
                if (s10.equals(MRAIDPresenter.OPEN)) {
                    if (t.a(str, "adClick")) {
                        AdPlayCallback adPlayCallback6 = this.playAdCallback;
                        if (adPlayCallback6 != null) {
                            adPlayCallback6.onAdClick(str2);
                        }
                        break;
                    } else if (t.a(str, "adLeftApplication") && (adPlayCallback3 = this.playAdCallback) != null) {
                        adPlayCallback3.onAdLeftApplication(str2);
                        break;
                    }
                }
                break;
            case 109757538:
                if (s10.equals("start") && (adPlayCallback4 = this.playAdCallback) != null) {
                    adPlayCallback4.onAdStart(str2);
                }
                break;
        }
    }
}
