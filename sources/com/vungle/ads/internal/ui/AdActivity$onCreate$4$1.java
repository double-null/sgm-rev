package com.vungle.ads.internal.ui;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import wc.k;

/* JADX INFO: compiled from: AdActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdActivity$onCreate$4$1 implements MRAIDAdWidget.CloseDelegate {
    final /* synthetic */ k<SignalManager> $signalManager$delegate;
    final /* synthetic */ AdActivity this$0;

    AdActivity$onCreate$4$1(AdActivity adActivity, k<SignalManager> kVar) {
        this.this$0 = adActivity;
        this.$signalManager$delegate = kVar;
    }

    @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
    public void close() {
        MRAIDPresenter mraidPresenter$vungle_ads_release = this.this$0.getMraidPresenter$vungle_ads_release();
        Long viewStatus = mraidPresenter$vungle_ads_release != null ? mraidPresenter$vungle_ads_release.getViewStatus() : null;
        if (viewStatus != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION, viewStatus.longValue(), this.this$0.logEntry, null, 8, null);
        }
        UnclosedAd unclosedAd = this.this$0.unclosedAd;
        if (unclosedAd != null) {
            AdActivity.m291onCreate$lambda1(this.$signalManager$delegate).removeUnclosedAd(unclosedAd);
        }
        this.this$0.finish();
    }
}
