package com.facebook.appevents.gps.ara;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import id.l;
import java.net.URLEncoder;
import java.util.Iterator;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import qd.n;
import qd.r;
import rd.f0;
import wc.g0;

/* JADX INFO: compiled from: GpsAraTriggersManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GpsAraTriggersManager {
    private static final String GPS_PREFIX = "gps";
    public static final GpsAraTriggersManager INSTANCE = new GpsAraTriggersManager();
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String TAG;
    private static boolean enabled;
    private static GpsDebugLogger gpsDebugLogger;
    private static String serverUri;

    /* JADX INFO: renamed from: com.facebook.appevents.gps.ara.GpsAraTriggersManager$getEventParameters$1, reason: invalid class name */
    /* JADX INFO: compiled from: GpsAraTriggersManager.kt */
    static final class AnonymousClass1 extends u implements l<String, String> {
        final /* synthetic */ JSONObject $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JSONObject jSONObject) {
            super(1);
            this.$params = jSONObject;
        }

        @Override // id.l
        public final String invoke(String str) {
            Object objOpt = this.$params.opt(str);
            if (objOpt == null) {
                return null;
            }
            try {
                return URLEncoder.encode(str, Constants.ENCODING) + '=' + URLEncoder.encode(objOpt.toString(), Constants.ENCODING);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        String string = GpsAraTriggersManager.class.toString();
        t.e(string, "GpsAraTriggersManager::class.java.toString()");
        TAG = string;
    }

    private GpsAraTriggersManager() {
    }

    public static final /* synthetic */ GpsDebugLogger access$getGpsDebugLogger$p() {
        if (CrashShieldHandler.isObjectCrashing(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsAraTriggersManager.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (CrashShieldHandler.isObjectCrashing(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsAraTriggersManager.class);
            return null;
        }
    }

    private final boolean canRegisterTrigger() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (!enabled || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            GpsDebugLogger gpsDebugLogger2 = null;
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e10) {
                Log.i(TAG, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                if (gpsDebugLogger3 == null) {
                    t.u("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger3;
                }
                Bundle bundle = new Bundle();
                bundle.putString(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED_REASON, e10.toString());
                g0 g0Var = g0.f27756a;
                gpsDebugLogger2.log(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED, bundle);
                return false;
            } catch (Exception e11) {
                Log.i(TAG, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                GpsDebugLogger gpsDebugLogger4 = gpsDebugLogger;
                if (gpsDebugLogger4 == null) {
                    t.u("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger4;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED_REASON, e11.toString());
                g0 g0Var2 = g0.f27756a;
                gpsDebugLogger2.log(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED, bundle2);
                return false;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            enabled = true;
            gpsDebugLogger = new GpsDebugLogger(FacebookSdk.getApplicationContext());
            serverUri = "https://www." + FacebookSdk.getFacebookDomain() + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsAraTriggersManager.class);
        }
    }

    private final String getEventParameters(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = appEvent.getJSONObject();
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> itKeys = jSONObject.keys();
                t.e(itKeys, "params.keys()");
                return r.u(r.w(n.d(itKeys), new AnonymousClass1(jSONObject)), "&", null, null, 0, null, null, 62, null);
            }
            return "";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean isValidEvent(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            String eventName = appEvent.getJSONObject().getString(com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY);
            if (t.a(eventName, REPLACEMENT_STRING)) {
                return false;
            }
            t.e(eventName, "eventName");
            return !f0.U(eventName, GPS_PREFIX, false, 2, null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerTriggerAsync$lambda$0(String applicationId, AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            t.f(applicationId, "$applicationId");
            t.f(event, "$event");
            INSTANCE.registerTrigger(applicationId, event);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, GpsAraTriggersManager.class);
        }
    }

    public final void registerTrigger(String applicationId, AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            t.f(applicationId, "applicationId");
            t.f(event, "event");
            if (isValidEvent(event) && canRegisterTrigger()) {
                Context applicationContext = FacebookSdk.getApplicationContext();
                GpsDebugLogger gpsDebugLogger2 = null;
                try {
                    MeasurementManager measurementManager = (MeasurementManager) applicationContext.getSystemService(MeasurementManager.class);
                    if (measurementManager == null) {
                        measurementManager = MeasurementManager.get(applicationContext.getApplicationContext());
                    }
                    if (measurementManager == null) {
                        Log.w(TAG, "FAILURE_GET_MEASUREMENT_MANAGER");
                        GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                        if (gpsDebugLogger3 == null) {
                            t.u("gpsDebugLogger");
                            gpsDebugLogger3 = null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED_REASON, "Failed to get measurement manager");
                        g0 g0Var = g0.f27756a;
                        gpsDebugLogger3.log(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED, bundle);
                        return;
                    }
                    String eventParameters = getEventParameters(event);
                    StringBuilder sb2 = new StringBuilder();
                    String str = serverUri;
                    if (str == null) {
                        t.u("serverUri");
                        str = null;
                    }
                    sb2.append(str);
                    sb2.append('?');
                    sb2.append("app_id");
                    sb2.append('=');
                    sb2.append(applicationId);
                    sb2.append('&');
                    sb2.append(eventParameters);
                    Uri uri = Uri.parse(sb2.toString());
                    t.e(uri, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                    measurementManager.registerTrigger(uri, FacebookSdk.getExecutor(), new OutcomeReceiver<Object, Exception>() { // from class: com.facebook.appevents.gps.ara.GpsAraTriggersManager$registerTrigger$outcomeReceiver$1
                        @Override // android.os.OutcomeReceiver
                        public void onResult(Object result) {
                            t.f(result, "result");
                            Log.d(GpsAraTriggersManager.access$getTAG$p(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
                            GpsDebugLogger gpsDebugLoggerAccess$getGpsDebugLogger$p = GpsAraTriggersManager.access$getGpsDebugLogger$p();
                            if (gpsDebugLoggerAccess$getGpsDebugLogger$p == null) {
                                t.u("gpsDebugLogger");
                                gpsDebugLoggerAccess$getGpsDebugLogger$p = null;
                            }
                            gpsDebugLoggerAccess$getGpsDebugLogger$p.log(com.facebook.appevents.internal.Constants.GPS_ARA_SUCCEED, null);
                        }

                        @Override // android.os.OutcomeReceiver
                        public void onError(Exception error) {
                            t.f(error, "error");
                            Log.d(GpsAraTriggersManager.access$getTAG$p(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
                            GpsDebugLogger gpsDebugLoggerAccess$getGpsDebugLogger$p = GpsAraTriggersManager.access$getGpsDebugLogger$p();
                            if (gpsDebugLoggerAccess$getGpsDebugLogger$p == null) {
                                t.u("gpsDebugLogger");
                                gpsDebugLoggerAccess$getGpsDebugLogger$p = null;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED_REASON, error.toString());
                            g0 g0Var2 = g0.f27756a;
                            gpsDebugLoggerAccess$getGpsDebugLogger$p.log(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED, bundle2);
                        }
                    });
                } catch (Error e10) {
                    Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    GpsDebugLogger gpsDebugLogger4 = gpsDebugLogger;
                    if (gpsDebugLogger4 == null) {
                        t.u("gpsDebugLogger");
                    } else {
                        gpsDebugLogger2 = gpsDebugLogger4;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED_REASON, e10.toString());
                    g0 g0Var2 = g0.f27756a;
                    gpsDebugLogger2.log(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED, bundle2);
                } catch (Exception e11) {
                    Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    GpsDebugLogger gpsDebugLogger5 = gpsDebugLogger;
                    if (gpsDebugLogger5 == null) {
                        t.u("gpsDebugLogger");
                    } else {
                        gpsDebugLogger2 = gpsDebugLogger5;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED_REASON, e11.toString());
                    g0 g0Var3 = g0.f27756a;
                    gpsDebugLogger2.log(com.facebook.appevents.internal.Constants.GPS_ARA_FAILED, bundle3);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void registerTriggerAsync(final String applicationId, final AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            t.f(applicationId, "applicationId");
            t.f(event, "event");
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.gps.ara.a
                @Override // java.lang.Runnable
                public final void run() {
                    GpsAraTriggersManager.registerTriggerAsync$lambda$0(applicationId, event);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
