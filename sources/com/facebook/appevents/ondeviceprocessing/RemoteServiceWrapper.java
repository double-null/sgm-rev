package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.FacebookSignatureValidator;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.ppml.receiver.IReceiverService;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: RemoteServiceWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteServiceWrapper {
    public static final String RECEIVER_SERVICE_ACTION = "ReceiverService";
    public static final String RECEIVER_SERVICE_PACKAGE = "com.facebook.katana";
    public static final String RECEIVER_SERVICE_PACKAGE_WAKIZASHI = "com.facebook.wakizashi";
    private static Boolean isServiceAvailable;
    public static final RemoteServiceWrapper INSTANCE = new RemoteServiceWrapper();
    private static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String eventType;

        EventType(String str) {
            this.eventType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.eventType;
        }
    }

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    private static final class RemoteServiceConnection implements ServiceConnection {
        private IBinder binder;
        private final CountDownLatch latch = new CountDownLatch(1);

        public final IBinder getBinder() throws InterruptedException {
            this.latch.await(5L, TimeUnit.SECONDS);
            return this.binder;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            t.f(name, "name");
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            t.f(name, "name");
            t.f(serviceBinder, "serviceBinder");
            this.binder = serviceBinder;
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            t.f(name, "name");
        }
    }

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    private RemoteServiceWrapper() {
    }

    private final Intent getVerifiedServiceIntent(Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent(RECEIVER_SERVICE_ACTION);
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && FacebookSignatureValidator.validateSignature(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent(RECEIVER_SERVICE_ACTION);
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null && FacebookSignatureValidator.validateSignature(context, "com.facebook.wakizashi")) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final boolean isServiceAvailable() {
        if (CrashShieldHandler.isObjectCrashing(RemoteServiceWrapper.class)) {
            return false;
        }
        try {
            if (isServiceAvailable == null) {
                isServiceAvailable = Boolean.valueOf(INSTANCE.getVerifiedServiceIntent(FacebookSdk.getApplicationContext()) != null);
            }
            Boolean bool = isServiceAvailable;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RemoteServiceWrapper.class);
            return false;
        }
    }

    public static final ServiceResult sendCustomEvents(String applicationId, List<AppEvent> appEvents) {
        if (CrashShieldHandler.isObjectCrashing(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            t.f(applicationId, "applicationId");
            t.f(appEvents, "appEvents");
            return INSTANCE.sendEvents(EventType.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RemoteServiceWrapper.class);
            return null;
        }
    }

    private final ServiceResult sendEvents(EventType eventType, String str, List<AppEvent> list) {
        ServiceResult serviceResult;
        String str2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ServiceResult serviceResult2 = ServiceResult.SERVICE_NOT_AVAILABLE;
            AppEventUtility.assertIsNotMainThread();
            Context applicationContext = FacebookSdk.getApplicationContext();
            Intent verifiedServiceIntent = getVerifiedServiceIntent(applicationContext);
            if (verifiedServiceIntent == null) {
                return serviceResult2;
            }
            RemoteServiceConnection remoteServiceConnection = new RemoteServiceConnection();
            try {
                if (!applicationContext.bindService(verifiedServiceIntent, remoteServiceConnection, 1)) {
                    return ServiceResult.SERVICE_ERROR;
                }
                try {
                    try {
                        IBinder binder = remoteServiceConnection.getBinder();
                        if (binder != null) {
                            IReceiverService iReceiverServiceAsInterface = IReceiverService.Stub.asInterface(binder);
                            Bundle bundleBuildEventsBundle = RemoteServiceParametersHelper.buildEventsBundle(eventType, str, list);
                            if (bundleBuildEventsBundle != null) {
                                iReceiverServiceAsInterface.sendEvents(bundleBuildEventsBundle);
                                Utility.logd(TAG, "Successfully sent events to the remote service: " + bundleBuildEventsBundle);
                            }
                            serviceResult2 = ServiceResult.OPERATION_SUCCESS;
                        }
                        return serviceResult2;
                    } catch (RemoteException e10) {
                        serviceResult = ServiceResult.SERVICE_ERROR;
                        str2 = TAG;
                        Utility.logd(str2, e10);
                        applicationContext.unbindService(remoteServiceConnection);
                        Utility.logd(str2, "Unbound from the remote service");
                        return serviceResult;
                    }
                } catch (InterruptedException e11) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    str2 = TAG;
                    Utility.logd(str2, e11);
                    applicationContext.unbindService(remoteServiceConnection);
                    Utility.logd(str2, "Unbound from the remote service");
                    return serviceResult;
                }
            } finally {
                applicationContext.unbindService(remoteServiceConnection);
                Utility.logd(TAG, "Unbound from the remote service");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final ServiceResult sendInstallEvent(String applicationId) {
        if (CrashShieldHandler.isObjectCrashing(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            t.f(applicationId, "applicationId");
            return INSTANCE.sendEvents(EventType.MOBILE_APP_INSTALL, applicationId, kotlin.collections.t.k());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RemoteServiceWrapper.class);
            return null;
        }
    }
}
