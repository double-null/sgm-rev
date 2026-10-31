package com.applovin.shadow.okhttp3.internal.cache;

import id.l;
import java.io.IOException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes.dex */
final class DiskLruCache$Editor$newSink$1$1 extends u implements l<IOException, g0> {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    @Override // id.l
    public /* bridge */ /* synthetic */ g0 invoke(IOException iOException) {
        invoke2(iOException);
        return g0.f27756a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IOException it) {
        t.f(it, "it");
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
            g0 g0Var = g0.f27756a;
        }
    }
}
