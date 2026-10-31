package v6;

import android.content.Context;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import io.bidmachine.iab.mraid.y;
import io.bidmachine.iab.mraid.z;
import kotlin.jvm.internal.t;
import pb.a1;
import wb.u;

/* JADX INFO: compiled from: MraidFullScreenAdListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vb.i f27184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t7.a f27185c;

    /* JADX INFO: compiled from: MraidFullScreenAdListener.kt */
    public static final class a implements u<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g7.i f27186a;

        a(g7.i iVar) {
            this.f27186a = iVar;
        }

        @Override // wb.u
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            c(bool.booleanValue());
        }

        public void c(boolean z10) {
            this.f27186a.c();
        }
    }

    /* JADX INFO: compiled from: MraidFullScreenAdListener.kt */
    public static final class b implements u<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g7.i f27187a;

        b(g7.i iVar) {
            this.f27187a = iVar;
        }

        @Override // wb.u
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            c(bool.booleanValue());
        }

        public void c(boolean z10) {
            this.f27187a.c();
        }
    }

    public i(Context applicationContext, vb.i callback, t7.a aVar) {
        t.f(applicationContext, "applicationContext");
        t.f(callback, "callback");
        this.f27183a = applicationContext;
        this.f27184b = callback;
        this.f27185c = aVar;
    }

    @Override // io.bidmachine.iab.mraid.z
    public void a(y mraidInterstitial, c7.b iabError) {
        t.f(mraidInterstitial, "mraidInterstitial");
        t.f(iabError, "iabError");
        this.f27184b.b(oc.g.a(iabError));
    }

    @Override // io.bidmachine.iab.mraid.z
    public void c(y mraidInterstitial, c7.b iabError) {
        t.f(mraidInterstitial, "mraidInterstitial");
        t.f(iabError, "iabError");
        this.f27184b.c(oc.g.a(iabError));
    }

    @Override // io.bidmachine.iab.mraid.z
    public void d(y mraidInterstitial, a1 privacySheetParams) {
        t.f(mraidInterstitial, "mraidInterstitial");
        t.f(privacySheetParams, "privacySheetParams");
        sb.a.C0415a c0415a = sb.a.f25384c;
        Context contextX = mraidInterstitial.x();
        if (contextX == null) {
            contextX = this.f27183a;
        }
        Context contextK = io.bidmachine.core.h.k(contextX);
        t.e(contextK, "findDialogContext(mraidI…() ?: applicationContext)");
        c0415a.a(contextK, privacySheetParams);
    }

    @Override // io.bidmachine.iab.mraid.z
    public void e(y mraidInterstitial, c7.b iabError) {
        t.f(mraidInterstitial, "mraidInterstitial");
        t.f(iabError, "iabError");
        this.f27184b.a();
    }

    @Override // io.bidmachine.iab.mraid.z
    public void f(y mraidInterstitial) {
        t.f(mraidInterstitial, "mraidInterstitial");
        this.f27184b.j();
    }

    @Override // io.bidmachine.iab.mraid.z
    public void g(y mraidInterstitial, String url, g7.i iabClickCallback) {
        t.f(mraidInterstitial, "mraidInterstitial");
        t.f(url, "url");
        t.f(iabClickCallback, "iabClickCallback");
        qb.j.c(this.f27183a, url, new oc.c(this.f27184b, iabClickCallback));
    }

    @Override // io.bidmachine.iab.mraid.z
    public void h(y mraidInterstitial, String url, g7.i iabClickCallback) {
        t.f(mraidInterstitial, "mraidInterstitial");
        t.f(url, "url");
        t.f(iabClickCallback, "iabClickCallback");
        this.f27184b.onAdClicked();
        qb.j.b(this.f27183a, url, new a(iabClickCallback));
    }

    @Override // io.bidmachine.iab.mraid.z
    public void i(y mraidInterstitial, String url, g7.i iabClickCallback) {
        t.f(mraidInterstitial, "mraidInterstitial");
        t.f(url, "url");
        t.f(iabClickCallback, "iabClickCallback");
        this.f27184b.onAdClicked();
        qb.j.e(this.f27183a, url, new b(iabClickCallback));
    }

    @Override // io.bidmachine.iab.mraid.z
    public void j(y mraidInterstitial, String url) {
        t.f(mraidInterstitial, "mraidInterstitial");
        t.f(url, "url");
    }

    @Override // io.bidmachine.iab.mraid.z
    public void k(y mraidInterstitial) {
        t.f(mraidInterstitial, "mraidInterstitial");
        if (mraidInterstitial.u()) {
            t7.a aVar = this.f27185c;
            if (aVar != null) {
                aVar.n();
            }
            if (mraidInterstitial.r()) {
                this.f27184b.d();
            }
        }
        this.f27184b.onAdClosed();
    }

    @Override // io.bidmachine.iab.mraid.z
    public void b(y yVar) {
        t.f(yVar, EFLCCdIRcb.ioKFtfqxCD);
        this.f27184b.onAdLoaded();
    }
}
