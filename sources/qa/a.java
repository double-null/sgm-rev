package qa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.o;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import la.g;
import pa.d;
import pa.d0;
import pa.f;
import pa.f0;
import pa.g0;
import pb.j;
import pb.w0;
import pb.x0;
import qb.m;
import wb.i0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends d0 implements d, View.OnClickListener, m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0400a f24683q = new C0400a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final pb.b[] f24684r = {pb.b.Image, pb.b.Label};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f24685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f24686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pb.a f24687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f24688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final db.a f24689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f24690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f24691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f0 f24692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f24693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewGroup f24694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f24695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f24696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f24697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f24698p;

    /* JADX INFO: renamed from: qa.a$a, reason: collision with other inner class name */
    public static final class C0400a {
        public /* synthetic */ C0400a(k kVar) {
            this();
        }

        private C0400a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, g repository, pb.a adElementParams, c adFormListener, fb.b eventCallback, db.a aVar) {
        super(eventCallback);
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(adElementParams, "adElementParams");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        this.f24685c = assetsHolder;
        this.f24686d = repository;
        this.f24687e = adElementParams;
        this.f24688f = adFormListener;
        this.f24689g = aVar;
        Context applicationContext = context.getApplicationContext();
        t.e(applicationContext, "context.applicationContext");
        this.f24690h = applicationContext;
        j jVarC = adElementParams.c();
        this.f24691i = jVarC;
        pb.k kVarA = jVarC.a();
        this.f24692j = kVarA != null ? g0.a(kVarA, applicationContext, repository) : null;
        this.f24693k = new AtomicBoolean(false);
        this.f24696n = true;
        this.f24698p = this.f24696n;
    }

    public final void A(View view) {
        t.f(view, "view");
        f0 f0Var = this.f24692j;
        if (f0Var != null) {
            f0Var.l(this.f24685c, view, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, (12 & 16) != 0, (12 & 32) != 0 ? null : new f0.a(0L, null, 3, null));
        }
        db.a aVar = this.f24689g;
        if (aVar != null) {
            aVar.a(view);
        }
        this.f24688f.d(this);
    }

    protected void B(View view, f0 f0Var) {
        t.f(view, "view");
        if (f0Var != null) {
            f0Var.l(this.f24685c, view, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, (12 & 16) != 0, (12 & 32) != 0 ? null : null);
            return;
        }
        Integer numB = this.f24691i.b();
        if (numB == null || o.v(f24684r, this.f24687e.a())) {
            return;
        }
        i0.t(view, numB);
    }

    protected final void C(String message) {
        t.f(message, "message");
        pa.t.b(v(), message, new Object[0]);
    }

    public final void D() {
        View viewJ = J();
        if (viewJ == null) {
            return;
        }
        if (this.f24698p && this.f24695m) {
            if (this.f24693k.compareAndSet(false, true)) {
                A(viewJ);
            }
        } else if (this.f24693k.compareAndSet(true, false)) {
            y();
        }
    }

    protected final c E() {
        return this.f24688f;
    }

    public final j F() {
        return this.f24691i;
    }

    public final Context G() {
        return this.f24690h;
    }

    public final Object H() {
        return this.f24685c;
    }

    protected final g I() {
        return this.f24686d;
    }

    public abstract View J();

    public void K() {
        fb.b bVarU = u();
        View viewJ = J();
        bVarU.a(viewJ != null ? viewJ.getId() : -1);
    }

    public void M() {
        this.f24695m = false;
        D();
    }

    @Override // pa.d
    public void c() {
        x();
    }

    @Override // pa.d
    public void d() {
        M();
    }

    @Override // pa.d0, pa.d
    public void destroy() {
        super.destroy();
        f0 f0Var = this.f24692j;
        if (f0Var != null) {
            f0Var.b();
        }
        db.a aVar = this.f24689g;
        if (aVar != null) {
            aVar.g();
        }
        L();
    }

    @Override // pa.d
    public final pb.a g() {
        return this.f24687e;
    }

    @Override // pa.d
    public boolean h() {
        return this.f24698p;
    }

    @Override // pa.d
    public View o() {
        ViewGroup viewGroup = this.f24694l;
        return viewGroup != null ? viewGroup : J();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        K();
    }

    @Override // qb.m
    public void r() {
        this.f24697o = false;
        t(this.f24696n);
    }

    @Override // qb.m
    public void s(boolean z10) {
        t(z10);
        this.f24697o = true;
    }

    @Override // qb.m
    public void t(boolean z10) {
        this.f24696n = z10;
        if (this.f24697o) {
            return;
        }
        if (z10) {
            i0.w(o());
        } else {
            i0.n(o());
        }
        this.f24698p = z10;
        D();
    }

    public String toString() {
        return "type - " + this.f24687e.a() + ", name - " + this.f24687e.j();
    }

    @Override // pa.d0
    public String v() {
        return this.f24687e.j();
    }

    public void x() {
        this.f24695m = true;
        D();
    }

    public final void y() {
        db.a aVar = this.f24689g;
        if (aVar != null) {
            aVar.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        View viewJ = J();
        if (viewJ == 0) {
            return false;
        }
        w0 w0VarM = this.f24691i.m();
        if (w0VarM != null && !w0VarM.e()) {
            FrameLayout frameLayout = new FrameLayout(this.f24690h);
            frameLayout.setId(wb.g0.e());
            x0.a(frameLayout, w0VarM);
            frameLayout.addView(viewJ, new FrameLayout.LayoutParams(-1, -1));
            this.f24694l = frameLayout;
        }
        View viewO = o();
        if (viewO == null) {
            return false;
        }
        viewO.setId(wb.g0.e());
        viewO.setTag(this.f24687e.j());
        Boolean boolF = this.f24691i.f();
        if (boolF != null && boolF.booleanValue()) {
            viewO.setOnClickListener(this);
        }
        Boolean boolT = this.f24691i.t();
        if (boolT != null) {
            t(boolT.booleanValue());
        }
        if (viewJ instanceof f) {
            ((f) viewJ).b(this.f24691i);
            return true;
        }
        B(viewJ, this.f24692j);
        return true;
    }

    @Override // pa.d
    public void c(e clickAreaFactory) {
        t.f(clickAreaFactory, "clickAreaFactory");
        K();
    }

    protected void L() {
    }
}
