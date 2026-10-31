package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wc.g0;

/* JADX INFO: compiled from: SessionEventsState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SessionEventsState {
    private List<AppEvent> accumulatedEvents;
    private final String anonymousAppDeviceGUID;
    private final AttributionIdentifiers attributionIdentifiers;
    private final List<AppEvent> inFlightEvents;
    private int numSkippedEventsDueToFullBuffer;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = SessionEventsState.class.getSimpleName();
    private static final int MAX_ACCUMULATED_LOG_EVENTS = 1000;

    /* JADX INFO: compiled from: SessionEventsState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public SessionEventsState(AttributionIdentifiers attributionIdentifiers, String anonymousAppDeviceGUID) {
        kotlin.jvm.internal.t.f(attributionIdentifiers, "attributionIdentifiers");
        kotlin.jvm.internal.t.f(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.attributionIdentifiers = attributionIdentifiers;
        this.anonymousAppDeviceGUID = anonymousAppDeviceGUID;
        this.accumulatedEvents = new ArrayList();
        this.inFlightEvents = new ArrayList();
    }

    public final synchronized void accumulatePersistedEvents(List<AppEvent> events) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(events, "events");
            this.accumulatedEvents.addAll(events);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void addEvent(AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(event, "event");
            if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= MAX_ACCUMULATED_LOG_EVENTS) {
                this.numSkippedEventsDueToFullBuffer++;
            } else {
                this.accumulatedEvents.add(event);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void clearInFlightAndStats(boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (z10) {
            try {
                this.accumulatedEvents.addAll(this.inFlightEvents);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    public final synchronized int getAccumulatedEventCount() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final synchronized List<AppEvent> getEventsToPersist() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            List<AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new ArrayList();
            return list;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int populateRequest(GraphRequest request, Context applicationContext, boolean z10, boolean z11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.t.f(request, "request");
            kotlin.jvm.internal.t.f(applicationContext, "applicationContext");
            synchronized (this) {
                int i10 = this.numSkippedEventsDueToFullBuffer;
                EventDeactivationManager.processEvents(this.accumulatedEvents);
                this.inFlightEvents.addAll(this.accumulatedEvents);
                this.accumulatedEvents.clear();
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (AppEvent appEvent : this.inFlightEvents) {
                    if (z10 || !appEvent.isImplicit()) {
                        jSONArray.put(appEvent.getJsonObject());
                        jSONArray2.put(appEvent.getOperationalJsonObject());
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                g0 g0Var = g0.f27756a;
                populateRequest(request, applicationContext, i10, jSONArray, jSONArray2, z11);
                return jSONArray.length();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    private final void populateRequest(GraphRequest graphRequest, Context context, int i10, JSONArray jSONArray, JSONArray jSONArray2, boolean z10) {
        JSONObject jSONObject;
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                jSONObject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, z10, context);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.setGraphObject(jSONObject);
            Bundle parameters = graphRequest.getParameters();
            String string = jSONArray.toString();
            kotlin.jvm.internal.t.e(string, "events.toString()");
            parameters.putString("custom_events", string);
            if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib5To7)) {
                parameters.putString("operational_parameters", jSONArray2.toString());
            }
            graphRequest.setTag(string);
            graphRequest.setParameters(parameters);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
