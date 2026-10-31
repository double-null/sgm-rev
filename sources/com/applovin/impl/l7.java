package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f7053b;

    /* JADX INFO: loaded from: classes.dex */
    class a extends u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i10) {
            return i10 == d.SETTINGS.ordinal() ? l7.this.c() : l7.this.a();
        }

        @Override // com.applovin.impl.u2
        protected int d(int i10) {
            return i10 == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i10) {
            return i10 == d.SETTINGS.ordinal() ? new x4("SETTINGS") : new x4("GDPR APPLICABILITY");
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f7055a;

        b(com.applovin.impl.sdk.l lVar) {
            this.f7055a = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() == d.SETTINGS.ordinal()) {
                if (l2Var.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f7055a.y().f() != null) {
                        n7.a(this.f7055a.y().f(), com.applovin.impl.sdk.l.p(), this.f7055a);
                        return;
                    } else {
                        q7.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", l7.this);
                        return;
                    }
                }
                if (l2Var.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f7055a.y().h() == null) {
                    return;
                }
                n7.a(this.f7055a.y().h(), com.applovin.impl.sdk.l.p(), this.f7055a);
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    private enum d {
        SETTINGS,
        f7062b
    }

    /* JADX INFO: loaded from: classes.dex */
    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private t2 d() {
        t2.b bVarD = t2.a().d("Terms of Service URL");
        if (this.f7052a.y().h() != null) {
            bVarD.a(R.drawable.applovin_ic_check_mark_bordered);
            bVarD.b(getColor(R.color.applovin_sdk_checkmarkColor));
            bVarD.a(true);
        } else {
            bVarD.c("None");
            bVarD.a(false);
        }
        return bVarD.a();
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f7052a;
    }

    public void initialize(com.applovin.impl.sdk.l lVar) {
        this.f7052a = lVar;
        a aVar = new a(this);
        this.f7053b = aVar;
        aVar.a(new b(lVar));
        this.f7053b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.f7053b;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f7052a.w().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = this.f7052a.y().d();
        boolean z10 = q7.c(this.f7052a) && consentFlowUserGeographyD != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(t2.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z10));
        arrayList.add(b(consentFlowUserGeographyD, z10));
        return arrayList;
    }

    private t2 b() {
        boolean z10 = this.f7052a.y().f() != null;
        return t2.a().d("Privacy Policy URL").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(getColor(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).a(true).a();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(xjwcmjDeOXR.ZBWIgiWCDK);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f7053b);
    }

    private t2 a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        String str;
        t2.b bVarD = t2.a().d("Consent Flow Geography");
        if (consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            str = "GDPR";
        } else {
            str = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        return bVarD.c(str).b(z10).a();
    }

    private t2 b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        String str;
        t2.b bVarD = t2.a().d("Debug User Geography");
        if (consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            str = "GDPR";
        } else {
            str = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None";
        }
        return bVarD.c(str).b(z10).a();
    }
}
