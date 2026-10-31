package sa;

import android.webkit.WebView;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import io.bidmachine.iab.mraid.g0;
import kotlin.jvm.internal.t;
import pb.a1;
import pb.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements io.bidmachine.iab.mraid.i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f25380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qa.c f25381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fb.b f25382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ob.e f25383d;

    public i(h htmlAdForm, qa.c adFormListener, fb.b eventCallback, ob.e eVar) {
        t.f(htmlAdForm, "htmlAdForm");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        this.f25380a = htmlAdForm;
        this.f25381b = adFormListener;
        this.f25382c = eventCallback;
        this.f25383d = eVar;
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void a(io.bidmachine.iab.mraid.i mraidAdView) {
        t.f(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void b(io.bidmachine.iab.mraid.i mraidAdView, g0 mraidOrientationProperties) {
        t.f(mraidAdView, "mraidAdView");
        t.f(mraidOrientationProperties, "mraidOrientationProperties");
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public boolean c(io.bidmachine.iab.mraid.i mraidAdView) {
        t.f(mraidAdView, "mraidAdView");
        return true;
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void d(io.bidmachine.iab.mraid.i mraidAdView, String url) {
        t.f(mraidAdView, "mraidAdView");
        t.f(url, "url");
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void e(io.bidmachine.iab.mraid.i mraidAdView, c7.b iabError) {
        t.f(mraidAdView, "mraidAdView");
        t.f(iabError, "iabError");
        h hVar = this.f25380a;
        String strD = iabError.d();
        t.e(strD, "iabError.message");
        hVar.Y(new b0(strD));
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void f(io.bidmachine.iab.mraid.i mraidAdView) {
        t.f(mraidAdView, "mraidAdView");
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void g(io.bidmachine.iab.mraid.i mraidAdView) {
        t.f(mraidAdView, "mraidAdView");
        this.f25382c.onClose();
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void h(io.bidmachine.iab.mraid.i mraidAdView) {
        t.f(mraidAdView, "mraidAdView");
        this.f25382c.f();
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void i(io.bidmachine.iab.mraid.i mraidAdView, String url) {
        t.f(mraidAdView, "mraidAdView");
        t.f(url, "url");
        this.f25382c.a(url);
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void k(io.bidmachine.iab.mraid.i mraidAdView, String url, WebView webView, boolean z10) {
        t.f(mraidAdView, "mraidAdView");
        t.f(url, "url");
        t.f(webView, "webView");
        ob.e eVar = this.f25383d;
        if (eVar != null) {
            eVar.u(webView);
        }
        this.f25381b.e(this.f25380a);
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void l(io.bidmachine.iab.mraid.i mraidAdView, String url) {
        t.f(mraidAdView, "mraidAdView");
        t.f(url, "url");
        i(mraidAdView, url);
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void m(io.bidmachine.iab.mraid.i mraidAdView, c7.b iabError) {
        t.f(mraidAdView, "mraidAdView");
        t.f(iabError, "iabError");
        qa.c cVar = this.f25381b;
        h hVar = this.f25380a;
        String strD = iabError.d();
        t.e(strD, "iabError.message");
        cVar.b(hVar, new b0(strD));
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public boolean n(io.bidmachine.iab.mraid.i mraidAdView, WebView webView, g0 g0Var, boolean z10) {
        t.f(mraidAdView, "mraidAdView");
        t.f(webView, "webView");
        return true;
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void o(io.bidmachine.iab.mraid.i mraidAdView, a1 privacySheetParams) {
        t.f(mraidAdView, "mraidAdView");
        t.f(privacySheetParams, "privacySheetParams");
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void p(io.bidmachine.iab.mraid.i mraidAdView, boolean z10) {
        t.f(mraidAdView, "mraidAdView");
        this.f25382c.t(z10);
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void q(io.bidmachine.iab.mraid.i mraidAdView, c7.b iabError) {
        t.f(mraidAdView, "mraidAdView");
        t.f(iabError, "iabError");
        h hVar = this.f25380a;
        String strD = iabError.d();
        t.e(strD, "iabError.message");
        hVar.d0(new b0(strD));
    }

    @Override // io.bidmachine.iab.mraid.i.d
    public void j(io.bidmachine.iab.mraid.i iVar, String url) {
        t.f(iVar, wHzciBnJlYkdX.IaYll);
        t.f(url, "url");
        i(iVar, url);
    }
}
