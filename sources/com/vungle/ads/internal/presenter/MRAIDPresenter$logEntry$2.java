package com.vungle.ads.internal.presenter;

import com.vungle.ads.internal.util.LogEntry;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MRAIDPresenter.kt */
/* JADX INFO: loaded from: classes4.dex */
final class MRAIDPresenter$logEntry$2 extends u implements id.a<LogEntry> {
    final /* synthetic */ MRAIDPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRAIDPresenter$logEntry$2(MRAIDPresenter mRAIDPresenter) {
        super(0);
        this.this$0 = mRAIDPresenter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final LogEntry invoke() {
        return this.this$0.advertisement.getLogEntry$vungle_ads_release();
    }
}
