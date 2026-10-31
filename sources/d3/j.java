package d3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RolloutAssignment.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3.a f13296a = new q3.d().j(a.f13247a).i();

    static j a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new b(str, str2, i(str3), str4, j10);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, UserVerificationMethods.USER_VERIFY_HANDPRINT) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public h0.f.d.e h() {
        return h0.f.d.e.a().d(h0.f.d.e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
