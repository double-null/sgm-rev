package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wc.w;

/* JADX INFO: compiled from: CameraEffectJSONUtility.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraEffectJSONUtility {
    public static final CameraEffectJSONUtility INSTANCE = new CameraEffectJSONUtility();
    private static final HashMap<Class<?>, Setter> SETTERS = o0.j(w.a(String.class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$1
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String key, Object obj) throws JSONException {
            t.f(builder, "builder");
            t.f(key, "key");
            t.d(obj, "null cannot be cast to non-null type kotlin.String");
            builder.putArgument(key, (String) obj);
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(JSONObject json, String key, Object obj) throws JSONException {
            t.f(json, "json");
            t.f(key, "key");
            json.put(key, obj);
        }
    }), w.a(String[].class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$2
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String key, Object obj) throws JSONException {
            t.f(builder, "builder");
            t.f(key, "key");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(JSONObject json, String key, Object obj) throws JSONException {
            t.f(json, "json");
            t.f(key, "key");
            JSONArray jSONArray = new JSONArray();
            t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            for (String str : (String[]) obj) {
                jSONArray.put(str);
            }
            json.put(key, jSONArray);
        }
    }), w.a(JSONArray.class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$3
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String key, Object obj) throws JSONException {
            t.f(builder, "builder");
            t.f(key, "key");
            t.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object obj2 = jSONArray.get(i10);
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
                arrayList.add(obj2);
            }
            builder.putArgument(key, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(JSONObject json, String key, Object obj) throws JSONException {
            t.f(json, "json");
            t.f(key, "key");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: CameraEffectJSONUtility.kt */
    interface Setter {
        void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj) throws JSONException;

        void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    private CameraEffectJSONUtility() {
    }

    public static final CameraEffectArguments convertToCameraEffectArguments(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        CameraEffectArguments.Builder builder = new CameraEffectArguments.Builder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object obj = jSONObject.get(key);
            if (obj != JSONObject.NULL) {
                Setter setter = SETTERS.get(obj.getClass());
                if (setter == null) {
                    throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                }
                t.e(key, "key");
                setter.setOnArgumentsBuilder(builder, key, obj);
            }
        }
        return builder.build();
    }

    public static final JSONObject convertToJSON(CameraEffectArguments cameraEffectArguments) throws JSONException {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.keySet()) {
            Object obj = cameraEffectArguments.get(str);
            if (obj != null) {
                Setter setter = SETTERS.get(obj.getClass());
                if (setter == null) {
                    throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                }
                setter.setOnJSON(jSONObject, str, obj);
            }
        }
        return jSONObject;
    }
}
