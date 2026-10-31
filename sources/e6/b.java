package e6;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.AccessToken;
import d6.e;
import d6.f;
import d6.g;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f6.c<f> f14494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f6.c<e> f14495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f6.c<d6.b> f14496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f6.c<g> f14497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f6.c<?> f14498g = new e6.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f14499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6.a f14500b;

    private static class a extends e6.a<e> {
        private a() {
        }

        @Override // e6.a
        final /* synthetic */ e b(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                String strOptString = jSONObject.optString("scope");
                return new e(new d6.d(jSONObject.getString("access_token"), jSONObject.getLong(AccessToken.EXPIRES_IN_KEY) * 1000, System.currentTimeMillis(), jSONObject.getString("refresh_token")), TextUtils.isEmpty(strOptString) ? Collections.emptyList() : Arrays.asList(strOptString.split(" ")));
            }
            throw new JSONException("Illegal token type. token_type=" + string);
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: e6.b$b, reason: collision with other inner class name */
    private static class C0216b extends e6.a<f> {
        private C0216b() {
        }

        @Override // e6.a
        final /* synthetic */ f b(JSONObject jSONObject) {
            return new f(jSONObject.getString("otpId"), jSONObject.getString("otp"));
        }

        /* synthetic */ C0216b(byte b10) {
            this();
        }
    }

    private static class c extends e6.a<g> {
        private c() {
        }

        @Override // e6.a
        final /* synthetic */ g b(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                return new g(jSONObject.getString("access_token"), jSONObject.getLong(AccessToken.EXPIRES_IN_KEY) * 1000, jSONObject.optString("refresh_token"));
            }
            throw new JSONException("Illegal token type. token_type=" + string);
        }

        /* synthetic */ c(byte b10) {
            this();
        }
    }

    private static class d extends e6.a<d6.b> {
        private d() {
        }

        @Override // e6.a
        final /* synthetic */ d6.b b(JSONObject jSONObject) {
            String strOptString = jSONObject.optString("scope");
            return new d6.b(jSONObject.getString("client_id"), jSONObject.getLong(AccessToken.EXPIRES_IN_KEY) * 1000, TextUtils.isEmpty(strOptString) ? Collections.emptyList() : Arrays.asList(strOptString.split(" ")));
        }

        /* synthetic */ d(byte b10) {
            this();
        }
    }

    static {
        byte b10 = 0;
        f14494c = new C0216b(b10);
        f14495d = new a(b10);
        f14496e = new d(b10);
        f14497f = new c(b10);
    }

    public b(Context context, Uri uri) {
        this(uri, new f6.a(context, "4.0.7"));
    }

    private b(Uri uri, f6.a aVar) {
        this.f14499a = uri;
        this.f14500b = aVar;
    }
}
