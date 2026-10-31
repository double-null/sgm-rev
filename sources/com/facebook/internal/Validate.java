package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: Validate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Validate {
    private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
    private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
    public static final String CUSTOM_TAB_REDIRECT_URI_PREFIX = "fbconnect://cct.";
    private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
    private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
    public static final Validate INSTANCE = new Validate();
    private static final String TAG = Validate.class.getName();

    private Validate() {
    }

    public static final void containsNoNullOrEmpty(Collection<String> container, String name) {
        kotlin.jvm.internal.t.f(container, "container");
        kotlin.jvm.internal.t.f(name, "name");
        for (String str : container) {
            if (str == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException(("Container '" + name + "' cannot contain empty values").toString());
            }
        }
    }

    public static final <T> void containsNoNulls(Collection<? extends T> container, String name) {
        kotlin.jvm.internal.t.f(container, "container");
        kotlin.jvm.internal.t.f(name, "name");
        Iterator<? extends T> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    public static final String hasAppID() {
        String applicationId = FacebookSdk.getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    public static final boolean hasBluetoothPermission(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return hasPermission(context, "android.permission.BLUETOOTH") && hasPermission(context, "android.permission.BLUETOOTH_ADMIN");
    }

    public static final boolean hasChangeWifiStatePermission(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return hasPermission(context, "android.permission.CHANGE_WIFI_STATE");
    }

    public static final String hasClientToken() {
        String clientToken = FacebookSdk.getClientToken();
        if (clientToken != null) {
            return clientToken;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    public static final void hasContentProvider(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        String strHasAppID = hasAppID();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String str = CONTENT_PROVIDER_BASE + strHasAppID;
            if (packageManager.resolveContentProvider(str, 0) != null) {
                return;
            }
            l0 l0Var = l0.f21527a;
            String str2 = String.format(CONTENT_PROVIDER_NOT_FOUND_REASON, Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.t.e(str2, "format(format, *args)");
            throw new IllegalStateException(str2.toString());
        }
    }

    public static final boolean hasCustomTabRedirectActivity(Context context, String redirectURI) {
        List<ResolveInfo> listQueryIntentActivities;
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!kotlin.jvm.internal.t.a(activityInfo.name, "com.facebook.CustomTabActivity") || !kotlin.jvm.internal.t.a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public static final void hasFacebookActivity(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        hasFacebookActivity(context, true);
    }

    public static final void hasInternetPermissions(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        hasInternetPermissions(context, true);
    }

    public static final boolean hasLocationPermission(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static final boolean hasPermission(Context context, String permission) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(permission, "permission");
        return context.checkCallingOrSelfPermission(permission) == 0;
    }

    public static final boolean hasWiFiPermission(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return hasPermission(context, "android.permission.ACCESS_WIFI_STATE");
    }

    public static final <T> void notEmpty(Collection<? extends T> container, String name) {
        kotlin.jvm.internal.t.f(container, "container");
        kotlin.jvm.internal.t.f(name, "name");
        if (!container.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
    }

    public static final <T> void notEmptyAndContainsNoNulls(Collection<? extends T> container, String name) {
        kotlin.jvm.internal.t.f(container, "container");
        kotlin.jvm.internal.t.f(name, "name");
        containsNoNulls(container, name);
        notEmpty(container, name);
    }

    public static final void notNull(Object obj, String name) {
        kotlin.jvm.internal.t.f(name, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    public static final String notNullOrEmpty(String str, String name) {
        kotlin.jvm.internal.t.f(name, "name");
        boolean z10 = false;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            }
        }
        if (z10) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    public static final void oneOf(Object obj, String name, Object... values) {
        kotlin.jvm.internal.t.f(name, "name");
        kotlin.jvm.internal.t.f(values, "values");
        for (Object obj2 : values) {
            if (kotlin.jvm.internal.t.a(obj2, obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Argument '" + name + "' was not one of the allowed values");
    }

    public static final void runningOnUiThread() {
        if (!kotlin.jvm.internal.t.a(Looper.getMainLooper(), Looper.myLooper())) {
            throw new FacebookException("This method should be called from the UI thread");
        }
    }

    public static final void sdkInitialized() {
        if (!FacebookSdk.isInitialized()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final void hasFacebookActivity(Context context, boolean z10) {
        ActivityInfo activityInfo;
        kotlin.jvm.internal.t.f(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            if (!(!z10)) {
                throw new IllegalStateException(FACEBOOK_ACTIVITY_NOT_FOUND_REASON.toString());
            }
            Log.w(TAG, FACEBOOK_ACTIVITY_NOT_FOUND_REASON);
        }
    }

    public static final void hasInternetPermissions(Context context, boolean z10) {
        kotlin.jvm.internal.t.f(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!(!z10)) {
                throw new IllegalStateException(NO_INTERNET_PERMISSION_REASON.toString());
            }
            Log.w(TAG, NO_INTERNET_PERMISSION_REASON);
        }
    }

    public static final void notEmpty(String arg, String name) {
        kotlin.jvm.internal.t.f(arg, "arg");
        kotlin.jvm.internal.t.f(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }
}
