package x;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f27901d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f27902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27903b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27904c = -1;

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f27905d = new a(1, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f27906e = new a(2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f27907f = new a(4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f27908g = new a(8, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f27909h = new a(16, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f27910i = new a(32, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f27911j = new a(64, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f27912k = new a(128, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f27913l = new a(UserVerificationMethods.USER_VERIFY_HANDPRINT, null, x.b.class);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f27914m = new a(512, null, x.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f27915n = new a(1024, null, x.c.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f27916o = new a(2048, null, x.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f27917p = new a(4096, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f27918q = new a(8192, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f27919r = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f27920s = new a(32768, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f27921t = new a(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f27922u = new a(131072, null, x.g.class);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f27923v = new a(262144, null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f27924w = new a(524288, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f27925x = new a(1048576, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f27926y = new a(2097152, null, x.h.class);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f27927z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f27928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends x.a> f27930c;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f27927z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, x.e.class);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            F = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, x.f.class);
            L = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, x.d.class);
            M = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            O = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            Q = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            T = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            U = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f27928a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f27928a).getLabel();
        }

        public boolean c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f27928a;
            if (obj2 == null) {
                return aVar.f27928a == null;
            }
            return obj2.equals(aVar.f27928a);
        }

        public int hashCode() {
            Object obj = this.f27928a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strH = p.h(this.f27929b);
            if (strH.equals("ACTION_UNKNOWN") && b() != null) {
                strH = b().toString();
            }
            sb2.append(strH);
            return sb2.toString();
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends x.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, x xVar, Class<? extends x.a> cls) {
            this.f27929b = i10;
            if (obj == null) {
                this.f27928a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f27928a = obj;
            }
            this.f27930c = cls;
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    private static class b {
        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    private static class c {
        public static f a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static p b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return p.g0(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static p f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return p.g0(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j10));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f27931a;

        e(Object obj) {
            this.f27931a = obj;
        }

        public static e a(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f27932a;

        f(Object obj) {
            this.f27932a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    @Deprecated
    public p(Object obj) {
        this.f27902a = (AccessibilityNodeInfo) obj;
    }

    private boolean B() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int C(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f27901d;
        f27901d = i11 + 1;
        return i11;
    }

    private void U(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayV = v(view);
        if (sparseArrayV != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayV.size(); i10++) {
                if (sparseArrayV.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayV.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void V(int i10, boolean z10) {
        Bundle bundleR = r();
        if (bundleR != null) {
            int i11 = bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleR.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private void c(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void e() {
        this.f27902a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f27902a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f27902a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f27902a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> f(String str) {
        ArrayList<Integer> integerArrayList = this.f27902a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f27902a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static p f0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new p(accessibilityNodeInfo);
    }

    static p g0(Object obj) {
        if (obj != null) {
            return new p(obj);
        }
        return null;
    }

    static String h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean i(int i10) {
        Bundle bundleR = r();
        return bundleR != null && (bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] n(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> t(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayV = v(view);
        if (sparseArrayV != null) {
            return sparseArrayV;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(r.e.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> v(View view) {
        return (SparseArray) view.getTag(r.e.I);
    }

    public String A() {
        return this.f27902a.getViewIdResourceName();
    }

    public boolean D() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f27902a) : i(64);
    }

    public boolean E() {
        return this.f27902a.isCheckable();
    }

    public boolean F() {
        return this.f27902a.isChecked();
    }

    public boolean G() {
        return this.f27902a.isClickable();
    }

    public boolean H() {
        return this.f27902a.isContextClickable();
    }

    public boolean I() {
        return this.f27902a.isEnabled();
    }

    public boolean J() {
        return this.f27902a.isFocusable();
    }

    public boolean K() {
        return this.f27902a.isFocused();
    }

    public boolean L() {
        return i(67108864);
    }

    public boolean M() {
        return this.f27902a.isImportantForAccessibility();
    }

    public boolean N() {
        return this.f27902a.isLongClickable();
    }

    public boolean O() {
        return this.f27902a.isPassword();
    }

    public boolean P() {
        return this.f27902a.isScrollable();
    }

    public boolean Q() {
        return this.f27902a.isSelected();
    }

    public boolean R() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f27902a) : i(8388608);
    }

    public boolean S() {
        return this.f27902a.isVisibleToUser();
    }

    public boolean T(int i10, Bundle bundle) {
        return this.f27902a.performAction(i10, bundle);
    }

    public void W(CharSequence charSequence) {
        this.f27902a.setClassName(charSequence);
    }

    public void X(Object obj) {
        this.f27902a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f27931a);
    }

    public void Y(Object obj) {
        this.f27902a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f27932a);
    }

    public void Z(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27902a.setHeading(z10);
        } else {
            V(2, z10);
        }
    }

    public void a(int i10) {
        this.f27902a.addAction(i10);
    }

    public void a0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27902a.setPaneTitle(charSequence);
        } else {
            this.f27902a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void b(a aVar) {
        this.f27902a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f27928a);
    }

    public void b0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27902a.setScreenReaderFocusable(z10);
        } else {
            V(1, z10);
        }
    }

    public void c0(boolean z10) {
        this.f27902a.setScrollable(z10);
    }

    public void d(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            e();
            U(view);
            ClickableSpan[] clickableSpanArrN = n(charSequence);
            if (clickableSpanArrN == null || clickableSpanArrN.length <= 0) {
                return;
            }
            r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", r.e.f24804a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayT = t(view);
            for (int i10 = 0; i10 < clickableSpanArrN.length; i10++) {
                int iC = C(clickableSpanArrN[i10], sparseArrayT);
                sparseArrayT.put(iC, new WeakReference<>(clickableSpanArrN[i10]));
                c(clickableSpanArrN[i10], (Spanned) charSequence, iC);
            }
        }
    }

    public void d0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f27902a, charSequence);
        } else {
            this.f27902a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo e0() {
        return this.f27902a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27902a;
        if (accessibilityNodeInfo == null) {
            if (pVar.f27902a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(pVar.f27902a)) {
            return false;
        }
        return this.f27904c == pVar.f27904c && this.f27903b == pVar.f27903b;
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f27902a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27902a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public void j(Rect rect) {
        this.f27902a.getBoundsInParent(rect);
    }

    public void k(Rect rect) {
        this.f27902a.getBoundsInScreen(rect);
    }

    public void l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f27902a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f27902a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public CharSequence m() {
        return this.f27902a.getClassName();
    }

    public CharSequence o() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f27902a) : this.f27902a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public CharSequence p() {
        return this.f27902a.getContentDescription();
    }

    public CharSequence q() {
        return this.f27902a.getError();
    }

    public Bundle r() {
        return this.f27902a.getExtras();
    }

    public int s() {
        return this.f27902a.getMaxTextLength();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb2.append("; boundsInParent: " + rect);
        k(rect);
        sb2.append("; boundsInScreen: " + rect);
        l(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(u());
        sb2.append("; className: ");
        sb2.append(m());
        sb2.append("; text: ");
        sb2.append(x());
        sb2.append("; error: ");
        sb2.append(q());
        sb2.append("; maxTextLength: ");
        sb2.append(s());
        sb2.append("; stateDescription: ");
        sb2.append(w());
        sb2.append("; contentDescription: ");
        sb2.append(p());
        sb2.append("; tooltipText: ");
        sb2.append(y());
        sb2.append("; viewIdResName: ");
        sb2.append(A());
        sb2.append("; uniqueId: ");
        sb2.append(z());
        sb2.append("; checkable: ");
        sb2.append(E());
        sb2.append("; checked: ");
        sb2.append(F());
        sb2.append("; focusable: ");
        sb2.append(J());
        sb2.append("; focused: ");
        sb2.append(K());
        sb2.append("; selected: ");
        sb2.append(Q());
        sb2.append("; clickable: ");
        sb2.append(G());
        sb2.append("; longClickable: ");
        sb2.append(N());
        sb2.append("; contextClickable: ");
        sb2.append(H());
        sb2.append("; enabled: ");
        sb2.append(I());
        sb2.append("; password: ");
        sb2.append(O());
        sb2.append("; scrollable: " + P());
        sb2.append("; containerTitle: ");
        sb2.append(o());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(L());
        sb2.append("; importantForAccessibility: ");
        sb2.append(M());
        sb2.append("; visible: ");
        sb2.append(S());
        sb2.append("; isTextSelectable: ");
        sb2.append(R());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(D());
        sb2.append("; [");
        List<a> listG = g();
        for (int i10 = 0; i10 < listG.size(); i10++) {
            a aVar = listG.get(i10);
            String strH = h(aVar.a());
            if (strH.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                strH = aVar.b().toString();
            }
            sb2.append(strH);
            if (i10 != listG.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return this.f27902a.getPackageName();
    }

    public CharSequence w() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f27902a) : this.f27902a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public CharSequence x() {
        if (!B()) {
            return this.f27902a.getText();
        }
        List<Integer> listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f27902a.getText(), 0, this.f27902a.getText().length()));
        for (int i10 = 0; i10 < listF.size(); i10++) {
            spannableString.setSpan(new x.a(listF4.get(i10).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listF.get(i10).intValue(), listF2.get(i10).intValue(), listF3.get(i10).intValue());
        }
        return spannableString;
    }

    public CharSequence y() {
        return Build.VERSION.SDK_INT >= 28 ? this.f27902a.getTooltipText() : this.f27902a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public String z() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f27902a) : this.f27902a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    private p(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f27902a = accessibilityNodeInfo;
    }
}
