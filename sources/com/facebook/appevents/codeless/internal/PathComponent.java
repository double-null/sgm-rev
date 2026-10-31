package com.facebook.appevents.codeless.internal;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PathComponent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PathComponent {
    public static final Companion Companion = new Companion(null);
    private static final String PATH_CLASS_NAME_KEY = "class_name";
    private static final String PATH_DESCRIPTION_KEY = "description";
    private static final String PATH_HINT_KEY = "hint";
    private static final String PATH_ID_KEY = "id";
    private static final String PATH_INDEX_KEY = "index";
    private static final String PATH_MATCH_BITMASK_KEY = "match_bitmask";
    private static final String PATH_TAG_KEY = "tag";
    private static final String PATH_TEXT_KEY = "text";
    private final String className;
    private final String description;
    private final String hint;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f10961id;
    private final int index;
    private final int matchBitmask;
    private final String tag;
    private final String text;

    /* JADX INFO: compiled from: PathComponent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PathComponent.kt */
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i10) {
            this.value = i10;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(JSONObject component) throws JSONException {
        t.f(component, "component");
        String string = component.getString(PATH_CLASS_NAME_KEY);
        t.e(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.className = string;
        this.index = component.optInt(PATH_INDEX_KEY, -1);
        this.f10961id = component.optInt("id");
        String strOptString = component.optString("text");
        t.e(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.text = strOptString;
        String strOptString2 = component.optString("tag");
        t.e(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.tag = strOptString2;
        String strOptString3 = component.optString("description");
        t.e(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.description = strOptString3;
        String strOptString4 = component.optString("hint");
        t.e(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.hint = strOptString4;
        this.matchBitmask = component.optInt(PATH_MATCH_BITMASK_KEY);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.f10961id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMatchBitmask() {
        return this.matchBitmask;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }
}
