package com.facebook.appevents.cloudbridge;

import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventParameters;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum AppEventUserAndAppDataField {
    ANON_ID(TwDPD.lqdSz),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER(Constants.INSTALL_REFERRER),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA(AppLovinEventParameters.IN_APP_PURCHASE_DATA),
    URL_SCHEMES("url_schemes"),
    ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP(WKirgUEJJ.HaJdVkzn);

    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final AppEventUserAndAppDataField invoke(String rawValue) {
            t.f(rawValue, "rawValue");
            for (AppEventUserAndAppDataField appEventUserAndAppDataField : AppEventUserAndAppDataField.values()) {
                if (t.a(appEventUserAndAppDataField.getRawValue(), rawValue)) {
                    return appEventUserAndAppDataField;
                }
            }
            return null;
        }
    }

    AppEventUserAndAppDataField(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
