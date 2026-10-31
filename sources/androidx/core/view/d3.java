package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: WindowInsetsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class d3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d3 f1901b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f1902a;

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f1903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f1904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f1905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f1906d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f1903a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f1904b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f1905c = declaredField3;
                declaredField3.setAccessible(true);
                f1906d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static d3 a(View view) {
            if (f1906d && view.isAttachedToWindow()) {
                try {
                    Object obj = f1903a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f1904b.get(obj);
                        Rect rect2 = (Rect) f1905c.get(obj);
                        if (rect != null && rect2 != null) {
                            d3 d3VarA = new b().b(androidx.core.graphics.g.c(rect)).c(androidx.core.graphics.g.c(rect2)).a();
                            d3VarA.o(d3VarA);
                            d3VarA.d(view.getRootView());
                            return d3VarA;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class e extends d {
        e() {
        }

        e(d3 d3Var) {
            super(d3Var);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d3 f1915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.core.graphics.g[] f1916b;

        f() {
            this(new d3((d3) null));
        }

        protected final void a() {
            androidx.core.graphics.g[] gVarArr = this.f1916b;
            if (gVarArr != null) {
                androidx.core.graphics.g gVarF = gVarArr[m.b(1)];
                androidx.core.graphics.g gVarF2 = this.f1916b[m.b(2)];
                if (gVarF2 == null) {
                    gVarF2 = this.f1915a.f(2);
                }
                if (gVarF == null) {
                    gVarF = this.f1915a.f(1);
                }
                f(androidx.core.graphics.g.a(gVarF, gVarF2));
                androidx.core.graphics.g gVar = this.f1916b[m.b(16)];
                if (gVar != null) {
                    e(gVar);
                }
                androidx.core.graphics.g gVar2 = this.f1916b[m.b(32)];
                if (gVar2 != null) {
                    c(gVar2);
                }
                androidx.core.graphics.g gVar3 = this.f1916b[m.b(64)];
                if (gVar3 != null) {
                    g(gVar3);
                }
            }
        }

        d3 b() {
            throw null;
        }

        void d(androidx.core.graphics.g gVar) {
            throw null;
        }

        void f(androidx.core.graphics.g gVar) {
            throw null;
        }

        f(d3 d3Var) {
            this.f1915a = d3Var;
        }

        void c(androidx.core.graphics.g gVar) {
        }

        void e(androidx.core.graphics.g gVar) {
        }

        void g(androidx.core.graphics.g gVar) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class i extends h {
        i(d3 d3Var, WindowInsets windowInsets) {
            super(d3Var, windowInsets);
        }

        @Override // androidx.core.view.d3.l
        d3 a() {
            return d3.r(this.f1922c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.d3.g, androidx.core.view.d3.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f1922c, iVar.f1922c) && Objects.equals(this.f1926g, iVar.f1926g);
        }

        @Override // androidx.core.view.d3.l
        androidx.core.view.m f() {
            return androidx.core.view.m.e(this.f1922c.getDisplayCutout());
        }

        @Override // androidx.core.view.d3.l
        public int hashCode() {
            return this.f1922c.hashCode();
        }

        i(d3 d3Var, i iVar) {
            super(d3Var, iVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final d3 f1931q = d3.r(WindowInsets.CONSUMED);

        k(d3 d3Var, WindowInsets windowInsets) {
            super(d3Var, windowInsets);
        }

        @Override // androidx.core.view.d3.g, androidx.core.view.d3.l
        public androidx.core.graphics.g g(int i10) {
            return androidx.core.graphics.g.d(this.f1922c.getInsets(n.a(i10)));
        }

        k(d3 d3Var, k kVar) {
            super(d3Var, kVar);
        }

        @Override // androidx.core.view.d3.g, androidx.core.view.d3.l
        final void d(View view) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class m {
        public static int a() {
            return 128;
        }

        static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(KBBdKxoAiHo.SAh + i10);
        }

        public static int c() {
            return 7;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static final class n {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1901b = k.f1931q;
        } else {
            f1901b = l.f1932b;
        }
    }

    private d3(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f1902a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f1902a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f1902a = new i(this, windowInsets);
        } else {
            this.f1902a = new h(this, windowInsets);
        }
    }

    public static d3 r(WindowInsets windowInsets) {
        return s(windowInsets, null);
    }

    public static d3 s(WindowInsets windowInsets, View view) {
        d3 d3Var = new d3((WindowInsets) w.h.c(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            d3Var.o(z0.q(view));
            d3Var.d(view.getRootView());
        }
        return d3Var;
    }

    @Deprecated
    public d3 a() {
        return this.f1902a.a();
    }

    @Deprecated
    public d3 b() {
        return this.f1902a.b();
    }

    @Deprecated
    public d3 c() {
        return this.f1902a.c();
    }

    void d(View view) {
        this.f1902a.d(view);
    }

    public androidx.core.view.m e() {
        return this.f1902a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d3) {
            return w.d.a(this.f1902a, ((d3) obj).f1902a);
        }
        return false;
    }

    public androidx.core.graphics.g f(int i10) {
        return this.f1902a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.g g() {
        return this.f1902a.i();
    }

    @Deprecated
    public int h() {
        return this.f1902a.k().f1854d;
    }

    public int hashCode() {
        l lVar = this.f1902a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f1902a.k().f1851a;
    }

    @Deprecated
    public int j() {
        return this.f1902a.k().f1853c;
    }

    @Deprecated
    public int k() {
        return this.f1902a.k().f1852b;
    }

    @Deprecated
    public d3 l(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.g.b(i10, i11, i12, i13)).a();
    }

    void m(androidx.core.graphics.g[] gVarArr) {
        this.f1902a.o(gVarArr);
    }

    void n(androidx.core.graphics.g gVar) {
        this.f1902a.p(gVar);
    }

    void o(d3 d3Var) {
        this.f1902a.q(d3Var);
    }

    void p(androidx.core.graphics.g gVar) {
        this.f1902a.r(gVar);
    }

    public WindowInsets q() {
        l lVar = this.f1902a;
        if (lVar instanceof g) {
            return ((g) lVar).f1922c;
        }
        return null;
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f1908e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f1909f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f1910g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f1911h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f1912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.g f1913d;

        c() {
            this.f1912c = h();
        }

        private static WindowInsets h() {
            if (!f1909f) {
                try {
                    f1908e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f1909f = true;
            }
            Field field = f1908e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f1911h) {
                try {
                    f1910g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f1911h = true;
            }
            Constructor<WindowInsets> constructor = f1910g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.d3.f
        d3 b() {
            a();
            d3 d3VarR = d3.r(this.f1912c);
            d3VarR.m(this.f1916b);
            d3VarR.p(this.f1913d);
            return d3VarR;
        }

        @Override // androidx.core.view.d3.f
        void d(androidx.core.graphics.g gVar) {
            this.f1913d = gVar;
        }

        @Override // androidx.core.view.d3.f
        void f(androidx.core.graphics.g gVar) {
            WindowInsets windowInsets = this.f1912c;
            if (windowInsets != null) {
                this.f1912c = windowInsets.replaceSystemWindowInsets(gVar.f1851a, gVar.f1852b, gVar.f1853c, gVar.f1854d);
            }
        }

        c(d3 d3Var) {
            super(d3Var);
            this.f1912c = d3Var.q();
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f1914c;

        d() {
            this.f1914c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.d3.f
        d3 b() {
            a();
            d3 d3VarR = d3.r(this.f1914c.build());
            d3VarR.m(this.f1916b);
            return d3VarR;
        }

        @Override // androidx.core.view.d3.f
        void c(androidx.core.graphics.g gVar) {
            this.f1914c.setMandatorySystemGestureInsets(gVar.e());
        }

        @Override // androidx.core.view.d3.f
        void d(androidx.core.graphics.g gVar) {
            this.f1914c.setStableInsets(gVar.e());
        }

        @Override // androidx.core.view.d3.f
        void e(androidx.core.graphics.g gVar) {
            this.f1914c.setSystemGestureInsets(gVar.e());
        }

        @Override // androidx.core.view.d3.f
        void f(androidx.core.graphics.g gVar) {
            this.f1914c.setSystemWindowInsets(gVar.e());
        }

        @Override // androidx.core.view.d3.f
        void g(androidx.core.graphics.g gVar) {
            this.f1914c.setTappableElementInsets(gVar.e());
        }

        d(d3 d3Var) {
            WindowInsets.Builder builder;
            super(d3Var);
            WindowInsets windowInsetsQ = d3Var.q();
            if (windowInsetsQ != null) {
                builder = new WindowInsets.Builder(windowInsetsQ);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f1914c = builder;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.g f1927m;

        h(d3 d3Var, WindowInsets windowInsets) {
            super(d3Var, windowInsets);
            this.f1927m = null;
        }

        @Override // androidx.core.view.d3.l
        d3 b() {
            return d3.r(this.f1922c.consumeStableInsets());
        }

        @Override // androidx.core.view.d3.l
        d3 c() {
            return d3.r(this.f1922c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.d3.l
        final androidx.core.graphics.g i() {
            if (this.f1927m == null) {
                this.f1927m = androidx.core.graphics.g.b(this.f1922c.getStableInsetLeft(), this.f1922c.getStableInsetTop(), this.f1922c.getStableInsetRight(), this.f1922c.getStableInsetBottom());
            }
            return this.f1927m;
        }

        @Override // androidx.core.view.d3.l
        boolean m() {
            return this.f1922c.isConsumed();
        }

        @Override // androidx.core.view.d3.l
        public void r(androidx.core.graphics.g gVar) {
            this.f1927m = gVar;
        }

        h(d3 d3Var, h hVar) {
            super(d3Var, hVar);
            this.f1927m = null;
            this.f1927m = hVar.f1927m;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f1917h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f1918i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class<?> f1919j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f1920k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f1921l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f1922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.g[] f1923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.g f1924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d3 f1925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.graphics.g f1926g;

        g(d3 d3Var, WindowInsets windowInsets) {
            super(d3Var);
            this.f1924e = null;
            this.f1922c = windowInsets;
        }

        private androidx.core.graphics.g s(int i10, boolean z10) {
            androidx.core.graphics.g gVarA = androidx.core.graphics.g.f1850e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    gVarA = androidx.core.graphics.g.a(gVarA, t(i11, z10));
                }
            }
            return gVarA;
        }

        private androidx.core.graphics.g u() {
            d3 d3Var = this.f1925f;
            return d3Var != null ? d3Var.g() : androidx.core.graphics.g.f1850e;
        }

        private androidx.core.graphics.g v(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f1917h) {
                w();
            }
            Method method = f1918i;
            if (method != null && f1919j != null && f1920k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1920k.get(f1921l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.g.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        private static void w() {
            try {
                f1918i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1919j = cls;
                f1920k = cls.getDeclaredField("mVisibleInsets");
                f1921l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1920k.setAccessible(true);
                f1921l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f1917h = true;
        }

        @Override // androidx.core.view.d3.l
        void d(View view) {
            androidx.core.graphics.g gVarV = v(view);
            if (gVarV == null) {
                gVarV = androidx.core.graphics.g.f1850e;
            }
            p(gVarV);
        }

        @Override // androidx.core.view.d3.l
        void e(d3 d3Var) {
            d3Var.o(this.f1925f);
            d3Var.n(this.f1926g);
        }

        @Override // androidx.core.view.d3.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f1926g, ((g) obj).f1926g);
            }
            return false;
        }

        @Override // androidx.core.view.d3.l
        public androidx.core.graphics.g g(int i10) {
            return s(i10, false);
        }

        @Override // androidx.core.view.d3.l
        final androidx.core.graphics.g k() {
            if (this.f1924e == null) {
                this.f1924e = androidx.core.graphics.g.b(this.f1922c.getSystemWindowInsetLeft(), this.f1922c.getSystemWindowInsetTop(), this.f1922c.getSystemWindowInsetRight(), this.f1922c.getSystemWindowInsetBottom());
            }
            return this.f1924e;
        }

        @Override // androidx.core.view.d3.l
        boolean n() {
            return this.f1922c.isRound();
        }

        @Override // androidx.core.view.d3.l
        public void o(androidx.core.graphics.g[] gVarArr) {
            this.f1923d = gVarArr;
        }

        @Override // androidx.core.view.d3.l
        void p(androidx.core.graphics.g gVar) {
            this.f1926g = gVar;
        }

        @Override // androidx.core.view.d3.l
        void q(d3 d3Var) {
            this.f1925f = d3Var;
        }

        protected androidx.core.graphics.g t(int i10, boolean z10) {
            androidx.core.graphics.g gVarG;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.g.b(0, Math.max(u().f1852b, k().f1852b), 0, 0) : androidx.core.graphics.g.b(0, k().f1852b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.g gVarU = u();
                    androidx.core.graphics.g gVarI = i();
                    return androidx.core.graphics.g.b(Math.max(gVarU.f1851a, gVarI.f1851a), 0, Math.max(gVarU.f1853c, gVarI.f1853c), Math.max(gVarU.f1854d, gVarI.f1854d));
                }
                androidx.core.graphics.g gVarK = k();
                d3 d3Var = this.f1925f;
                gVarG = d3Var != null ? d3Var.g() : null;
                int iMin = gVarK.f1854d;
                if (gVarG != null) {
                    iMin = Math.min(iMin, gVarG.f1854d);
                }
                return androidx.core.graphics.g.b(gVarK.f1851a, 0, gVarK.f1853c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.g.f1850e;
                }
                d3 d3Var2 = this.f1925f;
                androidx.core.view.m mVarE = d3Var2 != null ? d3Var2.e() : f();
                return mVarE != null ? androidx.core.graphics.g.b(mVarE.b(), mVarE.d(), mVarE.c(), mVarE.a()) : androidx.core.graphics.g.f1850e;
            }
            androidx.core.graphics.g[] gVarArr = this.f1923d;
            gVarG = gVarArr != null ? gVarArr[m.b(8)] : null;
            if (gVarG != null) {
                return gVarG;
            }
            androidx.core.graphics.g gVarK2 = k();
            androidx.core.graphics.g gVarU2 = u();
            int i12 = gVarK2.f1854d;
            if (i12 > gVarU2.f1854d) {
                return androidx.core.graphics.g.b(0, 0, 0, i12);
            }
            androidx.core.graphics.g gVar = this.f1926g;
            return (gVar == null || gVar.equals(androidx.core.graphics.g.f1850e) || (i11 = this.f1926g.f1854d) <= gVarU2.f1854d) ? androidx.core.graphics.g.f1850e : androidx.core.graphics.g.b(0, 0, 0, i11);
        }

        g(d3 d3Var, g gVar) {
            this(d3Var, new WindowInsets(gVar.f1922c));
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.g f1928n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.g f1929o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.g f1930p;

        j(d3 d3Var, WindowInsets windowInsets) {
            super(d3Var, windowInsets);
            this.f1928n = null;
            this.f1929o = null;
            this.f1930p = null;
        }

        @Override // androidx.core.view.d3.l
        androidx.core.graphics.g h() {
            if (this.f1929o == null) {
                this.f1929o = androidx.core.graphics.g.d(this.f1922c.getMandatorySystemGestureInsets());
            }
            return this.f1929o;
        }

        @Override // androidx.core.view.d3.l
        androidx.core.graphics.g j() {
            if (this.f1928n == null) {
                this.f1928n = androidx.core.graphics.g.d(this.f1922c.getSystemGestureInsets());
            }
            return this.f1928n;
        }

        @Override // androidx.core.view.d3.l
        androidx.core.graphics.g l() {
            if (this.f1930p == null) {
                this.f1930p = androidx.core.graphics.g.d(this.f1922c.getTappableElementInsets());
            }
            return this.f1930p;
        }

        j(d3 d3Var, j jVar) {
            super(d3Var, jVar);
            this.f1928n = null;
            this.f1929o = null;
            this.f1930p = null;
        }

        @Override // androidx.core.view.d3.h, androidx.core.view.d3.l
        public void r(androidx.core.graphics.g gVar) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f1907a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f1907a = new e();
            } else if (i10 >= 29) {
                this.f1907a = new d();
            } else {
                this.f1907a = new c();
            }
        }

        public d3 a() {
            return this.f1907a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.g gVar) {
            this.f1907a.d(gVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.g gVar) {
            this.f1907a.f(gVar);
            return this;
        }

        public b(d3 d3Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f1907a = new e(d3Var);
            } else if (i10 >= 29) {
                this.f1907a = new d(d3Var);
            } else {
                this.f1907a = new c(d3Var);
            }
        }
    }

    public d3(d3 d3Var) {
        if (d3Var != null) {
            l lVar = d3Var.f1902a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f1902a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f1902a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f1902a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f1902a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f1902a = new g(this, (g) lVar);
            } else {
                this.f1902a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f1902a = new l(this);
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    private static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d3 f1932b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d3 f1933a;

        l(d3 d3Var) {
            this.f1933a = d3Var;
        }

        d3 a() {
            return this.f1933a;
        }

        d3 b() {
            return this.f1933a;
        }

        d3 c() {
            return this.f1933a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return n() == lVar.n() && m() == lVar.m() && w.d.a(k(), lVar.k()) && w.d.a(i(), lVar.i()) && w.d.a(f(), lVar.f());
        }

        androidx.core.view.m f() {
            return null;
        }

        androidx.core.graphics.g g(int i10) {
            return androidx.core.graphics.g.f1850e;
        }

        androidx.core.graphics.g h() {
            return k();
        }

        public int hashCode() {
            return w.d.b(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), f());
        }

        androidx.core.graphics.g i() {
            return androidx.core.graphics.g.f1850e;
        }

        androidx.core.graphics.g j() {
            return k();
        }

        androidx.core.graphics.g k() {
            return androidx.core.graphics.g.f1850e;
        }

        androidx.core.graphics.g l() {
            return k();
        }

        boolean m() {
            return false;
        }

        boolean n() {
            return false;
        }

        void d(View view) {
        }

        void e(d3 d3Var) {
        }

        public void o(androidx.core.graphics.g[] gVarArr) {
        }

        void p(androidx.core.graphics.g gVar) {
        }

        void q(d3 d3Var) {
        }

        public void r(androidx.core.graphics.g gVar) {
        }
    }
}
