package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f6212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f6213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f6214c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f6216e = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f6215d = com.applovin.impl.sdk.l.p();

    public c0(String str, com.applovin.impl.sdk.l lVar) {
        this.f6213b = str;
        this.f6212a = lVar;
        this.f6214c = lVar.Q();
    }

    public Context a() {
        return this.f6215d;
    }

    public void a(boolean z10) {
        this.f6216e.set(z10);
    }
}
