package g7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ProgressBar implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f15413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Paint f15414b;

    public c(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f15414b = paint;
        paint.setColor(0);
        a(context);
    }

    void a(Context context) {
        float f10 = getResources().getDisplayMetrics().density;
        int iH = y.h(context, 8.0f);
        setPadding(iH, iH, iH, iH);
        d dVar = new d(context);
        this.f15413a = dVar;
        dVar.q(f10 * 4.0f);
        this.f15413a.o(-65536);
        this.f15413a.p(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f15413a);
        setIndeterminate(true);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.f15414b);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f15413a.n((Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - this.f15413a.m());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f15413a.o(iArr);
    }

    public void setProgressBackgroundColor(int i10) {
        this.f15414b.setColor(i10);
    }

    @Override // g7.m
    public void setStyle(n nVar) {
        this.f15413a.q(nVar.I(getContext()).floatValue());
        this.f15413a.o(nVar.H().intValue());
        this.f15414b.setColor(nVar.k().intValue());
        postInvalidate();
    }
}
