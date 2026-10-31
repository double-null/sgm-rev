package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Activity f7116h;

    public m5(List list, Activity activity, com.applovin.impl.sdk.l lVar) {
        super("TaskAutoInitAdapters", lVar, true);
        this.f7115g = list;
        this.f7116h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m3 m3Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Auto-initing adapter: " + m3Var);
        }
        this.f6990a.U().a(m3Var, this.f7116h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7115g.size() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVar = this.f6992c;
                String str = this.f6991b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Auto-initing ");
                sb2.append(this.f7115g.size());
                sb2.append(" adapters");
                sb2.append(this.f6990a.u0().c() ? " in test mode" : "");
                sb2.append("...");
                pVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f6990a.X())) {
                this.f6990a.Q0();
            } else if (!this.f6990a.I0()) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f6990a.X());
            }
            if (this.f7116h == null) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final m3 m3Var : this.f7115g) {
                if (m3Var.s()) {
                    this.f6990a.s0().a(new Runnable() { // from class: com.applovin.impl.yb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9159a.a(m3Var);
                        }
                    }, f6.b.MEDIATION);
                } else {
                    this.f6990a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6990a.Q().a(this.f6991b, "Skipping eager auto-init for adapter " + m3Var);
                    }
                }
            }
        }
    }
}
