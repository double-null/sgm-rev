package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.p2;

/* JADX INFO: compiled from: TooltipCompatHandler.java */
/* JADX INFO: loaded from: classes.dex */
class l1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static l1 f1330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static l1 f1331k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f1333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f1335d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f1336e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m1 f1339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1340i;

    /* JADX INFO: compiled from: TooltipCompatHandler.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l1.this.g(false);
        }
    }

    /* JADX INFO: compiled from: TooltipCompatHandler.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l1.this.c();
        }
    }

    private l1(View view, CharSequence charSequence) {
        this.f1332a = view;
        this.f1333b = charSequence;
        this.f1334c = p2.g(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1332a.removeCallbacks(this.f1335d);
    }

    private void b() {
        this.f1337f = Integer.MAX_VALUE;
        this.f1338g = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1332a.postDelayed(this.f1335d, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(l1 l1Var) {
        l1 l1Var2 = f1330j;
        if (l1Var2 != null) {
            l1Var2.a();
        }
        f1330j = l1Var;
        if (l1Var != null) {
            l1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        l1 l1Var = f1330j;
        if (l1Var != null && l1Var.f1332a == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new l1(view, charSequence);
            return;
        }
        l1 l1Var2 = f1331k;
        if (l1Var2 != null && l1Var2.f1332a == view) {
            l1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f1337f) <= this.f1334c && Math.abs(y10 - this.f1338g) <= this.f1334c) {
            return false;
        }
        this.f1337f = x10;
        this.f1338g = y10;
        return true;
    }

    void c() {
        if (f1331k == this) {
            f1331k = null;
            m1 m1Var = this.f1339h;
            if (m1Var != null) {
                m1Var.c();
                this.f1339h = null;
                b();
                this.f1332a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1330j == this) {
            e(null);
        }
        this.f1332a.removeCallbacks(this.f1336e);
    }

    void g(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (androidx.core.view.z0.x(this.f1332a)) {
            e(null);
            l1 l1Var = f1331k;
            if (l1Var != null) {
                l1Var.c();
            }
            f1331k = this;
            this.f1340i = z10;
            m1 m1Var = new m1(this.f1332a.getContext());
            this.f1339h = m1Var;
            m1Var.e(this.f1332a, this.f1337f, this.f1338g, this.f1340i, this.f1333b);
            this.f1332a.addOnAttachStateChangeListener(this);
            if (this.f1340i) {
                j11 = 2500;
            } else {
                if ((androidx.core.view.z0.t(this.f1332a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1332a.removeCallbacks(this.f1336e);
            this.f1332a.postDelayed(this.f1336e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1339h != null && this.f1340i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1332a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1332a.isEnabled() && this.f1339h == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1337f = view.getWidth() / 2;
        this.f1338g = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
