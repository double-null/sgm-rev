package j3;

import com.google.firebase.crashlytics.internal.common.j0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SettingsJsonParser.java */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f20601a;

    h(j0 j0Var) {
        this.f20601a = j0Var;
    }

    private static i a(int i10) {
        if (i10 == 3) {
            return new l();
        }
        z2.f.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.f20601a, jSONObject);
    }
}
