package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: EventBinding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class EventBinding {
    public static final Companion Companion = new Companion(null);
    private final String activityName;
    private final String appVersion;
    private final String componentId;
    private final String eventName;
    private final MappingMethod method;
    private final List<ParameterComponent> parameters;
    private final List<PathComponent> path;
    private final String pathType;
    private final ActionType type;

    /* JADX INFO: compiled from: EventBinding.kt */
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* JADX INFO: compiled from: EventBinding.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final EventBinding getInstanceFromJson(JSONObject mapping) throws JSONException, IllegalArgumentException {
            t.f(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString("method");
            t.e(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            t.e(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            t.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            MappingMethod mappingMethodValueOf = MappingMethod.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            t.e(string2, "mapping.getString(\"event_type\")");
            t.e(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            t.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            ActionType actionTypeValueOf = ActionType.valueOf(upperCase2);
            String appVersion = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonPath = jSONArray.getJSONObject(i10);
                t.e(jsonPath, "jsonPath");
                arrayList.add(new PathComponent(jsonPath));
            }
            String pathType = mapping.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
            JSONArray jSONArrayOptJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jsonParameter = jSONArrayOptJSONArray.getJSONObject(i11);
                    t.e(jsonParameter, "jsonParameter");
                    arrayList2.add(new ParameterComponent(jsonParameter));
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            t.e(eventName, "eventName");
            t.e(appVersion, "appVersion");
            t.e(componentId, "componentId");
            t.e(pathType, "pathType");
            t.e(activityName, "activityName");
            return new EventBinding(eventName, mappingMethodValueOf, actionTypeValueOf, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        public final List<EventBinding> parseArray(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        t.e(jSONObject, "array.getJSONObject(i)");
                        arrayList.add(getInstanceFromJson(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: EventBinding.kt */
    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    public EventBinding(String eventName, MappingMethod method, ActionType type, String appVersion, List<PathComponent> path, List<ParameterComponent> parameters, String componentId, String pathType, String activityName) {
        t.f(eventName, "eventName");
        t.f(method, "method");
        t.f(type, "type");
        t.f(appVersion, "appVersion");
        t.f(path, "path");
        t.f(parameters, "parameters");
        t.f(componentId, "componentId");
        t.f(pathType, "pathType");
        t.f(activityName, "activityName");
        this.eventName = eventName;
        this.method = method;
        this.type = type;
        this.appVersion = appVersion;
        this.path = path;
        this.parameters = parameters;
        this.componentId = componentId;
        this.pathType = pathType;
        this.activityName = activityName;
    }

    public static final EventBinding getInstanceFromJson(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return Companion.getInstanceFromJson(jSONObject);
    }

    public static final List<EventBinding> parseArray(JSONArray jSONArray) {
        return Companion.parseArray(jSONArray);
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getComponentId() {
        return this.componentId;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final MappingMethod getMethod() {
        return this.method;
    }

    public final String getPathType() {
        return this.pathType;
    }

    public final ActionType getType() {
        return this.type;
    }

    public final List<ParameterComponent> getViewParameters() {
        List<ParameterComponent> listUnmodifiableList = Collections.unmodifiableList(this.parameters);
        t.e(listUnmodifiableList, "unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    public final List<PathComponent> getViewPath() {
        List<PathComponent> listUnmodifiableList = Collections.unmodifiableList(this.path);
        t.e(listUnmodifiableList, "unmodifiableList(path)");
        return listUnmodifiableList;
    }
}
