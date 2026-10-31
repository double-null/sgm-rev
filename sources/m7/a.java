package m7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import g7.m;
import g7.n;
import g7.y;

/* JADX INFO: loaded from: classes4.dex */
public class a extends View implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f22172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f22177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f22178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f22179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f22180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f22181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f22182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f22183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f22184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f22185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Rect f22186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RectF f22187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Paint f22188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f22189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f22190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f22191t;

    public a(Context context) {
        super(context);
        this.f22174c = g7.a.f15389a;
        this.f22175d = g7.a.f15391c;
        this.f22176e = false;
        this.f22177f = 0.0f;
        this.f22178g = 0.071428575f;
        this.f22179h = new RectF();
        this.f22180i = new RectF();
        this.f22181j = 54.0f;
        this.f22182k = 54.0f;
        this.f22183l = 5.0f;
        this.f22190s = 100.0f;
        c(context);
    }

    private float a(float f10, boolean z10) {
        float fWidth = this.f22179h.width();
        if (z10) {
            fWidth -= this.f22183l * 2.0f;
        }
        float fSqrt = (float) (((double) (fWidth / 2.0f)) * Math.sqrt(2.0d));
        return fSqrt - ((f10 * fSqrt) * 2.0f);
    }

    private void b() {
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f10 = fMin / 2.0f;
        float width = (getWidth() / 2.0f) - f10;
        float height = (getHeight() / 2.0f) - f10;
        this.f22179h.set(width, height, width + fMin, fMin + height);
        this.f22181j = this.f22179h.centerX();
        this.f22182k = this.f22179h.centerY();
        RectF rectF = this.f22180i;
        RectF rectF2 = this.f22179h;
        float f11 = rectF2.left;
        float f12 = this.f22183l / 2.0f;
        rectF.set(f11 + f12, rectF2.top + f12, rectF2.right - f12, rectF2.bottom - f12);
    }

    private void c(Context context) {
        setLayerType(1, null);
        this.f22183l = y.h(context, 3.0f);
    }

    private void d(Canvas canvas) {
        if (this.f22184m == null) {
            this.f22184m = new Paint(1);
        }
        float f10 = 360.0f - ((this.f22190s * 360.0f) * 0.01f);
        this.f22184m.setColor(this.f22175d);
        this.f22184m.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.f22179h, 0.0f, 360.0f, false, this.f22184m);
        this.f22184m.setColor(this.f22174c);
        this.f22184m.setStyle(Paint.Style.STROKE);
        this.f22184m.setStrokeWidth(this.f22183l);
        canvas.drawArc(this.f22180i, 270.0f, f10, false, this.f22184m);
    }

    private void e(Canvas canvas, Bitmap bitmap) {
        if (this.f22188q == null) {
            Paint paint = new Paint(7);
            this.f22188q = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f22188q.setAntiAlias(true);
        }
        if (this.f22186o == null) {
            this.f22186o = new Rect();
        }
        if (this.f22187p == null) {
            this.f22187p = new RectF();
        }
        float fA = a(this.f22177f, this.f22176e);
        float f10 = fA / 2.0f;
        float f11 = this.f22181j - f10;
        float f12 = this.f22182k - f10;
        this.f22186o.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f22187p.set(f11, f12, f11 + fA, fA + f12);
        this.f22188q.setColorFilter(new PorterDuffColorFilter(this.f22174c, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, this.f22186o, this.f22187p, this.f22188q);
        if (this.f22176e) {
            if (this.f22189r == null) {
                Paint paint2 = new Paint(1);
                this.f22189r = paint2;
                paint2.setStyle(Paint.Style.STROKE);
            }
            this.f22189r.setStrokeWidth(this.f22183l);
            this.f22189r.setColor(this.f22174c);
            canvas.drawArc(this.f22180i, 0.0f, 360.0f, false, this.f22189r);
        }
    }

    private void f(Canvas canvas) {
        if (this.f22185n == null) {
            Paint paint = new Paint(1);
            this.f22185n = paint;
            paint.setAntiAlias(true);
            this.f22185n.setStyle(Paint.Style.FILL);
            this.f22185n.setTextAlign(Paint.Align.CENTER);
        }
        String strValueOf = String.valueOf(this.f22191t);
        this.f22185n.setColor(this.f22174c);
        this.f22185n.setTypeface(Typeface.create(Typeface.DEFAULT, this.f22173b));
        this.f22185n.setTextSize(a(this.f22178g, true));
        canvas.drawText(strValueOf, this.f22181j, this.f22182k - ((this.f22185n.descent() + this.f22185n.ascent()) / 2.0f), this.f22185n);
    }

    public void g(float f10, int i10) {
        if (this.f22172a == null || f10 == 100.0f) {
            this.f22190s = f10;
            this.f22191t = i10;
            postInvalidate();
        }
    }

    public int getAccentColor() {
        return this.f22174c;
    }

    public int getBackgroundColor() {
        return this.f22175d;
    }

    public void h(int i10, int i11) {
        this.f22174c = i10;
        this.f22175d = i11;
        b();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f22191t == 0 && this.f22172a == null) {
            return;
        }
        d(canvas);
        Bitmap bitmap = this.f22172a;
        if (bitmap != null) {
            e(canvas, bitmap);
        } else {
            f(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    public void setImage(Bitmap bitmap) {
        this.f22172a = bitmap;
        if (bitmap != null) {
            this.f22190s = 100.0f;
        }
        postInvalidate();
    }

    @Override // g7.m
    public void setStyle(n nVar) {
        this.f22173b = nVar.o().intValue();
        this.f22174c = nVar.H().intValue();
        this.f22175d = nVar.k().intValue();
        this.f22176e = nVar.d0().booleanValue();
        this.f22183l = nVar.I(getContext()).floatValue();
        setPadding(nVar.D(getContext()).intValue(), nVar.G(getContext()).intValue(), nVar.F(getContext()).intValue(), nVar.C(getContext()).intValue());
        setAlpha(nVar.B().floatValue());
        b();
        postInvalidate();
    }
}
