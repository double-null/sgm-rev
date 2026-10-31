package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.share.internal.ShareConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f6990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f6991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f6992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f6993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6995f;

    public k5(String str, com.applovin.impl.sdk.l lVar) {
        this(str, lVar, false, null);
    }

    public com.applovin.impl.sdk.l b() {
        return this.f6990a;
    }

    public String c() {
        return this.f6991b;
    }

    public boolean d() {
        return this.f6995f;
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, boolean z10) {
        this(str, lVar, z10, null);
    }

    public Context a() {
        return this.f6993d;
    }

    public ScheduledFuture b(final Thread thread, final long j10) {
        if (j10 <= 0) {
            return null;
        }
        return this.f6990a.s0().b(new u6(this.f6990a, "timeout:" + this.f6991b, new Runnable() { // from class: com.applovin.impl.qb
            @Override // java.lang.Runnable
            public final void run() {
                this.f8018a.a(thread, j10);
            }
        }), f6.b.TIMEOUT, j10);
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, String str2) {
        this(str, lVar, false, str2);
    }

    public void a(String str) {
        this.f6994e = str;
    }

    public k5(String str, com.applovin.impl.sdk.l lVar, boolean z10, String str2) {
        this.f6991b = str;
        this.f6990a = lVar;
        this.f6992c = lVar.Q();
        this.f6993d = com.applovin.impl.sdk.l.p();
        this.f6995f = z10;
        this.f6994e = str2;
    }

    public void a(boolean z10) {
        this.f6995f = z10;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map(ShareConstants.FEED_SOURCE_PARAM, this.f6991b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f6994e));
        this.f6990a.E().d(f2.f6487g1, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f6994e)) {
            mapHashMap.put("details", this.f6994e);
        }
        this.f6990a.E().a(f2.f6490h1, this.f6991b, mapHashMap);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.k(this.f6991b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }
}
