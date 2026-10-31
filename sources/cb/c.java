package cb;

import android.content.Context;
import android.net.Uri;
import g7.h;
import io.bidmachine.iab.mraid.f0;
import io.bidmachine.iab.mraid.v;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import pa.q;
import wb.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5462c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f5463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f5464b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public c(f0 mraidNativeFeatureUrlParser, q intentLauncher) {
        t.f(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        t.f(intentLauncher, "intentLauncher");
        this.f5463a = mraidNativeFeatureUrlParser;
        this.f5464b = intentLauncher;
    }

    @Override // cb.b
    public boolean a(Uri uri) {
        t.f(uri, "uri");
        return t.a("calendar", uri.getScheme());
    }

    @Override // cb.b
    public void a(Context context, Uri uri, i iVar) {
        t.f(context, "context");
        t.f(uri, "uri");
        v vVarA = this.f5463a.a(uri);
        if (vVarA != null) {
            this.f5464b.f(context, vVarA, iVar);
        } else {
            h.b("MraidCalendarDeeplinkProcessor", "processUrl (mraidCalendarEvent is null)", new Object[0]);
            qb.h.f(Boolean.FALSE, iVar);
        }
    }
}
