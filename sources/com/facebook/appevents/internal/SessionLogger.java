package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SessionLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SessionLogger {
    public static final SessionLogger INSTANCE = new SessionLogger();
    private static final String TAG = SessionLogger.class.getCanonicalName();
    private static final long[] INACTIVE_SECONDS_QUANTA = {300000, 900000, 1800000, 3600000, 21600000, 43200000, SignalManager.TWENTY_FOUR_HOURS_MILLIS, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private SessionLogger() {
    }

    public static final int getQuantaIndex(long j10) {
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    break;
                }
                i10++;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, SessionLogger.class);
                return 0;
            }
        }
        return i10;
    }

    public static final void logActivateApp(String activityName, SourceApplicationInfo sourceApplicationInfo, String str, Context context) {
        String string;
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return;
        }
        try {
            t.f(activityName, "activityName");
            t.f(context, "context");
            if (sourceApplicationInfo == null || (string = sourceApplicationInfo.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, string);
            InternalAppEventsLogger.Companion companion = InternalAppEventsLogger.Companion;
            InternalAppEventsLogger internalAppEventsLoggerCreateInstance = companion.createInstance(activityName, str, null);
            internalAppEventsLoggerCreateInstance.logEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, bundle);
            if (companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                internalAppEventsLoggerCreateInstance.flush();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SessionLogger.class);
        }
    }

    private final void logClockSkewEvent() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            t.c(str);
            companion.log(loggingBehavior, str, "Clock skew detected");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void logDeactivateApp(String activityName, SessionInfo sessionInfo, String str) {
        long jLongValue;
        String string;
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return;
        }
        try {
            t.f(activityName, "activityName");
            if (sessionInfo == null) {
                return;
            }
            Long diskRestoreTime = sessionInfo.getDiskRestoreTime();
            if (diskRestoreTime != null) {
                jLongValue = diskRestoreTime.longValue();
            } else {
                Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                jLongValue = 0 - (sessionLastEventTime != null ? sessionLastEventTime.longValue() : 0L);
            }
            if (jLongValue < 0) {
                INSTANCE.logClockSkewEvent();
                jLongValue = 0;
            }
            long sessionLength = sessionInfo.getSessionLength();
            if (sessionLength < 0) {
                INSTANCE.logClockSkewEvent();
                sessionLength = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(AppEventsConstants.EVENT_NAME_SESSION_INTERRUPTIONS, sessionInfo.getInterruptionCount());
            l0 l0Var = l0.f21527a;
            String str2 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(getQuantaIndex(jLongValue))}, 1));
            t.e(str2, "format(locale, format, *args)");
            bundle.putString(AppEventsConstants.EVENT_NAME_TIME_BETWEEN_SESSIONS, str2);
            SourceApplicationInfo sourceApplicationInfo = sessionInfo.getSourceApplicationInfo();
            if (sourceApplicationInfo == null || (string = sourceApplicationInfo.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, string);
            Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
            bundle.putLong(Constants.LOG_TIME_APP_EVENT_KEY, (sessionLastEventTime2 != null ? sessionLastEventTime2.longValue() : 0L) / ((long) 1000));
            InternalAppEventsLogger.Companion.createInstance(activityName, str, null).logEvent(AppEventsConstants.EVENT_NAME_DEACTIVATED_APP, sessionLength / 1000, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SessionLogger.class);
        }
    }
}
