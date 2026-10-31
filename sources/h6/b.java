package h6;

import android.net.Uri;
import android.text.TextUtils;
import c6.e;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.login.CustomTabLoginMethodHandler;
import d6.g;
import e6.d;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements g6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e6.b f15617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f15618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d6.a f15619d;

    public b(String str, e6.b bVar, d dVar, d6.a aVar) {
        this.f15616a = str;
        this.f15617b = bVar;
        this.f15618c = dVar;
        this.f15619d = aVar;
    }

    @Override // g6.a
    public final c6.c<?> a() {
        d6.d dVarE = this.f15619d.e();
        if (dVarE == null) {
            return c6.c.a(c6.d.INTERNAL_ERROR, new c6.b("access token is null"));
        }
        e6.b bVar = this.f15617b;
        c6.c<?> cVarA = bVar.f14500b.a(bVar.f14499a.buildUpon().appendPath(CustomTabLoginMethodHandler.OAUTH_DIALOG).appendPath("revoke").build(), Collections.emptyMap(), Collections.singletonMap("refresh_token", dVarE.f13344d), e6.b.f14498g);
        if (cVarA.g()) {
            this.f15619d.c();
        }
        return cVarA;
    }

    @Override // g6.a
    public final c6.c<e> b() {
        d6.d dVarE = this.f15619d.e();
        if (dVarE == null) {
            return c6.c.a(c6.d.INTERNAL_ERROR, new c6.b("access token is null"));
        }
        e6.b bVar = this.f15617b;
        Uri uriBuild = bVar.f14499a.buildUpon().appendPath(CustomTabLoginMethodHandler.OAUTH_DIALOG).appendPath("verify").build();
        HashMap map = new HashMap(1);
        map.put("access_token", dVarE.f13341a);
        c6.c cVarA = bVar.f14500b.a(uriBuild, Collections.emptyMap(), map, e6.b.f14496e);
        if (!cVarA.g()) {
            return c6.c.a(cVarA.d(), cVarA.c());
        }
        d6.b bVar2 = (d6.b) cVarA.e();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f15619d.d(new d6.d(dVarE.f13341a, bVar2.f13336b, jCurrentTimeMillis, dVarE.f13344d));
        return c6.c.b(new e(new c6.a(dVarE.f13341a, bVar2.f13336b, jCurrentTimeMillis), bVar2.f13337c));
    }

    @Override // g6.a
    public final c6.c<c6.a> c() {
        d6.d dVarE = this.f15619d.e();
        if (dVarE == null || TextUtils.isEmpty(dVarE.f13344d)) {
            return c6.c.a(c6.d.INTERNAL_ERROR, new c6.b("access token or refresh token is not found."));
        }
        e6.b bVar = this.f15617b;
        String str = this.f15616a;
        Uri uriBuild = bVar.f14499a.buildUpon().appendPath(CustomTabLoginMethodHandler.OAUTH_DIALOG).appendPath(SDKConstants.PARAM_ACCESS_TOKEN).build();
        HashMap map = new HashMap(3);
        map.put("grant_type", "refresh_token");
        map.put("refresh_token", dVarE.f13344d);
        map.put("client_id", str);
        c6.c cVarA = bVar.f14500b.a(uriBuild, Collections.emptyMap(), map, e6.b.f14497f);
        if (!cVarA.g()) {
            return c6.c.a(cVarA.d(), cVarA.c());
        }
        g gVar = (g) cVarA.e();
        d6.d dVar = new d6.d(gVar.f13349a, gVar.f13350b, System.currentTimeMillis(), TextUtils.isEmpty(gVar.f13351c) ? dVarE.f13344d : gVar.f13351c);
        this.f15619d.d(dVar);
        return c6.c.b(new c6.a(dVar.f13341a, dVar.f13342b, dVar.f13343c));
    }

    @Override // g6.a
    public final c6.c<c6.a> d() {
        d6.d dVarE = this.f15619d.e();
        return dVarE == null ? c6.c.a(c6.d.INTERNAL_ERROR, new c6.b("The cached access token does not exist.")) : c6.c.b(new c6.a(dVarE.f13341a, dVarE.f13342b, dVarE.f13343c));
    }
}
