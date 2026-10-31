package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap<View, x2> f1998a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f1999b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f2000c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f2001d = {r.e.f24805b, r.e.f24806c, r.e.f24817n, r.e.f24828y, r.e.B, r.e.C, r.e.D, r.e.E, r.e.F, r.e.G, r.e.f24807d, r.e.f24808e, r.e.f24809f, r.e.f24810g, r.e.f24811h, r.e.f24812i, r.e.f24813j, r.e.f24814k, r.e.f24815l, r.e.f24816m, r.e.f24818o, r.e.f24819p, r.e.f24820q, r.e.f24821r, r.e.f24822s, r.e.f24823t, r.e.f24824u, r.e.f24825v, r.e.f24826w, r.e.f24827x, r.e.f24829z, r.e.A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l0 f2002e = new l0() { // from class: androidx.core.view.y0
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f2003f = new e();

    /* JADX INFO: compiled from: ViewCompat.java */
    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean b(View view) {
            return Boolean.valueOf(k.d(view));
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence b(View view) {
            return k.b(view);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence b(View view) {
            return m.b(view);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.z0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean b(View view) {
            return Boolean.valueOf(k.c(view));
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<T> f2006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f2008d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= this.f2007c;
        }

        abstract T b(View view);

        T c(View view) {
            if (a()) {
                return b(view);
            }
            T t10 = (T) view.getTag(this.f2005a);
            if (this.f2006b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f2005a = i10;
            this.f2006b = cls;
            this.f2008d = i11;
            this.f2007c = i12;
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    private static class h {

        /* JADX INFO: compiled from: ViewCompat.java */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            d3 f2009a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f2010b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k0 f2011c;

            a(View view, k0 k0Var) {
                this.f2010b = view;
                this.f2011c = k0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                d3 d3VarS = d3.s(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f2010b);
                    if (d3VarS.equals(this.f2009a)) {
                        return this.f2011c.a(view, d3VarS).q();
                    }
                }
                this.f2009a = d3VarS;
                d3 d3VarA = this.f2011c.a(view, d3VarS);
                if (i10 >= 30) {
                    return d3VarA.q();
                }
                z0.G(view);
                return d3VarA.q();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(r.e.Q);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static d3 b(View view, d3 d3Var, Rect rect) {
            WindowInsets windowInsetsQ = d3Var.q();
            if (windowInsetsQ != null) {
                return d3.s(view.computeSystemWindowInsets(windowInsetsQ, rect), view);
            }
            rect.setEmpty();
            return d3Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static d3 j(View view) {
            return d3.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, k0 k0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(r.e.L, k0Var);
            }
            if (k0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(r.e.Q));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, k0Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    private static class i {
        public static d3 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            d3 d3VarR = d3.r(rootWindowInsets);
            d3VarR.o(d3VarR);
            d3VarR.d(view.getRootView());
            return d3VarR;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    static class j {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    static class k {
        static void a(View view, final n nVar) {
            int i10 = r.e.P;
            androidx.collection.h hVar = (androidx.collection.h) view.getTag(i10);
            if (hVar == null) {
                hVar = new androidx.collection.h();
                view.setTag(i10, hVar);
            }
            Objects.requireNonNull(nVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.z1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return nVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            hVar.put(nVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, n nVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.h hVar = (androidx.collection.h) view.getTag(r.e.P);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.get(nVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, y.a aVar) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    private static class l {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void e(View view, z.a aVar) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    private static class m {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        static void d(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    public interface n {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    static class o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f2012d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2013a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f2014b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f2015c = null;

        o() {
        }

        static o a(View view) {
            int i10 = r.e.O;
            o oVar = (o) view.getTag(i10);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o();
            view.setTag(i10, oVar2);
            return oVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2013a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f2014b == null) {
                this.f2014b = new SparseArray<>();
            }
            return this.f2014b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(r.e.P);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((n) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2013a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2012d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2013a == null) {
                    this.f2013a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f2012d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2013a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2013a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f2015c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2015c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static void A(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = h(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(h(view));
                    P(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(h(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static d3 B(View view, d3 d3Var) {
        WindowInsets windowInsetsQ = d3Var.q();
        if (windowInsetsQ != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsQ);
            if (!windowInsetsB.equals(windowInsetsQ)) {
                return d3.s(windowInsetsB, view);
            }
        }
        return d3Var;
    }

    private static f<CharSequence> C() {
        return new b(r.e.K, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void D(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void E(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Deprecated
    public static void F(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static void G(View view) {
        g.c(view);
    }

    public static void H(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static f<Boolean> I() {
        return new a(r.e.M, Boolean.class, 28);
    }

    public static void J(View view, androidx.core.view.a aVar) {
        if (aVar == null && (f(view) instanceof androidx.core.view.a.C0036a)) {
            aVar = new androidx.core.view.a();
        }
        P(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    @Deprecated
    public static void K(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void L(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static void M(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static void N(View view, float f10) {
        h.s(view, f10);
    }

    @Deprecated
    public static void O(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    private static void P(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void Q(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.m(view, i10);
        }
    }

    public static void R(View view, k0 k0Var) {
        h.u(view, k0Var);
    }

    public static void S(View view, int i10, int i11) {
        i.d(view, i10, i11);
    }

    public static void T(View view, String str) {
        h.v(view, str);
    }

    private static f<CharSequence> U() {
        return new c(r.e.N, CharSequence.class, 64, 30);
    }

    public static void V(View view) {
        h.z(view);
    }

    private static f<Boolean> a() {
        return new d(r.e.J, Boolean.class, 28);
    }

    @Deprecated
    public static x2 b(View view) {
        if (f1998a == null) {
            f1998a = new WeakHashMap<>();
        }
        x2 x2Var = f1998a.get(view);
        if (x2Var != null) {
            return x2Var;
        }
        x2 x2Var2 = new x2(view);
        f1998a.put(view, x2Var2);
        return x2Var2;
    }

    static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).b(view, keyEvent);
    }

    static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).f(keyEvent);
    }

    public static androidx.core.view.a e(View view) {
        View.AccessibilityDelegate accessibilityDelegateF = f(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof androidx.core.view.a.C0036a ? ((androidx.core.view.a.C0036a) accessibilityDelegateF).f1897a : new androidx.core.view.a(accessibilityDelegateF);
    }

    private static View.AccessibilityDelegate f(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : g(view);
    }

    private static View.AccessibilityDelegate g(View view) {
        if (f2000c) {
            return null;
        }
        if (f1999b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1999b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2000c = true;
                return null;
            }
        }
        try {
            Object obj = f1999b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2000c = true;
            return null;
        }
    }

    public static CharSequence h(View view) {
        return C().c(view);
    }

    public static ColorStateList i(View view) {
        return h.g(view);
    }

    public static PorterDuff.Mode j(View view) {
        return h.h(view);
    }

    @Deprecated
    public static Display k(View view) {
        return view.getDisplay();
    }

    @Deprecated
    public static int l(View view) {
        return view.getImportantForAccessibility();
    }

    public static int m(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.c(view);
        }
        return 0;
    }

    @Deprecated
    public static int n(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static int o(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int p(View view) {
        return view.getMinimumWidth();
    }

    public static d3 q(View view) {
        return i.a(view);
    }

    public static CharSequence r(View view) {
        return U().c(view);
    }

    public static String s(View view) {
        return h.k(view);
    }

    @Deprecated
    public static int t(View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static boolean u(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean v(View view) {
        return view.hasTransientState();
    }

    public static boolean w(View view) {
        Boolean boolC = a().c(view);
        return boolC != null && boolC.booleanValue();
    }

    @Deprecated
    public static boolean x(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean y(View view) {
        return view.isLaidOut();
    }

    public static boolean z(View view) {
        Boolean boolC = I().c(view);
        return boolC != null && boolC.booleanValue();
    }

    /* JADX INFO: compiled from: ViewCompat.java */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f2004a = new WeakHashMap<>();

        e() {
        }

        private void a(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                z0.A(key, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f2004a.entrySet().iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
