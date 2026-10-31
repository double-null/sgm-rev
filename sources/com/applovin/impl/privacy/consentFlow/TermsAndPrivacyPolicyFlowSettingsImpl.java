package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

/* JADX INFO: loaded from: classes.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f7923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f7924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uri f7925e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z10, boolean z11, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.f7921a = z10;
        this.f7922b = z11;
        this.f7923c = consentFlowUserGeography;
        this.f7924d = uri;
        this.f7925e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f7923c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.f7924d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.f7925e;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f7921a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        p.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f7923c = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z10) {
        p.g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z10);
        this.f7921a = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        p.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f7924d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z10) {
        p.g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z10);
        this.f7922b = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        p.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f7925e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.f7922b;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f7921a + ", privacyPolicyUri=" + this.f7924d + ", termsOfServiceUri=" + this.f7925e + '}';
    }
}
