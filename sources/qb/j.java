package qb;

import android.content.Context;
import android.net.Uri;
import io.bidmachine.iab.mraid.f0;
import java.util.List;
import kotlin.collections.t;
import pa.q;
import pa.w;
import rd.c0;
import wb.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f24732a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f24733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cb.b f24734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final cb.b f24735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f24736e;

    static {
        q qVar = new q();
        f24733b = qVar;
        f0 f0Var = new f0();
        w wVar = new w();
        cb.c cVar = new cb.c(f0Var, qVar);
        f24734c = cVar;
        cb.d dVar = new cb.d(f0Var, wVar);
        f24735d = dVar;
        f24736e = t.n(cVar, dVar, new cb.a());
    }

    private j() {
    }

    public static final void a(Context context, Uri uri, wb.i<Boolean> iVar) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(uri, "uri");
        f24733b.e(context, uri, iVar);
    }

    public static final void b(Context context, String url, wb.i<Boolean> iVar) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(url, "url");
        f24734c.b(context, url, iVar);
    }

    public static final void c(Context context, String url, wb.i<Boolean> iVar) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(url, "url");
        Uri uriD = d(url);
        for (cb.b bVar : f24736e) {
            if (bVar.a(uriD)) {
                bVar.a(context, uriD, iVar);
                return;
            }
        }
        a(context, uriD, iVar);
    }

    public static final Uri d(String url) {
        Uri uriO;
        kotlin.jvm.internal.t.f(url, "url");
        Uri uri = Uri.parse(url);
        kotlin.jvm.internal.t.e(uri, "parse(url)");
        String scheme = uri.getScheme();
        if ((scheme == null || scheme.length() == 0) && !c0.O(url, "/", false, 2, null) && (uriO = d0.o(url)) != null) {
            String scheme2 = uriO.getScheme();
            if (scheme2 == null || scheme2.length() <= 0) {
                String string = uriO.toString();
                kotlin.jvm.internal.t.e(string, "newUri.toString()");
                if (c0.O(string, "/", false, 2, null)) {
                }
            }
            return uriO;
        }
        return uri;
    }

    public static final void e(Context context, String url, wb.i<Boolean> iVar) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(url, "url");
        f24735d.b(context, url, iVar);
    }

    public static final void f(String str) {
        String strP = d0.p(str);
        if (strP == null || strP.length() <= 0) {
            return;
        }
        new c.a(strP, c.e.Get).f(la.f.d()).c();
    }
}
