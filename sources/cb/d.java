package cb;

import android.content.Context;
import android.net.Uri;
import g7.h;
import io.bidmachine.iab.mraid.f0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import pa.w;
import wb.i;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5465c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f5466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f5467b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public d(f0 mraidNativeFeatureUrlParser, w pictureDownloader) {
        t.f(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        t.f(pictureDownloader, "pictureDownloader");
        this.f5466a = mraidNativeFeatureUrlParser;
        this.f5467b = pictureDownloader;
    }

    @Override // cb.b
    public boolean a(Uri uri) {
        t.f(uri, "uri");
        return t.a("storePicture", uri.getScheme());
    }

    @Override // cb.b
    public void a(Context context, Uri uri, i iVar) {
        t.f(context, "context");
        t.f(uri, "uri");
        Uri uriB = this.f5466a.b(uri);
        if (uriB == null) {
            h.b("MraidStorePictureDeeplinkProcessor", "processUrl (storePictureUri is null)", new Object[0]);
            qb.h.f(Boolean.FALSE, iVar);
        } else {
            w wVar = this.f5467b;
            Context applicationContext = context.getApplicationContext();
            t.e(applicationContext, "context.applicationContext");
            wVar.b(applicationContext, uriB, iVar);
        }
    }
}
