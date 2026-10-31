package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.ui.view.MRAIDAdWidget;

/* JADX INFO: compiled from: AdActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdActivity$onCreate$4$3 implements MRAIDAdWidget.OrientationDelegate {
    final /* synthetic */ AdActivity this$0;

    AdActivity$onCreate$4$3(AdActivity adActivity) {
        this.this$0 = adActivity;
    }

    @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate
    public void setOrientation(int i10) {
        this.this$0.setRequestedOrientation(i10);
    }
}
