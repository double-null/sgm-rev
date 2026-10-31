package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ParameterComponent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ParameterComponent {
    public static final Companion Companion = new Companion(null);
    private static final String PARAMETER_NAME_KEY = "name";
    private static final String PARAMETER_PATH_KEY = "path";
    private static final String PARAMETER_VALUE_KEY = "value";
    private final String name;
    private final List<PathComponent> path;
    private final String pathType;
    private final String value;

    /* JADX INFO: compiled from: ParameterComponent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public ParameterComponent(JSONObject component) throws JSONException {
        t.f(component, "component");
        String string = component.getString("name");
        t.e(string, "component.getString(PARAMETER_NAME_KEY)");
        this.name = string;
        String strOptString = component.optString("value");
        t.e(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.value = strOptString;
        String strOptString2 = component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
        t.e(strOptString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.pathType = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = component.optJSONArray(PARAMETER_PATH_KEY);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                t.e(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject));
            }
        }
        this.path = arrayList;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathComponent> getPath() {
        return this.path;
    }

    public final String getPathType() {
        return this.pathType;
    }

    public final String getValue() {
        return this.value;
    }
}
