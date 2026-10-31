package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.f2;
import com.applovin.impl.m0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f7894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f7895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConsentForm f7896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7897d;

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes.dex */
    public interface InterfaceC0116a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(l lVar) {
        this.f7894a = lVar;
        this.f7895b = lVar.Q();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(l.p());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a() {
        if (this.f7896c != null) {
            this.f7896c = null;
        }
        this.f7897d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a(oqHAiWkeGzWld.uZmMDpn);
        UserMessagingPlatform.getConsentInformation(l.p()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC0116a interfaceC0116a, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        interfaceC0116a.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.f7894a.c(z4.f9303n7).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.f7894a.a(z4.f9294m7);
        return num.intValue() < 0 || this.f7897d < num.intValue();
    }

    public void a(final Activity activity, m0 m0Var, final InterfaceC0116a interfaceC0116a) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (q7.c(this.f7894a) && m0Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f7894a.p0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.applovin.impl.privacy.cmp.b
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                this.f7898a.a(activity, interfaceC0116a);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.applovin.impl.privacy.cmp.c
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                this.f7901a.b(interfaceC0116a, formError);
            }
        });
    }

    public void b(Activity activity, final m0 m0Var, final InterfaceC0116a interfaceC0116a) {
        if (this.f7896c == null) {
            b("Failed to show - not ready yet");
            interfaceC0116a.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.f7896c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.i
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    this.f7918a.a(m0Var, interfaceC0116a, formError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final FormError formError, final m0 m0Var, final InterfaceC0116a interfaceC0116a) {
        a("Retrying to load and show consent form...");
        this.f7897d++;
        UserMessagingPlatform.loadConsentForm(l.p(), new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.g
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                this.f7911a.a(interfaceC0116a, formError, m0Var, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.h
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError2) {
                this.f7915a.a(interfaceC0116a, formError, formError2);
            }
        });
    }

    private void b(String str) {
        if (p.a()) {
            this.f7895b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, final InterfaceC0116a interfaceC0116a) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
        if (!zIsConsentFormAvailable) {
            b("Failed to load form.");
            interfaceC0116a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            return;
        }
        if (consentStatus != 2) {
            b("Failed to load with consent status: " + consentStatus);
            interfaceC0116a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, "Consent form not required for consent status: " + consentStatus));
            return;
        }
        a("Successfully requested consent info");
        a("Loading consent form...");
        UserMessagingPlatform.loadConsentForm(activity, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.e
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                this.f7907a.a(interfaceC0116a, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.f
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                this.f7909a.a(interfaceC0116a, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0116a interfaceC0116a, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.f7896c = consentForm;
        interfaceC0116a.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0116a interfaceC0116a, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        interfaceC0116a.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final m0 m0Var, final InterfaceC0116a interfaceC0116a, final FormError formError) {
        if (formError != null) {
            String strValueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap map = new HashMap(2);
            map.put("error_code", strValueOf);
            map.put("error_message", message);
            this.f7894a.E().a(f2.X0, "googleConsentFormDismissed", map);
            if (c(strValueOf)) {
                a("Consent form was dismissed due to error: " + message);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.privacy.cmp.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7903a.a(formError, m0Var, interfaceC0116a);
                    }
                });
                return;
            }
            b("Failed to show with error: " + message);
            interfaceC0116a.onFlowShowFailed(a(formError, "Consent form show failed"));
            return;
        }
        a("Consent form finished showing");
        interfaceC0116a.onFlowHidden(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0116a interfaceC0116a, FormError formError, m0 m0Var, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.f7896c = consentForm;
        Activity activityW0 = this.f7894a.w0();
        if (activityW0 == null) {
            interfaceC0116a.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(activityW0, m0Var, interfaceC0116a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0116a interfaceC0116a, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        interfaceC0116a.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    private CmpErrorImpl a(FormError formError, String str) {
        AppLovinCmpError.Code code = AppLovinCmpError.Code.UNSPECIFIED;
        int errorCode = formError.getErrorCode();
        if (errorCode == 1 || errorCode == 2) {
            code = AppLovinCmpError.Code.FORM_UNAVAILABLE;
        } else if (errorCode == 3) {
            code = AppLovinCmpError.Code.INTEGRATION_ERROR;
        } else if (errorCode == 4) {
            code = AppLovinCmpError.Code.FORM_UNAVAILABLE;
        }
        return new CmpErrorImpl(code, str, formError.getErrorCode(), formError.getMessage());
    }

    private void a(String str) {
        if (p.a()) {
            this.f7895b.a("GoogleCmpAdapter", str);
        }
    }
}
