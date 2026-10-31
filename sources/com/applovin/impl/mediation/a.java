package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.e3;
import com.applovin.impl.q7;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f7189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0111a f7192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e3 f7193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f7194f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0111a {
        void b(e3 e3Var);
    }

    a(com.applovin.impl.sdk.l lVar) {
        this.f7190b = lVar.Q();
        this.f7189a = lVar.e();
        this.f7191c = q7.a(com.applovin.impl.sdk.l.p(), "AdActivityObserver", lVar);
    }

    public void a(e3 e3Var, InterfaceC0111a interfaceC0111a) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7190b.a("AdActivityObserver", "Starting for ad " + e3Var.getAdUnitId() + "...");
        }
        a();
        this.f7192d = interfaceC0111a;
        this.f7193e = e3Var;
        this.f7189a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f7191c) && this.f7193e.C0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7190b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f7192d != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7190b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f7192d.b(this.f7193e);
            }
            a();
            return;
        }
        if (this.f7194f == null) {
            this.f7194f = activity.getClass().getName();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7190b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f7194f);
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f7194f)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7190b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f7194f);
            }
            if (this.f7192d != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7190b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f7192d.b(this.f7193e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7190b.a("AdActivityObserver", "Cancelling...");
        }
        this.f7189a.b(this);
        this.f7192d = null;
        this.f7193e = null;
        this.f7194f = null;
    }
}
