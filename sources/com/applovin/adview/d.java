package com.applovin.adview;

import com.applovin.impl.p2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppLovinFullscreenActivity f5880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f5881b;

    public /* synthetic */ d(AppLovinFullscreenActivity appLovinFullscreenActivity, p2 p2Var) {
        this.f5880a = appLovinFullscreenActivity;
        this.f5881b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5880a.a(this.f5881b);
    }
}
