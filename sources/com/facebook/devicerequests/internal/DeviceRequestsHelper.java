package com.facebook.devicerequests.internal;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.c;
import com.google.zxing.d;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;
import p4.b;
import rd.c0;

/* JADX INFO: compiled from: DeviceRequestsHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DeviceRequestsHelper {
    public static final String DEVICE_INFO_DEVICE = "device";
    public static final String DEVICE_INFO_MODEL = "model";
    public static final String DEVICE_INFO_PARAM = "device_info";
    public static final String DEVICE_TARGET_USER_ID = "target_user_id";
    public static final String SDK_FLAVOR = "android";
    public static final String SDK_HEADER = "fbsdk";
    public static final String SERVICE_TYPE = "_fb._tcp.";
    public static final DeviceRequestsHelper INSTANCE = new DeviceRequestsHelper();
    private static final String TAG = DeviceRequestsHelper.class.getCanonicalName();
    private static final HashMap<String, NsdManager.RegistrationListener> deviceRequestsListeners = new HashMap<>();

    private DeviceRequestsHelper() {
    }

    public static final void cleanUpAdvertisementService(String str) {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return;
        }
        try {
            INSTANCE.cleanUpAdvertisementServiceImpl(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
        }
    }

    private final void cleanUpAdvertisementServiceImpl(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = deviceRequestsListeners.get(str);
            if (registrationListener != null) {
                Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
                t.d(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    Utility.logd(TAG, e10);
                }
                deviceRequestsListeners.remove(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final Bitmap generateQRCode(String str) {
        Bitmap bitmap = null;
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put(c.MARGIN, 2);
            try {
                b bVarA = new d().a(str, a.QR_CODE, 200, 200, enumMap);
                int iH = bVarA.h();
                int i10 = bVarA.i();
                int[] iArr = new int[iH * i10];
                for (int i11 = 0; i11 < iH; i11++) {
                    int i12 = i11 * i10;
                    for (int i13 = 0; i13 < i10; i13++) {
                        iArr[i12 + i13] = bVarA.g(i13, i11) ? -16777216 : -1;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, iH, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.setPixels(iArr, 0, i10, 0, 0, i10, iH);
                    return bitmapCreateBitmap;
                } catch (WriterException unused) {
                    bitmap = bitmapCreateBitmap;
                    return bitmap;
                }
            } catch (WriterException unused2) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
            return null;
        }
    }

    public static final String getDeviceInfo(Map<String, String> map) {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        t.e(DEVICE, "DEVICE");
        map.put(DEVICE_INFO_DEVICE, DEVICE);
        String MODEL = Build.MODEL;
        t.e(MODEL, "MODEL");
        map.put(DEVICE_INFO_MODEL, MODEL);
        String string = new JSONObject(map).toString();
        t.e(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return string;
    }

    public static final boolean isAvailable() {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return false;
        }
        try {
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            return appSettingsWithoutQuery != null && appSettingsWithoutQuery.getSmartLoginOptions().contains(SmartLoginOption.Enabled);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
            return false;
        }
    }

    public static final boolean startAdvertisementService(String str) {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return false;
        }
        try {
            if (isAvailable()) {
                return INSTANCE.startAdvertisementServiceImpl(str);
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
            return false;
        }
    }

    private final boolean startAdvertisementServiceImpl(final String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> map = deviceRequestsListeners;
            if (map.containsKey(str)) {
                return true;
            }
            final String str2 = "fbsdk_" + ("android-" + c0.J(FacebookSdk.getSdkVersion(), '.', '|', false, 4, null)) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType(SERVICE_TYPE);
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
            t.d(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
            NsdManager.RegistrationListener registrationListener = new NsdManager.RegistrationListener() { // from class: com.facebook.devicerequests.internal.DeviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1
                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
                    t.f(serviceInfo, "serviceInfo");
                    DeviceRequestsHelper.cleanUpAdvertisementService(str);
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
                    t.f(NsdServiceInfo, "NsdServiceInfo");
                    if (t.a(str2, NsdServiceInfo.getServiceName())) {
                        return;
                    }
                    DeviceRequestsHelper.cleanUpAdvertisementService(str);
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
                    t.f(serviceInfo, "serviceInfo");
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo2) {
                    t.f(nsdServiceInfo2, sRGQSqxgxlS.EEsRzoYsxtDuiZ);
                }
            };
            map.put(str, registrationListener);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, registrationListener);
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final String getDeviceInfo() {
        if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
            return null;
        }
        try {
            return getDeviceInfo(null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceRequestsHelper.class);
            return null;
        }
    }
}
