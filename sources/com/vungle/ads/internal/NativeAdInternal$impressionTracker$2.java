package com.vungle.ads.internal;

import android.content.Context;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: NativeAdInternal.kt */
/* JADX INFO: loaded from: classes4.dex */
final class NativeAdInternal$impressionTracker$2 extends u implements id.a<ImpressionTracker> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdInternal$impressionTracker$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final ImpressionTracker invoke() {
        return new ImpressionTracker(this.$context);
    }
}
