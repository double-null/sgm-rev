package a3;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;
import z2.f;

/* JADX INFO: compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements a, BreadcrumbSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b3.a f27a;

    private static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void a(b3.a aVar) {
        this.f27a = aVar;
        f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // a3.a
    public void b(String str, Bundle bundle) {
        b3.a aVar = this.f27a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
