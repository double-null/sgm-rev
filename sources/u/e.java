package u;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: FontRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f25837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25838e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25839f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f25834a = (String) w.h.c(str);
        this.f25835b = (String) w.h.c(str2);
        this.f25836c = (String) w.h.c(str3);
        this.f25837d = (List) w.h.c(list);
        this.f25839f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f25837d;
    }

    public int c() {
        return this.f25838e;
    }

    String d() {
        return this.f25839f;
    }

    public String e() {
        return this.f25834a;
    }

    public String f() {
        return this.f25835b;
    }

    public String g() {
        return this.f25836c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f25834a + ", mProviderPackage: " + this.f25835b + ", mQuery: " + this.f25836c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f25837d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f25837d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f25838e);
        return sb2.toString();
    }
}
