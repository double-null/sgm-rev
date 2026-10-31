package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.Logger;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import org.json.JSONException;
import org.json.JSONObject;
import wc.g0;

/* JADX INFO: compiled from: AppEvent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEvent implements Serializable {
    private static final int MAX_IDENTIFIER_LENGTH = 40;
    private static final long serialVersionUID = 1;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;
    private final JSONObject operationalJsonObject;
    public static final Companion Companion = new Companion(null);
    private static final HashSet<String> validatedIdentifiers = new HashSet<>();

    /* JADX INFO: compiled from: AppEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final void validateIdentifier(String identifier) {
            boolean zContains;
            kotlin.jvm.internal.t.f(identifier, "identifier");
            if ((identifier.length() == 0) || identifier.length() > 40) {
                l0 l0Var = l0.f21527a;
                String str = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2));
                kotlin.jvm.internal.t.e(str, "format(locale, format, *args)");
                throw new FacebookException(str);
            }
            synchronized (AppEvent.validatedIdentifiers) {
                zContains = AppEvent.validatedIdentifiers.contains(identifier);
                g0 g0Var = g0.f27756a;
            }
            if (zContains) {
                return;
            }
            if (new rd.o("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").e(identifier)) {
                synchronized (AppEvent.validatedIdentifiers) {
                    AppEvent.validatedIdentifiers.add(identifier);
                }
            } else {
                l0 l0Var2 = l0.f21527a;
                String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{identifier}, 1));
                kotlin.jvm.internal.t.e(str2, "format(format, *args)");
                throw new FacebookException(str2);
            }
        }
    }

    /* JADX INFO: compiled from: AppEvent.kt */
    public static final class SerializationProxyV2 implements Serializable {
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 20160803001L;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;
        private final String operationalJsonString;

        /* JADX INFO: compiled from: AppEvent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public SerializationProxyV2(String jsonString, String operationalJsonString, boolean z10, boolean z11) {
            kotlin.jvm.internal.t.f(jsonString, "jsonString");
            kotlin.jvm.internal.t.f(operationalJsonString, "operationalJsonString");
            this.jsonString = jsonString;
            this.operationalJsonString = operationalJsonString;
            this.isImplicit = z10;
            this.inBackground = z11;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new AppEvent(this.jsonString, this.operationalJsonString, this.isImplicit, this.inBackground, null);
        }
    }

    public /* synthetic */ AppEvent(String str, String str2, boolean z10, boolean z11, kotlin.jvm.internal.k kVar) {
        this(str, str2, z10, z11);
    }

    private final JSONObject getJSONObjectForAppEvent(String str, String str2, Double d10, Bundle bundle, UUID uuid) throws JSONException {
        Companion.validateIdentifier(str2);
        JSONObject jSONObject = new JSONObject();
        String strProcessEvent = RestrictiveDataManager.processEvent(str2);
        if (kotlin.jvm.internal.t.a(strProcessEvent, str2)) {
            strProcessEvent = RedactedEventsManager.processEventsRedaction(str2);
        }
        jSONObject.put(Constants.EVENT_NAME_EVENT_KEY, strProcessEvent);
        jSONObject.put(Constants.LOG_TIME_APP_EVENT_KEY, System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map mapValidateParameters$default = validateParameters$default(this, bundle, false, 2, null);
            for (String str3 : mapValidateParameters$default.keySet()) {
                jSONObject.put(str3, mapValidateParameters$default.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, d10.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        } else {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String string = jSONObject.toString();
            kotlin.jvm.internal.t.e(string, "eventObject.toString()");
            companion.log(loggingBehavior, "AppEvents", "Created app event '%s'", string);
        }
        return jSONObject;
    }

    private final Map<String, String> validateParameters(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String key : bundle.keySet()) {
            Companion companion = Companion;
            kotlin.jvm.internal.t.e(key, "key");
            companion.validateIdentifier(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                l0 l0Var = l0.f21527a;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                kotlin.jvm.internal.t.e(str, "format(format, *args)");
                throw new FacebookException(str);
            }
            map.put(key, obj.toString());
        }
        if (!z10) {
            IntegrityManager.processParameters(map);
            RestrictiveDataManager.processParameters(m0.c(map), this.name);
            EventDeactivationManager.processDeprecatedParameters(m0.c(map), this.name);
        }
        return map;
    }

    static /* synthetic */ Map validateParameters$default(AppEvent appEvent, Bundle bundle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return appEvent.validateParameters(bundle, z10);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.jsonObject.toString();
        kotlin.jvm.internal.t.e(string, "jsonObject.toString()");
        String string2 = this.operationalJsonObject.toString();
        kotlin.jvm.internal.t.e(string2, "operationalJsonObject.toString()");
        return new SerializationProxyV2(string, string2, this.isImplicit, this.inBackground);
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    public final JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getName() {
        return this.name;
    }

    public final JSONObject getOperationalJSONObject() {
        return this.operationalJsonObject;
    }

    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public String toString() {
        l0 l0Var = l0.f21527a;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
        kotlin.jvm.internal.t.e(str, "format(format, *args)");
        return str;
    }

    public /* synthetic */ AppEvent(String str, String str2, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid, OperationalData operationalData, int i10, kotlin.jvm.internal.k kVar) throws JSONException, FacebookException {
        this(str, str2, d10, bundle, z10, z11, uuid, (i10 & 128) != 0 ? null : operationalData);
    }

    public final JSONObject getOperationalJSONObject(OperationalDataEnum type) {
        kotlin.jvm.internal.t.f(type, "type");
        return this.operationalJsonObject.optJSONObject(type.getValue());
    }

    public AppEvent(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid, OperationalData operationalData) throws JSONException, FacebookException {
        JSONObject json;
        kotlin.jvm.internal.t.f(contextName, "contextName");
        kotlin.jvm.internal.t.f(eventName, "eventName");
        this.isImplicit = z10;
        this.inBackground = z11;
        this.name = eventName;
        this.operationalJsonObject = (operationalData == null || (json = operationalData.toJSON()) == null) ? new JSONObject() : json;
        this.jsonObject = getJSONObjectForAppEvent(contextName, eventName, d10, bundle, uuid);
    }

    private AppEvent(String str, String str2, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.operationalJsonObject = new JSONObject(str2);
        this.isImplicit = z10;
        String strOptString = jSONObject.optString(Constants.EVENT_NAME_EVENT_KEY);
        kotlin.jvm.internal.t.e(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.name = strOptString;
        this.inBackground = z11;
    }
}
