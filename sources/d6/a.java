package d6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import rd.PSo.cNMUz;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b6.a f13334c;

    public a(Context context, String str) {
        this(context.getApplicationContext(), str, c.a());
    }

    private String a(long j10) {
        return this.f13334c.a(this.f13332a, String.valueOf(j10));
    }

    private String b(String str) {
        return this.f13334c.a(this.f13332a, str);
    }

    private String f(String str) {
        if (str == null) {
            return null;
        }
        return this.f13334c.d(this.f13332a, str);
    }

    private long g(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.valueOf(this.f13334c.d(this.f13332a, str)).longValue();
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void c() {
        this.f13332a.getSharedPreferences(this.f13333b, 0).edit().clear().apply();
    }

    public final void d(d dVar) {
        this.f13332a.getSharedPreferences(this.f13333b, 0).edit().putString(SDKConstants.PARAM_ACCESS_TOKEN, b(dVar.f13341a)).putString("expiresIn", a(dVar.f13342b)).putString("issuedClientTime", a(dVar.f13343c)).putString("refreshToken", b(dVar.f13344d)).apply();
    }

    private a(Context context, String str, b6.a aVar) {
        this.f13332a = context;
        this.f13333b = "com.linecorp.linesdk.accesstoken." + str;
        this.f13334c = aVar;
    }

    public final d e() {
        SharedPreferences sharedPreferences = this.f13332a.getSharedPreferences(this.f13333b, 0);
        try {
            String strF = f(sharedPreferences.getString(SDKConstants.PARAM_ACCESS_TOKEN, null));
            long jG = g(sharedPreferences.getString(cNMUz.byMA, null));
            long jG2 = g(sharedPreferences.getString("issuedClientTime", null));
            if (TextUtils.isEmpty(strF) || jG == -1 || jG2 == -1) {
                return null;
            }
            String strF2 = f(sharedPreferences.getString("refreshToken", null));
            if (strF2 == null) {
                strF2 = "";
            }
            return new d(strF, jG, jG2, strF2);
        } catch (com.linecorp.a.a.a.a unused) {
            c();
            return null;
        }
    }
}
