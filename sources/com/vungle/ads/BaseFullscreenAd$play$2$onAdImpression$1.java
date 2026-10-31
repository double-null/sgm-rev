package com.vungle.ads;

import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: BaseFullscreenAd.kt */
/* JADX INFO: loaded from: classes4.dex */
final class BaseFullscreenAd$play$2$onAdImpression$1 extends u implements id.a<g0> {
    final /* synthetic */ BaseFullscreenAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseFullscreenAd$play$2$onAdImpression$1(BaseFullscreenAd baseFullscreenAd) {
        super(0);
        this.this$0 = baseFullscreenAd;
    }

    @Override // id.a
    public /* bridge */ /* synthetic */ g0 invoke() {
        invoke2();
        return g0.f27756a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        BaseAdListener adListener = this.this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(this.this$0);
        }
    }
}
