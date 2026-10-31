package com.facebook.appevents;

import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

/* JADX INFO: compiled from: AppEventStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventStore {
    public static final AppEventStore INSTANCE = new AppEventStore();
    private static final String TAG = AppEventStore.class.getName();

    private AppEventStore() {
    }

    public static final synchronized void persistEvents(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState appEvents) {
        if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            kotlin.jvm.internal.t.f(appEvents, "appEvents");
            AppEventUtility.assertIsNotMainThread();
            PersistedEvents andClearStore = AppEventDiskStore.readAndClearStore();
            andClearStore.addEvents(accessTokenAppIdPair, appEvents.getEventsToPersist());
            AppEventDiskStore.saveEventsToDisk$facebook_core_release(andClearStore);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventStore.class);
        }
    }

    public static final synchronized void persistEvents(AppEventCollection eventsToPersist) {
        if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(eventsToPersist, "eventsToPersist");
            AppEventUtility.assertIsNotMainThread();
            PersistedEvents andClearStore = AppEventDiskStore.readAndClearStore();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.keySet()) {
                SessionEventsState sessionEventsState = eventsToPersist.get(accessTokenAppIdPair);
                if (sessionEventsState != null) {
                    andClearStore.addEvents(accessTokenAppIdPair, sessionEventsState.getEventsToPersist());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            AppEventDiskStore.saveEventsToDisk$facebook_core_release(andClearStore);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventStore.class);
        }
    }
}
