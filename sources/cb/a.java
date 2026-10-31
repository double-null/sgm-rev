package cb;

import android.content.Context;
import android.net.Uri;
import cc.g;
import cc.m;
import kotlin.jvm.internal.t;
import od.k;
import qb.h;
import qb.j;
import wb.c0;
import wb.d0;
import wb.i;
import wb.l;
import wb.z;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cb.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5452b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f5453a = new l();

    /* JADX INFO: renamed from: cb.a$a, reason: collision with other inner class name */
    private static final class C0097a implements g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f5454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f5455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f5456c;

        public C0097a(Context context, Uri baseUri, i iVar) {
            t.f(context, "context");
            t.f(baseUri, "baseUri");
            this.f5454a = baseUri;
            this.f5455b = iVar;
            Context applicationContext = context.getApplicationContext();
            t.e(applicationContext, "context.applicationContext");
            this.f5456c = applicationContext;
        }

        @Override // cc.g.d
        public void a(m responseMetadata) {
            t.f(responseMetadata, "responseMetadata");
            Integer numA = responseMetadata.a();
            if (numA != null && numA.intValue() == 204) {
                h.f(Boolean.FALSE, this.f5455b);
                return;
            }
            d dVar = new d(this.f5456c, this.f5454a, this.f5455b);
            od.h hVarN = k.n(400, 600);
            Integer numA2 = responseMetadata.a();
            if (numA2 != null && hVarN.g(numA2.intValue())) {
                h.f(Boolean.FALSE, dVar);
                return;
            }
            String strB = responseMetadata.b("Location");
            Uri uriA = strB != null ? c0.a(strB) : null;
            if (uriA == null) {
                h.f(Boolean.FALSE, dVar);
            } else {
                j.a(this.f5456c, uriA, dVar);
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        private b() {
        }
    }

    private static final class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f5457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f5458b;

        public c(Uri baseUri, i iVar) {
            t.f(baseUri, "baseUri");
            this.f5457a = baseUri;
            this.f5458b = iVar;
        }

        public void c(boolean z10) {
            if (z10) {
                j.f(this.f5457a.getQueryParameter("fallbackTrackingUrl"));
            }
            h.f(Boolean.valueOf(z10), this.f5458b);
        }

        @Override // wb.i
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            c(((Boolean) obj).booleanValue());
        }
    }

    private static final class d implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f5459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i f5460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f5461c;

        public d(Context context, Uri baseUri, i iVar) {
            t.f(context, "context");
            t.f(baseUri, "baseUri");
            this.f5459a = baseUri;
            this.f5460b = iVar;
            Context applicationContext = context.getApplicationContext();
            t.e(applicationContext, "context.applicationContext");
            this.f5461c = applicationContext;
        }

        public void c(boolean z10) {
            if (z10) {
                j.f(this.f5459a.getQueryParameter("primaryTrackingUrl"));
                h.f(Boolean.TRUE, this.f5460b);
                return;
            }
            String queryParameter = this.f5459a.getQueryParameter("fallbackUrl");
            if (queryParameter == null || queryParameter.length() == 0) {
                h.f(Boolean.FALSE, this.f5460b);
                return;
            }
            Uri uriO = d0.o(queryParameter);
            if (uriO == null) {
                h.f(Boolean.FALSE, this.f5460b);
            } else {
                j.a(this.f5461c, uriO, new c(this.f5459a, this.f5460b));
            }
        }

        @Override // wb.i
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            c(((Boolean) obj).booleanValue());
        }
    }

    @Override // cb.b
    public boolean a(Uri uri) {
        t.f(uri, "uri");
        return t.a("bmlink", uri.getScheme());
    }

    @Override // cb.b
    public void a(Context context, Uri uri, i iVar) {
        t.f(context, "context");
        t.f(uri, "uri");
        String queryParameter = uri.getQueryParameter("primaryUrl");
        if (queryParameter == null || queryParameter.length() == 0) {
            g7.h.b("BMDeeplinkProcessor", "processUrl (primaryUrl is null or empty)", new Object[0]);
            h.f(Boolean.FALSE, iVar);
            return;
        }
        Uri uriO = d0.o(queryParameter);
        if (uriO == null) {
            g7.h.b("BMDeeplinkProcessor", "processUrl (primaryUri is null)", new Object[0]);
            h.f(Boolean.FALSE, iVar);
            return;
        }
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -761251354) {
                if (iHashCode == 145262545 && host.equals("inlineinstalls")) {
                    l lVar = this.f5453a;
                    Context contextA = z.f27734a.a();
                    if (contextA == null) {
                        contextA = context;
                    }
                    h.f(Boolean.valueOf(lVar.a(contextA, uriO)), new d(context, uri, iVar));
                    return;
                }
            } else if (host.equals("clickproxy")) {
                String string = uriO.toString();
                t.e(string, "primaryUri.toString()");
                g.a.c(new g.a(string, cc.d.Get).f(cc.k.None).e(new C0097a(context, uri, iVar)), null, 1, null);
                return;
            }
        }
        j.a(context, uriO, new d(context, uri, iVar));
    }
}
