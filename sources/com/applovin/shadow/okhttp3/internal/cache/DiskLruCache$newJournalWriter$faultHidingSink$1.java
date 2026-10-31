package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okhttp3.internal.Util;
import id.l;
import java.io.IOException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends u implements l<IOException, g0> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
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
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
    }
}
