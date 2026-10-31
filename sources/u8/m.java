package u8;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: TouchTracker.java */
/* JADX INFO: loaded from: classes4.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f26629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f26630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GestureDetector f26631e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f26627a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f26628b = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile float f26632f = 3.1415927f;

    /* JADX INFO: compiled from: TouchTracker.java */
    public interface a {
        void b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public m(Context context, a aVar, float f10) {
        this.f26629c = aVar;
        this.f26630d = f10;
        this.f26631e = new GestureDetector(context, this);
    }

    @Override // u8.d.a
    public void a(float[] fArr, float f10) {
        this.f26632f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f26627a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f26627a.x) / this.f26630d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f26627a;
        float f12 = (y10 - pointF.y) / this.f26630d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f26632f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f26628b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f26629c.b(this.f26628b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f26629c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f26631e.onTouchEvent(motionEvent);
    }
}
