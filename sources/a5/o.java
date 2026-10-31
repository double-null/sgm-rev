package a5;

import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final URL f90b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f91c;

    private o(String str, URL url, String str2) {
        this.f89a = str;
        this.f90b = url;
        this.f91c = str2;
    }

    public static o a(String str, URL url, String str2) {
        i5.g.f(str, "VendorKey is null or empty");
        i5.g.d(url, "ResourceURL is null");
        i5.g.f(str2, "VerificationParameters is null or empty");
        return new o(str, url, str2);
    }

    public static o b(URL url) {
        i5.g.d(url, "ResourceURL is null");
        return new o(null, url, null);
    }

    public URL c() {
        return this.f90b;
    }

    public String d() {
        return this.f89a;
    }

    public String e() {
        return this.f91c;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        i5.c.i(jSONObject, "vendorKey", this.f89a);
        i5.c.i(jSONObject, "resourceUrl", this.f90b.toString());
        i5.c.i(jSONObject, "verificationParameters", this.f91c);
        return jSONObject;
    }
}
