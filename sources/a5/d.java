package a5;

import android.webkit.WebView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f35a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f36b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<o> f37c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, o> f38d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f39e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f40f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f41g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f42h;

    private d(m mVar, WebView webView, String str, List<o> list, String str2, String str3, e eVar, n nVar) {
        ArrayList arrayList = new ArrayList();
        this.f37c = arrayList;
        this.f38d = new HashMap();
        this.f35a = mVar;
        this.f36b = webView;
        this.f39e = str;
        this.f42h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            for (o oVar : list) {
                this.f38d.put(UUID.randomUUID().toString(), oVar);
            }
        }
        this.f41g = str2;
        this.f40f = str3;
    }

    public static d a(m mVar, WebView webView, String str, String str2) {
        i5.g.d(mVar, "Partner is null");
        i5.g.d(webView, "WebView is null");
        if (str2 != null) {
            i5.g.e(str2, UserVerificationMethods.USER_VERIFY_HANDPRINT, "CustomReferenceData is greater than 256 characters");
        }
        return new d(mVar, webView, null, null, str, str2, e.HTML, null);
    }

    public static d b(m mVar, String str, List<o> list, String str2, String str3) {
        return c(mVar, str, list, str2, str3, null);
    }

    public static d c(m mVar, String str, List<o> list, String str2, String str3, n nVar) {
        i5.g.d(mVar, "Partner is null");
        i5.g.d(str, "OM SDK JS script content is null");
        i5.g.d(list, "VerificationScriptResources is null");
        if (str3 != null) {
            i5.g.e(str3, UserVerificationMethods.USER_VERIFY_HANDPRINT, "CustomReferenceData is greater than 256 characters");
        }
        return new d(mVar, null, str, list, str2, str3, e.NATIVE, nVar);
    }

    public e d() {
        return this.f42h;
    }

    public String e() {
        return this.f41g;
    }

    public String f() {
        return this.f40f;
    }

    public Map<String, o> g() {
        return Collections.unmodifiableMap(this.f38d);
    }

    public String h() {
        return this.f39e;
    }

    public m i() {
        return this.f35a;
    }

    public n j() {
        return null;
    }

    public List<o> k() {
        return Collections.unmodifiableList(this.f37c);
    }

    public WebView l() {
        return this.f36b;
    }
}
