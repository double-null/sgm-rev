package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Set;
import kotlin.collections.s;
import kotlin.collections.u0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: OnDeviceProcessingManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OnDeviceProcessingManager {
    public static final OnDeviceProcessingManager INSTANCE = new OnDeviceProcessingManager();
    private static final Set<String> ALLOWED_IMPLICIT_EVENTS = u0.i(AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_START_TRIAL, AppEventsConstants.EVENT_NAME_SUBSCRIBE);

    private OnDeviceProcessingManager() {
    }

    private final boolean isEventEligibleForOnDeviceProcessing(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return (appEvent.isImplicit() ^ true) || (appEvent.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(appEvent.getName()));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isOnDeviceProcessingEnabled() {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return false;
        }
        try {
            return (!FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext()) && !Utility.isDataProcessingRestricted()) && RemoteServiceWrapper.isServiceAvailable();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
            return false;
        }
    }

    public static final void sendCustomEventAsync(final String applicationId, final AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            t.f(applicationId, "applicationId");
            t.f(event, "event");
            if (INSTANCE.isEventEligibleForOnDeviceProcessing(event)) {
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.ondeviceprocessing.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        OnDeviceProcessingManager.sendCustomEventAsync$lambda$1(applicationId, event);
                    }
                });
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCustomEventAsync$lambda$1(String applicationId, AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            t.f(applicationId, "$applicationId");
            t.f(event, "$event");
            RemoteServiceWrapper.sendCustomEvents(applicationId, s.e(event));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
        }
    }

    public static final void sendInstallEventAsync(final String str, final String str2) {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            final Context applicationContext = FacebookSdk.getApplicationContext();
            if (applicationContext == null || str == null || str2 == null) {
                return;
            }
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.ondeviceprocessing.a
                @Override // java.lang.Runnable
                public final void run() {
                    OnDeviceProcessingManager.sendInstallEventAsync$lambda$0(applicationContext, str2, str);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInstallEventAsync$lambda$0(Context context, String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            t.f(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                RemoteServiceWrapper.sendInstallEvent(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, OnDeviceProcessingManager.class);
        }
    }
}
