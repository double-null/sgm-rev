package io.bidmachine.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import x7.l0;

/* JADX INFO: compiled from: DefaultTimeBar.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends View implements h0 {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f20097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f20098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f20099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f20100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f20101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f20102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f20103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f20104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f20105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f20106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f20107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f20108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f20109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f20110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f20111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f20112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f20113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f20114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f20115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f20116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final StringBuilder f20117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Formatter f20118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f20119w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet<h0.a> f20120x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Point f20121y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f20122z;

    public b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f20097a = new Rect();
        this.f20098b = new Rect();
        this.f20099c = new Rect();
        this.f20100d = new Rect();
        Paint paint = new Paint();
        this.f20101e = paint;
        Paint paint2 = new Paint();
        this.f20102f = paint2;
        Paint paint3 = new Paint();
        this.f20103g = paint3;
        Paint paint4 = new Paint();
        this.f20104h = paint4;
        Paint paint5 = new Paint();
        this.f20105i = paint5;
        Paint paint6 = new Paint();
        this.f20106j = paint6;
        paint6.setAntiAlias(true);
        this.f20120x = new CopyOnWriteArraySet<>();
        this.f20121y = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f20122z = f10;
        this.f20116t = e(f10, -50);
        int iE = e(f10, 4);
        int iE2 = e(f10, 26);
        int iE3 = e(f10, 4);
        int iE4 = e(f10, 12);
        int iE5 = e(f10, 0);
        int iE6 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, fa.x.f14873e, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(fa.x.f14895p);
                this.f20107k = drawable;
                if (drawable != null) {
                    q(drawable);
                    iE2 = Math.max(drawable.getMinimumHeight(), iE2);
                }
                this.f20108l = typedArrayObtainStyledAttributes.getDimensionPixelSize(fa.x.f14881i, iE);
                this.f20109m = typedArrayObtainStyledAttributes.getDimensionPixelSize(fa.x.f14899r, iE2);
                this.f20110n = typedArrayObtainStyledAttributes.getInt(fa.x.f14879h, 0);
                this.f20111o = typedArrayObtainStyledAttributes.getDimensionPixelSize(fa.x.f14877g, iE3);
                this.f20112p = typedArrayObtainStyledAttributes.getDimensionPixelSize(fa.x.f14897q, iE4);
                this.f20113q = typedArrayObtainStyledAttributes.getDimensionPixelSize(fa.x.f14891n, iE5);
                this.f20114r = typedArrayObtainStyledAttributes.getDimensionPixelSize(fa.x.f14893o, iE6);
                int i12 = typedArrayObtainStyledAttributes.getInt(fa.x.f14887l, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(fa.x.f14889m, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(fa.x.f14883j, -855638017);
                int i15 = typedArrayObtainStyledAttributes.getInt(fa.x.f14901s, 872415231);
                int i16 = typedArrayObtainStyledAttributes.getInt(fa.x.f14875f, -1291845888);
                int i17 = typedArrayObtainStyledAttributes.getInt(fa.x.f14885k, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f20108l = iE;
            this.f20109m = iE2;
            this.f20110n = 0;
            this.f20111o = iE3;
            this.f20112p = iE4;
            this.f20113q = iE5;
            this.f20114r = iE6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f20107k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f20117u = sb2;
        this.f20118v = new Formatter(sb2, Locale.getDefault());
        this.f20119w = new Runnable() { // from class: fa.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f14766a.k();
            }
        };
        Drawable drawable2 = this.f20107k;
        if (drawable2 != null) {
            this.f20115s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f20115s = (Math.max(this.f20113q, Math.max(this.f20112p, this.f20114r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fa.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f14767a.l(valueAnimator2);
            }
        });
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int e(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private void f(Canvas canvas) {
        int i10;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.f20100d;
        int iP = l0.p(rect.right, rect.left, this.f20098b.right);
        int iCenterY = this.f20100d.centerY();
        Drawable drawable = this.f20107k;
        if (drawable == null) {
            if (this.H || isFocused()) {
                i10 = this.f20114r;
            } else {
                i10 = isEnabled() ? this.f20112p : this.f20113q;
            }
            canvas.drawCircle(iP, iCenterY, (int) ((i10 * this.F) / 2.0f), this.f20106j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.f20107k.getIntrinsicHeight() * this.F)) / 2;
        this.f20107k.setBounds(iP - intrinsicWidth, iCenterY - intrinsicHeight, iP + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f20107k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int iHeight = this.f20098b.height();
        int iCenterY = this.f20098b.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.J <= 0) {
            Rect rect = this.f20098b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f20103g);
            return;
        }
        Rect rect2 = this.f20099c;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f20098b.left, i12), this.f20100d.right);
        int i13 = this.f20098b.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f20103g);
        }
        int iMax2 = Math.max(i11, this.f20100d.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f20102f);
        }
        if (this.f20100d.width() > 0) {
            Rect rect3 = this.f20100d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f20101e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) x7.a.e(this.N);
        boolean[] zArr = (boolean[]) x7.a.e(this.O);
        int i14 = this.f20111o / 2;
        for (int i15 = 0; i15 < this.M; i15++) {
            int iWidth = ((int) ((((long) this.f20098b.width()) * l0.q(jArr[i15], 0L, this.J)) / this.J)) - i14;
            Rect rect4 = this.f20098b;
            int iMin = rect4.left + Math.min(rect4.width() - this.f20111o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f20111o, i10, zArr[i15] ? this.f20105i : this.f20104h);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.B;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.J;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / ((long) this.A);
    }

    private String getProgressText() {
        return l0.o0(this.f20117u, this.f20118v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f20098b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f20100d.width()) * this.J) / ((long) this.f20098b.width());
    }

    private boolean j(float f10, float f11) {
        return this.f20097a.contains((int) f10, (int) f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f20097a);
    }

    private void m(float f10) {
        Rect rect = this.f20100d;
        Rect rect2 = this.f20098b;
        rect.right = l0.p((int) f10, rect2.left, rect2.right);
    }

    private static int n(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private Point o(MotionEvent motionEvent) {
        this.f20121y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f20121y;
    }

    private boolean p(long j10) {
        long j11 = this.J;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.H ? this.I : this.K;
        long jQ = l0.q(j12 + j10, 0L, j11);
        if (jQ == j12) {
            return false;
        }
        if (this.H) {
            z(jQ);
        } else {
            v(jQ);
        }
        x();
        return true;
    }

    private boolean q(Drawable drawable) {
        return l0.f28136a >= 23 && r(drawable, getLayoutDirection());
    }

    private static boolean r(Drawable drawable, int i10) {
        return l0.f28136a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void s(int i10, int i11) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i10 && this.D.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void v(long j10) {
        this.I = j10;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<h0.a> it = this.f20120x.iterator();
        while (it.hasNext()) {
            it.next().K(this, j10);
        }
    }

    private void w(boolean z10) {
        removeCallbacks(this.f20119w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<h0.a> it = this.f20120x.iterator();
        while (it.hasNext()) {
            it.next().R(this, this.I, z10);
        }
    }

    private void x() {
        this.f20099c.set(this.f20098b);
        this.f20100d.set(this.f20098b);
        long j10 = this.H ? this.I : this.K;
        if (this.J > 0) {
            int iWidth = (int) ((((long) this.f20098b.width()) * this.L) / this.J);
            Rect rect = this.f20099c;
            Rect rect2 = this.f20098b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f20098b.width()) * j10) / this.J);
            Rect rect3 = this.f20100d;
            Rect rect4 = this.f20098b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f20099c;
            int i10 = this.f20098b.left;
            rect5.right = i10;
            this.f20100d.right = i10;
        }
        invalidate(this.f20097a);
    }

    private void y() {
        Drawable drawable = this.f20107k;
        if (drawable != null && drawable.isStateful() && this.f20107k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void z(long j10) {
        if (this.I == j10) {
            return;
        }
        this.I = j10;
        Iterator<h0.a> it = this.f20120x.iterator();
        while (it.hasNext()) {
            it.next().J(this, j10);
        }
    }

    @Override // io.bidmachine.media3.ui.h0
    public void a(h0.a aVar) {
        x7.a.e(aVar);
        this.f20120x.add(aVar);
    }

    @Override // io.bidmachine.media3.ui.h0
    public void b(long[] jArr, boolean[] zArr, int i10) {
        x7.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.M = i10;
        this.N = jArr;
        this.O = zArr;
        x();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        y();
    }

    @Override // io.bidmachine.media3.ui.h0
    public long getPreferredUpdateDelay() {
        int iN = n(this.f20122z, this.f20098b.width());
        if (iN != 0) {
            long j10 = this.J;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / ((long) iN);
            }
        }
        return Long.MAX_VALUE;
    }

    public void h(long j10) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.E.setFloatValues(this.F, 0.0f);
        this.E.setDuration(j10);
        this.E.start();
    }

    public void i(boolean z10) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = z10;
        this.F = 0.0f;
        invalidate(this.f20097a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f20107k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.H || z10) {
            return;
        }
        w(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (p(positionIncrement)) {
                            removeCallbacks(this.f20119w);
                            postDelayed(this.f20119w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (p(positionIncrement)) {
                            removeCallbacks(this.f20119w);
                            postDelayed(this.f20119w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.H) {
                            w(false);
                            return true;
                        }
                        break;
                }
            } else if (this.H) {
                w(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.G ? 0 : this.f20115s;
        if (this.f20110n == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f20109m;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f20108l;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f20109m) / 2;
            iMax = (i15 - this.f20108l) / 2;
        }
        this.f20097a.set(paddingLeft, paddingBottom, paddingRight, this.f20109m + paddingBottom);
        Rect rect = this.f20098b;
        Rect rect2 = this.f20097a;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f20108l + iMax);
        if (l0.f28136a >= 29) {
            s(i14, i15);
        }
        x();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f20109m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f20109m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        y();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f20107k;
        if (drawable == null || !r(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.J > 0) {
            Point pointO = o(motionEvent);
            int i10 = pointO.x;
            int i11 = pointO.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f10 = i10;
                if (j(f10, i11)) {
                    m(f10);
                    v(getScrubberPosition());
                    x();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.H) {
                    w(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.H) {
                        w(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.H) {
                if (i11 < this.f20116t) {
                    int i12 = this.C;
                    m(i12 + ((i10 - i12) / 3));
                } else {
                    this.C = i10;
                    m(i10);
                }
                z(getScrubberPosition());
                x();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (p(-getPositionIncrement())) {
                w(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (p(getPositionIncrement())) {
                w(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f20104h.setColor(i10);
        invalidate(this.f20097a);
    }

    public void setBufferedColor(int i10) {
        this.f20102f.setColor(i10);
        invalidate(this.f20097a);
    }

    @Override // io.bidmachine.media3.ui.h0
    public void setBufferedPosition(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        x();
    }

    @Override // io.bidmachine.media3.ui.h0
    public void setDuration(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        if (this.H && j10 == -9223372036854775807L) {
            w(true);
        }
        x();
    }

    @Override // android.view.View, io.bidmachine.media3.ui.h0
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.H || z10) {
            return;
        }
        w(true);
    }

    public void setKeyCountIncrement(int i10) {
        x7.a.a(i10 > 0);
        this.A = i10;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        x7.a.a(j10 > 0);
        this.A = -1;
        this.B = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f20105i.setColor(i10);
        invalidate(this.f20097a);
    }

    public void setPlayedColor(int i10) {
        this.f20101e.setColor(i10);
        invalidate(this.f20097a);
    }

    @Override // io.bidmachine.media3.ui.h0
    public void setPosition(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        setContentDescription(getProgressText());
        x();
    }

    public void setScrubberColor(int i10) {
        this.f20106j.setColor(i10);
        invalidate(this.f20097a);
    }

    public void setUnplayedColor(int i10) {
        this.f20103g.setColor(i10);
        invalidate(this.f20097a);
    }

    public void t() {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.F = 1.0f;
        invalidate(this.f20097a);
    }

    public void u(long j10) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.E.setFloatValues(this.F, 1.0f);
        this.E.setDuration(j10);
        this.E.start();
    }
}
