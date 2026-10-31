package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CustomTabUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabUtils {
    public static final CustomTabUtils INSTANCE = new CustomTabUtils();
    private static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private CustomTabUtils() {
    }

    public static final String getChromePackage() {
        if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            return null;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            List<ResolveInfo> listQueryIntentServices = applicationContext.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            kotlin.jvm.internal.t.e(listQueryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
            HashSet hashSetV = kotlin.collections.o.V(CHROME_PACKAGES);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSetV.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
            return null;
        }
    }

    public static final String getDefaultRedirectURI() {
        if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            return null;
        }
        try {
            return Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX + FacebookSdk.getApplicationContext().getPackageName();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
            return null;
        }
    }

    public static final String getValidRedirectURI(String developerDefinedRedirectURI) {
        if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.t.f(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            if (Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), getDefaultRedirectURI()) ? getDefaultRedirectURI() : "";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
            return null;
        }
    }
}
