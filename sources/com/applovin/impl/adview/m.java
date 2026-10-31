package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class m extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f6086c = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Paint f6087d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f6088e = new Paint(1);

    public m(Context context) {
        super(context);
        f6086c.setColor(-1);
        f6087d.setColor(-16777216);
        Paint paint = f6088e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f6055a * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f6055a * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getStrokeWidth() {
        return this.f6055a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6086c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f6087d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f6088e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
