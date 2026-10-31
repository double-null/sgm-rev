package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f1576h = {R.attr.colorBackground};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c f1577i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f1582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Rect f1583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f1584g;

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f1585a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(Drawable drawable) {
            this.f1585a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable c() {
            return this.f1585a;
        }

        @Override // androidx.cardview.widget.b
        public void d(int i10, int i11, int i12, int i13) {
            CardView.this.f1583f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1582e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f1577i = aVar;
        aVar.k();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.a.f24346a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1577i.e(this.f1584g);
    }

    public float getCardElevation() {
        return f1577i.i(this.f1584g);
    }

    public int getContentPaddingBottom() {
        return this.f1582e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1582e.left;
    }

    public int getContentPaddingRight() {
        return this.f1582e.right;
    }

    public int getContentPaddingTop() {
        return this.f1582e.top;
    }

    public float getMaxCardElevation() {
        return f1577i.d(this.f1584g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1579b;
    }

    public float getRadius() {
        return f1577i.b(this.f1584g);
    }

    public boolean getUseCompatPadding() {
        return this.f1578a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        c cVar = f1577i;
        if (cVar instanceof androidx.cardview.widget.a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.l(this.f1584g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.f(this.f1584g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1577i.m(this.f1584g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1577i.c(this.f1584g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1577i.n(this.f1584g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1581d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1580c = i10;
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1579b) {
            this.f1579b = z10;
            f1577i.g(this.f1584g);
        }
    }

    public void setRadius(float f10) {
        f1577i.a(this.f1584g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1578a != z10) {
            this.f1578a = z10;
            f1577i.j(this.f1584g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f1582e = rect;
        this.f1583f = new Rect();
        a aVar = new a();
        this.f1584g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.d.f24350a, i10, q.c.f24349a);
        int i11 = q.d.f24353d;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1576h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(q.b.f24348b) : getResources().getColor(q.b.f24347a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(q.d.f24354e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(q.d.f24355f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(q.d.f24356g, 0.0f);
        this.f1578a = typedArrayObtainStyledAttributes.getBoolean(q.d.f24358i, false);
        this.f1579b = typedArrayObtainStyledAttributes.getBoolean(q.d.f24357h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.d.f24359j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.d.f24361l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.d.f24363n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.d.f24362m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.d.f24360k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1580c = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.d.f24351b, 0);
        this.f1581d = typedArrayObtainStyledAttributes.getDimensionPixelSize(q.d.f24352c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f1577i.h(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1577i.m(this.f1584g, colorStateList);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
