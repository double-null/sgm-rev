package com.facebook.appevents.gps.pa;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.util.concurrent.Executors;
import kotlin.collections.s;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;
import rd.f0;
import wc.g0;

/* JADX INFO: compiled from: PACustomAudienceClient.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PACustomAudienceClient {
    private static final String BUYER = "facebook.com";
    private static final String DELIMITER = "@";
    private static final String EVENT_NAME_CONFIG_VERSION = "1";
    private static final String GPS_PREFIX = "gps";
    private static final String REPLACEMENT_STRING = "_removed_";
    private static String baseUri;
    private static CustomAudienceManager customAudienceManager;
    private static boolean enabled;
    private static GpsDebugLogger gpsDebugLogger;
    private static boolean isInitialized;
    public static final PACustomAudienceClient INSTANCE = new PACustomAudienceClient();
    private static final String TAG = "Fledge: " + PACustomAudienceClient.class.getSimpleName();

    private PACustomAudienceClient() {
    }

    public static final /* synthetic */ GpsDebugLogger access$getGpsDebugLogger$p() {
        if (CrashShieldHandler.isObjectCrashing(PACustomAudienceClient.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PACustomAudienceClient.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (CrashShieldHandler.isObjectCrashing(PACustomAudienceClient.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PACustomAudienceClient.class);
            return null;
        }
    }

    public static final void enable() {
        String string;
        if (CrashShieldHandler.isObjectCrashing(PACustomAudienceClient.class)) {
            return;
        }
        try {
            isInitialized = true;
            Context applicationContext = FacebookSdk.getApplicationContext();
            gpsDebugLogger = new GpsDebugLogger(applicationContext);
            baseUri = "https://www." + FacebookSdk.getFacebookDomain() + "/privacy_sandbox/pa/logic";
            GpsDebugLogger gpsDebugLogger2 = null;
            try {
                CustomAudienceManager customAudienceManager2 = CustomAudienceManager.get(applicationContext);
                customAudienceManager = customAudienceManager2;
                if (customAudienceManager2 != null) {
                    enabled = true;
                }
                string = null;
            } catch (Error e10) {
                string = e10.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e10);
            } catch (Exception e11) {
                string = e11.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e11);
            }
            if (enabled) {
                return;
            }
            GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
            if (gpsDebugLogger3 == null) {
                t.u("gpsDebugLogger");
            } else {
                gpsDebugLogger2 = gpsDebugLogger3;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Constants.GPS_PA_FAILED_REASON, string);
            g0 g0Var = g0.f27756a;
            gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, PACustomAudienceClient.class);
        }
    }

    private final void joinCustomAudienceImpl(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String strValidateAndCreateCAName = validateAndCreateCAName(str, str2);
            if (strValidateAndCreateCAName == null) {
                return;
            }
            GpsDebugLogger gpsDebugLogger2 = null;
            try {
                OutcomeReceiver<Object, Exception> outcomeReceiver = new OutcomeReceiver<Object, Exception>() { // from class: com.facebook.appevents.gps.pa.PACustomAudienceClient$joinCustomAudienceImpl$callback$1
                    @Override // android.os.OutcomeReceiver
                    public void onError(Exception error) {
                        t.f(error, "error");
                        Log.e(PACustomAudienceClient.access$getTAG$p(), error.toString());
                        GpsDebugLogger gpsDebugLoggerAccess$getGpsDebugLogger$p = PACustomAudienceClient.access$getGpsDebugLogger$p();
                        if (gpsDebugLoggerAccess$getGpsDebugLogger$p == null) {
                            t.u("gpsDebugLogger");
                            gpsDebugLoggerAccess$getGpsDebugLogger$p = null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants.GPS_PA_FAILED_REASON, error.toString());
                        g0 g0Var = g0.f27756a;
                        gpsDebugLoggerAccess$getGpsDebugLogger$p.log(Constants.GPS_PA_FAILED, bundle);
                    }

                    @Override // android.os.OutcomeReceiver
                    public void onResult(Object result) {
                        t.f(result, "result");
                        Log.i(PACustomAudienceClient.access$getTAG$p(), CwEo.zExREHyNskUcNOk);
                        GpsDebugLogger gpsDebugLoggerAccess$getGpsDebugLogger$p = PACustomAudienceClient.access$getGpsDebugLogger$p();
                        if (gpsDebugLoggerAccess$getGpsDebugLogger$p == null) {
                            t.u("gpsDebugLogger");
                            gpsDebugLoggerAccess$getGpsDebugLogger$p = null;
                        }
                        gpsDebugLoggerAccess$getGpsDebugLogger$p.log(Constants.GPS_PA_SUCCEED, null);
                    }
                };
                AdData.Builder builder = new AdData.Builder();
                StringBuilder sb2 = new StringBuilder();
                String str3 = baseUri;
                if (str3 == null) {
                    t.u("baseUri");
                    str3 = null;
                }
                sb2.append(str3);
                sb2.append("/ad");
                Uri uri = Uri.parse(sb2.toString());
                t.b(uri, "Uri.parse(this)");
                AdData adDataBuild = builder.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                t.e(adDataBuild, "Builder()\n              …\n                .build()");
                TrustedBiddingData.Builder builder2 = new TrustedBiddingData.Builder();
                StringBuilder sb3 = new StringBuilder();
                String str4 = baseUri;
                if (str4 == null) {
                    t.u("baseUri");
                    str4 = null;
                }
                sb3.append(str4);
                sb3.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb3.toString());
                t.b(uri2, "Uri.parse(this)");
                TrustedBiddingData trustedBiddingDataBuild = builder2.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(s.e("")).build();
                t.e(trustedBiddingDataBuild, "Builder()\n              …\n                .build()");
                CustomAudience.Builder buyer = new CustomAudience.Builder().setName(strValidateAndCreateCAName).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb4 = new StringBuilder();
                String str5 = baseUri;
                if (str5 == null) {
                    t.u("baseUri");
                    str5 = null;
                }
                sb4.append(str5);
                sb4.append("?daily&app_id=");
                sb4.append(str);
                Uri uri3 = Uri.parse(sb4.toString());
                t.b(uri3, "Uri.parse(this)");
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                StringBuilder sb5 = new StringBuilder();
                String str6 = baseUri;
                if (str6 == null) {
                    t.u("baseUri");
                    str6 = null;
                }
                sb5.append(str6);
                sb5.append("?bidding");
                Uri uri4 = Uri.parse(sb5.toString());
                t.b(uri4, "Uri.parse(this)");
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString(JsonUtils.EMPTY_JSON)).setAds(s.e(adDataBuild)).build();
                t.e(customAudienceBuild, "Builder()\n              …(listOf(dummyAd)).build()");
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = new JoinCustomAudienceRequest.Builder().setCustomAudience(customAudienceBuild).build();
                t.e(joinCustomAudienceRequestBuild, "Builder().setCustomAudience(ca).build()");
                CustomAudienceManager customAudienceManager2 = customAudienceManager;
                if (customAudienceManager2 != null) {
                    customAudienceManager2.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), outcomeReceiver);
                }
            } catch (Error e10) {
                Log.w(TAG, "Failed to join Custom Audience: " + e10);
                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                if (gpsDebugLogger3 == null) {
                    t.u("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger3;
                }
                Bundle bundle = new Bundle();
                bundle.putString(Constants.GPS_PA_FAILED_REASON, e10.toString());
                g0 g0Var = g0.f27756a;
                gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle);
            } catch (Exception e11) {
                Log.w(TAG, "Failed to join Custom Audience: " + e11);
                GpsDebugLogger gpsDebugLogger4 = gpsDebugLogger;
                if (gpsDebugLogger4 == null) {
                    t.u("gpsDebugLogger");
                } else {
                    gpsDebugLogger2 = gpsDebugLogger4;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(Constants.GPS_PA_FAILED_REASON, e11.toString());
                g0 g0Var2 = g0.f27756a;
                gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final String validateAndCreateCAName(String str, String str2) {
        if (!CrashShieldHandler.isObjectCrashing(this) && str != null && str2 != null) {
            try {
                if (!t.a(str2, REPLACEMENT_STRING) && !f0.U(str2, GPS_PREFIX, false, 2, null)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / ((long) 1000)) + "@1";
                }
                return null;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
        return null;
    }

    public final void joinCustomAudience(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                enable();
            }
            if (enabled) {
                joinCustomAudienceImpl(str, str2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void joinCustomAudience(String str, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                enable();
            }
            if (enabled) {
                String string = null;
                if (appEvent != null) {
                    try {
                        JSONObject jSONObject = appEvent.getJSONObject();
                        if (jSONObject != null) {
                            string = jSONObject.getString(Constants.EVENT_NAME_EVENT_KEY);
                        }
                    } catch (JSONException unused) {
                        Log.w(TAG, "Failed to get event name from event.");
                    }
                }
                joinCustomAudienceImpl(str, string);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
