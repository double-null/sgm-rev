package pa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import wb.i0;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f23719g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pb.d f23721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f23722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f0 f23723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewGroup f23724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23725f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public e(Object assetsHolder, Context context, la.g repository, pb.d adPhaseParams) {
        f0 f0VarA;
        kotlin.jvm.internal.t.f(assetsHolder, "assetsHolder");
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(repository, "repository");
        kotlin.jvm.internal.t.f(adPhaseParams, "adPhaseParams");
        this.f23720a = assetsHolder;
        this.f23721b = adPhaseParams;
        this.f23722c = new HashSet();
        pb.k kVarC = adPhaseParams.c();
        if (kVarC != null) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
            f0VarA = g0.a(kVarC, applicationContext, repository);
        } else {
            f0VarA = null;
        }
        this.f23723d = f0VarA;
        this.f23725f = -1;
    }

    private final void g() {
        f0 f0Var;
        ViewGroup viewGroup = this.f23724e;
        if (viewGroup == null || (f0Var = this.f23723d) == null) {
            return;
        }
        f0Var.l(this.f23720a, viewGroup, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, (12 & 16) != 0, (12 & 32) != 0 ? null : new f0.a(0L, null, 3, null));
    }

    public final void a() {
        f0 f0Var = this.f23723d;
        if (f0Var != null) {
            f0Var.b();
        }
        this.f23722c.clear();
        this.f23725f = -1;
        ViewGroup viewGroup = this.f23724e;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            i0.q(viewGroup);
        }
        this.f23724e = null;
    }

    public final void b(Context context, ViewGroup rootContainer, mb.g elementsContainer, List adElements, d adElement) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(rootContainer, "rootContainer");
        kotlin.jvm.internal.t.f(elementsContainer, "elementsContainer");
        kotlin.jvm.internal.t.f(adElements, "adElements");
        kotlin.jvm.internal.t.f(adElement, "adElement");
        View viewO = adElement.o();
        if (viewO == null) {
            return;
        }
        pb.a0 a0VarG = adElement.g().g();
        int iP = a0VarG.p(context);
        int iE = a0VarG.e(context);
        if (iP <= 0) {
            iP = -1;
        }
        if (iE <= 0) {
            iE = -1;
        }
        mb.g.a aVar = new mb.g.a(iP, iE);
        aVar.e(context, a0VarG, adElements);
        elementsContainer.addView(viewO, aVar);
        try {
            adElement.f(rootContainer);
            if (elementsContainer.getId() == this.f23725f) {
                this.f23722c.add(adElement);
            }
        } catch (Throwable th) {
            t.i(th);
        }
    }

    public final void c(qa.a adForm) {
        kotlin.jvm.internal.t.f(adForm, "adForm");
        this.f23722c.remove(adForm);
        if (this.f23722c.isEmpty()) {
            g();
        }
    }

    public final boolean d(ViewGroup rootContainer, ViewGroup container, List ads, List controls) {
        wc.g0 g0Var;
        kotlin.jvm.internal.t.f(rootContainer, "rootContainer");
        kotlin.jvm.internal.t.f(container, "container");
        kotlin.jvm.internal.t.f(ads, "ads");
        kotlin.jvm.internal.t.f(controls, "controls");
        Context context = container.getContext();
        a();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(wb.g0.e());
        f0 f0Var = this.f23723d;
        if (f0Var != null) {
            f0Var.l(this.f23720a, frameLayout, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, (12 & 16) != 0, (12 & 32) != 0 ? null : null);
            g0Var = wc.g0.f27756a;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            i0.t(frameLayout, this.f23721b.d());
        }
        this.f23724e = frameLayout;
        mb.g gVar = new mb.g(context);
        int iE = wb.g0.e();
        this.f23725f = iE;
        gVar.setId(iE);
        gVar.setTag("ads");
        Iterator it = ads.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            kotlin.jvm.internal.t.e(context, "context");
            b(context, rootContainer, gVar, ads, dVar);
        }
        ViewGroup viewGroup = this.f23724e;
        if (viewGroup != null) {
            viewGroup.addView(gVar, wb.g0.c());
        }
        mb.g gVar2 = new mb.g(context);
        gVar2.setTag("controls");
        Iterator it2 = controls.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            kotlin.jvm.internal.t.e(context, "context");
            b(context, rootContainer, gVar2, controls, dVar2);
        }
        ViewGroup viewGroup2 = this.f23724e;
        if (viewGroup2 != null) {
            viewGroup2.addView(gVar2, wb.g0.c());
        }
        container.addView(this.f23724e, 0, wb.g0.c());
        return true;
    }

    public final pb.d e() {
        return this.f23721b;
    }

    public final ViewGroup f() {
        return this.f23724e;
    }
}
