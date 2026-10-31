package m7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import g7.m;
import g7.n;
import g7.y;

/* JADX INFO: loaded from: classes4.dex */
public class d extends View implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f22198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f22199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f22200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22202e;

    public d(Context context) {
        super(context);
        this.f22198a = new Paint(1);
        this.f22199b = 0.0f;
        this.f22200c = 15.0f;
        this.f22201d = g7.a.f15389a;
        this.f22202e = 0;
        a();
    }

    private void a() {
        this.f22200c = y.h(getContext(), 4.0f);
    }

    public void b(float f10) {
        this.f22199b = f10;
        postInvalidate();
    }

    public int getLineColor() {
        return this.f22201d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f22198a.setStrokeWidth(this.f22200c);
        this.f22198a.setColor(this.f22202e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f22198a);
        this.f22198a.setColor(this.f22201d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f22199b) / 100.0f), measuredHeight, this.f22198a);
    }

    @Override // g7.m
    public void setStyle(n nVar) {
        this.f22201d = nVar.H().intValue();
        this.f22202e = nVar.k().intValue();
        this.f22200c = nVar.I(getContext()).floatValue();
        setAlpha(nVar.B().floatValue());
        postInvalidate();
    }
}
