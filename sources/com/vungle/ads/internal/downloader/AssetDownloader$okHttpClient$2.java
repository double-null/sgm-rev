package com.vungle.ads.internal.downloader;

import kotlin.jvm.internal.u;
import me.x;

/* JADX INFO: compiled from: AssetDownloader.kt */
/* JADX INFO: loaded from: classes4.dex */
final class AssetDownloader$okHttpClient$2 extends u implements id.a<x> {
    final /* synthetic */ AssetDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDownloader$okHttpClient$2(AssetDownloader assetDownloader) {
        super(0);
        this.this$0 = assetDownloader;
    }

    @Override // id.a
    public final x invoke() {
        return AssetDownloader.OkHttpSingleton.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
    }
}
