package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import org.json.JSONArray;
import org.json.JSONObject;
import rd.f0;

/* JADX INFO: compiled from: FetchedAppSettings.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FetchedAppSettings {
    public static final Companion Companion = new Companion(null);
    private final JSONArray MACARuleMatchingSetting;
    private final boolean automaticLoggingEnabled;
    private final JSONArray bannedParams;
    private final JSONArray blocklistEvents;
    private final boolean codelessEventsEnabled;
    private final List<String> currencyDedupeParameters;
    private final Long dedupeWindow;
    private final Map<String, Map<String, DialogFeatureConfig>> dialogConfigurations;
    private final FacebookRequestErrorClassification errorClassification;
    private final JSONArray eventBindings;
    private final boolean iAPAutomaticLoggingEnabled;
    private final Map<String, Boolean> migratedAutoLogValues;
    private final boolean monitorViaDialogEnabled;
    private final String nuxContent;
    private final boolean nuxEnabled;
    private final List<wc.q<String, List<String>>> prodDedupeParameters;
    private final JSONArray protectedModeStandardParamsSetting;
    private final List<String> purchaseValueDedupeParameters;
    private final String rawAamRules;
    private final JSONArray redactedEvents;
    private final String restrictiveDataSetting;
    private final JSONArray schemaRestrictions;
    private final String sdkUpdateMessage;
    private final JSONArray sensitiveParams;
    private final int sessionTimeoutInSeconds;
    private final String smartLoginBookmarkIconURL;
    private final String smartLoginMenuIconURL;
    private final EnumSet<SmartLoginOption> smartLoginOptions;
    private final String suggestedEventsSetting;
    private final boolean supportsImplicitLogging;
    private final List<wc.q<String, List<String>>> testDedupeParameters;
    private final boolean trackUninstallEnabled;
    private final String vvpConfig;

    /* JADX INFO: compiled from: FetchedAppSettings.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final DialogFeatureConfig getDialogFeatureConfig(String applicationId, String actionName, String featureName) {
            Map<String, Map<String, DialogFeatureConfig>> dialogConfigurations;
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(actionName, "actionName");
            kotlin.jvm.internal.t.f(featureName, "featureName");
            if (!(actionName.length() == 0)) {
                if (!(featureName.length() == 0)) {
                    FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
                    Map<String, DialogFeatureConfig> map = (appSettingsWithoutQuery == null || (dialogConfigurations = appSettingsWithoutQuery.getDialogConfigurations()) == null) ? null : dialogConfigurations.get(actionName);
                    if (map != null) {
                        return map.get(featureName);
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: FetchedAppSettings.kt */
    public static final class DialogFeatureConfig {
        public static final Companion Companion = new Companion(null);
        private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "|";
        private static final String DIALOG_CONFIG_NAME_KEY = "name";
        private static final String DIALOG_CONFIG_URL_KEY = "url";
        private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
        private final String dialogName;
        private final Uri fallbackUrl;
        private final String featureName;
        private final int[] versionSpec;

        /* JADX INFO: compiled from: FetchedAppSettings.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            private final int[] parseVersionSpec(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = -1;
                    int iOptInt = jSONArray.optInt(i10, -1);
                    if (iOptInt == -1) {
                        String versionString = jSONArray.optString(i10);
                        if (!Utility.isNullOrEmpty(versionString)) {
                            try {
                                kotlin.jvm.internal.t.e(versionString, "versionString");
                                i11 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e10) {
                                Utility.logd(Utility.LOG_TAG, e10);
                            }
                            iOptInt = i11;
                        }
                    }
                    iArr[i10] = iOptInt;
                }
                return iArr;
            }

            public final DialogFeatureConfig parseDialogConfig(JSONObject dialogConfigJSON) {
                kotlin.jvm.internal.t.f(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (Utility.isNullOrEmpty(dialogNameWithFeature)) {
                    return null;
                }
                kotlin.jvm.internal.t.e(dialogNameWithFeature, "dialogNameWithFeature");
                List listK0 = f0.K0(dialogNameWithFeature, new String[]{DialogFeatureConfig.DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR}, false, 0, 6, null);
                if (listK0.size() != 2) {
                    return null;
                }
                String str = (String) b0.O(listK0);
                String str2 = (String) b0.X(listK0);
                if (Utility.isNullOrEmpty(str) || Utility.isNullOrEmpty(str2)) {
                    return null;
                }
                String strOptString = dialogConfigJSON.optString("url");
                return new DialogFeatureConfig(str, str2, Utility.isNullOrEmpty(strOptString) ? null : Uri.parse(strOptString), parseVersionSpec(dialogConfigJSON.optJSONArray(DialogFeatureConfig.DIALOG_CONFIG_VERSIONS_KEY)), null);
            }
        }

        public /* synthetic */ DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr, kotlin.jvm.internal.k kVar) {
            this(str, str2, uri, iArr);
        }

        public final String getDialogName() {
            return this.dialogName;
        }

        public final Uri getFallbackUrl() {
            return this.fallbackUrl;
        }

        public final String getFeatureName() {
            return this.featureName;
        }

        public final int[] getVersionSpec() {
            return this.versionSpec;
        }

        private DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchedAppSettings(boolean z10, String nuxContent, boolean z11, int i10, EnumSet<SmartLoginOption> smartLoginOptions, Map<String, ? extends Map<String, DialogFeatureConfig>> dialogConfigurations, boolean z12, FacebookRequestErrorClassification errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z13, boolean z14, JSONArray jSONArray, String sdkUpdateMessage, boolean z15, boolean z16, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, Map<String, Boolean> map, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONArray jSONArray7, JSONArray jSONArray8, String str4, List<String> list, List<String> list2, List<? extends wc.q<String, ? extends List<String>>> list3, List<? extends wc.q<String, ? extends List<String>>> list4, Long l10) {
        kotlin.jvm.internal.t.f(nuxContent, "nuxContent");
        kotlin.jvm.internal.t.f(smartLoginOptions, "smartLoginOptions");
        kotlin.jvm.internal.t.f(dialogConfigurations, "dialogConfigurations");
        kotlin.jvm.internal.t.f(errorClassification, "errorClassification");
        kotlin.jvm.internal.t.f(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        kotlin.jvm.internal.t.f(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        kotlin.jvm.internal.t.f(sdkUpdateMessage, "sdkUpdateMessage");
        this.supportsImplicitLogging = z10;
        this.nuxContent = nuxContent;
        this.nuxEnabled = z11;
        this.sessionTimeoutInSeconds = i10;
        this.smartLoginOptions = smartLoginOptions;
        this.dialogConfigurations = dialogConfigurations;
        this.automaticLoggingEnabled = z12;
        this.errorClassification = errorClassification;
        this.smartLoginBookmarkIconURL = smartLoginBookmarkIconURL;
        this.smartLoginMenuIconURL = smartLoginMenuIconURL;
        this.iAPAutomaticLoggingEnabled = z13;
        this.codelessEventsEnabled = z14;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = sdkUpdateMessage;
        this.trackUninstallEnabled = z15;
        this.monitorViaDialogEnabled = z16;
        this.rawAamRules = str;
        this.suggestedEventsSetting = str2;
        this.restrictiveDataSetting = str3;
        this.protectedModeStandardParamsSetting = jSONArray2;
        this.MACARuleMatchingSetting = jSONArray3;
        this.migratedAutoLogValues = map;
        this.blocklistEvents = jSONArray4;
        this.redactedEvents = jSONArray5;
        this.sensitiveParams = jSONArray6;
        this.schemaRestrictions = jSONArray7;
        this.bannedParams = jSONArray8;
        this.vvpConfig = str4;
        this.currencyDedupeParameters = list;
        this.purchaseValueDedupeParameters = list2;
        this.prodDedupeParameters = list3;
        this.testDedupeParameters = list4;
        this.dedupeWindow = l10;
    }

    public static final DialogFeatureConfig getDialogFeatureConfig(String str, String str2, String str3) {
        return Companion.getDialogFeatureConfig(str, str2, str3);
    }

    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    public final JSONArray getBannedParams() {
        return this.bannedParams;
    }

    public final JSONArray getBlocklistEvents() {
        return this.blocklistEvents;
    }

    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    public final List<String> getCurrencyDedupeParameters() {
        return this.currencyDedupeParameters;
    }

    public final Long getDedupeWindow() {
        return this.dedupeWindow;
    }

    public final Map<String, Map<String, DialogFeatureConfig>> getDialogConfigurations() {
        return this.dialogConfigurations;
    }

    public final FacebookRequestErrorClassification getErrorClassification() {
        return this.errorClassification;
    }

    public final JSONArray getEventBindings() {
        return this.eventBindings;
    }

    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    public final JSONArray getMACARuleMatchingSetting() {
        return this.MACARuleMatchingSetting;
    }

    public final Map<String, Boolean> getMigratedAutoLogValues() {
        return this.migratedAutoLogValues;
    }

    public final boolean getMonitorViaDialogEnabled() {
        return this.monitorViaDialogEnabled;
    }

    public final String getNuxContent() {
        return this.nuxContent;
    }

    public final boolean getNuxEnabled() {
        return this.nuxEnabled;
    }

    public final List<wc.q<String, List<String>>> getProdDedupeParameters() {
        return this.prodDedupeParameters;
    }

    public final JSONArray getProtectedModeStandardParamsSetting() {
        return this.protectedModeStandardParamsSetting;
    }

    public final List<String> getPurchaseValueDedupeParameters() {
        return this.purchaseValueDedupeParameters;
    }

    public final String getRawAamRules() {
        return this.rawAamRules;
    }

    public final JSONArray getRedactedEvents() {
        return this.redactedEvents;
    }

    public final String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    public final JSONArray getSchemaRestrictions() {
        return this.schemaRestrictions;
    }

    public final String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    public final JSONArray getSensitiveParams() {
        return this.sensitiveParams;
    }

    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    public final String getSmartLoginBookmarkIconURL() {
        return this.smartLoginBookmarkIconURL;
    }

    public final String getSmartLoginMenuIconURL() {
        return this.smartLoginMenuIconURL;
    }

    public final EnumSet<SmartLoginOption> getSmartLoginOptions() {
        return this.smartLoginOptions;
    }

    public final String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    public final List<wc.q<String, List<String>>> getTestDedupeParameters() {
        return this.testDedupeParameters;
    }

    public final boolean getTrackUninstallEnabled() {
        return this.trackUninstallEnabled;
    }

    public final String getVvpConfig() {
        return this.vvpConfig;
    }

    public final boolean supportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }
}
