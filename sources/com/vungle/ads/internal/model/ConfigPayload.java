package com.vungle.ads.internal.model;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fe.d;
import fe.l;
import he.f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.b2;
import je.f1;
import je.i;
import je.q2;
import je.u0;
import je.v2;
import kotlin.collections.n0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class ConfigPayload {
    public static final Companion Companion = new Companion(null);
    private AutoRedirect autoRedirect;
    private final CleverCache cleverCache;
    private final String configExtension;
    private Long configLastValidatedTimestamp;
    private final ConfigSettings configSettings;
    private final Boolean disableAdId;
    private Boolean enableOT;
    private final Endpoints endpoints;
    private final Boolean fpdEnabled;
    private final Boolean isReportIncentivizedEnabled;
    private final LogMetricsSettings logMetricsSettings;
    private final List<Placement> placements;
    private final Boolean rtaDebugging;
    private final Integer sessionTimeout;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final UserPrivacy userPrivacy;
    private final Boolean waitForConnectivityForTPAT;

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @l
    public static final class AutoRedirect {
        public static final Companion Companion = new Companion(null);
        private final Long afterClickDuration;
        private final Boolean allowAutoRedirect;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<AutoRedirect> serializer() {
                return ConfigPayload$AutoRedirect$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoRedirect() {
            this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AutoRedirect copy$default(AutoRedirect autoRedirect, Boolean bool, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = autoRedirect.allowAutoRedirect;
            }
            if ((i10 & 2) != 0) {
                l10 = autoRedirect.afterClickDuration;
            }
            return autoRedirect.copy(bool, l10);
        }

        public static final void write$Self(AutoRedirect self, ie.d output, f serialDesc) {
            Long l10;
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || !t.a(self.allowAutoRedirect, Boolean.FALSE)) {
                output.o(serialDesc, 0, i.f20933a, self.allowAutoRedirect);
            }
            if (output.w(serialDesc, 1) || (l10 = self.afterClickDuration) == null || l10.longValue() != Long.MAX_VALUE) {
                output.o(serialDesc, 1, f1.f20900a, self.afterClickDuration);
            }
        }

        public final Boolean component1() {
            return this.allowAutoRedirect;
        }

        public final Long component2() {
            return this.afterClickDuration;
        }

        public final AutoRedirect copy(Boolean bool, Long l10) {
            return new AutoRedirect(bool, l10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoRedirect)) {
                return false;
            }
            AutoRedirect autoRedirect = (AutoRedirect) obj;
            return t.a(this.allowAutoRedirect, autoRedirect.allowAutoRedirect) && t.a(this.afterClickDuration, autoRedirect.afterClickDuration);
        }

        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        public int hashCode() {
            Boolean bool = this.allowAutoRedirect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.afterClickDuration;
            return iHashCode + (l10 != null ? l10.hashCode() : 0);
        }

        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }

        public /* synthetic */ AutoRedirect(int i10, Boolean bool, Long l10, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, ConfigPayload$AutoRedirect$$serializer.INSTANCE.getDescriptor());
            }
            this.allowAutoRedirect = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.afterClickDuration = Long.MAX_VALUE;
            } else {
                this.afterClickDuration = l10;
            }
        }

        public AutoRedirect(Boolean bool, Long l10) {
            this.allowAutoRedirect = bool;
            this.afterClickDuration = l10;
        }

        public /* synthetic */ AutoRedirect(Boolean bool, Long l10, int i10, k kVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Long.MAX_VALUE : l10);
        }

        public static /* synthetic */ void getAfterClickDuration$annotations() {
        }

        public static /* synthetic */ void getAllowAutoRedirect$annotations() {
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @l
    public static final class CleverCache {
        public static final Companion Companion = new Companion(null);
        private final Integer diskPercentage;
        private final Long diskSize;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<CleverCache> serializer() {
                return ConfigPayload$CleverCache$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CleverCache() {
            this((Long) null, (Integer) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Long l10, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = cleverCache.diskSize;
            }
            if ((i10 & 2) != 0) {
                num = cleverCache.diskPercentage;
            }
            return cleverCache.copy(l10, num);
        }

        public static final void write$Self(CleverCache self, ie.d output, f serialDesc) {
            Long l10;
            Integer num;
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || (l10 = self.diskSize) == null || l10.longValue() != 1000) {
                output.o(serialDesc, 0, f1.f20900a, self.diskSize);
            }
            if (output.w(serialDesc, 1) || (num = self.diskPercentage) == null || num.intValue() != 3) {
                output.o(serialDesc, 1, u0.f21014a, self.diskPercentage);
            }
        }

        public final Long component1() {
            return this.diskSize;
        }

        public final Integer component2() {
            return this.diskPercentage;
        }

        public final CleverCache copy(Long l10, Integer num) {
            return new CleverCache(l10, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CleverCache)) {
                return false;
            }
            CleverCache cleverCache = (CleverCache) obj;
            return t.a(this.diskSize, cleverCache.diskSize) && t.a(this.diskPercentage, cleverCache.diskPercentage);
        }

        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final Long getDiskSize() {
            return this.diskSize;
        }

        public int hashCode() {
            Long l10 = this.diskSize;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Integer num = this.diskPercentage;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CleverCache(diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }

        public /* synthetic */ CleverCache(int i10, Long l10, Integer num, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, ConfigPayload$CleverCache$$serializer.INSTANCE.getDescriptor());
            }
            this.diskSize = (i10 & 1) == 0 ? 1000L : l10;
            if ((i10 & 2) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public CleverCache(Long l10, Integer num) {
            this.diskSize = l10;
            this.diskPercentage = num;
        }

        public /* synthetic */ CleverCache(Long l10, Integer num, int i10, k kVar) {
            this((i10 & 1) != 0 ? 1000L : l10, (i10 & 2) != 0 ? 3 : num);
        }

        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        public static /* synthetic */ void getDiskSize$annotations() {
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<ConfigPayload> serializer() {
            return ConfigPayload$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @l
    public static final class ConfigSettings {
        public static final Companion Companion = new Companion(null);
        private final Long refreshTime;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<ConfigSettings> serializer() {
                return ConfigPayload$ConfigSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ConfigSettings() {
            this((Long) null, 1, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = configSettings.refreshTime;
            }
            return configSettings.copy(l10);
        }

        public static final void write$Self(ConfigSettings self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            boolean z10 = true;
            if (!output.w(serialDesc, 0) && self.refreshTime == null) {
                z10 = false;
            }
            if (z10) {
                output.o(serialDesc, 0, f1.f20900a, self.refreshTime);
            }
        }

        public final Long component1() {
            return this.refreshTime;
        }

        public final ConfigSettings copy(Long l10) {
            return new ConfigSettings(l10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigSettings) && t.a(this.refreshTime, ((ConfigSettings) obj).refreshTime);
        }

        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            Long l10 = this.refreshTime;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        public /* synthetic */ ConfigSettings(int i10, Long l10, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, ConfigPayload$ConfigSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l10;
            }
        }

        public ConfigSettings(Long l10) {
            this.refreshTime = l10;
        }

        public /* synthetic */ ConfigSettings(Long l10, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : l10);
        }

        public static /* synthetic */ void getRefreshTime$annotations() {
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @l
    public static final class Endpoints {
        public static final Companion Companion = new Companion(null);
        private final String adsEndpoint;
        private final String csbEndpoint;
        private final String errorLogsEndpoint;
        private final String metricsEndpoint;
        private final String riEndpoint;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<Endpoints> serializer() {
                return ConfigPayload$Endpoints$$serializer.INSTANCE;
            }
        }

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (k) null);
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = endpoints.adsEndpoint;
            }
            if ((i10 & 2) != 0) {
                str2 = endpoints.riEndpoint;
            }
            String str6 = str2;
            if ((i10 & 4) != 0) {
                str3 = endpoints.errorLogsEndpoint;
            }
            String str7 = str3;
            if ((i10 & 8) != 0) {
                str4 = endpoints.metricsEndpoint;
            }
            String str8 = str4;
            if ((i10 & 16) != 0) {
                str5 = endpoints.csbEndpoint;
            }
            return endpoints.copy(str, str6, str7, str8, str5);
        }

        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        public static /* synthetic */ void getCsbEndpoint$annotations() {
        }

        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        public static /* synthetic */ void getRiEndpoint$annotations() {
        }

        public static final void write$Self(Endpoints self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.adsEndpoint != null) {
                output.o(serialDesc, 0, v2.f21024a, self.adsEndpoint);
            }
            if (output.w(serialDesc, 1) || self.riEndpoint != null) {
                output.o(serialDesc, 1, v2.f21024a, self.riEndpoint);
            }
            if (output.w(serialDesc, 2) || self.errorLogsEndpoint != null) {
                output.o(serialDesc, 2, v2.f21024a, self.errorLogsEndpoint);
            }
            if (output.w(serialDesc, 3) || self.metricsEndpoint != null) {
                output.o(serialDesc, 3, v2.f21024a, self.metricsEndpoint);
            }
            if (output.w(serialDesc, 4) || self.csbEndpoint != null) {
                output.o(serialDesc, 4, v2.f21024a, self.csbEndpoint);
            }
        }

        public final String component1() {
            return this.adsEndpoint;
        }

        public final String component2() {
            return this.riEndpoint;
        }

        public final String component3() {
            return this.errorLogsEndpoint;
        }

        public final String component4() {
            return this.metricsEndpoint;
        }

        public final String component5() {
            return this.csbEndpoint;
        }

        public final Endpoints copy(String str, String str2, String str3, String str4, String str5) {
            return new Endpoints(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) obj;
            return t.a(this.adsEndpoint, endpoints.adsEndpoint) && t.a(this.riEndpoint, endpoints.riEndpoint) && t.a(this.errorLogsEndpoint, endpoints.errorLogsEndpoint) && t.a(this.metricsEndpoint, endpoints.metricsEndpoint) && t.a(this.csbEndpoint, endpoints.csbEndpoint);
        }

        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        public final String getCsbEndpoint() {
            return this.csbEndpoint;
        }

        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.csbEndpoint;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public /* synthetic */ Endpoints(int i10, String str, String str2, String str3, String str4, String str5, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, ConfigPayload$Endpoints$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i10 & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i10 & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i10 & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
            if ((i10 & 16) == 0) {
                this.csbEndpoint = null;
            } else {
                this.csbEndpoint = str5;
            }
        }

        public String toString() {
            return "Endpoints(adsEndpoint=" + this.adsEndpoint + ", riEndpoint=" + this.riEndpoint + ", errorLogsEndpoint=" + this.errorLogsEndpoint + ", metricsEndpoint=" + this.metricsEndpoint + edUJlCZxhVnO.aitwYCdWZb + this.csbEndpoint + ')';
        }

        public Endpoints(String str, String str2, String str3, String str4, String str5) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
            this.csbEndpoint = str5;
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, String str5, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @l
    public static final class GDPRSettings {
        public static final Companion Companion = new Companion(null);
        private final String buttonAccept;
        private final String buttonDeny;
        private final String consentMessage;
        private final String consentMessageVersion;
        private final String consentTitle;
        private final Boolean isCountryDataProtected;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<GDPRSettings> serializer() {
                return ConfigPayload$GDPRSettings$$serializer.INSTANCE;
            }
        }

        public GDPRSettings() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (k) null);
        }

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = gDPRSettings.isCountryDataProtected;
            }
            if ((i10 & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            String str6 = str;
            if ((i10 & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            String str7 = str2;
            if ((i10 & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            String str8 = str3;
            if ((i10 & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            String str9 = str4;
            if ((i10 & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            return gDPRSettings.copy(bool, str6, str7, str8, str9, str5);
        }

        public static final void write$Self(GDPRSettings self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.isCountryDataProtected != null) {
                output.o(serialDesc, 0, i.f20933a, self.isCountryDataProtected);
            }
            if (output.w(serialDesc, 1) || self.consentTitle != null) {
                output.o(serialDesc, 1, v2.f21024a, self.consentTitle);
            }
            if (output.w(serialDesc, 2) || self.consentMessage != null) {
                output.o(serialDesc, 2, v2.f21024a, self.consentMessage);
            }
            if (output.w(serialDesc, 3) || self.consentMessageVersion != null) {
                output.o(serialDesc, 3, v2.f21024a, self.consentMessageVersion);
            }
            if (output.w(serialDesc, 4) || self.buttonAccept != null) {
                output.o(serialDesc, 4, v2.f21024a, self.buttonAccept);
            }
            if (output.w(serialDesc, 5) || self.buttonDeny != null) {
                output.o(serialDesc, 5, v2.f21024a, self.buttonDeny);
            }
        }

        public final Boolean component1() {
            return this.isCountryDataProtected;
        }

        public final String component2() {
            return this.consentTitle;
        }

        public final String component3() {
            return this.consentMessage;
        }

        public final String component4() {
            return this.consentMessageVersion;
        }

        public final String component5() {
            return this.buttonAccept;
        }

        public final String component6() {
            return this.buttonDeny;
        }

        public final GDPRSettings copy(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            return new GDPRSettings(bool, str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) obj;
            return t.a(this.isCountryDataProtected, gDPRSettings.isCountryDataProtected) && t.a(this.consentTitle, gDPRSettings.consentTitle) && t.a(this.consentMessage, gDPRSettings.consentMessage) && t.a(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && t.a(this.buttonAccept, gDPRSettings.buttonAccept) && t.a(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final String getConsentMessage() {
            return this.consentMessage;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        public String toString() {
            return "GDPRSettings(isCountryDataProtected=" + this.isCountryDataProtected + ", consentTitle=" + this.consentTitle + ", consentMessage=" + this.consentMessage + ", consentMessageVersion=" + this.consentMessageVersion + ", buttonAccept=" + this.buttonAccept + ", buttonDeny=" + this.buttonDeny + ')';
        }

        public /* synthetic */ GDPRSettings(int i10, Boolean bool, String str, String str2, String str3, String str4, String str5, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i10 & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i10 & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i10 & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i10 & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i10 & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public /* synthetic */ GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
        }

        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @l
    public static final class IABSettings {
        public static final Companion Companion = new Companion(null);
        private final Integer tcfStatus;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<IABSettings> serializer() {
                return ConfigPayload$IABSettings$$serializer.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public enum TcfStatus {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);

            public static final Companion Companion = new Companion(null);
            private static final Map<Integer, TcfStatus> rawValueMap;
            private final int rawValue;

            /* JADX INFO: compiled from: ConfigPayload.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final TcfStatus fromRawValue(Integer num) {
                    return (TcfStatus) TcfStatus.rawValueMap.get(num);
                }
            }

            static {
                TcfStatus[] tcfStatusArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(od.k.d(n0.e(tcfStatusArrValues.length), 16));
                for (TcfStatus tcfStatus : tcfStatusArrValues) {
                    linkedHashMap.put(Integer.valueOf(tcfStatus.rawValue), tcfStatus);
                }
                rawValueMap = linkedHashMap;
            }

            TcfStatus(int i10) {
                this.rawValue = i10;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IABSettings() {
            this((Integer) null, 1, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ IABSettings copy$default(IABSettings iABSettings, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = iABSettings.tcfStatus;
            }
            return iABSettings.copy(num);
        }

        public static final void write$Self(IABSettings self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            boolean z10 = true;
            if (!output.w(serialDesc, 0) && self.tcfStatus == null) {
                z10 = false;
            }
            if (z10) {
                output.o(serialDesc, 0, u0.f21014a, self.tcfStatus);
            }
        }

        public final Integer component1() {
            return this.tcfStatus;
        }

        public final IABSettings copy(Integer num) {
            return new IABSettings(num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IABSettings) && t.a(this.tcfStatus, ((IABSettings) obj).tcfStatus);
        }

        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }

        public /* synthetic */ IABSettings(int i10, Integer num, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, ConfigPayload$IABSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public IABSettings(Integer num) {
            this.tcfStatus = num;
        }

        public /* synthetic */ IABSettings(Integer num, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : num);
        }

        public static /* synthetic */ void getTcfStatus$annotations() {
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @l
    public static final class LogMetricsSettings {
        public static final Companion Companion = new Companion(null);
        private final Integer errorLogLevel;
        private final Boolean metricsEnabled;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<LogMetricsSettings> serializer() {
                return ConfigPayload$LogMetricsSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LogMetricsSettings() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, Integer num, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = logMetricsSettings.errorLogLevel;
            }
            if ((i10 & 2) != 0) {
                bool = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(num, bool);
        }

        public static final void write$Self(LogMetricsSettings self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.errorLogLevel != null) {
                output.o(serialDesc, 0, u0.f21014a, self.errorLogLevel);
            }
            if (output.w(serialDesc, 1) || self.metricsEnabled != null) {
                output.o(serialDesc, 1, i.f20933a, self.metricsEnabled);
            }
        }

        public final Integer component1() {
            return this.errorLogLevel;
        }

        public final Boolean component2() {
            return this.metricsEnabled;
        }

        public final LogMetricsSettings copy(Integer num, Boolean bool) {
            return new LogMetricsSettings(num, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) obj;
            return t.a(this.errorLogLevel, logMetricsSettings.errorLogLevel) && t.a(this.metricsEnabled, logMetricsSettings.metricsEnabled);
        }

        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        public /* synthetic */ LogMetricsSettings(int i10, Integer num, Boolean bool, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i10 & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public LogMetricsSettings(Integer num, Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public /* synthetic */ LogMetricsSettings(Integer num, Boolean bool, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool);
        }

        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @l
    public static final class UserPrivacy {
        public static final Companion Companion = new Companion(null);
        private final GDPRSettings gdpr;
        private final IABSettings iab;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<UserPrivacy> serializer() {
                return ConfigPayload$UserPrivacy$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserPrivacy() {
            this((GDPRSettings) null, (IABSettings) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ UserPrivacy copy$default(UserPrivacy userPrivacy, GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gDPRSettings = userPrivacy.gdpr;
            }
            if ((i10 & 2) != 0) {
                iABSettings = userPrivacy.iab;
            }
            return userPrivacy.copy(gDPRSettings, iABSettings);
        }

        public static final void write$Self(UserPrivacy self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.gdpr != null) {
                output.o(serialDesc, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, self.gdpr);
            }
            if (output.w(serialDesc, 1) || self.iab != null) {
                output.o(serialDesc, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, self.iab);
            }
        }

        public final GDPRSettings component1() {
            return this.gdpr;
        }

        public final IABSettings component2() {
            return this.iab;
        }

        public final UserPrivacy copy(GDPRSettings gDPRSettings, IABSettings iABSettings) {
            return new UserPrivacy(gDPRSettings, iABSettings);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserPrivacy)) {
                return false;
            }
            UserPrivacy userPrivacy = (UserPrivacy) obj;
            return t.a(this.gdpr, userPrivacy.gdpr) && t.a(this.iab, userPrivacy.iab);
        }

        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        public final IABSettings getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPRSettings gDPRSettings = this.gdpr;
            int iHashCode = (gDPRSettings == null ? 0 : gDPRSettings.hashCode()) * 31;
            IABSettings iABSettings = this.iab;
            return iHashCode + (iABSettings != null ? iABSettings.hashCode() : 0);
        }

        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        public /* synthetic */ UserPrivacy(int i10, GDPRSettings gDPRSettings, IABSettings iABSettings, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, ConfigPayload$UserPrivacy$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gDPRSettings;
            }
            if ((i10 & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = iABSettings;
            }
        }

        public UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings) {
            this.gdpr = gDPRSettings;
            this.iab = iABSettings;
        }

        public /* synthetic */ UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : gDPRSettings, (i10 & 2) != 0 ? null : iABSettings);
        }

        public static /* synthetic */ void getGdpr$annotations() {
        }

        public static /* synthetic */ void getIab$annotations() {
        }
    }

    public ConfigPayload() {
        this((CleverCache) null, (ConfigSettings) null, (Endpoints) null, (LogMetricsSettings) null, (List) null, (UserPrivacy) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (AutoRedirect) null, (Boolean) null, 262143, (k) null);
    }

    public static final void write$Self(ConfigPayload self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || self.cleverCache != null) {
            output.o(serialDesc, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, self.cleverCache);
        }
        if (output.w(serialDesc, 1) || self.configSettings != null) {
            output.o(serialDesc, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, self.configSettings);
        }
        if (output.w(serialDesc, 2) || self.endpoints != null) {
            output.o(serialDesc, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, self.endpoints);
        }
        if (output.w(serialDesc, 3) || self.logMetricsSettings != null) {
            output.o(serialDesc, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, self.logMetricsSettings);
        }
        if (output.w(serialDesc, 4) || self.placements != null) {
            output.o(serialDesc, 4, new je.f(Placement$$serializer.INSTANCE), self.placements);
        }
        if (output.w(serialDesc, 5) || self.userPrivacy != null) {
            output.o(serialDesc, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, self.userPrivacy);
        }
        if (output.w(serialDesc, 6) || self.configExtension != null) {
            output.o(serialDesc, 6, v2.f21024a, self.configExtension);
        }
        if (output.w(serialDesc, 7) || !t.a(self.disableAdId, Boolean.TRUE)) {
            output.o(serialDesc, 7, i.f20933a, self.disableAdId);
        }
        if (output.w(serialDesc, 8) || self.isReportIncentivizedEnabled != null) {
            output.o(serialDesc, 8, i.f20933a, self.isReportIncentivizedEnabled);
        }
        if (output.w(serialDesc, 9) || self.sessionTimeout != null) {
            output.o(serialDesc, 9, u0.f21014a, self.sessionTimeout);
        }
        if (output.w(serialDesc, 10) || self.waitForConnectivityForTPAT != null) {
            output.o(serialDesc, 10, i.f20933a, self.waitForConnectivityForTPAT);
        }
        if (output.w(serialDesc, 11) || self.signalSessionTimeout != null) {
            output.o(serialDesc, 11, u0.f21014a, self.signalSessionTimeout);
        }
        if (output.w(serialDesc, 12) || self.signalsDisabled != null) {
            output.o(serialDesc, 12, i.f20933a, self.signalsDisabled);
        }
        if (output.w(serialDesc, 13) || self.fpdEnabled != null) {
            output.o(serialDesc, 13, i.f20933a, self.fpdEnabled);
        }
        if (output.w(serialDesc, 14) || self.rtaDebugging != null) {
            output.o(serialDesc, 14, i.f20933a, self.rtaDebugging);
        }
        if (output.w(serialDesc, 15) || self.configLastValidatedTimestamp != null) {
            output.o(serialDesc, 15, f1.f20900a, self.configLastValidatedTimestamp);
        }
        if (output.w(serialDesc, 16) || self.autoRedirect != null) {
            output.o(serialDesc, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, self.autoRedirect);
        }
        if (output.w(serialDesc, 17) || self.enableOT != null) {
            output.o(serialDesc, 17, i.f20933a, self.enableOT);
        }
    }

    public final CleverCache component1() {
        return this.cleverCache;
    }

    public final Integer component10() {
        return this.sessionTimeout;
    }

    public final Boolean component11() {
        return this.waitForConnectivityForTPAT;
    }

    public final Integer component12() {
        return this.signalSessionTimeout;
    }

    public final Boolean component13() {
        return this.signalsDisabled;
    }

    public final Boolean component14() {
        return this.fpdEnabled;
    }

    public final Boolean component15() {
        return this.rtaDebugging;
    }

    public final Long component16() {
        return this.configLastValidatedTimestamp;
    }

    public final AutoRedirect component17() {
        return this.autoRedirect;
    }

    public final Boolean component18() {
        return this.enableOT;
    }

    public final ConfigSettings component2() {
        return this.configSettings;
    }

    public final Endpoints component3() {
        return this.endpoints;
    }

    public final LogMetricsSettings component4() {
        return this.logMetricsSettings;
    }

    public final List<Placement> component5() {
        return this.placements;
    }

    public final UserPrivacy component6() {
        return this.userPrivacy;
    }

    public final String component7() {
        return this.configExtension;
    }

    public final Boolean component8() {
        return this.disableAdId;
    }

    public final Boolean component9() {
        return this.isReportIncentivizedEnabled;
    }

    public final ConfigPayload copy(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7) {
        return new ConfigPayload(cleverCache, configSettings, endpoints, logMetricsSettings, list, userPrivacy, str, bool, bool2, num, bool3, num2, bool4, bool5, bool6, l10, autoRedirect, bool7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) obj;
        return t.a(this.cleverCache, configPayload.cleverCache) && t.a(this.configSettings, configPayload.configSettings) && t.a(this.endpoints, configPayload.endpoints) && t.a(this.logMetricsSettings, configPayload.logMetricsSettings) && t.a(this.placements, configPayload.placements) && t.a(this.userPrivacy, configPayload.userPrivacy) && t.a(this.configExtension, configPayload.configExtension) && t.a(this.disableAdId, configPayload.disableAdId) && t.a(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && t.a(this.sessionTimeout, configPayload.sessionTimeout) && t.a(this.waitForConnectivityForTPAT, configPayload.waitForConnectivityForTPAT) && t.a(this.signalSessionTimeout, configPayload.signalSessionTimeout) && t.a(this.signalsDisabled, configPayload.signalsDisabled) && t.a(this.fpdEnabled, configPayload.fpdEnabled) && t.a(this.rtaDebugging, configPayload.rtaDebugging) && t.a(this.configLastValidatedTimestamp, configPayload.configLastValidatedTimestamp) && t.a(this.autoRedirect, configPayload.autoRedirect) && t.a(this.enableOT, configPayload.enableOT);
    }

    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<Placement> getPlacements() {
        return this.placements;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        CleverCache cleverCache = this.cleverCache;
        int iHashCode = (cleverCache == null ? 0 : cleverCache.hashCode()) * 31;
        ConfigSettings configSettings = this.configSettings;
        int iHashCode2 = (iHashCode + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        Endpoints endpoints = this.endpoints;
        int iHashCode3 = (iHashCode2 + (endpoints == null ? 0 : endpoints.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        List<Placement> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        UserPrivacy userPrivacy = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (userPrivacy == null ? 0 : userPrivacy.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fpdEnabled;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.rtaDebugging;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l10 = this.configLastValidatedTimestamp;
        int iHashCode16 = (iHashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
        AutoRedirect autoRedirect = this.autoRedirect;
        int iHashCode17 = (iHashCode16 + (autoRedirect == null ? 0 : autoRedirect.hashCode())) * 31;
        Boolean bool7 = this.enableOT;
        return iHashCode17 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(AutoRedirect autoRedirect) {
        this.autoRedirect = autoRedirect;
    }

    public final void setConfigLastValidatedTimestamp(Long l10) {
        this.configLastValidatedTimestamp = l10;
    }

    public final void setEnableOT(Boolean bool) {
        this.enableOT = bool;
    }

    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ", enableOT=" + this.enableOT + ')';
    }

    public /* synthetic */ ConfigPayload(int i10, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, ConfigPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
        if ((i10 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = configSettings;
        }
        if ((i10 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i10 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i10 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = userPrivacy;
        }
        if ((i10 & 64) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        this.disableAdId = (i10 & 128) == 0 ? Boolean.TRUE : bool;
        if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i10 & 512) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i10 & 1024) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i10 & 2048) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i10 & 4096) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
        if ((i10 & 8192) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool5;
        }
        if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool6;
        }
        if ((32768 & i10) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l10;
        }
        if ((65536 & i10) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = autoRedirect;
        }
        if ((i10 & 131072) == 0) {
            this.enableOT = null;
        } else {
            this.enableOT = bool7;
        }
    }

    public ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7) {
        this.cleverCache = cleverCache;
        this.configSettings = configSettings;
        this.endpoints = endpoints;
        this.logMetricsSettings = logMetricsSettings;
        this.placements = list;
        this.userPrivacy = userPrivacy;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.signalsDisabled = bool4;
        this.fpdEnabled = bool5;
        this.rtaDebugging = bool6;
        this.configLastValidatedTimestamp = l10;
        this.autoRedirect = autoRedirect;
        this.enableOT = bool7;
    }

    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getEnableOT$annotations() {
    }

    public static /* synthetic */ void getEndpoints$annotations() {
    }

    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getPlacements$annotations() {
    }

    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    public /* synthetic */ ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : cleverCache, (i10 & 2) != 0 ? null : configSettings, (i10 & 4) != 0 ? null : endpoints, (i10 & 8) != 0 ? null : logMetricsSettings, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : userPrivacy, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Boolean.TRUE : bool, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : bool2, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : bool3, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : bool4, (i10 & 8192) != 0 ? null : bool5, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool6, (i10 & 32768) != 0 ? null : l10, (i10 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0 ? null : autoRedirect, (i10 & 131072) != 0 ? null : bool7);
    }
}
