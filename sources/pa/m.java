package pa;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends Drawable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f23792p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final c f23793q = c.TOP_BOTTOM;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f23794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f23795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f23796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f23797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f23798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f23799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorFilter f23800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BlendModeColorFilter f23801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f23803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f23805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f23807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private gb.e f23808o;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public enum c {
        TOP_BOTTOM,
        TR_BL,
        RIGHT_LEFT,
        BR_TL,
        BOTTOM_TOP,
        BL_TR,
        LEFT_RIGHT,
        TL_BR
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23845a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f23845a = iArr;
        }
    }

    public /* synthetic */ m(b bVar, kotlin.jvm.internal.k kVar) {
        this(bVar);
    }

    private final int a(int i10) {
        int i11 = this.f23802i;
        return (i10 * (i11 + (i11 >> 7))) >> 8;
    }

    private final BlendModeColorFilter b(BlendModeColorFilter blendModeColorFilter, ColorStateList colorStateList, BlendMode blendMode) {
        if (colorStateList == null || blendMode == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return blendModeColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        return (blendModeColorFilter != null && blendModeColorFilter.getColor() == colorForState && blendModeColorFilter.getMode() == blendMode) ? blendModeColorFilter : new BlendModeColorFilter(colorForState, blendMode);
    }

    private final Path c(b bVar) {
        Path path = this.f23805l;
        if (path != null && !this.f23806m) {
            return path;
        }
        this.f23806m = false;
        float level = (getLevel() * 360.0f) / 10000.0f;
        RectF rectF = new RectF(this.f23796c);
        float fWidth = rectF.width() / 2.0f;
        float fHeight = rectF.height() / 2.0f;
        float fB = bVar.b() != -1 ? bVar.b() : rectF.width() / bVar.c();
        float fB2 = bVar.B() != -1 ? bVar.B() : rectF.width() / bVar.C();
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(fWidth - fB2, fHeight - fB2);
        RectF rectF3 = new RectF(rectF2);
        float f10 = -fB;
        rectF3.inset(f10, f10);
        Path path2 = this.f23805l;
        if (path2 != null) {
            path2.reset();
        } else {
            path2 = new Path();
            this.f23805l = path2;
        }
        if (level >= 360.0f || level <= -360.0f) {
            path2.addOval(rectF3, Path.Direction.CW);
            path2.addOval(rectF2, Path.Direction.CCW);
        } else {
            path2.setFillType(Path.FillType.EVEN_ODD);
            float f11 = fWidth + fB2;
            path2.moveTo(f11, fHeight);
            path2.lineTo(f11 + fB, fHeight);
            path2.arcTo(rectF3, 0.0f, level, false);
            path2.arcTo(rectF2, level, -level, false);
            path2.close();
        }
        path2.addOval(rectF3, Path.Direction.CW);
        path2.addOval(rectF2, Path.Direction.CCW);
        return path2;
    }

    private final void d() {
        b bVar = this.f23794a;
        if (this.f23806m) {
            l();
            this.f23795b.reset();
            float[] fArrJ = bVar.J();
            if (fArrJ != null) {
                this.f23795b.addRoundRect(this.f23796c, fArrJ, Path.Direction.CW);
            }
            this.f23806m = false;
        }
    }

    public static /* synthetic */ void h(m mVar, float f10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = 0.5f;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        mVar.f(f10, i10);
    }

    public static /* synthetic */ void i(m mVar, int i10, int i11, float f10, float f11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f11 = 0.0f;
        }
        mVar.g(i10, i11, f10, f11);
    }

    private final void k(int i10, int i11, float f10, float f11) {
        Paint paint = this.f23799f;
        if (paint == null) {
            paint = new Paint(1);
            this.f23799f = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
        paint.setPathEffect(f10 > 0.0f ? new DashPathEffect(new float[]{f10, f11}, 0.0f) : null);
        this.f23804k = true;
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x012a  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0054. Please report as an issue. */
    private final boolean l() {
        double dMin;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        if (this.f23804k) {
            this.f23804k = false;
            Paint paint = this.f23799f;
            Rect bounds = getBounds();
            kotlin.jvm.internal.t.e(bounds, "getBounds()");
            float strokeWidth = paint != null ? paint.getStrokeWidth() * 0.5f : 0.0f;
            b bVar = this.f23794a;
            this.f23796c.set(bounds.left + strokeWidth, bounds.top + strokeWidth, bounds.right - strokeWidth, bounds.bottom - strokeWidth);
            int[] iArrU = bVar.u();
            if (iArrU != null) {
                RectF rectF = this.f23796c;
                if (bVar.z() == 0) {
                    switch (d.f23845a[bVar.F().ordinal()]) {
                        case 1:
                            f11 = rectF.left;
                            f12 = rectF.top;
                            f13 = rectF.bottom;
                            f21 = f11;
                            f22 = f21;
                            f23 = f12;
                            f24 = f13 * 1.0f;
                            break;
                        case 2:
                            f14 = rectF.right;
                            f15 = rectF.top;
                            f16 = rectF.left * 1.0f;
                            f17 = rectF.bottom;
                            f21 = f14;
                            f23 = f15;
                            f22 = f16;
                            f24 = f17 * 1.0f;
                            break;
                        case 3:
                            f18 = rectF.right;
                            f19 = rectF.top;
                            f20 = rectF.left;
                            f21 = f18;
                            f23 = f19;
                            f24 = f23;
                            f22 = f20 * 1.0f;
                            break;
                        case 4:
                            f14 = rectF.right;
                            f15 = rectF.bottom;
                            f16 = rectF.left * 1.0f;
                            f17 = rectF.top;
                            f21 = f14;
                            f23 = f15;
                            f22 = f16;
                            f24 = f17 * 1.0f;
                            break;
                        case 5:
                            f11 = rectF.left;
                            f12 = rectF.bottom;
                            f13 = rectF.top;
                            f21 = f11;
                            f22 = f21;
                            f23 = f12;
                            f24 = f13 * 1.0f;
                            break;
                        case 6:
                            f14 = rectF.left;
                            f15 = rectF.bottom;
                            f16 = rectF.right * 1.0f;
                            f17 = rectF.top;
                            f21 = f14;
                            f23 = f15;
                            f22 = f16;
                            f24 = f17 * 1.0f;
                            break;
                        case 7:
                            f18 = rectF.left;
                            f19 = rectF.top;
                            f20 = rectF.right;
                            f21 = f18;
                            f23 = f19;
                            f24 = f23;
                            f22 = f20 * 1.0f;
                            break;
                        default:
                            f14 = rectF.left;
                            f15 = rectF.top;
                            f16 = rectF.right * 1.0f;
                            f17 = rectF.bottom;
                            f21 = f14;
                            f23 = f15;
                            f22 = f16;
                            f24 = f17 * 1.0f;
                            break;
                    }
                    this.f23808o = new gb.d(new LinearGradient(f21, f23, f22, f24, iArrU, bVar.H(), Shader.TileMode.CLAMP));
                } else if (bVar.z() == 1) {
                    float f25 = rectF.left;
                    float fR = f25 + ((rectF.right - f25) * bVar.r());
                    float f26 = rectF.top;
                    float fS = f26 + ((rectF.bottom - f26) * bVar.s());
                    float fX = bVar.x();
                    if (bVar.y() == 1) {
                        dMin = Math.min(bVar.e() >= 0 ? bVar.e() : rectF.width(), bVar.A() >= 0 ? bVar.A() : rectF.height());
                    } else {
                        if (bVar.y() == 2) {
                            dMin = Math.min(rectF.width(), rectF.height());
                        }
                        this.f23807n = fX;
                        if (fX <= 0.0f) {
                            f10 = 0.001f;
                        } else {
                            f10 = fX;
                        }
                        this.f23808o = new gb.d(new RadialGradient(fR, fS, f10, iArrU, (float[]) null, Shader.TileMode.CLAMP));
                    }
                    fX *= (float) dMin;
                    this.f23807n = fX;
                    if (fX <= 0.0f) {
                        f10 = 0.001f;
                    } else {
                        f10 = fX;
                    }
                    this.f23808o = new gb.d(new RadialGradient(fR, fS, f10, iArrU, (float[]) null, Shader.TileMode.CLAMP));
                } else if (bVar.z() == 2) {
                    float f27 = rectF.left;
                    float fR2 = f27 + ((rectF.right - f27) * bVar.r());
                    float f28 = rectF.top;
                    this.f23808o = new gb.d(new SweepGradient(fR2, f28 + ((rectF.bottom - f28) * bVar.s()), iArrU, (float[]) null));
                } else if (bVar.z() == 3 && iArrU.length >= 4) {
                    this.f23808o = new gb.c(rectF, iArrU, null, false, 12, null);
                }
                if (bVar.L() == null) {
                    this.f23797d.setColor(-16777216);
                }
            }
        }
        return !this.f23796c.isEmpty();
    }

    private final boolean n() {
        Paint paint = this.f23799f;
        if (this.f23794a.a() < 0 || paint == null || o.a(paint.getColor())) {
            return this.f23794a.w() != null || o.a(this.f23797d.getColor());
        }
        return false;
    }

    private final void o() {
        b bVar = this.f23794a;
        ColorStateList colorStateListL = bVar.L();
        if (colorStateListL != null) {
            this.f23797d.setColor(colorStateListL.getColorForState(getState(), 0));
        } else if (bVar.w() == null) {
            this.f23797d.setColor(0);
        } else {
            this.f23797d.setColor(-16777216);
        }
        this.f23798e = bVar.G();
        int iA = bVar.a();
        if (iA >= 0) {
            Paint paint = this.f23799f;
            if (paint == null) {
                paint = new Paint(1);
                this.f23799f = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(iA);
            }
            ColorStateList colorStateListM = bVar.M();
            if (colorStateListM != null) {
                paint.setColor(colorStateListM.getColorForState(getState(), 0));
            }
            float fO = bVar.O();
            if (fO != 0.0f) {
                paint.setPathEffect(new DashPathEffect(new float[]{fO, bVar.N()}, 0.0f));
            }
        }
        this.f23801h = b(this.f23801h, bVar.d(), bVar.o());
        this.f23804k = true;
        bVar.f();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        kotlin.jvm.internal.t.f(canvas, "canvas");
        if (l()) {
            Paint paint9 = this.f23797d;
            gb.e eVar = this.f23808o;
            paint9.setShader(eVar != null ? eVar.a(canvas.isHardwareAccelerated()) : null);
            int alpha = this.f23797d.getAlpha();
            Paint paint10 = this.f23799f;
            int alpha2 = paint10 != null ? paint10.getAlpha() : 0;
            int iA = a(alpha);
            int iA2 = a(alpha2);
            Paint paint11 = this.f23799f;
            float strokeWidth = paint11 != null ? paint11.getStrokeWidth() : 0.0f;
            boolean z10 = iA2 > 0 && strokeWidth > 0.0f;
            boolean z11 = iA > 0;
            b bVar = this.f23794a;
            ColorFilter colorFilter = this.f23800g;
            if (colorFilter == null) {
                colorFilter = this.f23801h;
            }
            ColorFilter colorFilter2 = colorFilter;
            boolean z12 = z10 && z11 && bVar.K() != 2 && iA2 < 255 && (this.f23802i < 255 || colorFilter2 != null);
            if (z12) {
                Paint paint12 = this.f23803j;
                if (paint12 == null) {
                    paint12 = new Paint();
                    this.f23803j = paint12;
                }
                Paint paint13 = paint12;
                paint13.setDither(bVar.v());
                paint13.setAlpha(this.f23802i);
                paint13.setColorFilter(colorFilter2);
                RectF rectF = this.f23796c;
                i10 = 2;
                canvas.saveLayer(rectF.left - strokeWidth, rectF.top - strokeWidth, rectF.right + strokeWidth, rectF.bottom + strokeWidth, paint13);
                this.f23797d.setColorFilter(null);
                Paint paint14 = this.f23799f;
                if (paint14 != null) {
                    paint14.setColorFilter(null);
                }
            } else {
                i10 = 2;
                this.f23797d.setAlpha(iA);
                this.f23797d.setDither(bVar.v());
                this.f23797d.setColorFilter(colorFilter2);
                if (colorFilter2 != null && bVar.L() == null) {
                    this.f23797d.setColor(this.f23802i << 24);
                }
                if (z10 && (paint = this.f23799f) != null) {
                    paint.setAlpha(iA2);
                    paint.setDither(bVar.v());
                    paint.setColorFilter(colorFilter2);
                }
            }
            int iK = bVar.K();
            if (iK != 0) {
                if (iK == 1) {
                    canvas.drawOval(this.f23796c, this.f23797d);
                    if (z10 && (paint6 = this.f23799f) != null) {
                        canvas.drawOval(this.f23796c, paint6);
                    }
                } else if (iK == i10) {
                    RectF rectF2 = this.f23796c;
                    float fCenterY = rectF2.centerY();
                    if (z10 && (paint7 = this.f23799f) != null) {
                        canvas.drawLine(rectF2.left, fCenterY, rectF2.right, fCenterY, paint7);
                    }
                } else if (iK == 3) {
                    Path pathC = c(bVar);
                    canvas.drawPath(pathC, this.f23797d);
                    if (z10 && (paint8 = this.f23799f) != null) {
                        canvas.drawPath(pathC, paint8);
                    }
                }
            } else if (bVar.J() != null) {
                d();
                canvas.drawPath(this.f23795b, this.f23797d);
                if (z10 && (paint4 = this.f23799f) != null) {
                    canvas.drawPath(this.f23795b, paint4);
                }
            } else if (bVar.I() > 0.0f) {
                float fMin = (float) Math.min(bVar.I(), Math.min(this.f23796c.width(), this.f23796c.height()) * ((double) 0.5f));
                canvas.drawRoundRect(this.f23796c, fMin, fMin, this.f23797d);
                if (z10 && (paint3 = this.f23799f) != null) {
                    canvas.drawRoundRect(this.f23796c, fMin, fMin, paint3);
                }
            } else {
                if (this.f23797d.getColor() != 0 || colorFilter2 != null || this.f23797d.getShader() != null) {
                    canvas.drawRect(this.f23796c, this.f23797d);
                }
                if (z10 && (paint2 = this.f23799f) != null) {
                    canvas.drawRect(this.f23796c, paint2);
                }
            }
            if (z12) {
                canvas.restore();
                return;
            }
            this.f23797d.setAlpha(alpha);
            if (!z10 || (paint5 = this.f23799f) == null) {
                return;
            }
            paint5.setAlpha(alpha2);
        }
    }

    public final void e(float f10) {
        this.f23794a.g(f10);
        this.f23806m = true;
        invalidateSelf();
    }

    public final void f(float f10, int i10) {
        this.f23794a.h(f10, i10);
        this.f23804k = true;
        invalidateSelf();
    }

    public final void g(int i10, int i11, float f10, float f11) {
        this.f23794a.j(i10, ColorStateList.valueOf(i11), f10, f11);
        k(i10, i11, f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23802i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f23794a.t();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f23800g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        b bVar = this.f23794a;
        bVar.i(getChangingConfigurations());
        return bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f23794a.A();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f23794a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (this.f23802i == 255 && this.f23794a.D() && n()) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        kotlin.jvm.internal.t.f(outline, "outline");
        b bVar = this.f23794a;
        Paint paint = this.f23799f;
        Rect bounds = getBounds();
        kotlin.jvm.internal.t.e(bounds, "getBounds()");
        outline.setAlpha((bVar.E() && (this.f23794a.a() <= 0 || paint == null || paint.getAlpha() == this.f23797d.getAlpha())) ? a(this.f23797d.getAlpha()) / 255.0f : 0.0f);
        int iK = bVar.K();
        if (iK != 0) {
            if (iK == 1) {
                outline.setOval(bounds);
                return;
            } else {
                if (iK != 2) {
                    return;
                }
                float strokeWidth = paint != null ? paint.getStrokeWidth() * 0.5f : 1.0E-4f;
                float fCenterY = bounds.centerY();
                outline.setRect(bounds.left, (int) Math.floor(fCenterY - strokeWidth), bounds.right, (int) Math.ceil(fCenterY + strokeWidth));
                return;
            }
        }
        float[] fArrJ = bVar.J();
        if (fArrJ == null) {
            outline.setRoundRect(bounds, bVar.I() > 0.0f ? (float) Math.min(bVar.I(), Math.min(bounds.width(), bounds.height()) * ((double) 0.5f)) : 0.0f);
            return;
        }
        d();
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f23795b);
        } else {
            outline.setRoundRect(bounds, kotlin.collections.o.T(fArrJ));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        kotlin.jvm.internal.t.f(padding, "padding");
        Rect rect = this.f23798e;
        if (rect == null) {
            return super.getPadding(padding);
        }
        padding.set(rect);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        b bVar = this.f23794a;
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateListL = bVar.L();
        if (colorStateListL != null && colorStateListL.isStateful()) {
            return true;
        }
        ColorStateList colorStateListM = bVar.M();
        if (colorStateListM != null && colorStateListM.isStateful()) {
            return true;
        }
        ColorStateList colorStateListD = bVar.d();
        return colorStateListD != null && colorStateListD.isStateful();
    }

    public final void j(int i10) {
        this.f23794a.k(ColorStateList.valueOf(i10));
        this.f23797d.setColor(i10);
        invalidateSelf();
    }

    public final void m(int i10) {
        this.f23794a.p(i10);
        this.f23804k = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (super.mutate() == this) {
            this.f23794a = new b(this.f23794a);
            o();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        kotlin.jvm.internal.t.f(rect, "rect");
        super.onBoundsChange(rect);
        this.f23805l = null;
        this.f23806m = true;
        this.f23804k = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        super.onLevelChange(i10);
        this.f23804k = true;
        this.f23806m = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] stateSet) {
        boolean z10;
        ColorStateList colorStateListM;
        int colorForState;
        int colorForState2;
        kotlin.jvm.internal.t.f(stateSet, "stateSet");
        b bVar = this.f23794a;
        ColorStateList colorStateListL = bVar.L();
        if (colorStateListL == null || this.f23797d.getColor() == (colorForState2 = colorStateListL.getColorForState(stateSet, 0))) {
            z10 = false;
        } else {
            this.f23797d.setColor(colorForState2);
            z10 = true;
        }
        Paint paint = this.f23799f;
        if (paint != null && (colorStateListM = bVar.M()) != null && paint.getColor() != (colorForState = colorStateListM.getColorForState(stateSet, 0))) {
            paint.setColor(colorForState);
            z10 = true;
        }
        if (bVar.d() != null && bVar.o() != null) {
            this.f23801h = b(this.f23801h, bVar.d(), bVar.o());
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f23802i != i10) {
            this.f23802i = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f23800g != colorFilter) {
            this.f23800g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        if (this.f23794a.v() != z10) {
            this.f23794a.m(z10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.f23794a.l(blendMode);
        this.f23801h = b(this.f23801h, this.f23794a.d(), blendMode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f23794a.q(colorStateList);
        this.f23801h = b(this.f23801h, colorStateList, this.f23794a.o());
        invalidateSelf();
    }

    public m() {
        this(new b(f23793q, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(c orientation, int[] iArr) {
        this(new b(orientation, iArr));
        kotlin.jvm.internal.t.f(orientation, "orientation");
    }

    private m(b bVar) {
        this.f23795b = new Path();
        this.f23796c = new RectF();
        this.f23797d = new Paint(1);
        this.f23802i = 255;
        this.f23806m = true;
        this.f23794a = bVar;
        o();
    }

    public static final class b extends Drawable.ConstantState {
        private boolean A;
        private boolean B;
        private ColorStateList C;
        private BlendMode D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f23813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ColorStateList f23814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f23815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList[] f23816h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float[] f23817i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f23818j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f23819k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f23820l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f23821m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float[] f23822n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Rect f23823o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f23824p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f23825q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f23826r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private float f23827s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f23828t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f23829u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f23830v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private float f23831w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f23832x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f23833y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f23834z;

        static final class a extends kotlin.jvm.internal.u implements id.l {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f23835d = new a();

            a() {
                super(1);
            }

            @Override // id.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(ColorStateList colorStateList) {
                if (colorStateList != null) {
                    return Integer.valueOf(colorStateList.getDefaultColor());
                }
                return null;
            }
        }

        public b(c orientation, int[] iArr) {
            kotlin.jvm.internal.t.f(orientation, "orientation");
            this.f23818j = -1;
            this.f23824p = -1;
            this.f23825q = -1;
            this.f23826r = 3.0f;
            this.f23827s = 9.0f;
            this.f23828t = -1;
            this.f23829u = -1;
            this.f23831w = 0.5f;
            this.f23832x = 0.5f;
            this.f23833y = 0.5f;
            this.D = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f23813e = orientation;
            n(iArr);
        }

        public final int A() {
            return this.f23825q;
        }

        public final int B() {
            return this.f23828t;
        }

        public final float C() {
            return this.f23826r;
        }

        public final boolean D() {
            return this.A;
        }

        public final boolean E() {
            return this.B;
        }

        public final c F() {
            return this.f23813e;
        }

        public final Rect G() {
            return this.f23823o;
        }

        public final float[] H() {
            return this.f23817i;
        }

        public final float I() {
            return this.f23821m;
        }

        public final float[] J() {
            return this.f23822n;
        }

        public final int K() {
            return this.f23810b;
        }

        public final ColorStateList L() {
            return this.f23814f;
        }

        public final ColorStateList M() {
            return this.f23815g;
        }

        public final float N() {
            return this.f23820l;
        }

        public final float O() {
            return this.f23819k;
        }

        public final int a() {
            return this.f23818j;
        }

        public final int b() {
            return this.f23829u;
        }

        public final float c() {
            return this.f23827s;
        }

        public final ColorStateList d() {
            return this.C;
        }

        public final int e() {
            return this.f23824p;
        }

        public final void f() {
            Boolean boolValueOf;
            boolean z10;
            boolean z11 = false;
            this.A = false;
            this.B = false;
            ColorStateList[] colorStateListArr = this.f23816h;
            if (colorStateListArr == null && this.f23814f == null) {
                return;
            }
            if (colorStateListArr != null) {
                int length = colorStateListArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        ColorStateList colorStateList = colorStateListArr[i10];
                        if (colorStateList != null && !o.a(colorStateList.getDefaultColor())) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                boolValueOf = Boolean.valueOf(z10);
            } else {
                boolValueOf = null;
            }
            if (kotlin.jvm.internal.t.a(boolValueOf, Boolean.TRUE)) {
                return;
            }
            this.B = true;
            if (this.f23810b == 0 && this.f23821m <= 0.0f && this.f23822n == null) {
                z11 = true;
            }
            this.A = z11;
        }

        public final void g(float f10) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            this.f23821m = f10;
            this.f23822n = null;
            f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i10 = this.f23809a;
            ColorStateList colorStateList = this.f23815g;
            int changingConfigurations = i10 | (colorStateList != null ? colorStateList.getChangingConfigurations() : 0);
            ColorStateList colorStateList2 = this.f23814f;
            int changingConfigurations2 = changingConfigurations | (colorStateList2 != null ? colorStateList2.getChangingConfigurations() : 0);
            ColorStateList colorStateList3 = this.C;
            return changingConfigurations2 | (colorStateList3 != null ? colorStateList3.getChangingConfigurations() : 0);
        }

        public final void h(float f10, int i10) {
            this.f23833y = f10;
            this.f23834z = i10;
        }

        public final void i(int i10) {
            this.f23809a = i10;
        }

        public final void j(int i10, ColorStateList colorStateList, float f10, float f11) {
            this.f23818j = i10;
            this.f23815g = colorStateList;
            this.f23819k = f10;
            this.f23820l = f11;
            f();
        }

        public final void k(ColorStateList colorStateList) {
            this.f23816h = null;
            this.f23814f = colorStateList;
            f();
        }

        public final void l(BlendMode blendMode) {
            this.D = blendMode;
        }

        public final void m(boolean z10) {
            this.f23830v = z10;
        }

        public final void n(int[] iArr) {
            ColorStateList[] colorStateListArr;
            if (iArr != null) {
                colorStateListArr = this.f23816h;
                if (colorStateListArr == null || colorStateListArr.length != iArr.length) {
                    colorStateListArr = new ColorStateList[iArr.length];
                }
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(iArr[i10]);
                    kotlin.jvm.internal.t.e(colorStateListValueOf, "valueOf(it)");
                    colorStateListArr[i10] = colorStateListValueOf;
                }
            } else {
                colorStateListArr = null;
            }
            this.f23816h = colorStateListArr;
            this.f23814f = null;
            f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new m(this, (kotlin.jvm.internal.k) null);
        }

        public final BlendMode o() {
            return this.D;
        }

        public final void p(int i10) {
            this.f23811c = i10;
        }

        public final void q(ColorStateList colorStateList) {
            this.C = colorStateList;
        }

        public final float r() {
            return this.f23831w;
        }

        public final float s() {
            return this.f23832x;
        }

        public final int t() {
            return this.f23809a;
        }

        public final int[] u() {
            ColorStateList[] colorStateListArr = this.f23816h;
            if (colorStateListArr != null) {
                return o.b(colorStateListArr, a.f23835d);
            }
            return null;
        }

        public final boolean v() {
            return this.f23830v;
        }

        public final ColorStateList[] w() {
            return this.f23816h;
        }

        public final float x() {
            return this.f23833y;
        }

        public final int y() {
            return this.f23834z;
        }

        public final int z() {
            return this.f23811c;
        }

        public b(b originalGradientState) {
            kotlin.jvm.internal.t.f(originalGradientState, "originalGradientState");
            this.f23818j = -1;
            this.f23824p = -1;
            this.f23825q = -1;
            this.f23826r = 3.0f;
            this.f23827s = 9.0f;
            this.f23828t = -1;
            this.f23829u = -1;
            this.f23831w = 0.5f;
            this.f23832x = 0.5f;
            this.f23833y = 0.5f;
            this.D = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f23809a = originalGradientState.f23809a;
            this.f23810b = originalGradientState.f23810b;
            this.f23811c = originalGradientState.f23811c;
            this.f23812d = originalGradientState.f23812d;
            this.f23813e = originalGradientState.f23813e;
            this.f23814f = originalGradientState.f23814f;
            this.f23815g = originalGradientState.f23815g;
            ColorStateList[] colorStateListArr = originalGradientState.f23816h;
            if (colorStateListArr != null) {
                this.f23816h = (ColorStateList[]) colorStateListArr.clone();
            }
            float[] fArr = originalGradientState.f23817i;
            if (fArr != null) {
                this.f23817i = (float[]) fArr.clone();
            }
            this.f23818j = originalGradientState.f23818j;
            this.f23819k = originalGradientState.f23819k;
            this.f23820l = originalGradientState.f23820l;
            this.f23821m = originalGradientState.f23821m;
            float[] fArr2 = originalGradientState.f23822n;
            if (fArr2 != null) {
                this.f23822n = (float[]) fArr2.clone();
            }
            Rect rect = originalGradientState.f23823o;
            if (rect != null) {
                this.f23823o = new Rect(rect);
            }
            this.f23824p = originalGradientState.f23824p;
            this.f23825q = originalGradientState.f23825q;
            this.f23826r = originalGradientState.f23826r;
            this.f23827s = originalGradientState.f23827s;
            this.f23828t = originalGradientState.f23828t;
            this.f23829u = originalGradientState.f23829u;
            this.f23830v = originalGradientState.f23830v;
            this.f23831w = originalGradientState.f23831w;
            this.f23832x = originalGradientState.f23832x;
            this.f23833y = originalGradientState.f23833y;
            this.f23834z = originalGradientState.f23834z;
            this.A = originalGradientState.A;
            this.B = originalGradientState.B;
            this.C = originalGradientState.C;
            this.D = originalGradientState.D;
        }
    }
}
