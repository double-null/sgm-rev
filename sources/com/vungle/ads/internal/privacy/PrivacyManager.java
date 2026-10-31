package com.vungle.ads.internal.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: PrivacyManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyManager {
    private static PrivacyConsent ccpaConsent;
    private static FilePreferences filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    private static SharedPreferences sharedPreferences;
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX INFO: compiled from: PrivacyManager.kt */
    public enum DeviceIdAllowed {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK
    }

    /* JADX INFO: compiled from: PrivacyManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceIdAllowed.values().length];
            iArr[DeviceIdAllowed.DISABLE_ID.ordinal()] = 1;
            iArr[DeviceIdAllowed.FALLBACK.ordinal()] = 2;
            iArr[DeviceIdAllowed.ALLOW_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfigPayload.IABSettings.TcfStatus.values().length];
            iArr2[ConfigPayload.IABSettings.TcfStatus.DISABLE_ID.ordinal()] = 1;
            iArr2[ConfigPayload.IABSettings.TcfStatus.ALLOW_ID.ordinal()] = 2;
            iArr2[ConfigPayload.IABSettings.TcfStatus.LEGACY.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private PrivacyManager() {
    }

    private final void saveCcpaConsent(PrivacyConsent privacyConsent) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.CCPA_CONSENT_STATUS, privacyConsent.getValue())) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    private final void saveCoppaConsent(boolean z10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.COPPA_STATUS_KEY, z10)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferencesPut2;
        FilePreferences filePreferencesPut3;
        FilePreferences filePreferencesPut4;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.GDPR_CONSENT_STATUS, str)) == null || (filePreferencesPut2 = filePreferencesPut.put(Cookie.GDPR_CONSENT_SOURCE, str2)) == null || (filePreferencesPut3 = filePreferencesPut2.put(Cookie.GDPR_CONSENT_MESSAGE_VERSION, str3)) == null || (filePreferencesPut4 = filePreferencesPut3.put(Cookie.GDPR_CONSENT_TIMESTAMP, j10)) == null) {
            return;
        }
        filePreferencesPut4.apply();
    }

    public final DeviceIdAllowed allowDeviceIDFromTCF() {
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (!t.a(gdprAppliesFromPreferences, Boolean.TRUE)) {
            return gdprAppliesFromPreferences == null ? DeviceIdAllowed.FALLBACK : DeviceIdAllowed.ALLOW_ID;
        }
        ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return DeviceIdAllowed.DISABLE_ID;
            }
            if (i10 == 2) {
                return DeviceIdAllowed.ALLOW_ID;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return DeviceIdAllowed.FALLBACK;
    }

    public final String getCcpaStatus() {
        String value;
        PrivacyConsent privacyConsent = ccpaConsent;
        return (privacyConsent == null || (value = privacyConsent.getValue()) == null) ? PrivacyConsent.UNKNOWN.getValue() : value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final long getConsentTimestamp() {
        Long l10 = gdprConsentTimestamp;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return COPPA.COPPA_NOTSET;
        }
        if (t.a(atomicReference.get(), Boolean.TRUE)) {
            return COPPA.COPPA_ENABLED;
        }
        return t.a(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    public final Boolean getDisableAdId$vungle_ads_release() {
        return disableAdId.get();
    }

    public final Boolean getGdprAppliesFromPreferences() {
        Object objC;
        Object objC2;
        Integer numValueOf;
        String string;
        try {
            r.a aVar = r.f27774b;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            objC = r.c(sharedPreferences2 != null ? Integer.valueOf(sharedPreferences2.getInt(Cookie.IABTCF_GDPR_APPLIES, -1)) : null);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        if (r.g(objC) != null) {
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 == null || (string = sharedPreferences3.getString(Cookie.IABTCF_GDPR_APPLIES, "-1")) == null) {
                    numValueOf = null;
                } else {
                    t.e(string, "getString(IABTCF_GDPR_APPLIES, \"-1\")");
                    numValueOf = Integer.valueOf(Integer.parseInt(string));
                }
                objC2 = r.c(numValueOf);
            } catch (Throwable th2) {
                r.a aVar3 = r.f27774b;
                objC2 = r.c(s.a(th2));
            }
            objC = objC2;
        }
        if (r.k(objC)) {
            objC = null;
        }
        Integer num = (Integer) objC;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String getIABTCFString() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String string = sharedPreferences2 != null ? sharedPreferences2.getString(Cookie.IABTCF_TC_STRING, "") : null;
        return string == null ? "" : string;
    }

    public final String getPreviousTcfToken() {
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null) {
            return filePreferences2.getString("previous_tcf_token", "");
        }
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public final synchronized void init(Context context) {
        t.f(context, "context");
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            Logger.Companion.w("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        FilePreferences filePreferences2 = (FilePreferences) ServiceLocator.Companion.getInstance(context).getService(FilePreferences.class);
        filePreferences = filePreferences2;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = filePreferences2.getBoolean(Cookie.COPPA_DISABLE_AD_ID);
            if (bool2 != null) {
                atomicReference.set(Boolean.valueOf(bool2.booleanValue()));
            }
        }
        String str = gdprConsent;
        if (str != null) {
            String str2 = gdprConsentSource;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = gdprConsentMessageVersion;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            Long l10 = gdprConsentTimestamp;
            saveGdprConsent(str, str3, str5, l10 != null ? l10.longValue() : 0L);
        } else {
            String string = filePreferences2.getString(Cookie.GDPR_CONSENT_STATUS);
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (t.a(string, privacyConsent.getValue())) {
                string = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                if (t.a(string, privacyConsent2.getValue())) {
                    string = privacyConsent2.getValue();
                }
            }
            gdprConsent = string;
            gdprConsentSource = filePreferences2.getString(Cookie.GDPR_CONSENT_SOURCE);
            gdprConsentMessageVersion = filePreferences2.getString(Cookie.GDPR_CONSENT_MESSAGE_VERSION);
            gdprConsentTimestamp = Long.valueOf(filePreferences2.getLong(Cookie.GDPR_CONSENT_TIMESTAMP, 0L));
        }
        PrivacyConsent privacyConsent3 = ccpaConsent;
        if (privacyConsent3 != null) {
            saveCcpaConsent(privacyConsent3);
        } else {
            String string2 = filePreferences2.getString(KBBdKxoAiHo.tKC);
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!t.a(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            ccpaConsent = privacyConsent4;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = filePreferences2.getBoolean(Cookie.COPPA_STATUS_KEY);
            if (bool4 != null) {
                atomicReference2.set(Boolean.valueOf(bool4.booleanValue()));
            }
        }
        atomicBoolean.set(true);
    }

    public final void reset() {
        initialized.set(false);
        gdprConsent = null;
        gdprConsentSource = null;
        gdprConsentMessageVersion = null;
        gdprConsentTimestamp = null;
        ccpaConsent = null;
        disableAdId.set(null);
        coppaStatus.set(null);
        filePreferences = null;
        sharedPreferences = null;
    }

    public final void saveDisableAdId(boolean z10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.COPPA_DISABLE_AD_ID, z10)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void setPreviousTcfToken(String str) {
        FilePreferences filePreferences2;
        FilePreferences filePreferencesPut;
        if ((str == null || str.length() == 0) || (filePreferences2 = filePreferences) == null || (filePreferencesPut = filePreferences2.put("previous_tcf_token", str)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (t.a(getPreviousTcfToken(), iABTCFString)) {
            return false;
        }
        setPreviousTcfToken(iABTCFString);
        return true;
    }

    public final boolean shouldSendAdIds() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Boolean disableAdId$vungle_ads_release = getDisableAdId$vungle_ads_release();
        return (disableAdId$vungle_ads_release == null || disableAdId$vungle_ads_release.booleanValue()) ? false : true;
    }

    public final boolean shouldSendTCFString() {
        if (!t.a(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            return false;
        }
        ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1 || i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return shouldReturnTrueForLegacy$vungle_ads_release();
    }

    public final void updateCcpaConsent(PrivacyConsent consent) {
        t.f(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final void updateCoppaConsent(boolean z10) {
        coppaStatus.set(Boolean.valueOf(z10));
        saveCoppaConsent(z10);
    }

    public final void updateDisableAdId(boolean z10) {
        disableAdId.set(Boolean.valueOf(z10));
        saveDisableAdId(z10);
    }

    public final void updateGdprConsent(String consent, String source, String str) {
        t.f(consent, "consent");
        t.f(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = str;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        gdprConsentTimestamp = Long.valueOf(jCurrentTimeMillis);
        String str2 = gdprConsentMessageVersion;
        if (str2 == null) {
            str2 = "";
        }
        saveGdprConsent(consent, source, str2, jCurrentTimeMillis);
    }
}
