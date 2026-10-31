package com.vungle.ads;

import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;

/* JADX INFO: compiled from: VunglePrivacySettings.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VunglePrivacySettings {
    public static final VunglePrivacySettings INSTANCE = new VunglePrivacySettings();

    private VunglePrivacySettings() {
    }

    public static final String getCCPAStatus() {
        return PrivacyManager.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return PrivacyManager.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return PrivacyManager.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return PrivacyManager.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return PrivacyManager.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return PrivacyManager.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z10) {
        PrivacyManager.INSTANCE.updateCcpaConsent(z10 ? PrivacyConsent.OPT_IN : PrivacyConsent.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean z10) {
        PrivacyManager.INSTANCE.updateCoppaConsent(z10);
    }

    public static final void setGDPRStatus(boolean z10, String str) {
        PrivacyManager.INSTANCE.updateGdprConsent(z10 ? PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue(), "publisher", str);
    }
}
