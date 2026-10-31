package com.vungle.ads.internal;

import com.vungle.ads.SdkNotInitialized;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: VungleInitializer.kt */
/* JADX INFO: loaded from: classes4.dex */
final class VungleInitializer$init$1$1 extends u implements id.a<g0> {
    final /* synthetic */ VungleInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VungleInitializer$init$1$1(VungleInitializer vungleInitializer) {
        super(0);
        this.this$0 = vungleInitializer;
    }

    @Override // id.a
    public /* bridge */ /* synthetic */ g0 invoke() {
        invoke2();
        return g0.f27756a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.onInitError(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
    }
}
