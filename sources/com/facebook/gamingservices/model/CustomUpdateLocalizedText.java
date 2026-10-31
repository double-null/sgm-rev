package com.facebook.gamingservices.model;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CustomUpdateContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomUpdateLocalizedText {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final String f1default;
    private final HashMap<String, String> localizations;

    public CustomUpdateLocalizedText(String str, HashMap<String, String> map) {
        t.f(str, "default");
        this.f1default = str;
        this.localizations = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomUpdateLocalizedText copy$default(CustomUpdateLocalizedText customUpdateLocalizedText, String str, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customUpdateLocalizedText.f1default;
        }
        if ((i10 & 2) != 0) {
            map = customUpdateLocalizedText.localizations;
        }
        return customUpdateLocalizedText.copy(str, map);
    }

    public final String component1() {
        return this.f1default;
    }

    public final HashMap<String, String> component2() {
        return this.localizations;
    }

    public final CustomUpdateLocalizedText copy(String str, HashMap<String, String> map) {
        t.f(str, "default");
        return new CustomUpdateLocalizedText(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUpdateLocalizedText)) {
            return false;
        }
        CustomUpdateLocalizedText customUpdateLocalizedText = (CustomUpdateLocalizedText) obj;
        return t.a(this.f1default, customUpdateLocalizedText.f1default) && t.a(this.localizations, customUpdateLocalizedText.localizations);
    }

    public final String getDefault() {
        return this.f1default;
    }

    public final HashMap<String, String> getLocalizations() {
        return this.localizations;
    }

    public int hashCode() {
        int iHashCode = this.f1default.hashCode() * 31;
        HashMap<String, String> map = this.localizations;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("default", this.f1default);
        HashMap<String, String> map = this.localizations;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("localizations", jSONObject2);
        }
        return jSONObject;
    }

    public String toString() {
        return "CustomUpdateLocalizedText(default=" + this.f1default + ", localizations=" + this.localizations + ')';
    }

    public /* synthetic */ CustomUpdateLocalizedText(String str, HashMap map, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? null : map);
    }
}
