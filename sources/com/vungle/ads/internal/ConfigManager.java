package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidEndpointError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import fe.u;
import id.l;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;
import rd.c0;
import wc.g0;
import wc.k;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: ConfigManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConfigManager {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final String TAG = "ConfigManager";
    private static String applicationId;
    private static ConfigPayload config;
    private static String configExt;
    private static ConfigPayload.Endpoints endpoints;
    private static List<Placement> placements;
    public static final ConfigManager INSTANCE = new ConfigManager();
    private static final k json$delegate = m.b(o.SYNCHRONIZED, ConfigManager$json$2.INSTANCE);

    private ConfigManager() {
    }

    /* JADX INFO: renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final VungleApiClient m235fetchConfigAsync$lambda0(k<VungleApiClient> kVar) {
        return kVar.getValue();
    }

    private final kotlinx.serialization.json.b getJson() {
        return (kotlinx.serialization.json.b) json$delegate.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final FilePreferences m236initWithConfig$lambda2(k<FilePreferences> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-4, reason: not valid java name */
    private static final VungleApiClient m237initWithConfig$lambda4(k<VungleApiClient> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final Executors m238initWithConfig$lambda5(k<? extends Executors> kVar) {
        return kVar.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(ConfigManager configManager, Context context, ConfigPayload configPayload, boolean z10, SingleValueMetric singleValueMetric, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            singleValueMetric = null;
        }
        configManager.initWithConfig$vungle_ads_release(context, configPayload, z10, singleValueMetric);
    }

    /* JADX INFO: renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final FilePreferences m239updateConfigExtension$lambda1(k<FilePreferences> kVar) {
        return kVar.getValue();
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(ConfigManager configManager, ConfigPayload.Endpoints endpoints2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            endpoints2 = endpoints;
        }
        return configManager.validateEndpoints$vungle_ads_release(endpoints2);
    }

    public final long afterClickDuration() {
        ConfigPayload.AutoRedirect autoRedirect;
        Long afterClickDuration;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final boolean allowAutoRedirects() {
        ConfigPayload.AutoRedirect autoRedirect;
        Boolean allowAutoRedirect;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    public final int checkConfigPayload$vungle_ads_release(ConfigPayload configPayload) {
        if (configPayload == null || configPayload.getConfigLastValidatedTimestamp() == null) {
            return 0;
        }
        Long configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp();
        if (configLastValidatedTimestamp != null && configLastValidatedTimestamp.longValue() == -1) {
            return 0;
        }
        return configPayload.getEndpoints() == null ? 1 : 2;
    }

    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        ConfigPayload configPayload = config;
        if (configPayload == null || (configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(final Context context, final l<? super Boolean, g0> onComplete) {
        t.f(context, "context");
        t.f(onComplete, "onComplete");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        try {
            Call<ConfigPayload> callConfig = m235fetchConfigAsync$lambda0(m.b(o.SYNCHRONIZED, new ConfigManager$fetchConfigAsync$$inlined$inject$1(context))).config();
            if (callConfig != null) {
                callConfig.enqueue(new Callback<ConfigPayload>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$1
                    @Override // com.vungle.ads.internal.network.Callback
                    public void onFailure(Call<ConfigPayload> call, Throwable th) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error while fetching config: ");
                        sb2.append(th != null ? th.getMessage() : null);
                        new NetworkUnreachable(sb2.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(Boolean.FALSE);
                    }

                    @Override // com.vungle.ads.internal.network.Callback
                    public void onResponse(Call<ConfigPayload> call, Response<ConfigPayload> response) {
                        if (response != null && response.isSuccessful() && response.body() != null) {
                            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(context, response.body(), false, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
                            onComplete.invoke(Boolean.TRUE);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("config API: ");
                        sb2.append(response != null ? Integer.valueOf(response.code()) : null);
                        new APIFailedStatusCodeError(sb2.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(Boolean.FALSE);
                    }
                });
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                new NetworkUnreachable("Config unknown: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable("Config: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (fpdEnabled = configPayload.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    public final String getAdsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        String str = adsEndpoint == null || adsEndpoint.length() == 0 ? null : adsEndpoint;
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    public final String getCSBEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String csbEndpoint = endpoints2 != null ? endpoints2.getCsbEndpoint() : null;
        String str = csbEndpoint == null || csbEndpoint.length() == 0 ? null : csbEndpoint;
        return str == null ? Constants.DEFAULT_CSB_ENDPOINT : str;
    }

    public final ConfigPayload getCachedConfig(FilePreferences filePreferences, String appId) {
        Long refreshTime;
        t.f(filePreferences, "filePreferences");
        t.f(appId, "appId");
        try {
            String string = filePreferences.getString(Cookie.CONFIG_APP_ID);
            if (!(string == null || string.length() == 0) && c0.B(string, appId, true)) {
                String string2 = filePreferences.getString(Cookie.CONFIG_RESPONSE);
                if (string2 == null) {
                    return null;
                }
                long j10 = filePreferences.getLong(Cookie.CONFIG_UPDATE_TIME, 0L);
                kotlinx.serialization.json.b json = INSTANCE.getJson();
                fe.d<Object> dVarB = u.b(json.a(), i0.j(ConfigPayload.class));
                t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                ConfigPayload configPayload = (ConfigPayload) json.c(dVarB, string2);
                ConfigPayload.ConfigSettings configSettings = configPayload.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j10 < System.currentTimeMillis()) {
                    Logger.Companion.w(TAG, "cache config expired. re-config");
                    return null;
                }
                Logger.Companion.w(TAG, "use cache config.");
                return configPayload;
            }
            Logger.Companion.w(TAG, "app id mismatch, re-config");
            return null;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Error while parsing cached config: " + e10.getMessage());
            return null;
        }
    }

    public final int getCleverCacheDiskPercentage() {
        ConfigPayload.CleverCache cleverCache;
        Integer diskPercentage;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        ConfigPayload.CleverCache cleverCache;
        Long diskSize;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j10 = 1024;
        return diskSize.longValue() * j10 * j10;
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final String getErrorLoggingEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        String str = errorLogsEndpoint == null || errorLogsEndpoint.length() == 0 ? null : errorLogsEndpoint;
        return str == null ? Constants.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    public final String getGDPRButtonAccept() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentMessageVersion() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        String consentMessageVersion;
        ConfigPayload configPayload = config;
        return (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.GDPRSettings gdpr;
        Boolean boolIsCountryDataProtected;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Integer errorLogLevel;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        Boolean metricsEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    public final String getMetricsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        String str = metricsEndpoint == null || metricsEndpoint.length() == 0 ? null : metricsEndpoint;
        return str == null ? Constants.DEFAULT_METRICS_ENDPOINT : str;
    }

    public final Placement getPlacement(String str) {
        List<Placement> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (t.a(((Placement) obj2).getReferenceId(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Placement) obj;
    }

    public final String getRiEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        ConfigPayload configPayload = config;
        return ((long) ((configPayload == null || (sessionTimeout = configPayload.getSessionTimeout()) == null) ? DEFAULT_SESSION_TIMEOUT_SECONDS : sessionTimeout.intValue())) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        ConfigPayload configPayload = config;
        return ((long) ((configPayload == null || (signalSessionTimeout = configPayload.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue())) * 1000;
    }

    public final ConfigPayload.IABSettings.TcfStatus getTcfStatus() {
        ConfigPayload.UserPrivacy userPrivacy;
        ConfigPayload.IABSettings iab;
        ConfigPayload.IABSettings.TcfStatus.Companion companion = ConfigPayload.IABSettings.TcfStatus.Companion;
        ConfigPayload configPayload = config;
        return companion.fromRawValue((configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final synchronized void initWithConfig$vungle_ads_release(Context context, ConfigPayload configPayload, boolean z10, SingleValueMetric singleValueMetric) {
        t.f(context, "context");
        try {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            o oVar = o.SYNCHRONIZED;
            k kVarB = m.b(oVar, new ConfigManager$initWithConfig$$inlined$inject$1(context));
            int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(configPayload);
            if (iCheckConfigPayload$vungle_ads_release == 0) {
                Logger.Companion.e(TAG, "Config is not available.");
                return;
            }
            if (iCheckConfigPayload$vungle_ads_release == 1) {
                if (!z10 && configPayload != null) {
                    Long configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp();
                    long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                    ConfigPayload configPayload2 = config;
                    if (configPayload2 != null) {
                        configPayload2.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                    }
                    ConfigPayload configPayload3 = config;
                    if (configPayload3 != null) {
                        INSTANCE.updateCachedConfig(configPayload3, m236initWithConfig$lambda2(kVarB));
                    }
                }
                return;
            }
            config = configPayload;
            endpoints = configPayload != null ? configPayload.getEndpoints() : null;
            placements = configPayload != null ? configPayload.getPlacements() : null;
            int logLevel = getLogLevel();
            boolean metricsEnabled = getMetricsEnabled();
            k kVarB2 = m.b(oVar, new ConfigManager$initWithConfig$$inlined$inject$2(context));
            k kVarB3 = m.b(oVar, new ConfigManager$initWithConfig$$inlined$inject$3(context));
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            analyticsClient.initOrUpdate$vungle_ads_release(m237initWithConfig$lambda4(kVarB2), m238initWithConfig$lambda5(kVarB3).getLoggerExecutor(), logLevel, metricsEnabled);
            if (!z10 && configPayload != null) {
                updateCachedConfig(configPayload, m236initWithConfig$lambda2(kVarB));
                String configExtension = configPayload.getConfigExtension();
                if (configExtension != null) {
                    INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                }
            }
            if (singleValueMetric != null) {
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, (LogEntry) null, (String) null, 6, (Object) null);
            }
            PrivacyManager.INSTANCE.updateDisableAdId(shouldDisableAdId());
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Error while validating config: " + e10.getMessage());
        }
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (boolIsReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean otEnabled() {
        Boolean enableOT;
        ConfigPayload configPayload = config;
        if (configPayload == null || (enableOT = configPayload.getEnableOT()) == null) {
            return true;
        }
        return enableOT.booleanValue();
    }

    public final List<Placement> placements() {
        return placements;
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        ConfigPayload configPayload = config;
        if (configPayload == null || (rtaDebugging = configPayload.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(String applicationId2) {
        t.f(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        if (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (signalsDisabled = configPayload.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateConfigExtension$vungle_ads_release(Context context, String ext) {
        t.f(context, "context");
        t.f(ext, "ext");
        configExt = ext;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m239updateConfigExtension$lambda1(m.b(o.SYNCHRONIZED, new ConfigManager$updateConfigExtension$$inlined$inject$1(context))).put(Cookie.CONFIG_EXTENSION, ext).apply();
    }

    public final boolean validateConfig$vungle_ads_release(ConfigPayload configPayload) {
        return ((configPayload != null ? configPayload.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(configPayload.getEndpoints()) || configPayload.getPlacements() == null) ? false : true;
    }

    public final boolean validateEndpoints$vungle_ads_release(ConfigPayload.Endpoints endpoints2) {
        boolean z10;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z10 = false;
        } else {
            z10 = true;
        }
        String riEndpoint = endpoints2 != null ? endpoints2.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint == null || errorLogsEndpoint.length() == 0) {
            Logger.Companion.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z10;
    }

    public final void updateCachedConfig(ConfigPayload config2, FilePreferences filePreferences) {
        t.f(config2, "config");
        t.f(filePreferences, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                t.u("applicationId");
                str = null;
            }
            filePreferences.put(Cookie.CONFIG_APP_ID, str);
            filePreferences.put(Cookie.CONFIG_UPDATE_TIME, System.currentTimeMillis());
            kotlinx.serialization.json.b json = getJson();
            fe.d<Object> dVarB = u.b(json.a(), i0.j(ConfigPayload.class));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(Cookie.CONFIG_RESPONSE, json.b(dVarB, config2));
            filePreferences.apply();
        } catch (Exception e10) {
            Logger.Companion.e(TAG, RHIpdOnfgiYkEj.SsP + e10.getMessage() + " for updating cached config");
        }
    }
}
