package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LegacyTokenHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LegacyTokenHelper {
    public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
    public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
    public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
    public static final String EXPIRED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.ExpiredPermissions";
    private static final long INVALID_BUNDLE_MILLISECONDS = Long.MIN_VALUE;
    private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
    private static final String JSON_VALUE = "value";
    private static final String JSON_VALUE_ENUM_TYPE = "enumType";
    private static final String JSON_VALUE_TYPE = "valueType";
    public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
    public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
    public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
    public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
    private static final String TYPE_BOOLEAN = "bool";
    private static final String TYPE_BOOLEAN_ARRAY = "bool[]";
    private static final String TYPE_BYTE = "byte";
    private static final String TYPE_BYTE_ARRAY = "byte[]";
    private static final String TYPE_CHAR = "char";
    private static final String TYPE_CHAR_ARRAY = "char[]";
    private static final String TYPE_DOUBLE = "double";
    private static final String TYPE_DOUBLE_ARRAY = "double[]";
    private static final String TYPE_ENUM = "enum";
    private static final String TYPE_FLOAT = "float";
    private static final String TYPE_FLOAT_ARRAY = "float[]";
    private static final String TYPE_INTEGER = "int";
    private static final String TYPE_INTEGER_ARRAY = "int[]";
    private static final String TYPE_LONG = "long";
    private static final String TYPE_LONG_ARRAY = "long[]";
    private static final String TYPE_SHORT = "short";
    private static final String TYPE_SHORT_ARRAY = "short[]";
    private static final String TYPE_STRING = "string";
    private static final String TYPE_STRING_LIST = "stringList";
    private final SharedPreferences cache;
    private final String cacheKey;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = LegacyTokenHelper.class.getSimpleName();

    /* JADX INFO: compiled from: LegacyTokenHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final Date getDate(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j10 = bundle.getLong(str, LegacyTokenHelper.INVALID_BUNDLE_MILLISECONDS);
            if (j10 == LegacyTokenHelper.INVALID_BUNDLE_MILLISECONDS) {
                return null;
            }
            return new Date(j10);
        }

        private final void putDate(Bundle bundle, String str, Date date) {
            bundle.putLong(str, date.getTime());
        }

        public final String getApplicationId(Bundle bundle) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.APPLICATION_ID_KEY);
        }

        public final Date getExpirationDate(Bundle bundle) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        public final long getExpirationMilliseconds(Bundle bundle) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        public final Date getLastRefreshDate(Bundle bundle) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        public final long getLastRefreshMilliseconds(Bundle bundle) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        public final Set<String> getPermissions(Bundle bundle) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY);
            if (stringArrayList == null) {
                return null;
            }
            return new HashSet(stringArrayList);
        }

        public final AccessTokenSource getSource(Bundle bundle) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            if (bundle.containsKey(LegacyTokenHelper.TOKEN_SOURCE_KEY)) {
                return (AccessTokenSource) bundle.getSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY);
            }
            return bundle.getBoolean(LegacyTokenHelper.IS_SSO_KEY) ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        }

        public final String getToken(Bundle bundle) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.TOKEN_KEY);
        }

        public final boolean hasTokenInformation(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString(LegacyTokenHelper.TOKEN_KEY)) == null) {
                return false;
            }
            return ((string.length() == 0) || bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, 0L) == 0) ? false : true;
        }

        public final void putApplicationId(Bundle bundle, String str) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            bundle.putString(LegacyTokenHelper.APPLICATION_ID_KEY, str);
        }

        public final void putDeclinedPermissions(Bundle bundle, Collection<String> value) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.DECLINED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        public final void putExpirationDate(Bundle bundle, Date value) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(value, "value");
            putDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY, value);
        }

        public final void putExpirationMilliseconds(Bundle bundle, long j10) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, j10);
        }

        public final void putExpiredPermissions(Bundle bundle, Collection<String> value) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        public final void putLastRefreshDate(Bundle bundle, Date value) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(value, "value");
            putDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY, value);
        }

        public final void putLastRefreshMilliseconds(Bundle bundle, long j10) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY, j10);
        }

        public final void putPermissions(Bundle bundle, Collection<String> value) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY, new ArrayList<>(value));
        }

        public final void putSource(Bundle bundle, AccessTokenSource value) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(value, "value");
            bundle.putSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY, value);
        }

        public final void putToken(Bundle bundle, String value) {
            kotlin.jvm.internal.t.f(bundle, "bundle");
            kotlin.jvm.internal.t.f(value, "value");
            bundle.putString(LegacyTokenHelper.TOKEN_KEY, value);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyTokenHelper(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.t.f(context, "context");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void deserializeKey(String str, Bundle bundle) throws JSONException {
        String str2;
        String string;
        String string2 = this.cache.getString(str, JsonUtils.EMPTY_JSON);
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        kotlin.jvm.internal.t.e(string2, "checkNotNull(cache.getString(key, \"{}\"))");
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString(JSON_VALUE_TYPE);
        if (string3 != null) {
            int i10 = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals(TYPE_STRING_LIST)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        while (i10 < length) {
                            Object obj = jSONArray.get(i10);
                            if (obj == JSONObject.NULL) {
                                str2 = null;
                            } else {
                                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlin.String");
                                str2 = (String) obj;
                            }
                            arrayList.add(i10, str2);
                            i10++;
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals(TYPE_BOOLEAN_ARRAY)) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        while (i10 < length2) {
                            zArr[i10] = jSONArray2.getBoolean(i10);
                            i10++;
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals(TYPE_BYTE_ARRAY)) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        while (i10 < length3) {
                            bArr[i10] = (byte) jSONArray3.getInt(i10);
                            i10++;
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals(TYPE_CHAR_ARRAY)) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        for (int i11 = 0; i11 < length4; i11++) {
                            String string4 = jSONArray4.getString(i11);
                            if (string4 != null && string4.length() == 1) {
                                cArr[i11] = string4.charAt(0);
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals(TYPE_DOUBLE)) {
                        bundle.putDouble(str, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals(TYPE_LONG_ARRAY)) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        while (i10 < length5) {
                            jArr[i10] = jSONArray5.getLong(i10);
                            i10++;
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals(TYPE_STRING)) {
                        bundle.putString(str, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals(TYPE_FLOAT_ARRAY)) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        while (i10 < length6) {
                            fArr[i10] = (float) jSONArray6.getDouble(i10);
                            i10++;
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals(TYPE_INTEGER)) {
                        bundle.putInt(str, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals(TYPE_BOOLEAN)) {
                        bundle.putBoolean(str, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals(TYPE_BYTE)) {
                        bundle.putByte(str, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals(TYPE_CHAR) && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals(TYPE_ENUM)) {
                        try {
                            Class<?> cls = Class.forName(jSONObject.getString(JSON_VALUE_ENUM_TYPE));
                            kotlin.jvm.internal.t.d(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                            bundle.putSerializable(str, Enum.valueOf(cls, jSONObject.getString("value")));
                            return;
                        } catch (ClassNotFoundException e10) {
                            Utility.logd(TAG, "Failed to deserialize enum type", e10);
                            return;
                        } catch (IllegalArgumentException e11) {
                            Utility.logd(TAG, "Failed to deserialize enum value", e11);
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals("long")) {
                        bundle.putLong(str, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals(TYPE_FLOAT)) {
                        bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals(TYPE_INTEGER_ARRAY)) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        while (i10 < length7) {
                            iArr[i10] = jSONArray7.getInt(i10);
                            i10++;
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals(TYPE_SHORT)) {
                        bundle.putShort(str, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals(TYPE_DOUBLE_ARRAY)) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        while (i10 < length8) {
                            dArr[i10] = jSONArray8.getDouble(i10);
                            i10++;
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals(TYPE_SHORT_ARRAY)) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        while (i10 < length9) {
                            sArr[i10] = (short) jSONArray9.getInt(i10);
                            i10++;
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static final String getApplicationId(Bundle bundle) {
        return Companion.getApplicationId(bundle);
    }

    public static final Date getExpirationDate(Bundle bundle) {
        return Companion.getExpirationDate(bundle);
    }

    public static final long getExpirationMilliseconds(Bundle bundle) {
        return Companion.getExpirationMilliseconds(bundle);
    }

    public static final Date getLastRefreshDate(Bundle bundle) {
        return Companion.getLastRefreshDate(bundle);
    }

    public static final long getLastRefreshMilliseconds(Bundle bundle) {
        return Companion.getLastRefreshMilliseconds(bundle);
    }

    public static final Set<String> getPermissions(Bundle bundle) {
        return Companion.getPermissions(bundle);
    }

    public static final AccessTokenSource getSource(Bundle bundle) {
        return Companion.getSource(bundle);
    }

    public static final String getToken(Bundle bundle) {
        return Companion.getToken(bundle);
    }

    public static final boolean hasTokenInformation(Bundle bundle) {
        return Companion.hasTokenInformation(bundle);
    }

    public static final void putApplicationId(Bundle bundle, String str) {
        Companion.putApplicationId(bundle, str);
    }

    public static final void putDeclinedPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putDeclinedPermissions(bundle, collection);
    }

    public static final void putExpirationDate(Bundle bundle, Date date) {
        Companion.putExpirationDate(bundle, date);
    }

    public static final void putExpirationMilliseconds(Bundle bundle, long j10) {
        Companion.putExpirationMilliseconds(bundle, j10);
    }

    public static final void putExpiredPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putExpiredPermissions(bundle, collection);
    }

    public static final void putLastRefreshDate(Bundle bundle, Date date) {
        Companion.putLastRefreshDate(bundle, date);
    }

    public static final void putLastRefreshMilliseconds(Bundle bundle, long j10) {
        Companion.putLastRefreshMilliseconds(bundle, j10);
    }

    public static final void putPermissions(Bundle bundle, Collection<String> collection) {
        Companion.putPermissions(bundle, collection);
    }

    public static final void putSource(Bundle bundle, AccessTokenSource accessTokenSource) {
        Companion.putSource(bundle, accessTokenSource);
    }

    public static final void putToken(Bundle bundle, String str) {
        Companion.putToken(bundle, str);
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x018b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    private final void serializeKey(String str, Bundle bundle, SharedPreferences.Editor editor) throws JSONException {
        JSONArray jSONArray;
        String str2;
        Object obj = bundle.get(str);
        if (obj == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = null;
        if (obj instanceof Byte) {
            jSONObject.put("value", (int) ((Number) obj).byteValue());
            str2 = TYPE_BYTE;
        } else if (obj instanceof Short) {
            jSONObject.put("value", (int) ((Number) obj).shortValue());
            str2 = TYPE_SHORT;
        } else if (obj instanceof Integer) {
            jSONObject.put("value", ((Number) obj).intValue());
            str2 = TYPE_INTEGER;
        } else if (obj instanceof Long) {
            jSONObject.put("value", ((Number) obj).longValue());
            str2 = "long";
        } else if (obj instanceof Float) {
            jSONObject.put("value", ((Number) obj).floatValue());
            str2 = TYPE_FLOAT;
        } else if (obj instanceof Double) {
            jSONObject.put("value", ((Number) obj).doubleValue());
            str2 = TYPE_DOUBLE;
        } else if (obj instanceof Boolean) {
            jSONObject.put("value", ((Boolean) obj).booleanValue());
            str2 = TYPE_BOOLEAN;
        } else if (obj instanceof Character) {
            jSONObject.put("value", obj.toString());
            str2 = TYPE_CHAR;
        } else {
            if (!(obj instanceof String)) {
                if (obj instanceof Enum) {
                    jSONObject.put("value", obj.toString());
                    jSONObject.put(JSON_VALUE_ENUM_TYPE, obj.getClass().getName());
                    str2 = TYPE_ENUM;
                } else {
                    jSONArray = new JSONArray();
                    int i10 = 0;
                    if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        int length = bArr.length;
                        while (i10 < length) {
                            jSONArray.put((int) bArr[i10]);
                            i10++;
                        }
                        str3 = TYPE_BYTE_ARRAY;
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        int length2 = sArr.length;
                        while (i10 < length2) {
                            jSONArray.put((int) sArr[i10]);
                            i10++;
                        }
                        str3 = TYPE_SHORT_ARRAY;
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        int length3 = iArr.length;
                        while (i10 < length3) {
                            jSONArray.put(iArr[i10]);
                            i10++;
                        }
                        str3 = TYPE_INTEGER_ARRAY;
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        int length4 = jArr.length;
                        while (i10 < length4) {
                            jSONArray.put(jArr[i10]);
                            i10++;
                        }
                        str3 = TYPE_LONG_ARRAY;
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        int length5 = fArr.length;
                        while (i10 < length5) {
                            jSONArray.put(fArr[i10]);
                            i10++;
                        }
                        str3 = TYPE_FLOAT_ARRAY;
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        int length6 = dArr.length;
                        while (i10 < length6) {
                            jSONArray.put(dArr[i10]);
                            i10++;
                        }
                        str3 = TYPE_DOUBLE_ARRAY;
                    } else if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        int length7 = zArr.length;
                        while (i10 < length7) {
                            jSONArray.put(zArr[i10]);
                            i10++;
                        }
                        str3 = TYPE_BOOLEAN_ARRAY;
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        int length8 = cArr.length;
                        while (i10 < length8) {
                            jSONArray.put(String.valueOf(cArr[i10]));
                            i10++;
                        }
                        str3 = TYPE_CHAR_ARRAY;
                    } else if (obj instanceof List) {
                        for (Object obj2 : (List) obj) {
                            if (obj2 == null) {
                                obj2 = JSONObject.NULL;
                            }
                            jSONArray.put(obj2);
                        }
                        str3 = TYPE_STRING_LIST;
                    } else {
                        jSONArray = null;
                    }
                }
                if (str3 != null) {
                    jSONObject.put(JSON_VALUE_TYPE, str3);
                    if (jSONArray != null) {
                        jSONObject.putOpt("value", jSONArray);
                    }
                    String string = jSONObject.toString();
                    kotlin.jvm.internal.t.e(string, "json.toString()");
                    editor.putString(str, string);
                }
            }
            jSONObject.put("value", obj);
            str2 = TYPE_STRING;
        }
        jSONArray = null;
        str3 = str2;
        if (str3 != null) {
            jSONObject.put(JSON_VALUE_TYPE, str3);
            if (jSONArray != null) {
                jSONObject.putOpt("value", jSONArray);
            }
            String string2 = jSONObject.toString();
            kotlin.jvm.internal.t.e(string2, "json.toString()");
            editor.putString(str, string2);
        }
    }

    public final void clear() {
        this.cache.edit().clear().apply();
    }

    public final Bundle load() {
        Bundle bundle = new Bundle();
        for (String key : this.cache.getAll().keySet()) {
            try {
                kotlin.jvm.internal.t.e(key, "key");
                deserializeKey(key, bundle);
            } catch (JSONException e10) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String TAG2 = TAG;
                kotlin.jvm.internal.t.e(TAG2, "TAG");
                companion.log(loggingBehavior, 5, TAG2, "Error reading cached value for key: '" + key + "' -- " + e10);
                return null;
            }
        }
        return bundle;
    }

    public final void save(Bundle bundle) {
        kotlin.jvm.internal.t.f(bundle, "bundle");
        SharedPreferences.Editor editor = this.cache.edit();
        for (String key : bundle.keySet()) {
            try {
                kotlin.jvm.internal.t.e(key, "key");
                kotlin.jvm.internal.t.e(editor, "editor");
                serializeKey(key, bundle, editor);
            } catch (JSONException e10) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String TAG2 = TAG;
                kotlin.jvm.internal.t.e(TAG2, "TAG");
                companion.log(loggingBehavior, 5, TAG2, "Error processing value for key: '" + key + "' -- " + e10);
                return;
            }
        }
        editor.apply();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public LegacyTokenHelper(Context context, String str) {
        kotlin.jvm.internal.t.f(context, "context");
        if (str != null) {
            str = str.length() == 0 ? DEFAULT_CACHE_KEY : str;
        }
        this.cacheKey = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        kotlin.jvm.internal.t.e(sharedPreferences, "effectiveContext.getShar…ey, Context.MODE_PRIVATE)");
        this.cache = sharedPreferences;
    }

    public /* synthetic */ LegacyTokenHelper(Context context, String str, int i10, kotlin.jvm.internal.k kVar) {
        this(context, (i10 & 2) != 0 ? null : str);
    }
}
