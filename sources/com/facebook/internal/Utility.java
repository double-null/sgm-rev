package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import rd.PSo.cNMUz;
import rd.c0;
import rd.f0;
import wc.g0;

/* JADX INFO: compiled from: Utility.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Utility {
    private static final String ARC_DEVICE_PATTERN = ".+_cheets|cheets_.+";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";
    private static final String FACEBOOK_PROFILE_FIELDS = "id,name,first_name,middle_name,last_name";
    private static final String HASH_ALGORITHM_MD5 = "MD5";
    private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
    private static final String HASH_ALGORITHM_SHA256 = "SHA-256";
    private static final String INSTAGRAM_PROFILE_FIELDS = "id,name,profile_picture";
    public static final String LOG_TAG = "FacebookSDK";
    private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 1800000;
    private static final String URL_SCHEME = "https";
    private static final String UTF8 = "UTF-8";
    private static volatile Locale locale;
    private static volatile int numCPUCores;
    public static final Utility INSTANCE = new Utility();
    private static volatile long timestampOfLastCheck = -1;
    private static volatile long totalExternalStorageGB = -1;
    private static volatile long availableExternalStorageGB = -1;
    private static volatile String deviceTimezoneAbbreviation = "";
    private static volatile String deviceTimeZoneName = "";
    private static final String NO_CARRIER = "NoCarrier";
    private static volatile String carrierName = NO_CARRIER;
    private static volatile String versionName = "";

    /* JADX INFO: compiled from: Utility.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface GraphMeRequestWithCacheCallback {
        void onFailure(FacebookException facebookException);

        void onSuccess(JSONObject jSONObject);
    }

    private Utility() {
    }

    private final void appendAnonIdUnderCompliance(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !isGooglePlayServicesAvailable(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (attributionIdentifiers.isTrackingLimited()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    private final void appendAttributionIdUnderCompliance(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !isGooglePlayServicesAvailable(context)) {
            jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
        } else {
            if (attributionIdentifiers.isTrackingLimited()) {
                return;
            }
            jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
        }
    }

    public static final <T> boolean areObjectsEqual(T t10, T t11) {
        if (t10 == null) {
            return t11 == null;
        }
        return kotlin.jvm.internal.t.a(t10, t11);
    }

    public static final JSONObject awaitGetGraphMeRequestWithCache(String accessToken) {
        kotlin.jvm.internal.t.f(accessToken, "accessToken");
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(accessToken);
        if (profileInformation != null) {
            return profileInformation;
        }
        GraphResponse graphResponseExecuteAndWait = INSTANCE.getGraphMeRequestWithCache(accessToken).executeAndWait();
        if (graphResponseExecuteAndWait.getError() != null) {
            return null;
        }
        return graphResponseExecuteAndWait.getJsonObject();
    }

    public static final Uri buildUri(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        kotlin.jvm.internal.t.e(uriBuild, "builder.build()");
        return uriBuild;
    }

    private final void clearCookiesForDomain(Context context, String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) f0.K0(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0])) {
            String[] strArr = (String[]) f0.K0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = kotlin.jvm.internal.t.g(str3.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(str3.subSequence(i10, length + 1).toString());
                sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb2.toString());
            }
        }
        cookieManager.flush();
    }

    public static final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String coerceValueIfNullOrEmpty(String str, String str2) {
        return isNullOrEmpty(str) ? str2 : str;
    }

    private final long convertBytesToGB(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    public static final HashSet<String> convertJSONArrayToHashSet(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            kotlin.jvm.internal.t.e(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final List<String> convertJSONArrayToList(JSONArray jsonArray) {
        kotlin.jvm.internal.t.f(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jsonArray.getString(i10);
                kotlin.jvm.internal.t.e(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final Map<String, Object> convertJSONObjectToHashMap(JSONObject jsonObject) {
        kotlin.jvm.internal.t.f(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames == null) {
            return map;
        }
        int length = jSONArrayNames.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                String string = jSONArrayNames.getString(i10);
                kotlin.jvm.internal.t.e(string, "keys.getString(i)");
                Object value = jsonObject.get(string);
                if (value instanceof JSONObject) {
                    value = convertJSONObjectToHashMap((JSONObject) value);
                }
                kotlin.jvm.internal.t.e(value, "value");
                map.put(string, value);
            } catch (JSONException e10) {
                logd(LOG_TAG, "Failed to convert JSONObject to HashMap", e10);
            }
        }
        return map;
    }

    public static final Map<String, String> convertJSONObjectToStringMap(JSONObject jsonObject) {
        kotlin.jvm.internal.t.f(jsonObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String strOptString = jsonObject.optString(key);
            if (strOptString != null) {
                kotlin.jvm.internal.t.e(key, "key");
                map.put(key, strOptString);
            }
        }
        return map;
    }

    public static final int copyAndCloseInputStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.t.f(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i10 = 0;
            while (true) {
                int i11 = bufferedInputStream.read(bArr);
                if (i11 == -1) {
                    g0 g0Var = g0.f27756a;
                    fd.b.a(bufferedInputStream, null);
                    return i10;
                }
                outputStream.write(bArr, 0, i11);
                i10 += i11;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public static final void disconnectQuietly(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    private final boolean externalStorageExists() {
        return kotlin.jvm.internal.t.a("mounted", Environment.getExternalStorageState());
    }

    public static final String getActivityName(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        kotlin.jvm.internal.t.e(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final String getAppName(Context context) {
        String string;
        kotlin.jvm.internal.t.f(context, "context");
        try {
            String applicationName = FacebookSdk.getApplicationName();
            if (applicationName != null) {
                return applicationName;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                kotlin.jvm.internal.t.e(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String getAppVersion() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final Date getBundleLongAsDate(Bundle bundle, String str, Date dateBase) {
        long jLongValue;
        kotlin.jvm.internal.t.f(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        jLongValue = ((Number) obj).longValue();
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (jLongValue * 1000));
    }

    public static final long getContentSize(Uri contentUri) {
        kotlin.jvm.internal.t.f(contentUri, "contentUri");
        Cursor cursorQuery = null;
        try {
            cursorQuery = FacebookSdk.getApplicationContext().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j10 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j10;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static final Locale getCurrentLocale() {
        Locale resourceLocale = getResourceLocale();
        if (resourceLocale != null) {
            return resourceLocale;
        }
        Locale locale2 = Locale.getDefault();
        kotlin.jvm.internal.t.e(locale2, "getDefault()");
        return locale2;
    }

    private final String getCurrentTokenDomainWithDefault() {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        return (currentAccessToken == null || currentAccessToken.getGraphDomain() == null) ? AccessToken.DEFAULT_GRAPH_DOMAIN : currentAccessToken.getGraphDomain();
    }

    public static final JSONObject getDataProcessingOptions() {
        if (CrashShieldHandler.isObjectCrashing(Utility.class)) {
            return null;
        }
        try {
            String string = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.DATA_PROCESSING_OPTIONS_PREFERENCES, 0).getString(FacebookSdk.DATA_PROCESSING_OPTIONS, null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException e10) {
                    logd(LOG_TAG, "Failed to parse data processing options", e10);
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utility.class);
            return null;
        }
    }

    public static final String getGraphDomainFromTokenDomain(String str) {
        String facebookDomain = FacebookSdk.getFacebookDomain();
        if (str == null) {
            return facebookDomain;
        }
        if (kotlin.jvm.internal.t.a(str, FacebookSdk.GAMING)) {
            return c0.K(facebookDomain, FacebookSdk.FACEBOOK_COM, "fb.gg", false, 4, null);
        }
        return kotlin.jvm.internal.t.a(str, FacebookSdk.INSTAGRAM) ? c0.K(facebookDomain, FacebookSdk.FACEBOOK_COM, FacebookSdk.INSTAGRAM_COM, false, 4, null) : facebookDomain;
    }

    private final GraphRequest getGraphMeRequestWithCache(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.FIELDS_PARAM, getProfileFieldsForGraphDomain(getCurrentTokenDomainWithDefault()));
        bundle.putString("access_token", str);
        GraphRequest graphRequestNewMeRequest = GraphRequest.Companion.newMeRequest(null, null);
        graphRequestNewMeRequest.setParameters(bundle);
        graphRequestNewMeRequest.setHttpMethod(HttpMethod.GET);
        return graphRequestNewMeRequest;
    }

    public static final void getGraphMeRequestWithCacheAsync(final String accessToken, final GraphMeRequestWithCacheCallback callback) {
        kotlin.jvm.internal.t.f(accessToken, "accessToken");
        kotlin.jvm.internal.t.f(callback, "callback");
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(accessToken);
        if (profileInformation != null) {
            callback.onSuccess(profileInformation);
            return;
        }
        GraphRequest.Callback callback2 = new GraphRequest.Callback() { // from class: com.facebook.internal.s
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                Utility.getGraphMeRequestWithCacheAsync$lambda$5(callback, accessToken, graphResponse);
            }
        };
        GraphRequest graphMeRequestWithCache = INSTANCE.getGraphMeRequestWithCache(accessToken);
        graphMeRequestWithCache.setCallback(callback2);
        graphMeRequestWithCache.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGraphMeRequestWithCacheAsync$lambda$5(GraphMeRequestWithCacheCallback callback, String accessToken, GraphResponse response) {
        kotlin.jvm.internal.t.f(callback, "$callback");
        kotlin.jvm.internal.t.f(accessToken, "$accessToken");
        kotlin.jvm.internal.t.f(response, "response");
        if (response.getError() != null) {
            callback.onFailure(response.getError().getException());
            return;
        }
        JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        ProfileInformationCache.putProfileInformation(accessToken, jsonObject);
        callback.onSuccess(response.getJsonObject());
    }

    public static final String getMetadataApplicationId(Context context) {
        Validate.notNull(context, "context");
        return FacebookSdk.getApplicationId();
    }

    public static final Method getMethodQuietly(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.t.f(clazz, "clazz");
        kotlin.jvm.internal.t.f(methodName, "methodName");
        kotlin.jvm.internal.t.f(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String getProfileFieldsForGraphDomain(String str) {
        return kotlin.jvm.internal.t.a(str, FacebookSdk.INSTAGRAM) ? INSTAGRAM_PROFILE_FIELDS : FACEBOOK_PROFILE_FIELDS;
    }

    public static final Locale getResourceLocale() {
        try {
            return FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object getStringPropertyAsJSON(JSONObject jsonObject, String str, String str2) throws JSONException {
        kotlin.jvm.internal.t.f(jsonObject, "jsonObject");
        Object objOpt = jsonObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, objOpt);
        return jSONObject;
    }

    public static final String getUriString(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    private final String hashBytes(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.t.e(digest, "digest");
        for (byte b10 : digest) {
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString((b10 >> 0) & 15));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "builder.toString()");
        return string;
    }

    private final String hashWithAlgorithm(String str, String str2) {
        byte[] bytes = str2.getBytes(rd.d.f24999b);
        kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
        return hashWithAlgorithm(str, bytes);
    }

    public static final Object invokeMethodQuietly(Object obj, Method method, Object... args) {
        kotlin.jvm.internal.t.f(method, "method");
        kotlin.jvm.internal.t.f(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean isAutoAppLinkSetup() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            l0 l0Var = l0.f21527a;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            kotlin.jvm.internal.t.e(str, "format(format, *args)");
            intent.setData(Uri.parse(str));
            Context applicationContext = FacebookSdk.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            String packageName = applicationContext.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            kotlin.jvm.internal.t.e(listQueryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.t.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static /* synthetic */ void isAutoAppLinkSetup$annotations() {
    }

    public static final boolean isAutofillAvailable(Context context) {
        AutofillManager autofillManager;
        kotlin.jvm.internal.t.f(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    public static final boolean isChromeOS(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            kotlin.jvm.internal.t.e(DEVICE, "DEVICE");
            if (new rd.o(ARC_DEVICE_PATTERN).e(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isContentUri(Uri uri) {
        return uri != null && c0.B(AppLovinEventTypes.USER_VIEWED_CONTENT, uri.getScheme(), true);
    }

    public static final boolean isCurrentAccessToken(AccessToken accessToken) {
        return accessToken != null && kotlin.jvm.internal.t.a(accessToken, AccessToken.Companion.getCurrentAccessToken());
    }

    public static final boolean isDataProcessingRestricted() {
        if (CrashShieldHandler.isObjectCrashing(Utility.class)) {
            return false;
        }
        try {
            JSONObject dataProcessingOptions = getDataProcessingOptions();
            if (dataProcessingOptions == null) {
                return false;
            }
            try {
                JSONArray jSONArray = dataProcessingOptions.getJSONArray(FacebookSdk.DATA_PROCESSING_OPTIONS);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    kotlin.jvm.internal.t.e(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (kotlin.jvm.internal.t.a(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                logd(LOG_TAG, "Failed to check data processing restriction", e10);
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utility.class);
            return false;
        }
    }

    public static final boolean isFileUri(Uri uri) {
        return uri != null && c0.B(ShareInternalUtility.STAGING_PARAM, uri.getScheme(), true);
    }

    private final boolean isGooglePlayServicesAvailable(Context context) {
        Method methodQuietly = getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
        if (methodQuietly == null) {
            return false;
        }
        Object objInvokeMethodQuietly = invokeMethodQuietly(null, methodQuietly, context);
        return (objInvokeMethodQuietly instanceof Integer) && kotlin.jvm.internal.t.a(objInvokeMethodQuietly, 0);
    }

    public static final boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean isWebUri(Uri uri) {
        return uri != null && (c0.B("http", uri.getScheme(), true) || c0.B("https", uri.getScheme(), true) || c0.B("fbstaging", uri.getScheme(), true));
    }

    public static final Set<String> jsonArrayToSet(JSONArray jsonArray) throws JSONException {
        kotlin.jvm.internal.t.f(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jsonArray.getString(i10);
            kotlin.jvm.internal.t.e(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final List<String> jsonArrayToStringList(JSONArray jsonArray) throws JSONException {
        kotlin.jvm.internal.t.f(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jsonArray.getString(i10));
        }
        return arrayList;
    }

    public static final Map<String, String> jsonStrToMap(String str) {
        kotlin.jvm.internal.t.f(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                kotlin.jvm.internal.t.e(key, "key");
                String string = jSONObject.getString(key);
                kotlin.jvm.internal.t.e(string, "jsonObject.getString(key)");
                map.put(key, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void logd(String str, Exception exc) {
        if (!FacebookSdk.isDebugEnabled() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    public static final String mapToJsonStr(Map<String, String> map) {
        kotlin.jvm.internal.t.f(map, "map");
        String string = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                string = jSONObject.toString();
            } catch (JSONException unused) {
            }
            kotlin.jvm.internal.t.e(string, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        }
        return string;
    }

    public static final String md5hash(String key) {
        kotlin.jvm.internal.t.f(key, "key");
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_MD5, key);
    }

    public static final boolean mustFixWindowParamsForAutofill(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return isAutofillAvailable(context);
    }

    public static final Bundle parseUrlQueryString(String str) {
        Bundle bundle = new Bundle();
        if (!isNullOrEmpty(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            for (String str2 : (String[]) f0.K0(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0])) {
                String[] strArr = (String[]) f0.K0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    logd(LOG_TAG, e10);
                }
            }
        }
        return bundle;
    }

    public static final void putCommaSeparatedStringList(Bundle b10, String str, List<String> list) {
        kotlin.jvm.internal.t.f(b10, "b");
        if (list != null) {
            b10.putString(str, TextUtils.join(",", list));
        }
    }

    public static final boolean putJSONValueInBundle(Bundle bundle, String str, Object obj) {
        kotlin.jvm.internal.t.f(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    public static final void putNonEmptyString(Bundle b10, String str, String str2) {
        kotlin.jvm.internal.t.f(b10, "b");
        if (isNullOrEmpty(str2)) {
            return;
        }
        b10.putString(str, str2);
    }

    public static final void putUri(Bundle b10, String str, Uri uri) {
        kotlin.jvm.internal.t.f(b10, "b");
        if (uri != null) {
            putNonEmptyString(b10, str, uri.toString());
        }
    }

    public static final Map<String, String> readNonnullStringMapFromParcel(Parcel parcel) {
        kotlin.jvm.internal.t.f(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    public static final String readStreamToString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = sb2.toString();
                    fd.b.a(inputStreamReader, null);
                    kotlin.jvm.internal.t.e(string, "InputStreamReader(buffer…gBuilder.toString()\n    }");
                    return string;
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static final Map<String, String> readStringMapFromParcel(Parcel parcel) {
        kotlin.jvm.internal.t.f(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    private final void refreshAvailableExternalStorage() {
        try {
            if (externalStorageExists()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    private final int refreshBestGuessNumberOfCPUCores() {
        if (numCPUCores > 0) {
            return numCPUCores;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.t
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return Utility.refreshBestGuessNumberOfCPUCores$lambda$6(file, str);
                }
            });
            if (fileArrListFiles != null) {
                numCPUCores = fileArrListFiles.length;
            }
        } catch (Exception e10) {
            logd(LOG_TAG, "Failed to enumerate CPU cores", e10);
        }
        if (numCPUCores <= 0) {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshBestGuessNumberOfCPUCores$lambda$6(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    private final void refreshCarrierName(Context context) {
        if (kotlin.jvm.internal.t.a(carrierName, NO_CARRIER)) {
            try {
                Object systemService = context.getSystemService("phone");
                kotlin.jvm.internal.t.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                kotlin.jvm.internal.t.e(networkOperatorName, "telephonyManager.networkOperatorName");
                carrierName = networkOperatorName;
            } catch (Exception e10) {
                logd(LOG_TAG, "Failed to refresh carrier name", e10);
            }
        }
    }

    private final void refreshPeriodicExtendedDeviceInfo(Context context) {
        if (timestampOfLastCheck == -1 || System.currentTimeMillis() - timestampOfLastCheck >= 1800000) {
            timestampOfLastCheck = System.currentTimeMillis();
            refreshTimezone();
            refreshCarrierName(context);
            refreshTotalExternalStorage();
            refreshAvailableExternalStorage();
        }
    }

    private final void refreshTimezone() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            kotlin.jvm.internal.t.e(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            deviceTimezoneAbbreviation = displayName;
            String id2 = timeZone.getID();
            kotlin.jvm.internal.t.e(id2, "tz.id");
            deviceTimeZoneName = id2;
        } catch (AssertionError unused) {
        } catch (Exception e10) {
            logd(LOG_TAG, "Failed to refresh timezone", e10);
        }
    }

    private final void refreshTotalExternalStorage() {
        try {
            if (externalStorageExists()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    public static final void runOnNonUiThread(Runnable runnable) {
        try {
            FacebookSdk.getExecutor().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final String safeGetStringFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        String strOptString = jSONObject.optString(str, "");
        kotlin.jvm.internal.t.e(strOptString, "response.optString(propertyName, \"\")");
        return strOptString;
    }

    public static final void setAppEventAttributionParameters(JSONObject params, AttributionIdentifiers attributionIdentifiers, String str, boolean z10, Context context) throws JSONException {
        kotlin.jvm.internal.t.f(params, "params");
        kotlin.jvm.internal.t.f(context, "context");
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.isEnabled(feature)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        params.put("advertiser_id_collection_enabled", FacebookSdk.getAdvertiserIDCollectionEnabled());
        Boolean addToMessagingCustomerBaseForWhatsApp = FacebookSdk.getAddToMessagingCustomerBaseForWhatsApp();
        if (addToMessagingCustomerBaseForWhatsApp != null) {
            params.put("add_to_messaging_customer_base_for_whatsapp", addToMessagingCustomerBaseForWhatsApp.booleanValue() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        if (attributionIdentifiers != null) {
            if (FeatureManager.isEnabled(feature)) {
                INSTANCE.appendAnonIdUnderCompliance(params, attributionIdentifiers, str, context);
            }
            if (attributionIdentifiers.getAttributionId() != null) {
                if (FeatureManager.isEnabled(feature)) {
                    INSTANCE.appendAttributionIdUnderCompliance(params, attributionIdentifiers, context);
                } else {
                    params.put("attribution", attributionIdentifiers.getAttributionId());
                }
            }
            if (attributionIdentifiers.getAndroidAdvertiserId() != null) {
                params.put("advertiser_id", attributionIdentifiers.getAndroidAdvertiserId());
                params.put("advertiser_tracking_enabled", !attributionIdentifiers.isTrackingLimited());
            }
            if (!attributionIdentifiers.isTrackingLimited()) {
                String allHashedUserData = UserDataStore.getAllHashedUserData();
                if (!(allHashedUserData.length() == 0)) {
                    params.put("ud", allHashedUserData);
                }
            }
            if (attributionIdentifiers.getAndroidInstallerPackage() != null) {
                params.put("installer_package", attributionIdentifiers.getAndroidInstallerPackage());
            }
        }
        AppLinkManager.Companion companion = AppLinkManager.Companion;
        AppLinkManager companion2 = companion.getInstance();
        Object info = companion2 != null ? companion2.getInfo(AppLinkManager.CAMPAIGN_IDS_KEY) : null;
        if (info != null) {
            params.put(AppLinkManager.CAMPAIGN_IDS_KEY, info);
        }
        AppLinkManager companion3 = companion.getInstance();
        Object info2 = companion3 != null ? companion3.getInfo(AppLinkManager.CLICK_ID_KEY) : null;
        if (info2 != null) {
            params.put(AppLinkManager.CLICK_ID_KEY, info2);
        }
    }

    public static final void setAppEventExtendedDeviceInfoParameters(JSONObject params, Context appContext) throws JSONException {
        Locale locale2;
        int i10;
        kotlin.jvm.internal.t.f(params, "params");
        kotlin.jvm.internal.t.f(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(EXTRA_APP_EVENTS_INFO_FORMAT_VERSION);
        INSTANCE.refreshPeriodicExtendedDeviceInfo(appContext);
        String packageName = appContext.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i12 = packageInfo.versionCode;
            versionName = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(versionName);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale2 = appContext.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused2) {
            locale2 = Locale.getDefault();
        }
        locale = locale2;
        StringBuilder sb2 = new StringBuilder();
        Locale locale3 = locale;
        String language = locale3 != null ? locale3.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale4 = locale;
        String country = locale4 != null ? locale4.getCountry() : null;
        sb2.append(country != null ? country : "");
        jSONArray.put(sb2.toString());
        jSONArray.put(deviceTimezoneAbbreviation);
        jSONArray.put(carrierName);
        double d10 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i13 = displayMetrics.widthPixels;
                try {
                    i11 = displayMetrics.heightPixels;
                    d10 = displayMetrics.density;
                } catch (Exception unused3) {
                }
                i10 = i11;
                i11 = i13;
            } else {
                i10 = 0;
            }
        } catch (Exception unused4) {
        }
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
        jSONArray.put(totalExternalStorageGB);
        jSONArray.put(availableExternalStorageGB);
        jSONArray.put(deviceTimeZoneName);
        params.put(Constants.EXTINFO, jSONArray.toString());
    }

    public static final String sha1hash(String key) {
        kotlin.jvm.internal.t.f(key, "key");
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA1, key);
    }

    public static final String sha256hash(String str) {
        if (str == null) {
            return null;
        }
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA256, str);
    }

    public static final boolean stringsEqualOrEmpty(String str, String str2) {
        boolean z10 = str == null || str.length() == 0;
        boolean z11 = str2 == null || str2.length() == 0;
        if (z10 && z11) {
            return true;
        }
        if (z10 || z11) {
            return false;
        }
        return kotlin.jvm.internal.t.a(str, str2);
    }

    public static final JSONArray tryGetJSONArrayFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final JSONObject tryGetJSONObjectFromResponse(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static final void writeNonnullStringMapToParcel(Parcel parcel, Map<String, String> map) {
        kotlin.jvm.internal.t.f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public static final void writeStringMapToParcel(Parcel parcel, Map<String, String> map) {
        kotlin.jvm.internal.t.f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public final long getAvailableExternalStorageGB() {
        return availableExternalStorageGB;
    }

    public final String getCarrierName() {
        return carrierName;
    }

    public final String getDeviceTimeZoneName() {
        return deviceTimeZoneName;
    }

    public final Locale getLocale() {
        return locale;
    }

    public final String getVersionName() {
        return versionName;
    }

    public final void setAvailableExternalStorageGB(long j10) {
        availableExternalStorageGB = j10;
    }

    public final void setCarrierName(String str) {
        kotlin.jvm.internal.t.f(str, "<set-?>");
        carrierName = str;
    }

    public final void setDeviceTimeZoneName(String str) {
        kotlin.jvm.internal.t.f(str, "<set-?>");
        deviceTimeZoneName = str;
    }

    public final void setLocale(Locale locale2) {
        locale = locale2;
    }

    public final void setVersionName(String str) {
        versionName = str;
    }

    public static final void clearFacebookCookies(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        try {
            Utility utility = INSTANCE;
            utility.clearCookiesForDomain(context, FacebookSdk.FACEBOOK_COM);
            utility.clearCookiesForDomain(context, ".facebook.com");
            utility.clearCookiesForDomain(context, "https://facebook.com");
            utility.clearCookiesForDomain(context, wHzciBnJlYkdX.SBJ);
        } catch (Exception unused) {
        }
    }

    public static final String generateRandomString(int i10) {
        String string = new BigInteger(i10 * 5, new SecureRandom()).toString(32);
        kotlin.jvm.internal.t.e(string, cNMUz.kDfwVawukZP);
        return string;
    }

    public static final Method getMethodQuietly(String className, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.t.f(className, "className");
        kotlin.jvm.internal.t.f(methodName, "methodName");
        kotlin.jvm.internal.t.f(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            kotlin.jvm.internal.t.e(clazz, "clazz");
            return getMethodQuietly(clazz, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String hashWithAlgorithm(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            kotlin.jvm.internal.t.e(hash, "hash");
            return hashBytes(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final boolean isNullOrEmpty(String str) {
        if (str != null) {
            return str.length() == 0;
        }
        return true;
    }

    public static final String sha1hash(byte[] bytes) {
        kotlin.jvm.internal.t.f(bytes, "bytes");
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA1, bytes);
    }

    public static final String sha256hash(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return INSTANCE.hashWithAlgorithm(HASH_ALGORITHM_SHA256, bArr);
    }

    public static final void logd(String str, String str2) {
        if (!FacebookSdk.isDebugEnabled() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final void logd(String str, String str2, Throwable th) {
        if (!FacebookSdk.isDebugEnabled() || isNullOrEmpty(str)) {
            return;
        }
        Log.d(str, str2, th);
    }
}
