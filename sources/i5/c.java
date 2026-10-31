package i5;

import a5.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import c0.IbU.elEbP;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WindowManager f15985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f15986b = {"x", "y", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static float f15987c = Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15988a;

        static {
            int[] iArr = new int[k.values().length];
            f15988a = iArr;
            try {
                iArr[k.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f15989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f15990b;

        b(float f10, float f11) {
            this.f15989a = f10;
            this.f15990b = f11;
        }
    }

    static float a(int i10) {
        return i10 / f15987c;
    }

    private static b b(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f15985a != null) {
            Point point = new Point(0, 0);
            f15985a.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        return new b(fA, fA2);
    }

    public static JSONObject c(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put("y", a(i11));
            jSONObject.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, a(i12));
            jSONObject.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, a(i13));
        } catch (JSONException e10) {
            d.b("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void d(Context context) {
        if (context != null) {
            f15987c = context.getResources().getDisplayMetrics().density;
            f15985a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void e(JSONObject jSONObject, k kVar) {
        try {
            jSONObject.put("noOutputDevice", k(kVar));
        } catch (JSONException e10) {
            d.b("Error with setting output device status", e10);
        }
    }

    public static void f(JSONObject jSONObject, j5.b.a aVar) {
        e5.e eVarA = aVar.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.c().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", eVarA.d());
            jSONObject.put("friendlyObstructionPurpose", eVarA.b());
            jSONObject.put("friendlyObstructionReason", eVarA.a());
        } catch (JSONException e10) {
            d.b("Error with setting friendly obstruction", e10);
        }
    }

    public static void g(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e10) {
            d.b("Error with setting has window focus", e10);
        }
    }

    public static void h(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            d.b("Error with setting ad session id", e10);
        }
    }

    public static void i(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            d.b("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void j(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean k(k kVar) {
        return a.f15988a[kVar.ordinal()] == 1;
    }

    private static boolean l(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static Map<String, String> m(JSONObject jSONObject) {
        try {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    map.put(next, (String) obj);
                }
            }
            return map;
        } catch (Exception e10) {
            throw new RuntimeException("Failed to parse JSON to Map", e10);
        }
    }

    public static void n(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e10) {
                d.b("Error with setting is picture-in-picture active", e10);
            }
        }
    }

    public static void o(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            d.b("Error with setting not visible reason", e10);
        }
    }

    private static boolean p(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!l(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!w(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!l(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!jSONArrayOptJSONArray.optString(i10, "").equals(jSONArrayOptJSONArray2.optString(i10, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean s(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean t(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean u(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f15986b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean v(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean w(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return u(jSONObject, jSONObject2) && v(jSONObject, jSONObject2) && t(jSONObject, jSONObject2) && s(jSONObject, jSONObject2) && r(jSONObject, jSONObject2) && p(jSONObject, jSONObject2);
    }

    public static void q(JSONObject jSONObject) {
        b bVarB = b(jSONObject);
        try {
            jSONObject.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, bVarB.f15989a);
            jSONObject.put(elEbP.tmpXSvYSxYH, bVarB.f15990b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
