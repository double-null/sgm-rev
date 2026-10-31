package e6;

import android.content.Context;
import android.net.Uri;
import c6.f;
import com.google.android.gms.common.Scopes;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f6.c<f> f14502c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f14503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f6.a f14504b;

    static class a extends e6.a<f> {
        a() {
        }

        @Override // e6.a
        final /* synthetic */ f b(JSONObject jSONObject) {
            String strOptString = jSONObject.optString("pictureUrl", null);
            return new f(jSONObject.getString("userId"), jSONObject.getString("displayName"), strOptString == null ? null : Uri.parse(strOptString), jSONObject.optString("statusMessage", null));
        }
    }

    public d(Context context, Uri uri) {
        this(uri, new f6.a(context, "4.0.7"));
    }

    public final c6.c<f> a(d6.d dVar) {
        Uri uriBuild = this.f14503a.buildUpon().appendPath(Scopes.PROFILE).build();
        HashMap map = new HashMap(1);
        map.put("Authorization", "Bearer " + dVar.f13341a);
        return this.f14504b.f(uriBuild, map, Collections.emptyMap(), f14502c);
    }

    private d(Uri uri, f6.a aVar) {
        this.f14503a = uri;
        this.f14504b = aVar;
    }
}
