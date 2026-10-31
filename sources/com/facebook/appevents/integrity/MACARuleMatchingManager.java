package com.facebook.appevents.integrity;

import android.os.Build;
import android.os.Bundle;
import c2.YDwL.tFQWuE;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import rd.c0;
import rd.f0;
import rd.o;

/* JADX INFO: compiled from: MACARuleMatchingManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MACARuleMatchingManager {
    private static JSONArray MACARules;
    private static boolean enabled;
    public static final MACARuleMatchingManager INSTANCE = new MACARuleMatchingManager();
    private static String[] keys = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", tFQWuE.kXHPVcgOzhQrr, "_deviceOSVersion", "_remainingDiskGB"};

    private MACARuleMatchingManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            INSTANCE.loadMACARules();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    public static final String getKey(JSONObject logic) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            t.f(logic, "logic");
            Iterator<String> itKeys = logic.keys();
            if (itKeys.hasNext()) {
                return itKeys.next();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final String getMatchPropertyIDs(Bundle bundle) {
        String strOptString;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            JSONArray jSONArray2 = MACARules;
            t.d(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString2 = jSONArray2.optString(i10);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong("id");
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && isMatchCCRule(strOptString, bundle)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            String string = new JSONArray((Collection) arrayList).toString();
            t.e(string, "JSONArray(res).toString()");
            return string;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final ArrayList<String> getStringArrayList(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.get(i10).toString());
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    public static final boolean isMatchCCRule(String str, Bundle bundle) {
        if (!CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String key = getKey(jSONObject);
                if (key == null) {
                    return false;
                }
                Object obj = jSONObject.get(key);
                int iHashCode = key.hashCode();
                if (iHashCode != 3555) {
                    if (iHashCode != 96727) {
                        if (iHashCode == 109267 && key.equals("not")) {
                            return !isMatchCCRule(obj.toString(), bundle);
                        }
                    } else if (key.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            if (!isMatchCCRule(jSONArray.get(i10).toString(), bundle)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (key.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (isMatchCCRule(jSONArray2.get(i11).toString(), bundle)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return stringComparison(key, jSONObject2, bundle);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            }
        }
        return false;
    }

    private final void loadMACARules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (fetchedAppSettingsQueryAppSettings == null) {
                return;
            }
            MACARules = fetchedAppSettingsQueryAppSettings.getMACARuleMatchingSetting();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void processParameters(Bundle bundle, String event) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            t.f(event, "event");
            if (!enabled || bundle == null) {
                return;
            }
            try {
                generateInfo(bundle, event);
                bundle.putString("_audiencePropertyIds", getMatchPropertyIDs(bundle));
                bundle.putString("cs_maca", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                removeGeneratedInfo(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    public static final void removeGeneratedInfo(Bundle params) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            t.f(params, "params");
            for (String str : keys) {
                params.remove(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:117:0x0206  */
    /* JADX WARN: Code duplicated, block: B:122:0x0213 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x0214 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:125:0x021a  */
    /* JADX WARN: Code duplicated, block: B:126:0x021b A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0225 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0267 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0302 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:172:0x0303 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0317 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x0318 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[LOOP:0: B:127:0x021f->B:192:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[LOOP:1: B:141:0x0261->B:195:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0180  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean stringComparison(String variable, JSONObject values, Bundle bundle) {
        Object obj;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return false;
        }
        try {
            t.f(variable, "variable");
            t.f(values, "values");
            String key = getKey(values);
            if (key == null) {
                return false;
            }
            String string = values.get(key).toString();
            ArrayList<String> stringArrayList = getStringArrayList(values.optJSONArray(key));
            if (t.a(key, "exists")) {
                return bundle != null && bundle.containsKey(variable) == Boolean.parseBoolean(string);
            }
            if (bundle != null) {
                String lowerCase5 = variable.toLowerCase(Locale.ROOT);
                t.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                obj = bundle.get(lowerCase5);
                if (obj == null) {
                    if (bundle != null) {
                        obj = bundle.get(variable);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        return false;
                    }
                }
            } else {
                if (bundle != null) {
                    obj = bundle.get(variable);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    return false;
                }
            }
            switch (key.hashCode()) {
                case -1729128927:
                    if (!key.equals("i_not_contains")) {
                        return false;
                    }
                    String string2 = obj.toString();
                    Locale locale = Locale.ROOT;
                    String lowerCase6 = string2.toLowerCase(locale);
                    t.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase7 = string.toLowerCase(locale);
                    t.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (f0.U(lowerCase6, lowerCase7, false, 2, null)) {
                        return false;
                    }
                case -1179774633:
                    if (!key.equals("is_any")) {
                        return false;
                    }
                    if (stringArrayList == null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -1039699439:
                    if (!key.equals("not_in")) {
                        return false;
                    }
                    if (stringArrayList == null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -969266188:
                    if (key.equals("starts_with")) {
                        return c0.O(obj.toString(), string, false, 2, null);
                    }
                    return false;
                case -966353971:
                    if (key.equals("regex_match")) {
                        return new o(string).e(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!key.equals("is_not_any")) {
                        return false;
                    }
                    if (stringArrayList == null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -567445985:
                    if (key.equals("contains")) {
                        return f0.U(obj.toString(), string, false, 2, null);
                    }
                    return false;
                case -327990090:
                    if (!key.equals("i_str_neq")) {
                        return false;
                    }
                    String string3 = obj.toString();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase8 = string3.toLowerCase(locale2);
                    t.e(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase9 = string.toLowerCase(locale2);
                    t.e(lowerCase9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return !t.a(lowerCase8, lowerCase9);
                case -159812115:
                    if (!key.equals("i_is_any")) {
                        return false;
                    }
                    if (stringArrayList == null && !stringArrayList.isEmpty()) {
                        for (String str : stringArrayList) {
                            Locale locale3 = Locale.ROOT;
                            lowerCase = str.toLowerCase(locale3);
                            t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            lowerCase2 = obj.toString().toLowerCase(locale3);
                            t.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (t.a(lowerCase, lowerCase2)) {
                            }
                        }
                        return false;
                    }
                    return false;
                case -92753547:
                    if (!key.equals("i_str_not_in")) {
                        return false;
                    }
                    if (stringArrayList == null) {
                        return false;
                    }
                    if (stringArrayList.isEmpty()) {
                        for (String str2 : stringArrayList) {
                            Locale locale4 = Locale.ROOT;
                            lowerCase3 = str2.toLowerCase(locale4);
                            t.e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            lowerCase4 = obj.toString().toLowerCase(locale4);
                            t.e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (!(!t.a(lowerCase3, lowerCase4))) {
                                return false;
                            }
                        }
                    }
                case 60:
                    if (!key.equals("<")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return false;
                    }
                case 61:
                    if (!key.equals("=")) {
                        return false;
                    }
                    return t.a(obj.toString(), string);
                case 62:
                    if (!key.equals(">")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return false;
                    }
                case 1084:
                    if (!key.equals("!=")) {
                        return false;
                    }
                    if (t.a(obj.toString(), string)) {
                        return false;
                    }
                case 1921:
                    if (!key.equals("<=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return false;
                    }
                case 1952:
                    if (!key.equals("==")) {
                        return false;
                    }
                    return t.a(obj.toString(), string);
                case 1983:
                    if (!key.equals(">=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return false;
                    }
                case 3244:
                    if (!key.equals("eq")) {
                        return false;
                    }
                    return t.a(obj.toString(), string);
                case 3294:
                    if (!key.equals(UserDataStore.GENDER)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return false;
                    }
                case 3309:
                    if (!key.equals("gt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return false;
                    }
                case 3365:
                    if (!key.equals("in")) {
                        return false;
                    }
                    if (stringArrayList == null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case 3449:
                    if (!key.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return false;
                    }
                case 3464:
                    if (!key.equals("lt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return false;
                    }
                case 3511:
                    if (!key.equals("ne")) {
                        return false;
                    }
                    if (t.a(obj.toString(), string)) {
                        return false;
                    }
                case 102680:
                    if (!key.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return false;
                    }
                case 107485:
                    if (!key.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return false;
                    }
                case 108954:
                    if (!key.equals("neq")) {
                        return false;
                    }
                    if (t.a(obj.toString(), string)) {
                        return false;
                    }
                case 127966736:
                    if (!key.equals("i_str_eq")) {
                        return false;
                    }
                    String string4 = obj.toString();
                    Locale locale5 = Locale.ROOT;
                    String lowerCase10 = string4.toLowerCase(locale5);
                    t.e(lowerCase10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase11 = string.toLowerCase(locale5);
                    t.e(lowerCase11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return t.a(lowerCase10, lowerCase11);
                case 127966857:
                    if (!key.equals("i_str_in")) {
                        return false;
                    }
                    if (stringArrayList == null) {
                        return false;
                    }
                    while (r8.hasNext()) {
                        Locale locale6 = Locale.ROOT;
                        lowerCase = str.toLowerCase(locale6);
                        t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        lowerCase2 = obj.toString().toLowerCase(locale6);
                        t.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (t.a(lowerCase, lowerCase2)) {
                        }
                    }
                    return false;
                case 363990325:
                    if (!key.equals("i_contains")) {
                        return false;
                    }
                    String string5 = obj.toString();
                    Locale locale7 = Locale.ROOT;
                    String lowerCase12 = string5.toLowerCase(locale7);
                    t.e(lowerCase12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase13 = string.toLowerCase(locale7);
                    t.e(lowerCase13, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return f0.U(lowerCase12, lowerCase13, false, 2, null);
                case 1091487233:
                    if (!key.equals("i_is_not_any")) {
                        return false;
                    }
                    if (stringArrayList == null) {
                        return false;
                    }
                    if (stringArrayList.isEmpty()) {
                        while (r8.hasNext()) {
                            Locale locale8 = Locale.ROOT;
                            lowerCase3 = str2.toLowerCase(locale8);
                            t.e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            lowerCase4 = obj.toString().toLowerCase(locale8);
                            t.e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (!(!t.a(lowerCase3, lowerCase4))) {
                                return false;
                            }
                        }
                    }
                case 1918401035:
                    if (!key.equals("not_contains") || f0.U(obj.toString(), string, false, 2, null)) {
                        return false;
                    }
                case 1961112862:
                    if (!key.equals("i_starts_with")) {
                        return false;
                    }
                    String string6 = obj.toString();
                    Locale locale9 = Locale.ROOT;
                    String lowerCase14 = string6.toLowerCase(locale9);
                    t.e(lowerCase14, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase15 = string.toLowerCase(locale9);
                    t.e(lowerCase15, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    return c0.O(lowerCase14, lowerCase15, false, 2, null);
                default:
                    return false;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return false;
        }
    }

    public static final void generateInfo(Bundle params, String event) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            t.f(params, "params");
            t.f(event, "event");
            params.putString("event", event);
            StringBuilder sb2 = new StringBuilder();
            Utility utility = Utility.INSTANCE;
            Locale locale = utility.getLocale();
            String language = locale != null ? locale.getLanguage() : null;
            String str = "";
            if (language == null) {
                language = "";
            }
            sb2.append(language);
            sb2.append('_');
            Locale locale2 = utility.getLocale();
            String country = locale2 != null ? locale2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb2.append(country);
            params.putString("_locale", sb2.toString());
            String versionName = utility.getVersionName();
            if (versionName == null) {
                versionName = "";
            }
            params.putString("_appVersion", versionName);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            params.putString("_deviceModel", str2);
            params.putString("_nativeAppID", FacebookSdk.getApplicationId());
            String versionName2 = utility.getVersionName();
            if (versionName2 != null) {
                str = versionName2;
            }
            params.putString("_nativeAppShortVersion", str);
            params.putString("_timezone", utility.getDeviceTimeZoneName());
            params.putString(vgmm.eCK, utility.getCarrierName());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", utility.getAvailableExternalStorageGB());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }
}
