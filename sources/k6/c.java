package k6;

import android.content.Context;
import pb.a1;

/* JADX INFO: compiled from: AdaptiveRenderingBannerAdListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements oa.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vb.f f21235a;

    public c(vb.f callback) {
        kotlin.jvm.internal.t.f(callback, "callback");
        this.f21235a = callback;
    }

    @Override // ma.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void e(oa.s adView) {
        kotlin.jvm.internal.t.f(adView, "adView");
    }

    @Override // ma.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void d(oa.s adView) {
        kotlin.jvm.internal.t.f(adView, "adView");
        this.f21235a.onAdClicked();
    }

    @Override // ma.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(oa.s adView) {
        kotlin.jvm.internal.t.f(adView, "adView");
    }

    @Override // ma.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void b(oa.s adView) {
        kotlin.jvm.internal.t.f(adView, "adView");
        this.f21235a.a();
    }

    @Override // ma.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(oa.s adView, pb.b0 error) {
        kotlin.jvm.internal.t.f(adView, "adView");
        kotlin.jvm.internal.t.f(error, "error");
        vb.f fVar = this.f21235a;
        oc.a NoFill = oc.a.f23345q;
        kotlin.jvm.internal.t.e(NoFill, "NoFill");
        fVar.c(a.a(error, NoFill));
    }

    @Override // ma.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void j(oa.s adView, pb.b0 error) {
        kotlin.jvm.internal.t.f(adView, "adView");
        kotlin.jvm.internal.t.f(error, "error");
        vb.f fVar = this.f21235a;
        oc.a InternalUnknownError = oc.a.f23346r;
        kotlin.jvm.internal.t.e(InternalUnknownError, "InternalUnknownError");
        fVar.b(a.a(error, InternalUnknownError));
    }

    @Override // ma.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void g(oa.s adView) {
        kotlin.jvm.internal.t.f(adView, "adView");
    }

    @Override // ma.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void f(oa.s adView) {
        kotlin.jvm.internal.t.f(adView, "adView");
        this.f21235a.onAdLoaded(adView);
    }

    @Override // ma.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(oa.s adView) {
        kotlin.jvm.internal.t.f(adView, "adView");
    }

    @Override // ma.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void l(oa.s adView, pb.t brokenCreativeEvent) {
        kotlin.jvm.internal.t.f(adView, "adView");
        kotlin.jvm.internal.t.f(brokenCreativeEvent, "brokenCreativeEvent");
        this.f21235a.onBrokenCreativeEvent(a.c(brokenCreativeEvent));
    }

    @Override // ma.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void h(oa.s adView, a1 privacySheetParams) {
        kotlin.jvm.internal.t.f(adView, "adView");
        kotlin.jvm.internal.t.f(privacySheetParams, "privacySheetParams");
        sb.a.C0415a c0415a = sb.a.f25384c;
        Context contextL = io.bidmachine.core.h.l(adView.getContext(), adView);
        kotlin.jvm.internal.t.e(contextL, "findDialogContext(adView.context, adView)");
        c0415a.a(contextL, privacySheetParams);
    }

    @Override // ma.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void i(oa.s adView, mc.a actionEvent, wb.h hVar) {
        kotlin.jvm.internal.t.f(adView, "adView");
        kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
        this.f21235a.f(actionEvent, hVar != null ? a.b(hVar) : null);
    }
}
