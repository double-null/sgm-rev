package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.h1;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.n1;
import androidx.appcompat.widget.o1;
import androidx.core.view.d3;
import androidx.core.view.p;
import androidx.core.view.x2;
import androidx.core.view.z0;
import androidx.core.view.z2;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes2.dex */
class f extends androidx.appcompat.app.e implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Map<Class<?>, Integer> f633a0 = new androidx.collection.a();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final boolean f634b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int[] f635c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final boolean f636d0;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private n[] G;
    private n H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    boolean M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private k R;
    private k S;
    boolean T;
    int U;
    private final Runnable V;
    private boolean W;
    private Rect X;
    private Rect Y;
    private AppCompatViewInflater Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Context f638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Window f639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final androidx.appcompat.app.d f641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    androidx.appcompat.app.a f642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    MenuInflater f643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private k0 f645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o f647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    k.b f648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ActionBarContextView f649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    PopupWindow f650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Runnable f651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    x2 f652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ViewGroup f655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f658y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f659z;

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.U & 1) != 0) {
                fVar.V(0);
            }
            f fVar2 = f.this;
            if ((fVar2.U & 4096) != 0) {
                fVar2.V(108);
            }
            f fVar3 = f.this;
            fVar3.T = false;
            fVar3.U = 0;
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    class b implements androidx.core.view.k0 {
        b() {
        }

        @Override // androidx.core.view.k0
        public d3 a(View view, d3 d3Var) {
            int iK = d3Var.k();
            int iK0 = f.this.K0(iK);
            if (iK != iK0) {
                d3Var = d3Var.l(d3Var.i(), iK0, d3Var.j(), d3Var.h());
            }
            return z0.B(view, d3Var);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    class d implements Runnable {

        /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
        class a extends z2 {
            a() {
            }

            @Override // androidx.core.view.y2
            public void b(View view) {
                f.this.f649p.setAlpha(1.0f);
                f.this.f652s.h(null);
                f.this.f652s = null;
            }

            @Override // androidx.core.view.z2, androidx.core.view.y2
            public void c(View view) {
                f.this.f649p.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f650q.showAtLocation(fVar.f649p, 55, 0, 0);
            f.this.W();
            if (!f.this.D0()) {
                f.this.f649p.setAlpha(1.0f);
                f.this.f649p.setVisibility(0);
            } else {
                f.this.f649p.setAlpha(0.0f);
                f fVar2 = f.this;
                fVar2.f652s = z0.b(fVar2.f649p).b(1.0f);
                f.this.f652s.h(new a());
            }
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    class e extends z2 {
        e() {
        }

        @Override // androidx.core.view.y2
        public void b(View view) {
            f.this.f649p.setAlpha(1.0f);
            f.this.f652s.h(null);
            f.this.f652s = null;
        }

        @Override // androidx.core.view.z2, androidx.core.view.y2
        public void c(View view) {
            f.this.f649p.setVisibility(0);
            f.this.f649p.sendAccessibilityEvent(32);
            if (f.this.f649p.getParent() instanceof View) {
                z0.G((View) f.this.f649p.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    private class C0015f implements androidx.appcompat.app.b {
        C0015f() {
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    private final class g implements androidx.appcompat.view.menu.j.a {
        g() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            f.this.N(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackF0 = f.this.f0();
            if (callbackF0 == null) {
                return true;
            }
            callbackF0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    class h implements k.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k.b.a f668a;

        /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
        class a extends z2 {
            a() {
            }

            @Override // androidx.core.view.y2
            public void b(View view) {
                f.this.f649p.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.f650q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f649p.getParent() instanceof View) {
                    z0.G((View) f.this.f649p.getParent());
                }
                f.this.f649p.removeAllViews();
                f.this.f652s.h(null);
                f.this.f652s = null;
            }
        }

        public h(k.b.a aVar) {
            this.f668a = aVar;
        }

        @Override // k.b.a
        public boolean a(k.b bVar, MenuItem menuItem) {
            return this.f668a.a(bVar, menuItem);
        }

        @Override // k.b.a
        public boolean b(k.b bVar, Menu menu) {
            return this.f668a.b(bVar, menu);
        }

        @Override // k.b.a
        public boolean c(k.b bVar, Menu menu) {
            return this.f668a.c(bVar, menu);
        }

        @Override // k.b.a
        public void d(k.b bVar) {
            this.f668a.d(bVar);
            f fVar = f.this;
            if (fVar.f650q != null) {
                fVar.f639f.getDecorView().removeCallbacks(f.this.f651r);
            }
            f fVar2 = f.this;
            if (fVar2.f649p != null) {
                fVar2.W();
                f fVar3 = f.this;
                fVar3.f652s = z0.b(fVar3.f649p).b(0.0f);
                f.this.f652s.h(new a());
            }
            f fVar4 = f.this;
            androidx.appcompat.app.d dVar = fVar4.f641h;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(fVar4.f648o);
            }
            f.this.f648o = null;
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    class i extends k.j {
        i(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            k.f.a aVar = new k.f.a(f.this.f638e, callback);
            k.b bVarG = f.this.G(aVar);
            if (bVarG != null) {
                return aVar.e(bVarG);
            }
            return null;
        }

        @Override // k.j, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // k.j, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // k.j, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // k.j, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            f.this.u0(i10);
            return true;
        }

        @Override // k.j, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            f.this.v0(i10);
        }

        @Override // k.j, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // k.j, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            n nVarD0 = f.this.d0(0, true);
            if (nVarD0 == null || (eVar = nVarD0.f689j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // k.j, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // k.j, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (f.this.m0() && i10 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i10);
        }

        @Override // k.j, android.view.Window.Callback
        public void onContentChanged() {
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    private class j extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f672c;

        j(Context context) {
            super();
            this.f672c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.f.k
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.k
        public int c() {
            return this.f672c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.k
        public void d() {
            f.this.H();
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    abstract class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f674a;

        /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                k.this.d();
            }
        }

        k() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f674a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f638e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f674a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f674a == null) {
                this.f674a = new a();
            }
            f.this.f638e.registerReceiver(this.f674a, intentFilterB);
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    private class l extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.k f677c;

        l(androidx.appcompat.app.k kVar) {
            super();
            this.f677c = kVar;
        }

        @Override // androidx.appcompat.app.f.k
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.k
        public int c() {
            return this.f677c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.k
        public void d() {
            f.this.H();
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    private class m extends ContentFrameLayout {
        public m(Context context) {
            super(context);
        }

        private boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.P(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(h.a.b(getContext(), i10));
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    protected static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f685f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f686g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f687h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f688i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f689j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f690k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f691l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f692m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f693n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f694o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f695p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f696q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f697r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f698s;

        n(int i10) {
            this.f680a = i10;
        }

        androidx.appcompat.view.menu.k a(androidx.appcompat.view.menu.j.a aVar) {
            if (this.f689j == null) {
                return null;
            }
            if (this.f690k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f691l, g.g.f15085j);
                this.f690k = cVar;
                cVar.d(aVar);
                this.f689j.b(this.f690k);
            }
            return this.f690k.j(this.f686g);
        }

        public boolean b() {
            if (this.f687h == null) {
                return false;
            }
            return this.f688i != null || this.f690k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f689j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f690k);
            }
            this.f689j = eVar;
            if (eVar == null || (cVar = this.f690k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(g.a.f14978a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(g.a.D, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(g.i.f15109b, true);
            }
            k.d dVar = new k.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f691l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(g.j.f15237z0);
            this.f681b = typedArrayObtainStyledAttributes.getResourceId(g.j.C0, 0);
            this.f685f = typedArrayObtainStyledAttributes.getResourceId(g.j.B0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    private final class o implements androidx.appcompat.view.menu.j.a {
        o() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z11 = eVarD != eVar;
            f fVar = f.this;
            if (z11) {
                eVar = eVarD;
            }
            n nVarZ = fVar.Z(eVar);
            if (nVarZ != null) {
                if (!z11) {
                    f.this.Q(nVarZ, z10);
                } else {
                    f.this.M(nVarZ.f680a, nVarZ, eVarD);
                    f.this.Q(nVarZ, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackF0;
            if (eVar != null) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.A || (callbackF0 = fVar.f0()) == null || f.this.M) {
                return true;
            }
            callbackF0.onMenuOpened(108, eVar);
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f634b0 = false;
        f635c0 = new int[]{R.attr.windowBackground};
        f636d0 = i10 <= 25;
    }

    f(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private boolean A0(n nVar, KeyEvent keyEvent) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        if (this.M) {
            return false;
        }
        if (nVar.f692m) {
            return true;
        }
        n nVar2 = this.H;
        if (nVar2 != null && nVar2 != nVar) {
            Q(nVar2, false);
        }
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null) {
            nVar.f688i = callbackF0.onCreatePanelView(nVar.f680a);
        }
        int i10 = nVar.f680a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (k0Var3 = this.f645l) != null) {
            k0Var3.f();
        }
        if (nVar.f688i == null && (!z10 || !(y0() instanceof androidx.appcompat.app.i))) {
            androidx.appcompat.view.menu.e eVar = nVar.f689j;
            if (eVar == null || nVar.f697r) {
                if (eVar == null && (!j0(nVar) || nVar.f689j == null)) {
                    return false;
                }
                if (z10 && this.f645l != null) {
                    if (this.f646m == null) {
                        this.f646m = new g();
                    }
                    this.f645l.d(nVar.f689j, this.f646m);
                }
                nVar.f689j.d0();
                if (!callbackF0.onCreatePanelMenu(nVar.f680a, nVar.f689j)) {
                    nVar.c(null);
                    if (z10 && (k0Var = this.f645l) != null) {
                        k0Var.d(null, this.f646m);
                    }
                    return false;
                }
                nVar.f697r = false;
            }
            nVar.f689j.d0();
            Bundle bundle = nVar.f698s;
            if (bundle != null) {
                nVar.f689j.P(bundle);
                nVar.f698s = null;
            }
            if (!callbackF0.onPreparePanel(0, nVar.f688i, nVar.f689j)) {
                if (z10 && (k0Var2 = this.f645l) != null) {
                    k0Var2.d(null, this.f646m);
                }
                nVar.f689j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            nVar.f695p = z11;
            nVar.f689j.setQwertyMode(z11);
            nVar.f689j.c0();
        }
        nVar.f692m = true;
        nVar.f693n = false;
        this.H = nVar;
        return true;
    }

    private void B0(androidx.appcompat.view.menu.e eVar, boolean z10) {
        k0 k0Var = this.f645l;
        if (k0Var == null || !k0Var.a() || (ViewConfiguration.get(this.f638e).hasPermanentMenuKey() && !this.f645l.g())) {
            n nVarD0 = d0(0, true);
            nVarD0.f696q = true;
            Q(nVarD0, false);
            x0(nVarD0, null);
            return;
        }
        Window.Callback callbackF0 = f0();
        if (this.f645l.e() && z10) {
            this.f645l.b();
            if (this.M) {
                return;
            }
            callbackF0.onPanelClosed(108, d0(0, true).f689j);
            return;
        }
        if (callbackF0 == null || this.M) {
            return;
        }
        if (this.T && (this.U & 1) != 0) {
            this.f639f.getDecorView().removeCallbacks(this.V);
            this.V.run();
        }
        n nVarD1 = d0(0, true);
        androidx.appcompat.view.menu.e eVar2 = nVarD1.f689j;
        if (eVar2 == null || nVarD1.f697r || !callbackF0.onPreparePanel(0, nVarD1.f688i, eVar2)) {
            return;
        }
        callbackF0.onMenuOpened(108, nVarD1.f689j);
        this.f645l.c();
    }

    private int C0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f639f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || z0.x((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void G0() {
        if (this.f654u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private AppCompatActivity H0() {
        for (Context baseContext = this.f638e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private boolean I(boolean z10) {
        if (this.M) {
            return false;
        }
        int iL = L();
        boolean zI0 = I0(n0(iL), z10);
        if (iL == 0) {
            c0().e();
        } else {
            k kVar = this.R;
            if (kVar != null) {
                kVar.a();
            }
        }
        if (iL == 3) {
            b0().e();
        } else {
            k kVar2 = this.S;
            if (kVar2 != null) {
                kVar2.a();
            }
        }
        return zI0;
    }

    private boolean I0(int i10, boolean z10) {
        int i11;
        int i12 = this.f638e.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z11 = true;
        if (i10 != 1) {
            i11 = i10 != 2 ? i12 : 32;
        } else {
            i11 = 16;
        }
        boolean zL0 = l0();
        boolean z12 = false;
        if ((f636d0 || i11 != i12) && !zL0 && !this.J && (this.f637d instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i11;
            try {
                ((ContextThemeWrapper) this.f637d).applyOverrideConfiguration(configuration);
                z12 = true;
            } catch (IllegalStateException e10) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e10);
            }
        }
        int i13 = this.f638e.getResources().getConfiguration().uiMode & 48;
        if (!z12 && i13 != i11 && z10 && !zL0 && this.J) {
            Object obj = this.f637d;
            if (obj instanceof Activity) {
                androidx.core.app.b.q((Activity) obj);
                z12 = true;
            }
        }
        if (z12 || i13 == i11) {
            z11 = z12;
        } else {
            J0(i11, zL0);
        }
        if (z11) {
            Object obj2 = this.f637d;
            if (obj2 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj2).onNightModeChanged(i10);
            }
        }
        return z11;
    }

    private void J() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f655v.findViewById(R.id.content);
        View decorView = this.f639f.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f638e.obtainStyledAttributes(g.j.f15237z0);
        typedArrayObtainStyledAttributes.getValue(g.j.L0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(g.j.M0, contentFrameLayout.getMinWidthMinor());
        int i10 = g.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = g.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = g.j.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = g.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J0(int i10, boolean z10) {
        Resources resources = this.f638e.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.h.a(resources);
        }
        int i11 = this.O;
        if (i11 != 0) {
            this.f638e.setTheme(i11);
            this.f638e.getTheme().applyStyle(this.O, true);
        }
        if (z10) {
            Object obj = this.f637d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.j) {
                    if (((androidx.lifecycle.j) activity).getLifecycle().b().c(androidx.lifecycle.f.b.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.L) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    private void K(Window window) {
        if (this.f639f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof i) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        i iVar = new i(callback);
        this.f640g = iVar;
        window.setCallback(iVar);
        h1 h1VarS = h1.s(this.f638e, null, f635c0);
        Drawable drawableG = h1VarS.g(0);
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        h1VarS.u();
        this.f639f = window;
    }

    private int L() {
        int i10 = this.N;
        return i10 != -100 ? i10 : androidx.appcompat.app.e.h();
    }

    private void O() {
        k kVar = this.R;
        if (kVar != null) {
            kVar.a();
        }
        k kVar2 = this.S;
        if (kVar2 != null) {
            kVar2.a();
        }
    }

    private ViewGroup R() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f638e.obtainStyledAttributes(g.j.f15237z0);
        int i10 = g.j.E0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g.j.N0, false)) {
            z(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            z(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g.j.F0, false)) {
            z(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(g.j.G0, false)) {
            z(10);
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(g.j.A0, false);
        typedArrayObtainStyledAttributes.recycle();
        Y();
        this.f639f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f638e);
        if (this.E) {
            viewGroup = this.C ? (ViewGroup) layoutInflaterFrom.inflate(g.g.f15090o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(g.g.f15089n, (ViewGroup) null);
            z0.R(viewGroup, new b());
        } else if (this.D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(g.g.f15081f, (ViewGroup) null);
            this.B = false;
            this.A = false;
        } else if (this.A) {
            TypedValue typedValue = new TypedValue();
            this.f638e.getTheme().resolveAttribute(g.a.f14983f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.d(this.f638e, typedValue.resourceId) : this.f638e).inflate(g.g.f15091p, (ViewGroup) null);
            k0 k0Var = (k0) viewGroup.findViewById(g.f.f15065p);
            this.f645l = k0Var;
            k0Var.setWindowCallback(f0());
            if (this.B) {
                this.f645l.h(109);
            }
            if (this.f658y) {
                this.f645l.h(2);
            }
            if (this.f659z) {
                this.f645l.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        if (this.f645l == null) {
            this.f656w = (TextView) viewGroup.findViewById(g.f.M);
        }
        o1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(g.f.f15051b);
        ViewGroup viewGroup2 = (ViewGroup) this.f639f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f639f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void X() {
        if (this.f654u) {
            return;
        }
        this.f655v = R();
        CharSequence charSequenceE0 = e0();
        if (!TextUtils.isEmpty(charSequenceE0)) {
            k0 k0Var = this.f645l;
            if (k0Var != null) {
                k0Var.setWindowTitle(charSequenceE0);
            } else if (y0() != null) {
                y0().s(charSequenceE0);
            } else {
                TextView textView = this.f656w;
                if (textView != null) {
                    textView.setText(charSequenceE0);
                }
            }
        }
        J();
        w0(this.f655v);
        this.f654u = true;
        n nVarD0 = d0(0, false);
        if (this.M) {
            return;
        }
        if (nVarD0 == null || nVarD0.f689j == null) {
            k0(108);
        }
    }

    private void Y() {
        if (this.f639f == null) {
            Object obj = this.f637d;
            if (obj instanceof Activity) {
                K(((Activity) obj).getWindow());
            }
        }
        if (this.f639f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private k b0() {
        if (this.S == null) {
            this.S = new j(this.f638e);
        }
        return this.S;
    }

    private void g0() {
        X();
        if (this.A && this.f642i == null) {
            Object obj = this.f637d;
            if (obj instanceof Activity) {
                this.f642i = new androidx.appcompat.app.l((Activity) this.f637d, this.B);
            } else if (obj instanceof Dialog) {
                this.f642i = new androidx.appcompat.app.l((Dialog) this.f637d);
            }
            androidx.appcompat.app.a aVar = this.f642i;
            if (aVar != null) {
                aVar.q(this.W);
            }
        }
    }

    private boolean h0(n nVar) {
        View view = nVar.f688i;
        if (view != null) {
            nVar.f687h = view;
            return true;
        }
        if (nVar.f689j == null) {
            return false;
        }
        if (this.f647n == null) {
            this.f647n = new o();
        }
        View view2 = (View) nVar.a(this.f647n);
        nVar.f687h = view2;
        return view2 != null;
    }

    private boolean i0(n nVar) {
        nVar.d(a0());
        nVar.f686g = new m(nVar.f691l);
        nVar.f682c = 81;
        return true;
    }

    private boolean j0(n nVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f638e;
        int i10 = nVar.f680a;
        if ((i10 == 0 || i10 == 108) && this.f645l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(g.a.f14983f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(g.a.f14984g, typedValue, true);
            } else {
                theme.resolveAttribute(g.a.f14984g, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                k.d dVar = new k.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        nVar.c(eVar);
        return true;
    }

    private void k0(int i10) {
        this.U = (1 << i10) | this.U;
        if (this.T) {
            return;
        }
        z0.E(this.f639f.getDecorView(), this.V);
        this.T = true;
    }

    private boolean l0() {
        if (!this.Q && (this.f637d instanceof Activity)) {
            PackageManager packageManager = this.f638e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f638e, this.f637d.getClass()), 0);
                this.P = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.P = false;
            }
        }
        this.Q = true;
        return this.P;
    }

    private boolean q0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        n nVarD0 = d0(i10, true);
        if (nVarD0.f694o) {
            return false;
        }
        return A0(nVarD0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean t0(int i10, KeyEvent keyEvent) {
        boolean zA0;
        k0 k0Var;
        if (this.f648o != null) {
            return false;
        }
        boolean zB = true;
        n nVarD0 = d0(i10, true);
        if (i10 != 0 || (k0Var = this.f645l) == null || !k0Var.a() || ViewConfiguration.get(this.f638e).hasPermanentMenuKey()) {
            boolean z10 = nVarD0.f694o;
            if (z10 || nVarD0.f693n) {
                Q(nVarD0, true);
                zB = z10;
            } else if (nVarD0.f692m) {
                if (nVarD0.f697r) {
                    nVarD0.f692m = false;
                    zA0 = A0(nVarD0, keyEvent);
                } else {
                    zA0 = true;
                }
                if (zA0) {
                    x0(nVarD0, keyEvent);
                } else {
                    zB = false;
                }
            } else {
                zB = false;
            }
        } else if (this.f645l.e()) {
            zB = this.f645l.b();
        } else if (this.M || !A0(nVarD0, keyEvent)) {
            zB = false;
        } else {
            zB = this.f645l.c();
        }
        if (zB) {
            AudioManager audioManager = (AudioManager) this.f638e.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zB;
    }

    private void x0(n nVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (nVar.f694o || this.M) {
            return;
        }
        if (nVar.f680a == 0) {
            if ((this.f638e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null && !callbackF0.onMenuOpened(nVar.f680a, nVar.f689j)) {
            Q(nVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f638e.getSystemService("window");
        if (windowManager != null && A0(nVar, keyEvent)) {
            ViewGroup viewGroup = nVar.f686g;
            if (viewGroup != null && !nVar.f696q) {
                View view = nVar.f688i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                nVar.f693n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, nVar.f683d, nVar.f684e, 1002, 8519680, -3);
                layoutParams2.gravity = nVar.f682c;
                layoutParams2.windowAnimations = nVar.f685f;
                windowManager.addView(nVar.f686g, layoutParams2);
                nVar.f694o = true;
            }
            if (viewGroup == null) {
                if (!i0(nVar) || nVar.f686g == null) {
                    return;
                }
            } else if (nVar.f696q && viewGroup.getChildCount() > 0) {
                nVar.f686g.removeAllViews();
            }
            if (!h0(nVar) || !nVar.b()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = nVar.f687h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            nVar.f686g.setBackgroundResource(nVar.f681b);
            ViewParent parent = nVar.f687h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(nVar.f687h);
            }
            nVar.f686g.addView(nVar.f687h, layoutParams3);
            if (!nVar.f687h.hasFocus()) {
                nVar.f687h.requestFocus();
            }
            i10 = -2;
            nVar.f693n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, nVar.f683d, nVar.f684e, 1002, 8519680, -3);
            layoutParams4.gravity = nVar.f682c;
            layoutParams4.windowAnimations = nVar.f685f;
            windowManager.addView(nVar.f686g, layoutParams4);
            nVar.f694o = true;
        }
    }

    private boolean z0(n nVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((nVar.f692m || A0(nVar, keyEvent)) && (eVar = nVar.f689j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f645l == null) {
            Q(nVar, true);
        }
        return zPerformShortcut;
    }

    @Override // androidx.appcompat.app.e
    public void A(int i10) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.f655v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f638e).inflate(i10, viewGroup);
        this.f640g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void B(View view) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.f655v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f640g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.f655v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f640g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void D(Toolbar toolbar) {
        if (this.f637d instanceof Activity) {
            androidx.appcompat.app.a aVarL = l();
            if (aVarL instanceof androidx.appcompat.app.l) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f643j = null;
            if (aVarL != null) {
                aVarL.m();
            }
            if (toolbar != null) {
                androidx.appcompat.app.i iVar = new androidx.appcompat.app.i(toolbar, e0(), this.f640g);
                this.f642i = iVar;
                this.f639f.setCallback(iVar.v());
            } else {
                this.f642i = null;
                this.f639f.setCallback(this.f640g);
            }
            n();
        }
    }

    final boolean D0() {
        ViewGroup viewGroup;
        return this.f654u && (viewGroup = this.f655v) != null && z0.y(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public void E(int i10) {
        this.O = i10;
    }

    @Override // androidx.appcompat.app.e
    public final void F(CharSequence charSequence) {
        this.f644k = charSequence;
        k0 k0Var = this.f645l;
        if (k0Var != null) {
            k0Var.setWindowTitle(charSequence);
            return;
        }
        if (y0() != null) {
            y0().s(charSequence);
            return;
        }
        TextView textView = this.f656w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    k.b F0(k.b.a aVar) {
        k.b bVarOnWindowStartingSupportActionMode;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        W();
        k.b bVar = this.f648o;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof h)) {
            aVar = new h(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f641h;
        if (dVar3 == null || this.M) {
            bVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                bVarOnWindowStartingSupportActionMode = dVar3.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
                bVarOnWindowStartingSupportActionMode = null;
            }
        }
        if (bVarOnWindowStartingSupportActionMode != null) {
            this.f648o = bVarOnWindowStartingSupportActionMode;
        } else {
            if (this.f649p == null) {
                if (this.D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f638e.getTheme();
                    theme.resolveAttribute(g.a.f14983f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f638e.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new k.d(this.f638e, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f638e;
                    }
                    this.f649p = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, g.a.f14986i);
                    this.f650q = popupWindow;
                    androidx.core.widget.i.b(popupWindow, 2);
                    this.f650q.setContentView(this.f649p);
                    this.f650q.setWidth(-1);
                    dVar.getTheme().resolveAttribute(g.a.f14979b, typedValue, true);
                    this.f649p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f650q.setHeight(-2);
                    this.f651r = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f655v.findViewById(g.f.f15057h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(a0()));
                        this.f649p = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f649p != null) {
                W();
                this.f649p.k();
                k.e eVar = new k.e(this.f649p.getContext(), this.f649p, aVar, this.f650q == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f649p.h(eVar);
                    this.f648o = eVar;
                    if (D0()) {
                        this.f649p.setAlpha(0.0f);
                        x2 x2VarB = z0.b(this.f649p).b(1.0f);
                        this.f652s = x2VarB;
                        x2VarB.h(new e());
                    } else {
                        this.f649p.setAlpha(1.0f);
                        this.f649p.setVisibility(0);
                        this.f649p.sendAccessibilityEvent(32);
                        if (this.f649p.getParent() instanceof View) {
                            z0.G((View) this.f649p.getParent());
                        }
                    }
                    if (this.f650q != null) {
                        this.f639f.getDecorView().post(this.f651r);
                    }
                } else {
                    this.f648o = null;
                }
            }
        }
        k.b bVar2 = this.f648o;
        if (bVar2 != null && (dVar2 = this.f641h) != null) {
            dVar2.onSupportActionModeStarted(bVar2);
        }
        return this.f648o;
    }

    @Override // androidx.appcompat.app.e
    public k.b G(k.b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        k.b bVar = this.f648o;
        if (bVar != null) {
            bVar.c();
        }
        h hVar = new h(aVar);
        androidx.appcompat.app.a aVarL = l();
        if (aVarL != null) {
            k.b bVarT = aVarL.t(hVar);
            this.f648o = bVarT;
            if (bVarT != null && (dVar = this.f641h) != null) {
                dVar.onSupportActionModeStarted(bVarT);
            }
        }
        if (this.f648o == null) {
            this.f648o = F0(hVar);
        }
        return this.f648o;
    }

    public boolean H() {
        return I(true);
    }

    int K0(int i10) {
        boolean z10;
        boolean z11;
        ActionBarContextView actionBarContextView = this.f649p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f649p.getLayoutParams();
            boolean z12 = true;
            if (this.f649p.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect = this.X;
                Rect rect2 = this.Y;
                rect.set(0, i10, 0, 0);
                o1.a(this.f655v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i10 : 0)) {
                    marginLayoutParams.topMargin = i10;
                    View view = this.f657x;
                    if (view == null) {
                        View view2 = new View(this.f638e);
                        this.f657x = view2;
                        view2.setBackgroundColor(this.f638e.getResources().getColor(g.c.f15005a));
                        this.f655v.addView(this.f657x, -1, new ViewGroup.LayoutParams(-1, i10));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i10) {
                            layoutParams.height = i10;
                            this.f657x.setLayoutParams(layoutParams);
                        }
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = this.f657x != null;
                if (!this.C && z12) {
                    i10 = 0;
                }
                boolean z13 = z12;
                z12 = z11;
                z10 = z13;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f649p.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f657x;
        if (view3 != null) {
            view3.setVisibility(z10 ? 0 : 8);
        }
        return i10;
    }

    void M(int i10, n nVar, Menu menu) {
        if (menu == null) {
            if (nVar == null && i10 >= 0) {
                n[] nVarArr = this.G;
                if (i10 < nVarArr.length) {
                    nVar = nVarArr[i10];
                }
            }
            if (nVar != null) {
                menu = nVar.f689j;
            }
        }
        if ((nVar == null || nVar.f694o) && !this.M) {
            this.f640g.a().onPanelClosed(i10, menu);
        }
    }

    void N(androidx.appcompat.view.menu.e eVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.f645l.l();
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null && !this.M) {
            callbackF0.onPanelClosed(108, eVar);
        }
        this.F = false;
    }

    void P(int i10) {
        Q(d0(i10, true), true);
    }

    void Q(n nVar, boolean z10) {
        ViewGroup viewGroup;
        k0 k0Var;
        if (z10 && nVar.f680a == 0 && (k0Var = this.f645l) != null && k0Var.e()) {
            N(nVar.f689j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f638e.getSystemService("window");
        if (windowManager != null && nVar.f694o && (viewGroup = nVar.f686g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                M(nVar.f680a, nVar, null);
            }
        }
        nVar.f692m = false;
        nVar.f693n = false;
        nVar.f694o = false;
        nVar.f687h = null;
        nVar.f696q = true;
        if (this.H == nVar) {
            this.H = null;
        }
    }

    void T() {
        androidx.appcompat.view.menu.e eVar;
        k0 k0Var = this.f645l;
        if (k0Var != null) {
            k0Var.l();
        }
        if (this.f650q != null) {
            this.f639f.getDecorView().removeCallbacks(this.f651r);
            if (this.f650q.isShowing()) {
                try {
                    this.f650q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f650q = null;
        }
        W();
        n nVarD0 = d0(0, false);
        if (nVarD0 == null || (eVar = nVarD0.f689j) == null) {
            return;
        }
        eVar.close();
    }

    boolean U(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f637d;
        if (((obj instanceof androidx.core.view.o.a) || (obj instanceof androidx.appcompat.app.g)) && (decorView = this.f639f.getDecorView()) != null && androidx.core.view.o.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f640g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    void V(int i10) {
        n nVarD0;
        n nVarD1 = d0(i10, true);
        if (nVarD1.f689j != null) {
            Bundle bundle = new Bundle();
            nVarD1.f689j.Q(bundle);
            if (bundle.size() > 0) {
                nVarD1.f698s = bundle;
            }
            nVarD1.f689j.d0();
            nVarD1.f689j.clear();
        }
        nVarD1.f697r = true;
        nVarD1.f696q = true;
        if ((i10 != 108 && i10 != 0) || this.f645l == null || (nVarD0 = d0(0, false)) == null) {
            return;
        }
        nVarD0.f692m = false;
        A0(nVarD0, null);
    }

    void W() {
        x2 x2Var = this.f652s;
        if (x2Var != null) {
            x2Var.c();
        }
    }

    n Z(Menu menu) {
        n[] nVarArr = this.G;
        int length = nVarArr != null ? nVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            n nVar = nVarArr[i10];
            if (nVar != null && nVar.f689j == menu) {
                return nVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        n nVarZ;
        Window.Callback callbackF0 = f0();
        if (callbackF0 == null || this.M || (nVarZ = Z(eVar.D())) == null) {
            return false;
        }
        return callbackF0.onMenuItemSelected(nVarZ.f680a, menuItem);
    }

    final Context a0() {
        androidx.appcompat.app.a aVarL = l();
        Context contextJ = aVarL != null ? aVarL.j() : null;
        return contextJ == null ? this.f638e : contextJ;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        B0(eVar, true);
    }

    @Override // androidx.appcompat.app.e
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        X();
        ((ViewGroup) this.f655v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f640g.a().onContentChanged();
    }

    final k c0() {
        if (this.R == null) {
            this.R = new l(androidx.appcompat.app.k.a(this.f638e));
        }
        return this.R;
    }

    @Override // androidx.appcompat.app.e
    public void d(Context context) {
        I(false);
        this.J = true;
    }

    protected n d0(int i10, boolean z10) {
        n[] nVarArr = this.G;
        if (nVarArr == null || nVarArr.length <= i10) {
            n[] nVarArr2 = new n[i10 + 1];
            if (nVarArr != null) {
                System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
            }
            this.G = nVarArr2;
            nVarArr = nVarArr2;
        }
        n nVar = nVarArr[i10];
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(i10);
        nVarArr[i10] = nVar2;
        return nVar2;
    }

    final CharSequence e0() {
        Object obj = this.f637d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f644k;
    }

    final Window.Callback f0() {
        return this.f639f.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T g(int i10) {
        X();
        return (T) this.f639f.findViewById(i10);
    }

    @Override // androidx.appcompat.app.e
    public final androidx.appcompat.app.b i() {
        return new C0015f();
    }

    @Override // androidx.appcompat.app.e
    public int j() {
        return this.N;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater k() {
        if (this.f643j == null) {
            g0();
            androidx.appcompat.app.a aVar = this.f642i;
            this.f643j = new k.g(aVar != null ? aVar.j() : this.f638e);
        }
        return this.f643j;
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.app.a l() {
        g0();
        return this.f642i;
    }

    @Override // androidx.appcompat.app.e
    public void m() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f638e);
        if (layoutInflaterFrom.getFactory() == null) {
            p.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean m0() {
        return this.f653t;
    }

    @Override // androidx.appcompat.app.e
    public void n() {
        androidx.appcompat.app.a aVarL = l();
        if (aVarL == null || !aVarL.k()) {
            k0(0);
        }
    }

    int n0(int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 == -1) {
            return i10;
        }
        if (i10 == 0) {
            if (((UiModeManager) this.f638e.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            }
            return c0().c();
        }
        if (i10 == 1 || i10 == 2) {
            return i10;
        }
        if (i10 == 3) {
            return b0().c();
        }
        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
    }

    boolean o0() {
        k.b bVar = this.f648o;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarL = l();
        return aVarL != null && aVarL.g();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return S(view, str, context, attributeSet);
    }

    boolean p0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.I = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void q(Configuration configuration) {
        androidx.appcompat.app.a aVarL;
        if (this.A && this.f654u && (aVarL = l()) != null) {
            aVarL.l(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f638e);
        I(false);
    }

    @Override // androidx.appcompat.app.e
    public void r(Bundle bundle) {
        String strC;
        this.J = true;
        I(false);
        Y();
        Object obj = this.f637d;
        if (obj instanceof Activity) {
            try {
                strC = androidx.core.app.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarY0 = y0();
                if (aVarY0 == null) {
                    this.W = true;
                } else {
                    aVarY0.q(true);
                }
            }
        }
        this.K = true;
    }

    boolean r0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarL = l();
        if (aVarL != null && aVarL.n(i10, keyEvent)) {
            return true;
        }
        n nVar = this.H;
        if (nVar != null && z0(nVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            n nVar2 = this.H;
            if (nVar2 != null) {
                nVar2.f693n = true;
            }
            return true;
        }
        if (this.H == null) {
            n nVarD0 = d0(0, true);
            A0(nVarD0, keyEvent);
            boolean zZ0 = z0(nVarD0, keyEvent.getKeyCode(), keyEvent, 1);
            nVarD0.f692m = false;
            if (zZ0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void s() {
        androidx.appcompat.app.e.p(this);
        if (this.T) {
            this.f639f.getDecorView().removeCallbacks(this.V);
        }
        this.L = false;
        this.M = true;
        androidx.appcompat.app.a aVar = this.f642i;
        if (aVar != null) {
            aVar.m();
        }
        O();
    }

    boolean s0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.I;
            this.I = false;
            n nVarD0 = d0(0, false);
            if (nVarD0 != null && nVarD0.f694o) {
                if (!z10) {
                    Q(nVarD0, true);
                }
                return true;
            }
            if (o0()) {
                return true;
            }
        } else if (i10 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void t(Bundle bundle) {
        X();
    }

    @Override // androidx.appcompat.app.e
    public void u() {
        androidx.appcompat.app.a aVarL = l();
        if (aVarL != null) {
            aVarL.r(true);
        }
    }

    void u0(int i10) {
        androidx.appcompat.app.a aVarL;
        if (i10 != 108 || (aVarL = l()) == null) {
            return;
        }
        aVarL.h(true);
    }

    @Override // androidx.appcompat.app.e
    public void v(Bundle bundle) {
        if (this.N != -100) {
            f633a0.put(this.f637d.getClass(), Integer.valueOf(this.N));
        }
    }

    void v0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarL = l();
            if (aVarL != null) {
                aVarL.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            n nVarD0 = d0(i10, true);
            if (nVarD0.f694o) {
                Q(nVarD0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void w() {
        this.L = true;
        H();
        androidx.appcompat.app.e.o(this);
    }

    void w0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.e
    public void x() {
        this.L = false;
        androidx.appcompat.app.e.p(this);
        androidx.appcompat.app.a aVarL = l();
        if (aVarL != null) {
            aVarL.r(false);
        }
        if (this.f637d instanceof Dialog) {
            O();
        }
    }

    final androidx.appcompat.app.a y0() {
        return this.f642i;
    }

    @Override // androidx.appcompat.app.e
    public boolean z(int i10) {
        int iC0 = C0(i10);
        if (this.E && iC0 == 108) {
            return false;
        }
        if (this.A && iC0 == 1) {
            this.A = false;
        }
        if (iC0 == 1) {
            G0();
            this.E = true;
            return true;
        }
        if (iC0 == 2) {
            G0();
            this.f658y = true;
            return true;
        }
        if (iC0 == 5) {
            G0();
            this.f659z = true;
            return true;
        }
        if (iC0 == 10) {
            G0();
            this.C = true;
            return true;
        }
        if (iC0 == 108) {
            G0();
            this.A = true;
            return true;
        }
        if (iC0 != 109) {
            return this.f639f.requestFeature(iC0);
        }
        G0();
        this.B = true;
        return true;
    }

    f(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View S(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zE0 = false;
        if (this.Z == null) {
            String string = this.f638e.obtainStyledAttributes(g.j.f15237z0).getString(g.j.D0);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.Z = new AppCompatViewInflater();
            } else {
                try {
                    this.Z = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i(yhXxbqGRMeI.hxZFDtEBRTUAAG, "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.Z = new AppCompatViewInflater();
                }
            }
        }
        boolean z10 = f634b0;
        if (z10) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zE0 = E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zE0 = true;
            }
        }
        return this.Z.q(view, str, context, attributeSet, zE0, z10, true, n1.b());
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private f(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        Map<Class<?>, Integer> map;
        Integer num;
        AppCompatActivity appCompatActivityH0;
        this.f652s = null;
        this.f653t = true;
        this.N = -100;
        this.V = new a();
        this.f638e = context;
        this.f641h = dVar;
        this.f637d = obj;
        if (this.N == -100 && (obj instanceof Dialog) && (appCompatActivityH0 = H0()) != null) {
            this.N = appCompatActivityH0.getDelegate().j();
        }
        if (this.N == -100 && (num = (map = f633a0).get(obj.getClass())) != null) {
            this.N = num.intValue();
            map.remove(obj.getClass());
        }
        if (window != null) {
            K(window);
        }
        androidx.appcompat.widget.j.h();
    }

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    /* JADX INFO: loaded from: classes.dex */
    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.T();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }
}
