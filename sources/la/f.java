package la;

import android.content.Context;
import io.bidmachine.iab.mraid.b0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import pa.h;
import qb.k;
import ud.p0;
import ud.t2;
import wb.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f21923a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f21924b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static k f21925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static qb.d f21926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile id.a f21927e;

    static final class a extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ xb.a f21928d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.a aVar) {
            super(0);
            this.f21928d = aVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final xb.a invoke() {
            return this.f21928d;
        }
    }

    private f() {
    }

    public static final id.a<xb.a> b() {
        return f21927e;
    }

    public static final qb.d c() {
        return f21926d;
    }

    public static final String d() {
        k kVar = f21925c;
        if (kVar != null) {
            return kVar.getUserAgent();
        }
        return null;
    }

    public static final void g(k kVar) {
        f21925c = kVar;
    }

    public final g a(xb.a mediaFileCacheManager) {
        t.f(mediaFileCacheManager, "mediaFileCacheManager");
        return new jb.a(new a(mediaFileCacheManager), p0.a(t2.b(null, 1, null).z(w.f27717g.a().f())), h.f23769i.a());
    }

    public final void e(Context context, qb.d networkRequestBuilder, id.a<xb.a> mediaFileCacheManagerProvider) {
        t.f(context, "context");
        t.f(networkRequestBuilder, "networkRequestBuilder");
        t.f(mediaFileCacheManagerProvider, "mediaFileCacheManagerProvider");
        if (f21924b.compareAndSet(false, true)) {
            f21926d = networkRequestBuilder;
            f21927e = mediaFileCacheManagerProvider;
        }
    }

    public final void f(boolean z10) {
        pa.t.e(z10);
        b0.h(z10);
    }
}
