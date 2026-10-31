package o5;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final URL f23094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23095c;

    private n(String str, URL url, String str2) {
        this.f23093a = str;
        this.f23094b = url;
        this.f23095c = str2;
    }

    public static n a(String str, URL url, String str2) {
        w5.g.d(str, "VendorKey is null or empty");
        w5.g.b(url, "ResourceURL is null");
        w5.g.d(str2, "VerificationParameters is null or empty");
        return new n(str, url, str2);
    }

    public URL b() {
        return this.f23094b;
    }

    public String c() {
        return this.f23093a;
    }

    public String d() {
        return this.f23095c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        w5.c.g(jSONObject, "vendorKey", this.f23093a);
        w5.c.g(jSONObject, "resourceUrl", this.f23094b.toString());
        w5.c.g(jSONObject, "verificationParameters", this.f23095c);
        return jSONObject;
    }
}
