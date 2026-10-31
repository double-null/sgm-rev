package ua;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import fb.b;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import la.g;
import pa.f0;
import pa.m;
import pb.g0;
import pb.j;
import pb.o;
import qa.c;
import wb.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends qa.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0442a f26689t = new C0442a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TextView f26690s;

    /* JADX INFO: renamed from: ua.a$a, reason: collision with other inner class name */
    public static final class C0442a {
        public /* synthetic */ C0442a(k kVar) {
            this();
        }

        private C0442a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, g repository, pb.a adElementParams, c adFormListener, b eventCallback, db.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(adElementParams, "adElementParams");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        this.f26690s = new TextView(context);
    }

    @Override // qa.a
    protected void B(View view, f0 f0Var) {
        t.f(view, "view");
        int iH = j.h(F(), G(), 0, 2, null);
        o oVarE = F().e(G());
        if (f0Var != null) {
            f0Var.l(H(), this.f26690s, (12 & 4) != 0 ? null : Integer.valueOf(iH), (12 & 8) != 0 ? null : oVarE, (12 & 16) != 0, (12 & 32) != 0 ? null : null);
            return;
        }
        TextView textView = this.f26690s;
        m mVar = new m();
        mVar.j(j.d(F(), 0, 1, null));
        mVar.e(iH);
        if (oVarE != null) {
            m.i(mVar, oVarE.b(), oVarE.a(), 0.0f, 0.0f, 12, null);
            this.f26690s.setPadding(oVarE.b(), oVarE.b() - e0.k(G(), 2.0f), oVarE.b(), oVarE.b() + e0.k(G(), 2.0f));
        }
        textView.setBackground(mVar);
    }

    @Override // qa.a
    public View J() {
        return this.f26690s;
    }

    @Override // pa.d
    public void b() {
        this.f26690s.setText(g().o());
        Integer numO = F().o();
        if (numO != null) {
            this.f26690s.setTextColor(numO.intValue());
        }
        Float fJ = F().j();
        if (fJ != null && fJ.floatValue() > 0.0f) {
            this.f26690s.setTextSize(1, fJ.floatValue());
        }
        g0 g0VarK = F().k();
        if (g0VarK != null) {
            this.f26690s.setTypeface(Typeface.create(Typeface.DEFAULT, g0VarK.c()));
        }
        Integer numS = F().s();
        if (numS != null && numS.intValue() > 0) {
            this.f26690s.setMaxLines(numS.intValue());
        }
        Integer numR = F().r(G());
        if (numR != null) {
            this.f26690s.setLineSpacing(numR.intValue(), 1.0f);
        }
        this.f26690s.setGravity(F().q().c() | 16);
        Integer numN = F().n();
        if (numN != null) {
            int iIntValue = numN.intValue();
            float fK = e0.k(G(), 1.0f);
            this.f26690s.setShadowLayer(e0.k(G(), 1.0f), fK, fK, iIntValue);
        }
        this.f26690s.setIncludeFontPadding(false);
        E().e(this);
    }
}
