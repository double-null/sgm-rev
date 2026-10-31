package mb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import pa.s;
import pb.g0;
import wb.d0;

/* JADX INFO: loaded from: classes5.dex */
public class b extends View implements pa.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Paint f22207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Paint f22208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Paint f22209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f22210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f22211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f22212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f22213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f22214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f22215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f22216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f22217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f22218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f22219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22220n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte f22221o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22222p;

    /* JADX INFO: renamed from: mb.b$b, reason: collision with other inner class name */
    private class C0364b implements s {
        private C0364b() {
        }

        @Override // wb.v
        public void p() {
            boolean z10 = !b.this.k() || b.this.isShown();
            if (z10) {
                b.this.f22212f.k();
            } else {
                b.this.f22212f.j();
            }
            long jC = b.this.f22212f.c();
            long jD = b.this.f22212f.d();
            if (z10) {
                b.this.e((jD * 100.0f) / jC, (int) Math.ceil((jC - jD) / 1000.0d));
            }
            if (b.this.f22212f.f()) {
                b.this.l();
            } else {
                qb.h.e(this, 16L);
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22224a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f22225b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f22226c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f22227d = 0;

        c() {
        }

        long a() {
            return SystemClock.elapsedRealtime();
        }

        public void b(long j10) {
            this.f22225b = j10;
            h();
        }

        public long c() {
            return this.f22225b;
        }

        public long d() {
            return this.f22226c;
        }

        public boolean e() {
            return this.f22224a;
        }

        public boolean f() {
            return this.f22226c >= this.f22225b;
        }

        public void g() {
            this.f22224a = false;
        }

        public void h() {
            this.f22226c = 0L;
            this.f22227d = a();
        }

        public void i() {
            this.f22224a = true;
            this.f22227d = a();
        }

        public void j() {
            this.f22227d = a();
        }

        public void k() {
            if (e()) {
                long jA = a();
                this.f22226c = Math.min(this.f22225b, this.f22226c + (jA - this.f22227d));
                this.f22227d = jA;
            }
        }
    }

    public interface d {
        void a();
    }

    public b(Context context) {
        super(context);
        this.f22210d = new RectF();
        this.f22211e = new RectF();
        this.f22212f = new c();
        this.f22213g = new AtomicBoolean(false);
        this.f22219m = 100.0f;
        this.f22221o = (byte) -1;
        this.f22222p = false;
        Paint paint = new Paint(1);
        this.f22207a = paint;
        paint.setColor(pa.i.f23790d);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f22208b = paint2;
        int i10 = pa.i.f23789c;
        paint2.setColor(i10);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.f22209c = paint3;
        paint3.setColor(i10);
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        f(context);
    }

    private void f(Context context) {
        setLayerType(1, null);
        this.f22216j = d0.h(context, 54.0f);
        this.f22217k = d0.h(context, 54.0f);
        float fH = d0.h(context, 3.0f);
        this.f22218l = fH;
        this.f22208b.setStrokeWidth(fH);
        d();
    }

    private void g(Canvas canvas) {
        float f10 = this.f22221o * (360.0f - ((this.f22219m * 360.0f) * 0.01f));
        canvas.drawArc(this.f22210d, 0.0f, 360.0f, false, this.f22207a);
        canvas.drawArc(this.f22211e, 270.0f, f10, false, this.f22208b);
    }

    private void i(Canvas canvas) {
        canvas.drawText(String.valueOf(this.f22220n), this.f22216j, this.f22217k - ((this.f22209c.descent() + this.f22209c.ascent()) / 2.0f), this.f22209c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        d dVar;
        if (this.f22213g.compareAndSet(false, true) && (dVar = this.f22214h) != null) {
            dVar.a();
        }
    }

    float a(RectF rectF, boolean z10) {
        float fWidth = rectF.width();
        if (z10) {
            fWidth -= this.f22218l * 2.0f;
        }
        return fWidth * 0.70710677f * 0.9f;
    }

    @Override // pa.f
    public void b(pb.j jVar) {
        g0 g0VarK = jVar.k();
        if (g0VarK != null) {
            this.f22209c.setTypeface(Typeface.create(Typeface.DEFAULT, g0VarK.c()));
        }
        Integer numI = jVar.i();
        if (numI != null) {
            this.f22207a.setColor(numI.intValue());
        }
        Integer numP = jVar.p(getContext());
        if (numP != null) {
            float fIntValue = numP.intValue();
            this.f22218l = fIntValue;
            this.f22208b.setStrokeWidth(fIntValue);
        }
        Integer numO = jVar.o();
        if (numO != null) {
            this.f22208b.setColor(numO.intValue());
        }
        d();
    }

    void d() {
        int iMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float width = (getWidth() - iMin) / 2.0f;
        float height = (getHeight() - iMin) / 2.0f;
        float f10 = iMin;
        this.f22210d.set(width, height, width + f10, f10 + height);
        this.f22216j = this.f22210d.centerX();
        this.f22217k = this.f22210d.centerY();
        float f11 = this.f22218l / 2.0f;
        RectF rectF = this.f22211e;
        RectF rectF2 = this.f22210d;
        rectF.set(rectF2.left + f11, rectF2.top + f11, rectF2.right - f11, rectF2.bottom - f11);
        this.f22209c.setTextSize(a(this.f22210d, true));
    }

    public void e(float f10, int i10) {
        if (f10 >= 0.0f || f10 <= 100.0f) {
            this.f22219m = f10;
        }
        this.f22220n = i10;
        postInvalidate();
    }

    public void h() {
        o();
        this.f22214h = null;
    }

    public boolean k() {
        return this.f22222p;
    }

    public void m() {
        o();
        if (this.f22213g.get()) {
            return;
        }
        this.f22212f.i();
        C0364b c0364b = new C0364b();
        this.f22215i = c0364b;
        qb.h.e(c0364b, 16L);
    }

    public void n() {
        this.f22213g.set(false);
        this.f22212f.h();
        m();
    }

    public void o() {
        this.f22212f.g();
        Runnable runnable = this.f22215i;
        if (runnable == null) {
            return;
        }
        qb.h.c(runnable);
        this.f22215i = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || this.f22220n == 0) {
            return;
        }
        g(canvas);
        i(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d();
    }

    public void setClockwise(boolean z10) {
        if (z10) {
            this.f22221o = (byte) -1;
        } else {
            this.f22221o = (byte) 1;
        }
    }

    public void setDuration(long j10) {
        this.f22212f.b(j10);
    }

    public void setListener(d dVar) {
        this.f22214h = dVar;
    }

    public void setOnlyVisibleWork(boolean z10) {
        this.f22222p = z10;
    }
}
