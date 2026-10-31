package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;

/* JADX INFO: compiled from: TooltipPopup.java */
/* JADX INFO: loaded from: classes2.dex */
class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f1350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f1351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f1353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f1354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f1355g;

    m1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1352d = layoutParams;
        this.f1353e = new Rect();
        this.f1354f = new int[2];
        this.f1355g = new int[2];
        this.f1349a = context;
        View viewInflate = LayoutInflater.from(context).inflate(g.g.f15094s, (ViewGroup) null);
        this.f1350b = viewInflate;
        this.f1351c = (TextView) viewInflate.findViewById(g.f.f15068s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = g.i.f15108a;
        layoutParams.flags = 24;
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f1349a.getSystemService("window")).removeView(this.f1350b);
        }
    }

    boolean d() {
        return this.f1350b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1351c.setText(charSequence);
        a(view, i10, i11, z10, this.f1352d);
        ((WindowManager) this.f1349a.getSystemService("window")).addView(this.f1350b, this.f1352d);
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        int i13;
        int dimensionPixelSize;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1349a.getResources().getDimensionPixelOffset(g.d.f15021j);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1349a.getResources().getDimensionPixelOffset(g.d.f15020i);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f1349a.getResources();
        if (z10) {
            i13 = g.d.f15023l;
        } else {
            i13 = g.d.f15022k;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i13);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f1353e);
        Rect rect = this.f1353e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f1349a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", edUJlCZxhVnO.LyIwwqVBjF);
            if (identifier != 0) {
                dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
            } else {
                dimensionPixelSize = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f1353e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f1355g);
        view.getLocationOnScreen(this.f1354f);
        int[] iArr = this.f1354f;
        int i14 = iArr[0];
        int[] iArr2 = this.f1355g;
        int i15 = i14 - iArr2[0];
        iArr[0] = i15;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i15 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1350b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1350b.getMeasuredHeight();
        int i16 = this.f1354f[1];
        int i17 = ((i12 + i16) - dimensionPixelOffset3) - measuredHeight;
        int i18 = i16 + height + dimensionPixelOffset3;
        if (z10) {
            if (i17 >= 0) {
                layoutParams.y = i17;
                return;
            } else {
                layoutParams.y = i18;
                return;
            }
        }
        if (measuredHeight + i18 <= this.f1353e.height()) {
            layoutParams.y = i18;
        } else {
            layoutParams.y = i17;
        }
    }
}
