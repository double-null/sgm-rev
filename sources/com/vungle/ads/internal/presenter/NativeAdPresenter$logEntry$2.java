package com.vungle.ads.internal.presenter;

import com.vungle.ads.internal.util.LogEntry;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: NativeAdPresenter.kt */
/* JADX INFO: loaded from: classes4.dex */
final class NativeAdPresenter$logEntry$2 extends u implements id.a<LogEntry> {
    final /* synthetic */ NativeAdPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdPresenter$logEntry$2(NativeAdPresenter nativeAdPresenter) {
        super(0);
        this.this$0 = nativeAdPresenter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final LogEntry invoke() {
        return this.this$0.advertisement.getLogEntry$vungle_ads_release();
    }
}
