package k6;

import android.content.Context;
import k9.dW.xjwcmjDeOXR;
import pb.a1;

/* JADX INFO: compiled from: AdaptiveRenderingFullscreenAdListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements na.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vb.i f21239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21240b;

    public e(Context context, vb.i callback) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(callback, "callback");
        this.f21239a = callback;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
        this.f21240b = applicationContext;
    }

    @Override // ma.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void e(na.n fullScreenAd) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
    }

    @Override // ma.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void d(na.n fullScreenAd) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        this.f21239a.onAdClicked();
    }

    @Override // ma.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(na.n fullScreenAd) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
    }

    @Override // ma.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void b(na.n fullScreenAd) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        this.f21239a.a();
    }

    @Override // ma.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(na.n fullScreenAd, pb.b0 error) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        kotlin.jvm.internal.t.f(error, "error");
        vb.i iVar = this.f21239a;
        oc.a NoFill = oc.a.f23345q;
        kotlin.jvm.internal.t.e(NoFill, "NoFill");
        iVar.c(a.a(error, NoFill));
    }

    @Override // ma.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void g(na.n fullScreenAd) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        if (fullScreenAd.V()) {
            this.f21239a.d();
        }
        this.f21239a.onAdClosed();
    }

    @Override // ma.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void f(na.n fullScreenAd) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        this.f21239a.onAdLoaded();
    }

    @Override // ma.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(na.n fullScreenAd) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
    }

    @Override // ma.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void l(na.n fullScreenAd, pb.t brokenCreativeEvent) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        kotlin.jvm.internal.t.f(brokenCreativeEvent, "brokenCreativeEvent");
        this.f21239a.onBrokenCreativeEvent(a.c(brokenCreativeEvent));
    }

    @Override // ma.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void h(na.n fullScreenAd, a1 privacySheetParams) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        kotlin.jvm.internal.t.f(privacySheetParams, "privacySheetParams");
        sb.a.C0415a c0415a = sb.a.f25384c;
        Context contextK = io.bidmachine.core.h.k(this.f21240b);
        kotlin.jvm.internal.t.e(contextK, "findDialogContext(applicationContext)");
        c0415a.a(contextK, privacySheetParams);
    }

    @Override // ma.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void i(na.n fullScreenAd, mc.a actionEvent, wb.h hVar) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
        this.f21239a.f(actionEvent, hVar != null ? a.b(hVar) : null);
    }

    @Override // ma.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void j(na.n fullScreenAd, pb.b0 b0Var) {
        kotlin.jvm.internal.t.f(fullScreenAd, "fullScreenAd");
        kotlin.jvm.internal.t.f(b0Var, xjwcmjDeOXR.ymcfCTJNhOkcj);
        vb.i iVar = this.f21239a;
        oc.a InternalUnknownError = oc.a.f23346r;
        kotlin.jvm.internal.t.e(InternalUnknownError, "InternalUnknownError");
        iVar.b(a.a(b0Var, InternalUnknownError));
    }
}
