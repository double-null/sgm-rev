package j3;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.j0;
import org.json.JSONObject;

/* JADX INFO: compiled from: DefaultSettingsJsonTransform.java */
/* JADX INFO: loaded from: classes4.dex */
class b implements i {
    b() {
    }

    static d b(j0 j0Var) {
        return new d(j0Var.a() + ((long) Constants.ONE_HOUR), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // j3.i
    public d a(j0 j0Var, JSONObject jSONObject) {
        return b(j0Var);
    }
}
