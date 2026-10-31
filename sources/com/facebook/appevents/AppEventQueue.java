package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: AppEventQueue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventQueue {
    private static final int FLUSH_PERIOD_IN_SECONDS = 15;
    private static final int NO_CONNECTIVITY_ERROR_CODE = -1;
    private static ScheduledFuture<?> scheduledFuture;
    public static final AppEventQueue INSTANCE = new AppEventQueue();
    private static final String TAG = AppEventQueue.class.getName();
    private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
    private static volatile AppEventCollection appEventCollection = new AppEventCollection();
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
    private static final Runnable flushRunnable = new Runnable() { // from class: com.facebook.appevents.h
        @Override // java.lang.Runnable
        public final void run() {
            AppEventQueue.flushRunnable$lambda$0();
        }
    };

    private AppEventQueue() {
    }

    public static final void add(final AccessTokenAppIdPair accessTokenAppId, final AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.t.f(appEvent, "appEvent");
            singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.g
                @Override // java.lang.Runnable
                public final void run() {
                    AppEventQueue.add$lambda$3(accessTokenAppId, appEvent);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add$lambda$3(AccessTokenAppIdPair accessTokenAppId, AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.t.f(appEvent, "$appEvent");
            appEventCollection.addEvent(accessTokenAppId, appEvent);
            if (AppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.getEventCount() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                flushAndWait(FlushReason.EVENT_THRESHOLD);
            } else if (scheduledFuture == null) {
                scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final GraphRequest buildRequestForSession(final AccessTokenAppIdPair accessTokenAppId, final SessionEventsState appEvents, boolean z10, final FlushStatistics flushState) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.t.f(appEvents, "appEvents");
            kotlin.jvm.internal.t.f(flushState, "flushState");
            String applicationId = accessTokenAppId.getApplicationId();
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(applicationId, false);
            GraphRequest.Companion companion = GraphRequest.Companion;
            l0 l0Var = l0.f21527a;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
            kotlin.jvm.internal.t.e(str, "format(format, *args)");
            final GraphRequest graphRequestNewPostRequest = companion.newPostRequest(null, str, null, null);
            graphRequestNewPostRequest.setForceApplicationRequest(true);
            Bundle parameters = graphRequestNewPostRequest.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            String accessTokenString = accessTokenAppId.getAccessTokenString();
            if (accessTokenString == null) {
                AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
                accessTokenString = currentAccessToken != null ? currentAccessToken.getToken() : null;
            }
            if (accessTokenString != null) {
                parameters.putString("access_token", accessTokenString);
            }
            String pushNotificationsRegistrationId = InternalAppEventsLogger.Companion.getPushNotificationsRegistrationId();
            if (pushNotificationsRegistrationId != null) {
                parameters.putString("device_token", pushNotificationsRegistrationId);
            }
            String installReferrer = AppEventsLoggerImpl.Companion.getInstallReferrer();
            if (installReferrer != null) {
                parameters.putString(Constants.INSTALL_REFERRER, installReferrer);
            }
            graphRequestNewPostRequest.setParameters(parameters);
            int iPopulateRequest = appEvents.populateRequest(graphRequestNewPostRequest, FacebookSdk.getApplicationContext(), fetchedAppSettingsQueryAppSettings != null ? fetchedAppSettingsQueryAppSettings.supportsImplicitLogging() : false, z10);
            if (iPopulateRequest == 0) {
                return null;
            }
            flushState.setNumEvents(flushState.getNumEvents() + iPopulateRequest);
            graphRequestNewPostRequest.setCallback(new GraphRequest.Callback() { // from class: com.facebook.appevents.d
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    AppEventQueue.buildRequestForSession$lambda$4(accessTokenAppId, graphRequestNewPostRequest, appEvents, flushState, graphResponse);
                }
            });
            return graphRequestNewPostRequest;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildRequestForSession$lambda$4(AccessTokenAppIdPair accessTokenAppId, GraphRequest postRequest, SessionEventsState appEvents, FlushStatistics flushState, GraphResponse response) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.t.f(postRequest, "$postRequest");
            kotlin.jvm.internal.t.f(appEvents, "$appEvents");
            kotlin.jvm.internal.t.f(flushState, "$flushState");
            kotlin.jvm.internal.t.f(response, "response");
            handleResponse(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final List<GraphRequest> buildRequests(AppEventCollection appEventCollection2, FlushStatistics flushResults) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.t.f(appEventCollection2, "appEventCollection");
            kotlin.jvm.internal.t.f(flushResults, "flushResults");
            boolean limitEventAndDataUsage = FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection2.keySet()) {
                SessionEventsState sessionEventsState = appEventCollection2.get(accessTokenAppIdPair);
                if (sessionEventsState == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                GraphRequest graphRequestBuildRequestForSession = buildRequestForSession(accessTokenAppIdPair, sessionEventsState, limitEventAndDataUsage, flushResults);
                if (graphRequestBuildRequestForSession != null) {
                    arrayList.add(graphRequestBuildRequestForSession);
                    if (AppEventsCAPIManager.INSTANCE.isEnabled$facebook_core_release()) {
                        AppEventsConversionsAPITransformerWebRequests.transformGraphRequestAndSendToCAPIGEndPoint(graphRequestBuildRequestForSession);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
            return null;
        }
    }

    public static final void flush(final FlushReason reason) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(reason, "reason");
            singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.e
                @Override // java.lang.Runnable
                public final void run() {
                    AppEventQueue.flush$lambda$2(reason);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flush$lambda$2(FlushReason reason) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(reason, "$reason");
            flushAndWait(reason);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final void flushAndWait(FlushReason reason) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(reason, "reason");
            appEventCollection.addPersistedEvents(AppEventDiskStore.readAndClearStore());
            try {
                FlushStatistics flushStatisticsSendEventsToServer = sendEventsToServer(reason, appEventCollection);
                if (flushStatisticsSendEventsToServer != null) {
                    Intent intent = new Intent(AppEventsLogger.ACTION_APP_EVENTS_FLUSHED);
                    intent.putExtra(AppEventsLogger.APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED, flushStatisticsSendEventsToServer.getNumEvents());
                    intent.putExtra(AppEventsLogger.APP_EVENTS_EXTRA_FLUSH_RESULT, flushStatisticsSendEventsToServer.getResult());
                    n0.a.b(FacebookSdk.getApplicationContext()).d(intent);
                }
            } catch (Exception e10) {
                Log.w(TAG, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushRunnable$lambda$0() {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            scheduledFuture = null;
            if (AppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                flushAndWait(FlushReason.TIMER);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final Set<AccessTokenAppIdPair> getKeySet() {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return null;
        }
        try {
            return appEventCollection.keySet();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
            return null;
        }
    }

    public static final void handleResponse(final AccessTokenAppIdPair accessTokenAppId, GraphRequest request, GraphResponse response, final SessionEventsState appEvents, FlushStatistics flushState) {
        String string;
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.t.f(request, "request");
            kotlin.jvm.internal.t.f(response, "response");
            kotlin.jvm.internal.t.f(appEvents, "appEvents");
            kotlin.jvm.internal.t.f(flushState, "flushState");
            FacebookRequestError error = response.getError();
            String str = "Success";
            FlushResult flushResult = FlushResult.SUCCESS;
            boolean z10 = true;
            if (error != null) {
                if (error.getErrorCode() == -1) {
                    str = "Failed: No Connectivity";
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    l0 l0Var = l0.f21527a;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), error.toString()}, 2));
                    kotlin.jvm.internal.t.e(str, "format(format, *args)");
                    flushResult = FlushResult.SERVER_ERROR;
                }
            }
            if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) request.getTag()).toString(2);
                    kotlin.jvm.internal.t.e(string, "{\n            val jsonAr…y.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String TAG2 = TAG;
                kotlin.jvm.internal.t.e(TAG2, "TAG");
                companion.log(loggingBehavior, TAG2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.getGraphObject()), str, string);
            }
            if (error == null) {
                z10 = false;
            }
            appEvents.clearInFlightAndStats(z10);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppEventQueue.handleResponse$lambda$5(accessTokenAppId, appEvents);
                    }
                });
            }
            if (flushResult == FlushResult.SUCCESS || flushState.getResult() == flushResult2) {
                return;
            }
            flushState.setResult(flushResult);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5(AccessTokenAppIdPair accessTokenAppId, SessionEventsState appEvents) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.t.f(appEvents, "$appEvents");
            AppEventStore.persistEvents(accessTokenAppId, appEvents);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final void persistToDisk() {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.f
                @Override // java.lang.Runnable
                public final void run() {
                    AppEventQueue.persistToDisk$lambda$1();
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistToDisk$lambda$1() {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return;
        }
        try {
            AppEventStore.persistEvents(appEventCollection);
            appEventCollection = new AppEventCollection();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
        }
    }

    public static final FlushStatistics sendEventsToServer(FlushReason reason, AppEventCollection appEventCollection2) {
        if (CrashShieldHandler.isObjectCrashing(AppEventQueue.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.t.f(reason, "reason");
            kotlin.jvm.internal.t.f(appEventCollection2, "appEventCollection");
            FlushStatistics flushStatistics = new FlushStatistics();
            List<GraphRequest> listBuildRequests = buildRequests(appEventCollection2, flushStatistics);
            if (!(!listBuildRequests.isEmpty())) {
                return null;
            }
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String TAG2 = TAG;
            kotlin.jvm.internal.t.e(TAG2, "TAG");
            companion.log(loggingBehavior, TAG2, "Flushing %d events due to %s.", Integer.valueOf(flushStatistics.getNumEvents()), reason.toString());
            Iterator<GraphRequest> it = listBuildRequests.iterator();
            while (it.hasNext()) {
                it.next().executeAndWait();
            }
            return flushStatistics;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventQueue.class);
            return null;
        }
    }
}
