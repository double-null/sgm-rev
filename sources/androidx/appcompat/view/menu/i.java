package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.core.view.n;
import androidx.core.view.z0;

/* JADX INFO: compiled from: MenuPopupHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f937l;

    /* JADX INFO: compiled from: MenuPopupHelper.java */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f926a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f926a.getResources().getDimensionPixelSize(g.d.f15014c) ? new b(this.f926a, this.f931f, this.f929d, this.f930e, this.f928c) : new l(this.f926a, this.f927b, this.f931f, this.f929d, this.f930e, this.f928c);
        bVar.j(this.f927b);
        bVar.t(this.f937l);
        bVar.o(this.f931f);
        bVar.d(this.f934i);
        bVar.q(this.f933h);
        bVar.r(this.f932g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h hVarC = c();
        hVarC.u(z11);
        if (z10) {
            if ((n.a(this.f932g, z0.n(this.f931f)) & 7) == 5) {
                i10 -= this.f931f.getWidth();
            }
            hVarC.s(i10);
            hVarC.v(i11);
            int i12 = (int) ((this.f926a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.show();
    }

    public void b() {
        if (d()) {
            this.f935j.dismiss();
        }
    }

    public h c() {
        if (this.f935j == null) {
            this.f935j = a();
        }
        return this.f935j;
    }

    public boolean d() {
        h hVar = this.f935j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f935j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f936k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f931f = view;
    }

    public void g(boolean z10) {
        this.f933h = z10;
        h hVar = this.f935j;
        if (hVar != null) {
            hVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f932g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f936k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f934i = aVar;
        h hVar = this.f935j;
        if (hVar != null) {
            hVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f931f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f931f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f932g = 8388611;
        this.f937l = new a();
        this.f926a = context;
        this.f927b = eVar;
        this.f931f = view;
        this.f928c = z10;
        this.f929d = i10;
        this.f930e = i11;
    }
}
