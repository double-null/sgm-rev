package com.vungle.ads.internal.model;

import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import fe.d;
import fe.l;
import he.f;
import java.util.List;
import je.b2;
import je.f1;
import je.i;
import je.q2;
import je.v2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class CommonRequestBody {
    public static final Companion Companion = new Companion(null);
    private final AppNode app;
    private final DeviceNode device;
    private RequestExt ext;
    private RequestParam request;
    private final User user;

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class CCPA {
        public static final Companion Companion = new Companion(null);
        private final String status;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<CCPA> serializer() {
                return CommonRequestBody$CCPA$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CCPA(int i10, String str, q2 q2Var) {
            if (1 != (i10 & 1)) {
                b2.a(i10, 1, CommonRequestBody$CCPA$$serializer.INSTANCE.getDescriptor());
            }
            this.status = str;
        }

        public static /* synthetic */ CCPA copy$default(CCPA ccpa, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ccpa.status;
            }
            return ccpa.copy(str);
        }

        public static final void write$Self(CCPA self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            output.A(serialDesc, 0, self.status);
        }

        public final String component1() {
            return this.status;
        }

        public final CCPA copy(String status) {
            t.f(status, "status");
            return new CCPA(status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CCPA) && t.a(this.status, ((CCPA) obj).status);
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "CCPA(status=" + this.status + ')';
        }

        public CCPA(String status) {
            t.f(status, "status");
            this.status = status;
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class COPPA {
        public static final Companion Companion = new Companion(null);
        private final Boolean isCoppa;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<COPPA> serializer() {
                return CommonRequestBody$COPPA$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ COPPA(int i10, Boolean bool, q2 q2Var) {
            if (1 != (i10 & 1)) {
                b2.a(i10, 1, CommonRequestBody$COPPA$$serializer.INSTANCE.getDescriptor());
            }
            this.isCoppa = bool;
        }

        public static /* synthetic */ COPPA copy$default(COPPA coppa, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = coppa.isCoppa;
            }
            return coppa.copy(bool);
        }

        public static final void write$Self(COPPA self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            output.o(serialDesc, 0, i.f20933a, self.isCoppa);
        }

        public final Boolean component1() {
            return this.isCoppa;
        }

        public final COPPA copy(Boolean bool) {
            return new COPPA(bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof COPPA) && t.a(this.isCoppa, ((COPPA) obj).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        public COPPA(Boolean bool) {
            this.isCoppa = bool;
        }

        public static /* synthetic */ void isCoppa$annotations() {
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<CommonRequestBody> serializer() {
            return CommonRequestBody$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class GDPR {
        public static final Companion Companion = new Companion(null);
        private final String consentMessageVersion;
        private final String consentSource;
        private final String consentStatus;
        private final long consentTimestamp;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<GDPR> serializer() {
                return CommonRequestBody$GDPR$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ GDPR(int i10, String str, String str2, long j10, String str3, q2 q2Var) {
            if (15 != (i10 & 15)) {
                b2.a(i10, 15, CommonRequestBody$GDPR$$serializer.INSTANCE.getDescriptor());
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j10;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, long j10, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gdpr.consentStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = gdpr.consentSource;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                j10 = gdpr.consentTimestamp;
            }
            long j11 = j10;
            if ((i10 & 8) != 0) {
                str3 = gdpr.consentMessageVersion;
            }
            return gdpr.copy(str, str4, j11, str3);
        }

        public static final void write$Self(GDPR self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            output.A(serialDesc, 0, self.consentStatus);
            output.A(serialDesc, 1, self.consentSource);
            output.p(serialDesc, 2, self.consentTimestamp);
            output.A(serialDesc, 3, self.consentMessageVersion);
        }

        public final String component1() {
            return this.consentStatus;
        }

        public final String component2() {
            return this.consentSource;
        }

        public final long component3() {
            return this.consentTimestamp;
        }

        public final String component4() {
            return this.consentMessageVersion;
        }

        public final GDPR copy(String consentStatus, String consentSource, long j10, String consentMessageVersion) {
            t.f(consentStatus, "consentStatus");
            t.f(consentSource, "consentSource");
            t.f(consentMessageVersion, "consentMessageVersion");
            return new GDPR(consentStatus, consentSource, j10, consentMessageVersion);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) obj;
            return t.a(this.consentStatus, gdpr.consentStatus) && t.a(this.consentSource, gdpr.consentSource) && this.consentTimestamp == gdpr.consentTimestamp && t.a(this.consentMessageVersion, gdpr.consentMessageVersion);
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentSource() {
            return this.consentSource;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public int hashCode() {
            return (((((this.consentStatus.hashCode() * 31) + this.consentSource.hashCode()) * 31) + Long.hashCode(this.consentTimestamp)) * 31) + this.consentMessageVersion.hashCode();
        }

        public String toString() {
            return "GDPR(consentStatus=" + this.consentStatus + ", consentSource=" + this.consentSource + ", consentTimestamp=" + this.consentTimestamp + ", consentMessageVersion=" + this.consentMessageVersion + ')';
        }

        public GDPR(String consentStatus, String consentSource, long j10, String consentMessageVersion) {
            t.f(consentStatus, "consentStatus");
            t.f(consentSource, "consentSource");
            t.f(consentMessageVersion, "consentMessageVersion");
            this.consentStatus = consentStatus;
            this.consentSource = consentSource;
            this.consentTimestamp = j10;
            this.consentMessageVersion = consentMessageVersion;
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentSource$annotations() {
        }

        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class IAB {
        public static final Companion Companion = new Companion(null);
        private final String tcf;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<IAB> serializer() {
                return CommonRequestBody$IAB$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ IAB(int i10, String str, q2 q2Var) {
            if (1 != (i10 & 1)) {
                b2.a(i10, 1, CommonRequestBody$IAB$$serializer.INSTANCE.getDescriptor());
            }
            this.tcf = str;
        }

        public static /* synthetic */ IAB copy$default(IAB iab, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = iab.tcf;
            }
            return iab.copy(str);
        }

        public static final void write$Self(IAB self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            output.A(serialDesc, 0, self.tcf);
        }

        public final String component1() {
            return this.tcf;
        }

        public final IAB copy(String tcf) {
            t.f(tcf, "tcf");
            return new IAB(tcf);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IAB) && t.a(this.tcf, ((IAB) obj).tcf);
        }

        public final String getTcf() {
            return this.tcf;
        }

        public int hashCode() {
            return this.tcf.hashCode();
        }

        public String toString() {
            return "IAB(tcf=" + this.tcf + ')';
        }

        public IAB(String tcf) {
            t.f(tcf, "tcf");
            this.tcf = tcf;
        }

        public static /* synthetic */ void getTcf$annotations() {
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class RequestExt {
        public static final Companion Companion = new Companion(null);
        private final String configExtension;
        private final Long configLastValidatedTimestamp;
        private String signals;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<RequestExt> serializer() {
                return CommonRequestBody$RequestExt$$serializer.INSTANCE;
            }
        }

        public RequestExt() {
            this((String) null, (String) null, (Long) null, 7, (k) null);
        }

        public static /* synthetic */ RequestExt copy$default(RequestExt requestExt, String str, String str2, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = requestExt.configExtension;
            }
            if ((i10 & 2) != 0) {
                str2 = requestExt.signals;
            }
            if ((i10 & 4) != 0) {
                l10 = requestExt.configLastValidatedTimestamp;
            }
            return requestExt.copy(str, str2, l10);
        }

        public static final void write$Self(RequestExt self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.configExtension != null) {
                output.o(serialDesc, 0, v2.f21024a, self.configExtension);
            }
            if (output.w(serialDesc, 1) || self.signals != null) {
                output.o(serialDesc, 1, v2.f21024a, self.signals);
            }
            if (output.w(serialDesc, 2) || self.configLastValidatedTimestamp != null) {
                output.o(serialDesc, 2, f1.f20900a, self.configLastValidatedTimestamp);
            }
        }

        public final String component1() {
            return this.configExtension;
        }

        public final String component2() {
            return this.signals;
        }

        public final Long component3() {
            return this.configLastValidatedTimestamp;
        }

        public final RequestExt copy(String str, String str2, Long l10) {
            return new RequestExt(str, str2, l10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestExt)) {
                return false;
            }
            RequestExt requestExt = (RequestExt) obj;
            return t.a(this.configExtension, requestExt.configExtension) && t.a(this.signals, requestExt.signals) && t.a(this.configLastValidatedTimestamp, requestExt.configLastValidatedTimestamp);
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final String getSignals() {
            return this.signals;
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l10 = this.configLastValidatedTimestamp;
            return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
        }

        public final void setSignals(String str) {
            this.signals = str;
        }

        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        public /* synthetic */ RequestExt(int i10, String str, String str2, Long l10, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, CommonRequestBody$RequestExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i10 & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
            if ((i10 & 4) == 0) {
                this.configLastValidatedTimestamp = null;
            } else {
                this.configLastValidatedTimestamp = l10;
            }
        }

        public RequestExt(String str, String str2, Long l10) {
            this.configExtension = str;
            this.signals = str2;
            this.configLastValidatedTimestamp = l10;
        }

        public /* synthetic */ RequestExt(String str, String str2, Long l10, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10);
        }

        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
        }

        public static /* synthetic */ void getSignals$annotations() {
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class RequestParam {
        public static final Companion Companion = new Companion(null);
        private AdSizeParam adSize;
        private final Long adStartTime;
        private final String advAppId;
        private final CSBParam csb;
        private final String placementReferenceId;
        private final List<String> placements;
        private final String user;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<RequestParam> serializer() {
                return CommonRequestBody$RequestParam$$serializer.INSTANCE;
            }
        }

        public RequestParam() {
            this((List) null, (AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, (CSBParam) null, 127, (k) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RequestParam copy$default(RequestParam requestParam, List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = requestParam.placements;
            }
            if ((i10 & 2) != 0) {
                adSizeParam = requestParam.adSize;
            }
            AdSizeParam adSizeParam2 = adSizeParam;
            if ((i10 & 4) != 0) {
                l10 = requestParam.adStartTime;
            }
            Long l11 = l10;
            if ((i10 & 8) != 0) {
                str = requestParam.advAppId;
            }
            String str4 = str;
            if ((i10 & 16) != 0) {
                str2 = requestParam.placementReferenceId;
            }
            String str5 = str2;
            if ((i10 & 32) != 0) {
                str3 = requestParam.user;
            }
            String str6 = str3;
            if ((i10 & 64) != 0) {
                cSBParam = requestParam.csb;
            }
            return requestParam.copy(list, adSizeParam2, l11, str4, str5, str6, cSBParam);
        }

        public static final void write$Self(RequestParam self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.placements != null) {
                output.o(serialDesc, 0, new je.f(v2.f21024a), self.placements);
            }
            if (output.w(serialDesc, 1) || self.adSize != null) {
                output.o(serialDesc, 1, CommonRequestBody$AdSizeParam$$serializer.INSTANCE, self.adSize);
            }
            if (output.w(serialDesc, 2) || self.adStartTime != null) {
                output.o(serialDesc, 2, f1.f20900a, self.adStartTime);
            }
            if (output.w(serialDesc, 3) || self.advAppId != null) {
                output.o(serialDesc, 3, v2.f21024a, self.advAppId);
            }
            if (output.w(serialDesc, 4) || self.placementReferenceId != null) {
                output.o(serialDesc, 4, v2.f21024a, self.placementReferenceId);
            }
            if (output.w(serialDesc, 5) || self.user != null) {
                output.o(serialDesc, 5, v2.f21024a, self.user);
            }
            if (output.w(serialDesc, 6) || self.csb != null) {
                output.o(serialDesc, 6, CommonRequestBody$CSBParam$$serializer.INSTANCE, self.csb);
            }
        }

        public final List<String> component1() {
            return this.placements;
        }

        public final AdSizeParam component2() {
            return this.adSize;
        }

        public final Long component3() {
            return this.adStartTime;
        }

        public final String component4() {
            return this.advAppId;
        }

        public final String component5() {
            return this.placementReferenceId;
        }

        public final String component6() {
            return this.user;
        }

        public final CSBParam component7() {
            return this.csb;
        }

        public final RequestParam copy(List<String> list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam) {
            return new RequestParam(list, adSizeParam, l10, str, str2, str3, cSBParam);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestParam)) {
                return false;
            }
            RequestParam requestParam = (RequestParam) obj;
            return t.a(this.placements, requestParam.placements) && t.a(this.adSize, requestParam.adSize) && t.a(this.adStartTime, requestParam.adStartTime) && t.a(this.advAppId, requestParam.advAppId) && t.a(this.placementReferenceId, requestParam.placementReferenceId) && t.a(this.user, requestParam.user) && t.a(this.csb, requestParam.csb);
        }

        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final CSBParam getCsb() {
            return this.csb;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final List<String> getPlacements() {
            return this.placements;
        }

        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            AdSizeParam adSizeParam = this.adSize;
            int iHashCode2 = (iHashCode + (adSizeParam == null ? 0 : adSizeParam.hashCode())) * 31;
            Long l10 = this.adStartTime;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str = this.advAppId;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementReferenceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.user;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CSBParam cSBParam = this.csb;
            return iHashCode6 + (cSBParam != null ? cSBParam.hashCode() : 0);
        }

        public final void setAdSize(AdSizeParam adSizeParam) {
            this.adSize = adSizeParam;
        }

        public String toString() {
            return "RequestParam(placements=" + this.placements + ", adSize=" + this.adSize + ", adStartTime=" + this.adStartTime + ", advAppId=" + this.advAppId + ", placementReferenceId=" + this.placementReferenceId + ", user=" + this.user + ", csb=" + this.csb + ')';
        }

        public /* synthetic */ RequestParam(int i10, List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, CommonRequestBody$RequestParam$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i10 & 2) == 0) {
                this.adSize = null;
            } else {
                this.adSize = adSizeParam;
            }
            if ((i10 & 4) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l10;
            }
            if ((i10 & 8) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str;
            }
            if ((i10 & 16) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str2;
            }
            if ((i10 & 32) == 0) {
                this.user = null;
            } else {
                this.user = str3;
            }
            if ((i10 & 64) == 0) {
                this.csb = null;
            } else {
                this.csb = cSBParam;
            }
        }

        public RequestParam(List<String> list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam) {
            this.placements = list;
            this.adSize = adSizeParam;
            this.adStartTime = l10;
            this.advAppId = str;
            this.placementReferenceId = str2;
            this.user = str3;
            this.csb = cSBParam;
        }

        public /* synthetic */ RequestParam(List list, AdSizeParam adSizeParam, Long l10, String str, String str2, String str3, CSBParam cSBParam, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : adSizeParam, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : cSBParam);
        }

        public static /* synthetic */ void getAdSize$annotations() {
        }

        public static /* synthetic */ void getAdStartTime$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class User {
        public static final Companion Companion = new Companion(null);
        private CCPA ccpa;
        private COPPA coppa;
        private FirstPartyData fpd;
        private GDPR gdpr;
        private IAB iab;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<User> serializer() {
                return CommonRequestBody$User$$serializer.INSTANCE;
            }
        }

        public User() {
            this((GDPR) null, (CCPA) null, (COPPA) null, (FirstPartyData) null, (IAB) null, 31, (k) null);
        }

        public static /* synthetic */ User copy$default(User user, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gdpr = user.gdpr;
            }
            if ((i10 & 2) != 0) {
                ccpa = user.ccpa;
            }
            CCPA ccpa2 = ccpa;
            if ((i10 & 4) != 0) {
                coppa = user.coppa;
            }
            COPPA coppa2 = coppa;
            if ((i10 & 8) != 0) {
                firstPartyData = user.fpd;
            }
            FirstPartyData firstPartyData2 = firstPartyData;
            if ((i10 & 16) != 0) {
                iab = user.iab;
            }
            return user.copy(gdpr, ccpa2, coppa2, firstPartyData2, iab);
        }

        public static final void write$Self(User self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.gdpr != null) {
                output.o(serialDesc, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, self.gdpr);
            }
            if (output.w(serialDesc, 1) || self.ccpa != null) {
                output.o(serialDesc, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, self.ccpa);
            }
            if (output.w(serialDesc, 2) || self.coppa != null) {
                output.o(serialDesc, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, self.coppa);
            }
            if (output.w(serialDesc, 3) || self.fpd != null) {
                output.o(serialDesc, 3, FirstPartyData$$serializer.INSTANCE, self.fpd);
            }
            if (output.w(serialDesc, 4) || self.iab != null) {
                output.o(serialDesc, 4, CommonRequestBody$IAB$$serializer.INSTANCE, self.iab);
            }
        }

        public final GDPR component1() {
            return this.gdpr;
        }

        public final CCPA component2() {
            return this.ccpa;
        }

        public final COPPA component3() {
            return this.coppa;
        }

        public final FirstPartyData component4() {
            return this.fpd;
        }

        public final IAB component5() {
            return this.iab;
        }

        public final User copy(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab) {
            return new User(gdpr, ccpa, coppa, firstPartyData, iab);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return t.a(this.gdpr, user.gdpr) && t.a(this.ccpa, user.ccpa) && t.a(this.coppa, user.coppa) && t.a(this.fpd, user.fpd) && t.a(this.iab, user.iab);
        }

        public final CCPA getCcpa() {
            return this.ccpa;
        }

        public final COPPA getCoppa() {
            return this.coppa;
        }

        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        public final GDPR getGdpr() {
            return this.gdpr;
        }

        public final IAB getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPR gdpr = this.gdpr;
            int iHashCode = (gdpr == null ? 0 : gdpr.hashCode()) * 31;
            CCPA ccpa = this.ccpa;
            int iHashCode2 = (iHashCode + (ccpa == null ? 0 : ccpa.hashCode())) * 31;
            COPPA coppa = this.coppa;
            int iHashCode3 = (iHashCode2 + (coppa == null ? 0 : coppa.hashCode())) * 31;
            FirstPartyData firstPartyData = this.fpd;
            int iHashCode4 = (iHashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
            IAB iab = this.iab;
            return iHashCode4 + (iab != null ? iab.hashCode() : 0);
        }

        public final void setCcpa(CCPA ccpa) {
            this.ccpa = ccpa;
        }

        public final void setCoppa(COPPA coppa) {
            this.coppa = coppa;
        }

        public final void setFpd(FirstPartyData firstPartyData) {
            this.fpd = firstPartyData;
        }

        public final void setGdpr(GDPR gdpr) {
            this.gdpr = gdpr;
        }

        public final void setIab(IAB iab) {
            this.iab = iab;
        }

        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        public /* synthetic */ User(int i10, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, CommonRequestBody$User$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gdpr;
            }
            if ((i10 & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = ccpa;
            }
            if ((i10 & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = coppa;
            }
            if ((i10 & 8) == 0) {
                this.fpd = null;
            } else {
                this.fpd = firstPartyData;
            }
            if ((i10 & 16) == 0) {
                this.iab = null;
            } else {
                this.iab = iab;
            }
        }

        public User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab) {
            this.gdpr = gdpr;
            this.ccpa = ccpa;
            this.coppa = coppa;
            this.fpd = firstPartyData;
            this.iab = iab;
        }

        public /* synthetic */ User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i10, k kVar) {
            this((i10 & 1) != 0 ? null : gdpr, (i10 & 2) != 0 ? null : ccpa, (i10 & 4) != 0 ? null : coppa, (i10 & 8) != 0 ? null : firstPartyData, (i10 & 16) != 0 ? null : iab);
        }
    }

    public /* synthetic */ CommonRequestBody(int i10, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, CommonRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.app = null;
        } else {
            this.app = appNode;
        }
        if ((i10 & 4) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 16) == 0) {
            this.request = null;
        } else {
            this.request = requestParam;
        }
    }

    public static /* synthetic */ CommonRequestBody copy$default(CommonRequestBody commonRequestBody, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceNode = commonRequestBody.device;
        }
        if ((i10 & 2) != 0) {
            appNode = commonRequestBody.app;
        }
        AppNode appNode2 = appNode;
        if ((i10 & 4) != 0) {
            user = commonRequestBody.user;
        }
        User user2 = user;
        if ((i10 & 8) != 0) {
            requestExt = commonRequestBody.ext;
        }
        RequestExt requestExt2 = requestExt;
        if ((i10 & 16) != 0) {
            requestParam = commonRequestBody.request;
        }
        return commonRequestBody.copy(deviceNode, appNode2, user2, requestExt2, requestParam);
    }

    public static final void write$Self(CommonRequestBody self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        output.E(serialDesc, 0, DeviceNode$$serializer.INSTANCE, self.device);
        if (output.w(serialDesc, 1) || self.app != null) {
            output.o(serialDesc, 1, AppNode$$serializer.INSTANCE, self.app);
        }
        if (output.w(serialDesc, 2) || self.user != null) {
            output.o(serialDesc, 2, CommonRequestBody$User$$serializer.INSTANCE, self.user);
        }
        if (output.w(serialDesc, 3) || self.ext != null) {
            output.o(serialDesc, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, self.ext);
        }
        if (output.w(serialDesc, 4) || self.request != null) {
            output.o(serialDesc, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, self.request);
        }
    }

    public final DeviceNode component1() {
        return this.device;
    }

    public final AppNode component2() {
        return this.app;
    }

    public final User component3() {
        return this.user;
    }

    public final RequestExt component4() {
        return this.ext;
    }

    public final RequestParam component5() {
        return this.request;
    }

    public final CommonRequestBody copy(DeviceNode device, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        t.f(device, "device");
        return new CommonRequestBody(device, appNode, user, requestExt, requestParam);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonRequestBody)) {
            return false;
        }
        CommonRequestBody commonRequestBody = (CommonRequestBody) obj;
        return t.a(this.device, commonRequestBody.device) && t.a(this.app, commonRequestBody.app) && t.a(this.user, commonRequestBody.user) && t.a(this.ext, commonRequestBody.ext) && t.a(this.request, commonRequestBody.request);
    }

    public final AppNode getApp() {
        return this.app;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final RequestExt getExt() {
        return this.ext;
    }

    public final RequestParam getRequest() {
        return this.request;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        AppNode appNode = this.app;
        int iHashCode2 = (iHashCode + (appNode == null ? 0 : appNode.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        RequestExt requestExt = this.ext;
        int iHashCode4 = (iHashCode3 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RequestParam requestParam = this.request;
        return iHashCode4 + (requestParam != null ? requestParam.hashCode() : 0);
    }

    public final void setExt(RequestExt requestExt) {
        this.ext = requestExt;
    }

    public final void setRequest(RequestParam requestParam) {
        this.request = requestParam;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class AdSizeParam {
        public static final Companion Companion = new Companion(null);
        private final int height;
        private final int width;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<AdSizeParam> serializer() {
                return CommonRequestBody$AdSizeParam$$serializer.INSTANCE;
            }
        }

        public AdSizeParam(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static /* synthetic */ AdSizeParam copy$default(AdSizeParam adSizeParam, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = adSizeParam.width;
            }
            if ((i12 & 2) != 0) {
                i11 = adSizeParam.height;
            }
            return adSizeParam.copy(i10, i11);
        }

        public static final void write$Self(AdSizeParam self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            output.h(serialDesc, 0, self.width);
            output.h(serialDesc, 1, self.height);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final AdSizeParam copy(int i10, int i11) {
            return new AdSizeParam(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdSizeParam)) {
                return false;
            }
            AdSizeParam adSizeParam = (AdSizeParam) obj;
            return this.width == adSizeParam.width && this.height == adSizeParam.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "AdSizeParam(width=" + this.width + ", height=" + this.height + ')';
        }

        public /* synthetic */ AdSizeParam(int i10, int i11, int i12, q2 q2Var) {
            if (3 != (i10 & 3)) {
                b2.a(i10, 3, CommonRequestBody$AdSizeParam$$serializer.INSTANCE.getDescriptor());
            }
            this.width = i11;
            this.height = i12;
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    public CommonRequestBody(DeviceNode device, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        t.f(device, "device");
        this.device = device;
        this.app = appNode;
        this.user = user;
        this.ext = requestExt;
        this.request = requestParam;
    }

    /* JADX INFO: compiled from: CommonRequestBody.kt */
    @l
    public static final class CSBParam {
        public static final Companion Companion = new Companion(null);
        private final String adUnitId;
        private final double bidfloor;
        private final String creativeId;
        private final String ext;
        private final boolean isVXWinner;
        private final String parentAuctionId;
        private final int phase;

        /* JADX INFO: compiled from: CommonRequestBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<CSBParam> serializer() {
                return CommonRequestBody$CSBParam$$serializer.INSTANCE;
            }
        }

        public CSBParam(double d10, int i10, boolean z10, String parentAuctionId, String creativeId, String adUnitId, String str) {
            t.f(parentAuctionId, "parentAuctionId");
            t.f(creativeId, "creativeId");
            t.f(adUnitId, "adUnitId");
            this.bidfloor = d10;
            this.phase = i10;
            this.isVXWinner = z10;
            this.parentAuctionId = parentAuctionId;
            this.creativeId = creativeId;
            this.adUnitId = adUnitId;
            this.ext = str;
        }

        public static final void write$Self(CSBParam self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            output.k(serialDesc, 0, self.bidfloor);
            output.h(serialDesc, 1, self.phase);
            output.j(serialDesc, 2, self.isVXWinner);
            output.A(serialDesc, 3, self.parentAuctionId);
            output.A(serialDesc, 4, self.creativeId);
            output.A(serialDesc, 5, self.adUnitId);
            if (output.w(serialDesc, 6) || self.ext != null) {
                output.o(serialDesc, 6, v2.f21024a, self.ext);
            }
        }

        public final double component1() {
            return this.bidfloor;
        }

        public final int component2() {
            return this.phase;
        }

        public final boolean component3() {
            return this.isVXWinner;
        }

        public final String component4() {
            return this.parentAuctionId;
        }

        public final String component5() {
            return this.creativeId;
        }

        public final String component6() {
            return this.adUnitId;
        }

        public final String component7() {
            return this.ext;
        }

        public final CSBParam copy(double d10, int i10, boolean z10, String parentAuctionId, String creativeId, String adUnitId, String str) {
            t.f(parentAuctionId, "parentAuctionId");
            t.f(creativeId, "creativeId");
            t.f(adUnitId, "adUnitId");
            return new CSBParam(d10, i10, z10, parentAuctionId, creativeId, adUnitId, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CSBParam)) {
                return false;
            }
            CSBParam cSBParam = (CSBParam) obj;
            return t.a(Double.valueOf(this.bidfloor), Double.valueOf(cSBParam.bidfloor)) && this.phase == cSBParam.phase && this.isVXWinner == cSBParam.isVXWinner && t.a(this.parentAuctionId, cSBParam.parentAuctionId) && t.a(this.creativeId, cSBParam.creativeId) && t.a(this.adUnitId, cSBParam.adUnitId) && t.a(this.ext, cSBParam.ext);
        }

        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public final double getBidfloor() {
            return this.bidfloor;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getExt() {
            return this.ext;
        }

        public final String getParentAuctionId() {
            return this.parentAuctionId;
        }

        public final int getPhase() {
            return this.phase;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        public int hashCode() {
            int iHashCode = ((Double.hashCode(this.bidfloor) * 31) + Integer.hashCode(this.phase)) * 31;
            boolean z10 = this.isVXWinner;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int iHashCode2 = (((((((iHashCode + r10) * 31) + this.parentAuctionId.hashCode()) * 31) + this.creativeId.hashCode()) * 31) + this.adUnitId.hashCode()) * 31;
            String str = this.ext;
            return iHashCode2 + (str == null ? 0 : str.hashCode());
        }

        public final boolean isVXWinner() {
            return this.isVXWinner;
        }

        public String toString() {
            return "CSBParam(bidfloor=" + this.bidfloor + ", phase=" + this.phase + ", isVXWinner=" + this.isVXWinner + ", parentAuctionId=" + this.parentAuctionId + ", creativeId=" + this.creativeId + ", adUnitId=" + this.adUnitId + ", ext=" + this.ext + ')';
        }

        public /* synthetic */ CSBParam(int i10, double d10, int i11, boolean z10, String str, String str2, String str3, String str4, q2 q2Var) {
            if (63 != (i10 & 63)) {
                b2.a(i10, 63, CommonRequestBody$CSBParam$$serializer.INSTANCE.getDescriptor());
            }
            this.bidfloor = d10;
            this.phase = i11;
            this.isVXWinner = z10;
            this.parentAuctionId = str;
            this.creativeId = str2;
            this.adUnitId = str3;
            if ((i10 & 64) == 0) {
                this.ext = null;
            } else {
                this.ext = str4;
            }
        }

        public /* synthetic */ CSBParam(double d10, int i10, boolean z10, String str, String str2, String str3, String str4, int i11, k kVar) {
            this(d10, i10, z10, str, str2, str3, (i11 & 64) != 0 ? null : str4);
        }

        public static /* synthetic */ void getAdUnitId$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getParentAuctionId$annotations() {
        }

        public static /* synthetic */ void isVXWinner$annotations() {
        }
    }

    public /* synthetic */ CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, k kVar) {
        this(deviceNode, (i10 & 2) != 0 ? null : appNode, (i10 & 4) != 0 ? null : user, (i10 & 8) != 0 ? null : requestExt, (i10 & 16) != 0 ? null : requestParam);
    }
}
