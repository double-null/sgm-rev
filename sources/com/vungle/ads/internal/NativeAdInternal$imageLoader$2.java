package com.vungle.ads.internal;

import com.vungle.ads.internal.util.ImageLoader;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: NativeAdInternal.kt */
/* JADX INFO: loaded from: classes4.dex */
final class NativeAdInternal$imageLoader$2 extends u implements id.a<ImageLoader> {
    final /* synthetic */ NativeAdInternal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdInternal$imageLoader$2(NativeAdInternal nativeAdInternal) {
        super(0);
        this.this$0 = nativeAdInternal;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final ImageLoader invoke() {
        ImageLoader companion = ImageLoader.Companion.getInstance();
        companion.init(this.this$0.getExecutors().getIoExecutor());
        return companion;
    }
}
