package com.applovin.impl;

import android.app.Activity;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public class e6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6424g;

    public e6(com.applovin.impl.sdk.l lVar) {
        super("TaskInitializeSdk", lVar, true);
        this.f6424g = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, r2 r2Var, Exception exc) {
        if (exc != null) {
            this.f6424g.E().a("license_validation", exc);
        }
        this.f6424g.s0().a(new v6(this.f6424g, r2Var, exc));
    }

    private void h() {
        Long l10 = (Long) this.f6424g.a(z4.f9393y);
        if (l10.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) c5.a(b5.f6138i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
        Boolean bool2 = (Boolean) this.f6424g.a(z4.f9401z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.f6424g.P().a(l10.longValue()).a(this.f6424g.s0().a("lv_task"), new u4.b() { // from class: com.applovin.impl.t9
                @Override // com.applovin.impl.u4.b
                public final void a(boolean z10, Object obj, Object obj2) {
                    this.f8834a.a(z10, (r2) obj, (Exception) obj2);
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.p pVar;
        String str;
        StringBuilder sb2;
        String str2 = AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f6424g.I().b(a());
            this.f6424g.I().e(a());
            this.f6424g.s0().a((k5) new l5(this.f6424g), f6.b.OTHER);
            this.f6424g.B().c0();
            this.f6424g.n0().c();
            this.f6424g.z().l();
            if (q7.c(this.f6424g)) {
                this.f6424g.a();
            }
            this.f6424g.Z0();
            g();
            f();
            this.f6424g.a(true);
            h();
            this.f6424g.h0().b();
            this.f6424g.l().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f6424g.a(z4.G2)).booleanValue()) {
                this.f6424g.Z().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f6424g.G().maybeTrackAppOpenEvent();
            this.f6424g.A().a();
            if (((Boolean) this.f6424g.a(z4.T2)).booleanValue()) {
                this.f6424g.z0().b();
            }
            if (((Boolean) this.f6424g.a(z4.f9189b1)).booleanValue()) {
                this.f6424g.i().b();
            } else {
                this.f6424g.i().g();
            }
            if (this.f6424g.W().g() || (((Boolean) this.f6424g.a(t3.F7)).booleanValue() && q7.c(this.f6424g) && this.f6424g.I0())) {
                this.f6424g.W().e();
            }
            this.f6424g.g0().i();
            if (com.applovin.impl.sdk.p.a()) {
                pVar = this.f6992c;
                str = this.f6991b;
                sb2 = new StringBuilder();
                sb2.append("AppLovin SDK ");
                sb2.append(AppLovinSdk.VERSION);
                sb2.append(" initialization ");
                if (!this.f6424g.D0()) {
                    str2 = "failed";
                }
                sb2.append(str2);
                sb2.append(" in ");
                sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sb2.append("ms");
                pVar.a(str, sb2.toString());
            }
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.p.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f6424g.a(false);
                a(th);
                if (((Boolean) this.f6424g.a(z4.f9250i)).booleanValue()) {
                    this.f6424g.h0().a();
                }
                if (((Boolean) this.f6424g.a(z4.f9241h)).booleanValue()) {
                    this.f6424g.V0();
                }
                this.f6424g.g0().i();
                if (!com.applovin.impl.sdk.p.a()) {
                    return;
                }
                pVar = this.f6992c;
                str = this.f6991b;
                sb2 = new StringBuilder();
                sb2.append("AppLovin SDK ");
                sb2.append(AppLovinSdk.VERSION);
                sb2.append(" initialization ");
                if (!this.f6424g.D0()) {
                }
            } catch (Throwable th2) {
                this.f6424g.g0().i();
                if (com.applovin.impl.sdk.p.a()) {
                    com.applovin.impl.sdk.p pVar2 = this.f6992c;
                    String str3 = this.f6991b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("AppLovin SDK ");
                    sb3.append(AppLovinSdk.VERSION);
                    sb3.append(" initialization ");
                    if (!this.f6424g.D0()) {
                        str2 = "failed";
                    }
                    sb3.append(str2);
                    sb3.append(" in ");
                    sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb3.append("ms");
                    pVar2.a(str3, sb3.toString());
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f6424g.U().a(this.f6424g.e().b());
    }

    private void f() {
        if (this.f6424g.U().c()) {
            return;
        }
        Activity activityW0 = this.f6424g.w0();
        if (activityW0 != null) {
            this.f6424g.U().a(activityW0);
            return;
        }
        this.f6424g.E().a(f2.L0, this.f6991b + ":maybeInitializeAdapters()");
        this.f6424g.s0().a(new u6(this.f6424g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.u9
            @Override // java.lang.Runnable
            public final void run() {
                this.f8897a.e();
            }
        }), f6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }

    private void g() {
        String str;
        String str2;
        boolean zC = this.f6424g.q0().c();
        Map mapP = this.f6424g.B().p();
        Map mapM = this.f6424g.B().M();
        String strA = zC ? this.f6424g.B().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        x2 x2Var = new x2();
        x2Var.a().a("=====AppLovin SDK=====");
        x2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f6424g.a(z4.R3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.f6424g.g0().c());
        x2Var.a("===Device Info===").a("OS", q7.d()).a("GAID", strA).a("App Set ID", str).a("Model", mapP.get(DeviceRequestsHelper.DEVICE_INFO_MODEL)).a("Locale", mapP.get("locale")).a(CwEo.vDjMnZOuwLy, mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        x2Var.a("===App Info===").a("Application ID", mapM.get("package_name")).a("Target SDK", mapM.get("target_sdk"));
        x2Var.a("===SDK Settings===").a("SDK Key", this.f6424g.k0()).a("Mediation Provider", this.f6424g.X()).a("TG", p7.a(this.f6424g)).a("MD", this.f6424g.a(z4.f9349t)).a("Test Mode On", Boolean.valueOf(this.f6424g.u0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        x2Var.a(GEmOVMyH.clUuokfW).a(q0.a(a()));
        x2Var.a("===MAX Terms and Privcay Policy Flow===");
        v0 v0VarY = this.f6424g.y();
        boolean zJ = v0VarY.j();
        x2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f6424g.w().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = v0VarY.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str3 = "Other";
            if (consentFlowUserGeography == consentFlowUserGeography2) {
                str2 = "GDPR";
            } else {
                str2 = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            x2Var.a("Consent Flow Geography", str2);
            if (q7.c(this.f6424g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str3 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str3 = "None";
                }
                x2Var.a("Debug User Geography", str3);
            }
        }
        x2Var.a("Privacy Policy URI", v0VarY.f()).a("Terms of Service URI", v0VarY.h());
        x2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f6424g.t0().i());
        x2Var.a();
        com.applovin.impl.sdk.p.g("AppLovinSdk", x2Var.toString());
    }
}
