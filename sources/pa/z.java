package pa;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends Drawable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f23855u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final ImageView.ScaleType f23856v = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f23857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f23858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f23859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f23862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f23863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f23864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f23865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f23866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f23867k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Shader.TileMode f23868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Shader.TileMode f23869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f23871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean[] f23872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f23873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f23874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ColorStateList f23875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView.ScaleType f23876t;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23877a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f23877a = iArr;
        }
    }

    public z(Bitmap bitmap) {
        kotlin.jvm.internal.t.f(bitmap, "bitmap");
        this.f23857a = bitmap;
        this.f23858b = new RectF();
        this.f23859c = new RectF();
        int width = bitmap.getWidth();
        this.f23860d = width;
        int height = bitmap.getHeight();
        this.f23861e = height;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, width, height);
        this.f23862f = rectF;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f23863g = paint;
        this.f23864h = new RectF();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f23865i = paint2;
        this.f23866j = new Matrix();
        this.f23867k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f23868l = tileMode;
        this.f23869m = tileMode;
        this.f23870n = true;
        this.f23872p = new boolean[]{true, true, true, true};
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        kotlin.jvm.internal.t.e(colorStateListValueOf, "valueOf(DEFAULT_BORDER_COLOR)");
        this.f23875s = colorStateListValueOf;
        this.f23876t = f23856v;
        paint2.setColor(colorStateListValueOf.getColorForState(getState(), 0));
        paint2.setStrokeWidth(this.f23874r);
    }

    private final void f() {
        float fWidth;
        float fWidth2;
        switch (b.f23877a[this.f23876t.ordinal()]) {
            case 1:
                this.f23864h.set(this.f23858b);
                RectF rectF = this.f23864h;
                float f10 = this.f23874r / 2;
                rectF.inset(f10, f10);
                this.f23866j.reset();
                this.f23866j.setTranslate(((this.f23864h.width() - this.f23860d) * 0.5f) + 0.5f, ((this.f23864h.height() - this.f23861e) * 0.5f) + 0.5f);
                break;
            case 2:
                this.f23864h.set(this.f23858b);
                RectF rectF2 = this.f23864h;
                float f11 = 2;
                float f12 = this.f23874r / f11;
                rectF2.inset(f12, f12);
                this.f23866j.reset();
                float fHeight = 0.0f;
                if (this.f23860d * this.f23864h.height() > this.f23864h.width() * this.f23861e) {
                    fWidth = this.f23864h.height() / this.f23861e;
                    fWidth2 = (this.f23864h.width() - (this.f23860d * fWidth)) * 0.5f;
                } else {
                    fWidth = this.f23864h.width() / this.f23860d;
                    fWidth2 = 0.0f;
                    fHeight = (this.f23864h.height() - (this.f23861e * fWidth)) * 0.5f;
                }
                this.f23866j.setScale(fWidth, fWidth);
                Matrix matrix = this.f23866j;
                float f13 = this.f23874r / f11;
                matrix.postTranslate(((int) (fWidth2 + 0.5f)) + f13, ((int) (fHeight + 0.5f)) + f13);
                break;
            case 3:
                this.f23866j.reset();
                float fMin = (((float) this.f23860d) > this.f23858b.width() || ((float) this.f23861e) > this.f23858b.height()) ? Math.min(this.f23858b.width() / this.f23860d, this.f23858b.height() / this.f23861e) : 1.0f;
                float fWidth3 = ((this.f23858b.width() - (this.f23860d * fMin)) * 0.5f) + 0.5f;
                float fHeight2 = ((this.f23858b.height() - (this.f23861e * fMin)) * 0.5f) + 0.5f;
                this.f23866j.setScale(fMin, fMin);
                this.f23866j.postTranslate(fWidth3, fHeight2);
                this.f23864h.set(this.f23862f);
                this.f23866j.mapRect(this.f23864h);
                RectF rectF3 = this.f23864h;
                float f14 = this.f23874r / 2;
                rectF3.inset(f14, f14);
                this.f23866j.setRectToRect(this.f23862f, this.f23864h, Matrix.ScaleToFit.FILL);
                break;
            case 4:
                this.f23864h.set(this.f23862f);
                this.f23866j.setRectToRect(this.f23862f, this.f23858b, Matrix.ScaleToFit.CENTER);
                this.f23866j.mapRect(this.f23864h);
                RectF rectF4 = this.f23864h;
                float f15 = this.f23874r / 2;
                rectF4.inset(f15, f15);
                this.f23866j.setRectToRect(this.f23862f, this.f23864h, Matrix.ScaleToFit.FILL);
                break;
            case 5:
                this.f23864h.set(this.f23862f);
                this.f23866j.setRectToRect(this.f23862f, this.f23858b, Matrix.ScaleToFit.END);
                this.f23866j.mapRect(this.f23864h);
                RectF rectF5 = this.f23864h;
                float f16 = this.f23874r / 2;
                rectF5.inset(f16, f16);
                this.f23866j.setRectToRect(this.f23862f, this.f23864h, Matrix.ScaleToFit.FILL);
                break;
            case 6:
                this.f23864h.set(this.f23862f);
                this.f23866j.setRectToRect(this.f23862f, this.f23858b, Matrix.ScaleToFit.START);
                this.f23866j.mapRect(this.f23864h);
                RectF rectF6 = this.f23864h;
                float f17 = this.f23874r / 2;
                rectF6.inset(f17, f17);
                this.f23866j.setRectToRect(this.f23862f, this.f23864h, Matrix.ScaleToFit.FILL);
                break;
            case 7:
                this.f23864h.set(this.f23858b);
                RectF rectF7 = this.f23864h;
                float f18 = this.f23874r / 2;
                rectF7.inset(f18, f18);
                this.f23866j.reset();
                this.f23866j.setRectToRect(this.f23862f, this.f23864h, Matrix.ScaleToFit.FILL);
                break;
            default:
                this.f23864h.set(this.f23862f);
                this.f23866j.setRectToRect(this.f23862f, this.f23858b, Matrix.ScaleToFit.CENTER);
                this.f23866j.mapRect(this.f23864h);
                RectF rectF8 = this.f23864h;
                float f19 = this.f23874r / 2;
                rectF8.inset(f19, f19);
                this.f23866j.setRectToRect(this.f23862f, this.f23864h, Matrix.ScaleToFit.FILL);
                break;
        }
        this.f23859c.set(this.f23864h);
        this.f23870n = true;
    }

    private final void g(Canvas canvas) {
        if (h(this.f23872p) || this.f23871o == 0.0f) {
            return;
        }
        RectF rectF = this.f23859c;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f23859c.height() + f11;
        float f12 = this.f23871o;
        if (!this.f23872p[0]) {
            this.f23867k.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.f23867k, this.f23863g);
        }
        if (!this.f23872p[1]) {
            this.f23867k.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.f23867k, this.f23863g);
        }
        if (!this.f23872p[2]) {
            this.f23867k.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.f23867k, this.f23863g);
        }
        if (this.f23872p[3]) {
            return;
        }
        this.f23867k.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.f23867k, this.f23863g);
    }

    private final boolean h(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return false;
            }
        }
        return true;
    }

    private final void j(Canvas canvas) {
        float f10;
        if (h(this.f23872p) || this.f23871o == 0.0f) {
            return;
        }
        RectF rectF = this.f23859c;
        float f11 = rectF.left;
        float f12 = rectF.top;
        float fWidth = rectF.width() + f11;
        float fHeight = f12 + this.f23859c.height();
        float f13 = this.f23871o;
        float f14 = this.f23874r / 2;
        if (!this.f23872p[0]) {
            canvas.drawLine(f11 - f14, f12, f11 + f13, f12, this.f23865i);
            canvas.drawLine(f11, f12 - f14, f11, f12 + f13, this.f23865i);
        }
        if (!this.f23872p[1]) {
            canvas.drawLine((fWidth - f13) - f14, f12, fWidth, f12, this.f23865i);
            canvas.drawLine(fWidth, f12 - f14, fWidth, f12 + f13, this.f23865i);
        }
        if (this.f23872p[2]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine((fWidth - f13) - f14, fHeight, fWidth + f14, fHeight, this.f23865i);
            canvas.drawLine(fWidth, fHeight - f10, fWidth, fHeight, this.f23865i);
        }
        if (this.f23872p[3]) {
            return;
        }
        canvas.drawLine(f11 - f14, fHeight, f11 + f10, fHeight, this.f23865i);
        canvas.drawLine(f11, fHeight - f10, f11, fHeight, this.f23865i);
    }

    private final boolean k(boolean[] zArr) {
        for (boolean z10 : zArr) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final z a(float f10) {
        this.f23874r = f10;
        this.f23865i.setStrokeWidth(f10);
        return this;
    }

    public final z b(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (hashSet.isEmpty()) {
                this.f23871o = 0.0f;
            } else {
                float fFloatValue = ((Number) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= 0.0f) {
                    this.f23871o = fFloatValue;
                }
            }
            boolean[] zArr = this.f23872p;
            zArr[0] = f10 > 0.0f;
            zArr[1] = f11 > 0.0f;
            zArr[2] = f12 > 0.0f;
            zArr[3] = f13 > 0.0f;
        }
        return this;
    }

    public final z c(int i10) {
        return d(ColorStateList.valueOf(i10));
    }

    public final z d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            kotlin.jvm.internal.t.e(colorStateList, "valueOf(0)");
        }
        this.f23875s = colorStateList;
        this.f23865i.setColor(colorStateList.getColorForState(getState(), 0));
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        kotlin.jvm.internal.t.f(canvas, "canvas");
        if (this.f23870n) {
            BitmapShader bitmapShader = new BitmapShader(this.f23857a, this.f23868l, this.f23869m);
            Shader.TileMode tileMode = this.f23868l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f23869m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f23866j);
            }
            this.f23863g.setShader(bitmapShader);
            this.f23870n = false;
        }
        if (this.f23873q) {
            if (this.f23874r <= 0.0f) {
                canvas.drawOval(this.f23859c, this.f23863g);
                return;
            } else {
                canvas.drawOval(this.f23859c, this.f23863g);
                canvas.drawOval(this.f23864h, this.f23865i);
                return;
            }
        }
        if (!k(this.f23872p)) {
            canvas.drawRect(this.f23859c, this.f23863g);
            if (this.f23874r > 0.0f) {
                canvas.drawRect(this.f23864h, this.f23865i);
                return;
            }
            return;
        }
        float f10 = this.f23871o;
        if (this.f23874r <= 0.0f) {
            canvas.drawRoundRect(this.f23859c, f10, f10, this.f23863g);
            g(canvas);
        } else {
            canvas.drawRoundRect(this.f23859c, f10, f10, this.f23863g);
            canvas.drawRoundRect(this.f23864h, f10, f10, this.f23865i);
            g(canvas);
            j(canvas);
        }
    }

    public final z e(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = f23856v;
        }
        if (this.f23876t != scaleType) {
            this.f23876t = scaleType;
            f();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23863g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f23863g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f23861e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f23860d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final z i(float f10) {
        b(f10, f10, f10, f10);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f23875s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        kotlin.jvm.internal.t.f(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f23858b.set(bounds);
        f();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        kotlin.jvm.internal.t.f(state, "state");
        int colorForState = this.f23875s.getColorForState(state, 0);
        if (this.f23865i.getColor() == colorForState) {
            return super.onStateChange(state);
        }
        this.f23865i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f23863g.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23863g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f23863g.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f23863g.setFilterBitmap(z10);
        invalidateSelf();
    }
}
