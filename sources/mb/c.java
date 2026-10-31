package mb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import kotlin.jvm.internal.t;
import pa.x;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends View implements pa.f, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f22228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f22229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        t.f(context, "context");
        this.f22228a = new Paint(1);
        this.f22230c = pa.i.f23789c;
    }

    @Override // pa.x
    public void a(long j10, long j11, float f10) {
        this.f22229b = f10;
        postInvalidate();
    }

    @Override // pa.f
    public void b(pb.j appearanceParams) {
        t.f(appearanceParams, "appearanceParams");
        Integer numI = appearanceParams.i();
        if (numI != null) {
            this.f22231d = numI.intValue();
        }
        Integer numO = appearanceParams.o();
        if (numO != null) {
            this.f22230c = numO.intValue();
        }
    }

    public final int getLineBackgroundColor() {
        return this.f22231d;
    }

    public final int getLineColor() {
        return this.f22230c;
    }

    public final Paint getLinePaint() {
        return this.f22228a;
    }

    public final float getPercent() {
        return this.f22229b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        t.f(canvas, "canvas");
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f22228a.setColor(this.f22231d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f22228a);
        this.f22228a.setColor(this.f22230c);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f22229b) / 100), measuredHeight, this.f22228a);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f22228a.setStrokeWidth(getMeasuredHeight());
    }

    public final void setLineBackgroundColor(int i10) {
        this.f22231d = i10;
    }

    public final void setLineColor(int i10) {
        this.f22230c = i10;
    }

    public final void setPercent(float f10) {
        this.f22229b = f10;
    }

    public static /* synthetic */ void getLineBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getLineColor$annotations() {
    }

    public static /* synthetic */ void getLinePaint$annotations() {
    }

    public static /* synthetic */ void getPercent$annotations() {
    }
}
