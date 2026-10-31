package sa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.vungle.ads.internal.Constants;
import io.bidmachine.iab.mraid.h0;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import pa.s;
import pb.b0;
import pb.b1;
import pb.c1;
import pb.k1;
import pb.m0;
import pb.r0;
import rd.f0;
import wb.d0;
import wc.g0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends qa.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f25375v = new b(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ob.e f25376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f25377t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.bidmachine.iab.mraid.i f25378u;

    private final class a implements la.g.a {
        public a() {
        }

        @Override // la.g.a
        public void a(b0 error) {
            t.f(error, "error");
            h.this.Y(error);
        }

        @Override // la.g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String result) {
            t.f(result, "result");
            h.this.f0(result);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Object assetsHolder, la.g repository, pb.a adElementParams, qa.c adFormListener, fb.b eventCallback, db.a aVar, ob.e eVar, List list) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(adElementParams, "adElementParams");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        this.f25376s = eVar;
        this.f25377t = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(h this$0) {
        t.f(this$0, "this$0");
        io.bidmachine.iab.mraid.i iVar = this$0.f25378u;
        if (iVar != null) {
            iVar.D();
        }
        this$0.f25378u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(h this$0, ViewGroup rootContainer) {
        t.f(this$0, "this$0");
        t.f(rootContainer, "$rootContainer");
        io.bidmachine.iab.mraid.i iVar = this$0.f25378u;
        ob.e eVar = this$0.f25376s;
        if (eVar == null || iVar == null) {
            return;
        }
        eVar.R(iVar.getWebView(), rootContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(h this$0) {
        t.f(this$0, "this$0");
        io.bidmachine.iab.mraid.i iVar = this$0.f25378u;
        if (iVar != null) {
            iVar.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(final String str) {
        String strD;
        if (str == null || str.length() == 0) {
            Y(new b0("Adm is null or empty"));
            return;
        }
        ob.e eVar = this.f25376s;
        if (eVar != null && (strD = eVar.d(str)) != null) {
            str = strD;
        }
        t.e(str, "htmlMeasurer?.prepareCre…iveForMeasure(adm) ?: adm");
        final h0 h0VarX = X();
        final String strW = W();
        qb.h.d(new Runnable() { // from class: sa.a
            @Override // java.lang.Runnable
            public final void run() {
                h.b0(this.f25364a, h0VarX, strW, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(h this$0) {
        t.f(this$0, "this$0");
        this$0.U();
    }

    private final void h0(String str) {
        r0 r0VarD = r0.f24202b.d(str);
        if (r0VarD != null) {
            I().c(r0VarD, H(), new a());
            return;
        }
        Y(new b0("Invalid adm url (" + str + ')'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(h this$0) {
        t.f(this$0, "this$0");
        io.bidmachine.iab.mraid.i iVar = this$0.f25378u;
        if (iVar != null) {
            iVar.U(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(h this$0) {
        t.f(this$0, "this$0");
        io.bidmachine.iab.mraid.i iVar = this$0.f25378u;
        if (iVar != null) {
            iVar.V();
            iVar.U(true);
            super.c();
        }
    }

    @Override // qa.a
    public View J() {
        return this.f25378u;
    }

    @Override // qa.a
    protected void L() {
        g0 g0Var;
        ob.e eVar = this.f25376s;
        if (eVar != null) {
            eVar.i(new s() { // from class: sa.c
                @Override // wb.v
                public final void p() {
                    h.g0(this.f25370a);
                }
            });
            g0Var = g0.f27756a;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            U();
        }
    }

    public final void U() {
        qb.h.d(new s() { // from class: sa.g
            @Override // wb.v
            public final void p() {
                h.Z(this.f25374a);
            }
        });
    }

    public final List V() {
        try {
            String strE = g().e("features");
            if (strE != null && strE.length() > 0) {
                List listR0 = kotlin.collections.b0.r0(f0.K0(strE, new String[]{","}, false, 0, 6, null));
                int size = listR0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = (String) listR0.get(i10);
                    int length = str.length() - 1;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = t.g(str.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    listR0.set(i10, str.subSequence(i11, length + 1).toString());
                }
                return listR0;
            }
        } catch (Exception unused) {
        }
        return kotlin.collections.t.k();
    }

    public final String W() {
        if (!g().f().containsKey("base_url")) {
            return "https://localhost";
        }
        String strE = g().e("base_url");
        if (d0.v(strE)) {
            return strE;
        }
        return null;
    }

    public final h0 X() {
        String strE = g().e("placement_type");
        if (t.a(strE, Constants.TEMPLATE_TYPE_FULLSCREEN)) {
            return h0.INTERSTITIAL;
        }
        if (t.a(strE, ViewHierarchyConstants.VIEW_KEY)) {
            return h0.INLINE;
        }
        return null;
    }

    public final void Y(b0 error) {
        t.f(error, "error");
        ob.e eVar = this.f25376s;
        if (eVar != null) {
            eVar.a(error);
        }
        E().c(this, error);
    }

    @Override // pa.d
    public void b() {
        b1 b1VarL = g().l();
        c1 c1VarA = b1VarL != null ? b1VarL.a() : null;
        if (c1VarA == null) {
            f0(g().n());
            return;
        }
        if (c1VarA instanceof m0) {
            f0(((m0) c1VarA).a());
            return;
        }
        if (c1VarA instanceof k1) {
            h0((String) kotlin.collections.b0.P(((k1) c1VarA).a()));
            return;
        }
        Y(new b0("Invalid resource type (" + c1VarA.getClass().getSimpleName() + "), it should be HtmlResourceSource or UrlResourceSource"));
    }

    @Override // qa.a, pa.d
    public void c() {
        qb.h.d(new s() { // from class: sa.e
            @Override // wb.v
            public final void p() {
                h.j0(this.f25372a);
            }
        });
    }

    @Override // qa.a, pa.d
    public void d() {
        super.d();
        qb.h.d(new s() { // from class: sa.d
            @Override // wb.v
            public final void p() {
                h.i0(this.f25371a);
            }
        });
    }

    public final void d0(b0 error) {
        t.f(error, "error");
        ob.e eVar = this.f25376s;
        if (eVar != null) {
            eVar.a(error);
        }
        E().a(this, error);
    }

    @Override // pa.d
    public void f(final ViewGroup rootContainer) {
        t.f(rootContainer, "rootContainer");
        qb.h.d(new s() { // from class: sa.b
            @Override // wb.v
            public final void p() {
                h.a0(this.f25368a, rootContainer);
            }
        });
    }

    @Override // pa.d
    public void m() {
        qb.h.d(new s() { // from class: sa.f
            @Override // wb.v
            public final void p() {
                h.e0(this.f25373a);
            }
        });
    }

    @Override // pa.d0
    public void w() {
        ob.e eVar = this.f25376s;
        if (eVar != null) {
            eVar.onClicked();
        }
        super.w();
    }

    @Override // qa.a
    public void x() {
        super.x();
        ob.e eVar = this.f25376s;
        if (eVar != null) {
            eVar.onShown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(h this$0, h0 h0Var, String str, String preparedSource) {
        t.f(this$0, "this$0");
        t.f(preparedSource, "$preparedSource");
        try {
            Context contextG = this$0.G();
            List listV = this$0.V();
            List list = this$0.f25377t;
            qa.c cVarE = this$0.E();
            fb.b bVarU = this$0.u();
            t.e(bVarU, yhXxbqGRMeI.QmQxJR);
            io.bidmachine.iab.mraid.i iVar = new io.bidmachine.iab.mraid.i(contextG, h0Var, str, null, listV, null, 1000L, list, new i(this$0, cVarE, bVarU, this$0.f25376s));
            iVar.T(preparedSource);
            ob.e eVar = this$0.f25376s;
            if (eVar != null) {
                eVar.T(iVar.getWebView());
            }
            this$0.f25378u = iVar;
        } catch (Throwable th) {
            pa.t.i(th);
            this$0.Y(b0.f23943b.a(th));
        }
    }

    @Override // qa.a, pa.d
    public void c(g7.e clickAreaFactory) {
        g0 g0Var;
        t.f(clickAreaFactory, "clickAreaFactory");
        io.bidmachine.iab.mraid.i iVar = this.f25378u;
        if (iVar != null) {
            iVar.M(clickAreaFactory);
            g0Var = g0.f27756a;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            super.c(clickAreaFactory);
        }
    }
}
