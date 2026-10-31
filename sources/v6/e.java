package v6;

import android.content.Context;
import io.bidmachine.iab.mraid.m0;
import io.bidmachine.iab.mraid.n0;
import kotlin.jvm.internal.t;
import pb.a1;
import wb.u;

/* JADX INFO: compiled from: MraidBannerAdListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vb.f f27171a;

    /* JADX INFO: compiled from: MraidBannerAdListener.kt */
    public static final class a implements u<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g7.i f27172a;

        a(g7.i iVar) {
            this.f27172a = iVar;
        }

        @Override // wb.u
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            c(bool.booleanValue());
        }

        public void c(boolean z10) {
            this.f27172a.c();
        }
    }

    /* JADX INFO: compiled from: MraidBannerAdListener.kt */
    public static final class b implements u<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g7.i f27173a;

        b(g7.i iVar) {
            this.f27173a = iVar;
        }

        @Override // wb.u
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            c(bool.booleanValue());
        }

        public void c(boolean z10) {
            this.f27173a.c();
        }
    }

    public e(vb.f callback) {
        t.f(callback, "callback");
        this.f27171a = callback;
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void a(m0 mraidView) {
        t.f(mraidView, "mraidView");
        this.f27171a.onAdLoaded(mraidView);
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void b(m0 mraidView) {
        t.f(mraidView, "mraidView");
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void c(m0 mraidView) {
        t.f(mraidView, "mraidView");
        this.f27171a.j();
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void d(m0 mraidView, c7.b iabError) {
        t.f(mraidView, "mraidView");
        t.f(iabError, "iabError");
        this.f27171a.b(oc.g.a(iabError));
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void e(m0 mraidView, String url) {
        t.f(mraidView, "mraidView");
        t.f(url, "url");
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void f(m0 mraidView, String url, g7.i iabClickCallback) {
        t.f(mraidView, "mraidView");
        t.f(url, "url");
        t.f(iabClickCallback, "iabClickCallback");
        this.f27171a.onAdClicked();
        Context context = mraidView.getContext();
        t.e(context, "mraidView.context");
        qb.j.b(context, url, new a(iabClickCallback));
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void g(m0 mraidView, c7.b iabError) {
        t.f(mraidView, "mraidView");
        t.f(iabError, "iabError");
        this.f27171a.c(oc.g.a(iabError));
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void h(m0 mraidView, c7.b iabError) {
        t.f(mraidView, "mraidView");
        t.f(iabError, "iabError");
        this.f27171a.a();
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void i(m0 mraidView) {
        t.f(mraidView, "mraidView");
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void j(m0 mraidView, String url, g7.i iabClickCallback) {
        t.f(mraidView, "mraidView");
        t.f(url, "url");
        t.f(iabClickCallback, "iabClickCallback");
        this.f27171a.onAdClicked();
        Context context = mraidView.getContext();
        t.e(context, "mraidView.context");
        qb.j.e(context, url, new b(iabClickCallback));
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void k(m0 mraidView, String url, g7.i iabClickCallback) {
        t.f(mraidView, "mraidView");
        t.f(url, "url");
        t.f(iabClickCallback, "iabClickCallback");
        Context context = mraidView.getContext();
        t.e(context, "mraidView.context");
        qb.j.c(context, url, new oc.c(this.f27171a, iabClickCallback));
    }

    @Override // io.bidmachine.iab.mraid.n0
    public void l(m0 mraidView, a1 privacySheetParams) {
        t.f(mraidView, "mraidView");
        t.f(privacySheetParams, "privacySheetParams");
        sb.a.C0415a c0415a = sb.a.f25384c;
        Context contextL = io.bidmachine.core.h.l(mraidView.v0(), mraidView);
        t.e(contextL, "findDialogContext(\n     …  mraidView\n            )");
        c0415a.a(contextL, privacySheetParams);
    }
}
