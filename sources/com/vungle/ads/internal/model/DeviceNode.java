package com.vungle.ads.internal.model;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.f1;
import je.q2;
import je.u0;
import je.v2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class DeviceNode {
    public static final Companion Companion = new Companion(null);
    private final String carrier;
    private VungleExt ext;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13073h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private String f13074ua;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13075w;

    /* JADX INFO: compiled from: DeviceNode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<DeviceNode> serializer() {
            return DeviceNode$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeviceNode.kt */
    @l
    public static final class VungleExt {
        public static final Companion Companion = new Companion(null);
        private String amazonAdvertisingId;
        private String appSetId;
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private String gaid;
        private String gpVersion;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private Long obt;
        private Long oit;
        private Long ort;
        private int sdCardAvailable;
        private Long sit;
        private int soundEnabled;
        private String timeZone;
        private float volumeLevel;

        /* JADX INFO: compiled from: DeviceNode.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d<VungleExt> serializer() {
                return DeviceNode$VungleExt$$serializer.INSTANCE;
            }
        }

        public VungleExt() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (k) null);
        }

        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getBatteryState$annotations() {
        }

        public static /* synthetic */ void getConnectionType$annotations() {
        }

        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        public static /* synthetic */ void getGaid$annotations() {
        }

        public static /* synthetic */ void getGpVersion$annotations() {
        }

        public static /* synthetic */ void getLanguage$annotations() {
        }

        public static /* synthetic */ void getLocale$annotations() {
        }

        public static /* synthetic */ void getObt$annotations() {
        }

        public static /* synthetic */ void getOit$annotations() {
        }

        public static /* synthetic */ void getOrt$annotations() {
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSit$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void getTimeZone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        public static /* synthetic */ void isTv$annotations() {
        }

        public static final void write$Self(VungleExt self, ie.d output, f serialDesc) {
            t.f(self, "self");
            t.f(output, "output");
            t.f(serialDesc, "serialDesc");
            if (output.w(serialDesc, 0) || self.isGooglePlayServicesAvailable) {
                output.j(serialDesc, 0, self.isGooglePlayServicesAvailable);
            }
            if (output.w(serialDesc, 1) || self.appSetId != null) {
                output.o(serialDesc, 1, v2.f21024a, self.appSetId);
            }
            if (output.w(serialDesc, 2) || self.appSetIdScope != null) {
                output.o(serialDesc, 2, u0.f21014a, self.appSetIdScope);
            }
            if (output.w(serialDesc, 3) || !t.a(Float.valueOf(self.batteryLevel), Float.valueOf(0.0f))) {
                output.e(serialDesc, 3, self.batteryLevel);
            }
            if (output.w(serialDesc, 4) || self.batteryState != null) {
                output.o(serialDesc, 4, v2.f21024a, self.batteryState);
            }
            if (output.w(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.h(serialDesc, 5, self.batterySaverEnabled);
            }
            if (output.w(serialDesc, 6) || self.connectionType != null) {
                output.o(serialDesc, 6, v2.f21024a, self.connectionType);
            }
            if (output.w(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.o(serialDesc, 7, v2.f21024a, self.connectionTypeDetail);
            }
            if (output.w(serialDesc, 8) || self.locale != null) {
                output.o(serialDesc, 8, v2.f21024a, self.locale);
            }
            if (output.w(serialDesc, 9) || self.language != null) {
                output.o(serialDesc, 9, v2.f21024a, self.language);
            }
            if (output.w(serialDesc, 10) || self.timeZone != null) {
                output.o(serialDesc, 10, v2.f21024a, self.timeZone);
            }
            if (output.w(serialDesc, 11) || !t.a(Float.valueOf(self.volumeLevel), Float.valueOf(0.0f))) {
                output.e(serialDesc, 11, self.volumeLevel);
            }
            if (output.w(serialDesc, 12) || self.soundEnabled != 1) {
                output.h(serialDesc, 12, self.soundEnabled);
            }
            if (output.w(serialDesc, 13) || self.isTv) {
                output.j(serialDesc, 13, self.isTv);
            }
            if (output.w(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.h(serialDesc, 14, self.sdCardAvailable);
            }
            if (output.w(serialDesc, 15) || self.isSideloadEnabled) {
                output.j(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.w(serialDesc, 16) || self.gaid != null) {
                output.o(serialDesc, 16, v2.f21024a, self.gaid);
            }
            if (output.w(serialDesc, 17) || self.amazonAdvertisingId != null) {
                output.o(serialDesc, 17, v2.f21024a, self.amazonAdvertisingId);
            }
            if (output.w(serialDesc, 18) || self.sit != null) {
                output.o(serialDesc, 18, f1.f20900a, self.sit);
            }
            if (output.w(serialDesc, 19) || self.oit != null) {
                output.o(serialDesc, 19, f1.f20900a, self.oit);
            }
            if (output.w(serialDesc, 20) || self.ort != null) {
                output.o(serialDesc, 20, f1.f20900a, self.ort);
            }
            if (output.w(serialDesc, 21) || self.obt != null) {
                output.o(serialDesc, 21, f1.f20900a, self.obt);
            }
            if (output.w(serialDesc, 22) || self.gpVersion != null) {
                output.o(serialDesc, 22, v2.f21024a, self.gpVersion);
            }
        }

        public final boolean component1() {
            return this.isGooglePlayServicesAvailable;
        }

        public final String component10() {
            return this.language;
        }

        public final String component11() {
            return this.timeZone;
        }

        public final float component12() {
            return this.volumeLevel;
        }

        public final int component13() {
            return this.soundEnabled;
        }

        public final boolean component14() {
            return this.isTv;
        }

        public final int component15() {
            return this.sdCardAvailable;
        }

        public final boolean component16() {
            return this.isSideloadEnabled;
        }

        public final String component17() {
            return this.gaid;
        }

        public final String component18() {
            return this.amazonAdvertisingId;
        }

        public final Long component19() {
            return this.sit;
        }

        public final String component2() {
            return this.appSetId;
        }

        public final Long component20() {
            return this.oit;
        }

        public final Long component21() {
            return this.ort;
        }

        public final Long component22() {
            return this.obt;
        }

        public final String component23() {
            return this.gpVersion;
        }

        public final Integer component3() {
            return this.appSetIdScope;
        }

        public final float component4() {
            return this.batteryLevel;
        }

        public final String component5() {
            return this.batteryState;
        }

        public final int component6() {
            return this.batterySaverEnabled;
        }

        public final String component7() {
            return this.connectionType;
        }

        public final String component8() {
            return this.connectionTypeDetail;
        }

        public final String component9() {
            return this.locale;
        }

        public final VungleExt copy(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10) {
            return new VungleExt(z10, str, num, f10, str2, i10, str3, str4, str5, str6, str7, f11, i11, z11, i12, z12, str8, str9, l10, l11, l12, l13, str10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) obj;
            return this.isGooglePlayServicesAvailable == vungleExt.isGooglePlayServicesAvailable && t.a(this.appSetId, vungleExt.appSetId) && t.a(this.appSetIdScope, vungleExt.appSetIdScope) && t.a(Float.valueOf(this.batteryLevel), Float.valueOf(vungleExt.batteryLevel)) && t.a(this.batteryState, vungleExt.batteryState) && this.batterySaverEnabled == vungleExt.batterySaverEnabled && t.a(this.connectionType, vungleExt.connectionType) && t.a(this.connectionTypeDetail, vungleExt.connectionTypeDetail) && t.a(this.locale, vungleExt.locale) && t.a(this.language, vungleExt.language) && t.a(this.timeZone, vungleExt.timeZone) && t.a(Float.valueOf(this.volumeLevel), Float.valueOf(vungleExt.volumeLevel)) && this.soundEnabled == vungleExt.soundEnabled && this.isTv == vungleExt.isTv && this.sdCardAvailable == vungleExt.sdCardAvailable && this.isSideloadEnabled == vungleExt.isSideloadEnabled && t.a(this.gaid, vungleExt.gaid) && t.a(this.amazonAdvertisingId, vungleExt.amazonAdvertisingId) && t.a(this.sit, vungleExt.sit) && t.a(this.oit, vungleExt.oit) && t.a(this.ort, vungleExt.ort) && t.a(this.obt, vungleExt.obt) && t.a(this.gpVersion, vungleExt.gpVersion);
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public final String getGpVersion() {
            return this.gpVersion;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Long getObt() {
            return this.obt;
        }

        public final Long getOit() {
            return this.oit;
        }

        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v27, types: [int] */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r2v33, types: [int] */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v46 */
        public int hashCode() {
            boolean z10 = this.isGooglePlayServicesAvailable;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = r10 * 31;
            String str = this.appSetId;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.hashCode(this.batteryLevel)) * 31;
            String str2 = this.batteryState;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.batterySaverEnabled)) * 31;
            String str3 = this.connectionType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.hashCode(this.volumeLevel)) * 31) + Integer.hashCode(this.soundEnabled)) * 31;
            boolean z11 = this.isTv;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int iHashCode9 = (((iHashCode8 + r11) * 31) + Integer.hashCode(this.sdCardAvailable)) * 31;
            boolean z12 = this.isSideloadEnabled;
            int i11 = (iHashCode9 + (z12 ? 1 : z12)) * 31;
            String str8 = this.gaid;
            int iHashCode10 = (i11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l10 = this.sit;
            int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.oit;
            int iHashCode13 = (iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.ort;
            int iHashCode14 = (iHashCode13 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.obt;
            int iHashCode15 = (iHashCode14 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str10 = this.gpVersion;
            return iHashCode15 + (str10 != null ? str10.hashCode() : 0);
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f10) {
            this.batteryLevel = f10;
        }

        public final void setBatterySaverEnabled(int i10) {
            this.batterySaverEnabled = i10;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z10) {
            this.isGooglePlayServicesAvailable = z10;
        }

        public final void setGpVersion(String str) {
            this.gpVersion = str;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final void setObt(Long l10) {
            this.obt = l10;
        }

        public final void setOit(Long l10) {
            this.oit = l10;
        }

        public final void setOrt(Long l10) {
            this.ort = l10;
        }

        public final void setSdCardAvailable(int i10) {
            this.sdCardAvailable = i10;
        }

        public final void setSideloadEnabled(boolean z10) {
            this.isSideloadEnabled = z10;
        }

        public final void setSit(Long l10) {
            this.sit = l10;
        }

        public final void setSoundEnabled(int i10) {
            this.soundEnabled = i10;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z10) {
            this.isTv = z10;
        }

        public final void setVolumeLevel(float f10) {
            this.volumeLevel = f10;
        }

        public /* synthetic */ VungleExt(int i10, boolean z10, String str, Integer num, float f10, String str2, int i11, String str3, String str4, String str5, String str6, String str7, float f11, int i12, boolean z11, int i13, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, q2 q2Var) {
            if ((i10 & 0) != 0) {
                b2.a(i10, 0, DeviceNode$VungleExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z10;
            }
            if ((i10 & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i10 & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i10 & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f10;
            }
            if ((i10 & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i10 & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i11;
            }
            if ((i10 & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i10 & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i10 & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i10 & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i10 & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f11;
            }
            if ((i10 & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i12;
            }
            if ((i10 & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z11;
            }
            if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i13;
            }
            if ((32768 & i10) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z12;
            }
            if ((65536 & i10) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i10) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i10) == 0) {
                this.sit = null;
            } else {
                this.sit = l10;
            }
            if ((524288 & i10) == 0) {
                this.oit = null;
            } else {
                this.oit = l11;
            }
            if ((1048576 & i10) == 0) {
                this.ort = null;
            } else {
                this.ort = l12;
            }
            if ((2097152 & i10) == 0) {
                this.obt = null;
            } else {
                this.obt = l13;
            }
            if ((i10 & 4194304) == 0) {
                this.gpVersion = null;
            } else {
                this.gpVersion = str10;
            }
        }

        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + UyXgnuLGEkgnZE.qQjOERAj + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ", gpVersion=" + this.gpVersion + ')';
        }

        public VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10) {
            this.isGooglePlayServicesAvailable = z10;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f10;
            this.batteryState = str2;
            this.batterySaverEnabled = i10;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f11;
            this.soundEnabled = i11;
            this.isTv = z11;
            this.sdCardAvailable = i12;
            this.isSideloadEnabled = z12;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l10;
            this.oit = l11;
            this.ort = l12;
            this.obt = l13;
            this.gpVersion = str10;
        }

        public /* synthetic */ VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, int i13, k kVar) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & 2048) == 0 ? f11 : 0.0f, (i13 & 4096) != 0 ? 1 : i11, (i13 & 8192) != 0 ? false : z11, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? i12 : 1, (32768 & i13) != 0 ? false : z12, (i13 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0 ? null : str8, (i13 & 131072) != 0 ? null : str9, (i13 & 262144) != 0 ? null : l10, (i13 & 524288) != 0 ? null : l11, (i13 & 1048576) != 0 ? null : l12, (i13 & 2097152) != 0 ? null : l13, (i13 & 4194304) != 0 ? null : str10);
        }
    }

    public /* synthetic */ DeviceNode(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, Integer num, VungleExt vungleExt, q2 q2Var) {
        if (119 != (i10 & 119)) {
            b2.a(i10, 119, DeviceNode$$serializer.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i10 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.f13075w = i11;
        this.f13073h = i12;
        if ((i10 & 128) == 0) {
            this.f13074ua = null;
        } else {
            this.f13074ua = str6;
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i10 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i10 & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = vungleExt;
        }
    }

    public static final void write$Self(DeviceNode self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        output.A(serialDesc, 0, self.make);
        output.A(serialDesc, 1, self.model);
        output.A(serialDesc, 2, self.osv);
        if (output.w(serialDesc, 3) || self.carrier != null) {
            output.o(serialDesc, 3, v2.f21024a, self.carrier);
        }
        output.A(serialDesc, 4, self.os);
        output.h(serialDesc, 5, self.f13075w);
        output.h(serialDesc, 6, self.f13073h);
        if (output.w(serialDesc, 7) || self.f13074ua != null) {
            output.o(serialDesc, 7, v2.f21024a, self.f13074ua);
        }
        if (output.w(serialDesc, 8) || self.ifa != null) {
            output.o(serialDesc, 8, v2.f21024a, self.ifa);
        }
        if (output.w(serialDesc, 9) || self.lmt != null) {
            output.o(serialDesc, 9, u0.f21014a, self.lmt);
        }
        if (output.w(serialDesc, 10) || self.ext != null) {
            output.o(serialDesc, 10, DeviceNode$VungleExt$$serializer.INSTANCE, self.ext);
        }
    }

    public final String component1() {
        return this.make;
    }

    public final Integer component10() {
        return this.lmt;
    }

    public final VungleExt component11() {
        return this.ext;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.osv;
    }

    public final String component4() {
        return this.carrier;
    }

    public final String component5() {
        return this.os;
    }

    public final int component6() {
        return this.f13075w;
    }

    public final int component7() {
        return this.f13073h;
    }

    public final String component8() {
        return this.f13074ua;
    }

    public final String component9() {
        return this.ifa;
    }

    public final DeviceNode copy(String make, String model, String osv, String str, String os, int i10, int i11, String str2, String str3, Integer num, VungleExt vungleExt) {
        t.f(make, "make");
        t.f(model, "model");
        t.f(osv, "osv");
        t.f(os, "os");
        return new DeviceNode(make, model, osv, str, os, i10, i11, str2, str3, num, vungleExt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) obj;
        return t.a(this.make, deviceNode.make) && t.a(this.model, deviceNode.model) && t.a(this.osv, deviceNode.osv) && t.a(this.carrier, deviceNode.carrier) && t.a(this.os, deviceNode.os) && this.f13075w == deviceNode.f13075w && this.f13073h == deviceNode.f13073h && t.a(this.f13074ua, deviceNode.f13074ua) && t.a(this.ifa, deviceNode.ifa) && t.a(this.lmt, deviceNode.lmt) && t.a(this.ext, deviceNode.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final VungleExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.f13073h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.f13074ua;
    }

    public final int getW() {
        return this.f13075w;
    }

    public int hashCode() {
        int iHashCode = ((((this.make.hashCode() * 31) + this.model.hashCode()) * 31) + this.osv.hashCode()) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.os.hashCode()) * 31) + Integer.hashCode(this.f13075w)) * 31) + Integer.hashCode(this.f13073h)) * 31;
        String str2 = this.f13074ua;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        VungleExt vungleExt = this.ext;
        return iHashCode5 + (vungleExt != null ? vungleExt.hashCode() : 0);
    }

    public final void setExt(VungleExt vungleExt) {
        this.ext = vungleExt;
    }

    public final void setH(int i10) {
        this.f13073h = i10;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.f13074ua = str;
    }

    public final void setW(int i10) {
        this.f13075w = i10;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.f13075w + ", h=" + this.f13073h + ", ua=" + this.f13074ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public DeviceNode(String str, String model, String osv, String str2, String os, int i10, int i11, String str3, String str4, Integer num, VungleExt vungleExt) {
        t.f(str, vgmm.LGs);
        t.f(model, "model");
        t.f(osv, "osv");
        t.f(os, "os");
        this.make = str;
        this.model = model;
        this.osv = osv;
        this.carrier = str2;
        this.os = os;
        this.f13075w = i10;
        this.f13073h = i11;
        this.f13074ua = str3;
        this.ifa = str4;
        this.lmt = num;
        this.ext = vungleExt;
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, k kVar) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, i10, i11, (i12 & 128) != 0 ? null : str6, (i12 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str7, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : vungleExt);
    }
}
