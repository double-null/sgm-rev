package o5;

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
    private final l f23043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f23044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<n> f23045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, n> f23046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f23047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f23049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f23050h;

    private d(l lVar, WebView webView, String str, List<n> list, String str2, String str3, e eVar, m mVar) {
        ArrayList arrayList = new ArrayList();
        this.f23045c = arrayList;
        this.f23046d = new HashMap();
        this.f23043a = lVar;
        this.f23044b = webView;
        this.f23047e = str;
        this.f23050h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            for (n nVar : list) {
                this.f23046d.put(UUID.randomUUID().toString(), nVar);
            }
        }
        this.f23049g = str2;
        this.f23048f = str3;
    }

    public static d a(l lVar, WebView webView, String str, String str2) {
        w5.g.b(lVar, "Partner is null");
        w5.g.b(webView, "WebView is null");
        if (str2 != null) {
            w5.g.c(str2, UserVerificationMethods.USER_VERIFY_HANDPRINT, "CustomReferenceData is greater than 256 characters");
        }
        return new d(lVar, webView, null, null, str, str2, e.HTML, null);
    }

    public static d b(l lVar, String str, List<n> list, String str2, String str3) {
        return c(lVar, str, list, str2, str3, null);
    }

    public static d c(l lVar, String str, List<n> list, String str2, String str3, m mVar) {
        w5.g.b(lVar, "Partner is null");
        w5.g.b(str, "OM SDK JS script content is null");
        w5.g.b(list, "VerificationScriptResources is null");
        if (str3 != null) {
            w5.g.c(str3, UserVerificationMethods.USER_VERIFY_HANDPRINT, "CustomReferenceData is greater than 256 characters");
        }
        return new d(lVar, null, str, list, str2, str3, e.f23052c, mVar);
    }

    public e d() {
        return this.f23050h;
    }

    public String e() {
        return this.f23049g;
    }

    public String f() {
        return this.f23048f;
    }

    public Map<String, n> g() {
        return Collections.unmodifiableMap(this.f23046d);
    }

    public String h() {
        return this.f23047e;
    }

    public l i() {
        return this.f23043a;
    }

    public m j() {
        return null;
    }

    public List<n> k() {
        return Collections.unmodifiableList(this.f23045c);
    }

    public WebView l() {
        return this.f23044b;
    }
}
