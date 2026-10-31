package j3;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import k9.dW.xjwcmjDeOXR;
import org.json.JSONObject;

/* JADX INFO: compiled from: DefaultSettingsSpiCall.java */
/* JADX INFO: loaded from: classes4.dex */
class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g3.b f20570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z2.f f20571c;

    public c(String str, g3.b bVar) {
        this(str, bVar, z2.f.f());
    }

    private g3.a b(g3.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f20602a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f20603b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f20604c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f20605d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f20606e.a().c());
        return aVar;
    }

    private void c(g3.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f20571c.l("Failed to parse settings JSON from " + this.f20569a, e10);
            this.f20571c.k("Settings response " + str);
            return null;
        }
    }

    @Override // j3.k
    public JSONObject a(j jVar, boolean z10) {
        CrashlyticsWorkers.d();
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapF = f(jVar);
            g3.a aVarB = b(d(mapF), jVar);
            this.f20571c.b("Requesting settings from " + this.f20569a);
            this.f20571c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e10) {
            this.f20571c.e("Settings request failed.", e10);
            return null;
        }
    }

    protected g3.a d(Map<String, String> map) {
        return this.f20570b.a(this.f20569a, map).d("User-Agent", "Crashlytics Android SDK/" + CrashlyticsCore.getVersion()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(g3.c cVar) {
        int iB = cVar.b();
        this.f20571c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f20571c.d("Settings request failed; (status: " + iB + ") from " + this.f20569a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    c(String str, g3.b bVar, z2.f fVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f20571c = fVar;
        this.f20570b = bVar;
        this.f20569a = str;
    }

    private Map<String, String> f(j jVar) {
        HashMap map = new HashMap();
        map.put("build_version", jVar.f20609h);
        map.put("display_version", jVar.f20608g);
        map.put(ShareConstants.FEED_SOURCE_PARAM, Integer.toString(jVar.f20610i));
        String str = jVar.f20607f;
        if (!TextUtils.isEmpty(str)) {
            map.put(xjwcmjDeOXR.FVjBiA, str);
        }
        return map;
    }
}
