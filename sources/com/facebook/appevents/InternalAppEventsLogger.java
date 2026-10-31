package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: InternalAppEventsLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InternalAppEventsLogger {
    public static final Companion Companion = new Companion(null);
    private final AppEventsLoggerImpl loggerImpl;

    /* JADX INFO: compiled from: InternalAppEventsLogger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ InternalAppEventsLogger createInstance$default(Companion companion, Context context, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.createInstance(context, str);
        }

        public final InternalAppEventsLogger createInstance(Context context) {
            return createInstance$default(this, context, null, 2, null);
        }

        public final Executor getAnalyticsExecutor() {
            return AppEventsLoggerImpl.Companion.getAnalyticsExecutor();
        }

        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.Companion.getFlushBehavior();
        }

        public final String getPushNotificationsRegistrationId() {
            return AppEventsLoggerImpl.Companion.getPushNotificationsRegistrationId();
        }

        public final void setInternalUserData(Map<String, String> ud2) {
            kotlin.jvm.internal.t.f(ud2, "ud");
            UserDataStore.setInternalUd(ud2);
        }

        public final void setUserData(Bundle bundle) {
            UserDataStore.setUserDataAndHash(bundle);
        }

        public final InternalAppEventsLogger createInstance(Context context, String str) {
            return new InternalAppEventsLogger(context, str);
        }

        public final InternalAppEventsLogger createInstance(String activityName, String str, AccessToken accessToken) {
            kotlin.jvm.internal.t.f(activityName, "activityName");
            return new InternalAppEventsLogger(activityName, str, accessToken);
        }
    }

    public InternalAppEventsLogger(AppEventsLoggerImpl loggerImpl) {
        kotlin.jvm.internal.t.f(loggerImpl, "loggerImpl");
        this.loggerImpl = loggerImpl;
    }

    public static final InternalAppEventsLogger createInstance(Context context) {
        return Companion.createInstance(context);
    }

    public static final Executor getAnalyticsExecutor() {
        return Companion.getAnalyticsExecutor();
    }

    public static final AppEventsLogger.FlushBehavior getFlushBehavior() {
        return Companion.getFlushBehavior();
    }

    public static final String getPushNotificationsRegistrationId() {
        return Companion.getPushNotificationsRegistrationId();
    }

    public static /* synthetic */ void logEventImplicitly$default(InternalAppEventsLogger internalAppEventsLogger, String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            operationalData = null;
        }
        internalAppEventsLogger.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
    }

    public static /* synthetic */ void logPurchaseImplicitly$default(InternalAppEventsLogger internalAppEventsLogger, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            operationalData = null;
        }
        internalAppEventsLogger.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
    }

    public static final void setInternalUserData(Map<String, String> map) {
        Companion.setInternalUserData(map);
    }

    public static final void setUserData(Bundle bundle) {
        Companion.setUserData(bundle);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final void logChangedSettingsEvent(Bundle parameters) {
        kotlin.jvm.internal.t.f(parameters, "parameters");
        if (((parameters.getInt("previous") & 2) != 0) || FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly("fb_sdk_settings_changed", null, parameters);
        }
    }

    public final void logEvent(String str, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(str, bundle);
        }
    }

    public final void logEventFromSE(String str, String str2) {
        this.loggerImpl.logEventFromSE(str, str2);
    }

    public final void logEventImplicitly(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, bigDecimal, currency, bundle, operationalData);
        }
    }

    public final void logPurchaseImplicitly(BigDecimal bigDecimal, Currency currency, Bundle bundle, OperationalData operationalData) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logPurchaseImplicitly(bigDecimal, currency, bundle, operationalData);
        }
    }

    public static final InternalAppEventsLogger createInstance(Context context, String str) {
        return Companion.createInstance(context, str);
    }

    public InternalAppEventsLogger(Context context) {
        this(new AppEventsLoggerImpl(context, (String) null, (AccessToken) null));
    }

    public static final InternalAppEventsLogger createInstance(String str, String str2, AccessToken accessToken) {
        return Companion.createInstance(str, str2, accessToken);
    }

    public final void logEvent(String str, double d10, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEvent(str, d10, bundle);
        }
    }

    public final void logEventImplicitly(String str) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, null, null);
        }
    }

    public InternalAppEventsLogger(Context context, String str) {
        this(new AppEventsLoggerImpl(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalAppEventsLogger(String activityName, String str, AccessToken accessToken) {
        this(new AppEventsLoggerImpl(activityName, str, accessToken));
        kotlin.jvm.internal.t.f(activityName, "activityName");
    }

    public final void logEventImplicitly(String str, Double d10, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, d10, bundle);
        }
    }

    public final void logEventImplicitly(String str, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.loggerImpl.logEventImplicitly(str, null, bundle);
        }
    }
}
