package g7;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public class d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f15415g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f15416h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f15417i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f15418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C0233d f15419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f15420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f15421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f15422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15423f;

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float[] f15424a = {0.0f, 1.0E-4f, 2.0E-4f, 5.0E-4f, 9.0E-4f, 0.0014f, 0.002f, 0.0027f, 0.0036f, 0.0046f, 0.0058f, 0.0071f, 0.0085f, 0.0101f, 0.0118f, 0.0137f, 0.0158f, 0.018f, 0.0205f, 0.0231f, 0.0259f, 0.0289f, 0.0321f, 0.0355f, 0.0391f, 0.043f, 0.0471f, 0.0514f, 0.056f, 0.0608f, 0.066f, 0.0714f, 0.0771f, 0.083f, 0.0893f, 0.0959f, 0.1029f, 0.1101f, 0.1177f, 0.1257f, 0.1339f, 0.1426f, 0.1516f, 0.161f, 0.1707f, 0.1808f, 0.1913f, 0.2021f, 0.2133f, 0.2248f, 0.2366f, 0.2487f, 0.2611f, 0.2738f, 0.2867f, 0.2998f, 0.3131f, 0.3265f, 0.34f, 0.3536f, 0.3673f, 0.381f, 0.3946f, 0.4082f, 0.4217f, 0.4352f, 0.4485f, 0.4616f, 0.4746f, 0.4874f, 0.5f, 0.5124f, 0.5246f, 0.5365f, 0.5482f, 0.5597f, 0.571f, 0.582f, 0.5928f, 0.6033f, 0.6136f, 0.6237f, 0.6335f, 0.6431f, 0.6525f, 0.6616f, 0.6706f, 0.6793f, 0.6878f, 0.6961f, 0.7043f, 0.7122f, 0.7199f, 0.7275f, 0.7349f, 0.7421f, 0.7491f, 0.7559f, 0.7626f, 0.7692f, 0.7756f, 0.7818f, 0.7879f, 0.7938f, 0.7996f, 0.8053f, 0.8108f, 0.8162f, 0.8215f, 0.8266f, 0.8317f, 0.8366f, 0.8414f, 0.8461f, 0.8507f, 0.8551f, 0.8595f, 0.8638f, 0.8679f, 0.872f, 0.876f, 0.8798f, 0.8836f, 0.8873f, 0.8909f, 0.8945f, 0.8979f, 0.9013f, 0.9046f, 0.9078f, 0.9109f, 0.9139f, 0.9169f, 0.9198f, 0.9227f, 0.9254f, 0.9281f, 0.9307f, 0.9333f, 0.9358f, 0.9382f, 0.9406f, 0.9429f, 0.9452f, 0.9474f, 0.9495f, 0.9516f, 0.9536f, 0.9556f, 0.9575f, 0.9594f, 0.9612f, 0.9629f, 0.9646f, 0.9663f, 0.9679f, 0.9695f, 0.971f, 0.9725f, 0.9739f, 0.9753f, 0.9766f, 0.9779f, 0.9791f, 0.9803f, 0.9815f, 0.9826f, 0.9837f, 0.9848f, 0.9858f, 0.9867f, 0.9877f, 0.9885f, 0.9894f, 0.9902f, 0.991f, 0.9917f, 0.9924f, 0.9931f, 0.9937f, 0.9944f, 0.9949f, 0.9955f, 0.996f, 0.9964f, 0.9969f, 0.9973f, 0.9977f, 0.998f, 0.9984f, 0.9986f, 0.9989f, 0.9991f, 0.9993f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f15425b = 1.0f / 200;

        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f15424a;
            int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
            float f11 = this.f15425b;
            float f12 = (f10 - (iMin * f11)) / f11;
            float[] fArr2 = this.f15424a;
            float f13 = fArr2[iMin];
            return f13 + (f12 * (fArr2[iMin + 1] - f13));
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0233d f15426a;

        b(C0233d c0233d) {
            this.f15426a = c0233d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.k(fFloatValue, this.f15426a);
            d.this.g(fFloatValue, this.f15426a, false);
            d.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: g7.d$d, reason: collision with other inner class name */
    static class C0233d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f15431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f15432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f15433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Paint f15434e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int[] f15439j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f15440k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f15441l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f15442m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f15443n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f15444o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f15446q;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f15435f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f15436g = 0.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f15437h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f15438i = 5.0f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f15445p = 255;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f15430a = new RectF();

        C0233d() {
            Paint paint = new Paint();
            this.f15431b = paint;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f15432c = paint2;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f15433d = paint3;
            paint3.setColor(0);
            Paint paint4 = new Paint();
            this.f15434e = paint4;
            paint4.setColor(0);
        }

        int a() {
            return this.f15445p;
        }

        void b(float f10) {
            this.f15444o = f10;
        }

        void c(int i10) {
            this.f15445p = i10;
        }

        void d(Canvas canvas, Rect rect) {
            RectF rectF = this.f15430a;
            float f10 = this.f15444o;
            float fMin = (this.f15438i / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - (this.f15438i / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f15435f;
            float f12 = this.f15437h;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f15436g + f12) * 360.0f) - f13;
            this.f15431b.setColor(this.f15446q);
            this.f15431b.setAlpha(this.f15445p);
            float f15 = this.f15438i / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f15433d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f15431b);
        }

        void e(ColorFilter colorFilter) {
            this.f15431b.setColorFilter(colorFilter);
        }

        void f(Paint.Cap cap) {
            this.f15431b.setStrokeCap(cap);
        }

        void g(int[] iArr) {
            this.f15439j = iArr;
            n(0);
        }

        void h(float f10) {
            this.f15436g = f10;
        }

        float i() {
            return this.f15436g;
        }

        void j(float f10) {
            this.f15437h = f10;
        }

        void k(int i10) {
            this.f15446q = i10;
        }

        int l() {
            return this.f15439j[o()];
        }

        void m(float f10) {
            this.f15435f = f10;
        }

        void n(int i10) {
            this.f15440k = i10;
            this.f15446q = this.f15439j[i10];
        }

        int o() {
            return (this.f15440k + 1) % this.f15439j.length;
        }

        void p(float f10) {
            this.f15438i = f10;
            this.f15431b.setStrokeWidth(f10);
        }

        float q() {
            return this.f15435f;
        }

        int r() {
            return this.f15439j[this.f15440k];
        }

        float s() {
            return this.f15442m;
        }

        float t() {
            return this.f15443n;
        }

        float u() {
            return this.f15441l;
        }

        void v() {
            n(o());
        }

        void w() {
            this.f15441l = 0.0f;
            this.f15442m = 0.0f;
            this.f15443n = 0.0f;
            m(0.0f);
            h(0.0f);
            j(0.0f);
        }

        void x() {
            this.f15441l = this.f15435f;
            this.f15442m = this.f15436g;
            this.f15443n = this.f15437h;
        }
    }

    public d(Context context) {
        this.f15418a = context.getResources();
        C0233d c0233d = new C0233d();
        this.f15419b = c0233d;
        c0233d.g(f15417i);
        q(2.5f);
        d();
    }

    private int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    private void d() {
        C0233d c0233d = this.f15419b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(c0233d));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f15415g);
        valueAnimatorOfFloat.addListener(new c(c0233d));
        this.f15421d = valueAnimatorOfFloat;
    }

    private void e(float f10) {
        this.f15420c = f10;
    }

    private void f(float f10, C0233d c0233d) {
        k(f10, c0233d);
        float fFloor = (float) (Math.floor(c0233d.t() / 0.8f) + 1.0d);
        c0233d.m(c0233d.u() + (((c0233d.s() - 0.01f) - c0233d.u()) * f10));
        c0233d.h(c0233d.s());
        c0233d.j(c0233d.t() + ((fFloor - c0233d.t()) * f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(float f10, C0233d c0233d, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f15423f) {
            f(f10, c0233d);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fT = c0233d.t();
            if (f10 < 0.5f) {
                interpolation = c0233d.u();
                interpolation2 = (f15416h.getInterpolation(f10 / 0.5f) * 0.79f) + interpolation + 0.01f;
            } else {
                float fU = c0233d.u() + 0.79f;
                interpolation = fU - (((1.0f - f15416h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fU;
            }
            float f11 = fT + (0.20999998f * f10);
            float f12 = (f10 + this.f15422e) * 216.0f;
            c0233d.m(interpolation);
            c0233d.h(interpolation2);
            c0233d.j(f11);
            e(f12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(float f10, C0233d c0233d) {
        if (f10 > 0.75f) {
            c0233d.k(c((f10 - 0.75f) / 0.25f, c0233d.r(), c0233d.l()));
        } else {
            c0233d.k(c0233d.r());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f15420c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f15419b.d(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15419b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f15421d.isRunning();
    }

    public float m() {
        return this.f15419b.f15438i;
    }

    public void n(float f10) {
        this.f15419b.b(f10);
        invalidateSelf();
    }

    public void o(int... iArr) {
        this.f15419b.g(iArr);
        this.f15419b.n(0);
        invalidateSelf();
    }

    public void p(Paint.Cap cap) {
        this.f15419b.f(cap);
        invalidateSelf();
    }

    public void q(float f10) {
        this.f15419b.p(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f15419b.c(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15419b.e(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f15421d.cancel();
        this.f15419b.x();
        if (this.f15419b.i() != this.f15419b.q()) {
            this.f15423f = true;
            this.f15421d.setDuration(666L);
            this.f15421d.start();
        } else {
            this.f15419b.n(0);
            this.f15419b.w();
            this.f15421d.setDuration(1332L);
            this.f15421d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f15421d.cancel();
        e(0.0f);
        this.f15419b.n(0);
        this.f15419b.w();
        invalidateSelf();
    }

    class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0233d f15428a;

        c(C0233d c0233d) {
            this.f15428a = c0233d;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            d.this.g(1.0f, this.f15428a, true);
            this.f15428a.x();
            this.f15428a.v();
            if (!d.this.f15423f) {
                d.this.f15422e += 1.0f;
            } else {
                d.this.f15423f = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f15422e = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
