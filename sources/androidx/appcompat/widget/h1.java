package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: compiled from: TintTypedArray.java */
/* JADX INFO: loaded from: classes.dex */
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f1274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f1275c;

    private h1(Context context, TypedArray typedArray) {
        this.f1273a = context;
        this.f1274b = typedArray;
    }

    public static h1 r(Context context, int i10, int[] iArr) {
        return new h1(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static h1 s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new h1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static h1 t(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new h1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1274b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1274b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f1274b.hasValue(i10) || (resourceId = this.f1274b.getResourceId(i10, 0)) == 0 || (colorStateListA = h.a.a(this.f1273a, resourceId)) == null) ? this.f1274b.getColorStateList(i10) : colorStateListA;
    }

    public int d(int i10, int i11) {
        return this.f1274b.getDimensionPixelOffset(i10, i11);
    }

    public int e(int i10, int i11) {
        return this.f1274b.getDimensionPixelSize(i10, i11);
    }

    public Drawable f(int i10) {
        int resourceId;
        return (!this.f1274b.hasValue(i10) || (resourceId = this.f1274b.getResourceId(i10, 0)) == 0) ? this.f1274b.getDrawable(i10) : h.a.b(this.f1273a, resourceId);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f1274b.hasValue(i10) || (resourceId = this.f1274b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1273a, resourceId, true);
    }

    public float h(int i10, float f10) {
        return this.f1274b.getFloat(i10, f10);
    }

    public Typeface i(int i10, int i11, androidx.core.content.res.d.a aVar) {
        int resourceId = this.f1274b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1275c == null) {
            this.f1275c = new TypedValue();
        }
        return androidx.core.content.res.d.b(this.f1273a, resourceId, this.f1275c, i11, aVar);
    }

    public int j(int i10, int i11) {
        return this.f1274b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f1274b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1274b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1274b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f1274b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f1274b.getText(i10);
    }

    public CharSequence[] p(int i10) {
        return this.f1274b.getTextArray(i10);
    }

    public boolean q(int i10) {
        return this.f1274b.hasValue(i10);
    }

    public void u() {
        this.f1274b.recycle();
    }
}
