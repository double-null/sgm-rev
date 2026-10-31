package m7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import g7.m;
import g7.n;

/* JADX INFO: loaded from: classes4.dex */
public class b extends TextView implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f22192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GradientDrawable f22193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f22194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22195d;

    public b(Context context) {
        super(context);
        this.f22192a = new RectF();
        this.f22195d = false;
        a(context);
    }

    protected void a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f22193b = gradientDrawable;
        gradientDrawable.setColor(g7.a.f15391c);
        this.f22193b.setShape(0);
        setBackgroundDrawable(this.f22193b);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f22195d || this.f22194c == null) {
            return;
        }
        float height = getHeight() / 2.0f;
        canvas.drawRoundRect(this.f22192a, height, height, this.f22194c);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i11) - getCompoundPaddingTop()) - getCompoundPaddingRight();
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float fMeasureText = getPaint().measureText(getText(), 0, getText().length());
            float f10 = size2;
            if (f10 < fMeasureText) {
                float textSize = (int) (getTextSize() * (f10 / fMeasureText));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        Paint paint;
        super.onSizeChanged(i10, i11, i12, i13);
        GradientDrawable gradientDrawable = this.f22193b;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i11 / 2.0f);
        }
        if (!this.f22195d || (paint = this.f22194c) == null) {
            return;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f10 = 0.0f + strokeWidth;
        this.f22192a.set(f10, f10, i10 - strokeWidth, i11 - strokeWidth);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = this.f22193b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
    }

    @Override // g7.m
    public void setStyle(n nVar) {
        boolean zBooleanValue = nVar.d0().booleanValue();
        this.f22195d = zBooleanValue;
        if (zBooleanValue) {
            Paint paint = new Paint(1);
            this.f22194c = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f22194c.setColor(nVar.H().intValue());
            this.f22194c.setStrokeWidth(nVar.I(getContext()).floatValue());
        }
        setTextColor(nVar.H().intValue());
        setBackgroundColor(nVar.k().intValue());
        setTextSize(0, nVar.n(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, nVar.o().intValue()));
        setAlpha(nVar.B().floatValue());
        setPadding(nVar.D(getContext()).intValue(), nVar.G(getContext()).intValue(), nVar.F(getContext()).intValue(), nVar.C(getContext()).intValue());
    }
}
