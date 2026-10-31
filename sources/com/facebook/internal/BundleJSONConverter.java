package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BundleJSONConverter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BundleJSONConverter {
    public static final BundleJSONConverter INSTANCE = new BundleJSONConverter();
    private static final Map<Class<?>, Setter> SETTERS;

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    public interface Setter {
        void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException;

        void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        SETTERS = map;
        map.put(Boolean.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.1
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(bundle, "bundle");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject json, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(json, "json");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                json.put(key, value);
            }
        });
        map.put(Integer.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.2
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(bundle, "bundle");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                bundle.putInt(key, ((Integer) value).intValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject json, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(json, "json");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                json.put(key, value);
            }
        });
        map.put(Long.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.3
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(bundle, "bundle");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                bundle.putLong(key, ((Long) value).longValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject json, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(json, "json");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                json.put(key, value);
            }
        });
        map.put(Double.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.4
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(bundle, "bundle");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                bundle.putDouble(key, ((Double) value).doubleValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject json, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(json, "json");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                json.put(key, value);
            }
        });
        map.put(String.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.5
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(bundle, "bundle");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                bundle.putString(key, (String) value);
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject json, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(json, "json");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                json.put(key, value);
            }
        });
        map.put(String[].class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.6
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(bundle, "bundle");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject json, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(json, "json");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                JSONArray jSONArray = new JSONArray();
                for (String str : (String[]) value) {
                    jSONArray.put(str);
                }
                json.put(key, jSONArray);
            }
        });
        map.put(JSONArray.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(bundle, "bundle");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(key, arrayList);
                    return;
                }
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = jSONArray.get(i10);
                    if (!(obj instanceof String)) {
                        throw new IllegalArgumentException("Unexpected type in an array: " + obj.getClass());
                    }
                    arrayList.add(obj);
                }
                bundle.putStringArrayList(key, arrayList);
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject json, String key, Object value) throws JSONException {
                kotlin.jvm.internal.t.f(json, "json");
                kotlin.jvm.internal.t.f(key, "key");
                kotlin.jvm.internal.t.f(value, "value");
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }

    private BundleJSONConverter() {
    }

    public static final Bundle convertToBundle(JSONObject jsonObject) throws JSONException {
        kotlin.jvm.internal.t.f(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, convertToBundle((JSONObject) value));
                } else {
                    Setter setter = SETTERS.get(value.getClass());
                    if (setter == null) {
                        throw new IllegalArgumentException("Unsupported type: " + value.getClass());
                    }
                    kotlin.jvm.internal.t.e(key, "key");
                    kotlin.jvm.internal.t.e(value, "value");
                    setter.setOnBundle(bundle, key, value);
                }
            }
        }
        return bundle;
    }

    public static final JSONObject convertToJSON(Bundle bundle) throws JSONException {
        kotlin.jvm.internal.t.f(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String key : bundle.keySet()) {
            Object obj = bundle.get(key);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put(key, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(key, convertToJSON((Bundle) obj));
                } else {
                    Setter setter = SETTERS.get(obj.getClass());
                    if (setter == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    kotlin.jvm.internal.t.e(key, "key");
                    setter.setOnJSON(jSONObject, key, obj);
                }
            }
        }
        return jSONObject;
    }
}
