package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes.dex */
class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1215a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f1216b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f1217c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f1218d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f1219e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f1220f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f1221g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f1222h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f1223i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f1224j = new int[1];

    public static int a(Context context, int i10) {
        ColorStateList colorStateListD = d(context, i10);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f1216b, colorStateListD.getDefaultColor());
        }
        TypedValue typedValueE = e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueE, true);
        return c(context, i10, typedValueE.getFloat());
    }

    public static int b(Context context, int i10) {
        int[] iArr = f1224j;
        iArr[0] = i10;
        h1 h1VarS = h1.s(context, null, iArr);
        try {
            return h1VarS.b(0, 0);
        } finally {
            h1VarS.u();
        }
    }

    static int c(Context context, int i10, float f10) {
        int iB = b(context, i10);
        return androidx.core.graphics.a.d(iB, Math.round(Color.alpha(iB) * f10));
    }

    public static ColorStateList d(Context context, int i10) {
        int[] iArr = f1224j;
        iArr[0] = i10;
        h1 h1VarS = h1.s(context, null, iArr);
        try {
            return h1VarS.c(0);
        } finally {
            h1VarS.u();
        }
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f1215a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
