package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.android.billingclient.gp.VRfCTjjLv;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
/* JADX INFO: loaded from: classes2.dex */
class i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final RectF f1282k = new RectF();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1283l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f1284m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1285a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1286b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1287c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f1288d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1289e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f1290f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1291g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f1292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f1293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f1294j;

    i0(TextView textView) {
        this.f1293i = textView;
        this.f1294j = textView.getContext();
    }

    private void A(float f10, float f11, float f12) throws IllegalArgumentException {
        String str = xjwcmjDeOXR.UpfnqzASxbYyVu;
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + str);
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException(VRfCTjjLv.siFATTn + f12 + str);
        }
        this.f1285a = 1;
        this.f1288d = f10;
        this.f1289e = f11;
        this.f1287c = f12;
        this.f1291g = false;
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1285a = 0;
        this.f1288d = -1.0f;
        this.f1289e = -1.0f;
        this.f1287c = -1.0f;
        this.f1290f = new int[0];
        this.f1286b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1292h, i10);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f1293i.getLineSpacingExtra(), this.f1293i.getLineSpacingMultiplier()).setIncludePad(this.f1293i.getIncludeFontPadding()).setBreakStrategy(this.f1293i.getBreakStrategy()).setHyphenationFrequency(this.f1293i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            builderObtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.f1293i.getTextDirectionHeuristic() : (TextDirectionHeuristic) n(this.f1293i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    private int f(RectF rectF) {
        int length = this.f1290f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (y(this.f1290f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f1290f[i12];
    }

    private static Method l(String str) {
        try {
            Method declaredMethod = f1283l.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f1283l.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    private static <T> T n(Object obj, String str, T t10) {
        try {
            return (T) l(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void t(float f10) {
        if (f10 != this.f1293i.getPaint().getTextSize()) {
            this.f1293i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f1293i.isInLayout();
            if (this.f1293i.getLayout() != null) {
                this.f1286b = false;
                try {
                    Method methodL = l("nullLayouts");
                    if (methodL != null) {
                        methodL.invoke(this.f1293i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f1293i.forceLayout();
                } else {
                    this.f1293i.requestLayout();
                }
                this.f1293i.invalidate();
            }
        }
    }

    private boolean v() {
        if (z() && this.f1285a == 1) {
            if (!this.f1291g || this.f1290f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1289e - this.f1288d) / this.f1287c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f1288d + (i10 * this.f1287c));
                }
                this.f1290f = b(iArr);
            }
            this.f1286b = true;
        } else {
            this.f1286b = false;
        }
        return this.f1286b;
    }

    private void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1290f = b(iArr);
            x();
        }
    }

    private boolean x() {
        int[] iArr = this.f1290f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1291g = z10;
        if (z10) {
            this.f1285a = 1;
            this.f1288d = iArr[0];
            this.f1289e = iArr[length - 1];
            this.f1287c = -1.0f;
        }
        return z10;
    }

    private boolean y(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1293i.getText();
        TransformationMethod transformationMethod = this.f1293i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1293i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1293i.getMaxLines();
        m(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) n(this.f1293i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean z() {
        return !(this.f1293i instanceof k);
    }

    void a() {
        if (o()) {
            if (this.f1286b) {
                if (this.f1293i.getMeasuredHeight() <= 0 || this.f1293i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f1293i.isHorizontallyScrollable() : ((Boolean) n(this.f1293i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f1293i.getMeasuredWidth() - this.f1293i.getTotalPaddingLeft()) - this.f1293i.getTotalPaddingRight();
                int height = (this.f1293i.getHeight() - this.f1293i.getCompoundPaddingBottom()) - this.f1293i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1282k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float f10 = f(rectF);
                    if (f10 != this.f1293i.getTextSize()) {
                        u(0, f10);
                    }
                }
            }
            this.f1286b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return e(charSequence, alignment, i10, i11);
    }

    int g() {
        return Math.round(this.f1289e);
    }

    int h() {
        return Math.round(this.f1288d);
    }

    int i() {
        return Math.round(this.f1287c);
    }

    int[] j() {
        return this.f1290f;
    }

    int k() {
        return this.f1285a;
    }

    void m(int i10) {
        TextPaint textPaint = this.f1292h;
        if (textPaint == null) {
            this.f1292h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1292h.set(this.f1293i.getPaint());
        this.f1292h.setTextSize(i10);
    }

    boolean o() {
        return z() && this.f1285a != 0;
    }

    void p(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f1294j.obtainStyledAttributes(attributeSet, g.j.f15152i0, i10, 0);
        int i11 = g.j.f15177n0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f1285a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = g.j.f15172m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = g.j.f15162k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = g.j.f15157j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = g.j.f15167l0;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z()) {
            this.f1285a = 0;
            return;
        }
        if (this.f1285a == 1) {
            if (!this.f1291g) {
                DisplayMetrics displayMetrics = this.f1294j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    void q(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (z()) {
            DisplayMetrics displayMetrics = this.f1294j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    void r(int[] iArr, int i10) throws IllegalArgumentException {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1294j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1290f = b(iArrCopyOf);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1291g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    void s(int i10) {
        if (z()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f1294j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        }
    }

    void u(int i10, float f10) {
        Context context = this.f1294j;
        t(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
