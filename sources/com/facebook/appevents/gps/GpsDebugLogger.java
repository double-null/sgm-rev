package com.facebook.appevents.gps;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import md.d;
import rd.f0;

/* JADX INFO: compiled from: GpsDebugLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GpsDebugLogger {
    public static final Companion Companion = new Companion(null);
    private static final String GPS_PREFIX = "gps";
    private static final double LOGGING_SAMPLING_RATE = 1.0E-4d;
    private static final boolean shouldLog;
    private final InternalAppEventsLogger internalAppEventsLogger;

    /* JADX INFO: compiled from: GpsDebugLogger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    static {
        shouldLog = d.f22262a.e() <= LOGGING_SAMPLING_RATE;
    }

    public GpsDebugLogger(Context context) {
        t.f(context, "context");
        this.internalAppEventsLogger = new InternalAppEventsLogger(context);
    }

    private final boolean isGPSDebugEvent(String str) {
        if (str != null) {
            return f0.U(str, GPS_PREFIX, false, 2, null);
        }
        return false;
    }

    public final void log(String str, Bundle bundle) {
        if (shouldLog && isGPSDebugEvent(str)) {
            this.internalAppEventsLogger.logEventImplicitly(str, bundle);
        }
    }
}
