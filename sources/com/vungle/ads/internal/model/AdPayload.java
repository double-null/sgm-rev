package com.vungle.ads.internal.model;

import c2.YDwL.tFQWuE;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import fe.b;
import fe.d;
import fe.l;
import ge.a;
import he.f;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import je.b0;
import je.b2;
import je.f1;
import je.i;
import je.q2;
import je.u0;
import je.v2;
import je.z0;
import kotlin.collections.u;
import kotlin.collections.x;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.d0;
import kotlinx.serialization.json.e0;
import kotlinx.serialization.json.j;
import kotlinx.serialization.json.j0;
import pd.c;
import rd.c0;
import rd.f0;
import rd.o;
import sc.NfwM.XDucgbzInpQa;
import wc.q;
import wc.r;
import wc.s;
import wc.w;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class AdPayload {
    public static final Companion Companion = new Companion(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_VM = "vmURL";
    private static final String TAG = "AdPayload";
    private static final String UNKNOWN = "unknown";
    private AdConfig adConfig;
    private final List<PlacementAdUnit> ads;
    private boolean assetsFullyDownloaded;
    private final ConfigPayload config;
    private Long expiryWindowStart;
    private Map<String, String> incentivizedTextSettings;
    private String indexFilePath;
    private LogEntry logEntry;
    private ConcurrentHashMap<String, String> mraidFiles;
    private final Map<String, AdAsset> partialDownloadAssets;

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class AdSizeInfo {
        public static final Companion Companion = new Companion(null);
        private final Integer height;
        private final Integer width;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<AdSizeInfo> serializer() {
                return AdPayload$AdSizeInfo$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdSizeInfo() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AdSizeInfo copy$default(AdSizeInfo adSizeInfo, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = adSizeInfo.width;
            }
            if ((i10 & 2) != 0) {
                num2 = adSizeInfo.height;
            }
            return adSizeInfo.copy(num, num2);
        }

        public static final void write$Self(AdSizeInfo self, ie.d output, f serialDesc) {
            Integer num;
            Integer num2;
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || (num = self.width) == null || num.intValue() != 0) {
                output.o(serialDesc, 0, u0.f21014a, self.width);
            }
            if (output.w(serialDesc, 1) || (num2 = self.height) == null || num2.intValue() != 0) {
                output.o(serialDesc, 1, u0.f21014a, self.height);
            }
        }

        public final Integer component1() {
            return this.width;
        }

        public final Integer component2() {
            return this.height;
        }

        public final AdSizeInfo copy(Integer num, Integer num2) {
            return new AdSizeInfo(num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdSizeInfo)) {
                return false;
            }
            AdSizeInfo adSizeInfo = (AdSizeInfo) obj;
            return t.a(this.width, adSizeInfo.width) && t.a(this.height, adSizeInfo.height);
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        public AdSizeInfo(Integer num, Integer num2) {
            this.width = num;
            this.height = num2;
        }

        public /* synthetic */ AdSizeInfo(int i10, Integer num, Integer num2, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$AdSizeInfo$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.width = 0;
            } else {
                this.width = num;
            }
            if ((i10 & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public /* synthetic */ AdSizeInfo(Integer num, Integer num2, int i10, k kVar) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class AdUnit {
        public static final Companion Companion = new Companion(null);
        private final Boolean adLoadOptimizationEnabled;
        private final String adMarketId;
        private final AdSizeInfo adSizeInfo;
        private final String adSource;
        private final String adType;
        private final String advAppId;
        private final Boolean clickCoordinatesEnabled;
        private final String creativeId;
        private final String deeplinkUrl;
        private final Integer errorCode;
        private final Integer expiry;
        private final Integer expiryDuration;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f13071id;
        private final String info;
        private final List<String> loadAdUrls;
        private final Integer maxDownloadRetryAttempts;
        private final String mediationName;
        private final List<String> notification;
        private final Boolean partialDownloadEnabled;
        private final Integer showClose;
        private final Integer showCloseIncentivized;
        private final Integer sleep;
        private final TemplateSettings templateSettings;
        private final String templateType;
        private final Map<String, List<String>> tpat;
        private final Boolean usePreloading;
        private final ViewAbility viewAbility;
        private final String vmURL;
        private final String vmVersion;
        private final WebViewSettings webViewSettings;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<AdUnit> serializer() {
                return AdPayload$AdUnit$$serializer.INSTANCE;
            }
        }

        public AdUnit() {
            this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (String) null, (List) null, (List) null, (ViewAbility) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (Integer) null, (Integer) null, (AdSizeInfo) null, (WebViewSettings) null, (Boolean) null, (Boolean) null, (Integer) null, 1073741823, (k) null);
        }

        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        public static /* synthetic */ void getAdSource$annotations() {
        }

        public static /* synthetic */ void getAdType$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getExpiry$annotations() {
        }

        public static /* synthetic */ void getExpiryDuration$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getInfo$annotations() {
        }

        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        public static /* synthetic */ void getMaxDownloadRetryAttempts$annotations() {
        }

        public static /* synthetic */ void getMediationName$annotations() {
        }

        public static /* synthetic */ void getNotification$annotations() {
        }

        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        public static /* synthetic */ void getShowClose$annotations() {
        }

        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        public static /* synthetic */ void getSleep$annotations() {
        }

        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @l(with = TpatSerializer.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        public static /* synthetic */ void getViewAbility$annotations() {
        }

        public static /* synthetic */ void getVmURL$annotations() {
        }

        public static /* synthetic */ void getVmVersion$annotations() {
        }

        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        public static final void write$Self(AdUnit self, ie.d output, f serialDesc) {
            Integer num;
            Integer num2;
            Integer num3;
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.f13071id != null) {
                output.o(serialDesc, 0, v2.f21024a, self.f13071id);
            }
            if (output.w(serialDesc, 1) || self.adType != null) {
                output.o(serialDesc, 1, v2.f21024a, self.adType);
            }
            if (output.w(serialDesc, 2) || self.adSource != null) {
                output.o(serialDesc, 2, v2.f21024a, self.adSource);
            }
            if (output.w(serialDesc, 3) || self.expiry != null) {
                output.o(serialDesc, 3, u0.f21014a, self.expiry);
            }
            if (output.w(serialDesc, 4) || self.expiryDuration != null) {
                output.o(serialDesc, 4, u0.f21014a, self.expiryDuration);
            }
            if (output.w(serialDesc, 5) || self.deeplinkUrl != null) {
                output.o(serialDesc, 5, v2.f21024a, self.deeplinkUrl);
            }
            if (output.w(serialDesc, 6) || self.clickCoordinatesEnabled != null) {
                output.o(serialDesc, 6, i.f20933a, self.clickCoordinatesEnabled);
            }
            if (output.w(serialDesc, 7) || self.adLoadOptimizationEnabled != null) {
                output.o(serialDesc, 7, i.f20933a, self.adLoadOptimizationEnabled);
            }
            if (output.w(serialDesc, 8) || self.mediationName != null) {
                output.o(serialDesc, 8, v2.f21024a, self.mediationName);
            }
            if (output.w(serialDesc, 9) || self.info != null) {
                output.o(serialDesc, 9, v2.f21024a, self.info);
            }
            if (output.w(serialDesc, 10) || self.sleep != null) {
                output.o(serialDesc, 10, u0.f21014a, self.sleep);
            }
            if (output.w(serialDesc, 11) || self.errorCode != null) {
                output.o(serialDesc, 11, u0.f21014a, self.errorCode);
            }
            if (output.w(serialDesc, 12) || self.tpat != null) {
                output.o(serialDesc, 12, TpatSerializer.INSTANCE, self.tpat);
            }
            if (output.w(serialDesc, 13) || self.vmURL != null) {
                output.o(serialDesc, 13, v2.f21024a, self.vmURL);
            }
            if (output.w(serialDesc, 14) || self.vmVersion != null) {
                output.o(serialDesc, 14, v2.f21024a, self.vmVersion);
            }
            if (output.w(serialDesc, 15) || self.adMarketId != null) {
                output.o(serialDesc, 15, v2.f21024a, self.adMarketId);
            }
            if (output.w(serialDesc, 16) || self.notification != null) {
                output.o(serialDesc, 16, new je.f(v2.f21024a), self.notification);
            }
            if (output.w(serialDesc, 17) || self.loadAdUrls != null) {
                output.o(serialDesc, 17, new je.f(v2.f21024a), self.loadAdUrls);
            }
            if (output.w(serialDesc, 18) || self.viewAbility != null) {
                output.o(serialDesc, 18, AdPayload$ViewAbility$$serializer.INSTANCE, self.viewAbility);
            }
            if (output.w(serialDesc, 19) || self.templateType != null) {
                output.o(serialDesc, 19, v2.f21024a, self.templateType);
            }
            if (output.w(serialDesc, 20) || self.templateSettings != null) {
                output.o(serialDesc, 20, AdPayload$TemplateSettings$$serializer.INSTANCE, self.templateSettings);
            }
            if (output.w(serialDesc, 21) || self.creativeId != null) {
                output.o(serialDesc, 21, v2.f21024a, self.creativeId);
            }
            if (output.w(serialDesc, 22) || self.advAppId != null) {
                output.o(serialDesc, 22, v2.f21024a, self.advAppId);
            }
            if (output.w(serialDesc, 23) || (num = self.showClose) == null || num.intValue() != 0) {
                output.o(serialDesc, 23, u0.f21014a, self.showClose);
            }
            if (output.w(serialDesc, 24) || (num2 = self.showCloseIncentivized) == null || num2.intValue() != 0) {
                output.o(serialDesc, 24, u0.f21014a, self.showCloseIncentivized);
            }
            if (output.w(serialDesc, 25) || self.adSizeInfo != null) {
                output.o(serialDesc, 25, AdPayload$AdSizeInfo$$serializer.INSTANCE, self.adSizeInfo);
            }
            if (output.w(serialDesc, 26) || self.webViewSettings != null) {
                output.o(serialDesc, 26, AdPayload$WebViewSettings$$serializer.INSTANCE, self.webViewSettings);
            }
            if (output.w(serialDesc, 27) || !t.a(self.usePreloading, Boolean.FALSE)) {
                output.o(serialDesc, 27, i.f20933a, self.usePreloading);
            }
            if (output.w(serialDesc, 28) || self.partialDownloadEnabled != null) {
                output.o(serialDesc, 28, i.f20933a, self.partialDownloadEnabled);
            }
            if (output.w(serialDesc, 29) || (num3 = self.maxDownloadRetryAttempts) == null || num3.intValue() != 0) {
                output.o(serialDesc, 29, u0.f21014a, self.maxDownloadRetryAttempts);
            }
        }

        public final String component1() {
            return this.f13071id;
        }

        public final String component10() {
            return this.info;
        }

        public final Integer component11() {
            return this.sleep;
        }

        public final Integer component12() {
            return this.errorCode;
        }

        public final Map<String, List<String>> component13() {
            return this.tpat;
        }

        public final String component14() {
            return this.vmURL;
        }

        public final String component15() {
            return this.vmVersion;
        }

        public final String component16() {
            return this.adMarketId;
        }

        public final List<String> component17() {
            return this.notification;
        }

        public final List<String> component18() {
            return this.loadAdUrls;
        }

        public final ViewAbility component19() {
            return this.viewAbility;
        }

        public final String component2() {
            return this.adType;
        }

        public final String component20() {
            return this.templateType;
        }

        public final TemplateSettings component21() {
            return this.templateSettings;
        }

        public final String component22() {
            return this.creativeId;
        }

        public final String component23() {
            return this.advAppId;
        }

        public final Integer component24() {
            return this.showClose;
        }

        public final Integer component25() {
            return this.showCloseIncentivized;
        }

        public final AdSizeInfo component26() {
            return this.adSizeInfo;
        }

        public final WebViewSettings component27() {
            return this.webViewSettings;
        }

        public final Boolean component28() {
            return this.usePreloading;
        }

        public final Boolean component29() {
            return this.partialDownloadEnabled;
        }

        public final String component3() {
            return this.adSource;
        }

        public final Integer component30() {
            return this.maxDownloadRetryAttempts;
        }

        public final Integer component4() {
            return this.expiry;
        }

        public final Integer component5() {
            return this.expiryDuration;
        }

        public final String component6() {
            return this.deeplinkUrl;
        }

        public final Boolean component7() {
            return this.clickCoordinatesEnabled;
        }

        public final Boolean component8() {
            return this.adLoadOptimizationEnabled;
        }

        public final String component9() {
            return this.mediationName;
        }

        public final AdUnit copy(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map<String, ? extends List<String>> map, String str7, String str8, String str9, List<String> list, List<String> list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7) {
            return new AdUnit(str, str2, str3, num, num2, str4, bool, bool2, str5, str6, num3, num4, map, str7, str8, str9, list, list2, viewAbility, str10, templateSettings, str11, str12, num5, num6, adSizeInfo, webViewSettings, bool3, bool4, num7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return false;
            }
            AdUnit adUnit = (AdUnit) obj;
            return t.a(this.f13071id, adUnit.f13071id) && t.a(this.adType, adUnit.adType) && t.a(this.adSource, adUnit.adSource) && t.a(this.expiry, adUnit.expiry) && t.a(this.expiryDuration, adUnit.expiryDuration) && t.a(this.deeplinkUrl, adUnit.deeplinkUrl) && t.a(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && t.a(this.adLoadOptimizationEnabled, adUnit.adLoadOptimizationEnabled) && t.a(this.mediationName, adUnit.mediationName) && t.a(this.info, adUnit.info) && t.a(this.sleep, adUnit.sleep) && t.a(this.errorCode, adUnit.errorCode) && t.a(this.tpat, adUnit.tpat) && t.a(this.vmURL, adUnit.vmURL) && t.a(this.vmVersion, adUnit.vmVersion) && t.a(this.adMarketId, adUnit.adMarketId) && t.a(this.notification, adUnit.notification) && t.a(this.loadAdUrls, adUnit.loadAdUrls) && t.a(this.viewAbility, adUnit.viewAbility) && t.a(this.templateType, adUnit.templateType) && t.a(this.templateSettings, adUnit.templateSettings) && t.a(this.creativeId, adUnit.creativeId) && t.a(this.advAppId, adUnit.advAppId) && t.a(this.showClose, adUnit.showClose) && t.a(this.showCloseIncentivized, adUnit.showCloseIncentivized) && t.a(this.adSizeInfo, adUnit.adSizeInfo) && t.a(this.webViewSettings, adUnit.webViewSettings) && t.a(this.usePreloading, adUnit.usePreloading) && t.a(this.partialDownloadEnabled, adUnit.partialDownloadEnabled) && t.a(this.maxDownloadRetryAttempts, adUnit.maxDownloadRetryAttempts);
        }

        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        public final String getAdSource() {
            return this.adSource;
        }

        public final String getAdType() {
            return this.adType;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Integer getExpiry() {
            return this.expiry;
        }

        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        public final String getId() {
            return this.f13071id;
        }

        public final String getInfo() {
            return this.info;
        }

        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        public final Integer getMaxDownloadRetryAttempts() {
            return this.maxDownloadRetryAttempts;
        }

        public final String getMediationName() {
            return this.mediationName;
        }

        public final List<String> getNotification() {
            return this.notification;
        }

        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        public final Integer getShowClose() {
            return this.showClose;
        }

        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        public final String getVmURL() {
            return this.vmURL;
        }

        public final String getVmVersion() {
            return this.vmVersion;
        }

        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public int hashCode() {
            String str = this.f13071id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryDuration;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.mediationName;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.info;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.sleep;
            int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.errorCode;
            int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.vmURL;
            int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.vmVersion;
            int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.adMarketId;
            int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ViewAbility viewAbility = this.viewAbility;
            int iHashCode19 = (iHashCode18 + (viewAbility == null ? 0 : viewAbility.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int iHashCode21 = (iHashCode20 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.creativeId;
            int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.advAppId;
            int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num5 = this.showClose;
            int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.showCloseIncentivized;
            int iHashCode25 = (iHashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
            AdSizeInfo adSizeInfo = this.adSizeInfo;
            int iHashCode26 = (iHashCode25 + (adSizeInfo == null ? 0 : adSizeInfo.hashCode())) * 31;
            WebViewSettings webViewSettings = this.webViewSettings;
            int iHashCode27 = (iHashCode26 + (webViewSettings == null ? 0 : webViewSettings.hashCode())) * 31;
            Boolean bool3 = this.usePreloading;
            int iHashCode28 = (iHashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.partialDownloadEnabled;
            int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Integer num7 = this.maxDownloadRetryAttempts;
            return iHashCode29 + (num7 != null ? num7.hashCode() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map<String, ? extends List<String>> map, String str7, String str8, String str9, List<String> list, List<String> list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7) {
            this.f13071id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.expiryDuration = num2;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num3;
            this.errorCode = num4;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = viewAbility;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num5;
            this.showCloseIncentivized = num6;
            this.adSizeInfo = adSizeInfo;
            this.webViewSettings = webViewSettings;
            this.usePreloading = bool3;
            this.partialDownloadEnabled = bool4;
            this.maxDownloadRetryAttempts = num7;
        }

        public String toString() {
            return "AdUnit(id=" + this.f13071id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", expiryDuration=" + this.expiryDuration + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + cTJaRZ.aUPPTaKvDCrCQ + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + XDucgbzInpQa.XXezrMesX + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", maxDownloadRetryAttempts=" + this.maxDownloadRetryAttempts + ')';
        }

        public /* synthetic */ AdUnit(int i10, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, @l(with = TpatSerializer.class) Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$AdUnit$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.f13071id = null;
            } else {
                this.f13071id = str;
            }
            if ((i10 & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i10 & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i10 & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i10 & 16) == 0) {
                this.expiryDuration = null;
            } else {
                this.expiryDuration = num2;
            }
            if ((i10 & 32) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i10 & 64) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i10 & 128) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i10 & 512) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i10 & 1024) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num3;
            }
            if ((i10 & 2048) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num4;
            }
            if ((i10 & 4096) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i10 & 8192) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((32768 & i10) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((65536 & i10) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((131072 & i10) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((262144 & i10) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = viewAbility;
            }
            if ((524288 & i10) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((1048576 & i10) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((2097152 & i10) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((4194304 & i10) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            if ((8388608 & i10) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num5;
            }
            if ((16777216 & i10) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num6;
            }
            if ((33554432 & i10) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = adSizeInfo;
            }
            if ((67108864 & i10) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = webViewSettings;
            }
            this.usePreloading = (134217728 & i10) == 0 ? Boolean.FALSE : bool3;
            if ((268435456 & i10) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool4;
            }
            if ((i10 & 536870912) == 0) {
                this.maxDownloadRetryAttempts = 0;
            } else {
                this.maxDownloadRetryAttempts = num7;
            }
        }

        public /* synthetic */ AdUnit(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool3, Boolean bool4, Integer num7, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : bool2, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : num3, (i10 & 2048) != 0 ? null : num4, (i10 & 4096) != 0 ? null : map, (i10 & 8192) != 0 ? null : str7, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str8, (i10 & 32768) != 0 ? null : str9, (i10 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0 ? null : list, (i10 & 131072) != 0 ? null : list2, (i10 & 262144) != 0 ? null : viewAbility, (i10 & 524288) != 0 ? null : str10, (i10 & 1048576) != 0 ? null : templateSettings, (i10 & 2097152) != 0 ? null : str11, (i10 & 4194304) != 0 ? null : str12, (i10 & 8388608) != 0 ? 0 : num5, (i10 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? 0 : num6, (i10 & 33554432) != 0 ? null : adSizeInfo, (i10 & 67108864) != 0 ? null : webViewSettings, (i10 & 134217728) != 0 ? Boolean.FALSE : bool3, (i10 & 268435456) != 0 ? null : bool4, (i10 & 536870912) != 0 ? 0 : num7);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class CSBResponse {
        public static final Companion Companion = new Companion(null);
        private final List<String> lurls;
        private final List<String> nurls;
        private final Double price;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<CSBResponse> serializer() {
                return AdPayload$CSBResponse$$serializer.INSTANCE;
            }
        }

        public CSBResponse() {
            this((Double) null, (List) null, (List) null, 7, (k) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CSBResponse copy$default(CSBResponse cSBResponse, Double d10, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = cSBResponse.price;
            }
            if ((i10 & 2) != 0) {
                list = cSBResponse.nurls;
            }
            if ((i10 & 4) != 0) {
                list2 = cSBResponse.lurls;
            }
            return cSBResponse.copy(d10, list, list2);
        }

        public static final void write$Self(CSBResponse self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.price != null) {
                output.o(serialDesc, 0, b0.f20867a, self.price);
            }
            if (output.w(serialDesc, 1) || self.nurls != null) {
                output.o(serialDesc, 1, new je.f(v2.f21024a), self.nurls);
            }
            if (output.w(serialDesc, 2) || self.lurls != null) {
                output.o(serialDesc, 2, new je.f(v2.f21024a), self.lurls);
            }
        }

        public final Double component1() {
            return this.price;
        }

        public final List<String> component2() {
            return this.nurls;
        }

        public final List<String> component3() {
            return this.lurls;
        }

        public final CSBResponse copy(Double d10, List<String> list, List<String> list2) {
            return new CSBResponse(d10, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CSBResponse)) {
                return false;
            }
            CSBResponse cSBResponse = (CSBResponse) obj;
            return t.a(this.price, cSBResponse.price) && t.a(this.nurls, cSBResponse.nurls) && t.a(this.lurls, cSBResponse.lurls);
        }

        public final List<String> getLurls() {
            return this.lurls;
        }

        public final List<String> getNurls() {
            return this.nurls;
        }

        public final Double getPrice() {
            return this.price;
        }

        public int hashCode() {
            Double d10 = this.price;
            int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            List<String> list = this.nurls;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.lurls;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            return "CSBResponse(price=" + this.price + ", nurls=" + this.nurls + ", lurls=" + this.lurls + ')';
        }

        public /* synthetic */ CSBResponse(int i10, Double d10, List list, List list2, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$CSBResponse$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.price = null;
            } else {
                this.price = d10;
            }
            if ((i10 & 2) == 0) {
                this.nurls = null;
            } else {
                this.nurls = list;
            }
            if ((i10 & 4) == 0) {
                this.lurls = null;
            } else {
                this.lurls = list2;
            }
        }

        public CSBResponse(Double d10, List<String> list, List<String> list2) {
            this.price = d10;
            this.nurls = list;
            this.lurls = list2;
        }

        public /* synthetic */ CSBResponse(Double d10, List list, List list2, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2);
        }

        public static /* synthetic */ void getLurls$annotations() {
        }

        public static /* synthetic */ void getNurls$annotations() {
        }

        public static /* synthetic */ void getPrice$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class CacheableReplacement {
        public static final Companion Companion = new Companion(null);
        private final Integer downloadPercent;
        private final String extension;
        private final String url;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<CacheableReplacement> serializer() {
                return AdPayload$CacheableReplacement$$serializer.INSTANCE;
            }
        }

        public CacheableReplacement() {
            this((String) null, (String) null, (Integer) null, 7, (k) null);
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i10 & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i10 & 4) != 0) {
                num = cacheableReplacement.downloadPercent;
            }
            return cacheableReplacement.copy(str, str2, num);
        }

        public static final void write$Self(CacheableReplacement self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.url != null) {
                output.o(serialDesc, 0, v2.f21024a, self.url);
            }
            if (output.w(serialDesc, 1) || self.extension != null) {
                output.o(serialDesc, 1, v2.f21024a, self.extension);
            }
            if (output.w(serialDesc, 2) || self.downloadPercent != null) {
                output.o(serialDesc, 2, u0.f21014a, self.downloadPercent);
            }
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.extension;
        }

        public final Integer component3() {
            return this.downloadPercent;
        }

        public final CacheableReplacement copy(String str, String str2, Integer num) {
            return new CacheableReplacement(str, str2, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) obj;
            return t.a(this.url, cacheableReplacement.url) && t.a(this.extension, cacheableReplacement.extension) && t.a(this.downloadPercent, cacheableReplacement.downloadPercent);
        }

        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        public final String getExtension() {
            return this.extension;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.downloadPercent;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", downloadPercent=" + this.downloadPercent + ')';
        }

        public /* synthetic */ CacheableReplacement(int i10, String str, String str2, Integer num, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$CacheableReplacement$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i10 & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i10 & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public CacheableReplacement(String str, String str2, Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, Integer num, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
        }

        public static /* synthetic */ void getDownloadPercent$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<AdPayload> serializer() {
            return AdPayload$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class PlacementAdUnit {
        public static final Companion Companion = new Companion(null);
        private final AdUnit adMarkup;
        private final CSBResponse csb;
        private final String placementReferenceId;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<PlacementAdUnit> serializer() {
                return AdPayload$PlacementAdUnit$$serializer.INSTANCE;
            }
        }

        public PlacementAdUnit() {
            this((String) null, (AdUnit) null, (CSBResponse) null, 7, (k) null);
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, AdUnit adUnit, CSBResponse cSBResponse, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i10 & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            if ((i10 & 4) != 0) {
                cSBResponse = placementAdUnit.csb;
            }
            return placementAdUnit.copy(str, adUnit, cSBResponse);
        }

        public static final void write$Self(PlacementAdUnit self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.placementReferenceId != null) {
                output.o(serialDesc, 0, v2.f21024a, self.placementReferenceId);
            }
            if (output.w(serialDesc, 1) || self.adMarkup != null) {
                output.o(serialDesc, 1, AdPayload$AdUnit$$serializer.INSTANCE, self.adMarkup);
            }
            if (output.w(serialDesc, 2) || self.csb != null) {
                output.o(serialDesc, 2, AdPayload$CSBResponse$$serializer.INSTANCE, self.csb);
            }
        }

        public final String component1() {
            return this.placementReferenceId;
        }

        public final AdUnit component2() {
            return this.adMarkup;
        }

        public final CSBResponse component3() {
            return this.csb;
        }

        public final PlacementAdUnit copy(String str, AdUnit adUnit, CSBResponse cSBResponse) {
            return new PlacementAdUnit(str, adUnit, cSBResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) obj;
            return t.a(this.placementReferenceId, placementAdUnit.placementReferenceId) && t.a(this.adMarkup, placementAdUnit.adMarkup) && t.a(this.csb, placementAdUnit.csb);
        }

        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        public final CSBResponse getCsb() {
            return this.csb;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdUnit adUnit = this.adMarkup;
            int iHashCode2 = (iHashCode + (adUnit == null ? 0 : adUnit.hashCode())) * 31;
            CSBResponse cSBResponse = this.csb;
            return iHashCode2 + (cSBResponse != null ? cSBResponse.hashCode() : 0);
        }

        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ", csb=" + this.csb + ')';
        }

        public /* synthetic */ PlacementAdUnit(int i10, String str, AdUnit adUnit, CSBResponse cSBResponse, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$PlacementAdUnit$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i10 & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
            if ((i10 & 4) == 0) {
                this.csb = null;
            } else {
                this.csb = cSBResponse;
            }
        }

        public PlacementAdUnit(String str, AdUnit adUnit, CSBResponse cSBResponse) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
            this.csb = cSBResponse;
        }

        public /* synthetic */ PlacementAdUnit(String str, AdUnit adUnit, CSBResponse cSBResponse, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : adUnit, (i10 & 4) != 0 ? null : cSBResponse);
        }

        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        public static /* synthetic */ void getCsb$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class TemplateSettings {
        public static final Companion Companion = new Companion(null);
        private final Map<String, CacheableReplacement> cacheableReplacements;
        private final Map<String, String> normalReplacements;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<TemplateSettings> serializer() {
                return AdPayload$TemplateSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateSettings() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i10 & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        public static final void write$Self(TemplateSettings self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.normalReplacements != null) {
                v2 v2Var = v2.f21024a;
                output.o(serialDesc, 0, new z0(v2Var, v2Var), self.normalReplacements);
            }
            if (output.w(serialDesc, 1) || self.cacheableReplacements != null) {
                output.o(serialDesc, 1, new z0(v2.f21024a, AdPayload$CacheableReplacement$$serializer.INSTANCE), self.cacheableReplacements);
            }
        }

        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        public final TemplateSettings copy(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            return new TemplateSettings(map, map2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) obj;
            return t.a(this.normalReplacements, templateSettings.normalReplacements) && t.a(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        public /* synthetic */ TemplateSettings(int i10, Map map, Map map2, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$TemplateSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i10 & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
        }

        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        public static /* synthetic */ void getNormalReplacements$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    public static final class TpatSerializer extends j0<Map<String, ? extends List<? extends String>>> {
        public static final TpatSerializer INSTANCE = new TpatSerializer();

        /* JADX WARN: Illegal instructions before constructor call */
        private TpatSerializer() {
            l0 l0Var = l0.f21527a;
            super(a.k(a.C(l0Var), a.h(a.C(l0Var))));
        }

        @Override // kotlinx.serialization.json.j0
        protected kotlinx.serialization.json.i transformDeserialize(kotlinx.serialization.json.i element) {
            t.f(element, "element");
            d0 d0VarJ = kotlinx.serialization.json.k.j(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, kotlinx.serialization.json.i> entry : d0VarJ.entrySet()) {
                if (!t.a(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new d0(linkedHashMap);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class ViewAbility {
        public static final Companion Companion = new Companion(null);
        private final ViewAbilityInfo om;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<ViewAbility> serializer() {
                return AdPayload$ViewAbility$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbility() {
            this((ViewAbilityInfo) null, 1, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbility copy$default(ViewAbility viewAbility, ViewAbilityInfo viewAbilityInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewAbilityInfo = viewAbility.om;
            }
            return viewAbility.copy(viewAbilityInfo);
        }

        public static final void write$Self(ViewAbility self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            boolean z10 = true;
            if (!output.w(serialDesc, 0) && self.om == null) {
                z10 = false;
            }
            if (z10) {
                output.o(serialDesc, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE, self.om);
            }
        }

        public final ViewAbilityInfo component1() {
            return this.om;
        }

        public final ViewAbility copy(ViewAbilityInfo viewAbilityInfo) {
            return new ViewAbility(viewAbilityInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewAbility) && t.a(this.om, ((ViewAbility) obj).om);
        }

        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public int hashCode() {
            ViewAbilityInfo viewAbilityInfo = this.om;
            if (viewAbilityInfo == null) {
                return 0;
            }
            return viewAbilityInfo.hashCode();
        }

        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        public /* synthetic */ ViewAbility(int i10, ViewAbilityInfo viewAbilityInfo, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$ViewAbility$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewAbilityInfo;
            }
        }

        public ViewAbility(ViewAbilityInfo viewAbilityInfo) {
            this.om = viewAbilityInfo;
        }

        public /* synthetic */ ViewAbility(ViewAbilityInfo viewAbilityInfo, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : viewAbilityInfo);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class ViewAbilityInfo {
        public static final Companion Companion = new Companion(null);
        private final String extraVast;
        private final Boolean isEnabled;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<ViewAbilityInfo> serializer() {
                return AdPayload$ViewAbilityInfo$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbilityInfo() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbilityInfo copy$default(ViewAbilityInfo viewAbilityInfo, Boolean bool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = viewAbilityInfo.isEnabled;
            }
            if ((i10 & 2) != 0) {
                str = viewAbilityInfo.extraVast;
            }
            return viewAbilityInfo.copy(bool, str);
        }

        public static final void write$Self(ViewAbilityInfo self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.isEnabled != null) {
                output.o(serialDesc, 0, i.f20933a, self.isEnabled);
            }
            if (output.w(serialDesc, 1) || self.extraVast != null) {
                output.o(serialDesc, 1, v2.f21024a, self.extraVast);
            }
        }

        public final Boolean component1() {
            return this.isEnabled;
        }

        public final String component2() {
            return this.extraVast;
        }

        public final ViewAbilityInfo copy(Boolean bool, String str) {
            return new ViewAbilityInfo(bool, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAbilityInfo)) {
                return false;
            }
            ViewAbilityInfo viewAbilityInfo = (ViewAbilityInfo) obj;
            return t.a(this.isEnabled, viewAbilityInfo.isEnabled) && t.a(this.extraVast, viewAbilityInfo.extraVast);
        }

        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        public /* synthetic */ ViewAbilityInfo(int i10, Boolean bool, String str, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i10 & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewAbilityInfo(Boolean bool, String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ ViewAbilityInfo(Boolean bool, String str, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ void getExtraVast$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @l
    public static final class WebViewSettings {
        public static final Companion Companion = new Companion(null);
        private final Boolean allowFileAccessFromFileUrls;
        private final Boolean allowUniversalAccessFromFileUrls;

        /* JADX INFO: compiled from: AdPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<WebViewSettings> serializer() {
                return AdPayload$WebViewSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewSettings() {
            this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (k) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ WebViewSettings copy$default(WebViewSettings webViewSettings, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = webViewSettings.allowFileAccessFromFileUrls;
            }
            if ((i10 & 2) != 0) {
                bool2 = webViewSettings.allowUniversalAccessFromFileUrls;
            }
            return webViewSettings.copy(bool, bool2);
        }

        public static final void write$Self(WebViewSettings self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.allowFileAccessFromFileUrls != null) {
                output.o(serialDesc, 0, i.f20933a, self.allowFileAccessFromFileUrls);
            }
            if (output.w(serialDesc, 1) || self.allowUniversalAccessFromFileUrls != null) {
                output.o(serialDesc, 1, i.f20933a, self.allowUniversalAccessFromFileUrls);
            }
        }

        public final Boolean component1() {
            return this.allowFileAccessFromFileUrls;
        }

        public final Boolean component2() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public final WebViewSettings copy(Boolean bool, Boolean bool2) {
            return new WebViewSettings(bool, bool2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewSettings)) {
                return false;
            }
            WebViewSettings webViewSettings = (WebViewSettings) obj;
            return t.a(this.allowFileAccessFromFileUrls, webViewSettings.allowFileAccessFromFileUrls) && t.a(this.allowUniversalAccessFromFileUrls, webViewSettings.allowUniversalAccessFromFileUrls);
        }

        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public int hashCode() {
            Boolean bool = this.allowFileAccessFromFileUrls;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }

        public /* synthetic */ WebViewSettings(int i10, Boolean bool, Boolean bool2, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, AdPayload$WebViewSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i10 & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public WebViewSettings(Boolean bool, Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        public /* synthetic */ WebViewSettings(Boolean bool, Boolean bool2, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2);
        }

        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        t.e(strQuote, "quote(oldValue)");
        return new o(strQuote).f(str, valueOrEmpty(str3));
    }

    private final q<Boolean, Integer> computeAssetRequirement(Integer num) {
        if (isNativeTemplateType() || !adLoadOptimizationEnabled()) {
            return w.a(Boolean.TRUE, null);
        }
        if (isPartialDownloadEnabled()) {
            return w.a(Boolean.TRUE, Integer.valueOf(Math.max(0, num != null ? num.intValue() : 0)));
        }
        return w.a(Boolean.FALSE, null);
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return list.get(0);
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private final AdUnit getAdMarkup() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getAdMarkup();
        }
        return null;
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    private final q<String, File> getIndexHtmlFile(File file) {
        AdUnit adMarkup;
        String vmURL;
        Object objC;
        File parentFile;
        if (isNativeTemplateType() || (adMarkup = getAdMarkup()) == null || (vmURL = adMarkup.getVmURL()) == null) {
            return null;
        }
        if (!FileUtility.INSTANCE.isValidUrl(vmURL)) {
            vmURL = null;
        }
        if (vmURL == null) {
            return null;
        }
        try {
            r.a aVar = r.f27774b;
            String path = new URI(vmURL).getPath();
            t.e(path, "URI(url).path");
            List listJ0 = f0.J0(f0.e1(path, '/'), new char[]{'/'}, false, 0, 6, null);
            objC = r.c(listJ0.size() >= 2 ? kotlin.collections.b0.V(kotlin.collections.b0.k0(listJ0, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        if (r.k(objC)) {
            objC = null;
        }
        String str = (String) objC;
        if (str == null || (parentFile = file.getParentFile()) == null) {
            return null;
        }
        return new q<>(vmURL, new File(parentFile, str));
    }

    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ List getTpatUrls$default(AdPayload adPayload, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return adPayload.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }

    public static final void write$Self(AdPayload self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || self.ads != null) {
            output.o(serialDesc, 0, new je.f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), self.ads);
        }
        if (output.w(serialDesc, 1) || self.config != null) {
            output.o(serialDesc, 1, ConfigPayload$$serializer.INSTANCE, self.config);
        }
        if (output.w(serialDesc, 2) || self.expiryWindowStart != null) {
            output.o(serialDesc, 2, f1.f20900a, self.expiryWindowStart);
        }
        if (output.w(serialDesc, 3) || !t.a(self.mraidFiles, new ConcurrentHashMap())) {
            c cVarB = i0.b(ConcurrentHashMap.class);
            v2 v2Var = v2.f21024a;
            output.E(serialDesc, 3, new b(cVarB, null, new d[]{v2Var, v2Var}), self.mraidFiles);
        }
        if (output.w(serialDesc, 4) || !t.a(self.incentivizedTextSettings, new HashMap())) {
            v2 v2Var2 = v2.f21024a;
            output.E(serialDesc, 4, new z0(v2Var2, v2Var2), self.incentivizedTextSettings);
        }
        if (output.w(serialDesc, 5) || self.assetsFullyDownloaded) {
            output.j(serialDesc, 5, self.assetsFullyDownloaded);
        }
        if (output.w(serialDesc, 6) || self.indexFilePath != null) {
            output.o(serialDesc, 6, v2.f21024a, self.indexFilePath);
        }
    }

    public final int adHeight() {
        AdSizeInfo adSizeInfo;
        Integer height;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    public final AdUnit adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        AdSizeInfo adSizeInfo;
        Integer width;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    public final String advAppId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final ConfigPayload config() {
        return this.config;
    }

    public final d0 createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        e0 e0Var = new e0();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            j.c(e0Var, entry.getKey(), entry.getValue());
        }
        return e0Var.a();
    }

    public final String eventId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final String getAdSource() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final CSBResponse getCSBResponse() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getCsb();
        }
        return null;
    }

    public final String getCreativeId() {
        String creativeId;
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    public final List<AdAsset> getDownloadableAssets(File dir) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        t.f(dir, "dir");
        ArrayList arrayList = new ArrayList();
        q<String, File> indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            String strB = indexHtmlFile.b();
            File fileC = indexHtmlFile.c();
            this.indexFilePath = fileC.getAbsolutePath();
            if (!fileC.exists()) {
                Logger.Companion.d(TAG, "No cacheable index file found, creating new one: " + fileC);
                String str = KEY_VM;
                String absolutePath = fileC.getAbsolutePath();
                t.e(absolutePath, "indexFile.absolutePath");
                arrayList.add(new AdAsset(str, strB, absolutePath, true, null, 16, null));
            }
        }
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String key = entry.getKey();
                CacheableReplacement value = entry.getValue();
                String url = value.getUrl();
                if (url != null) {
                    FileUtility fileUtility = FileUtility.INSTANCE;
                    if (fileUtility.isValidUrl(url)) {
                        String filePath = new File(dir, fileUtility.guessFileName(url, value.getExtension())).getAbsolutePath();
                        q<Boolean, Integer> qVarComputeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                        boolean zBooleanValue = qVarComputeAssetRequirement.b().booleanValue();
                        Integer numC = qVarComputeAssetRequirement.c();
                        t.e(filePath, "filePath");
                        AdAsset adAsset = new AdAsset(key, url, filePath, zBooleanValue, numC);
                        String extension = value.getExtension();
                        if (extension != null) {
                            adAsset.setMimeType(extension);
                        }
                        arrayList.add(adAsset);
                        if (zBooleanValue && numC != null) {
                            this.partialDownloadAssets.put(url, adAsset);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            x.y(arrayList, new Comparator() { // from class: com.vungle.ads.internal.model.AdPayload$getDownloadableAssets$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return yc.b.a(Boolean.valueOf(((AdAsset) t11).isRequired()), Boolean.valueOf(((AdAsset) t10).isRequired()));
                }
            });
        }
        return arrayList;
    }

    public final String getExperiments() {
        TemplateSettings templateSettings;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (normalReplacements = templateSettings.getNormalReplacements()) == null) {
            return null;
        }
        return normalReplacements.get(Constants.EXPERIMENTS_KEY);
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final String getIndexFilePath() {
        return this.indexFilePath;
    }

    public final AdAsset getLocalPartialDownloadAssets(String remoteUrl) {
        t.f(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final List<String> getLossUrls() {
        CSBResponse csb;
        PlacementAdUnit ad2 = getAd();
        if (ad2 == null || (csb = ad2.getCsb()) == null) {
            return null;
        }
        return csb.getLurls();
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings2;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        AdUnit adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    public final String getMediationName() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    public final Map<String, AdAsset> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final int getShowCloseDelay(Boolean bool) {
        Integer showClose;
        Integer showCloseIncentivized;
        if (t.a(bool, Boolean.TRUE)) {
            AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    public final String getViewMasterVersion() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    public final WebViewSettings getWebViewSettings() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    public final List<String> getWinNotifications() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final List<String> getWinUrls() {
        CSBResponse csb;
        PlacementAdUnit ad2 = getAd();
        if (ad2 == null || (csb = ad2.getCsb()) == null) {
            return null;
        }
        return csb.getNurls();
    }

    public final Double getWinningPrice() {
        CSBResponse csb;
        PlacementAdUnit ad2 = getAd();
        if (ad2 == null || (csb = ad2.getCsb()) == null) {
            return null;
        }
        return csb.getPrice();
    }

    public final boolean hasExpired() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null) {
            return false;
        }
        Long l10 = this.expiryWindowStart;
        if (adMarkup.getExpiryDuration() != null && l10 != null) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - l10.longValue()) / 1000;
            Integer expiryDuration = adMarkup.getExpiryDuration();
            if (jCurrentTimeMillis <= (expiryDuration != null ? Long.valueOf(expiryDuration.intValue()) : null).longValue()) {
                return false;
            }
        } else {
            if (adMarkup.getExpiry() == null) {
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            Integer expiry = adMarkup.getExpiry();
            if (jCurrentTimeMillis2 <= (expiry != null ? Long.valueOf(expiry.intValue()) : null).longValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isAdPoddingEnabled() {
        TemplateSettings templateSettings;
        Map<String, String> normalReplacements;
        String str;
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (normalReplacements = templateSettings.getNormalReplacements()) == null || (str = normalReplacements.get(Constants.AD_PODDING_KEY)) == null || !c0.B(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, true)) ? false : true;
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(String failingUrl) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        t.f(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            AdUnit adMarkup = getAdMarkup();
            if (t.a(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (t.a(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return t.a(templateType(), "native");
    }

    public final boolean isPartialDownloadEnabled() {
        Boolean partialDownloadEnabled;
        AdUnit adMarkup = getAdMarkup();
        return ((adMarkup == null || (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) == null) ? false : partialDownloadEnabled.booleanValue()) && !isNativeTemplateType();
    }

    public final boolean omEnabled() {
        ViewAbility viewAbility;
        ViewAbilityInfo om;
        Boolean boolIsEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om = viewAbility.getOm()) == null || (boolIsEnabled = om.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    public final String placementId() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getPlacementReferenceId();
        }
        return null;
    }

    public final void recordExpiryWindowStart() {
        this.expiryWindowStart = Long.valueOf(System.currentTimeMillis());
    }

    public final void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        t.f(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public final String templateType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(String adIdentifier, File localFile) {
        t.f(adIdentifier, "adIdentifier");
        t.f(localFile, "localFile");
        if (localFile.exists()) {
            this.mraidFiles.put(adIdentifier, FILE_SCHEME + localFile.getAbsolutePath());
        }
    }

    public final boolean usePreloading() {
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup != null ? t.a(adMarkup.getUsePreloading(), Boolean.TRUE) : false) && !isNativeTemplateType();
    }

    public /* synthetic */ AdPayload(int i10, List list, ConfigPayload configPayload, Long l10, ConcurrentHashMap concurrentHashMap, Map map, boolean z10, String str, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, AdPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = configPayload;
        }
        if ((i10 & 4) == 0) {
            this.expiryWindowStart = null;
        } else {
            this.expiryWindowStart = l10;
        }
        if ((i10 & 8) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 16) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 32) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i10 & 64) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public final List<String> getTpatUrls(String event, String str, String str2) {
        ArrayList arrayList;
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        t.f(event, "event");
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup == null || (tpat2 = adMarkup.getTpat()) == null || tpat2.containsKey(event)) ? false : true) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Arbitrary tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        AdUnit adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event) {
            case "checkpoint.0":
                arrayList = new ArrayList(u.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), Constants.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), Constants.NETWORK_OPERATOR_KEY, str), Constants.DEVICE_VOLUME_KEY, str2));
                }
                break;
            case "video.length":
                arrayList = new ArrayList(u.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(complexReplace((String) it2.next(), Constants.VIDEO_LENGTH_KEY, str));
                }
                break;
            case "ad.loadDuration":
                arrayList = new ArrayList(u.u(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(complexReplace((String) it3.next(), Constants.AD_LOAD_DURATION_KEY, str));
                }
                break;
            case "ad.close":
                arrayList = new ArrayList(u.u(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(complexReplace(complexReplace((String) it4.next(), tFQWuE.NFlsuZZUKmTA, str), Constants.DEVICE_VOLUME_KEY, str2));
                }
                break;
            case "deeplink.click":
                arrayList = new ArrayList(u.u(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(complexReplace((String) it5.next(), Constants.DEEPLINK_SUCCESS_KEY, str));
                }
                break;
            default:
                return list;
        }
        return arrayList;
    }

    public final void setIncentivizedText(String title, String str, String keepWatching, String close) {
        t.f(title, "title");
        t.f(str, tFQWuE.jKOfAtt);
        t.f(keepWatching, "keepWatching");
        t.f(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (str.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, str);
        }
        if (keepWatching.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public AdPayload(List<PlacementAdUnit> list, ConfigPayload configPayload) {
        this.ads = list;
        this.config = configPayload;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public /* synthetic */ AdPayload(List list, ConfigPayload configPayload, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : configPayload);
    }
}
