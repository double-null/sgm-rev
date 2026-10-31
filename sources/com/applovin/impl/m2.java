package com.applovin.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f7103a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.l lVar) {
        if (f7103a) {
            return;
        }
        lVar.E().a(f2.f6472b1, "no_ads_loaded");
    }

    public static void b(final com.applovin.impl.sdk.l lVar) {
        Long l10 = (Long) lVar.a(t3.f8821z8);
        if (l10.longValue() <= 0) {
            return;
        }
        lVar.s0().a(new u6(lVar, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.wb
            @Override // java.lang.Runnable
            public final void run() {
                m2.a(lVar);
            }
        }), f6.b.OTHER, TimeUnit.SECONDS.toMillis(l10.longValue()));
    }

    public static void a() {
        f7103a = true;
    }
}
